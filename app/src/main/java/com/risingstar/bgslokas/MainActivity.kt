package com.risingstar.bgslokas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtSlok : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtSlok = findViewById(R.id.txtSlok)

        val slokasList = mutableListOf<String>()
        /*//1
        slokasList.add("BG 1.1 \n धृतराष्ट्र उवाच\n" +
                "धर्मक्षेत्रे कुरुक्षेत्रे समवेता युयुत्सव: ।\n" +
                "मामका: पाण्डवाश्चैव किमकुर्वत सञ्जय ॥ १ ॥\n"+
                "धृतराष्ट्र ने कहा — हे संजय! धर्मभूमि कुरुक्षेत्र में युद्ध की इच्छा से एकत्र हुए मेरे तथा पाण्डु के पुत्रों ने क्या किया ?\n"+"Dhṛtarāṣṭra said: O Sañjaya, after my sons and the sons of Pāṇḍu assembled in the place of pilgrimage at Kurukṣetra, desiring to fight, what did they do?")
        //2
        slokasList.add("BG 1.41 सङ्करो नरकायैव कुलघ्नानां कुलस्य च | \n" +
                "पतन्ति पितरो ह्येषां लुप्तपिण्डोदकक्रियाः || ४१ ||\n"+
            "अवांछित सन्तानों की वृद्धि से निश्चय ही परिवार के लिए तथा पारिवारिक परम्परा को विनष्ट करने वालों के लिए नारकीय जीवन उत्पन्न होता है | ऐसे पतित कुलों के पुरखे (पितर लोग) गिर जाते हैं क्योंकि उन्हें जल तथा पिण्ड दान देने की क्रियाएँ समाप्त हो जाती हैं\n"+
                "An increase of unwanted population certainly causes hellish life both for the family and for those who destroy the family tradition. The ancestors of such corrupt families fall down, because the performances for offering them food and water are entirely stopped.")
            */
        //3
        slokasList.add("नैनं छिद्रन्ति शस्त्राणि नैनं दहति पावक: ।\n" +
                "न चैनं क्लेदयन्त्यापो न शोषयति मारुत ॥\n" +
                "(द्वितीय अध्याय, श्लोक 23)\n\n" +
                "हिंदी अनुवाद: आत्मा को न शस्त्र काट सकते हैं, न आग उसे जला सकती है। न पानी उसे भिगो सकता है, न हवा उसे सुखा सकती है।\n\n" +
                "English Translation: Weapons cannot shred the soul, nor can fire burn it. Water cannot wet it, nor can the wind dry it.\n")
        //4
        slokasList.add("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।\n" +
                "मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि॥\n" +
                "(द्वितीय अध्याय, श्लोक 47)\n\n" +
                "हिंदी अनुवाद: कर्म पर ही तुम्हारा अधिकार है, लेकिन कर्म के फलों में कभी नहीं… इसलिए कर्म को फल के लिए मत करो और न ही काम करने में तुम्हारी आसक्ति हो।\n\n" +
                "English Translation: You have a right to perform your prescribed duties, but you are not entitled to the fruits of your actions. Never consider yourself to be the cause of the results of your activities, nor be attached to inaction.")
        //5
        slokasList.add("ध्यायतो विषयान्पुंसः सङ्गस्तेषूपजायते।\n" +
                "सङ्गात्संजायते कामः कामात्क्रोधोऽभिजायते॥\n" +
                "(द्वितीय अध्याय, श्लोक 62)\n\n" +
                "हिंदी अनुवाद: विषयों वस्तुओं के बारे में सोचते रहने से मनुष्य को उनसे आसक्ति हो जाती है। इससे उनमें कामना यानी इच्छा पैदा होती है और कामनाओं में विघ्न आने से क्रोध की उत्पत्ति होती है।\n\n" +
                "English Translation: While contemplating on the objects of the senses, one develops attachment to them. Attachment leads to desire, and from desire arises anger.")
        //6
        slokasList.add("क्रोधाद्भवति संमोह: संमोहात्स्मृतिविभ्रम:।\n" +
                "स्मृतिभ्रंशाद्बुद्धिनाशो बुद्धिनाशात्प्रणश्यति॥\n" +
                "(द्वितीय अध्याय, श्लोक 63)\n\n" +
                "हिंदी अनुवाद: क्रोध से मनुष्य की मति मारी जाती है यानी मूढ़ हो जाती है जिससे स्मृति भ्रमित हो जाती है। स्मृति-भ्रम हो जाने से मनुष्य की बुद्धि नष्ट हो जाती है और बुद्धि का नाश हो जाने पर मनुष्य खुद का अपना ही नाश कर बैठता है।\n\n" +
                "English Translation: Anger leads to clouding of judgment, which results in bewilderment of the memory. When the memory is bewildered, the intellect gets destroyed; and when the intellect is destroyed, one is ruined.")
        //7
        slokasList.add("यद्यदाचरति श्रेष्ठस्तत्तदेवेतरो जन:।\n" +
                "स यत्प्रमाणं कुरुते लोकस्तदनुवर्तते॥\n" +
                "(तृतीय अध्याय, श्लोक 21)\n\n" +
                "हिंदी अनुवाद: श्रेष्ठ पुरुष जो-जो आचरण यानी जो-जो काम करते हैं, दूसरे मनुष्य (आम इंसान) भी वैसा ही आचरण, वैसा ही काम करते हैं। वह (श्रेष्ठ पुरुष) जो प्रमाण या उदाहरण प्रस्तुत करता है, समस्त मानव-समुदाय उसी का अनुसरण करने लग जाते हैं।\n\n" +
                "English Translation: By performing their prescribed duties, King Janak and others attained perfection. You should also perform your work to set an example for the good of the world. Whatever actions great persons perform, common people follow. Whatever standards they set, all the world pursues.")
        //8
        slokasList.add("यदा यदा हि धर्मस्य ग्लानिर्भवति भारत:।\n" +
                "अभ्युत्थानमधर्मस्य तदात्मानं सृजाम्यहम्॥\n" +
                "(चतुर्थ अध्याय, श्लोक 7)\n\n" +
                "हिंदी अनुवाद: हे भारत, जब-जब धर्म का लोप होता है और अधर्म में वृद्धि होती है, तब-तब मैं धर्म के अभ्युत्थान के लिए स्वयम् की रचना करता हूं अर्थात अवतार लेता हूं।\n\n" +
                "English Translation: Whenever there is a decline in righteousness and an increase in unrighteousness, O Arjun, at that time I manifest myself on earth.")
        //9
        slokasList.add("हतो वा प्राप्यसि स्वर्गम्, जित्वा वा भोक्ष्यसे महिम्।\n" +
                "तस्मात् उत्तिष्ठ कौन्तेय युद्धाय कृतनिश्चय:॥\n" +
                "(द्वितीय अध्याय, श्लोक 37)\n\n" +
                "हिंदी अनुवाद: यदि तुम युद्ध में वीरगति को प्राप्त होते हो तो तुम्हें स्वर्ग मिलेगा और यदि विजयी होते हो तो धरती का सुख को भोगोगे.. इसलिए उठो, हे कौन्तेय , और निश्चय करके युद्ध करो।\n\n" +
                "English Translation: If you fight, you will either be slain on the battlefield and go to the celestial abodes, or you will gain victory and enjoy the kingdom on earth. Therefore arise with determination, O son of Kunti, and be prepared to fight." +
                "\n")
        //10
        slokasList.add("परित्राणाय साधूनाम् विनाशाय च दुष्कृताम्।\n" +
                "धर्मसंस्थापनार्थाय सम्भवामि युगे-युगे॥\n" +
                "(चतुर्थ अध्याय, श्लोक 8)\n\n" +
                "हिंदी अनुवाद: सज्जन पुरुषों के कल्याण के लिए और दुष्कर्मियों के विनाश के लिए… और धर्म की स्थापना के लिए मैं युगों-युगों से प्रत्येक युग में जन्म लेता आया हूं।\n\n" +
                "English Translation: To protect the righteous, to annihilate the wicked, and to reestablish the principles of dharma I appear on this earth, age after age.")
        //11
        slokasList.add("श्रद्धावान्ल्लभते ज्ञानं तत्पर: संयतेन्द्रिय:।\n" +
                "ज्ञानं लब्ध्वा परां शान्तिमचिरेणाधिगच्छति॥\n" +
                "(चतुर्थ अध्याय, श्लोक 39)\n\n" +
                "हिंदी अनुवाद: श्रद्धा रखने वाले मनुष्य, अपनी इन्द्रियों पर संयम रखने वाले मनुष्य, साधनपारायण हो अपनी तत्परता से ज्ञान प्राप्त कते हैं, फिर ज्ञान मिल जाने पर जल्द ही परम-शान्ति (भगवत्प्राप्तिरूप परम शान्ति) को प्राप्त होते हैं।\n\n" +
                "English Translation: Those whose faith is deep and who have practiced controlling their mind and senses attain divine knowledge. Through such transcendental knowledge, they quickly attain everlasting supreme peace." )
        //12
        slokasList.add("उद्धरेदात्मनात्मानं नात्मानमवसादयेत्।\n" +
                "आत्मैव ह्रात्मनो बन्धुरात्मैव रिपुरात्मन:॥\n" +
                "(षष्ठ अध्याय, श्लोक 5)\n\n" +
                "हिंदी अनुवाद: अपने द्वारा अपना संसार समुद्र से उद्धार करे और अपने को अधोगति में न डाले, क्योंकि यह मनुष्य आप ही तो अपना मित्र है और आप ही अपना शत्रु है ।\n\n" +
                "English Translation: Elevate yourself through the power of your mind, and not degrade yourself, for the mind can be the friend and also the enemy of the self.")
        //13
        slokasList.add("पत्रं पुष्पं फलं तोयं यो मे भक्त्या प्रयच्छति।\n" +
                "तदहं भक्त्युपहृतमश्नामि प्रयतात्मन:॥\n" +
                "(नवम अध्याय, श्लोक 26)\n\n" +
                "हिंदी अनुवाद: जो कोई भक्त मेरे लिये प्रेम से पत्र (पत्ती), पुष्प, फल, जल आदि अर्पण करता है, उस शुद्ध बुद्धि निष्काम प्रेमी भक्त का प्रेमपूर्वक अर्पण किया हुआ वह पत्र-पुष्पादि मैं सगुण रूप से प्रकट होकर प्रीति सहित खाता हूँ।\n\n" +
                "English Translation: If one offers to Me with devotion a leaf, a flower, a fruit, or even water, I delightfully partake of that article offered with love by My devotee in pure consciousness.")
        //14
        slokasList.add("यस्मान्नोद्विजते लोको लोकान्नोद्विजते च य: ।\n" +
                "हर्षामर्षभयोद्वेगैर्मुक्तो य: स च मे प्रिय:॥\n" +
                "(द्वादश अध्याय, श्लोक 15)\n\n" +
                "हिंदी अनुवाद: जिससे किसी को कष्ट नहीं पहुँचता तथा जो अन्य किसी के द्वारा विचलित नहीं होता, जो सुख-दुख में, भय तथा चिन्ता में समभाव रहता है, वह मुझे अत्यन्त प्रिय है।\n\n" +
                "English Translation: Those who are not a source of annoyance to anyone and who in turn are not agitated by anyone, who are equal in pleasure and pain, and free from fear and anxiety, such devotees of Mine are very dear to Me.")
        //15
        slokasList.add("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज।\n" +
                "अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:॥\n" +
                "(अष्टादश अध्याय, श्लोक 66)\n\n" +
                "हिंदी अनुवाद: सभी धर्मो को छोड़कर मेरी शरण में आ जाओ. में तुम्हे सभी पापो से मुक्त कर दूंगा, इसमें कोई संदेह नहीं हैं।\n\n" +
                "English Translation: Abandon all varieties of dharmas and simply surrender unto me alone. I shall liberate you from all sinful reactions; do not fear.")

        txtSlok.text = slokasList.random()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.share_menu){
            val shareIntent = Intent().apply {
                this.action = Intent.ACTION_SEND
                this.putExtra(Intent.EXTRA_TEXT,txtSlok.text.toString())
                this.type = "text/plain"
            }
            startActivity(shareIntent)
        }
        else {
            return super.onOptionsItemSelected(item)
        }
        return true
    }
}