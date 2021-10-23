package proxy;

interface Thumbnail {

    public void showTitle();

    public void showPreview();

}

class RealThumbnail implements Thumbnail {

    private String title;
    private String movieUrl;

    public RealThumbnail(String title, String movieUrl) {
        this.title = title;
        this.movieUrl = movieUrl;

        // URL로 부터 영상을 다운로드 받는 작업 -> 시간소모
        System.out.println(movieUrl + "로부터 " + title + "의 영상 데이터 다운");
    }

    @Override
    public void showTitle() {
        System.out.println("title = " + title);
    }

    @Override
    public void showPreview() {
        System.out.println(title + "의 프리뷰 재생");
    }
}

class ProxyThumbnail implements Thumbnail {

    private String title;
    private String moveUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String title, String moveUrl) {
        this.title = title;
        this.moveUrl = moveUrl;
    }

    @Override
    public void showTitle() {
        System.out.println("title = " + title);
    }

    @Override
    public void showPreview() {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, moveUrl);
        }
        realThumbnail.showPreview();
    }
}

