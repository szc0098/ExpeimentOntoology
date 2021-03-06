# Experiment-Ontology
A Domain-Specific Experiment Management Languageis developed towards defining families of simulation experiments, in accordance with theDOE methodology.A java application to document the experiment specification is available to the user. The user can run the experiment, view the results and review the data in graphical plots.

# Motivation

The Goal-Hypothesis-Experiment framework: A generative cognitive domain architecture for simulation experiment management.

# Download
Please refer to the Simulation Experiment Management project page to download the latest release:

```
https://github.com/szc0098/ExpeimentOntoology
```

# Dependencies:

- [XText](https://www.eclipse.org/Xtext/download.html)

# Development
The principles of model-driven software development are used throughout the development
process. We started by developing a metamodel for the language in the form of a UML
class model in order to facilitate understanding of the domain. We used this metamodel
as a roadmap to develop a Xtext grammar and evaluated its readability
in a reference model. The grammatical constructs defined in the Xtext grammar were
used to identify classes and structures for a reference implementation, where a use-case
for the application was developed and tested. Through development of the reference
implementation, we were able to identify sections of code that were candidates for text-
to-model transformation. These transformations bridge the gap between reference model,
reference implementation, and platform.
The process was an effective tool for streamlining the development of a DSL-driven
application. By focusing on the way the language will be used before the implementation,
we were able to create a highly expressive language while providing support for platform
versatility.

## Metamodel
The metamodel encompasses all the major components of the GHE framework. It includes the goal of the experiment, model definition, hypothesis and an experiment. 
![GHE Metamodel](https://github.com/szc0098/Simulation-Experiment-Management/blob/master/13.png)

# Domain Specific Language(DSL)
The DSL for simulation experiment model development is developed using the Xtext
DSL development environment on Eclipse Neon, by translating the experiment ontology
metamodel.

```ruby
ExperimentOntology :
	ModelSection |Goals | Hypothesis | Experiment
;
	
ModelSection:
	'model' (modName = ID) 
	'{'
	(mechanisms += Mechanism)*
	((events += EventDescriptor)?)*
	(parameters += Factor)*
	'}'
;	

Mechanism:
	'mechanism' (mechanismName = ID) ' = ' (LHS = Reaction) (condition = GuardCondition)? ' -> ' (RHS = Reaction)
;

```
# Reference Model
In order to test the validity of our framework and the practical utility of the approach,
we used our project to demonstrate the ISHC model. The DSL we developed is abstract
and free of any technical terms. The DSL covers all relevant concepts of the domain
with language elements. All schematically-implementable code fragments of the reference
implementation are covered by constructs of the DSL. The reference ISHC model is an
instance of the DSL. The DSL for simulation experiment model is developed by mapping
the experiment ontology metamodel.
- **Model:**
Model consists of a specification about the models name, the mechanisms, the events and
the factor parameters. Mechanisms consist of the processes which is assumed to take place
in the simulation system. Events define the path for tracing the functions that evaluate
the events that form a part of the evidences. Parameters are the inputs to the model
and their properties, which have an impact in determining the response/output of the
simulation run.
```ruby
model ISHC{
    mechanism M1 = inflammatoryAgent + Kupffercells 
                [inflammatoryAgent > inflammatorythreshold] -> Cytokines
    mechanism M2 = inflammatoryAgent + Kupffercells 
                [noOfCytokine > cytokineThreshold] -> Cytokines
    event inflammation = 'void ishc.model.KupfferCell.handleInflammation()'
    parameter LPS = Solute with properties {tag: LPS, bindable: true ,
                    bolusRatio:1.0 , pExitMedia: 0.1 , pExitCell: 1.0 , 
                     inflammatory : true , pDegrade : 0.0
                    }
     parameter drRate = DISCRETE with values {30}
    }
```
- **Goal:**
Goals define what the purpose of the experiment is. It also gives an idea about the specific
field of concern and the context under which the study is performed.
```ruby
    goal
    {
    object of study : 'Immune system influence on hepatic cytochrome P450
                        regulation'
    purpose : 'Explain / characterize'
    focus : 'the reason for changes in downstream drug metabolism and
                hepatotoxicity'
    view point : 'based on the response of hepatic cytochrome P450-
                regulating mechanisms'
    context : 'when health and/or therapeutic interventions change.'
    }
```
- **Hypotheses:**
Hypotheses consists of relational hypotheses, mechanistic hypotheses and expected regularities. Mechanistic hypotheses deal with the effect of changes in the mechanism of the
model. Relational hypotheses deal with the impact of changes in inputs or outputs. In
order to represent behavioral changes in the model, we focus on mechanistic hypotheses
for the study. Expected regularities are the temporal properties that are to be verified in
the experimental run. It is stated in terms of state of factors and their properties.
The coherence model describes the explanatory coherence relation between the hypothesis and the evidence. The evidence can have an activation weight
which indicates its reliability. This is used to establish the weightage of the link between
the evidence and hypothesis in the coherence network. 
```ruby
 hypotheses
    {
    mechanistic hypotheses
    {
        H1 : M1 occurs before M2
    }
    evidence
    {
        E1: inflammation occurs after inflammatoryAgent >
            inflammatoryAgentThreshold
        activation weight : 0.5
    }
    coherence model
     {
        EXPLAIN (H1)(E1)
        DATA (Experiment1)(E1 E2)
    }
    }
```
- **Experiment:**
The ontology for the experiment section encompasses the structural elements of an experiment which includes the experiments design and performance measure. Based on the models parameters and their levels, the hypotheses and goal of the experiment, a design
is created that is used in subsequent steps of the experiment life-cycle.
The experimental design is defined by the dependent variables, the control variables,
the independent variables and their levels, constraints and values which in turn are mappings of the variables provided by the user. Based on this design, one can define what
is known as a design matrix, which specifies the actual experimental runs, that is, the
combination of factor levels.
```ruby
   experiment Exp1{
        design {
            variables{
                independent variables
                    {
                    LPS are at levels : LOW where LOW is in the range 1.0 to
                                        1.0
                    }
                dependent variables
                    {
                    cytokines : type SIMPLE
                    }
                }
            }
```
- **Performance Measure:**
An experiment consists of performance measure parameters which defines the criteria for
successful experimental run. Basing on this measure we can decide whether additional
iterations are required for satisfying the experiments objective. It is defined in terms of
the expected value of the response or output of the experiment and its standard deviation.
```ruby
performance measure is
            {

                cytokines= 500 +-10
            }
```
In the above example, the expected value of the cytokines after successful experiment
execution is 500 with a standard deviation of 10.

# Code Generation

We used the Xtend code generation process for mapping the DSL to platform. A set of
templates were derived from the reference implementation and used for the transformation
step. 
```ruby
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('ishc.properties', toISHCProperties(resource.allContents
				.filter(typeof(ModelSection)).head))
		fsa.generateFile('delivery.properties', toDeliveryProperties(resource.allContents
				.filter(typeof(ModelSection)).head , resource.allContents.filter(typeof(Experiment)).head))
		fsa.generateFile("KupfferCell.java", toKupfferCell(resource.allContents
				.filter(typeof(ModelSection)).head))
		fsa.generateFile("Hepatocyte.java", toHepatocyte(resource.allContents
				.filter(typeof(ModelSection)).head))
	}
```
The experiment specifictaion is used for code generation by the template engine. The
experiment specification defined using the DSL and the generated artifacts were used to
run the ISHC simulation model in MASON to get the results.

# Execution:
- In order to test the new grammar and generator invoke **Run As|Eclipse Application**
from the context menu of the project. The Eclipse IDE will
launch a new runtime Eclipse IDE.
- Once its launched create a new **General | Project** in the Project Explorer. Within
that project create a file, e.g. Test001.mysl. You need to add the file extension **.mydsl**
otherwise your DSL editor wont open it automatically. You can enter the reference model
and save the file changes.
- Xtext parses automatically all testdsl files within that project. On saving that file
Xtext will trigger the generator. Youll notice a new folder appearing in your project:
**src-gen**. Thats where the generator puts its generated artifacts.

- In order to launch the java application, run the EMSApplication in runtime environment. 

- Run the MenuExp.java file to view the java application.

# Future Efforts
 - **Coherence/Model Discovery:**
There is a great synergy to be taken advantage of between mechanistic hypotheses
and temporal properties. We can take observations made from in vitro or in vivo labs
as evidences to our simulation model in the form of temporal specifications. We can
use these evidences in a coherence model with mechanism changes in the program,
specified by a mechanistic hypothesis to see if an evidence is invalidated with the
mechanism change or supports one or more evidence. One use of this coherence
model is to develop an intelligent agent that can take knowledge gleaned from the
model and develop new mechanism changes that support the most evidences, in
an effort to develop autonomous computing. Alternatively, or in the short term,
this coherence model will be useful for model discovery for a simulationist. If,
for example, a simulationist introduces a new evidence to the system which is not
supported by the current mechanisms, connections in the coherence model can help
direct the user to a needed mechanism update that would not otherwise be known.
- **Mechanistic Hypotheses:**
Our future efforts will be directed towards generalizing this rule based definition
of the hypotheses to capture various behavior of the model. Also our efforts will
be directed towards identifying reaction scenarios for mechanistic hypotheses and
associating the rules to a particular transformation process to facilitate computation.
Transformation of these mechanism into computational code for simulation is a
task in progress. Generalizing the transformation process to accommodate various
scenarios is also a future goal.The challenge lies in identifying different scenarios of mechanistic hypotheses and
generalizing the DSL to allow their definition. The transformation of these hypotheses to mechanisms or expected behavior in the simulation model for the purpose of
computation, is a challenge. These transformations might require additional information or assumptions on the model that must be provided by the user and that is
not defined.
- **Point of Failure Identification:**
In the current system, when a temporal property is violated, the model checker
returns with a counterexample and a sequence of transitions that lead to that counterexample. With additional work, this system could trace its steps even further and
report the mechanism that caused the hypothesis to be invalidated. This would be a
useful tool when attempting to refine the model if wet-lab results are contradicting
with in-silico experiment results.
- **Automated Model Evolution:**
In relation to the prior topic, if the mechanism that is in error is able to be identified,
it may be able to be corrected autonomously by making minor alterations to the
simulation source code. This goal would require a more elaborate characterization
of mechanisms so that they could be analyzed and revised based on irregularities
with the expected properties.
- **Bayesian/Coherence Synergy:**
A Bayesian network is a probabilistic graphical model that represents a set of random variables and their conditional dependencies via a directed acyclic graph. Each
node in the graph represents a random variable, each of which has a set of possible states it can be in (or values it can take). In addition, attached to each node
is a probability distribution. The arcs indicate a dependency between two nodes.
If there is a dependency, then the probability distribution of the child node is a
conditional probability that depends on the probability of the parent node. While
the coherence network can function as a long-term memory repository of hypotheses and their relationships, Bayesian networks can be used as a short-term memory
interface with the experiments performed. Bayesian networks can perform a variety of tasks, but here we will only discuss potential applications that demonstrate
their use as interfaces between coherence networks and experiments. An important
component of coherence networks are the evidence nodes. Evidence nodes, in an
experimental context, represent observations obtained from an experiment. Often,
these evidence nodes are determined by the experimenter as the result of interpreting the experimental data. We propose using a Bayesian network to infer these
statements from the data.
- **Coherence Network Analyst Agent:**
As part of a longer-term project, we envision an intelligent agent designed to analyze the dependencies of the coherence network and propose new experiments to
maximize in- formation gain. This agent would be able to perform optimizations
between the experiment and hypothesis space in order to predict the most valuable parametrization of experiments and hypotheses that would lead to faster discovery.


For more details, please look into : [Simulation Experiment Management](https://github.com/szc0098/Simulation-Experiment-Management/blob/master/Simulation%20Experiment%20Management.pdf)



