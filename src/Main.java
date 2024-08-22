//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание №1

        byte a = 100;
     short b = 2000;
    int c = 50000;
    long d = 1000L;
    float i = 2.5f;
    double f = 22.5;
    System.out.println("Значение переменной a с типом переменной byte равно " + a  );
        System.out.println("Значение переменной b с типом переменной short равно " + b  );
        System.out.println("Значение переменной c с типом переменной int равно " + c );
        System.out.println("Значение переменной d с типом переменной long равно " + d );
        System.out.println("Значение переменной i с типом переменной float равно " + i );
        System.out.println("Значение переменной f с типом переменной double равно " + f );

        // Задание №2

        float aa = 27.12f;
        long bb = 987678965549L;
        float cc = 2.786f;
        short dd = 569;
        short ii = -159;
        short ff = 27897;
        short gg = 68;

        // Задание №3

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int summPeople = lp + as + ea;
        short summList = 480;
        int list = summList / summPeople;
        System.out.println("На каждого ученика рассчитанно " + list + " Листов бумаги ");

        // Задание №4

        byte bytZaDveMin = 16;
        int bytZaDvadcatMin = bytZaDveMin * 10;
       short bytZaSytki = 16 * 32 * 24;
        int bytZaTriDnya = bytZaSytki * 3;
        int bytZaMounth = bytZaTriDnya * 10;
        System.out.println("За двадцать минут машина произвела " + bytZaDvadcatMin + " Штук бутылок");
        System.out.println("За сутки машина произвела " + bytZaSytki + " Штук бутылок");
        System.out.println("За 3 дня машина произвела " + bytZaTriDnya+ " Штук бутылок");
        System.out.println("За месяц машина произвела " + bytZaMounth + " Штук бутылок");

        // Задание №5

        byte vsegoKraski = 120;
        byte beloiKraskiNaOdinKlass = 2;
        byte brownKraskiNaOdinKlass = 4;
        int vsegoKlassov = vsegoKraski / (beloiKraskiNaOdinKlass + brownKraskiNaOdinKlass);
        int beloiKraski = vsegoKlassov * beloiKraskiNaOdinKlass;
        int brownKraski = vsegoKlassov * brownKraskiNaOdinKlass;
        System.out.println("В школе где " + vsegoKlassov + " классов,нужно " + beloiKraski + " банок белой краски и " + brownKraski + " коричневой краски");

        // Задание № 6

        byte banan = 5;
        float milk = 0.200f;
        byte plombir = 2;
        byte yaica = 4;
        int bananGramm = banan * 80;
        int milkGramm = (int) (milk * 105);
        int plombirGramm = plombir * 100;
        int yaicaGramm = yaica * 70;
        int summGramm = bananGramm + milkGramm + plombirGramm + yaicaGramm;
        float summKg = summGramm / 1000f;
        System.out.println(summGramm + " грамм");
        System.out.println(summKg + " кг ");

        // Задание №7
        byte sbrositKg = 7;
        int sbrositGramm = sbrositKg * 1000;
        short teryaetMalo = 250;
        short teryaetNormalno = 500;
        int teryaetMaloDay = sbrositGramm / teryaetMalo;
        int teryaetNormalnoDay = sbrositGramm / teryaetNormalno;
        int teryaetVesSrednem = (teryaetMaloDay + teryaetNormalnoDay) / 2;
        System.out.println(teryaetMaloDay + " дней Понадобится  если сбрасывать по 250 грамм");
        System.out.println(teryaetNormalnoDay + " дней Понадобится если сбрасывать по 500 грамм");
        System.out.println(teryaetVesSrednem + " день понадобится в среднем");

        // Задание №8
        int mashaTek = 67760;
        int denisTek = 83690;
        int krisTek = 76230;
        float premia = 0.1f;
        int mashaPov = (int) (mashaTek * premia);
        int denisPov = (int) (denisTek * premia);
        int krisPov = (int) (krisTek * premia);
        int mashaItog = mashaPov + mashaTek;
        int denisItog = denisPov + denisTek;
        int krisItog = krisPov + krisTek;
        int mashaRaz = mashaItog - mashaTek;
        int denisRaz = denisItog - denisTek;
        int krisRaz = krisItog - krisTek;
        System.out.println("Маша теперь получает " + mashaItog + " рублей,годовой доход вырос на " + mashaRaz);
        System.out.println("Денис теперь получает " + denisItog + " рублей,годовой доход вырос на " + denisRaz);
        System.out.println("Кристина теперь получает " + krisItog + " рублей,годовой доход вырос на " + krisRaz);

    }
    }

