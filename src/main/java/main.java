public class main {

    public static void main(String[] args) {
        Post Post = new Post();

        Post.surname = "Литвинов";
        Post.name = "Игорь";
        Post.patronymic = "Евгеньевич";
        Post.passport = "4444 999999";
        Post.phone = "89119506677";
        Post.subscription = "Подписаться";
        Post.dateOfBirth = "Дата рождения:";

        Post.birthday = new FormDate();
        Post.birthday.day = 5;
        Post.birthday.month = 6;
        Post.birthday.year = 1995;

        System.out.println("Ффмилия: " + Post.surname);
        System.out.println("Имя: " + Post.name);
        System.out.println("Отчество: " + Post.patronymic);
        System.out.println("Паспорт: " + Post.passport);
        System.out.println("Телефон: " + Post.phone);
        System.out.println("Согласие на подписку: " + Post.subscription);
        System.out.println(Post.dateOfBirth);
        System.out.println("Дата: " + Post.birthday.day);
        System.out.println("Месяц: " + Post.birthday.month);
        System.out.println("Год: " + Post.birthday.year);

    }

}