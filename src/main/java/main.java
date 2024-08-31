public class main {

    public static void main(String[] args) {
        Post Post = new Post();

        Post.surname = "Литвинов";
        Post.name = "Игорь";
        Post.patronymic = "Евгеньевич";
        Post.passport = "4444 999999";
        Post.phone = "89119506677";
        Post.subscription = "Подписаться";

        Post.birthday = new FormDate();
        Post.birthday.day = 5;
        Post.birthday.month = 06;
        Post.birthday.year = 1995;

        System.out.println(Post.surname);
        System.out.println(Post.name);
        System.out.println(Post.patronymic);
        System.out.println(Post.passport);
        System.out.println(Post.phone);
        System.out.println(Post.subscription);
        System.out.println(Post.birthday);

    }

}