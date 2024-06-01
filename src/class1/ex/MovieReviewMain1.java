package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "about time";
        aboutTime.review = "인생의 시간 영화";

        System.out.println("제목 : " + inception.title + ", 리뷰 : " + inception.review);
        System.out.println("제목 : " + aboutTime.title + ", 리뷰 : " + aboutTime.review);
    }
}
