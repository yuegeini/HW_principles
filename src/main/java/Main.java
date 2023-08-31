public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.passport = "4444 №444444";
        post.patronymic = "Ivanovich";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Ivanov";
        post.subscription = true;
        post.birthday = new Birthday();
        post.birthday.day = 11;
        post.birthday.year = 1111;
        post.birthday.month = 11;

    }
}
