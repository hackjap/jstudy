package strategy;

interface FindAlgorithm {
    public void find(Boolean global);
}
 class FindMovieAlgorithm implements FindAlgorithm {

    @Override
    public void find(Boolean global) {
        System.out.println(
                "find movie" + (global? " globally" : "")
        );
        // 동영상 검색하는 코드
        // ..
        // ..
    }
}
