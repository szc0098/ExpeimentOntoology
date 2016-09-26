package org.xtext.DOE.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.DOE.services.ExperimentOntologyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExperimentOntologyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RANGEVALUE", "RULE_FACTORLEVELVALUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'mechanism'", "' = '", "' -> '", "' + '", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "' == '", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "'!'", "'!='", "'event'", "'parameter'", "'with'", "'values'", "'properties'", "':'", "','", "'goal'", "'object'", "'of'", "'study'", "'purpose'", "'focus'", "'view point'", "'context'", "'hypotheses'", "'mechanistic'", "'evidence'", "'coherence'", "'relational'", "'('", "')'", "'activation'", "'weight'", "'if'", "'is'", "'added'", "'removed'", "'in the range'", "'to'", "'then'", "'compare'", "'and'", "'at'", "'level'", "'where'", "'for'", "'experiment'", "'design'", "'performance measure'", "'designType'", "'constraints'", "'variables'", "'independent'", "'control'", "'type'", "'dependent'", "'are'", "'levels'", "'number'", "'iterations'", "'='", "' +-'", "'QUALITATIVE'", "'QUANTITATIVE'", "'CONTINOUS'", "'DISCRETE'", "'BINARY'", "'NONBINARY'", "'TRUE'", "'FALSE'", "'occurs'", "'in'", "'precedes'", "'between'", "'eventually'", "'always'", "'before'", "'after'", "'until'", "'never'", "'leads'", "'absent'", "'exists'", "'or'", "'not'", "'EXPLAIN'", "'ANALOGOUS'", "'DATA'", "'CONTRADICT'", "'MIN'", "'MAX'", "'EXP'", "'INVERSE'", "'SIN'", "'COS'", "'TAN'", "'FACTORIAL'", "'LOG'", "'HIGH'", "'MEDIUM'", "'LOW'", "'FULLFACTORIAL'", "'FRACTIONALFACTORIAL'", "'OTHERS'", "'SIMPLE'", "'COMPOSITE'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_RANGEVALUE=6;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_FACTORLEVELVALUE=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=8;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalExperimentOntologyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExperimentOntologyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExperimentOntologyParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g"; }



     	private ExperimentOntologyGrammarAccess grammarAccess;
     	
        public InternalExperimentOntologyParser(TokenStream input, ExperimentOntologyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExperimentOntologyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleExperimentOntology ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:80:28: ( ( (lv_elements_0_0= ruleExperimentOntology ) )* )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:81:1: ( (lv_elements_0_0= ruleExperimentOntology ) )*
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:81:1: ( (lv_elements_0_0= ruleExperimentOntology ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==43||LA1_0==51||LA1_0==73) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:82:1: (lv_elements_0_0= ruleExperimentOntology )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:82:1: (lv_elements_0_0= ruleExperimentOntology )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:83:3: lv_elements_0_0= ruleExperimentOntology
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsExperimentOntologyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExperimentOntology_in_ruleModel130);
            	    lv_elements_0_0=ruleExperimentOntology();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"ExperimentOntology");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExperimentOntology"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:107:1: entryRuleExperimentOntology returns [EObject current=null] : iv_ruleExperimentOntology= ruleExperimentOntology EOF ;
    public final EObject entryRuleExperimentOntology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentOntology = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:108:2: (iv_ruleExperimentOntology= ruleExperimentOntology EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:109:2: iv_ruleExperimentOntology= ruleExperimentOntology EOF
            {
             newCompositeNode(grammarAccess.getExperimentOntologyRule()); 
            pushFollow(FOLLOW_ruleExperimentOntology_in_entryRuleExperimentOntology166);
            iv_ruleExperimentOntology=ruleExperimentOntology();

            state._fsp--;

             current =iv_ruleExperimentOntology; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentOntology176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExperimentOntology"


    // $ANTLR start "ruleExperimentOntology"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:116:1: ruleExperimentOntology returns [EObject current=null] : (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment ) ;
    public final EObject ruleExperimentOntology() throws RecognitionException {
        EObject current = null;

        EObject this_ModelSection_0 = null;

        EObject this_Goals_1 = null;

        EObject this_Hypothesis_2 = null;

        EObject this_Experiment_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:119:28: ( (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:120:1: (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:120:1: (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 43:
                {
                alt2=2;
                }
                break;
            case 51:
                {
                alt2=3;
                }
                break;
            case 73:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:121:5: this_ModelSection_0= ruleModelSection
                    {
                     
                            newCompositeNode(grammarAccess.getExperimentOntologyAccess().getModelSectionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModelSection_in_ruleExperimentOntology223);
                    this_ModelSection_0=ruleModelSection();

                    state._fsp--;

                     
                            current = this_ModelSection_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:131:5: this_Goals_1= ruleGoals
                    {
                     
                            newCompositeNode(grammarAccess.getExperimentOntologyAccess().getGoalsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGoals_in_ruleExperimentOntology250);
                    this_Goals_1=ruleGoals();

                    state._fsp--;

                     
                            current = this_Goals_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:141:5: this_Hypothesis_2= ruleHypothesis
                    {
                     
                            newCompositeNode(grammarAccess.getExperimentOntologyAccess().getHypothesisParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHypothesis_in_ruleExperimentOntology277);
                    this_Hypothesis_2=ruleHypothesis();

                    state._fsp--;

                     
                            current = this_Hypothesis_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:151:5: this_Experiment_3= ruleExperiment
                    {
                     
                            newCompositeNode(grammarAccess.getExperimentOntologyAccess().getExperimentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExperiment_in_ruleExperimentOntology304);
                    this_Experiment_3=ruleExperiment();

                    state._fsp--;

                     
                            current = this_Experiment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExperimentOntology"


    // $ANTLR start "entryRuleModelSection"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:167:1: entryRuleModelSection returns [EObject current=null] : iv_ruleModelSection= ruleModelSection EOF ;
    public final EObject entryRuleModelSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSection = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:168:2: (iv_ruleModelSection= ruleModelSection EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:169:2: iv_ruleModelSection= ruleModelSection EOF
            {
             newCompositeNode(grammarAccess.getModelSectionRule()); 
            pushFollow(FOLLOW_ruleModelSection_in_entryRuleModelSection339);
            iv_ruleModelSection=ruleModelSection();

            state._fsp--;

             current =iv_ruleModelSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelSection349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelSection"


    // $ANTLR start "ruleModelSection"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:176:1: ruleModelSection returns [EObject current=null] : (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' ) ;
    public final EObject ruleModelSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_modName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_mechanisms_3_0 = null;

        EObject lv_events_4_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:179:28: ( (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:180:1: (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:180:1: (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:180:3: otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModelSection386); 

                	newLeafNode(otherlv_0, grammarAccess.getModelSectionAccess().getModelKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:184:1: ( (lv_modName_1_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:185:1: (lv_modName_1_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:185:1: (lv_modName_1_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:186:3: lv_modName_1_0= RULE_ID
            {
            lv_modName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelSection403); 

            			newLeafNode(lv_modName_1_0, grammarAccess.getModelSectionAccess().getModNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modName",
                    		lv_modName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleModelSection420); 

                	newLeafNode(otherlv_2, grammarAccess.getModelSectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:206:1: ( (lv_mechanisms_3_0= ruleMechanism ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:207:1: (lv_mechanisms_3_0= ruleMechanism )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:207:1: (lv_mechanisms_3_0= ruleMechanism )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:208:3: lv_mechanisms_3_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelSectionAccess().getMechanismsMechanismParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_ruleModelSection441);
            	    lv_mechanisms_3_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mechanisms",
            	            		lv_mechanisms_3_0, 
            	            		"Mechanism");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:224:3: ( (lv_events_4_0= ruleEventDescriptor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:225:1: (lv_events_4_0= ruleEventDescriptor )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:225:1: (lv_events_4_0= ruleEventDescriptor )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:226:3: lv_events_4_0= ruleEventDescriptor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelSectionAccess().getEventsEventDescriptorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventDescriptor_in_ruleModelSection463);
            	    lv_events_4_0=ruleEventDescriptor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_4_0, 
            	            		"EventDescriptor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:242:3: ( (lv_parameters_5_0= ruleFactor ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:243:1: (lv_parameters_5_0= ruleFactor )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:243:1: (lv_parameters_5_0= ruleFactor )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:244:3: lv_parameters_5_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelSectionAccess().getParametersFactorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleModelSection485);
            	    lv_parameters_5_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_5_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleModelSection498); 

                	newLeafNode(otherlv_6, grammarAccess.getModelSectionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelSection"


    // $ANTLR start "entryRuleMechanism"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:272:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:273:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:274:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism534);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMechanism"


    // $ANTLR start "ruleMechanism"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:281:1: ruleMechanism returns [EObject current=null] : (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mechanismName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_LHS_3_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_RHS_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:284:28: ( (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:285:1: (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:285:1: (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:285:3: otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMechanism581); 

                	newLeafNode(otherlv_0, grammarAccess.getMechanismAccess().getMechanismKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:289:1: ( (lv_mechanismName_1_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:290:1: (lv_mechanismName_1_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:290:1: (lv_mechanismName_1_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:291:3: lv_mechanismName_1_0= RULE_ID
            {
            lv_mechanismName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism598); 

            			newLeafNode(lv_mechanismName_1_0, grammarAccess.getMechanismAccess().getMechanismNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mechanismName",
                    		lv_mechanismName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMechanism615); 

                	newLeafNode(otherlv_2, grammarAccess.getMechanismAccess().getSpaceEqualsSignSpaceKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:311:1: ( (lv_LHS_3_0= ruleReaction ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:312:1: (lv_LHS_3_0= ruleReaction )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:312:1: (lv_LHS_3_0= ruleReaction )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:313:3: lv_LHS_3_0= ruleReaction
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getLHSReactionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleReaction_in_ruleMechanism636);
            lv_LHS_3_0=ruleReaction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
            	        }
                   		set(
                   			current, 
                   			"LHS",
                    		lv_LHS_3_0, 
                    		"Reaction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:329:2: ( (lv_condition_4_0= ruleGuardCondition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:330:1: (lv_condition_4_0= ruleGuardCondition )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:330:1: (lv_condition_4_0= ruleGuardCondition )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:331:3: lv_condition_4_0= ruleGuardCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getMechanismAccess().getConditionGuardConditionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGuardCondition_in_ruleMechanism657);
                    lv_condition_4_0=ruleGuardCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMechanismRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_4_0, 
                            		"GuardCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMechanism670); 

                	newLeafNode(otherlv_5, grammarAccess.getMechanismAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:351:1: ( (lv_RHS_6_0= ruleReaction ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:352:1: (lv_RHS_6_0= ruleReaction )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:352:1: (lv_RHS_6_0= ruleReaction )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:353:3: lv_RHS_6_0= ruleReaction
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getRHSReactionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleReaction_in_ruleMechanism691);
            lv_RHS_6_0=ruleReaction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
            	        }
                   		set(
                   			current, 
                   			"RHS",
                    		lv_RHS_6_0, 
                    		"Reaction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMechanism"


    // $ANTLR start "entryRuleReaction"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:377:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:378:2: (iv_ruleReaction= ruleReaction EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:379:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_ruleReaction_in_entryRuleReaction727);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReaction737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:386:1: ruleReaction returns [EObject current=null] : ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token lv_agent1_0_0=null;
        Token otherlv_1=null;
        Token lv_agent_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:389:28: ( ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:390:1: ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:390:1: ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:390:2: ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )?
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:390:2: ( (lv_agent1_0_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:391:1: (lv_agent1_0_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:391:1: (lv_agent1_0_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:392:3: lv_agent1_0_0= RULE_ID
            {
            lv_agent1_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReaction779); 

            			newLeafNode(lv_agent1_0_0, grammarAccess.getReactionAccess().getAgent1IDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"agent1",
                    		lv_agent1_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:408:2: (otherlv_1= ' + ' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:408:4: otherlv_1= ' + '
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleReaction797); 

                        	newLeafNode(otherlv_1, grammarAccess.getReactionAccess().getSpacePlusSignSpaceKeyword_1());
                        

                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:412:3: ( (lv_agent_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:413:1: (lv_agent_2_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:413:1: (lv_agent_2_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:414:3: lv_agent_2_0= RULE_ID
                    {
                    lv_agent_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReaction816); 

                    			newLeafNode(lv_agent_2_0, grammarAccess.getReactionAccess().getAgentIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReactionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"agent",
                            		lv_agent_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleGuardCondition"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:438:1: entryRuleGuardCondition returns [EObject current=null] : iv_ruleGuardCondition= ruleGuardCondition EOF ;
    public final EObject entryRuleGuardCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardCondition = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:439:2: (iv_ruleGuardCondition= ruleGuardCondition EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:440:2: iv_ruleGuardCondition= ruleGuardCondition EOF
            {
             newCompositeNode(grammarAccess.getGuardConditionRule()); 
            pushFollow(FOLLOW_ruleGuardCondition_in_entryRuleGuardCondition858);
            iv_ruleGuardCondition=ruleGuardCondition();

            state._fsp--;

             current =iv_ruleGuardCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuardCondition868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuardCondition"


    // $ANTLR start "ruleGuardCondition"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:447:1: ruleGuardCondition returns [EObject current=null] : ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' ) ;
    public final EObject ruleGuardCondition() throws RecognitionException {
        EObject current = null;

        Token lv_gd_0_0=null;
        Token lv_condition1_1_0=null;
        Token lv_condition2_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_link_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:450:28: ( ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:451:1: ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:451:1: ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:451:2: ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']'
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:451:2: ( (lv_gd_0_0= '[' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:452:1: (lv_gd_0_0= '[' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:452:1: (lv_gd_0_0= '[' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:453:3: lv_gd_0_0= '['
            {
            lv_gd_0_0=(Token)match(input,20,FOLLOW_20_in_ruleGuardCondition911); 

                    newLeafNode(lv_gd_0_0, grammarAccess.getGuardConditionAccess().getGdLeftSquareBracketKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardConditionRule());
            	        }
                   		setWithLastConsumed(current, "gd", lv_gd_0_0, "[");
            	    

            }


            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:466:2: ( (lv_condition1_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:467:1: (lv_condition1_1_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:467:1: (lv_condition1_1_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:468:3: lv_condition1_1_0= RULE_ID
                    {
                    lv_condition1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuardCondition941); 

                    			newLeafNode(lv_condition1_1_0, grammarAccess.getGuardConditionAccess().getCondition1IDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"condition1",
                            		lv_condition1_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:484:3: ( (lv_link_2_0= ruleLinkOperators ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17||(LA10_0>=22 && LA10_0<=35)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:485:1: (lv_link_2_0= ruleLinkOperators )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:485:1: (lv_link_2_0= ruleLinkOperators )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:486:3: lv_link_2_0= ruleLinkOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardConditionAccess().getLinkLinkOperatorsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLinkOperators_in_ruleGuardCondition968);
                    lv_link_2_0=ruleLinkOperators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"link",
                            		lv_link_2_0, 
                            		"LinkOperators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:502:3: ( (lv_condition2_3_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:503:1: (lv_condition2_3_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:503:1: (lv_condition2_3_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:504:3: lv_condition2_3_0= RULE_ID
                    {
                    lv_condition2_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuardCondition986); 

                    			newLeafNode(lv_condition2_3_0, grammarAccess.getGuardConditionAccess().getCondition2IDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"condition2",
                            		lv_condition2_3_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleGuardCondition1004); 

                	newLeafNode(otherlv_4, grammarAccess.getGuardConditionAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuardCondition"


    // $ANTLR start "entryRuleLinkOperators"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:532:1: entryRuleLinkOperators returns [String current=null] : iv_ruleLinkOperators= ruleLinkOperators EOF ;
    public final String entryRuleLinkOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkOperators = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:533:2: (iv_ruleLinkOperators= ruleLinkOperators EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:534:2: iv_ruleLinkOperators= ruleLinkOperators EOF
            {
             newCompositeNode(grammarAccess.getLinkOperatorsRule()); 
            pushFollow(FOLLOW_ruleLinkOperators_in_entryRuleLinkOperators1041);
            iv_ruleLinkOperators=ruleLinkOperators();

            state._fsp--;

             current =iv_ruleLinkOperators.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkOperators1052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkOperators"


    // $ANTLR start "ruleLinkOperators"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:541:1: ruleLinkOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleLinkOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:544:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:545:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:545:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            int alt12=15;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 26:
                {
                alt12=5;
                }
                break;
            case 17:
                {
                alt12=6;
                }
                break;
            case 27:
                {
                alt12=7;
                }
                break;
            case 28:
                {
                alt12=8;
                }
                break;
            case 29:
                {
                alt12=9;
                }
                break;
            case 30:
                {
                alt12=10;
                }
                break;
            case 31:
                {
                alt12=11;
                }
                break;
            case 32:
                {
                alt12=12;
                }
                break;
            case 33:
                {
                alt12=13;
                }
                break;
            case 34:
                {
                alt12=14;
                }
                break;
            case 35:
                {
                alt12=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:546:2: kw= '+'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleLinkOperators1090); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:553:2: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleLinkOperators1109); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:560:2: kw= '*'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleLinkOperators1128); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAsteriskKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:567:2: kw= '/'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleLinkOperators1147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSolidusKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:574:2: kw= '%'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleLinkOperators1166); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPercentSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:581:2: kw= ' = '
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleLinkOperators1185); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignSpaceKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:588:2: kw= ' == '
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleLinkOperators1204); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:595:2: kw= '&&'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleLinkOperators1223); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAmpersandAmpersandKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:602:2: kw= '||'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleLinkOperators1242); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getVerticalLineVerticalLineKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:609:2: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleLinkOperators1261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:616:2: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleLinkOperators1280); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignEqualsSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:623:2: kw= '>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleLinkOperators1299); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:630:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleLinkOperators1318); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignEqualsSignKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:637:2: kw= '!'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleLinkOperators1337); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getExclamationMarkKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:644:2: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleLinkOperators1356); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getExclamationMarkEqualsSignKeyword_14()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkOperators"


    // $ANTLR start "entryRuleEventDescriptor"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:657:1: entryRuleEventDescriptor returns [EObject current=null] : iv_ruleEventDescriptor= ruleEventDescriptor EOF ;
    public final EObject entryRuleEventDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDescriptor = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:658:2: (iv_ruleEventDescriptor= ruleEventDescriptor EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:659:2: iv_ruleEventDescriptor= ruleEventDescriptor EOF
            {
             newCompositeNode(grammarAccess.getEventDescriptorRule()); 
            pushFollow(FOLLOW_ruleEventDescriptor_in_entryRuleEventDescriptor1396);
            iv_ruleEventDescriptor=ruleEventDescriptor();

            state._fsp--;

             current =iv_ruleEventDescriptor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDescriptor1406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDescriptor"


    // $ANTLR start "ruleEventDescriptor"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:666:1: ruleEventDescriptor returns [EObject current=null] : (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEventDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eventName_1_0=null;
        Token otherlv_2=null;
        Token lv_event_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:669:28: ( (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:670:1: (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:670:1: (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:670:3: otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEventDescriptor1443); 

                	newLeafNode(otherlv_0, grammarAccess.getEventDescriptorAccess().getEventKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:674:1: ( (lv_eventName_1_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:675:1: (lv_eventName_1_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:675:1: (lv_eventName_1_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:676:3: lv_eventName_1_0= RULE_ID
            {
            lv_eventName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDescriptor1460); 

            			newLeafNode(lv_eventName_1_0, grammarAccess.getEventDescriptorAccess().getEventNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventDescriptorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eventName",
                    		lv_eventName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEventDescriptor1477); 

                	newLeafNode(otherlv_2, grammarAccess.getEventDescriptorAccess().getSpaceEqualsSignSpaceKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:696:1: ( (lv_event_3_0= RULE_STRING ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:697:1: (lv_event_3_0= RULE_STRING )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:697:1: (lv_event_3_0= RULE_STRING )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:698:3: lv_event_3_0= RULE_STRING
            {
            lv_event_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventDescriptor1494); 

            			newLeafNode(lv_event_3_0, grammarAccess.getEventDescriptorAccess().getEventSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventDescriptorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"event",
                    		lv_event_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDescriptor"


    // $ANTLR start "entryRuleFactor"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:722:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:723:2: (iv_ruleFactor= ruleFactor EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:724:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1535);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:731:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_factorName_1_0=null;
        Token otherlv_2=null;
        Token lv_factorType1_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_factorType_3_0 = null;

        EObject lv_factorValue_8_0 = null;

        EObject lv_factorProperties_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:734:28: ( (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:735:1: (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:735:1: (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:735:3: otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleFactor1582); 

                	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getParameterKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:739:1: ( (lv_factorName_1_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:740:1: (lv_factorName_1_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:740:1: (lv_factorName_1_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:741:3: lv_factorName_1_0= RULE_ID
            {
            lv_factorName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactor1599); 

            			newLeafNode(lv_factorName_1_0, grammarAccess.getFactorAccess().getFactorNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFactorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"factorName",
                    		lv_factorName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleFactor1616); 

                	newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getSpaceEqualsSignSpaceKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:761:1: ( (lv_factorType_3_0= ruleVariableType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=89 && LA13_0<=94)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:762:1: (lv_factorType_3_0= ruleVariableType )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:762:1: (lv_factorType_3_0= ruleVariableType )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:763:3: lv_factorType_3_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getFactorTypeVariableTypeEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleFactor1637);
                    lv_factorType_3_0=ruleVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"factorType",
                            		lv_factorType_3_0, 
                            		"VariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:779:3: ( (lv_factorType1_4_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:780:1: (lv_factorType1_4_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:780:1: (lv_factorType1_4_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:781:3: lv_factorType1_4_0= RULE_ID
                    {
                    lv_factorType1_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactor1655); 

                    			newLeafNode(lv_factorType1_4_0, grammarAccess.getFactorAccess().getFactorType1IDTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"factorType1",
                            		lv_factorType1_4_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleFactor1673); 

                	newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getWithKeyword_5());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:801:1: (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:801:3: otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleFactor1686); 

                        	newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getValuesKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleFactor1698); 

                        	newLeafNode(otherlv_7, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:809:1: ( (lv_factorValue_8_0= ruleValues ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:810:1: (lv_factorValue_8_0= ruleValues )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:810:1: (lv_factorValue_8_0= ruleValues )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:811:3: lv_factorValue_8_0= ruleValues
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getFactorValueValuesParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValues_in_ruleFactor1719);
                    lv_factorValue_8_0=ruleValues();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"factorValue",
                            		lv_factorValue_8_0, 
                            		"Values");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleFactor1731); 

                        	newLeafNode(otherlv_9, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:831:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:831:5: otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleFactor1746); 

                        	newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getPropertiesKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleFactor1758); 

                        	newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:839:1: ( (lv_factorProperties_12_0= ruleproperties ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:840:1: (lv_factorProperties_12_0= ruleproperties )
                    	    {
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:840:1: (lv_factorProperties_12_0= ruleproperties )
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:841:3: lv_factorProperties_12_0= ruleproperties
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFactorAccess().getFactorPropertiesPropertiesParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleproperties_in_ruleFactor1779);
                    	    lv_factorProperties_12_0=ruleproperties();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"factorProperties",
                    	            		lv_factorProperties_12_0, 
                    	            		"properties");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleFactor1792); 

                        	newLeafNode(otherlv_13, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleproperties"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:869:1: entryRuleproperties returns [EObject current=null] : iv_ruleproperties= ruleproperties EOF ;
    public final EObject entryRuleproperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleproperties = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:870:2: (iv_ruleproperties= ruleproperties EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:871:2: iv_ruleproperties= ruleproperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleproperties_in_entryRuleproperties1830);
            iv_ruleproperties=ruleproperties();

            state._fsp--;

             current =iv_ruleproperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleproperties1840); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleproperties"


    // $ANTLR start "ruleproperties"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:878:1: ruleproperties returns [EObject current=null] : ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleproperties() throws RecognitionException {
        EObject current = null;

        Token lv_pName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pVal_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:881:28: ( ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:882:1: ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:882:1: ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:882:2: ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )?
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:882:2: ( (lv_pName_0_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:883:1: (lv_pName_0_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:883:1: (lv_pName_0_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:884:3: lv_pName_0_0= RULE_ID
            {
            lv_pName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleproperties1882); 

            			newLeafNode(lv_pName_0_0, grammarAccess.getPropertiesAccess().getPNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pName",
                    		lv_pName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleproperties1899); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getColonKeyword_1());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:904:1: ( (lv_pVal_2_0= ruleValues ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:905:1: (lv_pVal_2_0= ruleValues )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:905:1: (lv_pVal_2_0= ruleValues )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:906:3: lv_pVal_2_0= ruleValues
            {
             
            	        newCompositeNode(grammarAccess.getPropertiesAccess().getPValValuesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValues_in_ruleproperties1920);
            lv_pVal_2_0=ruleValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"pVal",
                    		lv_pVal_2_0, 
                    		"Values");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:922:2: (otherlv_3= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:922:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleproperties1933); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleproperties"


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:934:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:935:2: (iv_ruleValues= ruleValues EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:936:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues1971);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues1981); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:943:1: ruleValues returns [EObject current=null] : ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token lv_fVal_0_0=null;
        Token lv_function_1_0=null;
        Token lv_value_2_0=null;
        Token lv_fvalue_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:946:28: ( ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:947:1: ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:947:1: ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:947:2: ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )?
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:947:2: ( (lv_fVal_0_0= RULE_ID ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||(LA19_1>=RULE_ID && LA19_1<=RULE_FACTORLEVELVALUE)||LA19_1==15||LA19_1==42) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:948:1: (lv_fVal_0_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:948:1: (lv_fVal_0_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:949:3: lv_fVal_0_0= RULE_ID
                    {
                    lv_fVal_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValues2023); 

                    			newLeafNode(lv_fVal_0_0, grammarAccess.getValuesAccess().getFValIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValuesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fVal",
                            		lv_fVal_0_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:965:3: ( (lv_function_1_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:966:1: (lv_function_1_0= RULE_STRING )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:966:1: (lv_function_1_0= RULE_STRING )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:967:3: lv_function_1_0= RULE_STRING
                    {
                    lv_function_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValues2046); 

                    			newLeafNode(lv_function_1_0, grammarAccess.getValuesAccess().getFunctionSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValuesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"function",
                            		lv_function_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:983:3: ( (lv_value_2_0= RULE_RANGEVALUE ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_RANGEVALUE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:984:1: (lv_value_2_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:984:1: (lv_value_2_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:985:3: lv_value_2_0= RULE_RANGEVALUE
                    {
                    lv_value_2_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleValues2069); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getValuesAccess().getValueRangeValueTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValuesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"rangeValue");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1001:3: ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_FACTORLEVELVALUE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1002:1: (lv_fvalue_3_0= RULE_FACTORLEVELVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1002:1: (lv_fvalue_3_0= RULE_FACTORLEVELVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1003:3: lv_fvalue_3_0= RULE_FACTORLEVELVALUE
                    {
                    lv_fvalue_3_0=(Token)match(input,RULE_FACTORLEVELVALUE,FOLLOW_RULE_FACTORLEVELVALUE_in_ruleValues2092); 

                    			newLeafNode(lv_fvalue_3_0, grammarAccess.getValuesAccess().getFvalueFactorLevelValueTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValuesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fvalue",
                            		lv_fvalue_3_0, 
                            		"factorLevelValue");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleGoals"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1027:1: entryRuleGoals returns [EObject current=null] : iv_ruleGoals= ruleGoals EOF ;
    public final EObject entryRuleGoals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoals = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1028:2: (iv_ruleGoals= ruleGoals EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1029:2: iv_ruleGoals= ruleGoals EOF
            {
             newCompositeNode(grammarAccess.getGoalsRule()); 
            pushFollow(FOLLOW_ruleGoals_in_entryRuleGoals2134);
            iv_ruleGoals=ruleGoals();

            state._fsp--;

             current =iv_ruleGoals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoals2144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoals"


    // $ANTLR start "ruleGoals"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1036:1: ruleGoals returns [EObject current=null] : (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' ) ;
    public final EObject ruleGoals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_objOfStudy_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_purpose_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_focus_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_viewPoint_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_context_18_0=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1039:28: ( (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1040:1: (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1040:1: (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1040:3: otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleGoals2181); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalsAccess().getGoalKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleGoals2193); 

                	newLeafNode(otherlv_1, grammarAccess.getGoalsAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleGoals2205); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalsAccess().getObjectKeyword_2());
                
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleGoals2217); 

                	newLeafNode(otherlv_3, grammarAccess.getGoalsAccess().getOfKeyword_3());
                
            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleGoals2229); 

                	newLeafNode(otherlv_4, grammarAccess.getGoalsAccess().getStudyKeyword_4());
                
            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleGoals2241); 

                	newLeafNode(otherlv_5, grammarAccess.getGoalsAccess().getColonKeyword_5());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1064:1: ( (lv_objOfStudy_6_0= RULE_STRING ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1065:1: (lv_objOfStudy_6_0= RULE_STRING )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1065:1: (lv_objOfStudy_6_0= RULE_STRING )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1066:3: lv_objOfStudy_6_0= RULE_STRING
            {
            lv_objOfStudy_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoals2258); 

            			newLeafNode(lv_objOfStudy_6_0, grammarAccess.getGoalsAccess().getObjOfStudySTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"objOfStudy",
                    		lv_objOfStudy_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleGoals2275); 

                	newLeafNode(otherlv_7, grammarAccess.getGoalsAccess().getPurposeKeyword_7());
                
            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleGoals2287); 

                	newLeafNode(otherlv_8, grammarAccess.getGoalsAccess().getColonKeyword_8());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1090:1: ( (lv_purpose_9_0= RULE_STRING ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1091:1: (lv_purpose_9_0= RULE_STRING )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1091:1: (lv_purpose_9_0= RULE_STRING )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1092:3: lv_purpose_9_0= RULE_STRING
            {
            lv_purpose_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoals2304); 

            			newLeafNode(lv_purpose_9_0, grammarAccess.getGoalsAccess().getPurposeSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"purpose",
                    		lv_purpose_9_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleGoals2321); 

                	newLeafNode(otherlv_10, grammarAccess.getGoalsAccess().getFocusKeyword_10());
                
            otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleGoals2333); 

                	newLeafNode(otherlv_11, grammarAccess.getGoalsAccess().getColonKeyword_11());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1116:1: ( (lv_focus_12_0= RULE_STRING ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1117:1: (lv_focus_12_0= RULE_STRING )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1117:1: (lv_focus_12_0= RULE_STRING )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1118:3: lv_focus_12_0= RULE_STRING
            {
            lv_focus_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoals2350); 

            			newLeafNode(lv_focus_12_0, grammarAccess.getGoalsAccess().getFocusSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"focus",
                    		lv_focus_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleGoals2367); 

                	newLeafNode(otherlv_13, grammarAccess.getGoalsAccess().getViewPointKeyword_13());
                
            otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleGoals2379); 

                	newLeafNode(otherlv_14, grammarAccess.getGoalsAccess().getColonKeyword_14());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1142:1: ( (lv_viewPoint_15_0= RULE_STRING ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1143:1: (lv_viewPoint_15_0= RULE_STRING )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1143:1: (lv_viewPoint_15_0= RULE_STRING )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1144:3: lv_viewPoint_15_0= RULE_STRING
            {
            lv_viewPoint_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoals2396); 

            			newLeafNode(lv_viewPoint_15_0, grammarAccess.getGoalsAccess().getViewPointSTRINGTerminalRuleCall_15_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"viewPoint",
                    		lv_viewPoint_15_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_16=(Token)match(input,50,FOLLOW_50_in_ruleGoals2413); 

                	newLeafNode(otherlv_16, grammarAccess.getGoalsAccess().getContextKeyword_16());
                
            otherlv_17=(Token)match(input,41,FOLLOW_41_in_ruleGoals2425); 

                	newLeafNode(otherlv_17, grammarAccess.getGoalsAccess().getColonKeyword_17());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1168:1: ( (lv_context_18_0= RULE_STRING ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1169:1: (lv_context_18_0= RULE_STRING )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1169:1: (lv_context_18_0= RULE_STRING )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1170:3: lv_context_18_0= RULE_STRING
            {
            lv_context_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoals2442); 

            			newLeafNode(lv_context_18_0, grammarAccess.getGoalsAccess().getContextSTRINGTerminalRuleCall_18_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"context",
                    		lv_context_18_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleGoals2459); 

                	newLeafNode(otherlv_19, grammarAccess.getGoalsAccess().getRightCurlyBracketKeyword_19());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoals"


    // $ANTLR start "entryRuleHypothesis"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1198:1: entryRuleHypothesis returns [EObject current=null] : iv_ruleHypothesis= ruleHypothesis EOF ;
    public final EObject entryRuleHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHypothesis = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1199:2: (iv_ruleHypothesis= ruleHypothesis EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1200:2: iv_ruleHypothesis= ruleHypothesis EOF
            {
             newCompositeNode(grammarAccess.getHypothesisRule()); 
            pushFollow(FOLLOW_ruleHypothesis_in_entryRuleHypothesis2495);
            iv_ruleHypothesis=ruleHypothesis();

            state._fsp--;

             current =iv_ruleHypothesis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHypothesis2505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHypothesis"


    // $ANTLR start "ruleHypothesis"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1207:1: ruleHypothesis returns [EObject current=null] : (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleHypothesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_mechHypothesis_5_0 = null;

        EObject lv_evidences_9_0 = null;

        EObject lv_coherenceLinks_14_0 = null;

        EObject lv_relHypothesis_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1210:28: ( (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1211:1: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1211:1: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1211:3: otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleHypothesis2542); 

                	newLeafNode(otherlv_0, grammarAccess.getHypothesisAccess().getHypothesesKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleHypothesis2554); 

                	newLeafNode(otherlv_1, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1219:1: (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1219:3: otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleHypothesis2567); 

                        	newLeafNode(otherlv_2, grammarAccess.getHypothesisAccess().getMechanisticKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleHypothesis2579); 

                        	newLeafNode(otherlv_3, grammarAccess.getHypothesisAccess().getHypothesesKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleHypothesis2591); 

                        	newLeafNode(otherlv_4, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_2_2());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1231:1: ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1232:1: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    {
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1232:1: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1233:3: lv_mechHypothesis_5_0= ruleMechHypothesis
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesisAccess().getMechHypothesisMechHypothesisParserRuleCall_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMechHypothesis_in_ruleHypothesis2612);
                    	    lv_mechHypothesis_5_0=ruleMechHypothesis();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mechHypothesis",
                    	            		lv_mechHypothesis_5_0, 
                    	            		"MechHypothesis");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleHypothesis2625); 

                        	newLeafNode(otherlv_6, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1253:3: (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1253:5: otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleHypothesis2640); 

                        	newLeafNode(otherlv_7, grammarAccess.getHypothesisAccess().getEvidenceKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleHypothesis2652); 

                        	newLeafNode(otherlv_8, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1261:1: ( (lv_evidences_9_0= ruleEvidence ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1262:1: (lv_evidences_9_0= ruleEvidence )
                    	    {
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1262:1: (lv_evidences_9_0= ruleEvidence )
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1263:3: lv_evidences_9_0= ruleEvidence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesisAccess().getEvidencesEvidenceParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvidence_in_ruleHypothesis2673);
                    	    lv_evidences_9_0=ruleEvidence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"evidences",
                    	            		lv_evidences_9_0, 
                    	            		"Evidence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleHypothesis2686); 

                        	newLeafNode(otherlv_10, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1283:3: (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1283:5: otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleHypothesis2701); 

                        	newLeafNode(otherlv_11, grammarAccess.getHypothesisAccess().getCoherenceKeyword_4_0());
                        
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleHypothesis2713); 

                        	newLeafNode(otherlv_12, grammarAccess.getHypothesisAccess().getModelKeyword_4_1());
                        
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleHypothesis2725); 

                        	newLeafNode(otherlv_13, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1295:1: ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=112 && LA27_0<=115)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1296:1: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    {
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1296:1: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1297:3: lv_coherenceLinks_14_0= ruleCoherenceLink
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesisAccess().getCoherenceLinksCoherenceLinkParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCoherenceLink_in_ruleHypothesis2746);
                    	    lv_coherenceLinks_14_0=ruleCoherenceLink();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"coherenceLinks",
                    	            		lv_coherenceLinks_14_0, 
                    	            		"CoherenceLink");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleHypothesis2759); 

                        	newLeafNode(otherlv_15, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1317:3: (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1317:5: otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,55,FOLLOW_55_in_ruleHypothesis2774); 

                        	newLeafNode(otherlv_16, grammarAccess.getHypothesisAccess().getRelationalKeyword_5_0());
                        
                    otherlv_17=(Token)match(input,51,FOLLOW_51_in_ruleHypothesis2786); 

                        	newLeafNode(otherlv_17, grammarAccess.getHypothesisAccess().getHypothesesKeyword_5_1());
                        
                    otherlv_18=(Token)match(input,14,FOLLOW_14_in_ruleHypothesis2798); 

                        	newLeafNode(otherlv_18, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1329:1: ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==60||LA29_0==67) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1330:1: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    {
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1330:1: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1331:3: lv_relHypothesis_19_0= ruleRelationalQuery
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesisAccess().getRelHypothesisRelationalQueryParserRuleCall_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRelationalQuery_in_ruleHypothesis2819);
                    	    lv_relHypothesis_19_0=ruleRelationalQuery();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relHypothesis",
                    	            		lv_relHypothesis_19_0, 
                    	            		"RelationalQuery");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_15_in_ruleHypothesis2832); 

                        	newLeafNode(otherlv_20, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleHypothesis2846); 

                	newLeafNode(otherlv_21, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHypothesis"


    // $ANTLR start "entryRuleCoherenceLink"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1363:1: entryRuleCoherenceLink returns [EObject current=null] : iv_ruleCoherenceLink= ruleCoherenceLink EOF ;
    public final EObject entryRuleCoherenceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoherenceLink = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1364:2: (iv_ruleCoherenceLink= ruleCoherenceLink EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1365:2: iv_ruleCoherenceLink= ruleCoherenceLink EOF
            {
             newCompositeNode(grammarAccess.getCoherenceLinkRule()); 
            pushFollow(FOLLOW_ruleCoherenceLink_in_entryRuleCoherenceLink2882);
            iv_ruleCoherenceLink=ruleCoherenceLink();

            state._fsp--;

             current =iv_ruleCoherenceLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoherenceLink2892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoherenceLink"


    // $ANTLR start "ruleCoherenceLink"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1372:1: ruleCoherenceLink returns [EObject current=null] : ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) ;
    public final EObject ruleCoherenceLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hyp_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_evi_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_coherence_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1375:28: ( ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1376:1: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1376:1: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1376:2: ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')'
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1376:2: ( (lv_coherence_0_0= ruleCoherence ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1377:1: (lv_coherence_0_0= ruleCoherence )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1377:1: (lv_coherence_0_0= ruleCoherence )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1378:3: lv_coherence_0_0= ruleCoherence
            {
             
            	        newCompositeNode(grammarAccess.getCoherenceLinkAccess().getCoherenceCoherenceEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCoherence_in_ruleCoherenceLink2938);
            lv_coherence_0_0=ruleCoherence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoherenceLinkRule());
            	        }
                   		set(
                   			current, 
                   			"coherence",
                    		lv_coherence_0_0, 
                    		"Coherence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleCoherenceLink2950); 

                	newLeafNode(otherlv_1, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1398:1: ( (lv_hyp_2_0= RULE_ID ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1399:1: (lv_hyp_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1399:1: (lv_hyp_2_0= RULE_ID )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1400:3: lv_hyp_2_0= RULE_ID
            	    {
            	    lv_hyp_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCoherenceLink2967); 

            	    			newLeafNode(lv_hyp_2_0, grammarAccess.getCoherenceLinkAccess().getHypIDTerminalRuleCall_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCoherenceLinkRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"hyp",
            	            		lv_hyp_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleCoherenceLink2985); 

                	newLeafNode(otherlv_3, grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleCoherenceLink2997); 

                	newLeafNode(otherlv_4, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_4());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1424:1: ( (lv_evi_5_0= RULE_ID ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1425:1: (lv_evi_5_0= RULE_ID )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1425:1: (lv_evi_5_0= RULE_ID )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1426:3: lv_evi_5_0= RULE_ID
            	    {
            	    lv_evi_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCoherenceLink3014); 

            	    			newLeafNode(lv_evi_5_0, grammarAccess.getCoherenceLinkAccess().getEviIDTerminalRuleCall_5_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCoherenceLinkRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"evi",
            	            		lv_evi_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleCoherenceLink3032); 

                	newLeafNode(otherlv_6, grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoherenceLink"


    // $ANTLR start "entryRuleMechHypothesis"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1454:1: entryRuleMechHypothesis returns [EObject current=null] : iv_ruleMechHypothesis= ruleMechHypothesis EOF ;
    public final EObject entryRuleMechHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechHypothesis = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1455:2: (iv_ruleMechHypothesis= ruleMechHypothesis EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1456:2: iv_ruleMechHypothesis= ruleMechHypothesis EOF
            {
             newCompositeNode(grammarAccess.getMechHypothesisRule()); 
            pushFollow(FOLLOW_ruleMechHypothesis_in_entryRuleMechHypothesis3068);
            iv_ruleMechHypothesis=ruleMechHypothesis();

            state._fsp--;

             current =iv_ruleMechHypothesis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechHypothesis3078); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMechHypothesis"


    // $ANTLR start "ruleMechHypothesis"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1463:1: ruleMechHypothesis returns [EObject current=null] : ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) ;
    public final EObject ruleMechHypothesis() throws RecognitionException {
        EObject current = null;

        Token lv_mName_0_0=null;
        Token otherlv_1=null;
        Token lv_mechanisticHypothesis_3_0=null;
        EObject lv_assoMech_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1466:28: ( ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1467:1: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1467:1: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1467:2: ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1467:2: ( (lv_mName_0_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1468:1: (lv_mName_0_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1468:1: (lv_mName_0_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1469:3: lv_mName_0_0= RULE_ID
            {
            lv_mName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechHypothesis3120); 

            			newLeafNode(lv_mName_0_0, grammarAccess.getMechHypothesisAccess().getMNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechHypothesisRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mName",
                    		lv_mName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleMechHypothesis3137); 

                	newLeafNode(otherlv_1, grammarAccess.getMechHypothesisAccess().getColonKeyword_1());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1489:1: ( (lv_assoMech_2_0= ruleTemporalPattern ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1490:1: (lv_assoMech_2_0= ruleTemporalPattern )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1490:1: (lv_assoMech_2_0= ruleTemporalPattern )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1491:3: lv_assoMech_2_0= ruleTemporalPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMechHypothesisAccess().getAssoMechTemporalPatternParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemporalPattern_in_ruleMechHypothesis3158);
            	    lv_assoMech_2_0=ruleTemporalPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMechHypothesisRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assoMech",
            	            		lv_assoMech_2_0, 
            	            		"TemporalPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1507:3: ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==EOF||LA34_1==RULE_ID||LA34_1==15) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1508:1: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1508:1: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1509:3: lv_mechanisticHypothesis_3_0= RULE_ID
                    {
                    lv_mechanisticHypothesis_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechHypothesis3176); 

                    			newLeafNode(lv_mechanisticHypothesis_3_0, grammarAccess.getMechHypothesisAccess().getMechanisticHypothesisIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMechHypothesisRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mechanisticHypothesis",
                            		lv_mechanisticHypothesis_3_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMechHypothesis"


    // $ANTLR start "entryRuleEvidence"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1533:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1534:2: (iv_ruleEvidence= ruleEvidence EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1535:2: iv_ruleEvidence= ruleEvidence EOF
            {
             newCompositeNode(grammarAccess.getEvidenceRule()); 
            pushFollow(FOLLOW_ruleEvidence_in_entryRuleEvidence3218);
            iv_ruleEvidence=ruleEvidence();

            state._fsp--;

             current =iv_ruleEvidence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvidence3228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvidence"


    // $ANTLR start "ruleEvidence"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1542:1: ruleEvidence returns [EObject current=null] : ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) ;
    public final EObject ruleEvidence() throws RecognitionException {
        EObject current = null;

        Token lv_eName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_objOfStudy_6_0=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1545:28: ( ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1546:1: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1546:1: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1546:2: ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1546:2: ( (lv_eName_0_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1547:1: (lv_eName_0_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1547:1: (lv_eName_0_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1548:3: lv_eName_0_0= RULE_ID
            {
            lv_eName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvidence3270); 

            			newLeafNode(lv_eName_0_0, grammarAccess.getEvidenceAccess().getENameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvidenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eName",
                    		lv_eName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleEvidence3287); 

                	newLeafNode(otherlv_1, grammarAccess.getEvidenceAccess().getColonKeyword_1());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1568:1: ( (lv_query_2_0= ruleTemporalPattern ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==20) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1569:1: (lv_query_2_0= ruleTemporalPattern )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1569:1: (lv_query_2_0= ruleTemporalPattern )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1570:3: lv_query_2_0= ruleTemporalPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvidenceAccess().getQueryTemporalPatternParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemporalPattern_in_ruleEvidence3308);
            	    lv_query_2_0=ruleTemporalPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEvidenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"query",
            	            		lv_query_2_0, 
            	            		"TemporalPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleEvidence3321); 

                	newLeafNode(otherlv_3, grammarAccess.getEvidenceAccess().getActivationKeyword_3());
                
            otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleEvidence3333); 

                	newLeafNode(otherlv_4, grammarAccess.getEvidenceAccess().getWeightKeyword_4());
                
            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleEvidence3345); 

                	newLeafNode(otherlv_5, grammarAccess.getEvidenceAccess().getColonKeyword_5());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1598:1: ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1599:1: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1599:1: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1600:3: lv_objOfStudy_6_0= RULE_RANGEVALUE
            {
            lv_objOfStudy_6_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleEvidence3362); 

            			newLeafNode(lv_objOfStudy_6_0, grammarAccess.getEvidenceAccess().getObjOfStudyRangeValueTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvidenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"objOfStudy",
                    		lv_objOfStudy_6_0, 
                    		"rangeValue");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvidence"


    // $ANTLR start "entryRuleTemporalPattern"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1624:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1625:2: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1626:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
            {
             newCompositeNode(grammarAccess.getTemporalPatternRule()); 
            pushFollow(FOLLOW_ruleTemporalPattern_in_entryRuleTemporalPattern3403);
            iv_ruleTemporalPattern=ruleTemporalPattern();

            state._fsp--;

             current =iv_ruleTemporalPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPattern3413); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalPattern"


    // $ANTLR start "ruleTemporalPattern"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1633:1: ruleTemporalPattern returns [EObject current=null] : (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) ;
    public final EObject ruleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        Enumerator lv_l2_1_0 = null;

        Enumerator lv_exp_2_0 = null;

        Enumerator lv_op1_3_0 = null;

        Enumerator lv_op2_4_0 = null;

        Enumerator lv_l3_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1636:28: ( (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1637:1: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1637:1: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1638:5: this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )?
            {
             
                    newCompositeNode(grammarAccess.getTemporalPatternAccess().getConditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCondition_in_ruleTemporalPattern3460);
            this_Condition_0=ruleCondition();

            state._fsp--;

             
                    current = this_Condition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1646:1: ( (lv_l2_1_0= ruleLinks ) )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 61:
                    {
                    alt36=1;
                    }
                    break;
                case 97:
                    {
                    alt36=1;
                    }
                    break;
                case 65:
                    {
                    alt36=1;
                    }
                    break;
                case 98:
                    {
                    alt36=1;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1647:1: (lv_l2_1_0= ruleLinks )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1647:1: (lv_l2_1_0= ruleLinks )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1648:3: lv_l2_1_0= ruleLinks
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemporalPatternAccess().getL2LinksEnumRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinks_in_ruleTemporalPattern3480);
            	    lv_l2_1_0=ruleLinks();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"l2",
            	            		lv_l2_1_0, 
            	            		"Links");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1664:3: ( (lv_exp_2_0= ruleExpression ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=95 && LA37_0<=96)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1665:1: (lv_exp_2_0= ruleExpression )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1665:1: (lv_exp_2_0= ruleExpression )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1666:3: lv_exp_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemporalPatternAccess().getExpExpressionEnumRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleTemporalPattern3502);
            	    lv_exp_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1682:3: ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=99 && LA38_0<=109)) ) {
                    alt38=1;
                }
                else if ( (LA38_0==68||(LA38_0>=110 && LA38_0<=111)) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1682:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1682:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1683:1: (lv_op1_3_0= ruleTemporal )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1683:1: (lv_op1_3_0= ruleTemporal )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1684:3: lv_op1_3_0= ruleTemporal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp1TemporalEnumRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemporal_in_ruleTemporalPattern3525);
            	    lv_op1_3_0=ruleTemporal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"op1",
            	            		lv_op1_3_0, 
            	            		"Temporal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1701:6: ( (lv_op2_4_0= ruleLogical ) )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1701:6: ( (lv_op2_4_0= ruleLogical ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1702:1: (lv_op2_4_0= ruleLogical )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1702:1: (lv_op2_4_0= ruleLogical )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1703:3: lv_op2_4_0= ruleLogical
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp2LogicalEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLogical_in_ruleTemporalPattern3552);
            	    lv_op2_4_0=ruleLogical();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"op2",
            	            		lv_op2_4_0, 
            	            		"Logical");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1719:4: ( (lv_l3_5_0= ruleLinks ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==61||LA39_0==65||(LA39_0>=97 && LA39_0<=98)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1720:1: (lv_l3_5_0= ruleLinks )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1720:1: (lv_l3_5_0= ruleLinks )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1721:3: lv_l3_5_0= ruleLinks
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemporalPatternAccess().getL3LinksEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLinks_in_ruleTemporalPattern3575);
                    lv_l3_5_0=ruleLinks();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
                    	        }
                           		set(
                           			current, 
                           			"l3",
                            		lv_l3_5_0, 
                            		"Links");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalPattern"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1745:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1746:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1747:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition3612);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition3622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1754:1: ruleCondition returns [EObject current=null] : ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_v_4_0=null;
        EObject lv_condition_0_0 = null;

        AntlrDatatypeRuleToken lv_lo_1_0 = null;

        EObject lv_e_2_0 = null;

        Enumerator lv_exp1_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1757:28: ( ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1758:1: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1758:1: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1758:2: ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1758:2: ( (lv_condition_0_0= ruleEvent ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1759:1: (lv_condition_0_0= ruleEvent )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1759:1: (lv_condition_0_0= ruleEvent )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1760:3: lv_condition_0_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getConditionEventParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleCondition3668);
            lv_condition_0_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_0_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1776:2: ( (lv_lo_1_0= ruleLinkOperators ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17||(LA40_0>=22 && LA40_0<=35)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1777:1: (lv_lo_1_0= ruleLinkOperators )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1777:1: (lv_lo_1_0= ruleLinkOperators )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1778:3: lv_lo_1_0= ruleLinkOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getLoLinkOperatorsParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLinkOperators_in_ruleCondition3689);
                    lv_lo_1_0=ruleLinkOperators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"lo",
                            		lv_lo_1_0, 
                            		"LinkOperators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1794:3: ( (lv_e_2_0= ruleEvent ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1795:1: (lv_e_2_0= ruleEvent )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1795:1: (lv_e_2_0= ruleEvent )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1796:3: lv_e_2_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getEEventParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleCondition3711);
                    lv_e_2_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"e",
                            		lv_e_2_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1812:3: ( (lv_exp1_3_0= ruleExpression ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==95) ) {
                alt42=1;
            }
            else if ( (LA42_0==96) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1813:1: (lv_exp1_3_0= ruleExpression )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1813:1: (lv_exp1_3_0= ruleExpression )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1814:3: lv_exp1_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getExp1ExpressionEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCondition3733);
                    lv_exp1_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"exp1",
                            		lv_exp1_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1830:3: ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_RANGEVALUE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1831:1: (lv_v_4_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1831:1: (lv_v_4_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1832:3: lv_v_4_0= RULE_RANGEVALUE
                    {
                    lv_v_4_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleCondition3751); 

                    			newLeafNode(lv_v_4_0, grammarAccess.getConditionAccess().getVRangeValueTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"v",
                            		lv_v_4_0, 
                            		"rangeValue");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1856:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1857:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1858:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3793);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1865:1: ruleEvent returns [EObject current=null] : (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Dispersed_0 = null;

        EObject this_Simultaneous_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1868:28: ( (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1869:1: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1869:1: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==20) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1870:5: this_Dispersed_0= ruleDispersed
                    {
                     
                            newCompositeNode(grammarAccess.getEventAccess().getDispersedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDispersed_in_ruleEvent3850);
                    this_Dispersed_0=ruleDispersed();

                    state._fsp--;

                     
                            current = this_Dispersed_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1880:5: this_Simultaneous_1= ruleSimultaneous
                    {
                     
                            newCompositeNode(grammarAccess.getEventAccess().getSimultaneousParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimultaneous_in_ruleEvent3877);
                    this_Simultaneous_1=ruleSimultaneous();

                    state._fsp--;

                     
                            current = this_Simultaneous_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSimultaneous"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1896:1: entryRuleSimultaneous returns [EObject current=null] : iv_ruleSimultaneous= ruleSimultaneous EOF ;
    public final EObject entryRuleSimultaneous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneous = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1897:2: (iv_ruleSimultaneous= ruleSimultaneous EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1898:2: iv_ruleSimultaneous= ruleSimultaneous EOF
            {
             newCompositeNode(grammarAccess.getSimultaneousRule()); 
            pushFollow(FOLLOW_ruleSimultaneous_in_entryRuleSimultaneous3912);
            iv_ruleSimultaneous=ruleSimultaneous();

            state._fsp--;

             current =iv_ruleSimultaneous; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneous3922); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimultaneous"


    // $ANTLR start "ruleSimultaneous"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1905:1: ruleSimultaneous returns [EObject current=null] : (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSimultaneous() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_sim1_1_0 = null;

        Enumerator lv_log_2_0 = null;

        AntlrDatatypeRuleToken lv_sim2_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1908:28: ( (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1909:1: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1909:1: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1909:3: otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSimultaneous3959); 

                	newLeafNode(otherlv_0, grammarAccess.getSimultaneousAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1913:1: ( (lv_sim1_1_0= ruleRe ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1914:1: (lv_sim1_1_0= ruleRe )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1914:1: (lv_sim1_1_0= ruleRe )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1915:3: lv_sim1_1_0= ruleRe
            {
             
            	        newCompositeNode(grammarAccess.getSimultaneousAccess().getSim1ReParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRe_in_ruleSimultaneous3980);
            lv_sim1_1_0=ruleRe();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            	        }
                   		set(
                   			current, 
                   			"sim1",
                    		lv_sim1_1_0, 
                    		"Re");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1931:2: ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==68||(LA45_0>=110 && LA45_0<=111)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1931:3: ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1931:3: ( (lv_log_2_0= ruleLogical ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1932:1: (lv_log_2_0= ruleLogical )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1932:1: (lv_log_2_0= ruleLogical )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1933:3: lv_log_2_0= ruleLogical
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimultaneousAccess().getLogLogicalEnumRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLogical_in_ruleSimultaneous4002);
            	    lv_log_2_0=ruleLogical();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"log",
            	            		lv_log_2_0, 
            	            		"Logical");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1949:2: ( (lv_sim2_3_0= ruleRe ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1950:1: (lv_sim2_3_0= ruleRe )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1950:1: (lv_sim2_3_0= ruleRe )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1951:3: lv_sim2_3_0= ruleRe
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimultaneousAccess().getSim2ReParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRe_in_ruleSimultaneous4023);
            	    lv_sim2_3_0=ruleRe();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sim2",
            	            		lv_sim2_3_0, 
            	            		"Re");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleSimultaneous4037); 

                	newLeafNode(otherlv_4, grammarAccess.getSimultaneousAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimultaneous"


    // $ANTLR start "entryRuleDispersed"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1979:1: entryRuleDispersed returns [EObject current=null] : iv_ruleDispersed= ruleDispersed EOF ;
    public final EObject entryRuleDispersed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispersed = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1980:2: (iv_ruleDispersed= ruleDispersed EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1981:2: iv_ruleDispersed= ruleDispersed EOF
            {
             newCompositeNode(grammarAccess.getDispersedRule()); 
            pushFollow(FOLLOW_ruleDispersed_in_entryRuleDispersed4073);
            iv_ruleDispersed=ruleDispersed();

            state._fsp--;

             current =iv_ruleDispersed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDispersed4083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDispersed"


    // $ANTLR start "ruleDispersed"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1988:1: ruleDispersed returns [EObject current=null] : ( (lv_disp_0_0= ruleRe ) )+ ;
    public final EObject ruleDispersed() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_disp_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1991:28: ( ( (lv_disp_0_0= ruleRe ) )+ )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1992:1: ( (lv_disp_0_0= ruleRe ) )+
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1992:1: ( (lv_disp_0_0= ruleRe ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1993:1: (lv_disp_0_0= ruleRe )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1993:1: (lv_disp_0_0= ruleRe )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:1994:3: lv_disp_0_0= ruleRe
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDispersedAccess().getDispReParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRe_in_ruleDispersed4128);
            	    lv_disp_0_0=ruleRe();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDispersedRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"disp",
            	            		lv_disp_0_0, 
            	            		"Re");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDispersed"


    // $ANTLR start "entryRuleRe"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2018:1: entryRuleRe returns [String current=null] : iv_ruleRe= ruleRe EOF ;
    public final String entryRuleRe() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRe = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2019:2: (iv_ruleRe= ruleRe EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2020:2: iv_ruleRe= ruleRe EOF
            {
             newCompositeNode(grammarAccess.getReRule()); 
            pushFollow(FOLLOW_ruleRe_in_entryRuleRe4165);
            iv_ruleRe=ruleRe();

            state._fsp--;

             current =iv_ruleRe.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRe4176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRe"


    // $ANTLR start "ruleRe"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2027:1: ruleRe returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleRe() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2030:28: ( (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2031:1: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2031:1: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2031:6: this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRe4216); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getReAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2038:1: (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2039:2: kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleRe4235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReAccess().getLeftParenthesisKeyword_1_0()); 
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2044:1: (this_ID_2= RULE_ID this_ID_3= RULE_ID )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2044:6: this_ID_2= RULE_ID this_ID_3= RULE_ID
                            {
                            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRe4251); 

                            		current.merge(this_ID_2);
                                
                             
                                newLeafNode(this_ID_2, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_0()); 
                                
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRe4271); 

                            		current.merge(this_ID_3);
                                
                             
                                newLeafNode(this_ID_3, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,57,FOLLOW_57_in_ruleRe4291); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReAccess().getRightParenthesisKeyword_1_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRe"


    // $ANTLR start "entryRuleRelationalQuery"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2072:1: entryRuleRelationalQuery returns [EObject current=null] : iv_ruleRelationalQuery= ruleRelationalQuery EOF ;
    public final EObject entryRuleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalQuery = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2073:2: (iv_ruleRelationalQuery= ruleRelationalQuery EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2074:2: iv_ruleRelationalQuery= ruleRelationalQuery EOF
            {
             newCompositeNode(grammarAccess.getRelationalQueryRule()); 
            pushFollow(FOLLOW_ruleRelationalQuery_in_entryRuleRelationalQuery4333);
            iv_ruleRelationalQuery=ruleRelationalQuery();

            state._fsp--;

             current =iv_ruleRelationalQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalQuery4343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalQuery"


    // $ANTLR start "ruleRelationalQuery"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2081:1: ruleRelationalQuery returns [EObject current=null] : (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) ;
    public final EObject ruleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject this_Query1_0 = null;

        EObject this_Query2_1 = null;

        EObject this_Query3_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2084:28: ( (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2085:1: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2085:1: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2086:5: this_Query1_0= ruleQuery1
                    {
                     
                            newCompositeNode(grammarAccess.getRelationalQueryAccess().getQuery1ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQuery1_in_ruleRelationalQuery4390);
                    this_Query1_0=ruleQuery1();

                    state._fsp--;

                     
                            current = this_Query1_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2096:5: this_Query2_1= ruleQuery2
                    {
                     
                            newCompositeNode(grammarAccess.getRelationalQueryAccess().getQuery2ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuery2_in_ruleRelationalQuery4417);
                    this_Query2_1=ruleQuery2();

                    state._fsp--;

                     
                            current = this_Query2_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2106:5: this_Query3_2= ruleQuery3
                    {
                     
                            newCompositeNode(grammarAccess.getRelationalQueryAccess().getQuery3ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleQuery3_in_ruleRelationalQuery4444);
                    this_Query3_2=ruleQuery3();

                    state._fsp--;

                     
                            current = this_Query3_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalQuery"


    // $ANTLR start "entryRuleQuery1"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2122:1: entryRuleQuery1 returns [EObject current=null] : iv_ruleQuery1= ruleQuery1 EOF ;
    public final EObject entryRuleQuery1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery1 = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2123:2: (iv_ruleQuery1= ruleQuery1 EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2124:2: iv_ruleQuery1= ruleQuery1 EOF
            {
             newCompositeNode(grammarAccess.getQuery1Rule()); 
            pushFollow(FOLLOW_ruleQuery1_in_entryRuleQuery14479);
            iv_ruleQuery1=ruleQuery1();

            state._fsp--;

             current =iv_ruleQuery1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery14489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery1"


    // $ANTLR start "ruleQuery1"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2131:1: ruleQuery1 returns [EObject current=null] : (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) ;
    public final EObject ruleQuery1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_factor_1_0=null;
        Token lv_control_2_0=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_start1_8_0=null;
        Token otherlv_9=null;
        Token lv_end1_10_0=null;
        Token otherlv_11=null;
        Token lv_response_12_0=null;
        Token otherlv_13=null;
        Token lv_y_14_0=null;
        Token otherlv_15=null;
        Token lv_start2_16_0=null;
        Token otherlv_17=null;
        Token lv_end2_18_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2134:28: ( (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2135:1: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2135:1: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2135:3: otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleQuery14526); 

                	newLeafNode(otherlv_0, grammarAccess.getQuery1Access().getIfKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2139:1: ( (lv_factor_1_0= RULE_ID ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2140:1: (lv_factor_1_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2140:1: (lv_factor_1_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2141:3: lv_factor_1_0= RULE_ID
                    {
                    lv_factor_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery14543); 

                    			newLeafNode(lv_factor_1_0, grammarAccess.getQuery1Access().getFactorIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"factor",
                            		lv_factor_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2157:3: ( (lv_control_2_0= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2158:1: (lv_control_2_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2158:1: (lv_control_2_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2159:3: lv_control_2_0= RULE_ID
                    {
                    lv_control_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery14566); 

                    			newLeafNode(lv_control_2_0, grammarAccess.getQuery1Access().getControlIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"control",
                            		lv_control_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleQuery14584); 

                	newLeafNode(otherlv_3, grammarAccess.getQuery1Access().getIsKeyword_3());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2179:1: ( (lv_x_4_0= RULE_RANGEVALUE ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_RANGEVALUE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2180:1: (lv_x_4_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2180:1: (lv_x_4_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2181:3: lv_x_4_0= RULE_RANGEVALUE
                    {
                    lv_x_4_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery14601); 

                    			newLeafNode(lv_x_4_0, grammarAccess.getQuery1Access().getXRangeValueTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"x",
                            		lv_x_4_0, 
                            		"rangeValue");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2197:3: (otherlv_5= 'added' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2197:5: otherlv_5= 'added'
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleQuery14620); 

                        	newLeafNode(otherlv_5, grammarAccess.getQuery1Access().getAddedKeyword_5());
                        

                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2201:3: (otherlv_6= 'removed' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==63) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2201:5: otherlv_6= 'removed'
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleQuery14635); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuery1Access().getRemovedKeyword_6());
                        

                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2205:3: (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==64) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2205:5: otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_64_in_ruleQuery14650); 

                        	newLeafNode(otherlv_7, grammarAccess.getQuery1Access().getInTheRangeKeyword_7_0());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2209:1: ( (lv_start1_8_0= RULE_RANGEVALUE ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2210:1: (lv_start1_8_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2210:1: (lv_start1_8_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2211:3: lv_start1_8_0= RULE_RANGEVALUE
                    {
                    lv_start1_8_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery14667); 

                    			newLeafNode(lv_start1_8_0, grammarAccess.getQuery1Access().getStart1RangeValueTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"start1",
                            		lv_start1_8_0, 
                            		"rangeValue");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,65,FOLLOW_65_in_ruleQuery14684); 

                        	newLeafNode(otherlv_9, grammarAccess.getQuery1Access().getToKeyword_7_2());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2231:1: ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2232:1: (lv_end1_10_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2232:1: (lv_end1_10_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2233:3: lv_end1_10_0= RULE_RANGEVALUE
                    {
                    lv_end1_10_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery14701); 

                    			newLeafNode(lv_end1_10_0, grammarAccess.getQuery1Access().getEnd1RangeValueTerminalRuleCall_7_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"end1",
                            		lv_end1_10_0, 
                            		"rangeValue");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,66,FOLLOW_66_in_ruleQuery14720); 

                	newLeafNode(otherlv_11, grammarAccess.getQuery1Access().getThenKeyword_8());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2253:1: ( (lv_response_12_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2254:1: (lv_response_12_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2254:1: (lv_response_12_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2255:3: lv_response_12_0= RULE_ID
            {
            lv_response_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery14737); 

            			newLeafNode(lv_response_12_0, grammarAccess.getQuery1Access().getResponseIDTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuery1Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"response",
                    		lv_response_12_0, 
                    		"ID");
            	    

            }


            }

            otherlv_13=(Token)match(input,61,FOLLOW_61_in_ruleQuery14754); 

                	newLeafNode(otherlv_13, grammarAccess.getQuery1Access().getIsKeyword_10());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2275:1: ( (lv_y_14_0= RULE_RANGEVALUE ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_RANGEVALUE) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2276:1: (lv_y_14_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2276:1: (lv_y_14_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2277:3: lv_y_14_0= RULE_RANGEVALUE
                    {
                    lv_y_14_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery14771); 

                    			newLeafNode(lv_y_14_0, grammarAccess.getQuery1Access().getYRangeValueTerminalRuleCall_11_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"y",
                            		lv_y_14_0, 
                            		"rangeValue");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2293:3: (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==64) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2293:5: otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_15=(Token)match(input,64,FOLLOW_64_in_ruleQuery14790); 

                        	newLeafNode(otherlv_15, grammarAccess.getQuery1Access().getInTheRangeKeyword_12_0());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2297:1: ( (lv_start2_16_0= RULE_RANGEVALUE ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2298:1: (lv_start2_16_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2298:1: (lv_start2_16_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2299:3: lv_start2_16_0= RULE_RANGEVALUE
                    {
                    lv_start2_16_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery14807); 

                    			newLeafNode(lv_start2_16_0, grammarAccess.getQuery1Access().getStart2RangeValueTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"start2",
                            		lv_start2_16_0, 
                            		"rangeValue");
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,65,FOLLOW_65_in_ruleQuery14824); 

                        	newLeafNode(otherlv_17, grammarAccess.getQuery1Access().getToKeyword_12_2());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2319:1: ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2320:1: (lv_end2_18_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2320:1: (lv_end2_18_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2321:3: lv_end2_18_0= RULE_RANGEVALUE
                    {
                    lv_end2_18_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery14841); 

                    			newLeafNode(lv_end2_18_0, grammarAccess.getQuery1Access().getEnd2RangeValueTerminalRuleCall_12_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"end2",
                            		lv_end2_18_0, 
                            		"rangeValue");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery1"


    // $ANTLR start "entryRuleQuery2"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2345:1: entryRuleQuery2 returns [EObject current=null] : iv_ruleQuery2= ruleQuery2 EOF ;
    public final EObject entryRuleQuery2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery2 = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2346:2: (iv_ruleQuery2= ruleQuery2 EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2347:2: iv_ruleQuery2= ruleQuery2 EOF
            {
             newCompositeNode(grammarAccess.getQuery2Rule()); 
            pushFollow(FOLLOW_ruleQuery2_in_entryRuleQuery24884);
            iv_ruleQuery2=ruleQuery2();

            state._fsp--;

             current =iv_ruleQuery2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery24894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery2"


    // $ANTLR start "ruleQuery2"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2354:1: ruleQuery2 returns [EObject current=null] : (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) ;
    public final EObject ruleQuery2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_response1_2_0=null;
        Token lv_factor1_3_0=null;
        Token otherlv_4=null;
        Token lv_response2_6_0=null;
        Token lv_factor2_7_0=null;
        Enumerator lv_function1_1_0 = null;

        Enumerator lv_function2_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2357:28: ( (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2358:1: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2358:1: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2358:3: otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleQuery24931); 

                	newLeafNode(otherlv_0, grammarAccess.getQuery2Access().getCompareKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2362:1: ( (lv_function1_1_0= ruleFunction ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=116 && LA58_0<=124)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2363:1: (lv_function1_1_0= ruleFunction )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2363:1: (lv_function1_1_0= ruleFunction )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2364:3: lv_function1_1_0= ruleFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuery2Access().getFunction1FunctionEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunction_in_ruleQuery24952);
                    lv_function1_1_0=ruleFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuery2Rule());
                    	        }
                           		set(
                           			current, 
                           			"function1",
                            		lv_function1_1_0, 
                            		"Function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2380:3: ( (lv_response1_2_0= RULE_ID ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2381:1: (lv_response1_2_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2381:1: (lv_response1_2_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2382:3: lv_response1_2_0= RULE_ID
                    {
                    lv_response1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery24970); 

                    			newLeafNode(lv_response1_2_0, grammarAccess.getQuery2Access().getResponse1IDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery2Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"response1",
                            		lv_response1_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2398:3: ( (lv_factor1_3_0= RULE_ID ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2399:1: (lv_factor1_3_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2399:1: (lv_factor1_3_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2400:3: lv_factor1_3_0= RULE_ID
                    {
                    lv_factor1_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery24993); 

                    			newLeafNode(lv_factor1_3_0, grammarAccess.getQuery2Access().getFactor1IDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery2Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"factor1",
                            		lv_factor1_3_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleQuery25011); 

                	newLeafNode(otherlv_4, grammarAccess.getQuery2Access().getAndKeyword_4());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2420:1: ( (lv_function2_5_0= ruleFunction ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=116 && LA61_0<=124)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2421:1: (lv_function2_5_0= ruleFunction )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2421:1: (lv_function2_5_0= ruleFunction )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2422:3: lv_function2_5_0= ruleFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuery2Access().getFunction2FunctionEnumRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunction_in_ruleQuery25032);
                    lv_function2_5_0=ruleFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuery2Rule());
                    	        }
                           		set(
                           			current, 
                           			"function2",
                            		lv_function2_5_0, 
                            		"Function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2438:3: ( (lv_response2_6_0= RULE_ID ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2439:1: (lv_response2_6_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2439:1: (lv_response2_6_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2440:3: lv_response2_6_0= RULE_ID
                    {
                    lv_response2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery25050); 

                    			newLeafNode(lv_response2_6_0, grammarAccess.getQuery2Access().getResponse2IDTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery2Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"response2",
                            		lv_response2_6_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2456:3: ( (lv_factor2_7_0= RULE_ID ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2457:1: (lv_factor2_7_0= RULE_ID )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2457:1: (lv_factor2_7_0= RULE_ID )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2458:3: lv_factor2_7_0= RULE_ID
                    {
                    lv_factor2_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery25073); 

                    			newLeafNode(lv_factor2_7_0, grammarAccess.getQuery2Access().getFactor2IDTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuery2Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"factor2",
                            		lv_factor2_7_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery2"


    // $ANTLR start "entryRuleQuery3"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2482:1: entryRuleQuery3 returns [EObject current=null] : iv_ruleQuery3= ruleQuery3 EOF ;
    public final EObject entryRuleQuery3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery3 = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2483:2: (iv_ruleQuery3= ruleQuery3 EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2484:2: iv_ruleQuery3= ruleQuery3 EOF
            {
             newCompositeNode(grammarAccess.getQuery3Rule()); 
            pushFollow(FOLLOW_ruleQuery3_in_entryRuleQuery35115);
            iv_ruleQuery3=ruleQuery3();

            state._fsp--;

             current =iv_ruleQuery3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery35125); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery3"


    // $ANTLR start "ruleQuery3"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2491:1: ruleQuery3 returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) ;
    public final EObject ruleQuery3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_factor1_1_0=null;
        Token lv_control1_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_x2_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_response1_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_x4_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_factor_20_0=null;
        Token lv_control_21_0=null;
        Token lv_response_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_start1_25_0=null;
        Token otherlv_26=null;
        Token lv_end1_27_0=null;
        Enumerator lv_Level2_6_0 = null;

        Enumerator lv_Level4_14_0 = null;

        Enumerator lv_level_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2494:28: ( (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2495:1: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2495:1: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2495:3: otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleQuery35162); 

                	newLeafNode(otherlv_0, grammarAccess.getQuery3Access().getIfKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2499:1: ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID||LA69_0==61) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2499:2: ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )?
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2499:2: ( (lv_factor1_1_0= RULE_ID ) )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_ID) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2500:1: (lv_factor1_1_0= RULE_ID )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2500:1: (lv_factor1_1_0= RULE_ID )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2501:3: lv_factor1_1_0= RULE_ID
            	            {
            	            lv_factor1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery35180); 

            	            			newLeafNode(lv_factor1_1_0, grammarAccess.getQuery3Access().getFactor1IDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"factor1",
            	                    		lv_factor1_1_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2517:3: ( (lv_control1_2_0= RULE_ID ) )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_ID) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2518:1: (lv_control1_2_0= RULE_ID )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2518:1: (lv_control1_2_0= RULE_ID )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2519:3: lv_control1_2_0= RULE_ID
            	            {
            	            lv_control1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery35203); 

            	            			newLeafNode(lv_control1_2_0, grammarAccess.getQuery3Access().getControl1IDTerminalRuleCall_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"control1",
            	                    		lv_control1_2_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleQuery35221); 

            	        	newLeafNode(otherlv_3, grammarAccess.getQuery3Access().getIsKeyword_1_2());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2539:1: (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==69) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2539:3: otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) )
            	            {
            	            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleQuery35234); 

            	                	newLeafNode(otherlv_4, grammarAccess.getQuery3Access().getAtKeyword_1_3_0());
            	                
            	            otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleQuery35246); 

            	                	newLeafNode(otherlv_5, grammarAccess.getQuery3Access().getLevelKeyword_1_3_1());
            	                
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2547:1: ( (lv_Level2_6_0= ruleLevels ) )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2548:1: (lv_Level2_6_0= ruleLevels )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2548:1: (lv_Level2_6_0= ruleLevels )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2549:3: lv_Level2_6_0= ruleLevels
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getQuery3Access().getLevel2LevelsEnumRuleCall_1_3_2_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLevels_in_ruleQuery35267);
            	            lv_Level2_6_0=ruleLevels();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"Level2",
            	                    		lv_Level2_6_0, 
            	                    		"Levels");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2565:4: ( (lv_x2_7_0= RULE_RANGEVALUE ) )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==RULE_RANGEVALUE) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2566:1: (lv_x2_7_0= RULE_RANGEVALUE )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2566:1: (lv_x2_7_0= RULE_RANGEVALUE )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2567:3: lv_x2_7_0= RULE_RANGEVALUE
            	            {
            	            lv_x2_7_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery35286); 

            	            			newLeafNode(lv_x2_7_0, grammarAccess.getQuery3Access().getX2RangeValueTerminalRuleCall_1_4_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"x2",
            	                    		lv_x2_7_0, 
            	                    		"rangeValue");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2583:3: (otherlv_8= 'and' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==68) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2583:5: otherlv_8= 'and'
            	            {
            	            otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleQuery35305); 

            	                	newLeafNode(otherlv_8, grammarAccess.getQuery3Access().getAndKeyword_1_5());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_9=(Token)match(input,66,FOLLOW_66_in_ruleQuery35321); 

                	newLeafNode(otherlv_9, grammarAccess.getQuery3Access().getThenKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2591:1: ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2591:2: ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )?
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2591:2: ( (lv_response1_10_0= RULE_ID ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2592:1: (lv_response1_10_0= RULE_ID )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2592:1: (lv_response1_10_0= RULE_ID )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2593:3: lv_response1_10_0= RULE_ID
            	    {
            	    lv_response1_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery35339); 

            	    			newLeafNode(lv_response1_10_0, grammarAccess.getQuery3Access().getResponse1IDTerminalRuleCall_3_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuery3Rule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"response1",
            	            		lv_response1_10_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,61,FOLLOW_61_in_ruleQuery35356); 

            	        	newLeafNode(otherlv_11, grammarAccess.getQuery3Access().getIsKeyword_3_1());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2613:1: (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==69) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2613:3: otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) )
            	            {
            	            otherlv_12=(Token)match(input,69,FOLLOW_69_in_ruleQuery35369); 

            	                	newLeafNode(otherlv_12, grammarAccess.getQuery3Access().getAtKeyword_3_2_0());
            	                
            	            otherlv_13=(Token)match(input,70,FOLLOW_70_in_ruleQuery35381); 

            	                	newLeafNode(otherlv_13, grammarAccess.getQuery3Access().getLevelKeyword_3_2_1());
            	                
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2621:1: ( (lv_Level4_14_0= ruleLevels ) )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2622:1: (lv_Level4_14_0= ruleLevels )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2622:1: (lv_Level4_14_0= ruleLevels )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2623:3: lv_Level4_14_0= ruleLevels
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getQuery3Access().getLevel4LevelsEnumRuleCall_3_2_2_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLevels_in_ruleQuery35402);
            	            lv_Level4_14_0=ruleLevels();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"Level4",
            	                    		lv_Level4_14_0, 
            	                    		"Levels");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2639:4: ( (lv_x4_15_0= RULE_RANGEVALUE ) )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_RANGEVALUE) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2640:1: (lv_x4_15_0= RULE_RANGEVALUE )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2640:1: (lv_x4_15_0= RULE_RANGEVALUE )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2641:3: lv_x4_15_0= RULE_RANGEVALUE
            	            {
            	            lv_x4_15_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery35421); 

            	            			newLeafNode(lv_x4_15_0, grammarAccess.getQuery3Access().getX4RangeValueTerminalRuleCall_3_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"x4",
            	                    		lv_x4_15_0, 
            	                    		"rangeValue");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2657:3: (otherlv_16= 'and' )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==68) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2657:5: otherlv_16= 'and'
            	            {
            	            otherlv_16=(Token)match(input,68,FOLLOW_68_in_ruleQuery35440); 

            	                	newLeafNode(otherlv_16, grammarAccess.getQuery3Access().getAndKeyword_3_4());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_17=(Token)match(input,71,FOLLOW_71_in_ruleQuery35456); 

                	newLeafNode(otherlv_17, grammarAccess.getQuery3Access().getWhereKeyword_4());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2665:1: ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=125 && LA77_0<=127)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2665:2: ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2665:2: ( (lv_level_18_0= ruleLevels ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2666:1: (lv_level_18_0= ruleLevels )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2666:1: (lv_level_18_0= ruleLevels )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2667:3: lv_level_18_0= ruleLevels
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuery3Access().getLevelLevelsEnumRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLevels_in_ruleQuery35478);
            	    lv_level_18_0=ruleLevels();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"level",
            	            		lv_level_18_0, 
            	            		"Levels");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,72,FOLLOW_72_in_ruleQuery35490); 

            	        	newLeafNode(otherlv_19, grammarAccess.getQuery3Access().getForKeyword_5_1());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2687:1: ( (lv_factor_20_0= RULE_ID ) )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==RULE_ID) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2688:1: (lv_factor_20_0= RULE_ID )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2688:1: (lv_factor_20_0= RULE_ID )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2689:3: lv_factor_20_0= RULE_ID
            	            {
            	            lv_factor_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery35507); 

            	            			newLeafNode(lv_factor_20_0, grammarAccess.getQuery3Access().getFactorIDTerminalRuleCall_5_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"factor",
            	                    		lv_factor_20_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2705:3: ( (lv_control_21_0= RULE_ID ) )?
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==RULE_ID) ) {
            	        alt75=1;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2706:1: (lv_control_21_0= RULE_ID )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2706:1: (lv_control_21_0= RULE_ID )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2707:3: lv_control_21_0= RULE_ID
            	            {
            	            lv_control_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery35530); 

            	            			newLeafNode(lv_control_21_0, grammarAccess.getQuery3Access().getControlIDTerminalRuleCall_5_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"control",
            	                    		lv_control_21_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2723:3: ( (lv_response_22_0= RULE_ID ) )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==RULE_ID) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2724:1: (lv_response_22_0= RULE_ID )
            	            {
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2724:1: (lv_response_22_0= RULE_ID )
            	            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2725:3: lv_response_22_0= RULE_ID
            	            {
            	            lv_response_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery35553); 

            	            			newLeafNode(lv_response_22_0, grammarAccess.getQuery3Access().getResponseIDTerminalRuleCall_5_4_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getQuery3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"response",
            	                    		lv_response_22_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_23=(Token)match(input,61,FOLLOW_61_in_ruleQuery35571); 

            	        	newLeafNode(otherlv_23, grammarAccess.getQuery3Access().getIsKeyword_5_5());
            	        
            	    otherlv_24=(Token)match(input,64,FOLLOW_64_in_ruleQuery35583); 

            	        	newLeafNode(otherlv_24, grammarAccess.getQuery3Access().getInTheRangeKeyword_5_6());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2749:1: ( (lv_start1_25_0= RULE_RANGEVALUE ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2750:1: (lv_start1_25_0= RULE_RANGEVALUE )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2750:1: (lv_start1_25_0= RULE_RANGEVALUE )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2751:3: lv_start1_25_0= RULE_RANGEVALUE
            	    {
            	    lv_start1_25_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery35600); 

            	    			newLeafNode(lv_start1_25_0, grammarAccess.getQuery3Access().getStart1RangeValueTerminalRuleCall_5_7_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuery3Rule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"start1",
            	            		lv_start1_25_0, 
            	            		"rangeValue");
            	    	    

            	    }


            	    }

            	    otherlv_26=(Token)match(input,65,FOLLOW_65_in_ruleQuery35617); 

            	        	newLeafNode(otherlv_26, grammarAccess.getQuery3Access().getToKeyword_5_8());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2771:1: ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2772:1: (lv_end1_27_0= RULE_RANGEVALUE )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2772:1: (lv_end1_27_0= RULE_RANGEVALUE )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2773:3: lv_end1_27_0= RULE_RANGEVALUE
            	    {
            	    lv_end1_27_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleQuery35634); 

            	    			newLeafNode(lv_end1_27_0, grammarAccess.getQuery3Access().getEnd1RangeValueTerminalRuleCall_5_9_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuery3Rule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"end1",
            	            		lv_end1_27_0, 
            	            		"rangeValue");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery3"


    // $ANTLR start "entryRuleExperiment"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2797:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2798:2: (iv_ruleExperiment= ruleExperiment EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2799:2: iv_ruleExperiment= ruleExperiment EOF
            {
             newCompositeNode(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_ruleExperiment_in_entryRuleExperiment5677);
            iv_ruleExperiment=ruleExperiment();

            state._fsp--;

             current =iv_ruleExperiment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperiment5687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2806:1: ruleExperiment returns [EObject current=null] : (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expDesign_4_0 = null;

        EObject lv_perfMeasure_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2809:28: ( (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2810:1: (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2810:1: (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2810:3: otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleExperiment5724); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentAccess().getExperimentKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2814:1: ( (lv_expName_1_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2815:1: (lv_expName_1_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2815:1: (lv_expName_1_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2816:3: lv_expName_1_0= RULE_ID
            {
            lv_expName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperiment5741); 

            			newLeafNode(lv_expName_1_0, grammarAccess.getExperimentAccess().getExpNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expName",
                    		lv_expName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExperiment5758); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleExperiment5770); 

                	newLeafNode(otherlv_3, grammarAccess.getExperimentAccess().getDesignKeyword_3());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2840:1: ( (lv_expDesign_4_0= ruleDesign ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2841:1: (lv_expDesign_4_0= ruleDesign )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2841:1: (lv_expDesign_4_0= ruleDesign )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2842:3: lv_expDesign_4_0= ruleDesign
            {
             
            	        newCompositeNode(grammarAccess.getExperimentAccess().getExpDesignDesignParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDesign_in_ruleExperiment5791);
            lv_expDesign_4_0=ruleDesign();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentRule());
            	        }
                   		set(
                   			current, 
                   			"expDesign",
                    		lv_expDesign_4_0, 
                    		"Design");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleExperiment5803); 

                	newLeafNode(otherlv_5, grammarAccess.getExperimentAccess().getPerformanceMeasureKeyword_5());
                
            otherlv_6=(Token)match(input,61,FOLLOW_61_in_ruleExperiment5815); 

                	newLeafNode(otherlv_6, grammarAccess.getExperimentAccess().getIsKeyword_6());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2866:1: ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2867:1: (lv_perfMeasure_7_0= rulePerformanceMeasure )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2867:1: (lv_perfMeasure_7_0= rulePerformanceMeasure )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2868:3: lv_perfMeasure_7_0= rulePerformanceMeasure
            {
             
            	        newCompositeNode(grammarAccess.getExperimentAccess().getPerfMeasurePerformanceMeasureParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_rulePerformanceMeasure_in_ruleExperiment5836);
            lv_perfMeasure_7_0=rulePerformanceMeasure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentRule());
            	        }
                   		set(
                   			current, 
                   			"perfMeasure",
                    		lv_perfMeasure_7_0, 
                    		"PerformanceMeasure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleExperiment5848); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "entryRuleDesign"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2896:1: entryRuleDesign returns [EObject current=null] : iv_ruleDesign= ruleDesign EOF ;
    public final EObject entryRuleDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesign = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2897:2: (iv_ruleDesign= ruleDesign EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2898:2: iv_ruleDesign= ruleDesign EOF
            {
             newCompositeNode(grammarAccess.getDesignRule()); 
            pushFollow(FOLLOW_ruleDesign_in_entryRuleDesign5884);
            iv_ruleDesign=ruleDesign();

            state._fsp--;

             current =iv_ruleDesign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesign5894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesign"


    // $ANTLR start "ruleDesign"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2905:1: ruleDesign returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_constraint_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_designType_2_0 = null;

        EObject lv_iteration_5_0 = null;

        EObject lv_variables_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2908:28: ( (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2909:1: (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2909:1: (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2909:3: otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDesign5931); 

                	newLeafNode(otherlv_0, grammarAccess.getDesignAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2913:1: (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==76) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2913:3: otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) )
                    {
                    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleDesign5944); 

                        	newLeafNode(otherlv_1, grammarAccess.getDesignAccess().getDesignTypeKeyword_1_0());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2917:1: ( (lv_designType_2_0= ruleDesignType ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2918:1: (lv_designType_2_0= ruleDesignType )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2918:1: (lv_designType_2_0= ruleDesignType )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2919:3: lv_designType_2_0= ruleDesignType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesignAccess().getDesignTypeDesignTypeEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDesignType_in_ruleDesign5965);
                    lv_designType_2_0=ruleDesignType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDesignRule());
                    	        }
                           		set(
                           			current, 
                           			"designType",
                            		lv_designType_2_0, 
                            		"DesignType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2935:4: (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==77) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2935:6: otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,77,FOLLOW_77_in_ruleDesign5980); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDesignAccess().getConstraintsKeyword_2_0());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2939:1: ( (lv_constraint_4_0= RULE_ID ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2940:1: (lv_constraint_4_0= RULE_ID )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2940:1: (lv_constraint_4_0= RULE_ID )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2941:3: lv_constraint_4_0= RULE_ID
            	    {
            	    lv_constraint_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDesign5997); 

            	    			newLeafNode(lv_constraint_4_0, grammarAccess.getDesignAccess().getConstraintIDTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDesignRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"constraint",
            	            		lv_constraint_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2957:4: ( (lv_iteration_5_0= ruleIteration ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==85) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2958:1: (lv_iteration_5_0= ruleIteration )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2958:1: (lv_iteration_5_0= ruleIteration )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2959:3: lv_iteration_5_0= ruleIteration
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesignAccess().getIterationIterationParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIteration_in_ruleDesign6025);
                    lv_iteration_5_0=ruleIteration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDesignRule());
                    	        }
                           		set(
                           			current, 
                           			"iteration",
                            		lv_iteration_5_0, 
                            		"Iteration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2975:3: (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2975:5: otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) )
            {
            otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleDesign6039); 

                	newLeafNode(otherlv_6, grammarAccess.getDesignAccess().getVariablesKeyword_4_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2979:1: ( (lv_variables_7_0= ruleVariables ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2980:1: (lv_variables_7_0= ruleVariables )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2980:1: (lv_variables_7_0= ruleVariables )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:2981:3: lv_variables_7_0= ruleVariables
            {
             
            	        newCompositeNode(grammarAccess.getDesignAccess().getVariablesVariablesParserRuleCall_4_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariables_in_ruleDesign6060);
            lv_variables_7_0=ruleVariables();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesignRule());
            	        }
                   		set(
                   			current, 
                   			"variables",
                    		lv_variables_7_0, 
                    		"Variables");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDesign6073); 

                	newLeafNode(otherlv_8, grammarAccess.getDesignAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesign"


    // $ANTLR start "entryRuleVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3009:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3010:2: (iv_ruleVariables= ruleVariables EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3011:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables6109);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables6119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3018:1: ruleVariables returns [EObject current=null] : (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_independentVariables_1_0 = null;

        EObject lv_controlVariables_2_0 = null;

        EObject lv_dependentVariables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3021:28: ( (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3022:1: (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3022:1: (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3022:3: otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleVariables6156); 

                	newLeafNode(otherlv_0, grammarAccess.getVariablesAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3026:1: ( (lv_independentVariables_1_0= ruleIndependentVariables ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3027:1: (lv_independentVariables_1_0= ruleIndependentVariables )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3027:1: (lv_independentVariables_1_0= ruleIndependentVariables )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3028:3: lv_independentVariables_1_0= ruleIndependentVariables
            {
             
            	        newCompositeNode(grammarAccess.getVariablesAccess().getIndependentVariablesIndependentVariablesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIndependentVariables_in_ruleVariables6177);
            lv_independentVariables_1_0=ruleIndependentVariables();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariablesRule());
            	        }
                   		set(
                   			current, 
                   			"independentVariables",
                    		lv_independentVariables_1_0, 
                    		"IndependentVariables");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3044:2: ( (lv_controlVariables_2_0= ruleControlVariables ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==80) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3045:1: (lv_controlVariables_2_0= ruleControlVariables )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3045:1: (lv_controlVariables_2_0= ruleControlVariables )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3046:3: lv_controlVariables_2_0= ruleControlVariables
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesAccess().getControlVariablesControlVariablesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleControlVariables_in_ruleVariables6198);
                    lv_controlVariables_2_0=ruleControlVariables();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesRule());
                    	        }
                           		set(
                           			current, 
                           			"controlVariables",
                            		lv_controlVariables_2_0, 
                            		"ControlVariables");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3062:3: ( (lv_dependentVariables_3_0= ruleDependentVariables ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3063:1: (lv_dependentVariables_3_0= ruleDependentVariables )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3063:1: (lv_dependentVariables_3_0= ruleDependentVariables )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3064:3: lv_dependentVariables_3_0= ruleDependentVariables
            {
             
            	        newCompositeNode(grammarAccess.getVariablesAccess().getDependentVariablesDependentVariablesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDependentVariables_in_ruleVariables6220);
            lv_dependentVariables_3_0=ruleDependentVariables();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariablesRule());
            	        }
                   		set(
                   			current, 
                   			"dependentVariables",
                    		lv_dependentVariables_3_0, 
                    		"DependentVariables");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleVariables6232); 

                	newLeafNode(otherlv_4, grammarAccess.getVariablesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleIndependentVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3092:1: entryRuleIndependentVariables returns [EObject current=null] : iv_ruleIndependentVariables= ruleIndependentVariables EOF ;
    public final EObject entryRuleIndependentVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndependentVariables = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3093:2: (iv_ruleIndependentVariables= ruleIndependentVariables EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3094:2: iv_ruleIndependentVariables= ruleIndependentVariables EOF
            {
             newCompositeNode(grammarAccess.getIndependentVariablesRule()); 
            pushFollow(FOLLOW_ruleIndependentVariables_in_entryRuleIndependentVariables6268);
            iv_ruleIndependentVariables=ruleIndependentVariables();

            state._fsp--;

             current =iv_ruleIndependentVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndependentVariables6278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndependentVariables"


    // $ANTLR start "ruleIndependentVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3101:1: ruleIndependentVariables returns [EObject current=null] : (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' ) ;
    public final EObject ruleIndependentVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3104:28: ( (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3105:1: (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3105:1: (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3105:3: otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleIndependentVariables6315); 

                	newLeafNode(otherlv_0, grammarAccess.getIndependentVariablesAccess().getIndependentKeyword_0());
                
            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleIndependentVariables6327); 

                	newLeafNode(otherlv_1, grammarAccess.getIndependentVariablesAccess().getVariablesKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIndependentVariables6339); 

                	newLeafNode(otherlv_2, grammarAccess.getIndependentVariablesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3117:1: ( (lv_variables_3_0= ruleFactorLevels ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_ID) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3118:1: (lv_variables_3_0= ruleFactorLevels )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3118:1: (lv_variables_3_0= ruleFactorLevels )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3119:3: lv_variables_3_0= ruleFactorLevels
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndependentVariablesAccess().getVariablesFactorLevelsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactorLevels_in_ruleIndependentVariables6360);
            	    lv_variables_3_0=ruleFactorLevels();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIndependentVariablesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"FactorLevels");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleIndependentVariables6373); 

                	newLeafNode(otherlv_4, grammarAccess.getIndependentVariablesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndependentVariables"


    // $ANTLR start "entryRuleControlVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3147:1: entryRuleControlVariables returns [EObject current=null] : iv_ruleControlVariables= ruleControlVariables EOF ;
    public final EObject entryRuleControlVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlVariables = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3148:2: (iv_ruleControlVariables= ruleControlVariables EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3149:2: iv_ruleControlVariables= ruleControlVariables EOF
            {
             newCompositeNode(grammarAccess.getControlVariablesRule()); 
            pushFollow(FOLLOW_ruleControlVariables_in_entryRuleControlVariables6409);
            iv_ruleControlVariables=ruleControlVariables();

            state._fsp--;

             current =iv_ruleControlVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlVariables6419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlVariables"


    // $ANTLR start "ruleControlVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3156:1: ruleControlVariables returns [EObject current=null] : (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleControlVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_controlName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_controlType_6_0 = null;

        EObject lv_controlValue_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3159:28: ( (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3160:1: (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3160:1: (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3160:3: otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleControlVariables6456); 

                	newLeafNode(otherlv_0, grammarAccess.getControlVariablesAccess().getControlKeyword_0());
                
            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleControlVariables6468); 

                	newLeafNode(otherlv_1, grammarAccess.getControlVariablesAccess().getVariablesKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleControlVariables6480); 

                	newLeafNode(otherlv_2, grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3172:1: ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_ID) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3172:2: ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3172:2: ( (lv_controlName_3_0= RULE_ID ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3173:1: (lv_controlName_3_0= RULE_ID )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3173:1: (lv_controlName_3_0= RULE_ID )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3174:3: lv_controlName_3_0= RULE_ID
            	    {
            	    lv_controlName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlVariables6498); 

            	    			newLeafNode(lv_controlName_3_0, grammarAccess.getControlVariablesAccess().getControlNameIDTerminalRuleCall_3_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getControlVariablesRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"controlName",
            	            		lv_controlName_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleControlVariables6515); 

            	        	newLeafNode(otherlv_4, grammarAccess.getControlVariablesAccess().getColonKeyword_3_1());
            	        
            	    otherlv_5=(Token)match(input,81,FOLLOW_81_in_ruleControlVariables6527); 

            	        	newLeafNode(otherlv_5, grammarAccess.getControlVariablesAccess().getTypeKeyword_3_2());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3198:1: ( (lv_controlType_6_0= ruleVariableType ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3199:1: (lv_controlType_6_0= ruleVariableType )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3199:1: (lv_controlType_6_0= ruleVariableType )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3200:3: lv_controlType_6_0= ruleVariableType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getControlVariablesAccess().getControlTypeVariableTypeEnumRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableType_in_ruleControlVariables6548);
            	    lv_controlType_6_0=ruleVariableType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getControlVariablesRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"controlType",
            	            		lv_controlType_6_0, 
            	            		"VariableType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleControlVariables6560); 

            	        	newLeafNode(otherlv_7, grammarAccess.getControlVariablesAccess().getWithKeyword_3_4());
            	        
            	    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleControlVariables6572); 

            	        	newLeafNode(otherlv_8, grammarAccess.getControlVariablesAccess().getValuesKeyword_3_5());
            	        
            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleControlVariables6584); 

            	        	newLeafNode(otherlv_9, grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_3_6());
            	        
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3228:1: ( (lv_controlValue_10_0= ruleValues ) )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3229:1: (lv_controlValue_10_0= ruleValues )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3229:1: (lv_controlValue_10_0= ruleValues )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3230:3: lv_controlValue_10_0= ruleValues
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getControlVariablesAccess().getControlValueValuesParserRuleCall_3_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValues_in_ruleControlVariables6605);
            	    lv_controlValue_10_0=ruleValues();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getControlVariablesRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"controlValue",
            	            		lv_controlValue_10_0, 
            	            		"Values");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleControlVariables6619); 

                	newLeafNode(otherlv_11, grammarAccess.getControlVariablesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlVariables"


    // $ANTLR start "entryRuleDependentVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3258:1: entryRuleDependentVariables returns [EObject current=null] : iv_ruleDependentVariables= ruleDependentVariables EOF ;
    public final EObject entryRuleDependentVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentVariables = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3259:2: (iv_ruleDependentVariables= ruleDependentVariables EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3260:2: iv_ruleDependentVariables= ruleDependentVariables EOF
            {
             newCompositeNode(grammarAccess.getDependentVariablesRule()); 
            pushFollow(FOLLOW_ruleDependentVariables_in_entryRuleDependentVariables6655);
            iv_ruleDependentVariables=ruleDependentVariables();

            state._fsp--;

             current =iv_ruleDependentVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependentVariables6665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependentVariables"


    // $ANTLR start "ruleDependentVariables"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3267:1: ruleDependentVariables returns [EObject current=null] : (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* ) ;
    public final EObject ruleDependentVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_responseName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3270:28: ( (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3271:1: (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3271:1: (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3271:3: otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )*
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleDependentVariables6702); 

                	newLeafNode(otherlv_0, grammarAccess.getDependentVariablesAccess().getDependentKeyword_0());
                
            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleDependentVariables6714); 

                	newLeafNode(otherlv_1, grammarAccess.getDependentVariablesAccess().getVariablesKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDependentVariables6726); 

                	newLeafNode(otherlv_2, grammarAccess.getDependentVariablesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3283:1: ( (lv_responseName_3_0= ruleResponse ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==RULE_ID) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3284:1: (lv_responseName_3_0= ruleResponse )
            	    {
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3284:1: (lv_responseName_3_0= ruleResponse )
            	    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3285:3: lv_responseName_3_0= ruleResponse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependentVariablesAccess().getResponseNameResponseParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResponse_in_ruleDependentVariables6747);
            	    lv_responseName_3_0=ruleResponse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDependentVariablesRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"responseName",
            	            		lv_responseName_3_0, 
            	            		"Response");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependentVariables"


    // $ANTLR start "entryRuleFactorLevels"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3309:1: entryRuleFactorLevels returns [EObject current=null] : iv_ruleFactorLevels= ruleFactorLevels EOF ;
    public final EObject entryRuleFactorLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorLevels = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3310:2: (iv_ruleFactorLevels= ruleFactorLevels EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3311:2: iv_ruleFactorLevels= ruleFactorLevels EOF
            {
             newCompositeNode(grammarAccess.getFactorLevelsRule()); 
            pushFollow(FOLLOW_ruleFactorLevels_in_entryRuleFactorLevels6784);
            iv_ruleFactorLevels=ruleFactorLevels();

            state._fsp--;

             current =iv_ruleFactorLevels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactorLevels6794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactorLevels"


    // $ANTLR start "ruleFactorLevels"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3318:1: ruleFactorLevels returns [EObject current=null] : ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? ) ;
    public final EObject ruleFactorLevels() throws RecognitionException {
        EObject current = null;

        Token lv_facName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_l_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_start1_11_0=null;
        Token otherlv_12=null;
        Token lv_end1_13_0=null;
        Enumerator lv_l1_6_0 = null;

        Enumerator lv_l2_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3321:28: ( ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3322:1: ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3322:1: ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3322:2: ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )?
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3322:2: ( (lv_facName_0_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3323:1: (lv_facName_0_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3323:1: (lv_facName_0_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3324:3: lv_facName_0_0= RULE_ID
            {
            lv_facName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactorLevels6836); 

            			newLeafNode(lv_facName_0_0, grammarAccess.getFactorLevelsAccess().getFacNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFactorLevelsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"facName",
                    		lv_facName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleFactorLevels6853); 

                	newLeafNode(otherlv_1, grammarAccess.getFactorLevelsAccess().getAreKeyword_1());
                
            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleFactorLevels6865); 

                	newLeafNode(otherlv_2, grammarAccess.getFactorLevelsAccess().getAtKeyword_2());
                
            otherlv_3=(Token)match(input,84,FOLLOW_84_in_ruleFactorLevels6877); 

                	newLeafNode(otherlv_3, grammarAccess.getFactorLevelsAccess().getLevelsKeyword_3());
                
            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleFactorLevels6889); 

                	newLeafNode(otherlv_4, grammarAccess.getFactorLevelsAccess().getColonKeyword_4());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3356:1: ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_FACTORLEVELVALUE) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3357:1: (lv_l_5_0= RULE_FACTORLEVELVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3357:1: (lv_l_5_0= RULE_FACTORLEVELVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3358:3: lv_l_5_0= RULE_FACTORLEVELVALUE
                    {
                    lv_l_5_0=(Token)match(input,RULE_FACTORLEVELVALUE,FOLLOW_RULE_FACTORLEVELVALUE_in_ruleFactorLevels6906); 

                    			newLeafNode(lv_l_5_0, grammarAccess.getFactorLevelsAccess().getLFactorLevelValueTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorLevelsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"l",
                            		lv_l_5_0, 
                            		"factorLevelValue");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3374:3: ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=125 && LA86_0<=127)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3374:4: ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3374:4: ( (lv_l1_6_0= ruleLevels ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3375:1: (lv_l1_6_0= ruleLevels )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3375:1: (lv_l1_6_0= ruleLevels )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3376:3: lv_l1_6_0= ruleLevels
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorLevelsAccess().getL1LevelsEnumRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevels_in_ruleFactorLevels6934);
                    lv_l1_6_0=ruleLevels();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorLevelsRule());
                    	        }
                           		set(
                           			current, 
                           			"l1",
                            		lv_l1_6_0, 
                            		"Levels");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,71,FOLLOW_71_in_ruleFactorLevels6946); 

                        	newLeafNode(otherlv_7, grammarAccess.getFactorLevelsAccess().getWhereKeyword_6_1());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3396:1: ( (lv_l2_8_0= ruleLevels ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3397:1: (lv_l2_8_0= ruleLevels )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3397:1: (lv_l2_8_0= ruleLevels )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3398:3: lv_l2_8_0= ruleLevels
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorLevelsAccess().getL2LevelsEnumRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevels_in_ruleFactorLevels6967);
                    lv_l2_8_0=ruleLevels();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorLevelsRule());
                    	        }
                           		set(
                           			current, 
                           			"l2",
                            		lv_l2_8_0, 
                            		"Levels");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleFactorLevels6979); 

                        	newLeafNode(otherlv_9, grammarAccess.getFactorLevelsAccess().getIsKeyword_6_3());
                        
                    otherlv_10=(Token)match(input,64,FOLLOW_64_in_ruleFactorLevels6991); 

                        	newLeafNode(otherlv_10, grammarAccess.getFactorLevelsAccess().getInTheRangeKeyword_6_4());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3422:1: ( (lv_start1_11_0= RULE_RANGEVALUE ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3423:1: (lv_start1_11_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3423:1: (lv_start1_11_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3424:3: lv_start1_11_0= RULE_RANGEVALUE
                    {
                    lv_start1_11_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleFactorLevels7008); 

                    			newLeafNode(lv_start1_11_0, grammarAccess.getFactorLevelsAccess().getStart1RangeValueTerminalRuleCall_6_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorLevelsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"start1",
                            		lv_start1_11_0, 
                            		"rangeValue");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,65,FOLLOW_65_in_ruleFactorLevels7025); 

                        	newLeafNode(otherlv_12, grammarAccess.getFactorLevelsAccess().getToKeyword_6_6());
                        
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3444:1: ( (lv_end1_13_0= RULE_RANGEVALUE ) )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3445:1: (lv_end1_13_0= RULE_RANGEVALUE )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3445:1: (lv_end1_13_0= RULE_RANGEVALUE )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3446:3: lv_end1_13_0= RULE_RANGEVALUE
                    {
                    lv_end1_13_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_ruleFactorLevels7042); 

                    			newLeafNode(lv_end1_13_0, grammarAccess.getFactorLevelsAccess().getEnd1RangeValueTerminalRuleCall_6_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorLevelsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"end1",
                            		lv_end1_13_0, 
                            		"rangeValue");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactorLevels"


    // $ANTLR start "entryRuleResponse"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3470:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3471:2: (iv_ruleResponse= ruleResponse EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3472:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_ruleResponse_in_entryRuleResponse7085);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponse7095); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3479:1: ruleResponse returns [EObject current=null] : ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token lv_responseName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_responseType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3482:28: ( ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3483:1: ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3483:1: ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3483:2: ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}'
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3483:2: ( (lv_responseName_0_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3484:1: (lv_responseName_0_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3484:1: (lv_responseName_0_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3485:3: lv_responseName_0_0= RULE_ID
            {
            lv_responseName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResponse7137); 

            			newLeafNode(lv_responseName_0_0, grammarAccess.getResponseAccess().getResponseNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResponseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"responseName",
                    		lv_responseName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleResponse7154); 

                	newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,81,FOLLOW_81_in_ruleResponse7166); 

                	newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getTypeKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3509:1: ( (lv_responseType_3_0= ruleResponseType ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3510:1: (lv_responseType_3_0= ruleResponseType )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3510:1: (lv_responseType_3_0= ruleResponseType )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3511:3: lv_responseType_3_0= ruleResponseType
            {
             
            	        newCompositeNode(grammarAccess.getResponseAccess().getResponseTypeResponseTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleResponseType_in_ruleResponse7187);
            lv_responseType_3_0=ruleResponseType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResponseRule());
            	        }
                   		set(
                   			current, 
                   			"responseType",
                    		lv_responseType_3_0, 
                    		"ResponseType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleResponse7199); 

                	newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleIteration"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3539:1: entryRuleIteration returns [EObject current=null] : iv_ruleIteration= ruleIteration EOF ;
    public final EObject entryRuleIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteration = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3540:2: (iv_ruleIteration= ruleIteration EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3541:2: iv_ruleIteration= ruleIteration EOF
            {
             newCompositeNode(grammarAccess.getIterationRule()); 
            pushFollow(FOLLOW_ruleIteration_in_entryRuleIteration7235);
            iv_ruleIteration=ruleIteration();

            state._fsp--;

             current =iv_ruleIteration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIteration7245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIteration"


    // $ANTLR start "ruleIteration"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3548:1: ruleIteration returns [EObject current=null] : (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) ) ;
    public final EObject ruleIteration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_iterations_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3551:28: ( (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3552:1: (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3552:1: (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3552:3: otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleIteration7282); 

                	newLeafNode(otherlv_0, grammarAccess.getIterationAccess().getNumberKeyword_0());
                
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleIteration7294); 

                	newLeafNode(otherlv_1, grammarAccess.getIterationAccess().getOfKeyword_1());
                
            otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleIteration7306); 

                	newLeafNode(otherlv_2, grammarAccess.getIterationAccess().getIterationsKeyword_2());
                
            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleIteration7318); 

                	newLeafNode(otherlv_3, grammarAccess.getIterationAccess().getColonKeyword_3());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3568:1: ( (lv_iterations_4_0= RULE_INT ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3569:1: (lv_iterations_4_0= RULE_INT )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3569:1: (lv_iterations_4_0= RULE_INT )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3570:3: lv_iterations_4_0= RULE_INT
            {
            lv_iterations_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIteration7335); 

            			newLeafNode(lv_iterations_4_0, grammarAccess.getIterationAccess().getIterationsINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIterationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iterations",
                    		lv_iterations_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIteration"


    // $ANTLR start "entryRulePerformanceMeasure"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3594:1: entryRulePerformanceMeasure returns [EObject current=null] : iv_rulePerformanceMeasure= rulePerformanceMeasure EOF ;
    public final EObject entryRulePerformanceMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerformanceMeasure = null;


        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3595:2: (iv_rulePerformanceMeasure= rulePerformanceMeasure EOF )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3596:2: iv_rulePerformanceMeasure= rulePerformanceMeasure EOF
            {
             newCompositeNode(grammarAccess.getPerformanceMeasureRule()); 
            pushFollow(FOLLOW_rulePerformanceMeasure_in_entryRulePerformanceMeasure7376);
            iv_rulePerformanceMeasure=rulePerformanceMeasure();

            state._fsp--;

             current =iv_rulePerformanceMeasure; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerformanceMeasure7386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerformanceMeasure"


    // $ANTLR start "rulePerformanceMeasure"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3603:1: rulePerformanceMeasure returns [EObject current=null] : (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' ) ;
    public final EObject rulePerformanceMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expectedResponse_1_0=null;
        Token otherlv_2=null;
        Token lv_er_3_0=null;
        Token otherlv_4=null;
        Token lv_std_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3606:28: ( (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3607:1: (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3607:1: (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3607:3: otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePerformanceMeasure7423); 

                	newLeafNode(otherlv_0, grammarAccess.getPerformanceMeasureAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3611:1: ( (lv_expectedResponse_1_0= RULE_ID ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3612:1: (lv_expectedResponse_1_0= RULE_ID )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3612:1: (lv_expectedResponse_1_0= RULE_ID )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3613:3: lv_expectedResponse_1_0= RULE_ID
            {
            lv_expectedResponse_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerformanceMeasure7440); 

            			newLeafNode(lv_expectedResponse_1_0, grammarAccess.getPerformanceMeasureAccess().getExpectedResponseIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPerformanceMeasureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expectedResponse",
                    		lv_expectedResponse_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,87,FOLLOW_87_in_rulePerformanceMeasure7457); 

                	newLeafNode(otherlv_2, grammarAccess.getPerformanceMeasureAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3633:1: ( (lv_er_3_0= RULE_RANGEVALUE ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3634:1: (lv_er_3_0= RULE_RANGEVALUE )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3634:1: (lv_er_3_0= RULE_RANGEVALUE )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3635:3: lv_er_3_0= RULE_RANGEVALUE
            {
            lv_er_3_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_rulePerformanceMeasure7474); 

            			newLeafNode(lv_er_3_0, grammarAccess.getPerformanceMeasureAccess().getErRangeValueTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPerformanceMeasureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"er",
                    		lv_er_3_0, 
                    		"rangeValue");
            	    

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_88_in_rulePerformanceMeasure7491); 

                	newLeafNode(otherlv_4, grammarAccess.getPerformanceMeasureAccess().getSpacePlusSignHyphenMinusKeyword_4());
                
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3655:1: ( (lv_std_5_0= RULE_RANGEVALUE ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3656:1: (lv_std_5_0= RULE_RANGEVALUE )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3656:1: (lv_std_5_0= RULE_RANGEVALUE )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3657:3: lv_std_5_0= RULE_RANGEVALUE
            {
            lv_std_5_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_RULE_RANGEVALUE_in_rulePerformanceMeasure7508); 

            			newLeafNode(lv_std_5_0, grammarAccess.getPerformanceMeasureAccess().getStdRangeValueTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPerformanceMeasureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"std",
                    		lv_std_5_0, 
                    		"rangeValue");
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePerformanceMeasure7525); 

                	newLeafNode(otherlv_6, grammarAccess.getPerformanceMeasureAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerformanceMeasure"


    // $ANTLR start "ruleVariableType"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3685:1: ruleVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) ) ;
    public final Enumerator ruleVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3687:28: ( ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3688:1: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3688:1: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) )
            int alt87=6;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt87=1;
                }
                break;
            case 90:
                {
                alt87=2;
                }
                break;
            case 91:
                {
                alt87=3;
                }
                break;
            case 92:
                {
                alt87=4;
                }
                break;
            case 93:
                {
                alt87=5;
                }
                break;
            case 94:
                {
                alt87=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3688:2: (enumLiteral_0= 'QUALITATIVE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3688:2: (enumLiteral_0= 'QUALITATIVE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3688:4: enumLiteral_0= 'QUALITATIVE'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleVariableType7575); 

                            current = grammarAccess.getVariableTypeAccess().getQUALITATIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVariableTypeAccess().getQUALITATIVEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3694:6: (enumLiteral_1= 'QUANTITATIVE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3694:6: (enumLiteral_1= 'QUANTITATIVE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3694:8: enumLiteral_1= 'QUANTITATIVE'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleVariableType7592); 

                            current = grammarAccess.getVariableTypeAccess().getQUANTITATIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVariableTypeAccess().getQUANTITATIVEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3700:6: (enumLiteral_2= 'CONTINOUS' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3700:6: (enumLiteral_2= 'CONTINOUS' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3700:8: enumLiteral_2= 'CONTINOUS'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleVariableType7609); 

                            current = grammarAccess.getVariableTypeAccess().getCONTINOUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVariableTypeAccess().getCONTINOUSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3706:6: (enumLiteral_3= 'DISCRETE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3706:6: (enumLiteral_3= 'DISCRETE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3706:8: enumLiteral_3= 'DISCRETE'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_92_in_ruleVariableType7626); 

                            current = grammarAccess.getVariableTypeAccess().getDISCRETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVariableTypeAccess().getDISCRETEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3712:6: (enumLiteral_4= 'BINARY' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3712:6: (enumLiteral_4= 'BINARY' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3712:8: enumLiteral_4= 'BINARY'
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_93_in_ruleVariableType7643); 

                            current = grammarAccess.getVariableTypeAccess().getBINARYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getVariableTypeAccess().getBINARYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3718:6: (enumLiteral_5= 'NONBINARY' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3718:6: (enumLiteral_5= 'NONBINARY' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3718:8: enumLiteral_5= 'NONBINARY'
                    {
                    enumLiteral_5=(Token)match(input,94,FOLLOW_94_in_ruleVariableType7660); 

                            current = grammarAccess.getVariableTypeAccess().getNONBINARYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getVariableTypeAccess().getNONBINARYEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3728:1: ruleExpression returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3730:28: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3731:1: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3731:1: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==95) ) {
                alt88=1;
            }
            else if ( (LA88_0==96) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3731:2: (enumLiteral_0= 'TRUE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3731:2: (enumLiteral_0= 'TRUE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3731:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_95_in_ruleExpression7705); 

                            current = grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3737:6: (enumLiteral_1= 'FALSE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3737:6: (enumLiteral_1= 'FALSE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3737:8: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_96_in_ruleExpression7722); 

                            current = grammarAccess.getExpressionAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getExpressionAccess().getFALSEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleLinks"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3747:1: ruleLinks returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) ;
    public final Enumerator ruleLinks() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3749:28: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3750:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3750:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            int alt89=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt89=1;
                }
                break;
            case 97:
                {
                alt89=2;
                }
                break;
            case 65:
                {
                alt89=3;
                }
                break;
            case 98:
                {
                alt89=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3750:2: (enumLiteral_0= 'is' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3750:2: (enumLiteral_0= 'is' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3750:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleLinks7767); 

                            current = grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3756:6: (enumLiteral_1= 'occurs' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3756:6: (enumLiteral_1= 'occurs' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3756:8: enumLiteral_1= 'occurs'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_97_in_ruleLinks7784); 

                            current = grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3762:6: (enumLiteral_2= 'to' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3762:6: (enumLiteral_2= 'to' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3762:8: enumLiteral_2= 'to'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleLinks7801); 

                            current = grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3768:6: (enumLiteral_3= 'in' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3768:6: (enumLiteral_3= 'in' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3768:8: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,98,FOLLOW_98_in_ruleLinks7818); 

                            current = grammarAccess.getLinksAccess().getInEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLinksAccess().getInEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinks"


    // $ANTLR start "ruleTemporal"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3778:1: ruleTemporal returns [Enumerator current=null] : ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) ;
    public final Enumerator ruleTemporal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3780:28: ( ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3781:1: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3781:1: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            int alt90=11;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt90=1;
                }
                break;
            case 100:
                {
                alt90=2;
                }
                break;
            case 101:
                {
                alt90=3;
                }
                break;
            case 102:
                {
                alt90=4;
                }
                break;
            case 103:
                {
                alt90=5;
                }
                break;
            case 104:
                {
                alt90=6;
                }
                break;
            case 105:
                {
                alt90=7;
                }
                break;
            case 106:
                {
                alt90=8;
                }
                break;
            case 107:
                {
                alt90=9;
                }
                break;
            case 108:
                {
                alt90=10;
                }
                break;
            case 109:
                {
                alt90=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3781:2: (enumLiteral_0= 'precedes' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3781:2: (enumLiteral_0= 'precedes' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3781:4: enumLiteral_0= 'precedes'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleTemporal7863); 

                            current = grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3787:6: (enumLiteral_1= 'between' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3787:6: (enumLiteral_1= 'between' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3787:8: enumLiteral_1= 'between'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleTemporal7880); 

                            current = grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3793:6: (enumLiteral_2= 'eventually' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3793:6: (enumLiteral_2= 'eventually' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3793:8: enumLiteral_2= 'eventually'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_101_in_ruleTemporal7897); 

                            current = grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3799:6: (enumLiteral_3= 'always' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3799:6: (enumLiteral_3= 'always' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3799:8: enumLiteral_3= 'always'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_102_in_ruleTemporal7914); 

                            current = grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3805:6: (enumLiteral_4= 'before' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3805:6: (enumLiteral_4= 'before' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3805:8: enumLiteral_4= 'before'
                    {
                    enumLiteral_4=(Token)match(input,103,FOLLOW_103_in_ruleTemporal7931); 

                            current = grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3811:6: (enumLiteral_5= 'after' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3811:6: (enumLiteral_5= 'after' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3811:8: enumLiteral_5= 'after'
                    {
                    enumLiteral_5=(Token)match(input,104,FOLLOW_104_in_ruleTemporal7948); 

                            current = grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3817:6: (enumLiteral_6= 'until' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3817:6: (enumLiteral_6= 'until' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3817:8: enumLiteral_6= 'until'
                    {
                    enumLiteral_6=(Token)match(input,105,FOLLOW_105_in_ruleTemporal7965); 

                            current = grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3823:6: (enumLiteral_7= 'never' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3823:6: (enumLiteral_7= 'never' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3823:8: enumLiteral_7= 'never'
                    {
                    enumLiteral_7=(Token)match(input,106,FOLLOW_106_in_ruleTemporal7982); 

                            current = grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3829:6: (enumLiteral_8= 'leads' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3829:6: (enumLiteral_8= 'leads' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3829:8: enumLiteral_8= 'leads'
                    {
                    enumLiteral_8=(Token)match(input,107,FOLLOW_107_in_ruleTemporal7999); 

                            current = grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3835:6: (enumLiteral_9= 'absent' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3835:6: (enumLiteral_9= 'absent' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3835:8: enumLiteral_9= 'absent'
                    {
                    enumLiteral_9=(Token)match(input,108,FOLLOW_108_in_ruleTemporal8016); 

                            current = grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3841:6: (enumLiteral_10= 'exists' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3841:6: (enumLiteral_10= 'exists' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3841:8: enumLiteral_10= 'exists'
                    {
                    enumLiteral_10=(Token)match(input,109,FOLLOW_109_in_ruleTemporal8033); 

                            current = grammarAccess.getTemporalAccess().getExistsEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getTemporalAccess().getExistsEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporal"


    // $ANTLR start "ruleLogical"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3851:1: ruleLogical returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) ;
    public final Enumerator ruleLogical() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3853:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3854:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3854:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt91=1;
                }
                break;
            case 110:
                {
                alt91=2;
                }
                break;
            case 111:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3854:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3854:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3854:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleLogical8078); 

                            current = grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3860:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3860:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3860:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_110_in_ruleLogical8095); 

                            current = grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3866:6: (enumLiteral_2= 'not' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3866:6: (enumLiteral_2= 'not' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3866:8: enumLiteral_2= 'not'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_111_in_ruleLogical8112); 

                            current = grammarAccess.getLogicalAccess().getNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLogicalAccess().getNotEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogical"


    // $ANTLR start "ruleCoherence"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3876:1: ruleCoherence returns [Enumerator current=null] : ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) ;
    public final Enumerator ruleCoherence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3878:28: ( ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3879:1: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3879:1: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt92=1;
                }
                break;
            case 113:
                {
                alt92=2;
                }
                break;
            case 114:
                {
                alt92=3;
                }
                break;
            case 115:
                {
                alt92=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3879:2: (enumLiteral_0= 'EXPLAIN' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3879:2: (enumLiteral_0= 'EXPLAIN' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3879:4: enumLiteral_0= 'EXPLAIN'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_112_in_ruleCoherence8157); 

                            current = grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3885:6: (enumLiteral_1= 'ANALOGOUS' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3885:6: (enumLiteral_1= 'ANALOGOUS' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3885:8: enumLiteral_1= 'ANALOGOUS'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_113_in_ruleCoherence8174); 

                            current = grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3891:6: (enumLiteral_2= 'DATA' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3891:6: (enumLiteral_2= 'DATA' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3891:8: enumLiteral_2= 'DATA'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_114_in_ruleCoherence8191); 

                            current = grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3897:6: (enumLiteral_3= 'CONTRADICT' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3897:6: (enumLiteral_3= 'CONTRADICT' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3897:8: enumLiteral_3= 'CONTRADICT'
                    {
                    enumLiteral_3=(Token)match(input,115,FOLLOW_115_in_ruleCoherence8208); 

                            current = grammarAccess.getCoherenceAccess().getCONTRADICTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCoherenceAccess().getCONTRADICTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoherence"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3907:1: ruleFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) ;
    public final Enumerator ruleFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3909:28: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3910:1: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3910:1: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            int alt93=9;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt93=1;
                }
                break;
            case 117:
                {
                alt93=2;
                }
                break;
            case 118:
                {
                alt93=3;
                }
                break;
            case 119:
                {
                alt93=4;
                }
                break;
            case 120:
                {
                alt93=5;
                }
                break;
            case 121:
                {
                alt93=6;
                }
                break;
            case 122:
                {
                alt93=7;
                }
                break;
            case 123:
                {
                alt93=8;
                }
                break;
            case 124:
                {
                alt93=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3910:2: (enumLiteral_0= 'MIN' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3910:2: (enumLiteral_0= 'MIN' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3910:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_116_in_ruleFunction8253); 

                            current = grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3916:6: (enumLiteral_1= 'MAX' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3916:6: (enumLiteral_1= 'MAX' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3916:8: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_117_in_ruleFunction8270); 

                            current = grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3922:6: (enumLiteral_2= 'EXP' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3922:6: (enumLiteral_2= 'EXP' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3922:8: enumLiteral_2= 'EXP'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_118_in_ruleFunction8287); 

                            current = grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3928:6: (enumLiteral_3= 'INVERSE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3928:6: (enumLiteral_3= 'INVERSE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3928:8: enumLiteral_3= 'INVERSE'
                    {
                    enumLiteral_3=(Token)match(input,119,FOLLOW_119_in_ruleFunction8304); 

                            current = grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3934:6: (enumLiteral_4= 'SIN' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3934:6: (enumLiteral_4= 'SIN' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3934:8: enumLiteral_4= 'SIN'
                    {
                    enumLiteral_4=(Token)match(input,120,FOLLOW_120_in_ruleFunction8321); 

                            current = grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3940:6: (enumLiteral_5= 'COS' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3940:6: (enumLiteral_5= 'COS' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3940:8: enumLiteral_5= 'COS'
                    {
                    enumLiteral_5=(Token)match(input,121,FOLLOW_121_in_ruleFunction8338); 

                            current = grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3946:6: (enumLiteral_6= 'TAN' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3946:6: (enumLiteral_6= 'TAN' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3946:8: enumLiteral_6= 'TAN'
                    {
                    enumLiteral_6=(Token)match(input,122,FOLLOW_122_in_ruleFunction8355); 

                            current = grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3952:6: (enumLiteral_7= 'FACTORIAL' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3952:6: (enumLiteral_7= 'FACTORIAL' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3952:8: enumLiteral_7= 'FACTORIAL'
                    {
                    enumLiteral_7=(Token)match(input,123,FOLLOW_123_in_ruleFunction8372); 

                            current = grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3958:6: (enumLiteral_8= 'LOG' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3958:6: (enumLiteral_8= 'LOG' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3958:8: enumLiteral_8= 'LOG'
                    {
                    enumLiteral_8=(Token)match(input,124,FOLLOW_124_in_ruleFunction8389); 

                            current = grammarAccess.getFunctionAccess().getLOGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getFunctionAccess().getLOGEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "ruleLevels"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3970:1: ruleLevels returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) ;
    public final Enumerator ruleLevels() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3972:28: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3973:1: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3973:1: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            int alt94=3;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt94=1;
                }
                break;
            case 126:
                {
                alt94=2;
                }
                break;
            case 127:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3973:2: (enumLiteral_0= 'HIGH' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3973:2: (enumLiteral_0= 'HIGH' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3973:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_125_in_ruleLevels8436); 

                            current = grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3979:6: (enumLiteral_1= 'MEDIUM' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3979:6: (enumLiteral_1= 'MEDIUM' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3979:8: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_126_in_ruleLevels8453); 

                            current = grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3985:6: (enumLiteral_2= 'LOW' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3985:6: (enumLiteral_2= 'LOW' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3985:8: enumLiteral_2= 'LOW'
                    {
                    enumLiteral_2=(Token)match(input,127,FOLLOW_127_in_ruleLevels8470); 

                            current = grammarAccess.getLevelsAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLevelsAccess().getLOWEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLevels"


    // $ANTLR start "ruleDesignType"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3995:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3997:28: ( ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3998:1: ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3998:1: ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt95=1;
                }
                break;
            case 129:
                {
                alt95=2;
                }
                break;
            case 130:
                {
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3998:2: (enumLiteral_0= 'FULLFACTORIAL' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3998:2: (enumLiteral_0= 'FULLFACTORIAL' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:3998:4: enumLiteral_0= 'FULLFACTORIAL'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_128_in_ruleDesignType8515); 

                            current = grammarAccess.getDesignTypeAccess().getFULLFACTORIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getFULLFACTORIALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4004:6: (enumLiteral_1= 'FRACTIONALFACTORIAL' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4004:6: (enumLiteral_1= 'FRACTIONALFACTORIAL' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4004:8: enumLiteral_1= 'FRACTIONALFACTORIAL'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_129_in_ruleDesignType8532); 

                            current = grammarAccess.getDesignTypeAccess().getFRACTIONALFACTORIALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getFRACTIONALFACTORIALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4010:6: (enumLiteral_2= 'OTHERS' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4010:6: (enumLiteral_2= 'OTHERS' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4010:8: enumLiteral_2= 'OTHERS'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_130_in_ruleDesignType8549); 

                            current = grammarAccess.getDesignTypeAccess().getOTHERSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getOTHERSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesignType"


    // $ANTLR start "ruleResponseType"
    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4020:1: ruleResponseType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) ) ;
    public final Enumerator ruleResponseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4022:28: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) ) )
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4023:1: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) )
            {
            // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4023:1: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==131) ) {
                alt96=1;
            }
            else if ( (LA96_0==132) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4023:2: (enumLiteral_0= 'SIMPLE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4023:2: (enumLiteral_0= 'SIMPLE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4023:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,131,FOLLOW_131_in_ruleResponseType8594); 

                            current = grammarAccess.getResponseTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResponseTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4029:6: (enumLiteral_1= 'COMPOSITE' )
                    {
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4029:6: (enumLiteral_1= 'COMPOSITE' )
                    // ../org.xtext.DOE/src-gen/org/xtext/DOE/parser/antlr/internal/InternalExperimentOntology.g:4029:8: enumLiteral_1= 'COMPOSITE'
                    {
                    enumLiteral_1=(Token)match(input,132,FOLLOW_132_in_ruleResponseType8611); 

                            current = grammarAccess.getResponseTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResponseTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponseType"

    // Delegated rules


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA41_eotS =
        "\22\uffff";
    static final String DFA41_eofS =
        "\1\3\21\uffff";
    static final String DFA41_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\25\4\4\1\uffff\1\4\2\25\1\71\2\4\1\25"+
        "\1\71";
    static final String DFA41_maxS =
        "\1\157\1\uffff\1\4\1\uffff\1\157\1\71\3\4\1\uffff\1\4\2\157\2\71"+
        "\1\4\1\157\1\71";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\5\uffff\1\1\10\uffff";
    static final String DFA41_specialS =
        "\22\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\1\uffff\1\3\10\uffff\1\3\4\uffff\1\2\45\uffff\1\3\2\uffff"+
            "\1\3\3\uffff\1\3\2\uffff\1\3\32\uffff\21\3",
            "",
            "\1\4",
            "",
            "\1\11\42\uffff\1\5\13\uffff\1\6\51\uffff\1\7\1\10",
            "\1\12\64\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "",
            "\1\15",
            "\1\11\56\uffff\1\6\51\uffff\1\7\1\10",
            "\1\11\42\uffff\1\16\13\uffff\1\6\51\uffff\1\7\1\10",
            "\1\13",
            "\1\17\64\uffff\1\20",
            "\1\21",
            "\1\11\56\uffff\1\6\51\uffff\1\7\1\10",
            "\1\20"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1794:3: ( (lv_e_2_0= ruleEvent ) )?";
        }
    }
    static final String DFA49_eotS =
        "\15\uffff";
    static final String DFA49_eofS =
        "\13\uffff\2\10";
    static final String DFA49_minS =
        "\1\74\1\4\1\uffff\2\4\1\uffff\1\75\1\4\1\uffff\1\4\1\75\2\4";
    static final String DFA49_maxS =
        "\1\103\1\102\1\uffff\1\75\1\105\1\uffff\1\75\1\104\1\uffff\1\107"+
        "\1\75\2\107";
    static final String DFA49_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\2\uffff\1\1\4\uffff";
    static final String DFA49_specialS =
        "\15\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\1\6\uffff\1\2",
            "\1\3\70\uffff\1\4\4\uffff\1\5",
            "",
            "\1\6\70\uffff\1\4",
            "\1\5\1\uffff\1\7\66\uffff\1\5\3\10\1\uffff\1\11\1\uffff\2"+
            "\5",
            "",
            "\1\4",
            "\1\5\70\uffff\1\5\3\10\1\uffff\1\11\1\uffff\1\5",
            "",
            "\1\12\102\uffff\1\5",
            "\1\13",
            "\1\5\1\uffff\1\14\10\uffff\1\10\54\uffff\1\10\3\uffff\1\10"+
            "\2\uffff\1\10\2\5\1\uffff\1\5",
            "\1\5\12\uffff\1\10\54\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
            "\1\5\2\uffff\1\5"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "2085:1: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentOntology_in_ruleModel130 = new BitSet(new long[]{0x0008080000002002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleExperimentOntology_in_entryRuleExperimentOntology166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentOntology176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSection_in_ruleExperimentOntology223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoals_in_ruleExperimentOntology250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypothesis_in_ruleExperimentOntology277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperiment_in_ruleExperimentOntology304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSection_in_entryRuleModelSection339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelSection349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModelSection386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelSection403 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModelSection420 = new BitSet(new long[]{0x0000003000018000L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleModelSection441 = new BitSet(new long[]{0x0000003000018000L});
    public static final BitSet FOLLOW_ruleEventDescriptor_in_ruleModelSection463 = new BitSet(new long[]{0x0000003000008000L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleModelSection485 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_15_in_ruleModelSection498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMechanism581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism598 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMechanism615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReaction_in_ruleMechanism636 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ruleGuardCondition_in_ruleMechanism657 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMechanism670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReaction_in_ruleMechanism691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReaction_in_entryRuleReaction727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReaction737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReaction779 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_19_in_ruleReaction797 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReaction816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardCondition_in_entryRuleGuardCondition858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuardCondition868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGuardCondition911 = new BitSet(new long[]{0x0000000FFFE20010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuardCondition941 = new BitSet(new long[]{0x0000000FFFE20010L});
    public static final BitSet FOLLOW_ruleLinkOperators_in_ruleGuardCondition968 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuardCondition986 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGuardCondition1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkOperators_in_entryRuleLinkOperators1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkOperators1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLinkOperators1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLinkOperators1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLinkOperators1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLinkOperators1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLinkOperators1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLinkOperators1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLinkOperators1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLinkOperators1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLinkOperators1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLinkOperators1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLinkOperators1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLinkOperators1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLinkOperators1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLinkOperators1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinkOperators1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDescriptor_in_entryRuleEventDescriptor1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDescriptor1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEventDescriptor1443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDescriptor1460 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEventDescriptor1477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventDescriptor1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFactor1582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactor1599 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFactor1616 = new BitSet(new long[]{0x0000004000000010L,0x000000007E000000L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFactor1637 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactor1655 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFactor1673 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleFactor1686 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFactor1698 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleFactor1719 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFactor1731 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleFactor1746 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFactor1758 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleproperties_in_ruleFactor1779 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleFactor1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleproperties_in_entryRuleproperties1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleproperties1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleproperties1882 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleproperties1899 = new BitSet(new long[]{0x00000400000000F0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleproperties1920 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleproperties1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues1971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValues2023 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValues2046 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleValues2069 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_FACTORLEVELVALUE_in_ruleValues2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoals_in_entryRuleGoals2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoals2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGoals2181 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoals2193 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleGoals2205 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleGoals2217 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleGoals2229 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGoals2241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoals2258 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleGoals2275 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGoals2287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoals2304 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleGoals2321 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGoals2333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoals2350 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleGoals2367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGoals2379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoals2396 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleGoals2413 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGoals2425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoals2442 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGoals2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypothesis_in_entryRuleHypothesis2495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHypothesis2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleHypothesis2542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHypothesis2554 = new BitSet(new long[]{0x00F0000000008000L});
    public static final BitSet FOLLOW_52_in_ruleHypothesis2567 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleHypothesis2579 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHypothesis2591 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleMechHypothesis_in_ruleHypothesis2612 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleHypothesis2625 = new BitSet(new long[]{0x00E0000000008000L});
    public static final BitSet FOLLOW_53_in_ruleHypothesis2640 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHypothesis2652 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleEvidence_in_ruleHypothesis2673 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleHypothesis2686 = new BitSet(new long[]{0x00C0000000008000L});
    public static final BitSet FOLLOW_54_in_ruleHypothesis2701 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHypothesis2713 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHypothesis2725 = new BitSet(new long[]{0x0000000000008000L,0x000F000000000000L});
    public static final BitSet FOLLOW_ruleCoherenceLink_in_ruleHypothesis2746 = new BitSet(new long[]{0x0000000000008000L,0x000F000000000000L});
    public static final BitSet FOLLOW_15_in_ruleHypothesis2759 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_55_in_ruleHypothesis2774 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleHypothesis2786 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHypothesis2798 = new BitSet(new long[]{0x1000000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRelationalQuery_in_ruleHypothesis2819 = new BitSet(new long[]{0x1000000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_15_in_ruleHypothesis2832 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHypothesis2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoherenceLink_in_entryRuleCoherenceLink2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoherenceLink2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoherence_in_ruleCoherenceLink2938 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCoherenceLink2950 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCoherenceLink2967 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_57_in_ruleCoherenceLink2985 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCoherenceLink2997 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCoherenceLink3014 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_57_in_ruleCoherenceLink3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechHypothesis_in_entryRuleMechHypothesis3068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechHypothesis3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechHypothesis3120 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMechHypothesis3137 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_ruleTemporalPattern_in_ruleMechHypothesis3158 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechHypothesis3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvidence_in_entryRuleEvidence3218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvidence3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvidence3270 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEvidence3287 = new BitSet(new long[]{0x0400000000100010L});
    public static final BitSet FOLLOW_ruleTemporalPattern_in_ruleEvidence3308 = new BitSet(new long[]{0x0400000000100010L});
    public static final BitSet FOLLOW_58_in_ruleEvidence3321 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleEvidence3333 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEvidence3345 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleEvidence3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPattern_in_entryRuleTemporalPattern3403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPattern3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleTemporalPattern3460 = new BitSet(new long[]{0x2000000000000002L,0x0000FFFF80000012L});
    public static final BitSet FOLLOW_ruleLinks_in_ruleTemporalPattern3480 = new BitSet(new long[]{0x2000000000000002L,0x0000FFFF80000012L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTemporalPattern3502 = new BitSet(new long[]{0x2000000000000002L,0x0000FFFF80000012L});
    public static final BitSet FOLLOW_ruleTemporal_in_ruleTemporalPattern3525 = new BitSet(new long[]{0x2000000000000002L,0x0000FFFE00000012L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleTemporalPattern3552 = new BitSet(new long[]{0x2000000000000002L,0x0000FFFE00000012L});
    public static final BitSet FOLLOW_ruleLinks_in_ruleTemporalPattern3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition3612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleCondition3668 = new BitSet(new long[]{0x0000000FFFD20052L,0x0000000180000000L});
    public static final BitSet FOLLOW_ruleLinkOperators_in_ruleCondition3689 = new BitSet(new long[]{0x0000000000100052L,0x0000000180000000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleCondition3711 = new BitSet(new long[]{0x0000000000000042L,0x0000000180000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition3733 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleCondition3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispersed_in_ruleEvent3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneous_in_ruleEvent3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneous_in_entryRuleSimultaneous3912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneous3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSimultaneous3959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRe_in_ruleSimultaneous3980 = new BitSet(new long[]{0x0000000000200000L,0x0000FFF800000010L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleSimultaneous4002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRe_in_ruleSimultaneous4023 = new BitSet(new long[]{0x0000000000200000L,0x0000FFF800000010L});
    public static final BitSet FOLLOW_21_in_ruleSimultaneous4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispersed_in_entryRuleDispersed4073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDispersed4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRe_in_ruleDispersed4128 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRe_in_entryRuleRe4165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRe4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRe4216 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRe4235 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRe4251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRe4271 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleRe4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalQuery_in_entryRuleRelationalQuery4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalQuery4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery1_in_ruleRelationalQuery4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery2_in_ruleRelationalQuery4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery3_in_ruleRelationalQuery4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery1_in_entryRuleQuery14479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery14489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQuery14526 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery14543 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery14566 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleQuery14584 = new BitSet(new long[]{0xC000000000000040L,0x0000000000000005L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery14601 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_62_in_ruleQuery14620 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_63_in_ruleQuery14635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_64_in_ruleQuery14650 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery14667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQuery14684 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery14701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleQuery14720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery14737 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleQuery14754 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery14771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleQuery14790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery14807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQuery14824 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery14841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery2_in_entryRuleQuery24884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery24894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleQuery24931 = new BitSet(new long[]{0x0000000000000010L,0x1FF0000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleQuery24952 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery24970 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery24993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleQuery25011 = new BitSet(new long[]{0x0000000000000012L,0x1FF0000000000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleQuery25032 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery25050 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery25073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery3_in_entryRuleQuery35115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery35125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQuery35162 = new BitSet(new long[]{0x2000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery35180 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery35203 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleQuery35221 = new BitSet(new long[]{0x2000000000000050L,0x0000000000000034L});
    public static final BitSet FOLLOW_69_in_ruleQuery35234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleQuery35246 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleQuery35267 = new BitSet(new long[]{0x2000000000000050L,0x0000000000000014L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery35286 = new BitSet(new long[]{0x2000000000000010L,0x0000000000000014L});
    public static final BitSet FOLLOW_68_in_ruleQuery35305 = new BitSet(new long[]{0x2000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleQuery35321 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery35339 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleQuery35356 = new BitSet(new long[]{0x0000000000000050L,0x00000000000000B0L});
    public static final BitSet FOLLOW_69_in_ruleQuery35369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleQuery35381 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleQuery35402 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery35421 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000090L});
    public static final BitSet FOLLOW_68_in_ruleQuery35440 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleQuery35456 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleQuery35478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleQuery35490 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery35507 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery35530 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery35553 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleQuery35571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleQuery35583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery35600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQuery35617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleQuery35634 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L});
    public static final BitSet FOLLOW_ruleExperiment_in_entryRuleExperiment5677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperiment5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleExperiment5724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperiment5741 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment5758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExperiment5770 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDesign_in_ruleExperiment5791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleExperiment5803 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleExperiment5815 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePerformanceMeasure_in_ruleExperiment5836 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExperiment5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesign_in_entryRuleDesign5884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesign5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDesign5931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000207000L});
    public static final BitSet FOLLOW_76_in_ruleDesign5944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleDesign5965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000206000L});
    public static final BitSet FOLLOW_77_in_ruleDesign5980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDesign5997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000206000L});
    public static final BitSet FOLLOW_ruleIteration_in_ruleDesign6025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleDesign6039 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleDesign6060 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDesign6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables6109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVariables6156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleIndependentVariables_in_ruleVariables6177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_ruleControlVariables_in_ruleVariables6198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_ruleDependentVariables_in_ruleVariables6220 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariables6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndependentVariables_in_entryRuleIndependentVariables6268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndependentVariables6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleIndependentVariables6315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleIndependentVariables6327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIndependentVariables6339 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleFactorLevels_in_ruleIndependentVariables6360 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleIndependentVariables6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlVariables_in_entryRuleControlVariables6409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlVariables6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleControlVariables6456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleControlVariables6468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleControlVariables6480 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlVariables6498 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleControlVariables6515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleControlVariables6527 = new BitSet(new long[]{0x0000000000000000L,0x000000007E000000L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleControlVariables6548 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleControlVariables6560 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleControlVariables6572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleControlVariables6584 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleControlVariables6605 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleControlVariables6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependentVariables_in_entryRuleDependentVariables6655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependentVariables6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDependentVariables6702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleDependentVariables6714 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDependentVariables6726 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleResponse_in_ruleDependentVariables6747 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFactorLevels_in_entryRuleFactorLevels6784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactorLevels6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactorLevels6836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleFactorLevels6853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFactorLevels6865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleFactorLevels6877 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFactorLevels6889 = new BitSet(new long[]{0x0000000000000082L,0xE000000000000000L});
    public static final BitSet FOLLOW_RULE_FACTORLEVELVALUE_in_ruleFactorLevels6906 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactorLevels6934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleFactorLevels6946 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactorLevels6967 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleFactorLevels6979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleFactorLevels6991 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleFactorLevels7008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFactorLevels7025 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_ruleFactorLevels7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponse_in_entryRuleResponse7085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponse7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResponse7137 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleResponse7154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleResponse7166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleResponseType_in_ruleResponse7187 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResponse7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_entryRuleIteration7235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIteration7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleIteration7282 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleIteration7294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleIteration7306 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleIteration7318 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIteration7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerformanceMeasure_in_entryRulePerformanceMeasure7376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerformanceMeasure7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePerformanceMeasure7423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerformanceMeasure7440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_rulePerformanceMeasure7457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_rulePerformanceMeasure7474 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_rulePerformanceMeasure7491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RANGEVALUE_in_rulePerformanceMeasure7508 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePerformanceMeasure7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleVariableType7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleVariableType7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleVariableType7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleVariableType7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleVariableType7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleVariableType7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleExpression7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleExpression7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLinks7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleLinks7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLinks7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleLinks7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTemporal7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTemporal7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTemporal7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleTemporal7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleTemporal7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleTemporal7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleTemporal7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleTemporal7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleTemporal7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleTemporal8016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleTemporal8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLogical8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleLogical8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleLogical8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleCoherence8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleCoherence8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleCoherence8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleCoherence8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleFunction8253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleFunction8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleFunction8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleFunction8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleFunction8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleFunction8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleFunction8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleFunction8372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFunction8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleLevels8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleLevels8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleLevels8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleDesignType8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleDesignType8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleDesignType8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleResponseType8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleResponseType8611 = new BitSet(new long[]{0x0000000000000002L});

}