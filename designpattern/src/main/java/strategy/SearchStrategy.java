package strategy;


import adapter.ExtendsAndroid;
import adapter.ExtendsAndroidGalaxy;

interface SearchStrategy {
    public void search();
}

class SearchStrategyAll implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH ALL");
    }
}

class SearchStrategyImage implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH IMAGE");
    }
}


class SearchStrategyNews implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH News");
    }
}


class SearchStrategyMap implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH MAP");
    }
}

class SearchFindAdapter implements SearchStrategy{

    FindAlgorithm findAlgorithm;

    public SearchFindAdapter(FindAlgorithm findAlgorithm) {
        this.findAlgorithm = findAlgorithm;
    }
    @Override
    public void search() {
        findAlgorithm.find(true);
    }

}


class SearchAndroidAdapter implements SearchStrategy {

//    ExtendsAndroid extendsAndroid;

    ExtendsAndroidGalaxy extendsAndroidGalaxy = new ExtendsAndroidGalaxy();

//    public SearchAndroidAdapter(ExtendsAndroid extendsAndroid) {
//        this.extendsAndroid = extendsAndroid;
//    }
    public void search() {
        extendsAndroidGalaxy.apply(true);
    }
}




