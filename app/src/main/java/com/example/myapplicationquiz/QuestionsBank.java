package com.example.myapplicationquiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    static List<QuestionsList> uazQuestions() {
        List<QuestionsList> questionsList = new ArrayList<>();

        QuestionsList questionsList1 = new QuestionsList("В каком городе расположена штаб=квартира УАЗа?",
                "Казань", "Москва", "Ульяновкс", "Саратов", "Ульяновкс", "");
        QuestionsList questionsList2 = new QuestionsList("В каком году был основан УАЗ?",
                "2000", "1941 ", "1964", "1943", "1941 ", "");
        QuestionsList questionsList3 = new QuestionsList("Как в просторечии называют модель УАЗ СГР?",
                "Волга", "Москвич", "Патриот", "Буханка", "Буханк", "");
        QuestionsList questionsList4 = new QuestionsList("Какая футбольная команда действует при заводе?",
                "Университет", "Симбирск", "Волга", "Торпедо", "Торпедо", "");
        QuestionsList questionsList5 = new QuestionsList("Какой слоган у  УАЗа?",
                "УАЗ – бери от жизни всё", "УАЗ — природа движения", "УАЗ грязи не боится", "УАЗ-надежда", "УАЗ — природа движения", "");
        QuestionsList questionsList6 = new QuestionsList("Каким орденом был награжден завод?",
                "Жукова", "Красной Звезды", "Ленина", "Трудового Красного Знамени", "Трудового Красного Знамени", "");
        QuestionsList questionsList7 = new QuestionsList("Во время какого события появился завод?",
                "Великой Отечественной войны", "Русско-японская войны", "Первой мировой войны", "Первой русской революции", " Великой Отечественной войны", "");
        QuestionsList questionsList8 = new QuestionsList("В честь кого назван завод?",
                "Брежнев", "Лермонтов", "Юрий Гагарин", " В. И. Ленина", " В. И. Ленина", "");
        QuestionsList questionsList9 = new QuestionsList("Самый современный автомобиль УАЗ?",
                "УАЗ-2360", "Патриот", "Хантер", "Буханка", "УАЗ-2360", "");
        QuestionsList questionsList10 = new QuestionsList("Как зовут известного хоккеиста команды Торпедо?",
                " Фокин Юрий Ефимович", " Мишин Николай Петрович", " Фёдоров Юрий Иванович", "Седышев Сергей Викторович", " Фёдоров Юрий Иванович", "");



        questionsList.add(questionsList1);
        questionsList.add(questionsList2);
        questionsList.add(questionsList3);
        questionsList.add(questionsList4);
        questionsList.add(questionsList5);
        questionsList.add(questionsList6);
        questionsList.add(questionsList7);
        questionsList.add(questionsList8);
        questionsList.add(questionsList9);
        questionsList.add(questionsList10);
        return questionsList;
    }

    private static List<QuestionsList> carsQuestions() {
        List<QuestionsList> questionsList = new ArrayList<>();

        QuestionsList questionsList1 = new QuestionsList("Какое название у УАЗ-3150?",
                "Казань", "Баланс", "Шалун", "Ягненок", "Шалун", "");
        QuestionsList questionsList2 = new QuestionsList("Какое название у УАЗ-3159?",
                "Тигр", "Барс", "Жук", "Скорпион", "Барс", "");
        QuestionsList questionsList3 = new QuestionsList("Какое название у УАЗ-3907?",
                "Волга", "Москвич", "Патриот", "Ягуар", "Ягуар", "");
        QuestionsList questionsList4 = new QuestionsList("Какой автомобиль заменил УАЗ-469?",
                "ГАЗ-69", "УАЗ-3907", "Волга", "Торпедо", "ГАЗ-69", "");
        QuestionsList questionsList5 = new QuestionsList("Какой слоган у  УАЗа?",
                "УАЗ – бери от жизни всё", "УАЗ — природа движения", "УАЗ грязи не боится", "УАЗ-надежда", "УАЗ — природа движения", "");
        QuestionsList questionsList6 = new QuestionsList("Когда производился УАЗ-450?",
                "с 1954 по 2021", "в 1941", "с 1976 по 1990", "с 1934 по 2011", "с 1976 по 1990", "");
        QuestionsList questionsList9 = new QuestionsList("Самый современный автомобиль УАЗ?",
                "УАЗ-2360", "Патриот", "Хантер", "Буханка", "УАЗ-2360", "");
        QuestionsList questionsList7 = new QuestionsList("С какого года выпускается УАЗ Патриот?",
                "2005", "1973", "2006", "2013", "2005", "");
        QuestionsList questionsList8 = new QuestionsList("С какого года выпускается УАЗ Хантер?",
                "2023", "1947", "2013", "2003", "2003", "");
        QuestionsList questionsList10 = new QuestionsList("Когда стартовали продажи обновлённой модели УАЗ Патриот?",
                "2012", "2014", "1935", "1954", "2014", "");

        questionsList.add(questionsList1);
        questionsList.add(questionsList2);
        questionsList.add(questionsList3);
        questionsList.add(questionsList4);
        questionsList.add(questionsList5);
        questionsList.add(questionsList6);
        questionsList.add(questionsList7);
        questionsList.add(questionsList8);
        questionsList.add(questionsList9);
        questionsList.add(questionsList10);
        return questionsList;
    }

    public static List<QuestionsList> qetQuestions (String selectedTopicName){
        switch (selectedTopicName) {
            case "uaz" : return uazQuestions();
            default: return carsQuestions();
        }
    }
}
