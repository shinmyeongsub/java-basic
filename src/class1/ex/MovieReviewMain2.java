package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "about time";
        aboutTime.review = "인생의 시간 영화";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("제목 : " + review.title + ", 리뷰 : " + review.review);
        }
    }
}
