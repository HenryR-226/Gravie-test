package graviedevtest2;

import net.java.html.boot.BrowserBuilder;

public final class Main {
    private Main() {
    }
    /*
     Thoughts/Scratchpad:
    
    */
    public static final String apiKey = "8945c01577c609bc17d77f865f79ca6e38c66e73";         //API key to be concatenated with any URL string to fetch resources
    public static final String apiUrl = "https://www.giantbomb.com/api/";                   //The start of every API URL request, concatenate to the start of whatever request
                                                                                            //is to be found. -> request(apiUrl + arg (game, rating, etc) + apiKey)
    
    //Needed features: search and 'rent' => cart + checkout
    //Search: http://www.giantbomb.com/api/search/?api_key=[apiKey]&format=json&query=[search_string]&resources=[resource_type]
    //Cart: LinkedList or List of <T> where <T> is all rentable objects
    //Checkout: Flush buffer, make txt file of receipt (?)
           
    
    public static void main(String... args) throws Exception {
        System.setProperty("prism.order", "sw");
        BrowserBuilder.newBrowser().
            loadPage("pages/index.html").
            loadClass(Main.class).
            invoke("onPageLoad", args).
            showAndWait();
        System.exit(0);
    }

    /**
     * Called when the page is ready.
     */
    public static void onPageLoad() throws Exception {
        // don't put "common" initialization stuff here, other platforms (iOS, Android, Bck2Brwsr) may not call this method. They rather call DataModel.onPageLoad
        DataModel.onPageLoad();
    }

}
