
/**
 * 
 * @author (Eric Ettlin) 
 * @version (October 16, 2017)
 */
public class SentenceBuilder{
    
    private String[] nouns  = {"boy", "pizza"};
    private String[] adjectives  = {"lazy", "sleepy"};
    private String[] verbs;
    private String[] adverbs;
    private String[] preopositions;
    private String[] determiners;
   
    public SentenceBuilder(){
      loadWords();
    }

     public String getSentence(){
        String sentence = buildSentence();
        return sentence;
    }
    
    public void loadWords(){
        adjectives[0] = "lazy";
        adjectives[1] = "sleepy";
    }
    
    public String buildSentence(){
        String str = "";
        str += getNounPhrase();
        str += getVerbPrase();
        str += getPrepPhrase();
        return str;
    }
    
    public String getNounPhrase(){
        String str = "";
        str += getRandomDeterminer();
        str += getRandomAdjective();
        str += getRandomNoun();
        return str;
    }
    
    public String getVerbPrase(){
        String str = "";
        str += getRandomAdverb();
        str += getRandomVerb();
        return str;
    }
    
    public String getPrepPhrase(){
        String str = "";
        str += getRandomPreposition();
        str += getRandomAdjective();
        str += getRandomDeterminer();
        str += getRandomNoun();
        return str;
    }
    
    public String getRandomPreposition(){
        Random rn = new Random();
        int index = rn.nextInt(prepositions.length);
        return str;
    }
    
    
    
}
