package strategy;

import adapter.ExtendsAndroidGalaxy;

public class MyProgram {

    private SearchButton searchButton = new SearchButton(this);

    public void setModeAll() {
        searchButton.setSearchStrategy(new SearchStrategyAll());
    }

    public void setModeImage() {
        searchButton.setSearchStrategy(new SearchStrategyImage());
    }

    public void setModeNews() {
        searchButton.setSearchStrategy(new SearchStrategyNews());
    }

    public void setModeMap() {
        searchButton.setSearchStrategy(new SearchStrategyMap());
    }


    // adatper
    public void setModeMovie() {
        searchButton.setSearchStrategy(
                new SearchFindAdapter(new FindMovieAlgorithm())
        );
    }

    public void setModeAndroid() {
        searchButton.setSearchStrategy(
                new SearchAndroidAdapter()
        );
    }
    public void testProgram() {
        searchButton.onClick(); // search all 출력
        setModeImage();         // 이미지 검색 모드
        searchButton.onClick(); // search image 출력
        setModeNews();
        searchButton.onClick();
        setModeMap();
        searchButton.onClick();
        setModeMovie();
        searchButton.onClick();
        setModeAndroid();
        searchButton.onClick();


    }

}
