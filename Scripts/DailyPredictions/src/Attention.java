/**
 * Created by robaut on 3/23/16.
 */
public class Attention {
    public String[] dayQualityGood = {"good", "successful", "easy", "joyful", "fruitful",
            "lucky", "sunny", "wonderful"};

    public String[] dayQualityBad = {"bad", "tiring", "boring", "dull", "unsuccessful",
            "failed", "horrible"};

    public boolean isDayGood;

    public String[] attentionBeginning = {"Pay attention to", "Make sure to keep in mind", "Worry a little about",
            "Think about", "Take into account"};

    public String[] payAttentionTo = {"e-mails, messages in social network and strange calls",
            "people you haven't seen before",
            "your old mistakes and fails",
            "things you are proud of",
            "successes at work and other enterprises",
            "your friends and family",
            "open windows and shut doors",
            "paintings and pictures in internet",
            "what your heart tells you"};

    public String[] attentionLinkingGood = {", in this case you surely will", "so you will have ability to",
            ", that will give you a clue how to"};

    public String[] goodPayAttentionResult = {"get money",
            "find a new friend",
            "evade unnesesary stress", // TYPO?
            "save a lot of your spare time",
            "learn something you haven't thought about before",
            "get new valuable experience",
            "get a good laugh",
            "find possibility to help another person"};

    public String[] attentionLinkingBad = {", because you may", "if you don't want to", "to make sure you dont"};

    public String[] badPayAttentionResult = {"lose money",
            "quarrel with your friend",
            "get too much work",
            "find yourself overstrained",    // TYPO?
            "forget about somebody missing you",
            "die",
            "forget something important",
            "have insomnia today",
            "be disappointed by someone dear to you"};

    public String sample(String[] arra) {
        int index = Math.abs((int) System.nanoTime());
        index = index % arra.length;
        return arra[index];
    }

    public String makePrediction() {
        StringBuilder prediction = new StringBuilder();
        isDayGood = (System.nanoTime() % 2 == 0);
        if(isDayGood == true) {
            prediction.append("Your day will be " + sample(dayQualityGood));
            prediction.append(". ");
            prediction.append(sample(attentionBeginning)).append(' ');
            prediction.append(sample(payAttentionTo));
            String link = sample(attentionLinkingGood);
            if(link.charAt(0) != ',')
                prediction.append(' ');
            prediction.append(link).append(' ');
            prediction.append(sample(goodPayAttentionResult));
        } else {
            prediction.append("Your day will be " + sample(dayQualityBad));
            prediction.append(". ");
            prediction.append(sample(attentionBeginning)).append(' ');
            prediction.append(sample(payAttentionTo));
            String link = sample(attentionLinkingBad);
            if(link.charAt(0) != ',')
                prediction.append(' ');
            prediction.append(link).append(' ');
            prediction.append(sample(badPayAttentionResult));
        }
        prediction.append('.');
        return prediction.toString();
    }
}
