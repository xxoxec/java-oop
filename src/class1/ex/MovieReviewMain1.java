package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "시간 타임";

        System.out.println("영화제목:" + inception.title + ", 리뷰:" + inception.review);
        System.out.println("영화제목:" + aboutTime.title + ", 리뷰:" + aboutTime.review);
    }
}
