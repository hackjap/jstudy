package strategy;

public class SearchButton {

    private MyProgram myProgram;

    public SearchButton(MyProgram _myProgram) {
        myProgram = _myProgram;
    }

    private SearchStrategy searchStrategy = new SearchStrategyAll();

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }


    public void onClick() {
        searchStrategy.search();
    }


}
