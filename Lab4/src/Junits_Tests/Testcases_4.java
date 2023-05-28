package Junits_Tests;

import Sorting_Algorithms.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Testcases_4 {

    private SortFactory<Integer> simpleSF = new SimpleSort_Factory<>();
    private SortFactory<Integer> efficientSF = new EfficientSort_Factory<>();
    private SortFactory<Integer> nonComparisonSF = new NonComparisonSort_Factory<>();
    private SortFactory<Integer> heapSF = new HeapSort_Factory<>();

    public static ArrayList<Integer> getLastList(ArrayList<ArrayList<Integer>> steps) {
        return steps.get(steps.size() - 1);
    }

    @Test
    public void testSortingTechniques651(){
        Integer[] array = {52413, -691968, 414851, 344110, 993529, 188151, 290677, -310650, -79165, 181327, -480865, 778412, 436065, 306876, -66480, -640853, -33729, -694339, -429110, -445391, 236013, 326212, -333918, 330153, -360906, -939291, 810826, -127702, -147073, 590289, 676738, -517747, -158484, -30715, -127760, -474519, -595384, 967078, -260992, 622369, 232137, 991116, 931612, 917364, -281623, -969411, 433908, 304149, -921387, 992822, -591143, -631494, -851221, -764359, 949525, 474342, -661470, -504016, -222252, -772240, -918800, 753855, -866047, 366776, 624835, -360252, 679649, -643413, -176027, -630820, -274015, -463380, -618190, -745816, -96255, -405959, 510448, 283129, 747862, -564074, 600608, -492902, -463595, -910272, 328076, 456908, 696809, 849951, 272950, 944522, -671048, -904131, 941234, 992853, 186095, -202841, 803025, 326277, -400571, 163915};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques652(){
        Integer[] array = {-798381, -744104, 228412, 823242, 771658, -617131, 34617, 612011, 621267, -367864, 606975, -724405, -224095, -226324, 752853, 518837, 885186, -618105, 882126, 43455, 196801, -484082, 637089, -586837, 171914, 66573, -111109, 750341, -790994, 541209, 863965, 801001, -464890, -117204, -206947, 729080, -479039, -958400, -680545, -115252, -49817, 206051, 798423, 213680, 307755, -580110, -72877, -826950, -225424, -959467, 699778, 618585, 697443, -320093, 451489, 513407, -44244, -464346, -417809, -993663, 214667, -81984, 193923, -688447, 768405, -505539, 276111, -709972, -558107, 942015, -259797, -333942, 265459, -874742, -284841, -328588, -175844, -940881, -145768, 200326, -683850, 999692, 738213, 836447, 899115, 855805, -513123, 91061, -727052, 874149, -138938, 21824, 684212, -34988, 571712, 439245, -848790, 620637, 880252, 610084};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques653(){
        Integer[] array = {-558922, 791354, 885842, -913269, 697120, -396872, 686867, -40989, 377620, 368725, 276181, 366823, -101820, 765374, 438813, -529682, 855134, -503891, -769240, 909740, -821842, -126186, -167230, -368148, -492620, -876716, 628976, 861165, -988109, -434618, 37372, -641305, 63823, -686653, 434889, -244151, 483789, -42809, 886559, -549064, -749410, 534436, -275742, 14306, 829936, -509448, -579404, -57923, -105560, 719466, -977666, 560174, 849612, -918311, -477026, -937614, 777273, 144450, 906976, -893605, -890355, -256670, -377763, 104610, -335478, -516226, -209935, 388740, -327396, 937064, -60170, 791008, -652130, 971083, -540998, 885974, 187232, -627308, 769364, -682681, 708777, -811525, -28431, 549180, 501251, -544983, 646511, -396651, -540034, -739420, 978957, -509486, 472930, 627270, -800942, -169061, 779869, 343171, 489763, 979583};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques654(){
        Integer[] array = {189851, -709667, -244016, -51290, 565570, 557754, 657039, 870967, -29609, 984306, 312652, 986087, 277160, -973089, -301216, 157285, -759106, -706058, 976432, -955928, -544445, 398321, -165354, 98898, 989543, 485679, 388240, 54686, 29948, -347645, 555963, -964749, -849913, -700086, 256820, -460208, -330305, -352043, -883217, -764595, 428956, 928732, -594948, -248197, -32222, -924237, -51034, -393792, -697657, 998455, 16913, 182862, 688422, 962379, -211167, -39065, -607246, 159784, 375797, 101741, 518803, -958663, 259701, 255580, 787576, 124820, -808809, 479074, -525366, 857256, -651696, 519319, -421845, -598820, -424555, 892810, -424608, 442971, 578208, 430927, 611658, -51986, 978225, -574396, 315526, 594651, -988740, -402389, -392759, 455507, 421606, 556959, -526237, 524699, -628816, -160233, 270830, -471109, 117080, 678987};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques655(){
        Integer[] array = {-877957, -577571, 127713, 653761, 12042, -689273, 667062, -682132, -341476, 67245, 981856, -912261, -957816, 407191, 443995, -505760, -154882, 430048, 187195, 249227, -705308, 830762, 526503, -214402, 392728, 102107, 838533, 611845, -5587, 354034, -139717, 492132, -591749, 542110, -199155, -894869, -258650, -590229, -325954, 630958, -788178, 887108, 296613, -571923, -312874, 489775, 602323, 132436, 945200, 342983, 820924, -357184, 314, -763793, 578884, 39805, 727068, 886551, -446413, -618769, -423472, 765547, 366519, -636612, -499840, -187107, 269222, -222211, -30972, -768278, -234997, -656323, 249611, -628990, -213688, 867711, -655283, -465744, -975649, -873858, 670148, -168645, -974089, 197641, 520215, 590780, -328335, 219318, -400714, -674223, 676882, -35295, 678404, -493338, -939782, -855781, 267601, -472592, -831067, 826237};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques656(){
        Integer[] array = {40177, -437781, -261074, -898492, -88656, -582956, -238256, 736611, 333885, 317466, -112570, -525487, 136100, -667720, 943858, -291377, -764916, 135378, 292433, -110192, -398300, -583689, 596933, -126127, 788777, -616363, -924264, -22934, -39445, -883018, -768614, 317733, 124335, -828119, -575607, 187182, -928652, -403430, -541634, 469335, 557357, 719322, -21886, 96300, 331758, -85807, 199145, -684302, -316018, -865849, 27550, -835958, -143552, 53275, -784, -114319, -279245, -769586, 478722, 717607, -25938, -506903, 654138, -50856, 923946, 129817, 491773, 678016, -278473, 1594, -151152, 467880, 423574, 299971, 924628, 552007, -351227, -319086, -514979, -9522, 811968, 528695, 417851, -443853, 984749, 145266, 117762, -417980, -653002, -932753, -49615, 63050, -227973, -235935, 727787, -633346, 419323, 775554, -259496, -810842};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques657(){
        Integer[] array = {-314521, 656041, -38314, 353508, 763849, -108475, -422829, 927027, -14246, -349728, -763537, 289085, -982522, -695502, 454304, 27617, 538683, -769939, 507559, -508461, -658448, -356126, -355103, -107810, -738936, -48205, 905439, -761449, 598265, 475982, 904030, 836232, -786745, 904763, -588298, -221678, -669310, -510638, -668852, 724735, 675033, -392565, 673458, -962944, -381174, -832945, -495225, -233632, -21895, -976049, -74101, 834482, -443802, 733969, -854016, -154218, -338062, 470851, 764843, 252641, -229283, -504179, 901019, -727544, -606108, -263344, -709468, 856212, 299861, -82109, 342404, 394628, 331941, 316421, -202038, 837593, 40214, -214873, -655737, 900339, 849115, -869723, -572359, -701595, -262477, -531509, -129678, 373301, 814851, 362899, -345330, 432694, -387285, -981109, -253728, -498439, -582435, 507680, -611798, -983084};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques658(){
        Integer[] array = {-861729, 764115, -685401, 917671, 245632, -615116, -993132, -400915, 352569, -911089, 659981, 780628, -66586, 11495, -462432, 730079, -56872, 481884, -589191, -195959, 171252, -166404, 592333, -82731, 248906, -387215, 708682, 431059, 993946, -758687, -551415, -415673, 993653, -546946, -211256, -234845, -261258, 382990, -914789, 851009, 791777, 156800, -84941, -709606, 65547, 618944, -758787, 63511, 748029, 472888, -839224, -342155, 980468, 566570, 11185, -850821, -604195, -560425, 629358, 83657, 55223, 545089, -548468, 900636, 426985, -917875, 306456, -315232, 831622, 782289, -948301, -686398, -270403, 501263, -478422, -106707, -834283, 926358, -237964, 811942, -996149, -847895, -500781, -789347, -137480, 168327, -723304, -312677, -575397, 378899, -183341, 344700, 913335, 194903, 688152, 578028, 199101, 608992, -413199, 473051};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques659(){
        Integer[] array = {905246, 310898, 399760, -458529, -20003, 639575, 257554, -651741, 276702, 689868, 84443, 189199, 849109, -658740, 980911, 455976, -271351, -419538, 324833, 915992, 401380, 163672, -686749, -274211, 647166, 331986, 768942, 9789, -340531, 448539, 59391, -963896, -356252, -549461, 179392, 39241, -539129, -278598, 49621, -837951, -484366, -892747, -920036, 69221, -865526, 174860, 748071, 808009, 705417, 509084, -476616, -979742, -930629, 206182, 79523, 995146, -319224, -57285, -338024, -227792, -488927, -285428, 926815, 503518, -878309, 75007, -222309, 22032, 765521, -106736, 476767, -743671, -652435, -698885, -112640, 649774, -509693, 167759, -409871, 489822, -146761, 732913, 682081, 591737, 138232, 860607, 491207, -841865, -875691, -818694, 317630, -717381, 78536, 553449, 244802, -739780, 587053, -120919, -67022, 452303};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques660(){
        Integer[] array = {-117368, 978102, 692565, 521050, 96305, -394795, 194186, 241340, -842539, 292077, -678966, 197563, 378991, 743931, 480718, -92070, -498637, 494844, -553884, -935556, 539039, -452122, 87194, 693647, 233495, -678921, 389727, -398937, -35195, -878094, -684728, 211938, -844147, 948356, 745666, 234392, 40613, 426618, -417130, -232924, 128434, -673285, -381084, -297358, -548602, 868891, 442161, -58622, 594309, 44646, 65849, 793829, -580895, 562639, 827595, 436979, 33611, -67852, -171268, 532242, 966462, -247467, -835297, -289354, 221671, 414059, 588532, -502557, 729011, 547863, -723451, -534715, -513781, 900169, 703646, 823131, -595666, 593439, -426710, 251591, -431507, -954873, -105594, -873172, 609812, -136175, 360832, -377212, -989106, 856152, 799123, 193446, -24056, -683412, 410512, -922356, 50591, -323320, 88878, 513154};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques661(){
        Integer[] array = {-154989, 805336, 431640, -612158, -796711, -80745, 595021, 690455, -284163, -389187, -427920, -924928, 116076, 361136, 5954, -640922, 358749, 651102, -180300, -494399, -202250, -624979, 781871, 666959, 437878, -99983, 470800, -671422, -735178, 27120, -518872, 998342, 932251, -248709, 426524, -131753, -125556, 12927, 116872, -433096, 956630, -575445, 198824, 613185, -253931, 649315, -692688, 69314, -969093, -143072, 57744, -973639, 587593, 423249, -10027, 400859, -954525, -281332, -915285, -769317, 586665, -778940, 34452, -431390, 979581, 748844, -747743, 4330, 208356, -730937, -156227, -942312, -746677, -68412, 522772, -396211, -981673, 116627, 731651, 155396, 542865, 631614, 955165, 335803, 422417, 244414, 454315, 494192, -283748, 889855, 982591, -819393, 32883, -55944, -441932, 763742, 663009, -595007, -215808, -478310};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques662(){
        Integer[] array = {800355, 762542, -750879, 828009, 773462, -236745, 992461, 979331, 10978, 842336, -245555, 376775, 674314, 955205, -475859, 168280, 354104, -766492, 766874, 504757, -297508, 730952, -984026, 96039, -757949, 445315, -863211, 823213, 986845, -385788, -44645, 154784, -297840, -248898, 841556, -581818, 328492, 454979, -963286, 148663, -232585, -811750, -412909, -718251, -847518, 743358, 594908, 589017, 623048, -535350, -241953, 23738, -489919, -308012, -329408, 430104, -43876, -900728, -120436, -778243, -521196, 588252, -90489, 952696, 626863, -743917, 131591, 703073, -712600, -830970, 103870, 715112, 129905, -553524, 690888, 561891, -331402, -156985, 259789, 608041, 299489, 509906, -389712, 623857, 251065, 90231, -904471, -587373, -629962, -45241, 214982, -664109, 1519, -446891, -296265, 939997, -910808, 629623, 577752, 768178};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques663(){
        Integer[] array = {9173, -868284, -481720, 837143, -181250, -826791, 883280, -700094, -397775, -852168, 217919, -50604, -535988, 634824, 503241, 595753, -243330, 80126, -565554, 854518, 580890, 234008, 642869, -446288, 943372, -716560, -449041, 967029, 314765, 396669, 49743, -505108, 378500, -28624, -926868, 104726, -908638, -532047, 489678, 901132, 465229, 785765, -594011, 768854, 897359, 665350, 398811, -819427, -76510, -610880, -862489, -890371, -468750, -945965, 507512, 605263, -26726, -712364, -394191, -365412, 366614, 634358, -389025, 647963, -609391, 755620, 403637, 509047, -950168, 340840, 957727, 626700, 554441, -522600, -307483, 309194, -509072, 526985, -727664, -200243, -428384, -336140, -293965, 883095, 263531, 158072, 165756, 481002, -587094, 347198, -594222, 337253, -96218, 425671, -919276, -881588, -374290, -156303, 538434, 592900};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques664(){
        Integer[] array = {85300, 424139, 771375, 125703, -549709, 482195, 810343, -407571, 62121, 435493, 896805, -4916, -353890, 942591, -573045, 841162, 280227, -322343, -359914, 678088, 415580, -106580, -336957, 554164, 660371, 756725, 919297, -363623, -381912, 101753, 24142, 996128, -955474, 13072, -870968, 34255, -727061, 618864, 292742, -178839, 235, -415870, -872506, 824821, -548567, 665824, -625400, -876566, -762651, -317548, 461046, -405635, 99896, -170339, 741686, -369095, 255748, -609109, 183800, -472521, -533496, -726271, 484449, -299856, -55218, -711841, 57156, 634056, -873099, 80001, -574169, 970447, -290918, 324906, 367034, 657357, 690256, -595808, 428222, -425169, -920119, 517372, 75433, -883890, 944747, 617156, 536295, -868923, -15819, 927297, -397857, 300650, 721343, -663484, 1110, 402473, -312730, -223969, -380038, 514844};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques665(){
        Integer[] array = {-721610, 356512, 958360, -342015, 891580, -618178, -995779, 39890, -837870, 705133, -642477, -424184, 417424, -26833, -546949, -301293, 203481, 461537, 655237, 926753, 744664, 594116, 986421, 234173, -419153, 60628, 464855, 983101, 224640, -676731, 185902, 7805, -282182, -589649, -324032, 589712, -977372, -199312, 456543, -319074, 809666, -410123, -310380, -3688, -431454, -188146, 202681, 142310, 401189, -527321, -983700, -859337, 212372, -96865, -680114, -765969, -423843, -650625, -77481, -223383, -790464, 137933, 611563, -544665, -244355, -324663, 530482, -822898, 87798, -23583, -515735, -76521, -638483, -658196, 163022, 709840, -906620, 775385, 853332, -48298, -682336, 947936, -606358, -687831, 630589, -433596, 637853, 410211, -511031, -786194, -184427, 851491, 226877, -114704, -836522, 651493, 596085, -858728, -413999, -561637};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques666(){
        Integer[] array = {151417, 819020, -401851, 219605, -932477, 466595, 727082, -62536, -250640, 477823, 74070, 983936, -781279, -734721, 347048, 968872, 837980, 29038, -83069, 200964, -640145, -543118, -398836, 512153, 705237, 750657, 32052, -898198, -525973, 518524, 228068, 277885, -18430, 888766, -25144, -251552, -180595, 347431, 870664, 297866, -335658, 349169, 379052, -598798, 840017, -862707, -838392, 536022, -201293, 175628, -815788, 209572, -848903, -835216, 589314, -121496, 449893, 352860, 129440, 217507, -677444, 356215, 420104, -580201, 653788, 716909, 431452, -92173, 957274, -208890, 52720, -632324, 459027, -237360, 729880, 897635, 524126, 969915, -268488, -308105, 730001, -550997, 162820, 435967, -129094, 812715, 893434, -517354, 112798, 119945, -911794, 627126, -271038, -846460, 254083, -2704, -620930, -119308, 564255, -721203};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques667(){
        Integer[] array = {-724375, -315456, 405551, 293839, 527651, -805691, 654519, 326292, 14019, -637489, -538225, 460070, 935899, -950756, 61333, 531848, -473469, 70982, 39593, -477870, -554939, -336931, -366786, 116879, 309440, 961615, 548306, -88654, 861833, -258259, 12286, -960115, 493073, -883539, 16057, -196277, 517483, 628250, -736355, -450764, -875218, -997878, 17045, -897053, 412695, 693262, -737818, -494714, 330257, -286775, 71160, -840248, 304200, 394803, 847435, -468422, -686130, -852803, -278493, 760427, -347958, -718972, 313250, -579595, 968999, -67894, 421713, -385237, 103186, -602716, 266005, -523470, 644559, -570220, -867506, -983196, -128789, -245347, -137258, 430306, 370528, -358946, 257208, -416663, -952649, -977586, -580872, -72281, 660965, 703751, -106434, 896975, 596622, 167004, -172758, 599898, -620599, 190064, 880927, -628804};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques668(){
        Integer[] array = {922049, 975281, 869095, 299387, -356226, -76468, -781559, -357391, 550840, 384947, 831170, 732207, 762455, 579956, 811160, 578725, -738986, -439780, 176491, -211357, -33447, -847354, -76450, 872154, 73230, -533431, 536605, 718949, -21487, -107888, -945539, 668386, -33017, -760364, -646774, 835545, 615684, 624680, 141498, -955314, -215400, -773699, 951024, 915340, -299137, 850191, 300568, 308912, -725345, -471909, -785150, 875092, -658011, 8167, -720728, -604767, -767952, -271309, -485965, 531142, -594236, 694428, -733656, 914526, 292087, -84888, 513380, 107937, 129625, -87383, 504235, -20602, 445571, 465562, 619647, 429080, -626519, -861436, -376409, 212760, 259759, -810613, 565043, -250910, 587700, 767819, -865958, -894749, 895324, -443619, -948607, 473119, 329177, 276085, 686232, 398241, -291424, 294370, 349519, 346105};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques669(){
        Integer[] array = {705770, 33025, 720517, 752646, 766751, -961105, 95470, 901618, -729495, 901921, 77214, -833860, -383291, -868648, 829650, -145463, -795071, 176266, -206225, 788027, -366188, -19304, 136655, 1864, 381567, -327951, -819147, -144330, 527849, -175697, -566411, -77351, -34374, 490733, 397267, 323562, 272524, -547010, -671011, -783839, -534502, -651502, -788116, -278742, 71495, -521119, 397848, -27409, 216466, -637056, 341467, 569836, -239935, 900650, -719522, -93818, 963434, -14572, 690621, -988043, -237909, 564659, -586026, 657529, -469365, 154464, 55763, -498241, -814983, 19408, 313906, -476017, 979729, 575155, 698311, 872380, 467343, 839179, -218939, 330685, 30492, -822463, 907799, 713677, 981087, -962024, -136076, 452069, 154553, -491972, -899178, -91422, 363976, -683790, -271095, 453786, -165740, 190626, -988080, -947304};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques670(){
        Integer[] array = {892298, -617568, 738663, -207961, 138758, -86619, 66104, -129011, 954573, 534883, 204146, 734630, 289128, 369664, -294374, -230929, -667009, 844974, 184508, -184123, 95057, -674295, -530692, -472742, 723454, -923063, -604170, 189132, 920302, 109417, -445159, -217488, -619482, 114057, -90706, 988733, -17635, 995932, 169078, 944222, 550171, 719008, -582454, -565963, -862294, 486314, 300965, 624494, -849877, 43898, -62309, 458545, -318823, -190049, -677736, 287092, -959747, 541799, 491744, -799378, -293558, -518873, 822013, -345721, 356007, -708013, -251309, -500259, 948326, -954464, -855948, 714687, -849067, -429421, 239159, 805739, -563606, 623145, 345740, 566646, -327799, 603862, 261259, -655556, -888996, 915446, 378405, 638098, -722267, -98968, -342979, 415379, -254801, -930405, 411755, 926140, 791888, -749482, -933205, -229546};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques671(){
        Integer[] array = {933776, -620745, 823689, -828071, -663216, -915056, -203155, -42254, -294137, 551156, -188149, 334178, -731064, -773315, -259724, -570093, 48422, -38182, 722236, -508911, 291201, -126559, -474733, 25248, -406016, 791237, -294692, 91655, 132922, 137410, -415904, 869434, 914082, -919027, -276597, 888335, 860584, -464384, -403469, -607756, 43806, 188385, 525336, -357310, -876679, 814922, 510406, 44651, -127446, -839227, -928640, 814200, 775147, -101602, 885536, 564746, 298606, 510684, -563301, -205201, -163191, -389767, 890495, 462056, 543748, 605320, -903085, -964736, -688603, 505566, -630766, -288838, 495374, 545301, -784855, 503254, -534235, 336532, -458820, -416238, 252079, 828992, -988229, 813829, -282770, -711285, 183687, -466039, 242317, 596087, 872741, -768613, -125139, -701564, -230288, -16152, -20436, -262016, 354929, 836777};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques672(){
        Integer[] array = {403843, -526780, 702933, 253779, 708979, -281160, 808658, 311783, 733278, -808091, -52822, -874456, 819817, -40450, -981546, 689114, -946889, -308898, 733757, -426330, -179156, -541409, 492643, -715325, -32168, 395389, -762202, 486594, 441951, 881163, 22041, -376581, 704629, -829723, -378900, -434099, -887976, 640342, 843568, 719201, 674638, 66773, 665070, 536264, 558100, 137202, 44235, -579037, -933873, 158522, -507084, -296675, 371966, 138921, -448702, 841195, -975062, 152631, 271772, -476910, 593061, -569734, 295813, -117446, -364448, -152273, 826195, 528583, 100974, 360608, 155352, 895328, 479768, 458014, -380133, -937537, -79519, -699223, -412881, 243450, -706110, -532195, 287398, -828124, -130281, 567039, -15191, -880909, 169829, -394411, 466257, 498458, 174914, 260440, 410708, 255611, 931566, -266368, -371249, 86729};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques673(){
        Integer[] array = {-636504, 822321, -778817, 843698, -202929, 161435, -428614, -2746, -861007, -219320, -661626, -703269, -126456, 692326, -899696, -321007, 563781, -336849, -126880, 342514, 683784, -628629, -292744, -633911, -2356, -414319, 544724, 27353, 521417, -665095, -927167, -263046, -484440, 930479, 774569, 476713, -363561, -858125, 225451, 268628, -165068, 637623, -965776, -390644, -941984, 155999, 405281, -164344, -717535, -234480, 140577, 121024, 383032, 787818, 52532, -448486, -360151, -879250, -418812, 163510, -201702, -261038, -856483, -726984, 871823, -152737, 104350, 5462, -548610, -256456, 143525, 171472, -929461, 504603, -614435, -527138, 208680, -540101, 326033, 524985, -61471, -698062, 588979, 485837, 875184, 541741, 310176, -266935, 35756, 773504, -608735, -570669, -135593, -596691, 141945, -385807, 377881, 505754, -563867, 309653};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques674(){
        Integer[] array = {676065, 836895, 942267, 701005, -561239, 224391, 646314, -137980, 268990, 734564, 130658, -351457, 538350, -531267, 668205, -584650, -821755, 644574, -933000, -508577, 388536, -804357, -812940, -402358, -531777, 659672, -539520, -85236, 946740, 187520, -620556, 728160, -955926, 179719, -149032, -604412, -236865, 350507, 603708, -515966, 807494, 882391, -344434, -528201, 794811, -122484, 114679, -519061, -54082, -612163, -96066, -751792, 788630, 245116, -903829, 662678, -779828, 477770, -874013, 640825, -646665, 185942, 204253, 899951, -499697, 716908, 865949, 267561, 44411, -146898, 617179, 943237, -720830, 632251, -284604, -282249, -549509, -594037, 831756, -421217, 276708, -933273, 813029, 27103, 459162, 932378, 462546, 313244, -202620, -835260, -988851, -40490, 584744, -379641, -328675, -188915, 982282, 974715, -220060, 675904};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques675(){
        Integer[] array = {-319895, -887769, -756070, 635167, 868119, -852068, -21903, 57950, 890384, -20248, -922803, -184739, -125918, 862300, 579844, -591614, 805939, 361714, -802184, 256696, -564065, 465945, -113705, -654642, 968906, 31039, 133209, 46103, -979878, -155174, -227980, 475841, -26987, -241716, 532332, 767607, 57225, 175252, -407327, -183054, 875249, -409937, 704814, 765052, -617645, 27196, 726590, 404405, 646818, 846881, -273074, -852581, 903529, 9030, 258235, -789082, 451396, 909554, 25620, 120407, -275356, -794595, -50883, 753983, 775551, 479922, 949951, -357054, 470307, -817145, -451873, 671597, -659495, 535306, -1502, 304836, -966463, 568854, 577292, 492555, 319733, -277327, 651357, -369642, -562863, -199671, -533019, 444834, 113037, 571542, 6355, 949025, 330091, -149457, -111358, -840982, -766627, -822107, -13500, 977486};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques676(){
        Integer[] array = {-890220, -155885, -906019, -541278, -915991, 467502, 682656, 173861, -66497, -386311, 673525, -114817, 867986, 517082, -337874, -152476, -999581, 486942, -925276, 780039, -701495, -464818, -626363, -235849, -512278, -278583, 980577, 353319, 836838, 152672, -44334, -734479, -60439, -156770, 415742, 69483, -282103, -540709, -204266, 925074, -601012, -298162, -714598, -875809, -343362, -737410, -255381, 855371, -639827, -465189, -78077, 919805, 437312, -854067, 807204, 488749, 340635, -315089, 518186, 590400, -972712, 451719, 711720, 7339, -563955, 358679, -639411, -429239, 221621, 632042, -343669, -724020, -938262, 605282, 760116, -799775, -901451, -816195, 694811, -223091, -449893, -657508, -583551, -48377, -11520, -475392, 380413, 863139, -818046, -69283, 510744, -407489, -150115, -742739, -887671, 343834, 874418, -821971, 28901, 75862};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques677(){
        Integer[] array = {253250, -127760, 458992, 749942, 500768, -334002, -982745, 976526, 30199, -138502, 875196, -104402, 417527, 750811, -318542, 884411, 235843, -133514, 336470, 510541, -649150, 477494, -25167, -987580, -789292, 155832, -875810, -349385, -684809, -431903, 543389, 12175, 735029, 405982, 133804, 672746, -482216, 38298, 92022, 244332, 677837, 770605, 699560, -233529, -817154, 65411, 984678, -802863, -992243, 559840, 199922, 125577, 496980, -492373, 230474, 277678, 697897, 181098, 543307, 915670, 464062, 312494, 953934, 880998, 333779, -137485, 11306, 791637, 187287, 896185, 21687, 993038, -641444, 562329, -71822, -517560, -613768, -836314, -910741, 330172, 465148, -723268, -72830, 980474, -264618, 539592, 150662, 462004, -406522, 803370, 829839, -700891, -411203, -483119, -997710, -29366, -110692, 776554, 362267, 995227};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques678(){
        Integer[] array = {-295720, 344920, 879605, -711074, 371471, 529051, 252746, 508678, -623693, -457169, -882040, 481645, 956080, 742030, -676213, -432476, -678073, -28885, 23425, 591368, -680881, 86762, -975275, -218355, -292883, -607874, 213624, -958608, 623441, 455834, -739670, 445068, -294321, 364186, 174348, 891097, -527666, 350947, 719775, 721564, -151042, 143947, 633171, 655578, 380945, -857352, 933842, -254175, -203076, 295697, -946063, -793029, 861167, 881607, 895240, -348072, 368135, 355301, -109451, 319566, 895952, 260769, 163340, 827210, 127093, -488551, 791437, 909820, -68987, 429091, 781205, -502039, 655569, -515391, -856082, -153175, -694296, 772575, -718994, 426511, -76773, 245448, 417398, -29987, -575408, 407333, -846371, -599319, -147611, 793740, -41257, -873664, 322397, -133801, -883467, 993491, -664731, 959451, 496666, -521250};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques679(){
        Integer[] array = {-802082, 844044, -940453, 190019, -724940, 434992, -653952, 849314, -504985, 173839, 824302, 731285, -702289, 792571, 962822, 14562, -650260, -154908, -71114, -585848, 942036, 3497, -599349, 3429, -986212, 752804, -458021, -672586, 652566, 847578, -309352, -857740, 221787, 984829, 558477, -844251, -324033, 959648, 21041, 313095, -274846, -206669, -107270, 879948, 383510, 182831, 43319, 961865, 940862, 939150, -318132, 316963, 574277, -987793, 471463, -223130, -930052, 339784, 250282, -232002, -376493, 277961, -559458, 255413, 477657, 832901, 232435, 396786, -766411, -566482, -568975, 721712, -287295, 129000, 946908, -941687, -819983, -748001, 123198, 249449, 681768, 814604, 893842, -773839, -971324, 714986, 406582, 859369, -106128, 403683, 576286, -874651, 794592, 547727, 951116, -641885, -569165, 336002, 532260, 740729};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques680(){
        Integer[] array = {756036, 215760, 205875, 512673, -922480, 630026, -405635, -943871, 560911, 861491, -683059, 203889, -789906, 804428, -857703, -902062, 231575, -260, 847240, -790082, -332216, 464435, 502762, -118357, -350811, -89606, 15475, 873788, -79478, 741174, -959573, -302189, 306455, 967648, 591544, -145395, -555616, 503849, -899641, -149260, -584872, 454185, 235671, 749305, 512574, -430872, 308562, -983337, 277129, 127688, -305636, -774629, -100225, 920057, 203155, -648192, -132371, 46023, -39943, 5352, 452541, 247132, 606895, 697535, 512856, 584852, 111729, -394514, -655829, -385503, -828817, 847572, 91977, 318048, -820308, -471317, -371459, -677691, -175978, -776807, 459208, -213332, -926127, 534697, -670801, -197449, -807969, 266652, -157277, -261623, -655807, -568443, 28362, -43522, 127070, -971733, 946736, 424993, -838484, 743831};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques681(){
        Integer[] array = {398954, -457218, 677518, -360915, -70398, -721605, -507414, 718619, -497643, -283430, 667741, 938994, -870392, 812695, -508480, -478232, 124925, 514468, 604630, -264855, -989017, 897306, -433624, -551836, 713520, -487174, 827193, 988028, -990714, -591351, -481789, 662076, 528875, -962560, -731660, -834019, 871350, -585348, -954166, 519579, 757588, -381969, -654667, -981234, 897398, 606268, 280287, 144489, -240092, 745229, 336245, 324706, -643883, 657609, 963220, -798136, 117781, -552784, 289879, -998549, -539245, -884618, 371433, -609675, -421738, -970323, -824454, -423115, -156313, 390707, -659946, 411980, -243140, 817781, -13694, -790806, -241061, 197845, -916574, -629618, 102301, -319705, -755981, 852890, -303318, 101513, 508467, -727732, -617511, -170274, -283341, -176441, 782302, 293093, -609454, 120788, 40591, 797814, 738842, 236591};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques682(){
        Integer[] array = {-718838, 243272, -437655, 284861, 806377, 659098, -222996, 797261, -492436, 477977, 880785, 847348, 146275, -501883, -598035, 868853, 979054, -839146, -912609, -21080, 562706, -392927, -808738, 295365, -803926, -795936, 253711, 234301, -363518, -665245, 921438, -506317, -191973, 681393, -46605, 908674, -88981, -84128, -404408, 732931, 687899, -115262, 225654, 671438, -249883, 977569, 387710, -34746, 424417, 504374, -871150, -791647, 278566, 897618, 637211, 709889, 2958, -917073, 671923, 250133, -2109, -778389, 406359, -397028, -277807, -398524, -3753, 260535, -719238, 78309, -896754, 31263, -129323, 200540, -277511, 479624, -891613, -72640, 832990, -885398, 991943, -170659, -659329, 770683, -956657, -985047, 863523, -109362, 252265, -442680, -908679, 280990, 982730, -562320, -370801, -277341, -237999, 530598, -567351, -567132};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques683(){
        Integer[] array = {549007, 7421, 464523, 898349, -582781, -154134, 830234, -277204, 348882, 1508, -221836, 982280, 974498, -978819, -441426, -740107, -812305, -649061, -645612, -146826, 199503, -839290, 451160, 813498, -852796, -724344, -528051, 170676, -168259, 752907, -158020, 813330, 873229, 634426, 932308, -300331, -199556, 842635, 969606, 146122, -369723, 314415, -786203, -721043, -701757, 597158, 956864, -355803, -102566, 376038, 933498, 116512, 476153, -370018, -121486, -176705, -952796, -662822, -400782, 546868, -628120, 290860, 533247, 859121, 189120, -396036, -193494, 986895, -194526, -552115, 88431, 247358, 48851, -433173, 16464, 108576, 351417, -385105, -976842, 306004, -341766, -9002, 255939, 815226, 328414, -322688, -732945, -895801, -335300, -748588, -57012, 858394, -309820, 14698, -784667, 677544, 159806, 813166, -315162, -524557};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques684(){
        Integer[] array = {-918985, 468464, -568176, 529253, -691781, -577029, 612006, 465532, 171387, -281535, 46239, -10574, 73585, 213088, 3811, 784908, 739421, -201492, -229273, -734033, -357722, -808724, -889788, 106738, -407408, 792037, -142669, -97509, 934423, -130967, -477983, 617905, -124462, 458556, -89147, 628131, -320757, -970382, -694930, -707519, -307980, -956180, 156890, 806752, 157953, 515418, 779687, 982556, -231004, 5620, 725286, 797054, -276268, 384367, 548620, 433345, 702146, -721183, 341712, -586421, -964401, -220412, -595435, 400473, 318295, -128904, 715123, 4751, 502614, -945127, 508889, -592613, -974646, -775789, 808611, 88976, -986292, -81587, -774890, -740498, 307155, -406225, -428703, -489138, -160511, 702920, 620879, -570172, -212375, -346979, 602284, -97311, -381985, 924020, 296230, 744335, 349278, 880766, 969262, 72708};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques685(){
        Integer[] array = {962536, -519810, 115578, -969865, -891044, 199008, 882821, -154226, 646889, 257706, -498409, -532167, -497505, -613666, -624115, 849698, -360946, 29886, 816056, 733433, -915539, 914600, 77100, -565701, 687930, -2014, -810220, -55295, 196476, -379273, -703709, -334961, -642239, 987233, -193424, -661489, -780560, -411148, 605469, -190597, 999749, -548561, -776690, -704853, -745040, 105778, 865909, 30395, 939207, 322671, 246053, -813714, -758859, 764573, -776976, -882712, -359433, 446730, -894072, 734159, 342314, 860279, 288745, -508178, 914575, -45226, -656436, -428251, -535901, -446633, 33977, 377874, 831425, -544734, 95530, 493078, -368278, 85096, -393760, -497411, 65512, 355909, -884874, -17621, -514502, -602053, 190809, 225692, 847688, -504709, 636844, 660797, 485310, 327947, 710429, -391635, 488265, 675536, 351006, 270754};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques686(){
        Integer[] array = {-927687, -933178, -178112, -48930, -286602, 497219, -303508, -801757, -695421, 638187, -632085, -397403, 791443, -342130, -957851, -421308, -392382, 692514, 318902, -378241, 165322, -981630, -784907, 291078, 467912, 612744, -171454, -146391, 747660, 971497, -261448, -899333, 786967, 996447, 499252, 268389, -390455, -947969, -511676, -745050, -141587, -537629, -56762, 703280, 955799, -579910, -285502, 188705, 509826, 492597, 162197, -913906, 796383, -940823, -690243, -320811, -382413, -40032, -101441, -4023, 282456, -674193, -90014, 731259, -190160, -410161, 656646, 810590, -717264, -580588, 834247, 853690, -136576, -670711, 876828, 44598, -606852, 477463, -175442, -655688, 862000, 841743, -442060, 262758, -820298, 70136, 811427, -458928, -437384, -319276, 829161, 203423, 918724, 962515, 46195, 975850, 24406, 145725, -629036, -678584};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques687(){
        Integer[] array = {-752049, 256146, 90109, -371403, 682868, 498883, -561671, 808161, -631643, 770751, 507415, 890684, 676987, 298285, -836595, -880425, 425457, -687383, 343983, 86136, 708960, -356075, -495727, 47633, -293312, -745920, -50691, 597078, -167544, -259874, -231028, 892817, 35740, 249347, -346474, 307700, -501026, 261094, -907355, 823042, 5798, -962255, -442756, 329799, -845234, 883017, 820655, -110168, 401253, 624017, 980491, -365330, -444144, -406700, -613060, -8016, 911337, -128553, 77131, 25826, 689895, -692726, -796997, 68726, -113221, 946645, -724666, -464919, 485319, 760153, -469628, -970840, 581522, 34254, 873268, 817923, -955499, 471008, -370793, 291298, -777171, -100149, 713197, -33835, 774567, -97996, 559369, 51398, 758434, 374310, 215884, 148795, -956818, -8575, -699922, 882096, -803141, -793767, -169164, -845066};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques688(){
        Integer[] array = {258852, 227665, -167398, -583174, -410008, -97559, -383292, -415340, -752781, 334592, -96730, 886050, -646913, 187331, -795566, 675525, 319756, -340756, 90866, -468964, 922675, -460604, -805020, 436553, -867153, -457868, 208219, -963606, -321361, -721460, -924294, 307905, 20795, 357793, -661252, 898719, -549454, -196943, -393542, -903033, -309531, -984619, -545008, -347643, -529875, 414345, 165084, 116791, 529919, 5875, 515189, -986229, -409153, -559305, 962138, -506973, 868729, -426932, -80893, -918152, -851516, 812092, -625597, -71119, 651634, -518491, -385544, -946805, -453731, -851643, 779408, 348421, 16157, -154399, -532011, -606495, 534707, 802653, 293314, 146189, 959142, 151994, -874357, 755151, -587101, 561446, -259597, -324682, -988257, 829699, 231481, -33618, -206527, -807957, 747347, 701942, 906505, 518636, -530897, -37691};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques689(){
        Integer[] array = {938604, 761698, 597557, 742806, -613402, 482394, 959819, 971150, -832829, 632334, -359008, -119480, 694536, -845263, -328472, -971505, 685325, -400583, 912386, 651123, 998409, -294662, -788097, 188269, -667578, 687140, 165892, -227874, -399081, -232939, 813308, 25264, -504771, 900624, 551435, -433402, -476020, -157588, 72027, -5892, 802827, -429833, -314090, 155760, 802612, -336107, -880073, 930474, 994408, 605849, -109987, 672354, 138628, 241930, -762861, -536796, 875231, -53942, 672740, -948963, 631024, 363125, -879806, 634092, -577074, 764420, 423340, 288558, -939021, -174313, -285987, 484675, -417971, 403627, 140270, 162162, 597277, 382483, -539768, 156562, 30619, -817511, 611184, 779933, -345395, -628524, 870534, 462133, 385737, 822544, -220801, 642799, 226705, 928800, 975164, -876343, 600022, 699988, 752562, 745451};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques690(){
        Integer[] array = {-316820, -852254, 904651, 730333, -116419, 985582, -777696, -962635, -403469, -242723, -42156, 516526, 641186, -834817, 243990, 745414, -688479, 330907, 993821, -506930, 419355, -31160, -591920, -316356, -548841, 868693, 609097, -853863, 201567, -882674, 623501, 991468, -329717, -599821, 705900, 205294, 90242, -896736, -768621, 153394, 433710, 853270, 91187, 396824, 652939, 92432, 256945, 919830, -380762, -274360, 949415, -700582, -504589, 263090, -374499, -474550, -48442, 537858, -702818, 102252, 645340, -769308, -19519, -716938, 250247, 156536, -281433, -112902, -566802, -806733, 631903, -560796, 282432, -458363, 458272, 181146, 758166, -767035, 371158, -491469, 456412, -491903, -777964, -502013, 539036, 663880, -188478, -776847, 602307, 921774, 404983, -275273, 80633, 681785, -229820, 263920, 572411, -995392, -486143, -757565};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques691(){
        Integer[] array = {-512524, -852757, 146767, -160052, -5639, 682547, 246345, 214097, 710149, 574451, -673150, 483973, 526558, 639479, -411329, 992506, 244908, -581493, -498959, -508018, 288048, 914257, -735392, -477355, -85126, 768414, 340595, -209013, 696582, -573219, -135070, 313117, 334949, 628238, -161452, 12180, -782324, 658093, 435868, -265211, 268839, -981904, -174839, 14799, -969450, 757161, 918958, 852414, 457131, 423406, 284578, 487869, 680450, -779639, -656531, -219952, 361377, 838877, 847011, -261423, -424062, 136213, 97952, -96423, -813653, -571219, 723185, -110033, 205133, -124101, -847619, -216937, -835574, 476061, -803476, -198876, 384717, -661994, 461999, 867488, -766015, -370769, 987656, 428057, 513753, 908674, -282591, -141184, -760243, 695244, 272444, 889299, -609520, -846640, 268121, -716327, 197847, -155706, -714009, 121009};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques692(){
        Integer[] array = {504680, 947408, 828671, -52872, 213795, -799873, -911680, -883120, 732798, -578459, -196552, 506503, 890865, 699299, 492795, 55584, -374222, -222606, -378115, -662874, -803827, -698103, 499114, 776460, -916783, -250549, 956920, 747774, -690001, 738488, -508358, 270711, -333639, -771509, 850648, -71674, 898657, 448570, -182037, -934898, 52897, 748592, -151358, 450149, 404548, 723091, 763211, -306389, 319033, 219798, -891453, -889620, -476645, -735237, 236936, 784620, 295061, -258460, 355701, 17749, -843493, -752065, -452944, 167037, -596436, 889870, 514527, 265164, 707987, -775737, 729286, -853383, -547041, 126785, 429034, -788386, -79018, -129839, 375528, 466617, 616151, 370069, -113022, -832301, 155480, 210256, 96683, 943905, -436376, 253102, 124301, -314757, 833263, 184189, -317946, -415132, 100129, -757478, -360375, -427520};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques693(){
        Integer[] array = {-982705, -111226, 926514, -35882, -542383, -180671, 886621, -591760, -911656, -375951, 904759, 917646, 18336, 889480, -969560, -239345, -617141, -229583, -166299, 74483, -578892, -259821, 593512, 896714, 633677, 964888, -53774, -424699, -30090, 675545, 231907, 761919, 461589, 208424, -591176, 359348, -502236, -752721, 729894, 954326, -597063, -97677, 126512, -742320, -788069, 179922, 527529, 917284, 538741, -589650, -42122, 76739, 198180, 972166, 644851, -13735, 92723, -660411, -534841, -513292, -95270, -728133, -934929, 112284, 55540, -660778, 373825, -344125, 913365, 816114, -577803, -568926, -535228, -175745, -391624, -758220, -590729, 212612, -975043, 780844, -627496, -778437, -654669, -828708, 172314, -254855, -23810, -43265, -344940, 600448, 632475, 896377, 346606, -79826, 164300, -141944, -638679, -274237, 410663, -705237};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques694(){
        Integer[] array = {621708, -875721, -170586, 872841, 436728, -2379, 739282, -95520, 852560, 513211, -626828, -238129, -552206, -924657, 620708, 421539, 728991, 788174, 586303, 243222, 126758, -172945, 698208, -136198, 876862, -189231, 716884, -402397, -909010, 408782, 381240, 217751, -985673, 114552, -148305, 202297, -561632, 561029, -458886, -520088, 915961, 222656, -514179, 527200, -73302, -212617, -404620, 961685, 751878, -137276, 683909, -837824, -637098, 647964, 154349, 331626, -786771, -73854, -481876, 318237, -127998, -413623, 539015, -63018, -221721, -319069, 625082, -397920, -446397, 927514, 263513, 316896, -909363, 777952, -886495, -987366, -712233, 286364, 410537, -788416, 276289, -22901, 300934, 386747, 118514, -294628, -399695, -652839, 439158, 934315, 639023, -450829, -241342, 442015, 14560, -853668, -142434, -636663, 560778, 596162};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques695(){
        Integer[] array = {810551, 870337, -189285, -181200, 708184, -374675, -517135, 712066, -908212, 486663, -668986, -139319, -499412, 103709, 243999, -766417, 981013, -446174, 670611, -38672, -766862, -183845, -692523, -916113, 201352, -741896, -135486, -752525, -81328, -398665, 354993, 995975, 851018, 978798, -28754, -740772, -929274, -496914, 583208, -659641, -712172, -928202, 177162, 58047, -173978, 656007, 808364, -897805, -869560, -816431, -908990, -738764, 110550, -804320, -981806, 529435, 289855, 346896, -906941, 754359, -529954, -972833, -116326, 637138, 789618, -601609, 551467, 263410, 369845, 18532, -153529, -894135, 489151, -232773, 931977, -4256, -979849, 731933, -449214, 583785, 689905, 133335, -335074, -435752, -842505, -970013, 517390, -373007, -271546, -980687, -902967, 141614, -917717, -224493, -875463, 975987, 955115, 503930, -506504, -866641};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques696(){
        Integer[] array = {-158099, 871741, -148521, 271809, -524622, -890901, 425912, -784088, 8881, 746897, -865532, 908293, -505506, 410235, 406491, -469078, -886645, 212781, 613269, 608694, -453112, 672297, 982624, -415414, -637818, 967102, -119244, -885876, 680885, -283783, -766758, -33449, 346662, 835814, -832996, -91296, -698063, -230285, 784457, 646056, 311674, 224033, -364297, 658430, 406910, -119151, -909216, 914485, 262952, -407211, -549774, -238089, -222337, -959107, -945759, -883823, -982967, -42011, -743583, 930887, 856323, 603881, -761620, 587205, -391538, 177595, -599129, -377422, 576009, 314989, 564379, -671702, 556267, -402838, 272937, -196935, -658003, -573383, -877236, -296317, 433453, 616249, -520834, -984895, -517698, -144923, 738452, -384948, 776644, 135532, 801912, 36263, -361523, 257754, -389880, 468683, 909612, -395198, -734254, 276134};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques697(){
        Integer[] array = {-972182, -480228, -44930, 158414, 168366, -57248, -476580, -46552, -661604, 409334, 266392, 987872, -410738, -261313, 237919, 299201, 570570, -812826, 941831, 689903, -820618, 601089, 712608, -543906, 402249, 698074, -375660, 529098, -994908, -310106, 892471, 811650, -797346, -203910, 450698, -625495, 293815, -135245, 30369, -647151, -766512, -609383, 86187, -106686, 734728, -236450, 811784, 537487, 290617, 890188, -552162, 407207, 856842, 397104, 582946, -585035, 962416, -622943, 295367, 180390, -100359, -461742, 963192, 348719, 720005, -806228, -430126, -823107, -184126, 932532, 847123, 75159, -886346, -440675, 393026, 606496, -770188, 879731, 220964, 972897, -679896, -134153, -327462, 301093, -703907, 127744, 382466, -596354, -815575, -263748, -562881, -452920, -606016, -958434, -145660, 461403, -490242, -19931, 448738, -868810};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques698(){
        Integer[] array = {540082, 71719, 528827, -410716, -38344, -938715, -967668, 516339, 775066, -488473, -673512, -944691, -782352, -837101, 706659, -603644, -964706, 363032, 484900, 940123, -266133, 702160, -601432, 667334, 63540, 998705, -895429, -753936, 214670, 412204, 321566, 273426, -997740, -148395, -816278, 276579, 130377, 665952, -441261, 158396, -687114, -397242, -413194, 284522, -671437, 282945, -834685, 531697, -826283, -106269, -995211, 624224, 72405, 329154, -946994, 339952, -590010, 678872, -45580, 952572, -173140, 64320, -515223, 899254, 990378, -351903, 659382, -806274, 479640, -770382, -718270, 863807, 864167, -186611, -15853, 687901, -120976, 297979, -14771, -385535, -248351, -774608, 41690, 570393, 888955, 748314, -807974, -569391, -514917, -484963, -443635, 539099, 785829, 541444, 565501, 796299, -912820, 177581, 29431, -58290};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques699(){
        Integer[] array = {-140045, -21062, -557798, 505774, -50417, 737083, -588279, 735477, -592033, -638435, -507467, 369046, -979651, -43888, -261218, 885752, 88835, -899450, -436969, 67357, 871872, -591750, -386231, -21103, -808047, -674846, -534642, -916599, -564755, 909477, -812333, -367392, -504397, -395798, 140479, -784210, -959434, -662260, -347247, -86583, 569448, -772042, 42662, -761131, -691933, 28149, 362904, 954694, 915793, 279627, 679432, 777463, 914502, -944756, -242701, 724302, -520310, 1786, 652368, -602135, -506461, 60024, -133556, -395281, 54759, -729641, 231032, -564026, -848679, 493257, -559498, -718737, -466131, 58688, 397124, -765989, 647671, -879343, 47636, -468167, -760665, 401373, 726353, -815065, -459561, 110053, 619279, 351482, -850216, 647012, 889260, -224412, 996545, -812773, 572718, 976691, -163246, -296871, -595877, 159437};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques700(){
        Integer[] array = {201243, 565513, 270516, 148611, -696818, -300548, 493902, -80435, 911516, 753759, 48304, -250796, 371483, 422180, -155682, 559781, 984240, -838923, 780993, -460904, 39962, 428813, 13397, -871207, 332126, 486958, -233628, -177257, -768976, 355164, -414990, 785249, -84660, -39710, -426728, -74840, 424182, 396193, 76669, -967769, 759977, -365266, -186671, -547325, -285206, -220295, -938223, 517848, 206341, -711885, -153137, 921412, -647636, 760090, -724501, 434104, -414891, 843638, -469096, 962487, -975202, -14069, 464213, -844500, 325892, 212934, 406093, -766618, 870442, -865594, -350628, 639116, -626982, 116091, 369044, 476528, -27249, -776271, 909838, -439711, -637646, 364370, -48657, 953297, 179123, 371328, 15308, -577865, 7991, -116088, 52372, -213470, 45580, 852153, 702494, 330744, -968163, -484373, 481599, -433141};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques701(){
        Integer[] array = {28164, -441749, 834594, 255233, -954199, 54995, -377429, 849751, -801874, 806445, 340405, 160088, 995503, 500188, -424088, 369710, 351459, 853420, -643588, -896159, -362117, -973728, -161926, -575171, -961004, -269109, -762840, -337254, -702863, -282286, 788202, 773306, -941865, 772910, 853397, -984113, 752656, -331619, -873184, 207259, 979454, 165681, -690273, 318812, -160898, -464154, 200133, -658585, 287897, -527976, -720597, -199501, -229990, -343235, 964633, -944111, 965020, -749812, 940278, -145251, -109230, -385615, -457582, -680914, -511120, -961333, 702750, -274912, 907033, 716210, 399118, 705444, 5300, -158484, 560979, 936246, 680734, 679115, 667652, 756012, 266816, -506775, -205214, -706039, 259836, -791466, 991448, 155972, 73788, 865387, 352785, 77453, 811310, -893420, -245023, 278532, -355392, 393879, -970124, 612107};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques702(){
        Integer[] array = {318019, -73093, 596493, 413513, -788817, -577904, -590689, 360559, 41816, 10177, -519612, 292191, -680409, 413057, -471270, 540648, 334400, 869408, 758919, 583270, 327815, 781062, 532957, -543602, -814805, 278999, 238542, -592260, 615242, 612369, -958887, 345335, -350135, 140211, -14027, 697187, 599445, -57489, 908438, -402171, -630280, 179154, -576606, -327663, 148685, -795612, 349662, 952320, 271919, 908367, 831110, -752464, 282171, 275895, 622344, 673622, 642621, -858681, 799335, 645537, -835077, -821435, 61215, 897070, 726007, 70577, 207966, 320467, 948551, -283468, -452405, 34865, -24094, -719764, -185103, -880864, 319902, 393155, 582320, -708878, 941015, -263778, 758306, 331800, 527885, -231228, -392833, -690340, -411624, 308297, -481810, 950965, -85608, -922204, -485774, 146649, 568318, 809056, -185513, 514129};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques703(){
        Integer[] array = {616944, 211178, 521628, -900147, 900955, -665975, 798920, -583059, -760814, 973256, -693002, -476708, -540444, -188545, 722817, -814481, -404088, -306604, 874449, 50460, -326708, -287014, 298747, -468981, -330857, -580205, 787888, -904385, 836856, 923129, 689142, -451286, 947014, -718708, -479150, 376603, 308971, 67182, -548007, -133711, 572900, -612843, -967670, 185366, 732786, -356905, -802540, 947050, -874879, 831164, 699023, -163310, -63409, -377523, 836047, -136949, -364302, -341658, -667360, -992793, 681445, -2305, -805294, -774328, -948961, -732778, 996132, -191038, -126314, -300650, 862954, -298698, 173596, -816597, -299203, 991900, -146431, -431782, 941716, 294447, -51022, 84081, -25822, -991917, 894486, -616521, -663827, 387004, -287093, -263505, -884522, -751613, -243425, -557482, 783654, 235413, -838042, 761934, -633116, -246212};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques704(){
        Integer[] array = {-118754, -59580, -364941, 985484, 931715, 255649, 234751, -135584, -509648, -504812, -291442, -162208, 449080, -354590, 114106, 565688, 852653, 718813, -216598, 156887, -955529, -998716, 197840, -177669, 191136, 162503, -245964, 818971, 13953, 425637, 579525, -587463, 62426, -734332, 207768, 946542, -723781, -392288, 838065, -79777, -357108, -313800, -531397, 136482, 76347, 736227, 255004, 268986, 49592, 350786, 855369, -593587, 270465, -403179, -10259, -85527, 184107, -565050, 878967, -483854, -945060, -288139, -190992, -202608, 107546, 165847, 735800, 905812, 609057, 234714, -69914, -785207, 881687, 595789, -161647, 847757, 858672, -682008, -640866, -907024, 176667, 306174, -411400, 271956, -49044, 555002, 335719, 924648, -128843, -453740, -817374, 469525, -497008, 436118, 924185, -248317, -307787, 925532, -464467, -476839};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques705(){
        Integer[] array = {-714029, -933440, -490215, -13409, 370214, -688324, 427933, -849508, 801002, -993764, -444917, 849996, 918008, -663984, -434805, -228884, 226611, 561272, -489493, 98558, -596492, 208712, -111302, -746388, -794294, -715936, -659303, -256205, -578485, -116377, -813112, 796473, -379708, 760816, 642010, 657082, -418649, -316846, -194310, -60570, 275019, -930631, 442402, -89191, -584067, -590049, -778390, 784931, -648505, -715778, 696475, 50146, 858066, 746338, -968122, -119106, 995711, -27381, 605801, -589912, -337522, 978489, -284424, -934789, 658007, -859803, 894990, -261886, -632579, 16537, -439362, -853971, -58001, -233439, -215945, 369859, 709296, 407790, -958234, 933628, -82611, -47680, -562089, -936637, 145458, 273835, -153819, -725051, -394408, -736076, -191927, 762490, 8803, -256900, -451826, 837985, -267830, -496427, 743563, 705698};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques706(){
        Integer[] array = {-481888, 493399, -727705, 356932, -109733, 322087, -213102, 426064, -894520, 855307, 644718, 334268, -626354, -63218, -490914, 749120, 961090, 441367, -590986, -657354, 123997, -674073, 960, 409308, 139824, -670905, -514002, 198838, 611550, -963113, -651910, -297845, 186883, -615655, 316541, -75362, 835702, 454117, 770409, -113, 596671, -312997, -973431, -343482, -496100, 990826, 848900, -250588, -298836, 744851, -588213, -591327, 565934, 635699, 783292, 422284, -418838, -620909, -211520, -854895, 620661, -708272, -761215, 700821, 679922, -64850, 416935, -106666, 229306, 319685, 812121, -46076, -324813, 866360, -338152, 245637, -814876, 642763, -929840, -893485, -768324, 924937, 670, -78273, 681232, 554398, -455469, 890798, -558244, -715391, 493470, 156400, -88179, -154552, -503773, 945390, -840287, 524824, -56953, 734123};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques707(){
        Integer[] array = {918740, 382144, 174678, -51567, 413955, -406113, 231721, -825605, -577325, -189994, 284868, -635322, 703147, -440518, -98447, 296595, -293587, -781902, -995116, -545877, 382305, -967347, 832510, -63678, 774632, 515240, -983594, 474188, -726296, -655960, -868651, 5657, -158353, -814402, 495372, 453667, -72167, -170151, -618956, 468486, -723806, -324797, 369482, -796663, 740153, -124142, 841655, -182918, -111474, -946449, 432998, -393659, -789220, -187046, 899849, -104336, 537569, 906649, 390814, -325772, -683013, 551733, 359589, 518612, -602071, 487482, 175499, 311940, 646686, 405079, -142533, -468651, -89842, -574211, 819347, 698204, -309297, -522938, -321852, -218374, 457365, -849631, -157214, -326392, 999744, -580797, 58965, 406230, 551511, 90686, -923383, 104337, 579967, 670418, 603309, -455708, 97006, 295974, 897520, -380107};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques708(){
        Integer[] array = {913122, -686813, -616178, 560550, 94668, -841140, -313709, 469073, -360766, -636712, 277538, 798986, -241904, 495836, -454003, 993256, -850643, 986042, 377875, -645124, 448358, 150041, -762958, -570802, 957854, 57500, -925441, -490458, -742377, 792414, -779274, -215973, 744464, -977727, -859620, 252584, 612809, 425814, -389392, 827851, 238820, -295949, 799903, -881761, -52259, 823117, -798242, -775269, 171857, 981931, 459008, 467503, 849712, -349052, 893844, -183237, -352329, -286565, -591738, 58125, -870151, 447051, -33589, -376530, -632044, -560931, -35239, -228619, -883934, 940392, -923546, -849864, 105951, 266501, 124657, -369001, -810276, -279574, 560373, -722180, 648450, 869238, 683694, -393299, -534022, 450684, 649298, -675155, 950796, 672296, 470870, -780941, -257700, 149297, -248943, 359847, -867181, 762892, -830151, -422387};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques709(){
        Integer[] array = {-578011, -519149, 902531, -321851, -861531, -350597, -735081, -219854, -28517, 75008, -295294, -381837, 509427, 714090, -716942, 594282, 833000, -376143, 918379, -748536, 659185, -109336, 360397, 883961, 117576, 332272, 469449, 421550, 317734, 751456, 157281, 826065, 97542, 46308, 924894, -897307, 988080, 98367, 13841, -98805, 978743, 455756, 199739, 369326, 698821, -643072, -760964, 253347, -251842, 264784, 620791, 450372, -969693, 729078, 933962, -453, 116684, -949363, -213239, -769415, -57454, 634811, 731635, -314069, 657074, 64285, -430263, 626164, 486465, 856477, 33838, -551553, -691069, 59888, 48977, -826422, -821161, -236721, 782620, -304671, -111833, 164988, 919647, -552436, -549481, -684957, -614255, 963779, -837567, 634129, -13783, 622106, 357768, -739549, -872626, 820323, 119550, -208618, -341739, -128265};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques710(){
        Integer[] array = {-199164, -674552, -500161, -724632, 432431, -477135, 239408, 914059, 270336, -631303, 954914, -623526, 576950, -39617, -833441, -793391, -363948, 372696, 518495, 200302, 676071, -797496, 452990, -674992, -511028, 39750, -951853, 477594, 801481, -733356, -629776, 581795, -316813, -352730, -212695, -150325, -425248, 400689, 908081, 410439, 623126, 331653, -777402, 685879, -929814, 49794, -374691, -784777, 993138, 136314, -629422, 624776, -309978, -750577, 856653, -317251, 898662, 526497, -66204, -523338, -419539, -619008, 15288, 292412, -503716, -865049, -225471, 632213, -898833, 620307, 37055, -495894, -396473, 780484, 495512, -460000, 452355, -130916, -961228, -23282, -798804, 980110, 391406, 695895, -134122, -214170, -6856, 922582, -210921, 976318, 308753, 15389, -779180, -393097, 42573, -942597, 150326, 218744, -596134, 467645};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques711(){
        Integer[] array = {358882, -284484, -276213, -670665, 70921, -223966, -932737, -170819, 236345, -631644, -38834, -922893, 271550, 886522, 25699, 904512, 578318, 806309, -218300, 407660, 128330, -784761, 995255, 688514, -52184, -211196, -121246, 342708, 692730, 756236, -241392, 22053, 839154, 200600, -844516, -866320, 620745, -950791, 770281, -62216, -416925, -130907, 591199, -144825, -85233, -540478, -510353, -221774, -700602, 269358, -907640, 91657, 313480, 783627, 997950, 41078, -147115, 369587, -926570, -314374, -712311, -820462, -627992, -364050, 121042, 66395, -860137, -734948, 485032, 546619, 868380, -787112, 586909, -42484, 834870, -170120, 241314, 639745, 783888, 412463, -492370, -66636, 47182, 772256, -121469, -353967, -249095, -910241, -792149, -777814, -93335, -336593, -985792, 512569, 789380, -732868, -736682, -521048, 469423, -986320};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques712(){
        Integer[] array = {-206268, -754895, -209083, -441105, 860656, 364308, -643663, 964719, 13331, -437281, -511285, 328356, -191573, 430926, 150353, -70981, -586853, 175903, -859180, -806345, 786299, -824374, -183258, 521109, -297222, -665285, -992013, -237320, 143025, -223787, -717776, -830308, -792136, 106852, 95058, -374547, 522511, -93023, -354792, 106904, -977327, 599152, -287525, -744378, 955688, 7076, -596695, -860149, 596782, -419878, 51616, 414098, -367457, -957084, 43124, -783401, -743643, -279739, -584141, 216393, 709126, 224439, -226844, -264254, 152829, -482169, -727866, -677373, 502716, 574580, -196446, -548650, -501528, 320080, -249789, -141014, -638475, -18199, -753274, 543919, -427010, -296422, -439972, 988800, -288349, -664197, -365395, -202143, -409540, -666273, -614850, -458828, -58158, 925830, -719519, -145956, 108780, -314971, -523326, -691431};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques713(){
        Integer[] array = {309724, 738594, 816529, -593776, 550979, -174451, -391787, -658495, -360733, 35515, -114132, 159889, 522154, -547508, -559591, -490443, -141105, 100880, -862767, -896920, -815277, 710440, 349242, 849968, 491875, -856983, -275017, 491883, -395030, -900867, -570329, 241606, -279894, 175686, -343792, 193244, -149267, 909807, 993606, -325285, -803584, 697287, 780117, -95467, 465557, 124080, -988721, 29135, 941946, 87355, 860732, -911510, 725961, -865192, 632610, -865615, 771285, -730448, 113758, -170925, 287450, 551779, -328250, 961663, 278688, 890949, 371230, 461368, 626213, 996323, 763282, -547886, -733401, -730080, 619440, 506139, 943866, -586554, -887684, -628750, 835616, 486694, -417286, -618941, 558114, 574587, 589504, -227956, -555871, 385358, -225592, -609704, 280177, 219967, 504314, -286666, 293792, 165334, 535655, -251835};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques714(){
        Integer[] array = {210577, 193789, 581604, 245525, -139136, -521451, -342362, -608581, -873443, 567816, 132933, 696343, -600427, 555005, -727669, 771463, 259833, 36249, -444501, -104775, 595858, -72096, 158989, 30877, 639608, -536584, -261895, 503173, 119403, -3706, -244144, 245376, 357546, -381012, -167515, -711800, 51497, -169952, 613153, -171061, -72820, 171338, 41179, 547386, -859485, -392420, -482698, -80367, 182261, 306788, 480432, -769881, 913553, -542439, 631600, 777097, 362459, -722941, -138972, 587366, -889164, 144122, 657888, 471841, 306936, 175677, -981426, -250816, -259411, 308536, 714849, 765061, -215389, -690259, -199934, 692493, -54437, 335994, -296309, 638782, -851120, -50411, -352157, 704629, 559375, 353431, -622737, -297319, 845902, 988799, -767830, -629360, 950582, 268675, -140554, -750513, 950438, 42663, -409547, -605578};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques715(){
        Integer[] array = {-868607, 37306, 981945, -512366, 725153, -754035, 679702, -974539, 42753, -6687, 481004, 608590, 838299, 647321, -526346, -358760, 71469, 777940, 856980, 612807, 175931, 553933, -419294, 97715, -478262, -512547, -995766, 50114, 413825, 142470, 772514, -586734, 170218, 803412, 693376, 329969, -555262, -331605, -187503, -520345, -803785, -391513, 127656, -790772, 839983, -212509, 868618, -552116, 946072, 750475, 10493, 930326, -489430, 841107, -924785, 383702, -659674, -935806, 136830, -899735, 602654, 305384, 220763, 701146, 204799, 868878, -830216, -588868, 785398, -662162, 790152, -768418, -741815, 133495, 576032, -42747, -363326, -786514, -30300, 416828, -976547, -237824, -103831, -16842, 877035, 272484, 361366, -377888, 501662, -65512, 561049, 790132, -361717, -412350, 12440, 635281, 476130, 112819, 418966, -982877};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques716(){
        Integer[] array = {777432, -873365, -954857, -444018, -909214, -961185, -824408, -959702, 674906, 518862, -119479, 636651, 188069, 317078, -862534, 752745, -790421, 820238, 121306, 954073, -483077, 711931, -586617, -460402, 758299, -435570, -767460, -969163, -429437, -350624, 714941, 16194, 268960, 872869, 516426, 996226, 662384, -884311, 7894, 806129, -934882, 99442, 800444, 349893, 984905, -580905, -973910, -610358, -298125, -768992, -760002, 829030, 842691, 916166, 702118, -442776, 653770, -937751, -474099, 782904, -364479, 598122, -117903, -41931, -469430, 829342, 221102, 114108, -684564, 162564, -836594, 891051, 273697, -892427, -317732, -852646, -327886, 315341, 751795, -408628, -47370, -965426, 230196, -427201, 917740, -494101, -544741, -579154, 671679, -424579, 624820, -604179, 758843, 20397, -290907, -167212, -937659, 491793, -339040, -41844};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques717(){
        Integer[] array = {-731267, -900054, -882312, 263536, -375478, -571624, 919906, -624658, -766397, -906158, 588595, -62209, -873393, 846702, -106504, 141358, 281913, 820725, 565750, -281350, 679314, -479354, 831120, 750843, 951551, -125144, 94856, -486779, -426581, 155349, 778695, 969681, -204455, 322565, 370918, 145624, -938800, -573561, -346016, -517853, -816338, -828181, -140202, 21547, 114273, -898910, -188014, 908100, 590001, -229071, -768198, 265437, -635288, 152223, -24048, 927317, -779411, 748472, 209737, 392133, -677518, -46269, 73929, 21443, 126142, -862246, -486338, -814442, 94929, -535895, 123914, -677346, 907831, 217799, -839158, -129062, 124109, -150699, 314928, -773809, 393007, 375890, -600136, -668213, 581511, -775957, -500304, -54239, 695562, 460062, -259827, 524046, -439168, -154450, -618332, 539238, 854292, -724309, 377001, 775627};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques718(){
        Integer[] array = {-600249, 649736, -993477, -51007, -53057, 36172, 185053, -58965, -981812, 779718, 540232, 766619, -472226, 15532, -672864, -563841, -88974, -976576, 28633, 139180, 980246, -969968, -245683, -429547, 885421, -183428, -74876, 262636, 898185, -338127, -602547, -926062, 402513, 390335, -547936, -40860, -184857, 41565, -733937, 433328, -187855, -225114, -284861, -914314, -802501, 981472, 65514, 721458, -826603, -392170, -120562, 389393, 910464, 955769, -892083, 262923, 470297, 486483, -687394, -809477, 594374, 110781, -149597, -197279, 65264, -323662, -331665, -319822, -666906, 52877, 162158, 248702, -36270, -754977, -449335, 656807, 666960, 428249, -33973, -898727, -385562, 980303, -588004, -377536, 853624, -208417, -955934, 962155, -894974, 453396, -796428, 230474, -934183, 254304, 987801, -619195, 894941, -741705, 378930, -856343};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques719(){
        Integer[] array = {-189364, -84202, 503250, -443390, 804809, -847744, -160094, 377918, 709224, 602069, -86772, -2941, 903741, -725381, -663381, -381289, -295348, 970454, 11411, 382921, 253525, 894262, -932247, -957568, -83621, -127386, 267338, 547793, -386212, -585646, 378785, -315409, 155214, -499195, -410198, 269451, -811820, 646017, -793487, -660163, -239188, -996343, 551588, 576964, 392130, 382245, 551870, 531663, -360892, 603908, -114931, -75634, -987821, 871499, 505203, -266297, -49336, -509166, 771493, 967376, 222476, 15614, 16976, -520673, -40168, -732410, 846170, 979742, 143044, -260234, 788981, 784742, -961218, -606030, 966972, 781259, 167645, -325582, -1687, 585493, 608016, -938993, 236440, -38717, -941770, -782614, 900155, 521854, 733818, 452467, 353220, 800691, -687202, -135664, -826607, -526575, -767831, 92181, -970377, 740459};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques720(){
        Integer[] array = {916122, -916548, -420226, -497491, 421100, 857662, -504846, 271112, 781605, 63880, 992036, 624543, 42954, -165978, 168637, 60185, -976627, -408751, -503115, 208238, 864536, -938199, -602857, 448103, 394439, 207193, -482270, 210209, -124942, 863914, 546479, -893227, -960043, 330711, -547172, 471166, -383250, -534042, -305709, 826673, 777067, 931513, 784915, 121551, 677705, 972143, 843692, -255208, 498216, -830170, -514656, 929991, 842149, 895035, -575834, -118347, -304292, 413744, -272381, -683955, -691032, 464838, 671424, -498319, -184574, -168981, 964694, 917923, 758604, -886276, -903669, 4661, 803589, -62230, 633676, 776533, 184227, 165487, -94620, -485447, 602788, -114153, -364192, -218429, -737199, 634305, -933831, -41998, 374080, 930431, -628877, 183259, 329761, -908444, -98720, 546913, 518865, 164006, -541083, 960134};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques721(){
        Integer[] array = {601248, -289630, 314991, 653382, -951365, -234707, 927930, 242906, 837017, -218752, -701695, -913550, -441336, 320964, 687199, 641093, -71646, -133246, -340896, 641400, -851501, -450267, -541135, 697783, -222799, -695908, 168065, -513006, 157444, -565647, -770242, 629257, -383029, -142344, 841721, -315152, 152675, -584285, 475075, -590473, 450487, -624527, -869754, 204856, -222914, -473237, 369705, -231614, 458069, -495463, 93554, -785770, 578247, 778460, -223057, -464199, -964213, 745817, -96358, -226834, 639688, 475686, -134446, 463806, 570687, 759785, -955203, -260372, -179508, -579500, 432187, -766909, -418516, 493469, 870233, 812205, 728846, 182684, 470357, 994075, 652674, 159316, 676540, 596129, -947086, 743305, -522843, -436939, 528675, -243695, -281197, 345249, -922018, -192134, -790881, -353049, -539905, 792449, 839768, 487115};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques722(){
        Integer[] array = {-79314, 313825, 959465, -257055, 801490, 81597, 339125, -632665, -220492, -316491, 939175, 862574, -191857, 734425, -24096, -170759, -412127, -996724, 126515, -462720, -298975, -187948, 630487, -898971, 218079, 620220, 268207, 333635, -485270, -673598, -577403, 705134, -415649, -119600, 261249, 240466, -670705, -348615, -802992, 349429, -523784, -257719, -761778, -765541, 957955, -439319, 362359, 288491, 954269, -859593, 936910, 34456, 537277, 85019, 139026, -797903, 367218, 329066, -283056, 134436, -67983, -96252, -953081, -285372, -263253, 971484, -278657, -519092, 728162, 546405, 573285, -572120, 346636, 695918, 754461, 890420, 10703, -461965, -635078, -767912, -586997, 820579, -963749, 558404, 324953, 657942, -613932, -56149, 960612, -889337, -679535, -736919, -769556, 987156, 486186, -632084, 178243, -738592, 921811, -561030};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques723(){
        Integer[] array = {819183, -819571, 809278, -964054, -722472, 634909, 609417, -157400, -725939, 74717, 229010, -995893, -90830, 455144, -235642, -472344, 800249, -225022, 167145, 307680, -660940, 997462, -549279, 147752, 861270, 249721, -881527, 515634, -534399, 238018, 829265, 527773, 189185, -107607, 239961, 284839, 197545, 465163, 121776, -517039, -506501, -391922, -635085, -560438, -11175, -570056, -545417, 104074, 33924, 596557, 561947, 88454, -49653, -347412, 631084, -835652, 765178, 662525, -693110, 394498, -146759, 832723, 569182, 614711, 533305, 617838, -887543, 190041, -297471, 554050, 301975, 511215, 77561, 26010, -200564, -674360, 481516, 65012, 571686, -650372, 63404, -626571, -759453, 94953, 742619, -992364, 339446, 29537, -501658, -20885, 257450, 696827, -412175, -44147, -598087, -329217, -400860, -310292, 371231, -798131};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques724(){
        Integer[] array = {907671, 513629, 630317, 940241, 560695, -895224, 497287, 917345, -18478, -210339, 621790, -669977, -846922, 751086, -584359, -5155, -425137, -900878, -453426, -517923, 510518, 580609, -354176, -218806, -667617, -370289, -883252, -816818, -192944, 558296, 247651, -590380, -480312, -86942, -681518, 98854, 249321, -751788, -687271, -716936, -427351, 991662, 768746, -257776, -33044, -520840, -24907, 755217, -326333, 72004, 512175, -210709, -201634, -983901, 141445, -790704, -526041, 906580, -856824, 119068, 884984, 775680, -757104, -96942, 47790, -867374, -811032, -489743, -480045, 229519, 64399, 502535, -830779, 884520, 788743, -918816, -423985, -545995, 852092, -577765, 161752, 28732, 162160, -501036, 533814, -912764, 427035, 983219, 335443, -446033, -631598, 418017, -524, 886908, 571103, 498098, 358050, 526555, 479162, -615697};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques725(){
        Integer[] array = {-360377, -730350, 432372, -682350, -670876, 234532, 206524, 82309, -225433, -781454, -489849, 565903, -175451, 641879, -541206, -570444, 82772, -281489, -946561, -966360, -102521, 835968, -90817, 301166, -496134, -541659, -92071, -782752, -63245, 223217, 571280, -881048, -300791, 114476, -284147, 125955, 907131, 859358, -83016, -895398, -198963, -383878, -148113, 793286, -566494, -54130, -649364, 564815, 521270, -849125, 782096, -78993, 145153, 635087, 716845, -15970, 239816, -250383, 659774, 645079, 747539, 119695, 452086, -961230, 200894, 75897, 745860, 369030, -409577, 203721, 198662, -328532, 117782, 200643, -928567, -718517, -224281, -958070, -714863, -943597, 357752, 868232, -296105, -859135, -933099, -46393, 638208, -569381, 61789, -962554, -130756, -156274, -990068, -349218, 22225, -325319, 142501, 117344, 445, -318222};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques726(){
        Integer[] array = {-197896, 776917, 137221, -127060, -980959, 159253, 342816, -83577, -112961, 311420, -979714, 835319, -490729, 337654, -999288, -179202, -961598, 433083, -976249, -498727, 317078, 900498, -251491, 860741, -38787, -517249, -210503, -818772, 658848, 488763, -458094, 969404, -968342, -322119, -724683, -528940, 34427, 240407, 210350, 115167, 809538, -983619, -212540, 40156, -289440, -855455, -531511, 929998, -630174, -839362, -822360, -970422, -637882, 153133, 713468, -302950, 368127, 481361, -940250, 390391, 84117, -423528, -999599, -333072, 400533, -425182, -298762, -566092, -811287, -993981, -206047, 747173, -793758, 866430, -363251, -553082, -317072, 523278, 650166, 743859, -401546, -616315, -812681, 460346, 310441, -689113, -472802, -898166, 514308, -39346, 621326, 579318, -293331, -848074, -492848, -41727, -286406, 298475, -491090, -369221};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques727(){
        Integer[] array = {498144, 145996, 586089, 372126, 537791, -660832, -40858, 778413, -117293, -10237, -225040, -911133, 955053, 852354, -716279, 218452, 29691, 801099, -216574, 235430, -625050, -348621, 726072, 240766, -723537, -490318, 329894, 811984, 97015, -72165, -69950, 6939, -173768, 725740, 546072, 273515, 315581, -364356, -595999, 574343, -27154, 73415, 476467, -971528, 710051, 636825, 116352, 865302, -168161, 643822, -382881, 748532, -105382, 37571, -866488, -133550, -70052, 18076, -111610, -536521, 87987, 999440, -734489, 851144, -294412, 133221, -450517, 680808, 345186, 856036, 713610, -907840, 344758, 44156, 840446, 530951, 147014, 772574, -930647, -246810, -410895, -344747, 399863, -813085, 697466, 664849, 721699, -153188, -443773, -79343, 418293, 290052, 209040, 396137, -101150, 920594, 755455, -899165, -277038, -665150};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques728(){
        Integer[] array = {-87471, -284232, 128042, -971682, -741303, -578592, -331865, 797562, -394439, 22748, 741281, -334408, -217872, -184351, -747321, 30243, -838299, 698030, 683497, 276012, -829790, -781467, 680814, 301186, -829292, 636391, 873202, 344179, 689211, -917955, -10852, 432271, 47939, 394637, -743836, -590831, 631788, 402626, -879786, -960966, -450070, 352267, 618181, 851047, -383047, -630044, 344814, 912949, -563504, -119128, 621746, 149510, -866216, 816929, -26137, -427481, 287096, 923887, 329815, -668822, 37879, -596444, 13225, 695219, 422534, -637868, 609243, 50976, 963350, -191344, 37491, 706352, 867850, 793207, -916067, 79410, -129480, 186254, 44100, -112586, 967896, 147481, 187413, 47010, -814299, -385267, 198698, -302558, -177339, 287907, -753586, -10639, 753099, -894410, -152151, -675909, -929694, -745705, -454484, 867511};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques729(){
        Integer[] array = {173931, 877954, -534758, 669757, -307868, -734420, 445353, -552880, 625785, -993467, -923203, 430534, -525343, -189, 112518, -37839, -478466, -140264, 941470, 108294, 566002, -468707, -665929, 713209, 939325, 768134, 193179, 484299, 711593, 605732, 125757, 794948, -804254, 309247, -820380, -124638, 790080, 559172, -315038, 443695, -987190, 493475, 303338, -934741, 468736, -376156, 342590, -969793, 347312, 947447, -209750, 659419, 76699, -57491, 205607, -424513, 526307, -922138, -891086, -867760, 235824, -749861, 777399, 694422, 979693, -382069, -233576, 797445, 38684, 665690, 241645, 358200, 833615, 247154, -528685, -980995, 753367, 830390, 807235, 415079, -389058, 116470, -364005, 514737, -767483, -909753, 103068, -463862, -859674, 527835, -615759, -16045, -243106, -750469, -844219, 662226, 966207, -163234, -993833, 32948};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques730(){
        Integer[] array = {18516, 782295, 239630, 773413, 547843, -256555, -821124, -83361, -193505, -861708, -207763, -498015, 20941, -469192, -642854, -675896, -410048, -755359, 91, 191061, -160164, -618705, 96926, 125313, -977727, 801777, -795085, 995045, 428725, -913285, -282712, 487956, -786721, 433209, 850951, 979543, 964673, 646747, 687862, 633834, 266248, -330612, 114393, 546910, -593828, 999769, -181980, 137257, 162419, 230907, 288955, 684760, 356259, 753994, 676558, -410353, -607803, -331588, -715262, 883517, 550600, 557181, 989968, 484849, -633575, -455655, -312003, -561480, 591889, 364796, -115549, -572514, 828080, -415028, -752483, 787038, -654144, 6571, -170124, -707628, 544249, 919399, 626647, 515597, -151635, 593265, 756033, 558428, -97861, -384063, 800348, 753190, -431242, 887084, -655451, -528508, -212311, -643913, -644344, 334364};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques731(){
        Integer[] array = {-362306, -662274, -703272, -195979, -476512, 357042, 372076, -521909, -776078, 132060, 839865, 433667, -472441, 768370, 850899, 482715, 270583, 724662, -374922, -570830, 288146, 706899, -150501, 982878, 119822, 901469, -600714, 858876, -513804, -829888, 163851, 317794, 7979, -170729, 687575, -76910, -633320, -123498, 242182, 972753, 445276, -888782, 802949, -750059, 989692, 243659, 911821, 909399, 742496, -299576, -538885, -6500, -582814, -731066, 549344, 186052, 224611, -627572, -962802, -113516, 325613, -279578, 231744, 900716, 226715, -695863, -928523, 692554, -221439, 555610, 902880, 240739, 820115, -62509, -168067, -671639, -30013, -669679, 456603, 738984, 158514, 609814, -945855, 536355, -669131, -348124, -104254, -767531, 527429, -821111, -125746, -235641, 223355, 861366, -775516, -416382, 244947, -756839, -262497, 144532};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques732(){
        Integer[] array = {678437, -341743, -404240, 647539, 278903, 759836, -812126, -764836, -258654, -163918, 120048, -528516, -794415, -295864, 18739, -561445, -390910, -171229, -22525, -520167, 459800, 568420, -807054, 732672, -209433, 690988, 876247, -448423, -593987, -545728, 825917, -5805, -167134, -57947, 754962, -263969, 624231, 729604, 555528, -663219, 588504, 600401, 93189, -248978, -159644, 184351, -305074, 170358, -640787, 274308, 730679, -448013, -53261, -16297, -587610, 364954, -980404, -618131, 147397, 229195, -31160, -541684, -557271, -963330, -800022, 666336, 770846, -710303, -91186, 60314, 293199, -107454, 667551, -291825, -119002, 543960, -680075, 984663, 324100, -2123, 585793, -503088, -813912, 802159, 617144, -240156, 290599, 94728, 96219, -336233, 627546, 886177, 627833, -271512, 551532, 868252, 171267, -643869, -235302, 785866};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques733(){
        Integer[] array = {676457, 81107, 74409, -189013, 334243, 770671, -744014, 521661, 261732, 502051, 837414, 915573, 67354, 857261, 919182, 561507, -334332, 621207, 444460, -931528, 951449, 461061, -468988, -280001, -736653, 17951, 854783, -51991, -918891, 356252, 519732, 752894, 601382, -170519, -51825, 823884, 268210, -866293, 721309, -903642, -986428, 386763, 690212, -112675, -336618, -160886, -150483, -664790, 166481, 322517, -441138, -76402, -550435, 690872, 507567, 67569, 153451, 10731, 440681, 314574, -693156, 146699, 817050, -330043, -778779, -179680, 682238, 262747, -368255, -499987, -679178, 955840, 552436, -367874, 718609, 699223, -971086, -232294, -828745, 324578, -926269, 629906, 879133, -445839, -127461, -41930, 355986, -795810, 103748, 589000, -397354, 219849, 467647, -456526, -568544, 466698, 106257, 668025, 380165, 613680};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques734(){
        Integer[] array = {501836, -685002, -1784, 831449, -615739, 290906, -511332, 26744, -521771, -770907, -906839, -560007, 283588, 996432, 774284, 861450, 968773, 412996, 314124, 212138, 582176, 418900, -190957, -318279, 514907, -865642, -900573, -504991, -357053, -460256, 635908, 67641, -28268, 734174, -603367, 47250, 113520, 244122, 384012, -625763, 906111, 253751, 685495, -91789, 827413, -639652, 458650, -54193, 377002, 663028, -876401, 1008, 65961, -953661, 213220, 411067, -656758, -29204, 1292, -557154, -93789, -44431, 587151, -918270, 994362, 695004, -247402, 117239, -999820, 902549, -619038, 297678, 883211, -667488, -455565, -183673, -145952, -99595, 443265, -463143, 681440, -655777, -473659, -231450, 445681, 47081, -655756, -851064, 689468, -970844, -18163, -720347, -48944, -652120, 385040, -831124, 817518, -24583, 867254, -859990};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques735(){
        Integer[] array = {-257059, 809533, -833686, -318106, 866868, 728877, -815048, -158851, 163186, -627027, 400724, 28972, -224885, -319469, 159190, -216168, 773706, -564831, -185950, -810495, -662409, 438465, 578350, -450289, 841848, -450515, 946922, -861976, 386190, 432224, -477450, 501675, -276880, 870327, 396972, -558879, -639633, 781249, 462718, -740008, 183705, -559442, -949749, 482013, 982338, -691815, -270342, -388559, -540449, -407424, -649260, 120594, 969054, 8735, -531332, 476537, -821858, 396407, 151124, -772707, -853202, -366733, 486439, -886924, 197298, -556026, 270298, -918259, 866989, -978130, -775807, -109837, 634704, 224218, 529173, -891602, 109510, 402897, 894345, 804041, -464265, 801541, -353225, 348253, -718391, -304868, -974070, -678604, 811206, -551193, 725238, -33773, -386684, 509948, -50582, -424016, 829574, 235341, -377657, 629089};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques736(){
        Integer[] array = {457103, 611780, 652719, -78671, -493673, -771952, 269566, 825053, 614108, -610007, 87114, -828275, -185569, -280674, 178065, -975466, 366684, 825801, 276952, 66925, -287498, -878092, 664019, 579294, 185707, -644967, -163883, -108703, 175567, 441400, 797727, 401087, 182131, 282998, 815001, 757687, -881795, 615398, 423323, -867070, 21937, 427609, 974085, -239707, 809450, -435621, -119130, -546766, -196633, -45598, 118858, 259059, 849542, 998788, 827224, -484670, -956614, 452154, -693681, -32650, -810693, 299195, -132989, -187422, 39530, -735536, 633865, -975810, 138109, 637371, -661897, -20464, 470012, 15802, 179758, 374626, 489651, 581308, 285659, -973024, -444782, -270613, 222783, -554833, 56089, -146581, -345371, -253927, -509878, -267795, -375562, 313339, -836616, 787257, -141929, 837143, 37705, -262341, 989369, 73944};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques737(){
        Integer[] array = {169167, -396531, 139826, -909004, -205518, -296361, 874652, -205882, 538629, 203480, 792213, -553014, 360317, -360579, 982859, -472533, 735466, 976611, 458300, 814665, 405428, -332627, 782427, -433345, -207664, 316707, 330679, -54641, 629497, 892729, -66610, -803528, -741544, 758598, 959904, -447010, -233051, -294676, 680376, 995452, 847135, 682975, -192871, 47153, 605373, 204277, -361246, -876565, -595538, 279328, 621178, 796205, 617122, 215410, 786522, -298236, 718750, 617542, 238099, -703798, -39954, 462466, 136673, -675502, 804204, -848840, -942570, -577450, -866257, 959712, -87185, -683771, 123616, -301486, -52963, 76925, -659853, -228320, -167511, -183580, 775247, 990213, -517718, 931298, 578753, 564263, 68813, -669999, -137446, -124032, 521451, -340769, 499800, -464699, -764566, -323965, 394934, 20025, -180669, 9119};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques738(){
        Integer[] array = {324213, -985666, 662131, 474169, 767033, 19043, 475047, 307136, -270382, 974551, 823412, -514195, 139824, -758869, 462483, 260154, 252622, -804434, 512103, 634858, 929847, -817190, -96989, 685595, 601521, 508863, 984481, 642203, -860506, -370647, -893490, -453956, -679164, 586929, 954108, -298075, 666440, -930840, -262986, -442721, 285135, 103148, -498597, 344402, -705268, -190094, -740017, 38438, -857131, -169870, -849161, -687357, 352712, -69533, -133891, 681432, -728378, 673826, 680389, 244485, 176151, 484667, -354033, 685473, -476504, 448924, 30068, -341360, 54589, -378030, -507313, 478889, 253854, -503962, 99567, 58342, 556919, -822480, 760933, -317752, 622033, 79577, 693276, -763688, -73355, -984769, -722115, 90118, 9712, -184232, 220508, 925993, 976983, 134920, 762139, 620775, 630295, -98283, -197494, 382012};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques739(){
        Integer[] array = {-672556, 863837, -976596, -584223, -849054, 480855, 75965, -303686, -823201, 682970, -75990, 812491, 240320, 982339, -3766, 824839, 708220, -441658, -61615, -268307, 746567, 440071, -429540, 859969, 71617, 994830, -143094, -49795, 385444, 491313, 200515, -418296, 394412, 2819, -220613, -108168, -833588, -997829, 844264, -168543, -346181, 689490, 252687, 962429, -597718, -928199, 186477, -21864, -673799, -964335, 312995, -862588, 982634, -29909, -897042, 504250, 737614, -402070, -963964, 596353, -911429, -726601, -466253, -300576, -209323, -419566, 366425, 527182, -480091, -729750, 11445, -684626, -590019, -767611, -407591, -40041, 561183, -761752, 800152, -329628, 207211, 389955, -163536, -694552, 151100, 484925, -154727, 415892, -584068, -335091, -645687, -232049, 404035, 82358, -106910, 775183, 54109, 40688, 717830, -383203};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques740(){
        Integer[] array = {-777430, -418642, -617812, 367017, 425003, -942638, 603857, -19530, 564484, 955037, 822603, 100554, 70688, 564305, 810384, 567526, 398844, -126685, 781047, -464263, -788634, -22925, 175239, -47429, 372714, 494984, 501725, 288159, 77002, -780312, 13351, -922949, -199909, -285367, 846650, 346525, -179194, 815525, 544992, -109703, 979012, 584984, -658929, 226873, -250768, -38133, -546325, 661577, 474689, -984376, -611517, 203907, -716950, -682330, -867596, -219075, 157495, 853057, 15464, -172066, 870086, -121842, -710108, -515468, 185330, -651182, -979773, -62252, 327787, -443550, -173281, 364725, 511338, 911124, 646486, 250345, -795232, 26212, 853194, 382276, 633774, 855429, -834694, -413872, 477876, -850389, 759329, -505006, -585932, 643504, 21370, 832462, -186705, -420308, 906213, 246271, -836322, -628905, -786981, -212458};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques741(){
        Integer[] array = {782521, 847592, -329093, 889074, 756320, -912852, -962695, 85366, 948286, -348097, -314208, 28733, 635840, 639789, 13702, -942529, -162411, 878129, -225348, 552816, 709556, 991138, -687843, 158624, 116979, -68843, 500039, -103576, 651271, -996041, -212890, -442398, -74769, -99062, 666846, -64628, 403572, 535093, -11914, 924483, 25065, 200826, -865005, -151265, 167317, 913458, -939661, 964933, -591778, 34602, 796480, -199082, 943322, -189704, -525821, -528207, 464320, 339513, -837312, -645811, 384797, 192240, -925828, -219019, -885376, -69809, -619604, -104565, -433494, -70403, 100274, -242107, -614360, -47713, -322984, -803936, -159349, -53034, 935685, -245728, -802808, -521120, 615524, -46565, 927243, 48508, -450078, 648294, 91274, 301593, 18319, -240960, 716289, -345228, 909936, -934091, 484192, 185391, -837623, -438782};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques742(){
        Integer[] array = {133345, -126589, -291468, -539596, -898274, -188474, 403839, -939294, -333533, -686305, 679599, -383604, -286915, -245404, -876864, 168322, -582810, -618628, -756675, 9872, 290779, 582292, -57280, -572295, 187698, 947954, 328215, -350669, 727884, 820616, 312347, 130711, 317698, 91938, 808973, -779704, -265184, -593415, -168897, -619507, 673280, 205817, -59727, 897305, -793412, 493070, 518593, 792636, -687411, -173714, 554706, 104724, 185166, 940381, -775046, -411031, -732553, 909432, 707591, 2985, -703147, 26968, 166743, 328143, -527062, -634289, -535748, 406847, 780581, 286598, -855611, -350361, 760747, -691369, 402935, 351330, -548903, -193144, -270207, -787845, 837954, -93959, 4997, -556149, -872714, 901629, 53400, -298946, 541587, 302467, -181173, 789153, -455979, -136935, 733153, -390178, 783617, -399383, -291744, -357260};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques743(){
        Integer[] array = {743578, -353541, 313223, 679736, -342092, -806108, 207369, 951192, 199538, -12790, 520474, -401978, 467655, -83356, -494537, -607137, -991433, 943775, 892778, -533954, -527287, 83565, 669437, -539684, 262689, 530181, -395784, -471713, 253262, -532171, 503170, -31531, -602429, 310985, 252497, 797151, -920092, -271089, -283242, 640402, 381892, 542526, 674489, -430885, -450340, -96450, 914189, 359821, 751609, -171031, -897961, -495050, -33030, -909774, -675659, -323768, -786403, 704305, -464115, 514527, -584041, 513682, -856013, -669056, -670203, 128421, 840686, -110585, -65722, 606559, 157934, -91508, 177719, 311391, -857583, -681130, 412239, 316292, -163938, 320780, 109769, -991699, -260781, -50818, -963332, 941924, 470260, 946129, 455520, -867659, 725417, 147449, -201266, -647933, -874337, -241439, 397113, -892254, -145648, -986493};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques744(){
        Integer[] array = {722011, 335277, -536017, -207910, 723809, -111959, 335024, 361057, -782869, 786225, -593835, -243122, -306944, 678283, -76728, -294865, 448423, -5355, -598699, -551751, 368543, 353364, 375618, 97402, 66847, 595368, -973110, -982749, -922763, -447415, -63132, -571717, 597700, 592962, -383994, 734366, -17599, 499305, 999522, 371526, -496111, 911151, -639864, 899311, 937772, 178447, -631781, -390721, -877130, 55160, 934818, 194486, -270074, -150956, -38369, 1458, -52890, -839883, -791950, 252103, 554180, 501380, -216373, -915960, 330014, -193360, 489475, 754619, -881366, -283978, -47322, -475221, -224435, -244959, -721785, 957955, -489711, -565839, -752405, 229826, -191042, 576847, 384459, 707155, 550579, -415671, 64917, -420660, 409394, 15136, 411209, -73762, 209567, -86068, 338375, 914818, 230569, 557350, -843622, -150692};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques745(){
        Integer[] array = {-446172, -436127, 796423, -712633, -310002, 887483, -215442, -929346, -656603, 506924, 950392, -863913, 485778, -478038, -959492, -387417, -891629, -757750, 650220, 328419, 42156, -692918, 598449, -576588, -441368, 785255, -479117, 360506, 201995, 750280, -305055, -465086, -443973, 748753, -603111, 737795, 358249, -294633, -564659, -247625, 453221, -342907, -529670, 245584, 816494, -830378, 601041, 785003, 111849, 824103, -251063, -248242, -74595, -39784, -313403, 695569, -331428, 885193, -378199, 389663, 92170, 305948, 318476, 376150, 49011, 566002, -773289, -492801, -914589, 572541, -371299, -553735, 756062, -59123, -550234, -309920, 84237, 492777, 140791, -245823, -428307, 416909, 973661, 859324, -272612, -886069, -488973, -424988, 316133, 643247, -138968, 887086, 902619, -974009, 691026, 111317, -918151, 944449, -327317, -217827};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques746(){
        Integer[] array = {-31303, 785834, -582295, -895901, 161244, 100093, 999864, 307979, 665051, 418744, -481294, 506934, 614604, 280911, 879739, -809206, 704587, -478913, 642389, 609495, -404722, -779793, -553462, -130670, 818892, 651326, -139615, -666699, -561547, 750634, -516170, -647711, 371806, 231176, 779212, 977820, -440800, 607386, 979870, 315705, 180901, -142896, 564041, 278349, -132383, -406530, 670711, -941854, -314785, 94863, -354721, 804758, -223395, -634462, -692967, 663489, 795034, -182628, -88024, -36546, 753650, -942447, 578268, 651286, -707540, -697740, 686684, -186147, 795259, 323616, -424292, 794590, 78568, 182707, -849817, -106414, 626412, -519227, -710606, -854265, 37155, 622087, 368794, -658834, -823542, -951831, -285800, -796989, -95638, -567694, 670000, -852251, -588130, 292826, 806543, 694253, -383815, 201778, -882461, -446435};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques747(){
        Integer[] array = {-593474, 338980, -353904, 441060, -278456, -71163, 720225, 71007, -764140, 575575, 693337, -95123, 768397, -528708, 946183, -741961, 43302, 295537, -648733, -762765, 104666, 246206, 301658, -514797, -51780, -436554, 7568, -880189, -340265, 661229, 674439, 381510, 184808, -652522, -340656, -174911, 366843, 338932, -328601, -348171, -266579, 255957, -650205, -875816, 227727, -629625, -476535, 905963, 925186, -694237, 357869, -937451, 147454, -365143, 839274, 839945, 312520, -830712, 114792, 344419, -411380, 483280, 444342, -40617, 774765, -864826, -878769, 327783, -608907, -835092, 395203, -833450, -606768, -373814, 393955, -872940, 464082, 456086, -111927, -180116, 282291, -217990, 300008, -51701, -104396, -502720, -219912, -936462, -782020, -727057, -316692, 953843, -200616, 111147, 51042, -956763, 963719, 688629, 175243, -934541};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques748(){
        Integer[] array = {-63393, 375867, 63764, 124761, 61004, -318542, -739599, 579938, -684432, 714293, -500579, -980904, 145979, -175846, 890303, 72498, -279495, -119415, 135961, -447327, -458272, -948723, -672851, -348074, -81169, -617216, 957165, -237714, 424457, -575754, -911239, -270103, -555421, 269847, 184302, 669701, -638885, -807951, -354600, 369221, 376313, -566743, 934303, 948591, 914763, -659560, 786005, -814564, -831451, -335209, -516533, -641300, -37221, -398942, -24028, 906985, 297688, -941748, -336708, 961905, 529156, -944876, -303976, -822139, -96797, -650279, -172823, 536931, 664052, -92291, 798624, -324626, -955435, 67016, 276469, -477874, -674127, -89009, 640104, 193958, 272626, 961396, -579080, -776367, -658631, -926316, -360080, -425972, -27439, -278994, 621387, 153604, -757053, -899544, -962936, -938422, 193107, -376597, -226090, 670895};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques749(){
        Integer[] array = {-507790, 155701, 597530, 425866, 635784, 838028, -963048, -915702, -550008, 345598, -206526, 317033, -24562, -518627, -674955, 830844, -163171, -960749, 37312, -867842, 922707, -878946, 458408, -585075, -458062, 710849, -489107, -779513, 979904, 515530, 120305, -567551, 483752, -313720, 663539, 129731, -858395, -215083, 111051, -533333, -458315, -855227, 767054, -629096, -867339, -388167, 325654, -269693, 923737, 846686, -608947, 889852, -722736, 34504, -946557, -392439, 601379, 487969, -769529, -344720, -800784, -744165, 588369, -836366, -399935, -983864, -503580, 925953, 694677, 573436, 51780, 842842, 738638, 688125, 900635, -980431, 320368, -325789, 973761, 856003, -273054, 825988, -486438, 111216, 340667, -954047, -747806, 560825, -609085, -947208, 985436, -126586, 627229, 594396, -593825, 283203, -323947, -936967, 7999, 598932};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques750(){
        Integer[] array = {591710, 321961, -681629, -301088, 742292, 798498, 629111, 161790, 649285, 25257, -716963, -707658, -273834, 401565, 838950, 178064, -946548, -475738, -866663, -410420, 653641, 205403, -98567, 398234, 813945, 657419, -416812, 518533, -819447, -126436, 228022, 665231, -722688, -848544, 890612, -420844, 292502, 930799, -929003, -685469, -468093, 732906, -123436, 143933, -5721, 998765, 304043, 192873, -986880, 582691, 414033, -108891, -991693, -241804, 999910, -872606, 984324, 561268, -580166, 549549, 141595, 888833, 15889, -67661, -181686, -369771, 490227, -287172, -848717, -245584, -661494, 169691, -787980, 750003, -784130, 832066, 622291, 596609, 185273, -915529, 423914, 170542, -181517, -642988, 202777, 78765, -896719, -936922, 240390, -389548, 589522, -591517, 262269, -634118, -797239, -745186, 634522, 466176, -366724, 581482};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques751(){
        Integer[] array = {-722438, -924224, 129082, -91116, 602672, -521700, -572351, 400844, -96424, 242728, -438855, -808634, -220722, -400675, -895214, -250134, -649765, -83835, -715762, 815678, -956055, 414205, 993682, 122013, 221745, -762908, 431945, -696615, -899373, -295156, 897881, -241996, -334255, -953209, -914621, 709486, 908660, 596187, -513089, -124205, 155460, -492800, -723149, -416348, -613574, 759978, -589843, 191277, 37781, 238394, 801440, -496594, 146599, 381372, -259859, 11632, 755756, -810432, 898913, -79092, -810722, -440758, 447696, -523075, 839368, -541022, -109147, -814396, 783286, -196427, 536242, 991018, 520591, 105412, -464277, 595328, 722511, -680430, 883271, 194227, 776325, 868567, 40227, 87749, 101694, 709679, 338093, 44336, 15013, -795201, 920526, -754031, -890491, 426856, 261970, 621621, 807700, -74610, -161731, 163762};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques752(){
        Integer[] array = {-795153, 336323, -647097, -896973, 767594, -385650, -125691, -942524, -546874, -264403, -996926, -955831, 979567, 453015, 657346, 957637, 95516, -872150, 910911, -606925, 373633, 192797, -840526, 176526, -803826, -44988, -887923, 772771, -922495, 265665, -403867, -930122, -51746, -278980, 590524, -323726, -987388, -465240, -525758, -141992, -836076, 609553, 910449, 858577, -947515, 217981, -954339, -58976, 560323, -558595, -767727, -85184, 486124, -810986, -384718, 337278, -603579, -584377, -897895, 792523, -54834, -639385, -62468, 61847, 116657, -344786, 891568, 801687, 205031, -443695, -856357, 169569, 951338, -67032, -629618, 82233, -889441, -362706, 300930, 969473, -827307, 60376, 180417, 63645, -435912, -852388, -199451, -786256, 244914, 444319, -902252, 562770, -777449, -224484, 114750, 594696, 926637, -255987, 438585, -903982};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques753(){
        Integer[] array = {514652, 343468, -63978, 239991, -130774, -895760, 222216, 567199, -501641, 539236, -397725, -54643, -344941, 450244, 32170, -225414, -348004, 677147, -775648, -177821, -897913, -528873, -820127, 647829, 559256, -432633, 681667, 622948, -651642, -189153, 701298, -167991, 435730, 22440, 250350, 475330, 68726, -156653, -582657, 237001, 215601, -831098, 687075, 848567, 287685, -886114, 628432, 245379, 441188, -562329, -699647, 204417, -127224, 201529, -411120, -525052, 506699, 251396, 113924, 313317, -104529, -492644, -193555, 254091, -495929, -268270, 562749, 714503, -82288, 374256, 171587, -806538, -999505, 244165, -53296, -820014, -600065, -330151, -118819, 672444, 656124, 334118, -937465, 123718, 848781, -894892, 178834, 321431, -605139, -930102, -703605, -875073, -434391, -132952, 110022, -510802, 73488, -467765, -29480, 561553};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques754(){
        Integer[] array = {-744523, 44632, 919485, 537265, 263920, 175591, 360800, 486685, 528404, -692730, -378247, 128840, 590176, 918304, 402897, -24445, 473720, -753545, -198399, -264471, -791899, 682191, 409295, 309276, 418272, -103970, 709932, 862952, 851225, -515458, 498217, -282590, -903593, 163636, -53722, -127635, 555473, -587094, 530731, -374430, 322974, 286938, -227876, 157191, 283366, 614821, 255175, 625607, 702996, 675198, -829202, -782355, -802650, -590322, -22719, 367507, -512429, -132092, 835087, 325161, 772331, 520001, 650392, -183324, -65756, 66233, -278816, -127841, -466374, -595225, 417842, -856085, 917106, 408810, 541620, 937736, 743613, -999274, -207918, -840299, 359147, 740529, -983900, -896076, -475108, -924511, 934669, 755226, 71822, 213345, -139929, -864750, -950193, 767232, 42712, -840664, -443393, 321305, 441196, 590734};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques755(){
        Integer[] array = {-726048, -862437, 850993, 153393, -874710, -504183, 956736, 357526, 574768, 348818, -888736, -187274, -893209, -856625, -738203, -989426, -892076, -250520, 873615, -833605, 181806, 91163, 933322, 640352, 505676, 466772, -443503, -504457, 859178, -226536, -120204, 24389, 628145, 827678, 424005, -751545, 217370, 779601, -557790, 510468, -776444, -977850, -587199, -284782, 501554, 947968, -248679, -428770, 625762, -167421, 172262, -895974, -101920, 773093, -297746, 55982, 802110, -30227, -222130, 993636, -663658, 399724, 747367, 664511, 552535, -505858, -761310, 980802, 389402, -696684, -700798, 81675, 728481, -302769, 295144, 776171, -556587, 222475, 672412, 72643, 66972, 963556, 816257, 358792, 962069, -165145, 368548, -177044, 540589, 619107, -311743, 653983, 879838, -242740, 705588, -192969, 135963, 164436, 999240, 669118};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques756(){
        Integer[] array = {-643261, -909881, -76906, 818001, 820325, 657013, -512852, 464448, -908156, -22072, -421583, -695473, -234834, -505192, 508102, -746170, 446900, 861991, -71323, 404687, 283097, -189447, 100190, 767735, -590628, -865495, 456569, 25913, 743983, 53026, -175794, 403694, 852759, -571992, 730020, 492507, 875291, -376610, -501014, 350358, 134927, 325328, 268836, -397098, 717404, -924056, -243288, 470778, 835164, 748153, -885004, 343717, -776859, -213420, -222918, 276447, 363673, -539185, -217851, 676088, 914963, 43019, 163275, -293532, 961039, -825684, 586461, -414712, -119448, -897354, 431871, 54161, -363121, 815445, -393689, -81658, 414407, 364056, -354980, 754130, -523904, 101168, -633230, -607005, 958051, -272536, 110738, 7505, 12605, 315472, -667110, 445141, 858611, -388576, 192678, 749770, -709277, -745877, -74127, -952718};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques757(){
        Integer[] array = {-315424, -419936, -154833, -821671, -351438, 110998, -235774, 382454, -397267, 776293, 206944, -152802, -188442, -348381, 270676, -337521, -69139, -620857, -44844, 322684, 153401, -602244, -160106, -304313, 639746, -13544, 566909, 644598, -543059, -955058, 122956, -720354, 98960, 633995, -852109, 100098, -816416, -387621, 943740, 260193, -481020, 437963, -391205, -198286, 264955, 121562, 401015, -667676, -970185, -57278, 527236, -249257, 109458, 721361, 535748, 91228, -557379, -664279, -408309, 318904, -510014, -246084, 25903, 68768, 231236, 283551, -603897, -778521, 816494, 26976, -609185, 908192, 323722, 994179, -855775, 871176, 347315, -846739, -631138, 976499, 43663, 533209, -700775, 160542, -773581, 560868, 513707, -981994, -203189, 27995, -690593, 586578, -807511, 152793, -714539, -41089, 587716, -866335, -951664, -93247};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques758(){
        Integer[] array = {-545535, -307124, -373744, -488137, 841183, -72886, 603543, -700229, 316650, 3520, -315506, 653341, -785121, -629020, -961642, -259387, 426962, 157961, 57356, 130692, 602847, 628081, -606395, 62530, 482364, -101030, -185173, 327211, 425703, 586840, 674190, -96820, 537144, 771088, -700902, -106018, 6424, 881587, 373047, -396499, 609674, 601292, 275282, -996207, 968223, 957258, -18924, 976137, 794847, 486498, 128253, -795918, 782860, 713749, 996784, 703097, -217448, -304153, -624561, 946522, -930811, -774100, 976123, -978184, -380150, -862066, 62257, -282060, 7470, -992744, -185173, -866320, 815547, 336357, 673340, -235925, -85284, 239736, 421069, 663941, 45168, 561548, 766253, -875792, -28440, 625122, 578578, 435596, -16315, 430363, 955256, 885115, -499371, 640648, -538716, -698542, 182412, 528950, 872587, 748832};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques759(){
        Integer[] array = {120206, 687825, -455027, -159519, 88819, 214471, 722998, 620964, 783050, -212734, -784944, 543272, -132323, 830762, 928427, 618714, -352153, -596767, 104990, 14336, -254387, -275333, 498363, 915205, 806930, -19978, -152253, -835569, 935698, 51664, 180013, 716723, 312173, 644508, -241423, -861975, -274416, -135325, -366737, 339813, 23405, -59555, 112397, 208894, -772343, 384327, -716534, 77555, 667882, 141604, 270500, -301399, 892307, -689890, 88387, 710671, 777043, 767216, 503904, -904876, -697013, -40304, 659128, 187524, 727878, -593246, 97883, -356053, -391947, 287502, -206140, 674435, 20495, 882563, 560899, -782248, 73174, -897352, -105116, 738142, 513771, 229432, -709163, -898687, -548760, 22696, 506713, -470124, 792024, 937643, -189452, -831024, -626793, 460614, -700664, 811884, 916394, 358261, 321596, -11356};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques760(){
        Integer[] array = {162248, -738737, 179948, 15054, -361956, -507627, 745686, 461582, -722889, 928453, 464926, -71829, 654285, 754719, -338717, 785776, -574813, 59211, -178048, 622344, -674082, -171506, 495208, -44756, -578650, -659101, -577255, 265544, 150496, 906330, -445695, -941488, 458464, -127265, 882337, -945375, 715289, 752689, 247990, 846590, 297814, 356225, 82795, -548883, -957007, 953778, -142653, 268663, -574276, 655536, -520182, -574523, -274768, 771496, 179125, 677998, -795712, -752921, 320954, -97593, 64521, 733457, 639248, -826379, 51565, -857656, 63805, -186761, -979319, 371254, -923291, 65024, 131311, -542150, -810105, -454616, 229031, -327499, 903173, -638152, 793898, 706968, 593730, 440679, 199747, 737795, -459330, 799317, -270168, 363082, 368107, -691099, 866903, -261358, 18271, 467045, -985216, -499498, -845818, -492376};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques761(){
        Integer[] array = {-978432, 796645, -811388, 767542, 430386, -31512, -598776, 682560, 63850, -661301, -556838, 869139, -13131, 784214, 432223, 847238, 52951, 81039, 150692, -265015, 218044, -934277, -32683, -461367, 903266, -588839, -539579, -579566, -321640, -879409, -436597, -879573, 835639, 879855, -73550, 445414, -785087, -860531, -297046, 625620, -654508, 706335, 973601, 970208, 812988, -1820, -611042, 27463, -325372, 466839, -546548, 663171, -694255, 911765, 663859, 979537, 282423, -900421, -34553, 153444, -473559, 287690, 205603, 51001, 727966, -611811, -925330, 813086, 871076, 382374, -869830, -976726, 551649, -236036, 273612, 497356, 101078, -385706, -643874, -698805, 580400, 947378, 615538, -325601, -646939, 540219, -41286, -443836, -49630, -274941, 311924, -496710, 68382, -614843, 193848, -782863, -337355, 597595, -544932, 3786};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques762(){
        Integer[] array = {223211, 139099, 655896, -389634, -248221, 386739, 370927, 767243, 633941, 675334, -154000, 177809, -773572, 207762, 337597, -523454, -270924, -11330, -569389, 656080, 397304, 121584, 532228, -510502, 249883, 843477, 660977, 201514, -366305, -180068, 543916, -243285, 191391, 827971, -185727, -610140, 325021, 323751, -762211, 155265, 27683, -726077, -300645, 845781, 319574, 734642, 425613, 902863, -219703, 237065, 888591, 54788, -874017, -837458, 869403, -775632, 263282, 340742, -838051, 75387, -641422, -132767, -125687, 637762, 728931, -887704, 93457, 650055, -282470, 767148, 60631, 842477, -139049, -148842, -625456, 620132, -97544, -885230, -240823, -986341, -536010, 876026, 550507, 773791, 933891, -635445, -966109, -945284, 604480, 865013, 28317, -188701, 868713, -841442, 142148, 579920, 244277, -938220, -891997, -938817};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques763(){
        Integer[] array = {528576, 678718, -743607, 268819, 268906, 428121, 489780, 165839, -614294, -535638, 538355, -829056, -712443, -209545, 699268, 841143, 322081, -872984, -818460, -626404, 621150, -793790, -899878, 687744, 750620, -109669, -451547, -287573, -666633, 865588, -520244, 175974, 161351, 466114, 819191, 170446, -15516, -516120, 432115, 657853, 694836, 701420, -923283, -907767, 419227, -283213, -420123, 272196, -638489, 932600, 795522, 136588, -615404, -89851, -82910, -98603, -310030, -586947, 681938, -737601, -754635, 796404, -8348, -389992, -685266, 980291, 237431, 726082, 547727, 633151, -60175, 370277, -301694, -429565, 611524, 97045, 590005, -488949, 31756, 969770, -284768, 441922, 291006, -664116, 404602, -403601, 545683, 821182, 545805, 556059, -744231, 832947, 846196, 348978, 949774, 93606, 168333, 876463, 572223, 225918};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques764(){
        Integer[] array = {330191, -807949, 522153, -671435, -597385, -90600, 590922, -7676, -188043, 755832, 931085, -928870, 21072, -184909, 558792, -158443, -570765, 925575, -621112, 539443, 652408, -300355, 320345, 556242, -847428, -128380, 179759, 852024, 485063, -959578, 206579, 6050, -532281, 738272, 689617, -801066, 119171, -145930, 962068, 297564, -690877, -198615, -80879, -562275, 716383, 934817, 123140, 161702, -460801, -984156, -245841, 730163, -246944, -880809, -803137, -261061, 378764, -927917, -496172, -715985, -845238, -167262, 410740, -974617, -943869, 397324, -801284, 915625, -559170, -766637, 159967, -261046, -830917, -617919, -258735, 740479, 57061, -230651, -500445, 870781, -331623, 522257, 129117, -663209, 818031, 146673, -288234, -449183, 729345, -146898, 414521, -254793, 750643, -249983, 122831, 128877, 817974, 18355, -70939, -381834};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques765(){
        Integer[] array = {791174, -901657, 146770, 580064, -841577, 754922, -550340, -537874, -911965, -261784, -737121, 94239, -604701, -883899, 265687, 83006, 516700, -847912, -525223, 514215, -116936, 850406, -730619, 540746, -926533, 659359, -438394, -614448, -513833, -300849, -792751, -367426, -474750, 32065, -404770, 762960, -329779, 24361, -350985, -233931, -243783, -768563, -220923, 398056, -152632, -191403, -843917, 183038, -539074, 856647, 166203, -428549, -258447, 174175, 510228, 278774, -398386, -430222, -662847, -304941, -865276, 406625, 301756, 418742, -227205, 518281, 607132, -598298, 138783, -853390, -286515, -870668, 133910, 482765, -181289, -62407, -131984, 696855, 482899, -300580, 736374, -659940, 45275, 138646, -826893, -97961, -239539, 736936, -292638, -928532, 86615, -404244, 779790, -790965, -230047, -320729, -5103, 249583, -299474, 807560};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques766(){
        Integer[] array = {449989, -684910, 635980, 280662, -588474, 642335, 732772, -480238, 568261, 89140, -89515, 82685, -590807, 146081, -177090, -477949, -208733, -762284, 103564, -260424, 504846, -245766, -730553, 800400, -849743, 355296, 348653, 662291, 421185, -653375, 511858, 888253, 549702, -278118, 257326, 842399, 189026, 384221, -873542, -837596, 456403, -216584, -162173, -673979, -129932, 811629, 351124, 145042, 170468, -912958, -334800, 226828, -85507, 112512, 622290, -20981, -421815, -438539, 703289, 196007, -305410, -178921, -874296, -662441, 620157, -428652, 632965, -584691, 18346, -265739, 468861, 984986, -793864, 904137, 622413, -700550, 173835, 510190, 301457, -691180, 914803, 880616, 1435, 688456, -503599, 832005, 67425, 904920, -291002, 769546, -624681, -521261, 724125, 996794, -324135, -868477, 193414, 71369, -379204, -541161};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques767(){
        Integer[] array = {544774, 442966, -548486, 704346, -858603, 903365, 68284, -429118, 875205, 789346, -448107, 377125, 251251, -310968, -312101, -841170, -567314, 570457, 368606, 248432, -948133, -794915, 688797, 379936, -265701, 882424, -57369, -591589, -733400, -811919, -825977, 249210, 974769, -461829, 728090, 127512, 433072, 908654, 791607, 413144, -366623, 72753, -42718, 397025, 423370, 164142, 518396, 679972, -842167, -926925, 121881, -566521, 113911, 276264, -241750, 73713, 941805, -752663, 854362, -488117, -277190, -955087, -2015, -939782, 167274, 682393, 153480, -656669, -962949, 22581, 916833, -82423, 474380, 359580, -109483, -601042, 579839, 85421, -833568, 385069, 714281, 164734, -103066, -158212, -216868, 955859, 333194, 519663, -4770, -278103, -994210, -389367, 55270, -988433, -884293, 928512, 423035, 561410, 795605, -423393};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques768(){
        Integer[] array = {-718492, 835145, 91524, -472032, -213604, -787251, -710617, 734997, -644280, -535667, -439075, -74038, 843179, -507309, -117766, -921103, 117681, 927277, -215237, -896690, 662313, 40327, -988689, -760768, 896496, -160224, 257954, -739924, 400902, -903004, -489320, -253802, 385208, -533346, 393520, 766693, 314100, -397914, -77910, -345578, -558742, -611871, -81055, 523086, 147573, 660788, -499051, -565605, 643082, -600388, -884221, 983364, -365252, -240669, 389477, 925126, -47990, -616629, 558297, -863464, 911599, 102852, 659189, 978282, 383842, -881032, 576505, -98961, -222240, -759458, 593297, 926502, 663788, 690946, -990297, -162520, 877814, -289482, 393966, 741831, 865022, -191303, -276444, -829453, 407428, -46801, 232277, -79756, 310955, -121259, 180235, 27024, -282233, 570641, 513417, -50574, -58481, 673951, 679286, 319869};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques769(){
        Integer[] array = {427666, -755354, -274203, 500762, 935186, -181859, 801201, 249840, -458167, -130090, -829870, 387263, 661309, -86311, 95176, -345699, -545358, 929304, 51121, 346381, 880548, 460601, 959781, -396595, 434868, 533582, 47941, -427799, 480662, 779951, 920810, 607718, 976523, 723153, 601282, -395024, 446135, -770516, 686011, 337425, 867186, 236891, -67400, 215417, -162459, 985016, 929837, 782541, -622882, -836713, -525075, -314242, -853379, -835213, 940977, -458055, 861872, -820092, 478345, 576782, 868931, 938546, -673666, -987001, 20195, 534855, 81699, -742254, 210498, 881543, 474321, 800346, -918567, -732410, -943568, -737730, -567713, -965425, -957436, 248931, 136777, 643549, -198587, 379453, 327099, -881661, 29788, -122650, -649081, -389795, -190654, 504480, 225476, 13998, -405702, 720938, -407174, -978158, -163210, 656080};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques770(){
        Integer[] array = {465055, -15961, 880853, 548461, -986764, 151257, 669093, -234945, -72452, 79128, 473163, -166416, 193044, 175258, 919780, 292094, -625559, -364275, -585292, 112638, 526551, -166213, 901038, 346740, -382552, 492229, -357695, -580173, 24358, 591408, 137179, -58283, -243670, 985894, -616511, -420335, 278785, 784224, -568797, 649723, -944186, -843965, 382572, 912697, 563370, 12206, 267769, 882272, 60736, -563602, -937289, 127139, -857612, -618641, -171405, 141567, 954567, 889564, -677914, -774705, 743661, -27106, 835759, 638973, -830012, 142733, 945038, -446891, 346715, 516489, 335192, -201906, -163187, -631359, 839963, -634163, 413774, -347541, 534760, 779696, 564003, -806957, 456953, -556327, -573532, -423482, -349793, 281832, 75207, -665740, 387642, 642334, -912795, -40554, 621928, 210597, 600509, -325159, -16351, 702006};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques771(){
        Integer[] array = {277745, 793415, -641834, -761044, -385632, -291213, 489667, -841742, -129673, 108160, 975787, 810785, 369084, -280425, 80965, 376824, -263998, -255951, 783042, 107199, -763802, -615546, -895033, 210140, -40249, -860472, 891209, 813703, 789918, -300940, 948030, 926749, -562119, -848936, -793154, 442765, 345798, 774529, 776039, -502256, -688959, -158912, 745208, -164171, 536291, 21349, 808460, -449934, 611806, 472997, 356790, -65383, 411546, -535869, -437133, 722027, 953908, -125149, -876556, -429891, -477398, -202842, -377883, 528664, 233121, 406326, 273003, 595262, -844853, 9904, -68824, 657959, -920470, -621144, -599015, 802408, -177536, -342970, -844945, 93470, -54546, -83986, -951565, 224764, 718755, 677441, 208657, -799824, 180591, -30031, -924126, -164899, -989295, -97181, -388827, 221658, -35668, 611444, -795160, -829617};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques772(){
        Integer[] array = {320158, -968987, -837574, 147324, 769443, -456032, -974359, -182324, 224532, 879606, -600044, -898529, -35209, 694696, 228964, -86189, 283012, 530256, 634434, -662837, -417229, -744527, -139216, 818504, 179834, 723767, -493958, 973199, -891387, -198789, 897922, -584476, -629261, -670066, -830735, 346868, 828499, -26113, 371509, 575211, -268568, -846790, -154216, 173974, -516707, 170286, 31845, -6188, 286668, 923011, 419656, -83539, 236070, 489172, -607450, -814187, 26161, -988442, -134938, 543814, 79715, -231224, 837518, -203461, -989507, -146283, -522117, -366948, 598861, 633650, -325226, 773012, 152819, 900612, -177677, 573682, 616637, 169515, -939818, -28727, 35825, 790753, -273740, 473436, 440222, 874175, -14692, -139535, 676873, 52331, 3744, 31630, -977279, 776123, 947809, 141347, -327672, -361045, 441659, 306886};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques773(){
        Integer[] array = {448330, -485035, -835315, -868868, -669410, 644704, 352900, 365766, 751600, 778091, -814715, 105948, 243754, -604089, -740642, 771245, -313787, 512841, -870105, 603136, 257400, -126294, 773037, 811532, 234680, 360981, 864512, -770713, -516906, 77117, -261638, -466661, 607442, 105426, -670735, -647504, 791212, -342648, -356503, 352312, -528704, -58085, 798929, 696588, 546053, 847400, 389054, 89718, 554110, 897868, 19855, -82333, 532201, 747766, 127490, 630888, -650054, 378744, 719756, -90178, -89715, 619050, 625298, -548656, 15751, -937999, 222697, 862308, -74287, -234899, -46398, -350992, 440075, 785102, -642634, -947926, -936512, -930534, -352741, 520090, -967592, 686886, -443769, 317176, 135414, 592226, -795941, -463236, 11963, 356938, 668545, 349755, 462493, 429660, 656191, -313042, -159210, 323917, 897491, -769795};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques774(){
        Integer[] array = {-34043, -653548, 900279, -169981, -228776, 386418, 287230, -315373, -37263, -539847, 451223, -332639, 100078, 79368, 729899, -680967, -176356, -50111, 406555, -163973, 240141, 375757, 456075, 260392, 286089, 999227, -493438, 673200, 218699, 815481, -218138, 761340, 902632, 631377, -489280, -605516, -198502, 94617, 878944, -652048, 801267, 950843, 329980, 460778, -400901, -323617, 24818, 1340, 506705, 795227, 895515, -77114, 363681, 918210, -496449, 953919, -199214, 615164, 294552, -730278, -445598, -368533, -299566, 963383, 231567, -906747, 72649, -709146, 836405, 688400, 992492, 642036, -381054, 979842, 823166, -958286, -800937, -300136, -895442, -66797, 614335, 631096, 3111, 460694, 493187, -710925, 72606, 602526, -183872, 35093, -991939, -201288, 963079, 25185, 760934, -161478, -697706, 99272, -685130, 635854};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques775(){
        Integer[] array = {53166, -627880, 902384, -378417, 144438, -373819, -236632, 186285, -237867, -530537, 410385, 251602, -792363, -684533, 910096, 117553, 729583, 306554, -767775, 789292, 919438, 67666, 914842, 786441, -873759, 937951, -932668, -789288, -792323, 54379, 856981, 60262, 446772, 987357, -433145, -269907, -665001, -499174, -608474, 549627, 295535, 680677, -306091, -399826, 852749, 842882, -909096, 433123, 694639, -233348, 625813, -897342, 423772, 612352, 538375, -242025, 717930, -565209, 487380, -648517, 633929, -144846, 36458, -862499, -594258, 219049, 963780, 160213, 639051, -461037, -226644, -347420, -84723, 940719, -330460, -360393, 160021, 465282, 999148, 664581, -791166, 496087, -431376, 447213, -704064, -472095, 989110, 839104, 341390, 892574, 981984, 885184, 499608, -225985, -664900, 456540, -124269, 93532, 320308, -58356};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques776(){
        Integer[] array = {-124527, -82320, 819625, -363746, -336122, -397407, -343062, 17573, 273241, 297183, 134995, -918743, 139747, -366095, -490975, 929322, -462333, -607954, 839936, 476728, -233258, -210972, 831886, -694572, 693276, 455152, 348598, 261579, 596204, 473815, -998396, 561380, 213728, 126373, -625469, 391007, -123336, -647661, -126922, -53830, -848636, 691325, 612422, -56583, 258755, 6124, 467966, 332570, 760391, 43948, -333714, -48801, -862920, 517362, 819360, -481838, -251593, 253103, 482644, -733826, 830048, -445418, 296254, -927025, 57188, -340681, 355223, 876363, -845289, 719711, 153829, 252041, 931190, -700620, -728091, -903587, -260724, -208515, -449784, 781919, -759935, -16416, -122338, 772449, 88810, 675198, 534373, -249746, -366220, 964322, -138074, -880480, -270925, -939104, -589663, 167892, -553563, -230008, -710631, 525328};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques777(){
        Integer[] array = {-187742, -647702, -646295, 531466, -747522, -743969, -961693, -339513, 168509, -451359, 659780, -692695, 176187, -438608, 125964, -801231, 504190, -773965, -172131, -551952, 837772, 868520, 67943, 490891, -49981, -380511, 883752, -287201, 443691, 819224, -46531, 577340, 660850, -303867, -578767, 576622, 682263, -124904, -575854, 599873, -695095, 422471, -506264, 849744, -803541, -830535, 144672, 214997, 454476, 442120, 865387, -799135, -822308, -816007, 102245, -153746, -212556, -666713, 881524, -326990, -298857, 131358, 512685, 93179, -422737, 875016, -429496, 45897, 398776, 396586, 453902, 647908, 22043, -887291, 933610, 34427, -161300, 49044, 438212, 133123, 251115, -63032, -476949, -245815, -826428, 541400, -217, -736883, 65408, -960407, 233354, 8260, -720396, 731052, -32374, -689317, -135307, -277846, -253720, 56506};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques778(){
        Integer[] array = {418119, 600100, 626014, -753609, -138867, -239422, -908911, 766356, 311899, 371390, -956988, 141539, 373424, 49314, 977596, 188061, 451462, -181957, -596668, -367282, -172192, 517287, 862247, -957966, -606577, -233884, -285325, 644945, -559378, -973319, 857147, -823780, -388359, 871482, -523563, 396045, -664440, -43121, 201035, -150807, -78740, -912567, 725486, -211749, -198127, 15998, -923451, -350847, -841547, 826793, 28150, 231872, 92605, -289428, 958530, 749788, -982930, 722811, -603196, -711903, 187830, -739780, 555435, -369926, -288224, 226390, 98066, 875467, -646586, 323616, 584907, -263483, -142971, -159824, -733682, -55023, -626826, 3050, -435380, 34749, -737388, 117172, 681076, 140321, -753805, -510762, -828554, -379465, -819745, 609019, 392272, 930476, 797296, 197072, 265870, 907763, -235672, 717798, 442521, -31555};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques779(){
        Integer[] array = {584696, -815047, 83137, 512379, 840994, 361497, 997474, -905452, 910410, -125823, -934656, -736368, -570224, 712513, -746097, 338594, 473562, 552852, 441937, -931882, 35630, -905412, 843921, 484272, -138393, 927002, -116041, 7983, -59567, -987421, 192745, 861410, 520878, -872805, 167094, -921124, 777518, -694401, -525889, 441907, 413428, -165330, -125850, 341043, -777933, 865857, 301916, 520152, -206462, 461682, -620577, 380129, 226906, 396493, -487510, 156159, -839424, -542593, -711821, 594051, -860974, 828201, -348041, -466177, 912889, -725032, -759655, -973729, 164839, 257174, -97983, -75158, -371512, 174275, -778053, -821237, 947754, 990537, 517027, -467478, -260264, 109828, 651515, -944156, -688252, -375445, 346772, 233598, 794171, -994977, 67904, 181752, -366749, -762847, 431325, 404935, 95855, -553896, 306919, -289197};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques780(){
        Integer[] array = {-668553, -220030, 90886, 452188, -768410, 83786, 34070, 594821, -260834, 333346, 106258, -763758, -201932, 386356, -364706, 419922, 238904, -414579, -661301, 536675, 463961, -924834, -228717, 540057, -87500, 517594, -156911, 936379, 529870, -124252, -772682, 327093, -361744, 235407, 622643, 944981, -395230, -817646, -440236, -122713, 41541, 138686, 159712, 211470, -101074, 155375, -451865, -538570, -890663, 486655, -596844, -549359, 423425, 66368, -753696, 726474, 644401, -842162, 766162, 45213, -101835, -826121, -446219, -739384, -923685, -686803, 826673, 678674, -546683, 529554, 184682, -438492, -65692, -211375, 262233, 688332, 75963, -805106, 420408, -673553, 287004, -131194, 543097, -181654, -785516, 865407, -850674, 178033, 135019, -214854, 712432, -447439, -716691, 141218, -694557, -741048, -256745, 231437, 115132, -94736};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques781(){
        Integer[] array = {-599079, 956962, 84577, 607204, -779759, 387057, -133199, 428911, -687836, 723913, 1136, 986485, 945494, -711034, 892874, 919964, 495212, -540557, -843456, 532167, 433743, 454265, 641130, 53090, -82770, 608117, 32001, -923588, -712739, -597515, 48200, -334777, 589397, -493830, -453224, 996391, 358136, 321151, 905663, -663190, -771999, -283573, 934515, -482032, 926880, -573205, -941928, -296350, 600491, 448659, -503012, -277984, -658126, 104636, -46489, -931260, -980597, -69964, 845274, -826248, 744949, -27939, 862904, 935079, 965604, 622583, 219880, 683207, -173762, -599857, -973991, 354521, -831167, -977833, 971042, 169669, 709861, 838178, 580254, 905921, -835207, 865305, -477400, 269229, 641092, -234562, -432730, -534943, -643819, 123048, 577539, 470620, 635664, -234993, -391599, -690641, 675811, -297273, -656630, 947710};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques782(){
        Integer[] array = {-859710, -373504, -160790, -15988, -389744, -905805, 395359, -462635, -743408, 312259, 585088, -693104, -68346, -996997, 217325, 652720, 473029, 711460, 206032, -452913, 846117, 450398, 510273, -731360, -500856, 89660, 990753, -745315, 199918, 695785, 902165, -16080, 790512, 751917, 773324, -62931, -626699, -631480, -91693, -777308, 347606, -393, -325019, -696040, 865122, 403847, -991278, -151392, 56466, -968682, -525343, 811859, -332694, -869866, 373997, 681761, -92499, 642243, -266649, 751207, -981738, 818761, 172432, -660485, 990700, -139579, -717626, -425269, 92673, -585870, -336333, -613645, 330180, 938066, -492762, 733449, 848048, 758224, 346274, -73629, -812753, -945521, 757459, -266708, -501917, 187964, 46565, -216111, -465711, -381258, -227513, 445399, 469666, -140265, -645514, -172364, -40774, 43896, -82895, 219768};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques783(){
        Integer[] array = {371647, -262831, -924514, 793033, -155511, -453620, 182205, -923029, 993891, -630411, 804035, -517095, -206121, -142231, 851599, 441417, -421193, -928942, 758404, 924369, -549489, -965500, -117800, -294541, -94527, -283571, 874582, 555856, 414438, -388530, -642912, 29478, -707373, -616482, 758715, 721133, -702948, -312890, 336057, 601114, -317287, -10439, -325954, -442303, -956361, 348753, -827128, 869459, -3690, -680813, -183003, 668983, 60392, -144889, -257492, -91364, -658261, -625762, -463775, -252466, 256593, -87974, -59029, -25635, -919122, -365428, -514906, 608553, 419288, -723983, 386203, -309444, 582204, -371741, -575066, 363116, 372292, 98017, -876674, -691679, -641527, 219342, 833785, 725381, -183669, -887758, 508101, 17286, 525286, 858530, 85379, -932696, -92582, -929871, 77326, 512248, 146898, -461439, -54207, -181919};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques784(){
        Integer[] array = {511537, 233859, -223162, 349385, 59318, 829385, 106681, -400743, 256181, 793050, -21657, 189299, -31441, 241483, 247412, 646963, -95879, -905052, 990467, -346215, 821735, -181773, -418018, 185825, -451510, -904998, -265001, 820128, 610041, 708099, 202987, 970568, 260175, 824621, 834129, 358961, 172816, 595963, 678635, -814076, -842403, 202297, -628074, 605534, 118104, -355659, -256041, -689317, 89662, -299867, -691554, -958369, 311125, -387305, -755729, -90941, -75221, 881318, -233476, 761136, -477518, -922207, -513864, 97553, 769108, 982450, 276903, -527266, 808016, 631173, 200936, 539843, 322806, 938859, -904295, -875161, -932729, 569639, -296031, 177122, 840326, 423828, -894067, -239591, -779081, 228154, 813733, 720185, 600424, 310582, -704572, -12823, -60364, -72066, 308790, -111186, 593811, 508408, -842356, -564698};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques785(){
        Integer[] array = {-857890, 882584, -533124, 427262, 709346, 224042, 231435, -168544, -834338, -957588, -729462, 323702, -914201, 250864, 599474, -582069, -917236, -263053, 621867, 214349, -777783, 732273, 427483, -768020, -210715, -739255, -19739, 958919, 94586, 140787, -877384, 854962, -817574, 727739, 948654, -257756, -3059, 66837, 428602, -544014, -796233, -758686, 306684, -64180, -614286, -484684, -215631, -298689, 101407, 884456, 338422, -771049, -851844, -718729, 746302, 267526, -492510, -528051, 938075, -296922, -587778, 672759, -963626, -977763, 289155, -152103, 155694, -805899, -731242, 505911, 90311, -200100, 495822, 238055, 825230, 280320, -641023, -222863, 527077, 701244, -17089, -958926, -537832, -405990, -75864, -383104, 641068, -450628, 165695, -773952, -275076, -57305, 216728, 999783, -896845, 212905, -827241, 807966, -122226, 55970};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques786(){
        Integer[] array = {-565504, 160040, -28827, 691530, 892530, 936660, 867241, -998026, 638839, 449429, -870286, 724257, 738079, 810813, 145968, 439121, -633059, -229303, 894075, 279407, 562092, 324340, 316412, -297357, -881911, -138137, -757317, -596420, 922610, -328124, 222532, -892411, -136057, -204561, 469913, 391999, -633860, -12730, -882712, -169426, -664079, 777787, 906539, -888364, 841677, -173821, -978486, 522539, 435094, 731927, 866091, 581773, -215803, -546347, -949203, -648157, 108188, -511158, 993112, 887318, -415707, -264983, -540807, -782157, 375480, 407743, -242560, 535102, -659213, -828717, 104699, 262673, 874905, 663227, 8391, -944466, 904429, -269305, 446255, -682143, 578003, 523195, -289980, 333160, -880036, 417439, 715262, 282932, 474268, -405859, -967796, 735815, -832699, -619550, -317990, 406899, -640960, 630780, -968585, 737489};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques787(){
        Integer[] array = {102252, -83832, 343059, -681554, -309578, -108285, 226775, -351088, 963312, -863657, 185733, 16260, 332619, 191945, -241838, 395327, 755352, -459769, -982360, 135496, -446594, -96266, -444638, -715480, -452135, -686212, -383268, 174076, -4733, 262308, -913613, 976073, 581973, 363188, 745944, -900149, 577559, -242977, -98130, 350213, 160186, 930477, 266445, -442591, 108567, 623764, -371791, 512629, 177704, 22847, 511781, 108434, -613006, -837734, -331468, -655914, 558930, 910824, -944942, -12050, -934334, 6431, 879868, -638927, -943605, -360857, 880180, 948513, 797714, 890604, -734245, -344840, 928842, 292104, -506684, 766402, -78049, -141561, -474491, -565166, 670551, 627485, 938990, 742903, -724680, 295712, 726566, -194144, 861644, -533366, 371907, 767724, -365100, 761361, -791964, 137278, 281692, -564918, -656866, 347984};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques788(){
        Integer[] array = {368498, 159040, 134078, 172186, -723103, 753502, 635967, -508455, -145567, -636358, 470574, 456077, -559926, -274698, -356740, 82240, 607060, -251203, 571170, -435219, -784299, 832926, -62005, 521605, -148844, 229545, -927221, 254107, 267474, 977964, -464536, 721107, -901357, -174865, 535077, 353292, -562911, 455853, 247368, 499852, 194135, 64183, 234377, -192737, 493932, -150645, 590036, -451096, 911269, 714058, -11876, -701513, 131723, 681546, -122084, 481615, 547263, -502548, 648539, 927200, -978560, 5798, -653385, -740028, -754662, -559897, -911237, 532924, 150163, -28678, -174419, -257700, 581069, -916639, 934979, -690087, -605769, -69159, 483018, 356881, 895267, -859758, 354381, 422126, -74202, 862846, 996713, 75222, 19055, -240922, -746873, -548794, -676964, -325039, 423035, -822077, 278975, 657864, 852346, 166746};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques789(){
        Integer[] array = {-218643, -812536, -918036, 113212, 515514, 123764, 951689, 370732, -222158, -928154, 813303, -520318, 852963, 719468, -869151, -603861, 859815, 10816, -173114, -635360, 336128, -839523, 3535, 135875, -78040, -365018, 267369, 644094, -663144, -53184, 800401, 372719, 300256, -162526, -582627, -253251, 207213, 96937, -831720, -897510, -146989, -780217, 235617, -445332, -335787, -393832, 794254, 621822, -430671, -89687, -972231, -127689, 750622, 103925, 957684, 848379, 177713, 273860, 241770, -368033, -674782, -762240, 76703, 145236, 21517, -810294, 442065, 794381, 727369, -80160, -14396, 817965, 244630, -153074, -728511, -458865, -748660, 360413, -2020, -403875, 784123, -477946, 284934, -809549, 834251, -293237, -133425, 211390, -88866, -125784, 328499, 746072, 201954, -444446, -372874, -632200, 25780, -461952, 64102, 485011};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques790(){
        Integer[] array = {85559, 262923, 671703, -35095, -680406, -50262, 542777, -690823, 692430, -315598, -797358, 175082, 37498, 69560, -15231, -88542, 712894, -390159, -513859, 790642, -25836, -444531, 963431, -5803, 454631, -671066, 953555, 601842, -614079, 718119, -915116, 280041, 499075, -889512, -590543, 89591, -881355, 825436, 525772, -602760, -435726, -312252, 638917, 621082, -92056, 941837, -686103, 19408, 736524, 88444, -989620, -283083, -792354, -154343, -803002, 630366, 36291, 118813, 767623, 21038, -507979, -32356, 774031, -33629, 73567, -651618, -804632, 696373, -61696, 24310, 860689, 381565, 673449, -319741, -460612, -51832, 235341, 503710, 12648, -832217, -613470, 427316, -305952, 870461, 635685, -79456, -671566, -704829, 576722, 808410, -374096, -601560, -807279, 800561, 800481, -249373, -905346, -578172, 839234, -200976};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques791(){
        Integer[] array = {-587798, -520459, 828131, -810188, 742050, 162261, -525125, -359319, -610418, -363791, -930274, 974032, 195705, 817167, -671466, -257666, 919417, -740470, 947741, 466227, 716431, 612306, -413892, -545279, -396486, -507147, 104680, 254081, 10836, 611033, -621628, 43141, -999503, 257554, -654821, 18855, 307824, 92572, 826664, -897734, -427086, -358552, -435157, -603968, 774171, -838402, -273508, 432020, 185551, -186595, 780651, -710798, 331184, -950318, -310256, 332503, 793837, 78217, 732564, 507181, -765455, -629934, 40840, 363901, -606331, -822843, 656728, 835776, -670799, 556912, -254864, 119714, -204117, 657835, 717246, 317470, -337201, 917479, -547900, -914657, 147771, -820635, -14379, 555880, -253283, -87529, 710197, 224344, 28579, -979711, -251286, 136359, -743008, -862659, 875122, -650958, -138585, 304293, -608797, -16806};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques792(){
        Integer[] array = {-803826, -905869, 878948, 878819, 383654, -545735, -94911, -998432, 411942, 867268, -992753, 691603, -927167, 696456, 423002, 669268, 331251, -315737, -396474, -573200, 829609, 103978, 676155, -774535, 933695, 938096, -534988, -980959, -153111, -71655, -73142, 441455, 199908, -57151, -776243, 269162, -282711, -108198, -6355, -392519, -797057, 574667, 615210, -905346, -200269, 371954, 818725, 582054, 971894, 340835, 344308, -67928, -776451, 117814, -254268, 456357, 272282, 239291, 385037, -134028, -19545, -924456, 86134, 850588, -370132, 234649, -455295, -668091, -515210, 470154, -929706, 543000, -64580, 957725, -936439, -759629, 601232, -912047, 360446, 858181, 159321, -351970, -680643, -169713, 190840, -750891, 831383, -446347, 410611, -742743, 499583, 968445, 587877, -308523, 940488, -78812, 303283, 75234, -665370, 647616};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques793(){
        Integer[] array = {-577413, -404443, -763357, -227773, 674562, 438774, -304399, 322930, -438530, -643146, -912433, -780555, 637844, 400276, 761235, 918078, -855155, 627565, -55382, 169887, -300015, -740265, 966855, -790676, -332983, -192665, -214676, 923688, -361681, -620541, 745351, 86486, -153783, 914892, 394043, 380496, 708853, 760717, 458583, 3556, -663841, -314951, -237001, 134602, -336128, -224302, 40005, -159561, 711554, 440738, 379404, 929933, -590827, 458664, 536907, -759466, -759815, -152897, 374299, -250665, -740329, 433767, -114576, 288466, 146019, 757754, 328425, 731533, -192842, 598012, 235256, 626546, 714727, 335905, -153237, 177812, 614781, 657342, -303294, -26506, 160716, 772520, 509358, 793407, -642088, -960791, -297924, 369908, -525185, 93039, -56070, -19291, -720055, 811380, -994488, 21514, -582832, -679883, 68242, -183829};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques794(){
        Integer[] array = {835765, 617551, 762933, -696010, 950328, 924602, -775460, 901719, 495561, 137686, -410478, -963150, 433130, 509780, -634679, -674554, 712438, -402901, 63655, -855878, 565450, -51367, -804521, 887267, 158289, -701269, 807921, -831089, 645138, 945886, -898313, 483524, 773088, -193886, 204702, -584885, 820430, 375871, 834879, -634931, 79455, 616045, 674403, -721419, 436859, 478255, 993643, -687468, -225972, 573173, 671895, 986626, 606603, 384121, -298115, 991647, 621377, 371613, 748970, 516642, 822083, -576706, -719471, -416431, 528670, -105904, -412070, -47955, 475232, -111256, 856844, 262828, 579924, 664434, 579306, 670977, 509553, -832951, 273402, 847644, 51471, -765902, -364075, -887324, -478287, 582862, -461986, 189443, 506127, -509513, 522676, 880288, 976769, 644958, -663322, 78383, 279936, 510033, 338289, 907724};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques795(){
        Integer[] array = {-382718, 507521, 877505, 186231, 589397, 434659, 20342, 398103, 824167, 565309, 866785, 282482, -2804, -866583, 910508, 846073, -164659, -217686, -623145, -246451, 112700, -989932, -211716, -902784, -279508, -624076, -843784, -83997, 473270, -516835, -466266, 85563, -239901, -905903, 756107, -166013, 819776, -465030, 848925, -35351, 70568, -64108, -310229, 290905, -290625, -79406, 796244, -752541, 481561, -38453, -55742, 963922, 342303, -705866, -975234, -548819, 620906, 478063, -394307, -321521, -509943, 883038, -657885, -845064, 672750, 3207, 451230, 796232, -583302, 227815, -818157, -181802, -435364, 107261, -454182, -607165, 927207, -674559, 618311, 56681, 558765, -942181, -942036, 560469, -876809, 914580, 266514, -932189, 166665, 649121, 611237, -459404, -110648, -507456, -814197, -879184, 773298, -288906, -610100, -594931};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques796(){
        Integer[] array = {-612746, 918329, -821055, 847534, -790569, 446776, -198818, -255755, 438857, 952010, -984945, 518644, 946296, -820142, -822365, 497352, 365990, 988167, -837351, -517460, 735921, 938761, 101351, 209460, -561340, 354309, 9519, -462121, -505123, 821856, -52900, -883390, 234733, -918488, -356673, -521399, -574296, 37177, -160720, -498320, 639485, 11273, 191705, -529266, -11932, -253069, 738187, -546208, -261822, 897749, 995324, -85176, 992751, 273458, 878006, -876144, 342038, -20603, 244138, 690133, 164195, -798677, -13408, 805615, 156589, -652601, -978381, 137638, -738066, -229482, 410404, 729404, 239663, 79969, -894685, -548377, -444760, 867949, -888430, -963993, -381670, 466315, -616644, -417675, -259202, -201341, 873533, -879682, 515502, -803502, 70263, -738906, 943299, 183502, 888066, 346830, -384569, 967750, 288697, 185576};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques797(){
        Integer[] array = {-417044, 684736, 657646, 802793, 12996, -279674, -150810, -936785, -385379, -410733, 636948, -703534, 337694, 509266, 174446, -35663, -226535, -724253, -754229, 779930, -777147, -588129, -242654, 414872, -177748, 267592, 818634, -993844, -983840, -206154, -781464, -713736, -625654, -667567, 638025, 945476, -596542, -904147, -624976, -586793, 882099, -231872, 287984, 579011, 682643, -516903, 78881, -920034, 518985, -174781, 533386, 991906, -467597, -169594, 979215, 261585, -592575, -334996, -457482, 88176, -628969, 855593, 616963, 248722, -938038, -621194, 285567, 635739, -284139, -466950, 495486, -836378, -812031, 190237, 717749, -74393, -222474, 977909, 463288, 81641, 72751, 22915, -47806, 675922, 952455, 266026, -335717, -581419, 920194, 428384, -441978, -892822, 525831, 978005, -337738, -612006, -451470, -62690, -345724, -125185};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques798(){
        Integer[] array = {162460, -194144, 641292, -686386, -739533, -637037, -473747, -991232, -710550, -909905, -908988, -363281, 161368, -297600, 968878, 664157, 89251, -503334, 520455, -248175, 422931, -129517, 999839, 9616, -519076, 868646, -897183, -514828, -331530, -146020, 470124, -889475, -249253, -850251, -228894, 826393, 969046, -386761, 916709, -999041, -711007, -54330, 582389, 859334, 472748, -283846, 928775, 391748, 347875, -25974, 874608, -1153, -239985, -61739, -405523, 903585, 493872, -498813, 864292, -878631, -607438, 457594, 730750, -886482, 488001, -417880, -397452, -154798, -541611, 326584, -52833, -790318, -639199, 613488, 50291, 249189, -214409, 526233, -619098, -99811, 757602, 119634, 112148, -285373, -810037, -832345, -425393, 263336, -273431, 381410, -592556, -183143, 965259, 334016, 211345, 136595, -676565, 563407, -603117, -882416};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques799(){
        Integer[] array = {978734, -811576, -703449, -776363, 958327, -525708, 260494, 484964, -259226, 294962, -549898, -158475, 466391, -88722, 784692, 936412, 336132, -218041, 732809, 786125, 461545, 799073, 766150, 377624, 277302, -410268, 510089, -221352, 342918, -483988, -656288, 393893, 72118, -175047, 712188, 391955, 471867, 672280, 474765, -97243, -29118, -790424, -528757, 790393, -993072, -495365, -288186, -127925, -97714, 863034, -516453, -393672, 983885, 94780, -421289, -14151, 90312, 538874, -115196, 443640, -364428, -230425, 283148, 883955, 576801, -648232, -244268, -472543, -532161, -651989, -27961, 116372, 595019, 166359, -781039, -325677, -93361, 90288, -882908, -115710, -610724, 96984, 31174, 812836, -98032, -158745, 735442, -189769, 617145, 424536, 185814, 93485, -612280, 265717, 588678, 673203, 22321, 30842, -195436, 84827};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques800(){
        Integer[] array = {290940, -79310, -548370, 747418, 58668, 675859, -76737, 203184, 526034, -591572, -713928, -650901, -961514, 83641, 135346, -8075, -753957, -87916, 769926, 256543, 847523, -943055, -790852, 261125, 820400, -140683, -964365, 140100, 800072, -284694, 393922, 350287, 633266, -826453, 592322, -291131, 518594, -462270, 884326, 511626, 465378, 619618, -627518, -335630, 921760, -361814, -344394, 268893, 631987, 179660, 56396, -173202, -366914, -661586, 438387, 261618, 989822, -422851, -807773, 120292, 792735, -194234, -713961, 34496, 87119, -827468, -91056, -165962, 67123, 846511, -438072, -537564, 258259, -848336, 864117, 445116, 233662, 629775, 203292, -833688, 500575, 337437, 402352, 826330, 676943, -564110, -47656, 33055, -820455, -259785, 586256, 133076, 817137, -516663, -43261, -441970, -417328, -282774, 891931, 810220};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques801(){
        Integer[] array = {-293557, -640332, -715274, -815182, 765735, -129071, 953537, 515339, 348131, 105998, -625878, 637406, -933924, 304918, 565063, -67966, -717234, 594934, 237259, -432912, 533460, -415942, 45327, 832228, -601168, -284094, -332991, 704266, -152273, -237634, -295522, 829199, 581330, -749718, 355482, 195795, 720358, -769740, 534512, -691224, -12391, -584054, -391397, 987959, 27097, -748989, -452711, -634401, 619199, 655716, -196752, -888627, 711212, -265462, 9670, -157645, 911209, -427834, -265508, 770206, 129245, -277395, -787715, -602777, -858443, -103113, -8697, -368900, -58977, -230949, -301913, -361460, 572469, -78186, 467484, 647901, -979015, 483157, -743781, 303444, 980306, 610933, -875726, 748327, -251646, 976087, -902713, 131732, 231848, -172745, 39653, -283091, 570757, -309243, -466328, 731491, -899677, 676948, 102723, -74948};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques802(){
        Integer[] array = {-804277, -709845, 839617, 476023, -117813, -837852, -998757, -75810, -830169, -333788, 228568, -35033, -286178, -615523, 315273, -64985, -777350, 269814, -323766, 317253, -820428, -974794, -84614, 448287, -287447, -20210, -782175, 1159, 772886, -60885, -260431, 537975, -29425, 755609, 880564, 721625, 512092, 311807, 320548, 425408, -803085, -405499, -130173, 83663, -760913, 37849, 210338, -193727, -462308, -221062, -247232, 158551, -346193, -512517, 915334, 650730, -136295, -303879, 657811, -425212, -189794, -991991, -277898, 727270, 214988, 683399, 110521, -556541, 952918, 377614, 420544, 790012, -83579, 241926, -385358, -500014, -205211, -395729, -728853, -533385, 886339, -620686, -217780, -807404, 706290, 226026, 568717, -622862, -620969, 850109, -904952, 558533, 832088, 904397, 404088, -703493, -291288, 937683, -390134, -400081};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques803(){
        Integer[] array = {-580063, 975690, -862876, 328060, -547718, -721506, 85959, -324919, 324078, -927600, -381287, 270155, -291796, -372661, -405406, 407077, 947418, 349366, 843865, 256080, -675597, -547014, 625488, 909248, 762935, 143917, -693804, 555859, 257099, 111847, -34281, 488525, -807137, -936682, -934679, -409120, -452876, -527457, -594977, -669392, -609302, -443216, 441167, 27458, -804754, -183629, -670313, 696403, -482256, -392579, -982765, 22053, 720658, -787780, 409256, -788786, 526498, 441701, -35361, -284385, -895395, 51391, 5439, -863272, -637968, 501525, -103367, 124567, -806770, 180003, -83837, 361973, -254641, 699413, -140758, 997247, -159536, -152281, -919925, 107176, 772725, 78960, -132852, -37012, -675367, -37292, 398726, -511724, -991971, 792413, -39212, -595939, 100013, -337332, 11911, 669451, -915816, 672484, 668256, 281588};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques804(){
        Integer[] array = {482452, 904433, -51990, 388636, 263954, 705130, -871319, -231614, 146300, -988797, -476199, 912962, 960926, -635865, 592771, -61617, -324528, 541834, -474938, -904634, 575457, -169299, -70705, -426602, 859956, 137828, -202324, -44274, 85539, 795533, 159848, 893622, 397951, -893831, 695652, 290267, -181128, -742096, 486621, -423218, -413397, -235005, -408855, 369481, -549526, -514436, 455039, 933483, -825017, 229088, 34183, -263632, -69271, -497872, 415149, -380049, -901877, 247894, -330410, 106502, -866650, 627461, -276339, 985130, 158455, 881406, 611220, 111814, 187720, -501285, 610695, 80607, 906261, -672590, 543661, -641596, -192562, 293582, 229454, -999559, -123244, 611970, -869003, 729365, -159169, -380255, 187885, 166226, 166639, 786691, 679015, 642896, -986651, -116944, -167475, 228140, 905050, 615044, -762351, 847391};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques805(){
        Integer[] array = {-512922, 395309, 307230, 261738, 527375, 870792, 555076, 865247, -521191, -704764, -947500, 954936, -325989, -577703, -498615, -157884, -311505, -269717, -279494, -64398, -244321, 761722, 574627, 148929, -158634, 328836, 187800, 80534, 776001, -185699, 347355, -44687, -88967, -74632, 319806, -127258, 279078, -25362, -881613, -578186, -130540, 436507, -773403, 534767, -217455, -270237, 868649, 991834, -237052, 146701, 767083, 140001, 418813, 96315, 224106, -36034, -321338, -922774, 186006, 553680, -855485, -914941, 901046, -897235, -455213, 757867, 967631, 186444, 550284, 146030, -67042, -626037, -520053, -433284, 778188, 998586, 229685, -736067, 518698, -702757, -148886, 283099, 149438, -130370, 928936, 173496, 650283, 162981, -178677, 907980, -463624, 798627, 139698, -765021, 295172, 955231, -62512, 741625, 835261, -532918};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques806(){
        Integer[] array = {800384, -299015, 432922, -871811, 487834, 28384, 586786, -755520, 24593, -256752, -665670, 506979, -628983, 289809, 413637, 608597, -912606, -996296, 162775, -647253, -717965, 585306, -358145, 855020, -65257, -185979, -690667, -907985, -376273, 194144, -605573, 366874, 385873, -789049, 292329, 522156, -992773, -602794, -570165, 463127, 32519, -240412, 796099, 93885, -557397, -729920, -707382, -967849, -193639, -935686, -562386, -125759, -611490, -820114, -846627, -808058, -902517, -398600, 509584, -163245, -84601, -218495, -236196, -873461, -706534, -727447, -907321, 566336, -840530, -603027, 686197, -219495, -516659, -584297, -536586, -72652, -960304, 207195, 595093, -665028, -170271, 681701, -19896, -605266, 930169, 828083, -989321, -101365, -689843, -487328, 524964, -78659, -303247, 129778, -274585, -422867, 284532, 164152, -403261, -111095};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques807(){
        Integer[] array = {2425, -484378, 863023, 396395, 183053, 957401, 843429, 43672, -972579, -848432, -289842, 254526, 471754, -930530, -415480, 450731, 356448, -158259, 689203, -140571, 508414, -640477, 68206, -585413, -537998, 468339, 847576, -620831, -953960, 411792, -93886, -835560, 671608, -389398, 980915, -863697, 216836, 599966, -775853, 374404, 848553, 147801, -774546, 283835, 314885, -929676, 707375, -991968, -903337, -18212, 259048, 82367, -363373, -769978, 862759, 382184, 840163, 860047, -699634, 235681, 633150, 93144, -310471, -666125, -73256, -647208, 208187, 722034, 244017, 954247, 143761, -512510, -384001, 505001, 829852, -393225, 16647, 510152, -841950, -700028, 25262, -618172, 385777, 485680, 796578, -500047, 83249, 892261, 175934, -237341, 858552, 52128, 280458, 189868, -939316, -449091, -524337, 227361, -812718, -202331};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques808(){
        Integer[] array = {-183777, -741166, -738754, -292092, -244440, -912611, -148414, -91966, -952594, -201656, 283968, 592208, 380105, 901810, 678538, 926025, 855084, 925004, 984223, 125425, 225222, -281746, 28442, -936695, 714947, 939742, 856725, -332508, -633047, 738933, -369739, -558154, -899361, -334284, 752341, -582574, 741958, -788973, 100478, -696888, -939738, 511099, 471711, 406013, -741362, -268142, 802833, 426533, -843444, 143242, 557864, 721432, -574639, 305754, 66505, 126369, 794668, -989808, -20844, -256937, 379559, -658980, -788414, -606975, 804904, -673878, -30932, 825864, -347245, 95161, -865415, -43922, 328300, 245926, -264697, -866977, 680841, -783590, 473124, 718659, -967635, -891168, -113442, 578357, -149242, -830534, -204237, 287005, -300528, 395793, -801309, 1919, 790935, -93708, -803379, -663092, -276859, -784313, -463732, -507776};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques809(){
        Integer[] array = {-25891, -437754, 749317, 374048, 678878, 289315, -602633, 293809, 845481, -6648, -862002, 606681, -592243, -67043, 701174, 12733, -877613, 36528, -59044, -273913, 933961, -595161, 459038, 621491, -141339, -409379, -197406, 400931, 525784, 664904, 862526, 707797, 594654, -775953, -618130, -594592, -889490, -53006, -914890, 816679, 921531, 42011, -493482, -261896, -187900, -246825, -291478, -573039, 808795, 631775, 176260, -60061, 404359, 422349, 8484, -58195, -816536, -773320, -367606, -615394, -4846, 604787, 770797, 44882, -591042, -89957, 568338, -962057, 130058, 870819, -607944, -253909, -942855, 152684, -141214, 970811, 130600, -737822, -649156, -579742, -537077, -279457, -606249, 147207, -796734, 665560, 299717, -162373, -609725, -293498, 257724, -909535, -658169, -377688, 993347, -708267, -690801, -822159, 969805, -298874};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques810(){
        Integer[] array = {909745, 672019, 750918, -702647, -587364, -29160, -870155, -523053, 248132, 185631, 351330, 314555, 111489, 189612, 965383, 870910, 890719, 985567, -947267, 820286, 166577, -756580, -133398, -781592, -812294, -444825, -483054, -490361, -398953, -459473, -759710, -317487, 651213, -969059, 366257, 191043, -488278, -276109, -956308, 825201, 779318, 830320, -967928, -26905, 5948, 740318, 653898, 145976, 265718, -41454, 273407, 96608, -795400, 443450, -509053, -98776, -305764, -968066, 995469, 238053, 121793, 458044, 426845, 557508, -477229, -866978, 683557, -207487, -769232, -370575, 655936, 368806, -236886, -422468, 804520, 351749, -23284, -91240, -860311, -901666, 911364, -840327, -603672, 822182, -672447, -825247, 501291, 177979, 341297, -503539, 804228, -128974, -449901, 860583, -533529, -699325, 120316, -383723, -503967, -261887};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques811(){
        Integer[] array = {544589, -181433, 915377, -202904, -305941, -429281, -879393, -81242, -902337, -436689, 326384, -288788, 69289, 255286, 479615, 360608, -722637, 659583, -979065, 458722, 431809, 668963, 121805, -136273, 442671, -879826, 752433, -500166, -350375, 745057, 947393, 295689, 294300, -111424, 684417, -97243, -298344, 186660, -503215, 609344, 187188, -850979, 173748, 491664, 411498, 176088, -787907, 255844, -419754, -783787, 868761, -691190, -82498, -576736, 173866, 214444, 359561, -19565, 352868, 705819, -568265, 51966, -984866, 738659, 191624, 62267, 622911, 138243, -884755, -37261, 237690, -643743, 368429, 159245, -472220, -196236, -859124, -309424, -828695, -272407, 13754, 203072, 965825, 162519, 196846, -535294, 355271, -524204, 220785, 659660, 689866, -210272, -375736, 737111, 574560, -951453, -462608, -796353, 739655, 27972};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques812(){
        Integer[] array = {2675, -600959, 856596, 553608, 157197, 165013, -300354, -22716, -584910, -306475, 620270, 134754, -522789, -365955, -725427, -151258, -684146, 899967, -554007, 475116, -650457, -729680, 332444, -943532, 836777, -460883, 772694, -327250, -32994, 128309, -512769, 883887, 502111, 180702, 835200, 871433, 664608, -787879, -391479, -887551, -418723, -516103, -177106, -705554, 275901, 720546, -77423, -145673, -417272, 551099, -82971, 608394, 750699, -265219, 423510, -422304, 867168, 243638, 250721, 55430, -397108, -501242, 760671, -142737, 322470, 108524, 469538, 138481, 266681, -768307, 32037, 990049, -297008, -707955, -289772, 788548, -681277, 988054, 968546, 999393, -943648, -820008, 116235, -497693, -889137, -318384, -514259, 254517, -995757, 279083, 33889, -565878, -492211, -114936, 140127, 493953, 369581, 396714, -654000, 773085};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques813(){
        Integer[] array = {695458, -487184, -854507, -505372, -748186, 891320, 148602, 189626, -748934, -783378, 228305, -673164, -630318, -917324, 649484, 858143, 439375, -264782, -141906, -878819, 725035, 489194, 889607, -819299, 17352, -708760, 152870, 584916, -536656, -257647, 627509, 121682, -753415, -348920, -39257, -839622, 323390, -242788, -54046, -659288, -476705, -356675, 975487, 425898, 245157, 955426, -155064, -298692, 488562, 716991, 164602, 825638, 550694, -819359, -940440, -245641, 494613, -222695, -936592, 761042, 246685, 860022, 469820, -506379, 806493, 742754, 618209, -780041, 687312, -779938, 972553, 900586, -777825, 468885, 149024, 871055, 446025, 419764, -180952, 176816, -449433, -228787, -433562, -323270, 498087, 670125, -425484, -523903, -515748, -90544, -677673, 227661, -7224, 404791, 753951, -487691, -79387, 72486, 437722, 536569};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques814(){
        Integer[] array = {507957, 481195, 608451, 635102, 592496, -433972, -329729, 810172, -597161, 526225, -816853, 781279, -395591, -731162, -857488, 33846, -587481, -934418, 661823, 988944, -924625, 450132, -308641, 63578, -152173, 672434, -905911, -297652, 598933, 100124, 775949, 414094, 49872, -384074, 490191, -726494, -578517, 412680, 668432, -141292, 624657, -514379, 125303, -359616, -452368, -431028, -943175, -397893, -82845, -589040, 168639, 280591, -795719, -528120, -959934, -305514, -601988, -785313, 104106, -961190, 136002, 915331, 633909, 389201, 919215, 824941, -774756, 541037, -648839, 307404, 750742, -176310, 489140, 454906, 662185, -31607, 144574, 757472, 566322, 25000, 542506, -984217, -646741, -959039, -824777, 75150, -272707, -981547, 65024, 828708, -188545, 37683, 400638, 579438, -472012, 933501, -682690, -425537, 162429, -490791};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques815(){
        Integer[] array = {700709, 290267, -757654, -284073, -696785, -451422, -55463, -12738, -291624, 212812, 828403, -275764, -241972, 641161, 2027, 662095, -108220, -978005, -397286, -193160, -413657, 288584, -263752, 291587, 647984, 268746, 832799, -83657, -382115, -470590, 21090, -256326, 201616, -431435, -373330, -104448, 459079, 750861, -481689, 434244, 292355, 673235, 970048, -334531, -982836, 420038, -212390, -11399, -140612, -645461, 527714, -368354, -685734, 441804, -137028, 341053, 783040, 67828, -771262, 991211, 981160, -764804, -41719, -882148, -899830, 607408, 461416, -755369, 287019, 250535, 72389, -701959, -855616, 654248, -219752, 387271, 374203, 679798, 895431, -523656, 364632, -160814, 193161, -802860, -542097, -896446, -574749, 611108, -448092, 745705, 964551, 148128, 233631, 87821, 560790, 910278, -85466, 775738, -477512, 648280};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques816(){
        Integer[] array = {697601, -169795, 32347, -188341, -399916, 379444, 646169, 453303, 681464, -338850, -703176, 110565, 536707, -764180, -641252, 613331, 789639, 409111, -376439, 104388, 517678, 783055, -35251, 522936, -286365, 983361, 688242, -403841, 419060, -132322, -873040, 108208, 110466, 944534, -601851, -700610, 249960, 351205, -154636, -383764, 76783, 557981, 795006, 454003, 32446, -365068, 970454, 145256, -341906, 568004, 242416, 493873, 844401, -980400, 571804, -934611, -262151, 944057, -644159, 421894, -291607, 302881, -196840, -790097, -523960, 655208, 736381, -198791, -317221, -107079, -941413, -315839, 761418, -273866, -778339, 316392, 198285, -33356, -940022, -597415, -225985, 514572, 655948, 973461, -639070, -936850, -579642, -996480, 509289, -290571, -474044, -112025, -267357, -803751, 550418, -405116, 291588, -528246, -31345, 839471};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques817(){
        Integer[] array = {-493518, 371909, -343325, 575098, 601200, -2020, -438917, 711148, -344655, 507841, -653260, -387109, 348768, 308757, -981625, 692151, -488342, 452198, 563185, -418976, 602939, 34663, -987557, 330715, 85711, 691498, 831525, -920858, 960812, -869876, 870414, -561374, 448974, -460329, 541659, -328413, 554607, 403775, -214580, 622378, -848492, 149375, 84236, 269805, 746781, -537100, -69985, 66793, 708903, 422513, -342246, 235137, -176406, -866481, -157035, -764804, -847939, 922970, 281204, 592523, 422802, -765093, -93254, -681579, -738774, -912650, -288908, 524612, 2568, 414243, 491890, 817151, 320633, 890824, 626385, 184214, -136537, -241325, 955506, 269029, 819941, 608702, -698829, -552069, -508425, 570620, 493248, 743844, 31260, 821355, 540150, 146436, -878277, 518546, 843987, 203315, 860579, 250349, -594579, 870559};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques818(){
        Integer[] array = {-842246, 582042, -894933, 216002, -295229, 526195, 672997, -454316, -338792, -148781, -711642, 65512, -751438, 295993, -648064, -882565, 443320, -822547, -475541, 783931, 169003, -167597, 107384, -56051, -336647, 952764, -73882, -303229, 301588, 896659, 576781, 486619, 533740, -169708, -523598, -365319, 596134, 673993, -330393, 653371, -764448, 253749, -278568, 892865, 552054, -282700, -101509, 420238, -953890, -987014, 136456, 716115, 956479, 3240, 94558, 992843, 755084, -393745, 141842, -492073, -737476, -427951, 862657, -322652, -175059, -952160, -12632, 787407, 345376, -837909, 774578, -883538, 273891, -226666, -258691, 71222, 878814, -385997, -404211, 73894, -259270, 760964, -310024, -500669, -243607, -1961, -498188, 450099, -305473, -135800, 811477, -791107, 985507, -92872, 753661, 153430, 977611, -188058, 269226, 281287};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques819(){
        Integer[] array = {613230, -297419, -506857, 3315, -640219, -703174, 63406, -194510, -422298, -868775, -104054, -516303, -474077, 896415, -973036, -218844, 513820, -833786, -144959, -997395, -907296, -228661, -570347, -322304, -517912, -741020, -63698, -367479, -625526, -321824, -58063, 877789, -68566, 350440, 26654, -808680, 747039, 573368, -756984, -469846, 770688, -372109, -197527, -729310, -152953, 426397, -899697, -100357, -270456, -62195, 264428, 422450, 403506, 388282, -148248, 57428, 575301, -844210, 15743, 976760, 797989, 656662, 526344, 509542, -170066, 497265, -983697, 284598, 78175, 700971, -740827, -128090, 602232, 182163, -874686, -147367, -125957, 180071, 196714, 816282, 947113, -947344, -437911, 144754, -147201, -525101, 267410, -525801, 195693, 13492, 851083, 775636, -191947, -184146, 151722, -568465, 123807, -793866, 235384, -887209};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques820(){
        Integer[] array = {375933, 394506, 991815, -564397, -869991, -674591, 692466, 797116, -322757, 636168, 90965, 16891, -991482, 381444, -363740, 210316, -19733, 386249, 381577, 105758, 555623, 92111, 703595, 54861, 984521, 342713, 775380, -809081, -24050, 855036, -835362, -734882, 597350, 810386, -132296, -800722, -460854, -207850, -468920, -94798, -815585, -542399, -337525, 218339, -206875, -34337, -273123, -80680, 435322, 873785, 851121, 483336, -862944, 775067, 633016, -44719, 394203, -538798, -944520, 308555, 123899, 649510, -396852, -610320, -468960, 297146, 714657, 679829, -937244, -189699, -638571, 389768, 96796, -113851, -450542, 528027, 179961, -585829, 480784, 8340, 704054, 719514, -270607, 800577, 238885, -221573, -564354, 219787, 109221, -371664, 416571, -663552, 420280, 404733, 725235, -388904, 750925, 248857, -398548, 578396};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques821(){
        Integer[] array = {412369, 967984, 496909, -621846, -394237, -854147, 297390, 221614, -177717, -670308, -253194, 604783, 959975, 400701, 98005, -321571, 514247, -707317, -796797, -403940, 119946, -848825, -579552, -802044, 459617, 13468, 782824, 366288, 926111, 292200, 300516, 571056, -93070, -804249, 620136, 164976, 783738, -536866, -851825, -746785, 782649, 738122, 320825, 791558, -3516, 371803, 477953, -346828, 115985, 705694, 669635, -436013, 823155, 680855, -583863, -812498, 83086, -716226, -990302, 763934, 699312, 372229, -917194, -196135, 355402, -771410, -761312, -879293, -710826, -755532, -509895, 467547, 783160, -786026, -831421, 204213, -333857, -221034, 99419, 6190, -878997, 768439, -455639, 24811, 758716, 146026, 157880, 399369, 881023, 166856, -341658, -287368, 649139, 164287, -100053, -799692, -411807, 73803, 333014, -352052};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques822(){
        Integer[] array = {262176, 337478, -595376, -861236, -112839, -940040, 305200, -492795, 267187, 647048, 172890, -623706, -48390, -975498, -45013, 702533, -179076, -917542, 860975, 525489, 843851, -823163, 584709, -432694, 484607, 59161, -107597, 840579, 585541, 468727, 777202, -259312, 765582, -746499, -405780, -380443, 379369, 418785, 161319, 141548, 130002, 127980, -972979, 805379, 405690, 584647, 111472, 679001, -878657, -653773, 532177, -507412, -669150, -567554, -539293, 335202, 152989, -314084, 718172, -754284, 170585, 940127, -437153, -935239, 81880, -344705, -484834, 686208, -293262, -934171, 194322, 43767, 488087, 358740, -114627, 191322, -51087, -330788, -990145, -277095, 546171, -171487, -583521, 884811, 395731, -649479, -321807, -471561, 866863, -708971, 492727, -326126, 337115, 175468, 364575, -771488, -584954, 957587, -355989, -869636};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques823(){
        Integer[] array = {-997216, -279684, -901277, -21387, 115931, 975784, -157787, 149856, 230356, -74620, -127161, -714391, 81327, 274070, 815209, 769190, 265082, -663070, -602928, -416952, -354487, -29064, -118741, -928478, 238471, 497528, -14638, -434037, -351850, -44104, -138304, 928465, -183036, 154385, 854644, 361919, -743459, 58490, 79398, -384913, 875021, 52877, 573931, 294792, 850571, 895435, 643200, 23911, -663544, 863704, -88500, -564668, -673678, 289323, -35986, 669697, 500555, 719802, -646247, -46746, -349221, 606997, 803089, 584436, 495351, 877152, -639330, -216854, -7185, -251475, 734148, -348410, 204386, 601088, -232632, 746594, -739003, 846222, 245799, -317903, 341275, -701413, -29907, -15727, 59039, -146880, 602067, 14436, 705710, -530618, -569535, 9621, -6888, 868871, -370302, 368055, 381559, -320862, 603738, -682025};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques824(){
        Integer[] array = {-320019, 618211, 227409, 964528, 795890, 335692, -558093, 197568, 306394, 922658, 229415, 687927, -43097, -410013, -134826, 140935, -997464, 982062, 548703, -977861, -446950, 136162, 38755, 801119, -185860, -603961, -502007, -433474, -147767, -347141, -963707, 65498, -885471, 413135, 461287, 129560, -767504, 6995, 286243, 486041, -754017, -89658, 527169, 74104, -197711, 922762, -327312, 211095, -167482, -956063, 452013, -987525, -752130, -943133, 543575, 933996, -93232, -604990, -535465, 494628, -560663, 315030, 506394, 120731, -355346, 346709, -807405, -294072, -637557, -80528, -122748, -46323, 699262, 276952, 688605, 724401, 731505, 312003, -682198, 147693, -154553, -29580, -416159, 780922, 411507, -888714, 489355, 339716, -684774, -56651, 511221, -547468, -416284, -505142, 494300, 203536, 421657, -867373, -565063, -472392};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques825(){
        Integer[] array = {603801, 116501, -713513, -172421, 52052, 995914, -439917, -455522, 940308, 89523, 713345, -214833, -333498, -575855, -798128, 752391, -696093, -756483, -640773, 144241, 79264, 566098, -281701, 110377, 966100, -7891, 128389, -376689, -550686, 604734, -827622, -990209, -873779, -578969, 492765, 299142, -554208, 226555, 485934, -289554, 439310, -400610, -844218, -21876, -670673, 449123, 777280, 703153, 103781, 944583, 691990, 459191, 407223, -390311, 143558, -353439, -236157, 14739, 208783, 911101, -432049, 681246, -310989, 20941, 499826, 293161, 327454, -469641, 11015, 946698, -21110, -808268, 196343, 772442, 614499, -102281, -851674, -114457, -918007, -698811, 34159, -182002, -796851, 219564, 360829, -283751, 658138, 630022, -125857, -350946, 635119, -371641, 811629, -744556, 295401, 107487, 979637, -437704, 207490, 696348};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques826(){
        Integer[] array = {-238606, -377886, -480910, 50909, -784431, -84285, 799957, -643637, 682671, 771257, -948095, -913305, 256926, 474449, -222574, -225807, 240572, 127909, -662810, -170965, -399415, -561851, -975447, -645998, -402599, 835944, -114754, -477558, 822027, -562489, -340452, 49811, -304070, -361943, -659641, 205848, 616851, -988175, -320247, 27203, -716108, -354874, -537685, 390813, 102341, 348552, -647510, 739962, -995548, 172241, 457184, 39548, -306061, 644615, 768949, 100037, -196992, 739551, 230797, -249892, -755054, -826266, 442379, -965294, -797181, -44120, -427551, 242567, 550826, 710547, 951973, 9294, -699775, 44528, 549676, -742536, -873039, -707823, -620839, 186939, -528939, -259381, -493082, 969611, 988381, 575726, 894150, 189479, 54646, -79249, 40431, -815596, 315689, 905606, 620582, 616037, -839174, -159668, 525900, -416297};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques827(){
        Integer[] array = {-635470, 214680, 251748, -533514, 740906, -616363, -700971, -257701, -968338, -852690, 418137, 889453, -916973, 595027, 991209, 424719, -421184, -802028, 298053, 370149, 208025, -24214, -74921, -460212, -58521, -120867, -945081, 161624, -673526, 112140, 502718, -802978, -524189, 526631, 898965, 835298, 999341, -529362, 140286, 45110, -204236, -320904, -385401, -229717, 522289, -795317, 913543, -167675, -732605, -784193, -310689, 540497, 799027, 811652, -646915, -265719, -696158, 14258, -994327, 617634, -304882, 735463, 70001, -477288, -832818, 413569, 232810, -930042, 691712, 628951, -240609, 244678, 292452, 94550, -527298, 529981, -970720, -632806, 728461, -519059, 277901, -893557, 698074, -370113, -384043, -461479, 783650, 624505, -274125, 840473, 624949, 122254, 269459, -655948, -324456, -859545, 275763, -716804, 250611, -513244};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques828(){
        Integer[] array = {-587760, 446657, -110368, 374909, -341413, -20287, 481847, 947167, 513750, 628498, 371385, 532435, -889147, -475703, -959210, 122428, -800876, -656576, 933820, 314301, 660181, -872498, -753583, -824027, 253999, -961498, 766884, -391914, 819142, 938415, 299400, -422054, -577580, 797879, 60313, -629553, 901309, 456821, 424823, 797346, 420379, -703757, -263953, -513714, -203626, 450890, 587234, 453684, 839881, -924016, 449526, -790434, 455193, 263348, 673767, 26041, 312906, 364272, 388157, -401763, -899735, -906309, 295, -11423, -603937, 842962, -780279, -389055, 102818, 486224, 277175, -785206, -814832, -878748, -888327, -714126, 923950, -620298, -58970, -860566, -751235, -970823, 483278, 826430, 323220, 243135, 541909, -493600, 232669, -783370, -323114, -966839, -120790, -846944, 510096, 243738, 132106, 881797, -834661, -985960};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques829(){
        Integer[] array = {-125215, -426302, -408771, 79704, 632542, 484896, -60856, 134950, -498415, -367567, -865518, -360932, -733988, -917998, -657507, 89326, -813963, 89185, 252374, -239040, 102476, -634894, -521028, 936257, 271541, -407928, 999481, -884653, -568587, -543316, 674095, 528530, -69287, 646939, 592639, -175515, -495326, 299171, -147691, 516205, 910727, 751470, -450067, -148664, 289966, -761922, -118182, 627017, 925896, -153805, -941033, 696878, 638625, 718700, 745759, 742578, 204829, 682030, -254734, 666664, 574568, -60565, -989039, 195793, -737667, 594474, -477627, 594776, 941469, -461388, -530795, -370629, 169339, 637815, -900647, 435085, -255272, -940923, 496315, -505503, -547544, 447235, 912894, -867226, -585227, 494041, 28822, -454199, 868678, 652527, -34528, 693409, -243982, 559154, -623831, -123912, 984291, -664217, -758022, -134543};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques830(){
        Integer[] array = {274634, -850833, -121655, -308463, -920959, -671242, 566933, -580429, 672955, -466407, 535587, 133679, 480159, 543424, 747554, 449074, -906309, 443029, 738517, -316253, -861936, -360095, -30808, 389348, -337587, -772119, -699493, 736778, 246200, -295166, 459387, -383769, -945765, 67650, -429923, -413515, -826847, 461866, 613782, -537277, -348817, 417001, -842612, 191045, -123446, -786607, 811225, -718852, 963765, 34875, 947041, 54930, -606988, -199750, -544602, 96140, -809481, -183261, 436748, -419473, 153462, -601789, -550070, 509875, 754983, -474676, 2715, -681920, -577593, 805281, 644812, -999984, -730452, 963340, 615632, 732740, -520518, 680050, 658570, 693258, -855967, -474525, 825253, -76123, 75158, -111109, 163004, -979057, -710056, 924497, -598293, -600098, -992058, -391877, 455191, 856559, 268584, 734312, -818862, 132682};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques831(){
        Integer[] array = {-6093, 62244, -856491, 874803, 534111, 866989, 771232, -347751, 18098, 777454, -409736, 268653, 168289, 115246, -85995, 827140, -628682, -126995, 873241, 813572, -630070, 539851, -763680, -290975, 958886, -102625, -443275, -742919, -448908, -804836, -473946, -973146, 927867, -463579, -464315, -319005, 944306, -7111, 12719, 700128, 702580, 756409, -714539, -126283, -512148, -681785, 725395, 239691, -39729, -57631, 354488, -687729, 519512, 920957, -426759, 818587, 169219, 289683, 448, -202939, 101253, 296575, -45813, 826789, -767106, -443229, -192482, 846447, 8641, -25678, 101762, -339915, 496372, 841158, 884113, 965071, -6307, -223055, -368082, 685921, -144747, -13984, -189667, 162092, 830948, -887918, 164172, -508976, 321836, -884869, -905282, 473103, 521217, 680298, -701560, -272854, 260263, 397352, -534190, 730766};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques832(){
        Integer[] array = {-490879, -89521, 501808, -442935, 297914, -781944, -107387, 344735, -399077, 249574, -658762, -432072, -592331, -201360, 155239, 303234, -117128, -752289, 474431, 259876, 915657, -32079, -647669, -757562, -359533, 392832, -318144, 202195, 145904, 570936, -578187, -998009, -347067, -681735, -559929, -9532, -391795, 745775, 279960, -886615, -446321, -169829, -428442, -10687, 407634, 819656, 286107, 626915, 990923, 730345, -309669, -715591, -689319, 317415, -557796, 286758, -228653, 18116, -593249, 474282, -419791, -697199, 896940, -144308, 356172, -947517, -846538, -466202, 167635, 104021, -481165, 732832, -530735, 595468, -480956, -800734, -947428, -896835, 752532, -324553, 396711, -511319, 814399, -762691, -321539, 867553, -812820, -950277, -989835, 246580, -348809, 236126, 316627, -725697, -708317, -407042, -276128, -476765, -537457, -296473};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques833(){
        Integer[] array = {227584, -272934, 222832, 800366, -992325, -724701, 869459, -840346, -819894, 467838, -281, 711495, -559815, 592595, -614102, 550048, 190330, 491812, -289411, -929431, -884446, 916873, 399172, -598805, 329461, -915915, -165281, -379936, 228281, 898364, -926378, 588282, 74329, -207963, -591844, 262765, -615096, -392582, -142845, 579631, 463590, -895065, 651697, -322468, -223778, -61367, -277205, 670196, 946098, 782169, -402288, -332285, -643182, -701402, 830292, -326735, -830696, 783995, -978303, 737358, 869594, 969855, -599414, -269121, -949197, 162527, 735444, 865503, 405602, -272565, 459206, 355936, -747424, 917268, -768177, 56587, 71823, 540783, -519480, 792550, 818855, -221831, -560957, -545477, 156528, -510354, -723636, 576781, 790709, 74454, -475275, 179401, -333057, -524242, 339396, 789237, 332761, -276149, -993970, 380222};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques834(){
        Integer[] array = {375942, -319801, -261472, 648803, -739140, -912762, -38564, 231710, 7385, 653733, 80805, 978444, -248274, -291096, -844615, -836635, -379647, 810081, -758625, 951161, -626417, 802408, -549094, 859478, -862025, -858648, 431031, 705963, 358353, -828501, 46196, -422458, 479845, 119231, 136397, 804144, 983766, 140641, 501787, 857513, 297604, -794479, 795482, 605409, 389895, 717769, -290528, -187843, 532121, 665145, -849165, 562792, -70954, -39862, -548958, 100914, -969144, -209918, 380059, -762457, -172119, 522345, -382250, 427014, 593768, -785956, -252120, 883086, -4318, -845605, -33721, -851351, 426096, 803463, 285217, 658613, -331374, 511234, 178591, -655178, -604778, -588304, -174815, 15414, 663493, -69917, -308653, 257164, -257620, -510143, 623859, 265404, 559060, -222919, 732193, -351462, -880246, -807188, -788834, 233338};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques835(){
        Integer[] array = {296002, 241684, -212267, -355535, 324809, 230077, -58670, 816411, 41157, -346414, -373844, 258878, -282771, -578842, 351548, 172482, -738721, -891909, 393369, -122045, 435898, 637870, 901049, -770160, -319864, -479133, -989973, 263703, -841033, 959620, 780471, 961607, -393397, -444977, 646562, 115235, -203516, 175947, -861628, 954540, 812282, 43861, -281873, -825053, -72358, -126778, 25558, -980223, 292016, 927144, -606700, 87044, -118731, 694364, -103376, 66735, -483675, -347297, 738580, 892540, -173380, 533198, 821612, -567471, 738504, -265002, -311139, 204311, 957402, 481264, 865597, 434594, 107961, -567368, 592350, -421796, -402709, 190124, -473423, 431736, -874022, 531014, -91732, -693706, 79528, -899754, -395077, -816790, -293242, -238015, 659466, -54283, 40971, -809042, 104860, 40193, -925371, -546972, 361764, 384179};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques836(){
        Integer[] array = {-133366, 289453, 211843, 77285, -957878, 693951, -694944, -946136, -396013, 791343, 642053, 137448, 811940, -953679, 360372, 723247, -885114, -496572, -548586, 885617, -190704, 337179, -431850, -418164, -76531, 23008, 531360, 134338, -643379, 414532, -901700, 664284, -807186, -972826, 587834, -642446, -472606, -169968, -431983, -703179, 837391, 362071, -267164, -518878, -366, -788417, -745866, -38086, -684939, -274362, 317707, 27945, 591931, -51839, -738245, -517540, 852970, -585108, 786846, 278131, 279900, 223770, -588420, -124609, -166308, -353815, -648041, 136106, -2432, 976508, -5156, -469129, 39067, -171212, 459540, 645062, 657230, -472319, 846974, 6787, -58141, 615799, 78122, 616099, -993786, 2652, 995394, -426070, 386742, 154786, 281077, 954821, 650695, -288118, 522203, 895084, 655442, 301100, 569303, 895700};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques837(){
        Integer[] array = {-77674, 369995, -625983, 850480, 170541, -436221, -512582, 23647, -816655, 619781, -560695, -807396, -852018, -544734, 997583, -301446, 626451, 634825, -436552, 108341, 305717, -586583, 280472, -300694, 929106, 970923, -399642, -333884, 268766, 274627, -40701, 447549, -391477, 357867, 432886, 242657, -44720, -771791, 768961, -384516, 535960, 633515, -597015, -536077, 425171, 847130, -975570, -252608, -826093, 303259, -240053, 110278, 972855, -836486, -702590, 444220, 263424, -286412, -221604, 240472, 619573, -391054, 998109, -92610, 628504, 266210, -739901, -416711, -460504, -630372, -447282, -917374, 90655, -301014, 341342, -413916, 664203, -664737, 699468, -44241, 196083, 253300, -292883, 137466, -544931, -273053, -682721, 132489, 496440, 18011, 349592, 121818, 765379, 930736, -991766, -945117, -222085, 52301, 382556, -888598};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques838(){
        Integer[] array = {-919152, -568146, 60510, -705288, 767721, -435254, -395370, 270755, 808742, -532768, -51996, -901956, 123531, -968374, 728577, -628751, -941876, 716429, 906714, -594663, 130193, 51497, -595945, -658245, -269256, 174954, 546225, -672572, 794343, -279943, -245985, 601896, 504175, -899428, -423611, 238076, -463797, -166649, 340861, 144763, -565955, -234207, 864093, -238391, 205884, 600132, 767158, 294236, 341832, 608545, 943904, -257378, -989653, -919517, 225397, -416742, -540217, 943668, 205682, -203493, -325697, 704499, 625442, -763958, -809415, 371026, 977909, 923667, 475564, 762978, -341101, -309378, -32773, -371380, -472215, 931450, -336668, -478567, -674676, -1025, 225475, 452096, 588895, 763948, -825364, 385014, -70872, -166609, 214976, 359227, 193806, -751693, 9600, 902331, -798106, 916112, 617774, 594189, -361917, 970018};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques839(){
        Integer[] array = {96726, -648019, -476654, -148299, 192024, -633824, -976653, 236569, -691404, 717876, 84600, 600377, -462862, 124362, -397877, 427048, -243041, 591064, -180684, 196930, -233327, -403546, 10587, -775338, -667440, 260331, 23177, 536196, 830713, -14671, -766555, 494433, -118458, 50950, -170057, 411136, -958588, -396838, -136287, 947051, -741109, 445911, 45827, 839431, -648074, -418538, 403494, -295096, 539745, 731922, -19227, -568230, 653025, 12267, 81767, -347882, 878302, 866054, 667748, 750419, 835412, -214710, -496054, -933407, 883659, -894533, 255112, -569529, 529383, 814545, -191686, -640525, -816840, 156449, 438887, 8048, -879297, 264232, -519374, 980333, 579634, -185117, 205083, -491848, -332727, 676117, -998209, -884387, 792785, -141494, -663273, 944611, 330184, -509889, 812810, -578013, -184193, -423131, -482333, 887454};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques840(){
        Integer[] array = {-327380, -301945, -768120, 931130, -525686, 558526, 284504, -150755, -743588, -455379, 78755, 405918, 640510, 390455, -325335, 59914, -326945, 955402, -677244, 144779, 39206, 405015, 538627, -961245, -509383, 167887, -118815, -626200, -292407, -118370, -755415, 147335, 659709, -775930, 630528, 403285, 743006, 664015, 621965, -157229, -740347, 37762, -702012, 514038, 104530, -676173, 888662, 307794, 161752, 137215, -920119, 267057, 945497, -169710, -737176, -87868, 942066, -153855, 406049, 376907, -282759, -626053, -27940, -450598, 375049, 476880, -872866, 840700, 232112, 234316, 626296, -319177, -70616, 262844, -327820, 359605, -296552, -942878, -78099, 954092, 498652, 812519, 176163, 510020, -693255, 167765, 37184, -231130, 735305, 441872, 538251, -152750, -123512, 336455, -237061, 950226, -587902, -64361, 587785, -165857};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques841(){
        Integer[] array = {-38957, 283883, 842600, 980978, -727270, -9519, 7329, -799897, 636796, -139342, 401199, -550123, -888022, 653275, -471630, -81763, -909053, 850745, 248397, 432542, 745143, 480027, -243318, 766727, 425308, 916220, -870747, -119923, 967104, 403316, 943252, 808706, -930254, -23457, -604340, 297265, -736491, -466073, 197531, -760471, -732233, 254271, -582737, 265379, -313983, 762202, 626803, -477220, 786918, 670736, -886669, 249783, -741003, 896311, -92042, -281036, 462177, -992066, -151879, 752175, 519538, 387402, 211049, 116425, 941360, 297857, 622432, -880327, -578729, 319248, 55941, -156360, 757900, -597075, 331514, 45222, -998904, 596994, 508055, -646942, 356807, -110721, 206828, -231020, 879318, -580035, -708190, -416559, -939480, 84855, 637069, 993401, 30799, 708344, -287614, -361240, -735912, 292274, -138169, 823796};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques842(){
        Integer[] array = {-37725, -220880, 189934, 320856, -894072, -205472, 756198, 911071, -388409, 240887, 679537, -35131, -203111, -888479, -968961, -228814, -20671, 731512, -582910, 272663, -935214, 990824, 918483, -503005, -68977, 158750, -322482, -508972, 415865, -131940, 898425, 366949, 818072, -469831, -482457, -20350, -595508, 436171, -425799, 89929, 180145, -341570, 557716, 641652, -506467, -587076, -489037, -546892, -693068, -691873, -676758, -781402, -808410, 392808, -678419, 666888, -56782, -809344, -131637, 321240, 7704, -760834, -564165, -555450, -121976, 384537, -75624, -7993, -722206, 179391, 276426, 709688, -164187, 357428, 380513, 781161, 51220, 828944, -496606, 970640, -573972, 961980, 245600, -487607, -218427, 121478, 842866, 626273, 46616, 975114, -822988, -938881, -282237, -624240, 34629, -341864, 608522, 330646, -328001, -240052};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques843(){
        Integer[] array = {-735197, -465414, 719578, 888443, -373621, -582380, -918153, -430449, -888641, 331968, 657920, -31252, -381841, 308134, -292252, -385266, -959310, 893594, 41488, 30195, -548095, 584098, 337042, 725243, 219605, 300673, 715122, 200883, 123922, 97877, -27963, -592168, -483295, -859608, -357349, 622451, -802408, -259063, 422310, 507235, 715668, -326903, -265593, -624849, -379857, -631658, 480964, -994971, 308435, 734971, 784034, 614857, -5863, -987746, -446242, -914523, -622940, 462329, -653835, 473451, 61121, 877983, 916045, -385168, -392814, -61732, -542731, -193152, -605163, 842824, 432559, 998841, -648988, -702752, 870170, -668331, 149058, -148855, 649925, 245961, -534107, 384351, 363661, -75236, 953734, -47883, -26961, 13114, 351075, -472232, 708317, -573009, -182292, -987247, -129336, 323985, 14070, 272453, 81048, -705397};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques844(){
        Integer[] array = {-180778, -307249, 62926, -172108, 575561, -77680, -106795, 567633, 879972, -294929, -947466, 860307, -404917, 528493, 69240, -427370, -235430, 736568, 480152, -914973, -799178, 96736, -126840, -921888, -231276, -166877, -136346, -379472, -855644, -995916, -712273, -206141, 188909, 752503, 811431, 883462, -713269, 719946, -60525, -665920, -223582, 677797, 192844, 482810, 372634, -573774, 674121, 944115, -160187, 900707, -527776, 788325, 567723, 733861, -659601, -210976, -835791, 337842, -186783, -960118, -851821, 839853, -950801, 67440, -112362, -793025, -466724, 128114, 327821, -79550, -293941, 427544, 980673, 898734, -777538, -298636, 541253, -747992, -556204, -172162, 682073, 113331, -336444, 643468, -413345, 579652, 696471, 911625, -555164, 761904, 228918, -37053, -20868, -825282, -52406, 933590, -622239, 181496, -63449, -758760};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques845(){
        Integer[] array = {-747313, 215736, 13708, -818621, 177812, 226516, -921650, -402416, 164111, -412917, -343626, 280136, -697323, 301596, 198436, 902193, -548879, 245781, -251656, 937650, 555389, -570869, -660108, -324168, 371992, -938306, 962994, 862186, -869921, 740976, 875588, 13347, 194371, -897417, 251562, 82650, 787952, -767698, -785282, 696742, 84107, 632489, 786025, -663400, 211092, -822165, -684476, 209491, -712244, -891871, -601994, 594691, -98360, -115353, -961297, -735239, -830020, -658488, -631957, -715944, 656129, 164769, -806156, -715257, -445019, -140434, 403800, -345517, 568656, -14141, 102436, -731786, -959683, -517621, 104995, -407678, 325664, 767113, -12705, -246501, -656385, 633070, -851407, -315028, -670537, -811662, 768338, -825533, -163188, 685839, -394980, -36753, -879161, 302723, 166258, 136161, 375592, -889037, 730946, 509242};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques846(){
        Integer[] array = {196433, -886130, 456394, -949393, 666146, 826566, -119050, 404577, 255974, 148140, 702535, 469710, -608746, 986230, 168871, 583449, 551082, 262184, 552108, 686345, -994107, 552004, -973254, -158728, -917138, -239668, 8054, 585597, 793531, 209196, -915084, 829802, 431809, -873182, -236725, 168395, 572084, 907932, 770791, 932587, -986259, -318687, -288173, -638713, 454053, -121183, 447308, 61423, -232166, -639198, 348145, 194056, 25207, -904000, 601791, 21418, 801497, -349950, -693707, -64386, 575227, 621544, -329097, 550639, -156096, 979213, -946721, -590213, 583769, -626234, -574015, 313948, 991050, 473715, -990832, 47943, -33379, 137353, -813484, 135220, -522417, 319599, 984795, 975671, -109055, -539035, -393101, 461504, -393802, -653989, -303072, -268103, 626058, -713828, -371162, -631090, 952771, -847146, -591919, 630422};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques847(){
        Integer[] array = {950074, 781606, -7628, 695361, -853361, 860330, -31017, 715412, 810735, -27255, -885646, -44792, -51686, -372443, 908799, -932596, -486182, 359568, 990439, -135325, -796493, -79003, 95971, 912109, -668770, 445918, -793508, 855968, -797149, 35041, 440869, -345000, -29693, 772244, 138040, -761085, -357841, 231588, 354242, -744752, 34149, -107661, 142033, -496024, -26256, 673613, -941468, -766545, -481274, 723847, -656315, 160526, 602700, -708677, 666414, -279154, -412189, 592920, -264918, 102179, -225256, 413304, -676746, -832508, 511187, -682334, -339908, 482201, 991626, -696583, -811873, -959946, -952044, -368957, 922778, 209218, 508692, -893927, 714085, 158884, 496251, -905300, -329993, -651934, 665773, -683281, 769638, 857158, -952409, 912331, 773337, -222083, -26399, -735390, 158246, -239203, 646542, 895828, 882403, -150264};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques848(){
        Integer[] array = {121751, 748657, 706229, -254361, 202379, 856536, 751892, 919642, -181296, 337819, -439279, -173984, 595256, 532369, -425018, 295045, -233074, -55306, 725700, -745426, -364094, -861246, -691069, -193037, 162518, -732848, 53992, -111091, 951984, -908001, 608006, 391311, 912277, -316035, 376917, -974824, 176096, -753863, -934747, -884352, -180806, 28585, -780913, 67548, -92572, 727560, 372026, 888220, -526664, -381436, 483313, -690897, -138670, -139763, -466312, -381419, -187984, 331193, 558207, 974324, 822872, -572228, -815222, 544557, -978874, 897275, 44183, -727189, -657746, -245761, 325748, -239055, 169453, 130661, -271858, 868652, 915869, -220083, -104914, 276756, -182443, 237396, -267969, -711284, 545409, -635281, 277085, -847263, -399187, 152144, 607687, -640209, 745446, -453519, -774565, -295901, -253762, 424993, -904359, -920790};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques849(){
        Integer[] array = {-15479, -215777, 571728, -858101, -177791, 302981, -209545, -18581, 954460, -613398, -985280, 530473, 432156, 567326, 601872, -277506, -412353, -406406, -417360, -991139, 134873, -558510, -784363, 80634, -559467, -167988, -601885, 26506, -267266, -181742, -887704, -299998, 666868, -703939, 717667, 23511, 657757, 376683, -835577, -715354, 529138, 898489, 993476, -975633, 286094, -667668, -767705, -236585, -185039, -69997, -855230, -238067, 77628, -805692, -562494, -291093, -846264, 670246, -15280, -692720, 56557, 309529, 263799, -155825, -437354, 203694, 967923, -946524, -653439, 470857, -941862, -632463, 100531, 732316, -824905, -10454, -83050, -224364, -462009, 918940, 890154, 788082, -821892, -938680, -42302, -802998, 125262, 459269, -588492, 202099, 507595, 73062, -220509, -261513, 142039, 916674, -921087, -48636, 984415, 424692};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques850(){
        Integer[] array = {-500539, -827900, 140245, -19984, 926360, -49842, 228885, 267730, 789576, 729359, -428754, -916260, 653929, -816605, 802158, 950186, -191710, -924909, -949123, -31952, 568300, 397166, 967132, -688982, -110281, -896217, -897717, 822720, -627468, -672151, 457465, 727566, 51035, -699726, -199248, -678080, -455343, -647531, -2150, -632731, 493518, 563332, 187766, -568646, 298932, 627044, 141133, 720712, 314513, -806607, -339531, -593278, -535000, 668959, -404713, -719085, -909624, -149678, -772928, -894356, 507004, 109260, -425648, -99540, 417619, -65792, -205470, -478158, 340315, 777083, -794990, 504517, -824662, 974768, 969758, 636496, -87741, 312900, -175663, -36454, -734440, 192006, 52757, 433147, -527343, -655317, -655602, -543977, -505078, -263363, 811568, 600583, -31485, 753026, -987742, 898518, 736745, 600428, -538560, -530293};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques851(){
        Integer[] array = {-500565, 415866, 617449, 469276, 309312, -897216, -108015, -948660, -549413, 170258, -711540, -916836, 672478, -128055, -129691, 270460, 851431, -304672, -436001, 1976, -385880, 323239, 848370, 766531, -619983, 938346, -918061, 627239, -224293, 265589, -647465, -214586, 224603, 316040, -676865, 690968, 542089, 441186, 724884, 864466, 187428, 495900, 247918, -189876, -310702, 993618, -418986, -663759, 989516, -377148, -473866, 344957, -277271, -783269, 553306, -921418, 830374, -297802, -27910, -717301, 575681, 639665, -968452, 598805, 943810, -213336, -415938, 723741, -25364, 764033, -601163, 716156, 732494, 464337, -812433, 525864, -903103, 191581, 331367, 793082, 797172, -578545, -449703, 830794, 52457, 38365, 956951, -984206, -195619, 675065, 247037, -929197, -407338, 535315, 48591, -479396, -401634, 344336, 856304, 283468};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques852(){
        Integer[] array = {866084, -296608, 70378, 909012, -214572, -787535, 434919, 154363, -331127, 632101, -504217, -645874, -202775, 202688, -684310, -177608, 88623, 130227, 815260, 884713, -222058, -235554, -33619, 40898, 917715, 321659, -124317, 324491, -258527, -152984, 358179, 563119, -423980, -12672, -179178, -807325, -3524, -119729, 341311, 323384, 209874, -675701, 362026, -326168, -484306, -799455, 527634, 585695, 94010, 183876, 259862, -732391, 388142, 600547, 653197, -530333, -919828, 500564, 443280, -745969, -876568, -898044, -274811, 41634, 275352, -518914, 868878, 263912, -631621, -193031, -885312, 722739, 484574, 290446, 97800, 793336, -215759, -336248, 262919, -149385, -875266, 91612, 668166, 673122, 461944, -413027, -305642, -461858, 714892, 508945, -190976, -613965, 500930, -484786, -486280, -176982, 316075, 494938, 219751, 993849};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques853(){
        Integer[] array = {-246443, -77157, 317207, -520044, -895136, -314730, 67642, 543663, -396158, 352641, -121147, 271039, 604221, -830970, -492339, 864419, -688800, -757603, 337866, 13510, 303821, -610526, 606488, 728109, 824605, 216546, -338601, 279058, -437553, -314693, -473413, 622530, 291110, -629038, -725847, -898696, -529167, -483356, -776262, -298072, -982581, -887808, -829122, -413927, 496118, 371642, -53320, 505563, 205466, -477426, 479705, 251666, 83926, -860411, -725337, 35240, -535566, 725206, -523381, 770431, 684856, 145842, 156495, 241345, 299367, 348887, -296668, -616359, -155167, -979154, 147367, 347183, 636059, -124271, 554081, -187458, -572645, 112358, -54556, 628863, -771562, -50775, -729829, 731727, 874856, 66725, 409473, 532422, -518155, 617991, -912406, 952690, -130018, 751192, 928575, -458938, 637169, 544932, -104304, 983617};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques854(){
        Integer[] array = {-635604, -815620, 642351, -478028, -275012, 96535, -532005, -70926, -671233, -546536, -813750, 125327, 934399, -257258, -570915, -846240, 144138, 319868, 655069, 911152, -510990, 419115, 82346, 711218, -475126, 326465, -125094, 836097, 180136, -716160, -566149, -248276, -56091, 948139, 354070, 151536, -247727, -35179, 123169, 344189, -778656, 630744, -413251, 972402, -263908, -512124, -444902, 140443, -96626, 724567, 554799, -451420, -531685, 9724, -291012, 53936, 207683, -227518, 209115, -548195, -523431, 732951, 616052, -113865, -216963, -424202, 865662, 238086, 517515, -492146, 981460, -296878, -914273, -558127, -584434, -7887, -633739, 115383, 976123, 998605, -752883, 263478, -533842, -780860, 683299, 285095, -530486, -40797, -308376, 803125, 335257, -345735, -213937, 388628, 238617, 266577, -837545, -59137, -610730, -960598};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques855(){
        Integer[] array = {691755, -275500, 584575, 106020, -886114, 558539, 837671, -487169, 977113, -494824, -551380, 90507, -315879, 557930, 816458, 331154, 476087, -967226, -332897, -877536, -389921, 969670, -998560, 629872, 914941, 669100, 758927, 687512, -257273, -952051, 138224, -807766, -183274, -371786, 804181, 749375, 737246, -167244, 131111, -175469, 805160, -407828, 49393, -183852, -962664, -347623, 784972, -519928, 125031, -101529, 33567, -854683, 389693, -380436, 247817, -871598, 830969, 525252, 563351, -240425, -876680, 297342, 32213, 966965, 591205, -799718, 955674, -172113, -949936, -301245, 969971, -201459, -827412, -938438, -483179, -2730, -161039, -958370, 505953, -963556, -873442, 692115, -778746, 735538, -405779, -935147, 887664, 2341, 794415, -710475, 511893, -45498, 682801, -330883, 636888, 936062, -481214, 15239, -777838, 809787};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques856(){
        Integer[] array = {981684, -154565, 651209, 443937, 967501, 407281, -383089, -885108, 277184, -128195, -509533, 480078, 709069, 356948, 852099, -413830, 824643, 476604, 32683, -373014, -381058, -47710, -576473, -898595, -595622, 747410, -591196, -181745, 706877, -526771, 345968, -84032, 432327, 542418, 116427, -426638, -427633, 589298, -129319, -587167, -936478, 440620, -793259, -408792, -911711, -367524, -763544, -261881, 575058, 346352, 806769, -623151, -130601, -421257, 954990, 545363, -211024, 770662, -708529, -23516, -208014, 623591, -560665, -95977, 29101, 335750, -614720, -155860, 91706, -410858, 661449, 867756, 416526, -567889, -435515, -987295, -766608, 612149, -456855, -574911, -231739, -900017, 17158, -990269, -444057, -189853, -595066, -866491, 648691, -411541, 643100, 962502, -732362, -291877, -69301, 136126, 458651, -178202, -189724, -205118};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques857(){
        Integer[] array = {-501063, 124295, -188301, 989904, -555294, 808393, 995545, -222306, 965453, 428916, -668073, 254271, -443110, 973847, -452533, 818438, -687214, 404698, 408313, 831388, -208314, -200357, -964884, 565860, -628047, 257165, -496714, -692746, -701614, 815315, -389052, -396324, -685197, -974963, 37634, 360805, 997463, 78900, 754981, -532386, -587366, -797586, -881434, -956858, 21254, 503313, -419448, -613894, 900509, -543756, 63938, -259318, 226249, 72238, 826316, 37944, -360820, 651368, 63006, -57638, 841562, -224648, -518445, -951204, -181068, -12732, 394646, 176869, 42224, -393194, 35985, -74664, -471758, -93887, -369940, -446675, 654456, 491049, -409450, 526613, 747956, 756395, 904409, 539470, 183798, 987217, 197228, -47509, -70284, -590808, -574334, -911855, 370241, -404082, -11847, -791445, 640660, 995851, -757091, 278877};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques858(){
        Integer[] array = {210250, 610723, 368940, 362701, 909968, -407304, 935380, -320390, 356237, 899280, 298196, -341422, 68761, -804360, -776485, -848967, 744377, 349111, 89682, -873433, -943345, -90755, -897831, 255939, 779960, -966434, -935430, -573020, -669999, 791728, -965649, 614959, 833584, -461909, 334477, 950694, 391830, 674153, -343942, 5440, 886667, -245560, 731958, -82209, -581514, -99852, 617561, -917376, 558309, -121943, 419101, 713518, 599198, -716975, 784325, -407964, -789625, 740129, -433021, -379929, -237044, 506187, -84530, 684261, -218259, -108638, 381487, -964558, 589161, 756874, 881396, -974721, -829212, -600307, -454985, -785297, -921084, 707039, 392719, 982111, 344996, -450501, -345940, 318527, -578968, 942312, 261792, 696408, -830396, 475493, 966620, -871209, -127712, -110761, -395899, 929882, 219382, -578930, 248190, 311494};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques859(){
        Integer[] array = {315353, -315342, 680588, 636902, 68703, -929704, -984101, 25554, 219155, -425026, 928001, -417951, 854143, 18490, 277517, -209537, 217202, -798871, 331975, 455355, 237383, 606112, 970525, -616409, -300957, 775383, 648010, 523709, -183049, 868725, 366476, 267166, -750802, 616032, -739121, -166143, 5705, -565732, -948156, -407430, 67361, -92196, -971301, -407050, 836726, -707379, -172296, 665553, -961768, 3282, -99227, 929217, 287217, -208104, -232720, -610578, 317983, 979106, 934707, 682503, 733422, -355220, 522446, 300361, -405450, 609689, -952474, -174449, -796043, -654103, -649268, 841201, 938085, -388168, -735471, -178287, 905901, -434217, 744912, -237661, 597147, -840105, -187004, 5707, 388591, 654938, 920724, -987950, 573118, -204485, -571008, -421683, -604745, -807, -824684, 382622, -30331, 981321, -568474, -700743};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques860(){
        Integer[] array = {-150063, 434282, -157387, -990717, 122483, -181937, 299803, -161475, -280205, -961556, -92346, -539058, 924050, 956352, -247241, -302910, -569535, -52159, 970963, -889600, -896032, 250913, -51099, 372240, 437189, -880355, 871459, 164930, -502221, -887420, -141856, -518526, 647024, 866454, -873433, -823258, -809224, -631050, -730979, 554285, -793930, 707303, 14241, -976102, -857001, 910875, -194006, 764720, 109111, -192276, -385142, 521458, 466002, -888165, 460501, 717013, 998773, -378302, 279877, 449460, 688757, 638327, 883771, -633762, -117723, -88847, 228523, 729708, -642407, -654031, 241162, -121970, -888703, -712617, -981639, 932683, -81597, -815459, 84138, 820214, -919272, -591491, -693405, -577268, 268025, 531547, 202452, 152409, -202759, -141557, -968236, 150457, -934048, 199860, 417676, -916754, -983837, -865169, -630984, -444493};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques861(){
        Integer[] array = {-423485, -453551, 16700, -933532, 242611, -426084, -500330, -937984, -778173, -240328, 201008, 772773, 108626, 49511, 841633, -491764, 442887, 779711, -398560, 875087, 835400, -996321, -601482, 223661, -623625, -67942, -422017, -109072, 523404, -871351, -437251, 365147, 755388, -947873, 350041, -38634, -658902, -838985, -394050, -289795, 248965, -207900, 299637, 849839, -577975, 924069, -707889, -649943, -287812, 786762, -821225, -560352, 499583, -610442, -185455, -451688, 784552, 969926, 408458, 328396, -652582, 334507, -476880, 445619, -954773, -791603, 954072, -554605, -110345, -564281, -818988, -47176, -903034, -149153, 594345, 370328, 302502, 160025, 60635, -397321, 410392, 280258, -233975, 31329, 916786, -470032, -814510, 327265, 346116, -934811, -857703, 544850, 930473, -91130, -86079, 857891, -16178, -772218, -291366, 656465};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques862(){
        Integer[] array = {-830855, -57130, 586271, -907807, 969654, -47146, 647507, -49360, 318285, -926023, -735140, -518583, 53800, 197050, 829900, -406656, 297237, -37684, -877842, -831192, 252932, 735572, -894115, 300169, 857334, -456556, 725467, -692011, 849594, -767161, 393394, -531597, -419487, 664863, -881937, 24272, -293588, -325087, 417034, 641929, 321467, 760080, -164608, -752117, 261393, 590762, 942044, -847487, 168651, -473349, -726609, 615651, -329403, 672949, 108554, -852661, -860807, -908739, -104741, -755373, -526649, 138006, 947084, -822025, -920131, 171556, -296952, -253233, -653498, 609456, 188434, -292552, -871326, 772041, -872812, 609329, 453710, 747666, 485810, 417421, -425776, 460043, 194580, 671308, 74381, -19938, -401422, -291237, 808236, 319774, -547895, 448263, 671627, -215533, 606928, -650552, 103740, 774266, 416134, -292926};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques863(){
        Integer[] array = {-173514, 574363, -795839, -47748, -842935, -615620, -144046, 492936, 440924, -717393, 715898, -409626, 659134, 773224, 576862, 625384, 497400, 796567, 961187, -524874, -264099, 738506, 601199, -615702, -157534, -32451, -613707, -117054, 961642, -281287, -866895, 637868, 744362, -860405, -737279, -340498, 588670, 6990, -499535, 725331, 21238, 218840, -54047, -742659, -950211, 202867, 123999, -547437, -836534, 507024, 36641, 386839, -21044, -608907, -461670, 747179, -154927, 261585, 220951, 966855, 964907, 649953, -964622, 585840, -775877, -858254, 751509, -806042, -950189, 596736, 512965, 93125, 724772, -962577, 571683, 476605, -472386, -758685, -846612, 25627, -252472, -543874, 518740, 912843, 159319, -21346, 634763, -921794, -80442, 563910, -194015, 315371, -912742, 896973, -430124, 355410, -532960, -279545, 276053, 290414};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques864(){
        Integer[] array = {-516924, 712109, -618279, -803196, 309718, -409458, -722780, -83581, -527146, 213605, 667204, 514621, -74079, 909406, 755948, -568774, 649848, -25594, -103032, -713226, 52115, -735415, -908033, 187721, -374806, -424003, -920122, 895418, 886687, 173586, 795027, -936889, 39959, -949716, -219136, 472376, 11010, 779268, -595968, 224767, 836281, 314733, 516127, 350696, -381476, -108357, -424290, -360874, -688977, 36324, -364475, 286272, 76887, -797404, -716113, 783732, 906353, 694653, -552195, 929972, -539481, -965396, 509895, -493201, -831682, -541204, 200086, 70728, -990599, 713911, -337607, 499543, -438299, 6529, -104560, -583023, 822440, -696914, 47263, 450757, 914442, 848590, -998445, 272692, 594232, 545594, -767791, -723480, 76657, -623337, 53383, -32417, 201759, 990637, -607216, -260031, -165410, -448762, 732335, -163351};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques865(){
        Integer[] array = {-50378, 947843, -13619, -404259, 919635, 89105, 539039, -794334, -324611, -798167, 63474, 739593, 279457, 74161, -582665, 755196, -856698, 693282, 595899, 986648, -570259, -497680, -901095, -869291, -231328, 242835, 367462, 930564, 796444, 598449, 578509, -634487, 260556, 830691, 422888, -147145, 364092, 117767, 37585, -611981, 858162, 50952, 4532, 455803, -751123, -365894, -513831, -109622, -34900, 867800, -789773, -130135, -261347, 343335, 550663, 702655, 365309, 468987, 134543, 938292, 146867, -782955, -897796, 773658, -86428, -866086, 370996, 507140, 491812, 443045, -930790, 365435, -554530, -739300, -448933, 205822, -8068, -401115, 457413, 174319, 962545, -946274, 677416, 107415, -179811, -59596, 88424, -320095, -678234, 359639, 335051, 558009, 517337, -727198, -772700, 594670, -138427, -238353, -236331, -40};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques866(){
        Integer[] array = {265535, 870947, -208646, -871977, -28597, -454624, 295436, -95829, 87259, 562051, -891300, -204397, -654369, 771943, -343677, 411795, 233928, 608803, -972128, 957031, 185174, 486385, -151972, 115114, 228149, 767752, -255338, -191668, -575907, -338736, -323854, -208655, -16212, 510832, -878191, -350765, -475119, 575031, 103643, 304090, 405662, -525291, 128664, 169121, 248174, 979506, 280853, -204824, 270877, 119889, 770845, -115205, -14748, 931067, -907226, -858695, 295230, -357773, -506287, -515839, -352580, 355087, 620511, 918771, 818894, 810380, -476840, 879203, -625472, 55790, -706519, 490228, 114315, 174358, -680089, -360259, -458619, -797404, -581312, -809105, -911659, 105011, -636478, -231449, 580648, -58120, 691755, -828907, -842864, 824170, -490190, -600554, 469433, -619873, -388943, -561750, 654648, 948528, 438557, -110356};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques867(){
        Integer[] array = {800949, -832278, 123004, -457429, -603138, 344931, 477344, 884228, 423199, 405197, -897964, 345770, 200924, -216083, 556975, 558679, 152519, -436997, -58038, 91519, -763248, -122716, -904234, 952658, -968793, 898067, 29477, 156136, -549714, -11020, 284961, -850969, 203108, -484354, -891043, 373337, 160467, -978111, -980635, 262765, 969598, -414911, -224917, -268544, -521329, 624813, 375622, 700734, 595013, -181049, 493092, -357415, 824600, 513173, -59626, 501445, 175774, -394042, 93410, 258558, -200073, 246761, -970594, -405964, 862455, 177185, -45122, 60210, 738457, 233952, -50923, -894589, 148844, 148108, -832879, -292679, -967983, -816177, -433878, 389461, -346974, -76996, -628762, 554793, 532862, -137791, 622410, 415124, -992115, 558085, 331073, -649655, 705962, -615980, 438957, 750092, 194774, 657945, 900373, -27644};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques868(){
        Integer[] array = {927298, -77870, 467197, 382352, -905180, -675889, -261843, -546701, -128370, 33157, 977472, 839834, -408769, -126295, 72774, -732867, -6644, -31240, -956160, -987471, -947309, 988305, 935090, 610554, 919771, 663493, -381037, -596768, 76891, -439491, 658815, 539853, -382057, -651246, -452236, 141554, -263589, -192980, -393890, -88168, 461514, 87753, 297090, 609238, -557459, 507992, 261442, -929859, 335787, 278484, -409754, 641140, 312531, -77838, 809424, -993165, -57768, 849307, -443656, -704805, 108813, 579657, -837044, -792912, 202378, -462411, 447625, -880649, -583249, 973419, -951576, 117311, -386169, 111254, -118472, 631335, -314496, -199506, -566229, 340721, -252434, -388796, 380353, -41162, -64933, -46167, -720957, -680426, 581956, -526069, -66648, 455038, 456071, 831008, -589830, -62761, -736186, -1192, -143948, -86679};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques869(){
        Integer[] array = {592033, 842060, 85231, -720120, 78333, 91530, -976722, -555585, -62027, -576701, -706033, 648976, 183371, 449117, 195178, 537069, 90319, -410260, 978328, -256214, 153290, 659461, 945228, 146641, 269136, -752051, 751776, -757585, -13450, 71252, -341554, -693763, 664370, -81175, 434946, 912134, -558636, -603752, 271226, 196244, -940025, -163615, -583631, -610951, 511506, -979391, -706194, 991478, -897393, -851737, 315910, 677643, 939923, -78368, 229775, 940087, 324022, -887063, 65880, 110775, -58190, -936142, 616167, 678106, -472412, -466162, -748476, 843961, -354880, -77069, 65251, 283002, 72366, 734487, 642280, -644860, -567769, 869819, 993302, -405066, -364509, -298400, -273977, 635573, -565844, 162749, -627116, 382127, 128165, 750966, -916367, -134543, 754104, 325006, 508105, 16121, -23983, -453701, -232769, 583010};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques870(){
        Integer[] array = {397057, 988943, -625560, -834614, -785438, -745771, 533495, 593218, 965308, -137153, -820329, 539884, -566919, -562949, -190050, 113787, -953376, 751168, 666687, 996504, -237525, -372226, -811770, 315978, 886509, 870295, -192368, 157837, 828207, 158392, 136384, -751780, 232670, -718011, 163500, 894120, -758972, 551763, -789503, 564843, -40631, -947343, 98069, -977225, 509324, -709011, -397641, 242860, 578508, 32710, 327208, 899636, -557288, 467561, -852991, -494633, 564313, 265929, 150239, 915668, 350042, -768793, 56467, 92500, -459859, 667240, -877877, 961831, -883387, 808877, 678211, -886358, -63849, 936415, -409446, -328041, 598234, 168250, -757713, -366130, -875175, 729152, -145242, -415923, -363724, -592352, -546189, -167419, -639283, 407849, -420740, -311905, 189652, 859210, 659231, 997154, -982976, -622129, 120819, 315599};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques871(){
        Integer[] array = {535053, 693020, -774138, 531876, -931998, 701743, 443146, -522279, 951443, -87572, -323194, -954579, 955712, 482917, -42797, 68677, -157394, -749120, -306035, -197081, 198211, 713127, 280511, -473555, 625559, 212599, -904281, -530029, 33137, 689399, -262371, -411215, -899745, -757080, -137861, -993951, 12399, 838656, -290495, 426540, 782636, 463208, -96008, 429499, 239732, 849823, 858078, -225796, 693072, 337919, -848031, 166587, -929988, -885683, -603465, 520181, -196049, -384909, 233282, 736146, -754991, -921692, 416232, 387298, -607186, -136881, 669322, 459006, -483573, 475944, -305017, -165498, 958593, -45527, -548661, -514691, 558254, 775189, 206026, 264465, 990330, -446905, -977311, -487394, -704538, -384961, 976366, 95566, -196979, -600465, -640253, -395268, -421522, 674339, 5395, -913478, 197761, 676336, -979425, 30851};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques872(){
        Integer[] array = {-495052, -612797, 452365, -718291, 644267, -678097, -867878, -212761, -891238, 311397, 623750, -835935, 823975, 229828, 217355, 101173, 869240, 130897, -537285, 259759, -493918, 314325, 809234, 50451, 148237, 741533, -509187, -510457, -341092, -472372, -351995, -546461, -505821, 658178, -901021, 764247, -849980, -691374, 182698, -611847, 664842, -757324, 627931, -336072, -228916, 798464, 290056, -589455, -937175, 818693, -522060, 185316, -530083, 97675, -103402, 311344, 186198, -434881, 786120, 992416, 694350, -675129, -780490, 829021, -776218, -584258, -940435, -429576, -345419, -18203, -362924, -262783, 385994, -150791, -778156, -963533, -261570, 163738, -123171, 285079, 135620, -259296, -913989, 250244, 155903, -273562, 508500, 857351, -558057, 321647, -163981, -464735, -694754, 173547, -525282, 143579, -851299, -828150, -631197, 420656};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques873(){
        Integer[] array = {-632152, 780571, -733804, 956837, -406552, -18002, 888415, -297763, 919180, 379716, 167329, 422370, 383335, -187942, -860224, -702081, -441304, 286690, 338506, -66345, 305860, -819651, 312553, -894582, -912780, 718794, -394841, -640943, -325690, 228282, -397844, 41331, -160063, 767192, 541869, 308213, -137911, 115922, -962774, 659688, 54764, -989250, -536227, -91463, 999427, 563192, 283140, 835146, 610311, 727578, 882313, 810074, -369433, 967801, -117375, -604672, -37429, -318835, -85119, 16385, 741639, 621544, 879083, -893600, -176458, 824892, -397895, -260940, -745557, 543973, 750986, 362385, -651371, -557069, -533910, 941696, -51921, -325250, 176691, 732488, 172713, 215824, -699861, -488472, -610666, 159726, 156766, 450533, -872482, 946256, 986784, -936217, 23935, 155739, -278072, -86760, 564506, 499297, -890829, -19766};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques874(){
        Integer[] array = {-339335, 517522, 442884, 986894, 827932, 144509, -684801, 486321, -449164, 401535, -681638, 444404, 880576, 835815, -463730, -589528, 210368, 116762, 995478, -807651, -507693, -384307, -367930, -282600, -35457, 820680, 645074, 373409, 627332, -610734, -493458, -790119, 178416, 38565, 195326, 563883, 995223, 785175, 231509, 619965, -387288, 152276, -591629, 278418, 696184, 659864, -666016, 552236, 779921, -67034, 528841, -532990, 855820, 516439, 813875, -569449, -484687, 364180, -140085, -425992, 927011, 950580, -680091, -106009, 933157, -796433, -636348, -227438, -281595, 908090, 929292, 834183, 968090, 424188, 30539, -465609, 567804, 83824, -352631, -482702, 753332, 155939, -567874, 34712, 743955, 400140, -642698, 607529, 312207, 747724, -613119, 485608, -761617, -931766, 629846, -867685, -558419, 258020, -976634, 93577};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques875(){
        Integer[] array = {-744329, 221663, -817012, -917339, 83154, -978739, -470855, 779244, 915046, -587768, -661206, 842934, -973243, -277458, 55430, 741898, -138365, 674479, 860373, -775013, 491903, -263768, 562859, 642092, -832188, -221870, 899311, -622306, -623243, 783905, 967669, 380759, -677137, -879094, 287689, -719100, 995618, -718213, -602518, 55435, -827203, -541136, 746964, 336339, -67766, -229664, -661087, 538721, -330376, -843832, 572609, 876180, 64358, -774356, -230770, 593285, 656257, 791885, 597024, 242254, 308304, 114358, -121466, -939562, -852243, -577372, -25458, -933698, 119084, 868886, -871920, -330018, 80776, 581192, 706570, -582990, -569929, -173993, 789651, 917651, -689851, 261695, 164512, 51837, -443148, 658688, -822727, -893302, -244641, 237275, -736344, 862144, -567515, -985023, 67599, 477802, 197326, -819855, -286242, 111731};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques876(){
        Integer[] array = {-885053, -36266, 750420, 908866, -820518, 892637, -523795, -843803, 382773, -90453, 718715, -16298, -271770, 142296, 60896, 306051, 366253, -658224, 172924, -591421, 391048, 129811, 584301, 427777, -621372, 768991, -958682, -601592, -274551, -509186, 642922, -848606, 934699, -39413, 280638, -566844, -130421, -543781, 258009, 437168, -345290, 51312, 482695, -310144, 446306, 416218, -607066, 705747, -441737, 24753, 918108, 713083, -753719, 527710, 78832, 459830, -560755, -126009, -927267, 684, 135502, -762483, -376624, 814625, 62083, -65369, 328269, 45725, 438785, -888509, 8650, 576963, -986809, -153072, -203309, 654356, -518951, -948200, -768996, 19757, 188641, 969225, -69972, -965594, 381562, -930636, -629914, 206927, -15636, -70384, 854648, -764284, -925181, 128771, -12489, -507904, -390366, -572186, 546376, -198097};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques877(){
        Integer[] array = {181876, -207485, -902810, 262258, -38806, 759173, -121571, 201694, 925235, 840926, 177093, -925600, -264096, 251975, 509135, -313031, -496164, 51647, 952437, 739859, 913141, -587447, 679891, 724067, -871888, 357078, -401786, 332066, -13682, -356679, -609142, -102325, -49885, -242355, 736683, -786091, -257384, 944269, 137157, -597283, 458673, -189678, 583881, 83233, 802561, 912842, -689437, 771298, -261680, -835069, 228847, -400846, -969630, 421953, 59792, -866881, -794876, -430955, 960407, 239137, -928862, -285538, 6911, -276630, 660982, -928084, -429545, -402903, 220562, -589495, 677721, 792478, -537266, -105926, 909779, -825167, -534186, -309237, 413219, 52679, 166888, 431286, -521565, -923783, -681092, -648978, -134018, -219277, -701239, -389648, 848087, 181017, -952873, -235563, -555011, 756127, -134663, 152047, -587865, 765213};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques878(){
        Integer[] array = {60719, 561675, 853321, 951589, 316893, -120812, 368323, 637254, -884159, -690998, 533121, -876353, -998740, -224538, 859079, -275094, -278437, 170618, 326763, 463341, 871944, 766679, -524918, 476026, -484155, -89332, 934928, -500674, -465071, 25710, 390452, -577321, 309998, -485452, -804321, -754800, -845481, 958241, 46309, -817316, -276493, -341508, -593209, 761048, -682811, -783005, 529789, -302841, 317047, 640009, 192874, 721747, 781761, 690717, -959791, -566524, 958781, 841142, 682018, 690720, -923998, 156075, -746422, -446596, -694719, -693312, -562869, 224740, 416462, 764431, -284391, 418969, -494057, -358975, -724490, -998481, 326984, 608515, -522867, -444656, 673313, 777774, 97406, -269232, -619726, 97717, 530061, -393395, 986542, 303421, -407393, -776292, -402238, -794903, 827845, 815960, 489601, 812013, 627031, 177683};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques879(){
        Integer[] array = {-519009, 377040, -908399, -138807, 554279, 142137, 647152, 738770, -245599, 366292, -106458, -110546, 798048, -202021, -206528, 539109, -505122, 485691, -404479, -760902, 693062, 229384, -458783, -163571, -44752, -336875, -893227, 938552, 408678, 506455, -865555, 814783, 803449, -308924, 99554, -784558, -708252, 179617, -331269, -984229, -891061, 306756, 612234, -406793, -818474, -310289, 9643, 340060, -768037, 600476, -125792, -862597, 699638, -998598, 382955, 457580, -556868, -65188, 830042, 721856, -626375, 609024, 96554, 425028, 969072, -229390, 279829, 761059, 447420, -500053, -375929, 602946, -197417, 371509, 196575, 644567, -208284, 861219, -173581, 334611, 359574, -932100, 593926, 319803, -568579, -747017, -605693, -789863, -491989, 723863, 169551, -269245, -289470, -209404, 209157, 649043, 718368, 407951, -553790, -44530};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques880(){
        Integer[] array = {-697927, 401725, -292676, -809808, -647416, 55205, 510723, -605163, -516008, 332896, 951686, 519939, 894241, 532367, 268751, 891183, 811761, -547087, 606634, -329771, -14926, 939863, 788206, 558361, 263509, 908869, 254275, 346875, 558362, 471900, 771613, 881927, -41817, -700903, -163326, 973867, -560836, -678096, -864934, 693285, -558533, 698258, 499409, 704268, 730702, -909801, -51628, -299366, 301588, 794491, 202091, -24896, -200561, -810136, -721567, -902190, -616395, 246819, -953417, 282227, -795197, -727240, -967053, 430827, -721188, 535441, 632482, -952610, 982607, 315646, -11266, -383856, -157356, 875152, -336421, -366216, 370379, 384894, -932818, 993072, -364244, -853725, -357824, 465019, 291894, 462159, 106594, -813078, 914419, 811866, 868298, -613541, 599507, -742100, 807283, -921455, -594433, -838481, 226313, -732876};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques881(){
        Integer[] array = {-836095, 279226, -999026, -441141, 775722, -339050, -697777, 63502, -460147, 37120, -227546, -838234, -468981, -144203, 888885, -180102, -420994, 470897, 647603, -835002, 841620, -526755, -570516, -962297, 24976, -389630, 931506, -624202, -586345, -958120, 878199, 848191, -238216, 180793, -243118, -395947, 716169, 665478, -135360, 876659, -362809, -764564, 143791, -663271, -19810, 860122, 605092, -998213, -343044, -887757, -878749, -201091, 396774, -444124, -339604, -364144, -951999, -672045, -586967, 54541, 893616, -53216, 980678, 582703, -857099, -61252, 170109, -237383, 600079, 470334, 142851, 298486, 414811, 826446, 928087, 914497, 927268, -721403, 209390, -54461, -677565, -842013, 35093, -749886, 841219, 690660, -244994, -776369, -694894, -682983, 837580, 874973, 722526, 440771, -335009, -685640, -817881, 471430, -611345, 687010};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques882(){
        Integer[] array = {268399, 339002, -434936, -107076, -301012, 953254, 142055, -330230, -732524, 672188, -810158, 845734, 985505, 90388, 994962, 758191, 656798, 78109, -595139, -11209, 545382, 931109, 248190, -153801, 713345, 193908, 758158, 663003, 862514, -145802, -902304, 203583, -198684, -407583, 486045, 477183, -935721, 760284, -353394, 143880, 128147, -900101, -158357, -178571, -667626, 797656, 640733, 342746, 541541, -213113, -389689, 295578, -484733, 664829, 1297, -906661, 58829, 563217, -691470, -722273, -546032, -632123, -780308, 329443, 511114, 774685, 149091, -772628, -416510, -289550, -868721, 113133, 58191, 472420, -986778, 961830, 453417, -984779, -210536, -574956, -828110, 12813, 369255, 704078, -119038, 481331, -147275, -428352, 50074, -744588, 84394, 877246, 156089, 445927, -856175, 140351, 109492, -362263, -914376, 471292};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques883(){
        Integer[] array = {795499, 504444, 710322, -216283, 968363, 137059, -784986, -667953, 19381, -274713, 193117, -389365, 186036, 185903, 119244, 18043, 863564, 171870, -819563, -517015, -674554, -325244, 602897, 824098, -756077, 557581, 914635, 837727, -962901, 639935, -518625, 748784, 668493, 667751, 795609, 214391, 17035, -150636, 926375, -270638, 547559, 150605, -420228, -159273, -918689, -975887, -163225, -270880, 873211, 173396, -403157, 12946, -803238, -478454, 795309, 338730, -509157, -843343, 925523, -973695, 59196, 759442, -70148, -665862, -917298, 551688, -675533, 582409, -421269, 395843, -78039, 154799, -494550, -166933, 692976, -53543, -775993, -813685, 327173, -57048, 557610, -179152, 181395, -434137, 548614, -169645, 426999, -431237, 212921, -94235, 829066, 796244, 699197, -379455, 662815, 368258, -168232, 600444, -554097, -424873};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques884(){
        Integer[] array = {806982, 269269, 810010, -399543, -944298, -942820, -34394, 107973, -536475, -521594, -949159, 326257, 798139, -212086, -39234, 967101, 75537, -827034, 817093, -539156, -254539, -668716, 903662, 702109, 986856, 658388, -2077, -690949, -923074, -221025, -265270, 541513, -861899, -862129, -630228, -43749, 158890, 110003, 973179, 35922, -64559, -570667, 647900, 987900, 589152, 916533, -8205, 820207, 235044, 649450, -340860, 666300, 599210, 168161, -793540, -308250, 757700, -652402, -852243, -43073, -197945, -634238, 907628, -342811, -146483, -750850, -740363, -912980, 816740, -252143, -616946, -304842, 910354, -202523, 753255, -266474, -830988, -62311, -561345, -66201, -592257, -707885, -535465, -763376, -946564, -620398, 26281, 570094, 75015, -186243, -315402, 523919, -852941, -535447, -436987, 980836, 167694, 490305, -805951, -640554};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques885(){
        Integer[] array = {-791661, -264669, -269075, 851298, -645526, 17595, -158573, -986264, 80955, -863052, -336979, 723872, 242151, 383225, -480575, 467213, 691319, -617076, -993079, -134012, -406979, -593582, -348420, -919655, -764187, -660391, -993990, -880609, -990809, 21141, 389593, 325346, 468055, 353999, -646063, 11028, -734339, -778399, -133475, -301780, 478439, 932338, 361640, 46494, 152965, -507150, -994452, -708972, -659144, 10157, -944120, 515715, 918553, -952403, 641309, 838409, 983951, 483216, 951782, -784439, 786548, -332041, -287349, 321437, 419157, 166076, 327158, 448051, 214413, 603896, -863217, 634815, 133159, -97122, 165867, -900396, -671012, -421602, 697933, 109224, -335690, -773612, -154382, -651433, -430511, -654346, 86133, 154984, -479739, -285985, -865701, 214027, 986882, -338845, -260196, -43631, -30411, -298782, 67976, -18100};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques886(){
        Integer[] array = {-722968, 356439, 876130, 882638, -228570, 509805, -490575, 711945, 69069, 443975, -493361, -827304, -397508, -157487, -454495, 758094, -126928, 467090, -729331, 520680, 839297, -347561, -716531, -243622, -449668, 697047, 512472, -587201, -235918, -603393, -295772, 564242, -573957, -869630, -626096, 93455, 896365, -659200, 561889, 546942, 615063, -547483, 120307, 421359, 732230, 742993, 936517, -961674, 80000, -877619, -604107, 943704, -705789, 772876, -418297, -731056, 660370, -127810, -413399, 977185, -485938, -478522, -855135, -364677, -173108, 239629, 183426, 126717, 231025, -764141, -678677, -710272, 525742, -303527, -274519, 54525, -654939, 347753, 862026, -438652, -165464, -22498, -915147, 451083, -828591, 365493, 396609, 117134, 706381, 432551, -686898, -580855, -750532, 821447, -502441, -355930, -415832, -55850, -606882, 20640};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques887(){
        Integer[] array = {-685510, -377382, 279712, 417789, -32704, 577950, -695786, -806281, 451358, -695052, -22982, -28603, -234116, 5715, -202023, -635776, -675725, 679270, 309280, 335701, 918419, -585785, 475151, 489666, 75836, -303807, 375278, -780979, -439505, -618728, -625764, 819018, -404722, -952913, 516250, -422048, -673427, -828889, -550022, 895759, 923263, -299125, 683263, -963968, 65805, 365535, -452208, -723348, 269101, 912362, -340430, -154356, 909252, -525359, 963709, -642182, -929860, -217381, 708568, -903576, -148567, -348409, -465677, 46077, 606571, -710432, -723101, 111028, 254043, 295270, 896704, -659335, 78202, -212961, 628365, 299422, -433762, -634398, 27008, 107685, -93909, -527559, -862196, -472741, -837016, 894904, 4931, -978398, 747040, -813022, 570892, 216605, -183827, 556093, 759420, -434091, -405597, -210309, -666610, 171651};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques888(){
        Integer[] array = {485055, -545391, 101426, -896401, 761672, -231533, -849437, 88284, -30360, -943534, 177039, -870973, 815292, 348514, -660167, -651510, -340568, 54677, -577312, -737979, 476178, -469003, -561592, 566000, -618814, 909906, -992019, -514356, 870038, -129567, -421774, 762011, -705942, -956768, -493914, 959609, -175214, -802047, -505947, 577604, 593643, -535523, -142059, 227594, 895242, -876711, -239246, -404099, -676061, 391616, -887464, -938984, -692564, 603599, 561483, -992707, 873937, 536985, 819613, -351393, 639475, 674480, -4407, 144050, -886245, 675979, -786719, -438091, -804295, -197663, -300105, 486155, -382591, 262853, 40307, 679801, -376453, 409262, -162494, -562264, 278908, 841553, -6389, -919920, 690459, 284367, -477179, -707232, 284620, 398203, 93732, 417096, 967500, 798300, 542560, 649838, -700898, -739801, -433614, -14179};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques889(){
        Integer[] array = {925089, 191220, 890527, -658827, 88735, -944805, 518697, -191840, 830590, -326930, -217818, 122342, -434758, -637001, -966111, 557984, -398087, -284226, 203526, -400066, -339794, 92340, -395549, -803658, 279793, -183222, -928038, -1481, -358328, -809652, 872465, 844324, -249386, -919186, 520916, -55228, -207275, -603896, -741593, -830773, 764436, 627916, -71854, -353024, 659463, -254157, -543595, -407312, 623176, 682363, 223240, -948859, -187108, 334807, 335887, -309532, 242204, 332573, -482408, -918161, 322839, 334234, -775506, 369244, -19749, -199960, -826634, 511949, 900330, 271032, -201775, 385009, 80083, 792150, 616263, -375084, 340527, 573407, 711961, 698354, 428143, -105206, -800686, 689617, 398195, 941723, -497501, -271959, 80865, -653251, 967803, 918077, -748257, 184794, 278431, -449439, -753784, 614074, -681011, 611187};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques890(){
        Integer[] array = {4680, 748870, -552839, -301312, 637503, 197765, 516352, 458739, 930328, 585699, 531839, 936425, -698726, -219023, -493641, -757952, -904134, 31411, 575259, -222023, -922037, -922489, 70495, 649182, -94253, 525394, 277570, 376328, -659827, -326464, -799286, -11490, 746585, -977619, -795113, -927918, -788425, -832708, -42401, -421428, 293757, -735162, -83446, -689071, 789412, 221127, -190246, 695937, -96202, -652474, -336183, 357421, -523667, -204483, -727461, -299137, -198144, 235144, 208411, 887755, 51220, -89982, 273086, 41644, 958854, 30319, -238975, -186351, -146899, 696671, 248775, -300803, -479324, -869873, 571533, 544211, -711983, -47580, 433210, -369908, 410545, 662122, -151582, 787714, 223396, -35872, 191547, 460603, 936853, 64385, 249584, -744123, 956424, 783673, -725874, 190140, -654164, 384042, -182250, 594411};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques891(){
        Integer[] array = {976016, 362848, 208065, -851273, 620335, -514922, -189178, 101105, -785044, -534509, 424860, -343578, -991800, -48656, -409694, 585137, 850526, -532825, -576669, -710156, 446269, -381615, -343519, 75248, 852205, -398286, 431755, -247993, -201508, -623541, 822857, -5066, 499319, 997278, -284608, 596295, -991770, 396053, 405642, 235128, 343212, -768559, -58578, 28658, -542906, 523484, -619113, -482741, 260161, 242561, 931471, -104238, 382500, -361938, 208063, -162345, 517861, -279850, -675302, -519157, 684220, 954531, -563834, 338661, -683209, 870065, -97389, 381122, 491927, 531136, 516233, -724181, 942495, 149730, 620670, -507671, 505784, 418575, 188982, 473606, -315251, 284247, -194700, -641960, -625484, -679419, 940471, -291717, 931633, 524451, -631826, -402418, -834709, 355896, -446919, 741110, -368251, -307020, -105805, 160624};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques892(){
        Integer[] array = {-685884, -604908, -113223, -193421, 50431, -337115, -69516, -92117, -457968, 224951, 987562, -990500, -538620, -385628, 678749, -779940, 868765, -167446, 15483, -700940, 163010, -135671, 777957, 674536, 768322, -956572, 942749, 765968, -512396, -243461, -741364, 162954, 223345, -285038, 592069, 286025, -452769, 287962, 413913, -428865, -335464, 677293, -446024, -943819, -53978, 16792, -115681, -642616, -690444, -933554, -753083, 454520, 940393, -908925, 405150, -128842, -569996, -908738, -615033, 144864, 807057, -717458, 771285, -15200, -540875, 164231, 738219, -988269, -701928, 248798, 581645, -204922, -815829, 624006, 961402, 737151, -944253, 383964, -899395, -281383, -229849, -325900, 457624, 688656, -740366, 942668, 81700, -556720, -873417, 348618, -493889, -639683, 616307, -697589, 526713, -71029, 391342, 241219, -384488, 628562};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques893(){
        Integer[] array = {-417301, 568094, 455414, -371057, -456239, 294249, -379351, -712913, 621937, 319149, -78027, -135996, -184403, 410962, 264210, -887432, -970761, -524430, 551240, -581944, 898879, 568088, 684802, -793128, 95757, 321534, 826848, -243140, 366720, -39430, -513423, -504552, 632229, -93329, 277605, 970358, 501314, 365993, 181306, -864541, -765009, 276097, 279284, 59666, 610787, -555946, -617203, 630743, -391324, 918179, 180890, -603929, -697647, 539149, -334961, -48218, -605770, -606632, -280261, 366203, 202067, 372452, 682158, 373043, 554452, 682497, -424128, 94, 348554, 770670, 133155, -757370, 18764, 406985, 298328, 305246, -323739, -160710, 937543, 299421, 248990, -397249, 963575, 233347, 914183, -597619, 618998, -86083, 906477, 308076, -552236, 575537, 466640, -142601, 596067, -99095, -567350, 848694, 134472, -829879};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques894(){
        Integer[] array = {-700267, 137516, 945387, -18664, 586615, 899543, 676181, 526883, 999376, 536962, -647343, -923608, -123775, 508527, 439318, 203497, -149437, -962274, -236101, -26782, 441553, -603217, 652776, -495363, 437846, 342306, 383227, 301741, -18127, 559915, -931299, -369665, 734513, 506462, 294690, -246176, 242872, -545978, 975731, 52157, 589268, -809157, -349585, -243389, 908168, -159461, 482640, -225756, 341636, -837803, 376534, 329440, 954438, 124745, 48245, 137373, 975637, -921693, -276100, 11197, 705299, 749861, 369499, 304418, 866574, -440674, -618747, -997, 465980, -771549, 187690, -770810, 307800, -371854, -281439, 906386, 484102, 39613, -209136, -974824, 927852, -576950, -714483, 328365, -345644, 161996, 287039, -113915, 717624, 252792, -233037, 859466, 290532, 623615, -576720, -268830, -601936, 916404, -182413, -439183};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques895(){
        Integer[] array = {-181706, -625760, -790147, 370593, -453166, 799255, 46208, -322943, -686787, 612051, -748175, -348364, -835413, 968123, 421446, 749443, 853898, -78587, -627399, -42092, -338685, 436704, 822677, -32929, -143510, 366275, 774662, -174823, -833174, 632653, -707731, -676570, -991680, -433659, 538259, 237412, 709337, 858274, -308281, -105555, -695289, 419602, 509438, -432197, 891656, 390864, -31015, -589690, 616464, 794413, -910763, -906444, 846453, 266509, -918803, 350552, -397920, 693470, -908985, 309, -775246, 640465, 94600, -683227, 8025, -516189, -74215, -510554, 448875, -599052, -44355, 910944, 20814, 11556, 188852, -931809, -540448, -85455, -587051, -231641, 282364, 24688, 372759, -58088, 612329, -112500, -292344, 711829, 826859, -582378, -332977, -100117, -792728, -495176, 117527, -448983, -159173, -97270, 425742, 10895};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques896(){
        Integer[] array = {79325, -876991, 652143, -931421, 32564, -700083, 588701, 649918, 687141, -615867, -314412, 891889, -513447, -247055, -828837, 116125, 980935, 158278, 925830, 532840, 51053, 374351, -312882, -395500, 136309, -21773, -261265, 236669, 909059, 719425, 61405, -268137, 646278, 503430, -790352, -795514, -30794, -321104, 834031, -327024, 576150, 568551, 717349, -958044, 130339, 472681, -930017, -746647, -167647, 191204, -674672, 140112, 118865, -138226, 72220, 515097, 647586, 38014, -726205, 962084, 95541, -251926, -4105, -430510, 728608, 864880, 951274, 822729, -961865, -554278, 278582, 117782, -310716, -517494, 362095, -644120, -740054, 119505, -316063, 185806, 128251, 467353, -367916, -170861, 645055, -942793, -94391, 259475, -146101, -795529, -186817, 20215, 256449, 141193, 375828, 255804, 22666, 323317, 37006, -624957};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques897(){
        Integer[] array = {-770301, 105625, 117578, -927364, -946162, -274457, -260189, -600672, 758351, -739471, 380844, 392635, -718259, -643167, 646160, -499709, 45651, 319370, 600146, -635339, 308428, -962937, 201156, 765140, 461915, 196769, 446530, -980986, -520510, 420711, 757659, -796380, -729060, 775094, -609734, 203551, -946223, 387007, 21345, 755785, -343595, -612951, -83329, 529131, 506379, -109921, -964253, -705617, 756210, 296339, 864022, -670912, 825221, -671593, -665709, 654984, 700489, 260602, 76192, -641781, -849879, -939980, -379277, 534687, -450650, -923231, 963637, -407145, -499143, 720158, 834481, 44482, -388369, 2890, -963196, 38194, -470789, -306757, 157295, 546339, 416162, 738753, -60478, -133304, 297130, 869856, 351799, 513473, -623806, 753926, 441178, -405534, -36974, 387817, -861448, 252469, -377134, 30215, 190341, 853711};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques898(){
        Integer[] array = {-156837, 296272, -443865, 155662, -157111, 203916, 664384, -11026, 801520, -93429, 146510, -926470, 583839, 414728, -672828, -665387, 407493, -694081, 280677, -895092, -193368, 984280, -640183, -362533, -726404, 614932, 695043, 324732, -730382, 166831, -404100, -767715, 32212, -831963, 811313, -926480, 856775, -353429, -655185, 647356, -125559, -621536, -762774, 182598, -630813, -767066, -284298, 563817, -397986, 706492, -178697, 334101, 355829, -54970, 819842, -942602, -20100, -385224, 896782, 182836, -990726, -764946, 263766, 386459, 995532, -568303, 289992, 289997, 96275, 496620, -284901, 522229, -874003, -843084, 425934, -48191, -635839, -406593, 138167, 939136, 50791, -145268, -225461, 649213, 532406, 564369, -220811, -323822, -44445, -830261, -459647, 251363, -206681, -127794, 732957, 669184, 991215, -51285, 722833, -915770};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques899(){
        Integer[] array = {110557, 487310, -676488, -635970, 781569, 498148, 56728, -970286, -715712, -225775, -851963, -414809, 649022, -968952, 352000, -99533, -645269, -215322, -42398, 57863, 949197, -119704, 266263, 588154, -312343, -357620, -240839, 631130, 323008, 265247, 114384, 104847, 283083, 775829, 903389, -233053, 44376, 679447, 991136, 532117, 69970, 792215, -75535, -16143, -383365, -20852, -295544, 51451, 422604, -20334, 27303, -742266, -975782, -326588, 789732, -774955, 994644, 500247, -267377, -84026, 833886, 308402, -898140, 801403, -403515, 299613, -145227, -727273, 494739, -320523, 221143, -896293, 636066, -404957, 961986, -147412, -59758, 989724, 22514, -998537, 867514, -529590, 282706, 30943, 600373, 617903, -698879, -519514, -905212, -824099, -883130, 766040, 26802, 715499, -367766, -387167, 911024, -70166, -13144, -859908};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques900(){
        Integer[] array = {873246, -691595, 521686, -368292, 348389, 339416, -249755, 232125, 904429, -935212, 527850, -835148, 730264, 958540, -966207, 830984, 456127, -459285, 326501, -280174, 88129, -118104, 711481, 439513, 335879, -596227, 39804, 54422, 477511, 139365, 825724, 38151, 113593, -238659, 272055, -804514, 311464, 932954, -968196, -553466, -394392, 655443, 931805, -220775, 449381, 910760, 2809, -767801, -648794, -699665, -505434, -771547, -507033, -404623, 543782, 845506, -954749, 138329, 654894, -781340, 169693, -67238, -770974, 442737, -418938, -30212, 838167, 761386, -954359, -899207, -989065, 37024, 317120, -404503, -152033, -625490, 966428, 70852, 997116, -959111, 373780, -504178, 473775, 431292, 659400, 798660, -932171, 364845, 592329, 306216, 632964, -347299, 875967, 558481, -733699, -462121, 253992, -126695, 302959, 733536};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques901(){
        Integer[] array = {902428, -27730, -762225, -801490, 497954, -25792, -238092, 311378, 5268, 450317, 55027, 350585, 132230, -692751, -785894, -578778, 78847, 170981, -559058, -897455, 183543, -950968, 263486, -464236, -468224, 542816, -364533, 620342, 249351, 3789, 844598, -33254, -737205, -208969, 597104, -443767, 570508, 577324, 339788, -278520, 26419, -245988, -887855, -131271, 502339, -626223, 583867, -296683, -208281, -802191, -440237, 464809, 343155, 520207, 744497, -477514, 213728, -267197, -397193, -800023, -161312, -819704, 377528, -270875, 945184, 627575, 360248, 613714, -730536, 609113, -465577, 217743, -218829, 828149, 911444, 341337, -633510, -540442, 40143, 862514, 843667, 326663, 717991, -354510, 743890, -108929, -385595, -955437, 34828, -199498, -247483, 71389, 605744, 344074, -157691, 952949, -454693, -158376, 430966, 47832};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques902(){
        Integer[] array = {412300, 201866, 422460, 54631, 650921, -8180, -213066, 946045, 181613, -255858, -640429, -668225, 363549, 93588, -637233, 452893, -249151, -605216, 877826, 595682, 310604, -183560, -357826, 60572, -462672, -915457, -599554, -95, 146113, 464285, 331819, -186707, 240991, -344082, 381957, -475218, -154559, -281417, 715149, -465895, -627442, 704785, 762437, -289041, -406235, 112663, 676655, -295006, -675986, 252998, 472046, -532893, -138480, 304274, -279896, 680529, 572946, -311815, 815154, 40983, -379636, 507978, 605244, -645358, 374734, 645658, -446543, 234993, 46945, 52853, -206528, -507989, -493593, 52620, 772099, 298602, 636179, -258524, -801194, -283029, 647544, 206239, 583569, 426830, 692027, 390335, 905139, -217015, -961760, 760457, -717097, 743308, -945857, -683215, -325610, -995168, -1106, -472564, -302540, 458219};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques903(){
        Integer[] array = {-500700, 72485, 978852, 156326, 546225, 915362, -926401, -317386, 344386, -35076, -195053, -305901, -939557, -15605, -495454, 625445, -90847, -832993, 597976, 331496, 311633, -585297, 60170, 670430, -533665, -352555, 772583, -11527, 528860, -139044, 275057, -816829, 447759, -943588, -591388, -463817, -63751, 951931, 561105, -261605, 193399, 293709, -599755, -301539, -84628, 245909, -826563, 154556, -500351, -785325, -164175, -321835, -912946, -454691, -130503, 520913, 995581, -284838, 178623, -321889, -830776, -158118, -679644, -241018, -338948, -548779, 933059, 407867, 526789, 272526, -593800, -853708, -426335, -947520, 502562, 463609, 485834, 247145, -502852, 89477, 281146, -248730, -7683, 920438, 968585, 460992, -751237, -959966, -735134, 773638, -232491, -903428, -584558, 826602, -113803, 747760, 938495, -20367, -205507, 348561};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques904(){
        Integer[] array = {847003, 564643, 428551, 596021, -516913, -338189, -116375, -256057, 571977, -905181, 211725, 97086, 393498, 329268, -655513, -614977, 353989, -780891, -216590, 824001, 731939, 464248, -124524, -799950, 492276, -564314, -839133, -496968, -582546, -470054, -712366, -223395, 984902, 516544, -324457, 234336, -810260, -834128, 704894, 891142, 74048, -250070, -649170, 941253, -828831, -474286, 726488, 253772, 54328, 96355, 680772, -37345, -881233, 199467, -35722, -327358, -583665, -120389, -577787, -839077, -14674, -581005, 518047, 627614, 552851, -668566, -690546, -831863, 555666, 468207, -180226, -354911, -267632, -286283, 997345, -484016, 144850, 36039, -751795, -384890, 197045, -184662, 163738, -577344, 283665, -114244, 801414, -203876, -836679, 385140, -503078, -335033, -213721, -420788, -504104, -916270, -303582, 462034, -358030, 121357};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques905(){
        Integer[] array = {205102, 948332, -763775, -24091, -597438, -96178, 740686, 340075, -361669, -638880, 212209, -472877, -834329, 859187, -633067, 10338, 915958, -723172, 849578, 97777, 112685, 22448, 502886, 724875, -837414, 332094, -975609, 165410, -520133, 342148, -120569, -377677, -633316, 814980, 237971, -118982, -88637, -612245, 67914, -178818, -690346, -971490, -385941, 538827, -138232, 721165, -619616, 401938, -347677, -33235, 863729, -791329, 912521, -821773, 113120, -816740, -931908, -320863, 698014, 883528, 625047, 328152, 33541, -78059, 543837, -605230, -971292, 506571, 762779, -115211, -823071, -26123, -999344, -252420, -10574, -104030, -55188, -472185, 644106, 42088, -515648, -211831, 327367, -150452, -572696, 924559, 672118, 513512, 339410, -784660, 110209, -695640, 46998, 254346, 445271, -183023, 602296, 85416, 62834, 443236};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques906(){
        Integer[] array = {-382672, 900928, 631410, -549924, -27174, 130071, 103008, 710670, 512821, -267584, 573379, -637009, -854621, -762905, 198348, 6463, 766627, -82741, -880426, -887970, 454655, -605039, 597460, -969050, 115526, -629446, 572594, 340838, 998875, 358610, 750126, -139499, 920449, 898208, -263637, -490487, 71189, 152436, 674003, -726536, -706433, -737327, 580175, 658196, 648805, -477849, 259854, 698001, -8092, -553441, 262906, 328974, -669558, -793919, 773087, 731296, 802189, 910244, -285437, -7555, -844743, -144119, -32734, 731885, 997694, -212742, -953, -752339, -99130, -723425, -796519, 722297, -65788, 215289, 264557, -392074, -793780, -989311, 930000, -107440, 252306, 682293, -639539, -923192, 633294, 81413, -570165, -508307, 662573, -332670, -455370, 369164, 481204, -123028, 658551, 319967, 452634, 758024, 473750, 109922};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques907(){
        Integer[] array = {692225, 710333, -403008, 503084, 934301, -993668, 14421, 323345, 943366, -703998, -800398, -625833, 944882, -206469, 347879, 976113, 594145, 275379, 412274, -579829, 418525, -897523, 844307, 957282, 75897, -481850, -596852, -170833, 818459, 236882, -545610, 79013, 218118, -869388, -264391, -687211, 162317, -472524, 122175, -658657, 854006, 173366, -289365, -695463, -190406, -569050, -689847, -61737, -857664, 47876, -893519, -777750, 951467, 344624, 600991, 140826, -944435, 792944, 715361, -906, 141627, 546974, -169844, -26049, -527483, -551754, 936521, 675669, 505639, -617245, 669445, -277773, 665897, -526786, -691967, -957766, 93361, 700518, -152938, 45631, -566828, 435270, -1045, 122328, 819337, 58931, 339885, 484266, -387952, 97112, 571566, -4772, 625143, -68833, -340342, -962545, -881289, 952656, -205392, 976886};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques908(){
        Integer[] array = {708467, -140353, 489491, -527906, 108379, -693785, 170796, -694073, -234777, -339271, 960247, -204515, 990122, -469588, 941281, 853260, 507736, -736493, 967464, 579839, 108157, 982802, -605919, -374786, 224046, -439726, -91402, 231064, 725828, -618684, 971425, 407205, 587486, -566974, -833419, -614060, -751116, 590787, -983986, 238711, -789618, -566808, -135610, 118924, 30227, 11357, 159144, 999036, -716654, 113638, -904232, 947957, 504905, 691011, -524543, 256979, 285715, -19051, -673994, -489433, 391573, -928813, -219110, 522673, 480860, -651381, -305952, -566701, -941866, -382365, -482466, -320109, 926241, 58129, -149354, 276143, 691590, -523893, 590980, 214923, -721771, 542645, 456925, 985464, -273157, 224666, 194569, 348252, -51844, -827561, 85300, 93390, 448317, 532254, -166146, -780370, -185781, 197613, 480477, -926188};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques909(){
        Integer[] array = {764378, 666347, 718075, -129987, 43256, -569326, 109519, -405058, -102673, 100976, 415935, -633, 876204, 795688, 147330, -606473, 397817, -119169, -965377, -295045, -663356, -12722, 360343, 130444, -771656, -868201, 250665, -241048, -663224, 657902, 613380, -160088, 68733, -493806, -768905, -36118, 920421, 94504, 997853, 802730, -763746, -143031, 149776, -386765, 936268, 600535, -817313, 640431, -997120, -418433, -889288, -328555, -426584, 944902, -339101, 300358, 582007, 605245, -282097, 265621, 595659, 262233, -696250, -879272, 350301, -289218, -553782, -606160, -405330, -907076, 469075, -785720, -788922, -584323, -885704, 351103, 838401, -678425, -85809, 163522, -371258, -158728, 924366, 775951, -497102, 766630, -59781, -453822, 66340, 327938, -558604, -667960, 970015, 445470, -73896, -857344, 274513, 247308, -297778, -957261};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques910(){
        Integer[] array = {616539, -788439, 153065, -544286, 899434, -294756, 299022, -611271, -640110, 283327, 821961, 618207, 426488, -290190, 837009, -570624, 753713, -469843, 312532, 704665, 336454, 979574, -143763, 314929, 172319, 236329, 304734, -454136, 252605, 871512, -582355, 938963, 355980, -138228, -257107, -529405, 344534, 137818, 342478, -693513, 68354, 275632, -24812, 286851, -935130, 215610, 558562, -969460, 826013, -758722, -326380, -249632, 379066, -581200, 262027, 11547, 906466, -554536, -931475, -236892, -604951, -990325, -606009, -705583, -952270, -801780, 604616, 829252, 867521, -795176, 834972, 802902, 653451, 969288, 794790, 178419, -660450, 519820, -945726, -823078, 326290, -606934, 661753, 47387, 879379, -310501, -377510, -342645, -488724, -107199, -940942, 580805, -713249, -634641, 28520, 290017, 753721, -819875, -121246, -635858};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques911(){
        Integer[] array = {94035, 178086, -254504, 142326, -341228, 599195, 309709, 232751, 381672, -912601, -191321, -93365, 969675, -362639, 863682, -927459, 289038, 707087, 582120, -88893, -567309, -412620, -937205, -450904, -771290, 407621, 994410, 558983, -395270, -317890, 194508, -174261, -462203, 998140, -315637, -654075, -919595, 42447, 184071, 891049, 698692, 849864, 45662, 687448, 915671, 831589, 769068, 14304, 497988, 351878, -635931, 302126, 573921, 321941, 647069, -274826, -275465, 297724, -67415, 766285, -107159, 304574, 347532, 997638, -268470, 541672, 432880, 614066, 573275, -97858, -940637, 709995, 221484, -68159, -568329, -283743, 632881, 615014, -347805, -669190, -736277, 907805, -514141, 722596, -72444, -324322, 640172, -712422, 15195, 943955, -634117, 336197, 71092, -566893, 931647, -360223, 766915, -159524, 567420, 158010};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques912(){
        Integer[] array = {-498767, -618308, 714970, 531498, 846206, -811741, 919390, -79535, -38626, -563583, -948004, 969151, 480108, 126861, -5366, -472670, 857394, -443711, 993134, -97849, 902246, 336381, 168500, 741301, -912987, -119709, -291066, -789755, 151100, 36549, -109411, -273777, 422129, 633380, -274099, -251722, -446928, 222752, 908816, -644023, 390322, 758729, 643653, -331506, -713115, 57714, -348434, 361981, 404069, -623922, 654456, -686669, -133279, 192875, -311548, -28075, -754126, 937365, -367263, 581574, 984983, 45092, -451017, 825706, -754220, 780831, -48224, 325604, -693901, 375550, 873944, 410877, 331644, -309400, 408249, -260881, -665622, -823628, 775521, 84410, 596602, -168467, -129285, 799739, -753440, 31662, -281484, -754620, 702283, 620251, -887367, 580195, -286353, 85020, 944224, -500876, -852902, -311055, -349290, 388266};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques913(){
        Integer[] array = {360893, 213384, 72337, 906693, -398422, 386978, -860501, 252960, 808976, 563935, -996831, 18250, -451520, 257397, 213251, 374690, 399131, 159787, -468289, -535263, 882768, 165147, -326571, 972430, 27039, -219987, -242351, -265340, -779830, 290374, -39322, 506743, 779495, 231719, 249268, -152212, -613694, 112462, -782672, -623934, -803752, -297415, 112519, -9084, -286515, 396116, -383345, 780925, -499283, 734868, -785102, -987879, 337593, 434662, -662523, -841265, -875025, -644140, -530756, -576924, 69210, -789299, -208935, 502823, -504687, -861645, 258666, 740088, 984929, 344922, -672982, 988499, 733100, 652696, -777652, -95700, -52128, -859170, 796034, -258839, -401274, 978554, 836703, 742971, -925396, -36901, -700190, 104091, -775647, -525396, 194327, -432510, -151126, 212713, -555790, -345052, -898464, 977764, 502369, 932606};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques914(){
        Integer[] array = {-204321, 453834, -805618, 490166, -323305, 60637, -232794, -735675, 565010, -426318, 294754, 438960, -888009, -156539, -477355, 303958, -915269, 4700, -8089, -947427, 938382, 293639, -559238, -814711, -378916, 441320, -694746, 531516, -958912, 232990, 527855, 207878, 642848, -970942, -946206, 452087, -471979, -511985, 954478, 952277, -124844, -794096, -355181, 448861, 752306, -61514, 609029, 769521, 872957, -786646, 853258, -97835, -917412, -723213, 150562, -515950, -646847, 68082, 678061, 335328, 600787, -991476, -125958, 566593, 808495, -72919, 86912, -212591, -857072, 759393, 828839, 171554, -257338, 329857, -718533, -929072, -711962, 298080, -666705, -419016, 908071, -796405, 925693, -792201, -605433, 267930, -30237, -881116, 725488, -997967, -516706, 560306, -287519, 990531, 506593, -672650, 814220, 673510, -91434, 373587};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques915(){
        Integer[] array = {-776557, 944594, -959208, -684925, -23761, 418011, 609758, -106044, 465721, -975733, -518843, -719603, -705230, 157777, -483084, 131725, 550576, 95161, -751686, 147891, -873385, 714439, 558616, -308933, -281560, 955475, 464389, 981133, -548279, -90639, 84284, -246429, 386486, -201641, 927945, 631533, -441690, 913064, -606289, 2505, 474243, -372255, 196176, -717936, -774930, -129605, -643037, 315928, -517768, 322525, -659728, -209502, 149317, -551567, -838182, 515542, 75112, -766953, 361593, -478070, 235296, 554545, 400491, 95335, 761203, 190842, 26749, 461532, -694680, 790373, -742253, -652878, -351166, 492633, -20535, 499624, -617541, 371804, 630045, -438436, -190861, -112083, 695723, -642865, 953898, 434207, -746878, -52514, -289146, 69538, -113024, -696293, -738395, -115671, -952937, 309017, -807716, -931091, 413472, 754163};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques916(){
        Integer[] array = {-500665, -118499, 60469, -551110, -290482, -836431, 520606, -796486, 791913, 708329, -288420, -905244, -987841, 355083, -672113, 698273, 354022, 74171, 552127, -926820, 355807, -687503, -754779, 727159, -745392, -773280, -784630, 904224, 286137, 204262, -371083, -127298, -471608, -763394, -416327, 734385, -588782, -89603, -279121, -164859, -114912, -864211, -674731, 99926, 960906, 960775, 987407, -194439, -921060, 3312, -521244, -146811, 30907, -658583, 496418, -81683, 351528, 545909, 338104, 513667, -387954, 574047, 801762, 893934, -64611, 996592, -455932, -118365, -866479, 354817, 280450, -444857, 747896, 320804, 83996, 629669, 22133, 796468, -3194, -910346, 605778, -611786, -802284, -391463, 122988, 686822, -972053, 241732, -546557, 982162, -343576, -129337, 551825, 364900, -233661, 144636, -277904, 968777, -228596, 419895};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques917(){
        Integer[] array = {523975, -843522, 807454, 25300, -888446, 398851, -955899, 919833, 968973, -592979, 630441, -282814, -882149, -414303, -245770, 805656, -311293, -991308, -419320, -301876, 406380, 289484, 922821, 491116, 582244, -693188, 944835, 907456, -737977, -756845, -656084, -873264, 37071, -773090, -624253, 183500, 187899, 917186, 122770, 306766, -785080, 889782, 986619, -242758, 570906, -682249, -74828, -573788, 969068, -700290, 682513, 894682, -113133, -425029, 900457, -55672, -398491, -200790, 576577, 676985, 383101, 19150, -825001, 800268, -522688, -407919, 435132, 445194, 630371, -941197, -356552, 204605, 59974, 367110, -222897, 866557, -129429, -312049, 602069, -858490, 558483, 932274, 561955, 496818, 407211, -903746, -91170, 413100, -799584, 25110, 316502, 465958, 100269, -239278, -891922, -517099, -650156, -448350, -35261, -501880};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques918(){
        Integer[] array = {459928, -11932, 577312, 469311, 256996, -697682, -713234, 966292, 505514, -695584, -700683, -576354, 482489, -957657, -22115, 471118, 441218, -985436, 191741, 904490, -9913, -659087, -468636, 602356, -461107, 391378, -815033, 447925, -888884, 136695, -663056, -415600, 746398, 262345, -332988, -593428, 199857, -816410, -897811, -61921, -751760, -858092, 106322, 393364, -463613, -151243, -726017, -221524, -735303, 511729, -647319, -301671, 601498, -871862, -519279, -664059, 496315, -471001, -729402, -189460, 214280, -476123, 917891, 236351, 971922, 220571, 725698, 32296, -414142, 802908, -576320, 867027, 673235, -14863, 922073, 538428, -756622, 356390, 54456, -259070, 71319, -86279, -103589, 779570, 617312, -727839, 996774, 316553, -970947, -993963, 924663, -307361, -90172, 247082, -685737, 65599, -367379, -59223, 678330, -812040};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques919(){
        Integer[] array = {992217, 270240, -993377, -422614, 986442, -939344, 818945, -24562, 779425, -294689, -370853, 613386, -423602, -706677, -846276, -9640, -233841, 267097, -252221, 217050, -156573, 881807, -843682, -927080, 410, -233229, -754700, 887747, -178608, 229249, 868892, 531176, 719289, 224664, 518171, 909511, 446984, -623585, -148715, 859724, -794469, -126923, -994277, -456492, -662510, -139562, -900260, 356081, 847013, 814620, -231065, 340624, -200303, 616014, -586549, -17138, -555388, -371699, 535685, -11342, 482902, 68415, 527387, 696007, -425673, -639749, 977305, 344940, -325663, -621990, 7963, -28868, 710411, 905207, 599821, -899796, 492738, -985706, 301404, -829238, 586138, 145714, 493192, -306246, 456945, -1354, 329363, 847420, 896645, 472787, 629286, -185201, -388585, -489214, 316492, -165250, -178388, 161579, -93411, 664468};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques920(){
        Integer[] array = {-974539, 191362, 989276, 283810, 926002, 82759, 989086, 365806, -778643, 318947, -364144, -499560, -13995, -299780, -837527, -352842, -505657, 894588, 925678, 106701, -19943, 366692, -157742, -615798, 186069, 362129, -754684, 563024, 268373, -311661, -13305, 715096, 553999, -707452, -456946, 688206, 89109, 503868, 169771, -750245, -575768, 931550, -85798, -322727, 105302, 472444, 388376, 255613, 531958, 564815, 905770, -173485, -632061, -70547, -9434, 541003, 87379, -463020, -925441, 433502, 830001, -329687, 798044, -44563, 286517, -496129, -591619, 768289, 798727, -824651, -683584, 413122, -362629, 986536, 656829, 814424, 697815, 230502, -968839, 631958, 530090, -915313, -275976, -361321, -160925, 520725, 146276, -417308, 134964, -206133, 675887, 692668, 363809, 37701, 700270, 648049, -777670, 304540, -252139, -229651};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques921(){
        Integer[] array = {778225, 207258, -778514, 202005, -200127, 148159, 606948, -193164, 257014, -161638, 32271, 279962, 124648, -470623, -713241, -907162, -914969, 284376, -697532, 618755, 653947, 364834, -885118, -357405, -905544, -216989, -254016, 762934, -272364, 408735, 591788, -529201, -288770, -110017, 489712, 739274, -80789, 856037, 637393, -620382, 610241, 678246, -446616, 171476, 392413, 787625, 672731, 109207, 135989, -661000, 357111, 8723, 596647, 127742, 478778, -203485, 831916, 391058, 705732, -916435, -67013, 3359, 18929, 416490, -901173, 484920, 667702, -600829, 450809, 535822, 32078, 128131, -670381, -82465, -577773, 475159, 470458, 685827, -416921, -844338, 828176, -962349, 35514, -894373, -782829, -517056, 622938, 416943, -543370, -444487, 122673, 53494, -501596, 725002, 974886, 869602, 575892, 204995, 699218, -316650};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques922(){
        Integer[] array = {-775419, 377873, -953365, -862669, -906076, -61394, -654642, 545406, 290665, 749959, 124434, 551668, -565935, -992264, 394197, -938853, -74658, -620270, -608132, 256288, -969908, -486945, -162420, -618036, 238685, 283662, 211442, 667638, -44459, -860777, 520965, -76963, 978116, 18796, 171279, 761850, 41961, 798046, 329928, 341676, -342871, -508101, 651856, 904611, -349740, 135875, -82133, -968275, -551449, -150979, -173744, 920816, 285337, 923809, 514061, 607089, 734724, 723931, 427383, -113477, -86608, -176278, 67744, -76248, -344451, -826097, -330049, -427223, 911719, -589813, -855174, -768248, 77656, 435252, -934558, 548413, 821136, 249726, 250931, 604342, 250014, -88184, -226660, -193512, -323956, -769373, -430668, -516609, -639265, -17579, -376330, -861963, -431183, 138852, 793957, 58404, 865266, -710178, -881874, -449711};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques923(){
        Integer[] array = {-311708, 446930, -149362, 283099, -452536, -915212, -516551, 743274, -4162, 544956, -874256, 484409, -363912, -401517, 776977, 54232, 479834, 43550, 532469, -567893, -127685, 762562, -814354, 688307, 294785, 902578, 176001, -466746, -250944, -810920, -549545, -879055, -671904, 896105, -677970, 227305, 298431, -392931, -987595, 111141, 795884, 961365, 110381, 29450, 300784, -553049, 624866, -33734, -304526, 614206, 389449, 174666, -412781, -606741, 164650, 331051, -344962, 375520, -750616, -635566, -27714, 63273, -309242, -983636, -205928, -304910, 425632, -449236, -812593, -548794, 395118, -230736, -902065, -211642, -238536, 795139, -253229, -438466, 760181, -823317, 222974, 232893, 158574, 965723, 934162, -721653, 535880, -391905, 859640, 968215, -122853, -565931, 827025, -58007, 798619, 472368, 765893, 270646, -735966, -374710};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques924(){
        Integer[] array = {140175, 63262, 227797, 281885, -503343, 207591, 706828, 672498, -253795, -527785, 724137, 684441, -262822, -363683, -700732, -780977, -829382, 624798, -387507, 47142, 101502, -156020, 14887, 797496, -236469, 642033, -161304, 929702, -794861, 613845, -533689, 406636, 263725, -629986, -186113, 100047, 997287, -716171, 732630, -241651, 566880, 218706, -831775, -122250, -242468, 283865, 399051, -553057, 634106, -565954, -721498, -277766, -330454, -447243, 877030, -148684, -596687, -550438, -457698, -557179, -855169, -628746, -269554, 514241, -363813, 56749, -831868, -933539, 504132, -692096, 456965, 250618, 193801, 899032, -803583, -10241, -586800, 10445, 212004, -164069, 427338, 851832, -521535, 355194, -793107, -925520, 550273, -122317, 447216, -468793, -378611, -851109, 713657, 442388, 390745, 860267, 449447, 165944, 502239, 692533};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques925(){
        Integer[] array = {893393, -51320, -182891, -399025, 970565, -971200, -753327, 23854, -999940, -2266, -978217, 597417, -242426, -175908, -930689, 59159, 122813, -897359, 494438, -410398, 60364, -217343, 201640, 620262, 646034, -151861, 224822, 222150, 363162, -503783, 33068, -830611, 325891, 289468, -180270, -376063, 239106, -420035, -993019, 693218, 724732, -470890, -666072, 824022, 579128, 89347, -689549, 814643, -5722, 261414, -362210, 979841, -112544, 148654, -134228, -388655, 345203, -516703, -498512, 779865, 510776, -791454, -126610, 389133, -591725, -398792, 210469, 423876, 569558, 157440, 238096, -19532, -800851, 877654, -505408, 252344, 706309, 334619, -257989, 636385, -26504, -839960, -492251, 260772, -143504, -91623, -924406, 55942, -282009, 881238, 245604, 573826, -168102, 90128, -696647, -636935, 217593, 784930, -342320, 732105};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques926(){
        Integer[] array = {-426675, 537502, 685791, 712579, -671181, 486286, -257898, -689124, 495836, 932145, -926590, 700476, 678692, -180202, -122587, -669819, -528885, -345788, -371879, -292184, 994815, -339060, -622711, -894595, -811153, 363071, 368057, 949558, 750953, -847113, 308343, 923458, -637986, 617145, -320791, 795960, -858733, 120454, -314030, 336941, -1369, 994899, 558327, 408950, -196920, -361700, -360423, 389335, 790794, -724827, 460599, 810731, 219700, 254588, -519822, 942685, 130875, -428289, -349195, 887090, 783788, -192388, 468428, -552225, -972192, 74331, 980803, 77538, 878071, -357058, -750102, -723743, -577327, -525054, 171103, -119716, 478732, -966548, 520243, 894850, 495941, 328471, -323067, 194463, 699673, -498375, 917017, -532230, -255224, 844230, -322107, 531280, 381167, 426266, -23475, -919203, -459807, -50380, 10062, 773837};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques927(){
        Integer[] array = {835590, -743697, -598770, -812118, 88806, -695006, -420171, -563735, 684755, 364088, -876839, 180820, 566985, 593719, -726010, 290195, -587526, -980472, 256825, 541914, -979433, 988776, 184163, 918873, -758967, 70193, 415226, -651030, 152171, -848133, -715152, 473325, 300464, 865416, 733923, 735653, 205249, 359175, -214741, -166609, -193745, 471281, 775456, 420455, 284653, -151547, 580821, 677659, 422698, -521020, 505205, -401163, -930290, -424875, 532767, -41211, 527377, 284647, 861175, -605424, -791384, 223862, -5975, -499814, 711532, 456104, 540285, 537189, -762918, -842975, 47408, -996768, 94246, 788998, -349099, -587764, 849487, -702821, -364092, -358469, -487438, 844570, -47772, -937367, -217540, -530295, -900259, 742445, -633460, 299186, -110682, 208745, 705430, 200912, -518239, -705106, 397191, -974302, 543119, -45739};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques928(){
        Integer[] array = {-609447, -17140, -423135, 114582, -620147, -72515, -280228, 124524, -858600, -953858, -694239, -703726, -211084, 668570, -998367, 330354, 83408, -273242, 333994, -97481, 586457, 44140, 533580, 901680, 655383, 655690, -235251, 665139, 683715, 767140, 971776, 543645, -638949, -975291, -838894, -76734, 994414, 207211, -106523, -516502, 912727, -376037, 792929, -70239, -505381, -250825, -183572, -774536, 980271, 542816, -243179, 142307, 334616, -812545, 386121, -541474, 732763, -183625, 274502, -408509, -348957, -575145, -999570, -355088, -624520, 196469, 474837, 837182, 568306, -308771, -403537, 37455, -650980, -183236, -151811, -972928, 719701, -433549, 713619, 142883, -608281, -697890, 3927, -418395, 45379, 921395, 161755, -426100, -52423, -55674, 928805, 482078, -791906, -181078, 508679, -288434, -976093, -456368, 331887, 361493};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques929(){
        Integer[] array = {-957561, 679686, -60361, -971022, 457703, 86212, 946862, -95419, 935719, -310092, -684467, 46604, -144075, 193836, 438173, 171979, 545440, 565352, 287177, 62705, -100868, 179791, -4020, -767069, 764858, 277106, -551658, -320769, -348515, 881217, -635065, 939806, 700762, -342570, 872730, -31468, 995261, 870262, 876907, -100505, -296580, 90523, 342219, 431359, -135291, 147079, -341264, -53704, -769214, -607654, 912663, 221054, 419419, 288177, -940287, 874093, 522182, -309689, -413220, -947849, 279931, -959419, 813399, -147518, -280879, -33517, 992526, 642116, -742879, 556919, -457323, 607281, -603390, -80415, 751239, -518196, 626533, -251151, 163210, 188113, 375952, -643007, 62639, -60470, 451684, 663703, 41466, 46864, 975452, -528763, 946399, -812258, -647058, 259554, -450063, 755338, -651454, -637478, -651431, -847593};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques930(){
        Integer[] array = {484265, 807376, 660287, -479909, 976752, -97383, -173337, -203476, 460377, -14286, -336046, 649142, -932300, -737756, -108327, -99326, 190719, 878514, 28075, -14167, 546482, 506787, 884409, 36108, 711863, -181402, -907810, 951447, 98253, 573295, 238516, 243399, 587743, 120537, 151067, 422351, 368783, 394147, 91503, -778031, -217447, -798063, -799819, -849911, -927003, -736295, -789420, -843909, -288768, 429620, 694205, -251045, -902058, -372407, -621860, 718662, 780850, -681757, -731311, 805057, -178490, -429435, 595402, 342149, 77421, -157634, -455535, 692523, 612592, 772510, -892025, 743618, 873496, -858217, 873433, -905532, -398494, 166973, -801045, 149738, 377738, 543238, -260838, 211057, -1382, -847520, -398190, 834688, -102403, -637453, 690298, 919591, -686326, -562621, 162045, 105444, -214832, -87145, -474865, -260790};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques931(){
        Integer[] array = {-709539, 635533, -23923, 874206, 204895, -617687, -134120, -169468, 410216, -357228, -862300, 12828, 510784, -48495, 967434, 116950, -541650, 630921, -729591, -106872, 341487, -813133, -612091, 739718, 709190, 370653, 447681, 622981, 26877, -768539, 239549, 20258, -851093, -114734, -453596, -223197, 888206, 690480, -552739, 799032, -921213, -963275, -483196, -8125, -115054, 761978, 582318, 393517, 219731, 912865, -362070, -84589, -745041, -455615, 969774, 808293, 33274, -375865, -449663, 578301, -30085, -911787, -622627, 628287, -551524, -733968, -283918, 443610, 40504, 904007, 312949, -443741, 681234, 567558, -512810, -427834, 925663, 92365, -320074, -239233, -774445, -395406, -251954, -216510, 39034, 930216, 988488, 196155, -923121, 27927, 361958, -144486, -700083, -901303, -469534, 501537, 464496, -97414, 730339, 758587};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques932(){
        Integer[] array = {428682, -246548, 428006, -702512, 872664, -126118, -260381, 306142, -701517, -274101, -665596, 960366, 160867, 6093, 550995, -297543, -701553, 280774, -987718, 441726, -161822, -320550, -384738, -434627, 386990, 164604, -836080, 160701, -138552, -850329, 23008, -110502, -115386, 435230, -581464, 359605, 848860, -177339, -818871, -23486, -887912, -419908, -700138, -166431, 857619, -318136, -361692, 922687, 477998, 494811, 644810, -794306, -634023, -712383, -710375, 876156, -45839, 35401, 435301, 47951, -247133, 665269, 559495, 680423, -82767, 403388, -451994, -425587, -234633, 97280, -799352, -339755, 817615, 130350, 316809, 433189, -832158, -311458, 161423, -575074, 706666, -866098, -592833, 449553, -447002, -786286, 807165, -930725, 871328, -373823, 144491, -54149, 48173, 721737, 391756, 828459, -640016, 206928, -144886, 886108};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques933(){
        Integer[] array = {636881, 210188, -999236, 135232, 137434, 989040, -654263, -929770, -88327, 848666, -991269, 82256, -194753, -923914, -189213, -275440, -537817, 227070, -114735, 245115, -452176, 676815, -872639, -752734, -806289, 927957, 980656, 155579, 537094, 323271, 236843, 439446, 100026, 625991, 212287, 919341, -691012, 539285, -119994, 940745, 701890, -854174, 436013, 372476, -291275, -865001, -458154, 429644, 576458, 703266, 815086, -791432, -76483, 130696, 149325, -420406, -732312, 753170, -963717, -576258, 771440, -206961, -675919, 272744, 79940, 567159, 460516, 982589, 273838, -261816, 734632, -566910, 840084, -263846, 852205, -527049, -894850, -408842, -125669, -3283, -874243, -666020, -776547, -916191, -785860, -907199, 552114, 644987, -658409, -451854, -560675, -754285, 909347, -7952, 393419, 966164, 844116, -151253, -808904, -878080};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques934(){
        Integer[] array = {225224, -533159, 97759, -57763, -567316, 406697, -718799, 244083, -620155, -517812, -717315, -432130, 329154, -879975, 897298, -220311, 116552, -364387, -935193, 299795, -300989, 828293, 135489, -14598, -954673, 922762, -210929, 167990, -200589, 901233, -44054, -768162, -66455, 372845, 381352, 806919, -594766, -578695, 797143, -755316, 601430, 558262, 244687, -909369, 914520, 856256, -225502, -269704, 391327, 82785, 432431, 304280, -40495, -590582, -966409, 266258, 163203, 17280, 27961, -627719, -553618, -320426, 982445, 557702, 130802, 415371, 186083, -717451, 370712, 501934, -652640, -343925, -898819, 744910, -996651, -783693, -388946, -223826, -395571, -689080, -544671, -98643, 567930, 468680, -36507, -190649, 206631, -915388, -108230, 250790, 31353, 86257, 440566, 540131, 901846, 919593, 531587, 110407, 524774, -592558};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques935(){
        Integer[] array = {454240, 940628, -4956, -434876, 709035, -903981, -53032, 233311, -150520, -217175, -834796, -433302, -957521, 70616, 86414, -45228, -9565, -163702, -70294, 99573, -171562, -210870, 531164, 175492, -496377, -809063, 6613, -871001, 309677, 73855, 845016, 432351, -597639, -147676, 956403, 968718, -713310, -382172, 7986, 329181, -710696, 650500, -589761, 274245, -151103, 519725, -707210, -255184, 29336, -944114, 241220, -92417, -720640, 131165, 702710, -158059, -296658, 920090, -68827, 371776, -412317, 424422, 360947, 924880, 871557, 819363, 739521, -146252, -212507, 254740, 337842, 123572, 797645, -348515, 58706, -616335, 870149, -68164, 18271, -205742, 757326, -649405, 151709, -128744, -208422, 754146, -116464, 9625, -194440, 244235, 629071, -719686, -822697, 980801, 645543, 678749, -277121, 869598, -160542, 104213};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques936(){
        Integer[] array = {13682, 411423, -530716, 18705, -41826, 759047, 415573, 263392, -900521, 179441, 149527, 519822, -992241, 891189, 534662, -685555, -387178, 524475, -801252, -989314, -266391, -532186, -788259, -933911, -34318, -928869, -462491, 384039, -460635, -148093, -148416, -241728, 73101, -906870, -164500, -252397, -113570, -675680, 909736, 971471, -966770, 342706, 786983, 396035, 31907, 558389, 329718, -94789, -447338, 637637, 803423, 639905, -594532, 597516, -955150, -656134, 745138, -601439, 220664, 177475, -699631, 174426, 153370, -161311, 977452, 337485, 288821, 823247, -357841, -911063, -162850, 602094, 800215, -346392, 945546, -890685, -476134, -814281, -673562, 602394, 616288, -833306, -601654, -178195, -21385, -778878, 760206, -595338, 316007, -523121, 731615, 664312, 549410, -3679, -135921, -182295, -506568, 293706, -358257, -345745};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques937(){
        Integer[] array = {-617520, -972496, 525633, 855422, -619994, -721479, 537752, -822979, -307146, -559310, 498812, -934559, -375791, 26456, 549106, -599685, 12251, -678985, 638579, -329075, 567416, -546476, -937422, -203733, 114279, 318752, 352564, 536757, -257563, 582112, 463314, 155812, -598634, -282206, 773321, 534966, 990910, 764776, 315953, 653788, 618830, -325892, 981646, 390259, 574558, 675282, -454495, 169765, 431021, 717449, -679637, 792580, 864403, 324531, 389079, 967239, -968270, 503013, 669345, 970680, 715705, -383396, 618524, 762813, -682893, 221777, -818817, -634565, -224272, 101519, 144583, 344220, -132211, 258394, 857381, -678322, -80383, 647724, 539759, 955609, -181194, 97635, -821810, 428418, -46645, -174669, 714919, 521773, -253453, -92523, 898920, -798849, 898396, -420689, -307893, -506039, 825908, 509779, -654532, 154246};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques938(){
        Integer[] array = {-869900, -958381, 471290, 152942, -433018, 102841, 746326, -836182, 239593, 245768, 763610, -689058, -581021, 682650, 660541, 740985, -369220, 797379, 819975, -922991, -163161, -434002, 808999, 131571, -758615, 464425, -695790, -145967, -278139, -599780, -190452, -602877, -458612, -902212, 334750, 339117, -63688, -694368, 708823, -448422, 473334, 966421, -964808, -900752, 307346, -729360, 345665, -335703, 852930, 842582, -730783, -379524, 760519, 548417, 942781, 752906, 443199, -790492, 47349, -468218, 683286, 57016, -241223, 14017, -409930, -266802, 206440, 789974, -209663, 270070, -934709, 857408, 366366, 37374, -241745, 737686, -355444, -821252, -29839, 996361, -622645, -866478, 973889, 969264, 681728, 655026, 116600, -256843, 637896, -675886, 438182, 39890, 233635, 424058, -757048, -182239, 773881, 639487, 797706, 250369};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques939(){
        Integer[] array = {621276, 143762, -73332, -661356, -348476, 28099, 355266, -967284, -762105, 149514, -111198, 11847, -859434, 207009, -749476, -358561, -183164, 461076, -212696, 347312, 384744, 490742, -940319, -246147, -549679, -487701, -217316, 873698, -366852, -638019, -978699, -618590, -492076, -663758, -312687, 280006, 41868, 542452, 243599, 951373, -625935, 734929, -261656, -113899, -427632, 968719, 694081, 346938, -377043, -321841, -781122, -412477, -60223, -850688, 285719, -326087, 122269, -626031, 97376, -528556, -910327, 122383, -10775, 440208, 669725, 39095, -352302, -425879, 96785, 834614, 921338, 709274, -934919, 681144, -937826, 942458, -158647, 610203, -149142, 180661, 93587, -12188, 710886, -137634, -38273, 832096, -948262, 145886, 619320, 694569, 746491, -731319, -70159, 380054, -310916, -911425, 549896, -750975, -371639, 164630};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques940(){
        Integer[] array = {-610853, 363904, 142625, -900678, 910143, 369381, 505806, 424392, 567639, 650831, 963742, 969039, -560906, 421753, -310870, -1278, -961301, 594004, 707531, 435025, -779051, -421592, 762195, -341394, 532487, -840256, 151700, -655578, 227372, -545119, 538662, -252224, 662539, 596699, -586309, -87098, -780363, 314531, 201934, 117479, 480407, -121034, 801180, -350306, 825128, -393910, -184692, -189837, -376043, -168510, 352554, -272636, 955710, 633839, -165116, 410674, -888678, -521226, 204610, -759434, -951375, -421165, -139506, 708802, -224732, 630658, -418507, 225989, 652275, 858455, -798513, -153804, 55111, -481104, 742377, 592190, -946450, 581208, 19318, 361283, -30361, -64990, 677068, 297014, 258382, -904089, 462764, 548667, 559425, -869910, 560715, -382500, 252402, 54787, -816136, 524952, -164946, -885511, 293433, -95068};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques941(){
        Integer[] array = {-891241, 652700, 485281, 419855, -880577, -356738, -195482, 449449, -985238, 853883, 593292, -658660, 799237, 878436, 461583, 165434, -134118, 909957, -435525, -50584, 470771, 371897, -733767, 389471, -406060, 128353, 370766, 113358, -586061, -46263, 178942, 960572, -91673, -325588, -984386, 998207, -658, -880784, -185894, -553814, 911884, -630703, -973858, 999020, 958618, 351808, 721000, -234576, 13530, 854015, -659616, -972342, -195250, 344985, 834868, -15197, 460055, 852358, -657797, -451025, 910663, -773039, -321833, -991728, 392405, -292547, -366916, -270536, 348186, 573946, 19948, -309049, -591129, -768425, -425689, -988616, -418257, 655633, 249132, -484373, -326148, 531037, -121406, 992690, 861578, 398637, -717061, 654711, -948238, 375292, 445476, -454277, 9436, -289699, -806582, 628244, 259543, 176028, -105387, -639518};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques942(){
        Integer[] array = {-320650, 911338, 570399, 241678, -792922, 331958, 327326, -967287, 289299, -367623, 167694, 295318, -174592, -39976, 995799, -278015, -414332, -586681, -48086, -796255, 816762, -710246, 754132, -929076, 317219, -954427, 742425, -703005, 359859, -282359, -108938, -24427, -934602, 205034, 131613, -307197, -219100, -476563, -443760, 762314, -674274, -591212, -972352, 546852, 579108, 81732, 367971, 997734, 803826, 251927, -823407, -757607, -458721, 144641, -58724, 10457, -680248, -406932, 767287, 433686, 527966, 112997, 316421, -377266, 526953, 782426, -745113, -746824, -521224, -614, 324737, 953582, -316961, -591602, 751181, -193352, 448411, -386354, -757030, 249186, -435095, 20631, 974577, -467358, -712471, 854557, -157653, -281502, -839651, -553937, -470666, -192149, 15267, 113353, -535754, 237691, 465719, -965464, -741839, 826338};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques943(){
        Integer[] array = {403745, -442494, 283900, 367954, 154202, 241531, -41835, 585969, -359969, 816580, 828173, 910965, -681771, 588097, 704210, -569763, -882019, 219710, 292056, -276400, -42157, 849237, 588469, 635958, -229009, -634697, 158069, 56708, 802339, 15388, -795183, -428580, 747574, 781716, 191637, -317289, 755407, 509228, -757711, -262222, 921680, 410719, 969980, 290257, 802201, 503428, -438847, -142999, 60429, -26330, -5253, 100293, -738591, -864092, 108739, 730875, -238522, -523182, -999491, 304693, -922672, 282045, -376257, 830125, -534724, 342391, 668603, -596156, -25096, 281470, -387404, 10589, -769001, 888338, 427933, -7238, 466451, -477687, 254624, -310962, -219601, -418320, -430152, -43124, -271522, -560022, -440601, 83913, 826672, -680406, 974798, -236958, 723935, 744635, -2007, -99179, -955809, 473903, -836619, -591101};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques944(){
        Integer[] array = {-829708, -275694, 467341, -26267, -464111, 190158, 970699, 21322, 145433, 651401, 62384, 390491, -630027, 819683, -840405, 126898, 94068, 176205, 864940, -988811, 304265, -861832, 405243, 389807, 314497, -216345, 227134, 328344, -162904, 362126, 537101, -939669, -263229, 356371, 496390, 256232, -229207, -547405, 425173, -639761, 846639, 738523, -52829, -17068, 968079, -732760, -155397, -543024, -288844, 991583, -723452, 601179, 704039, 306448, 604052, 691479, 134932, 500564, 746929, 360090, -540750, 726690, -989769, -421038, 1805, 411653, 635392, -622418, -82105, -847327, -505724, 814962, 293190, -612438, -904934, -961433, 891173, -69151, 796163, 716799, -919091, -873418, 196917, -487182, 242184, 729299, 475207, -753206, 19950, -366895, -837425, -320813, -898564, 232072, 244218, 425175, -780119, 834844, 482903, 813513};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques945(){
        Integer[] array = {-527404, 276587, -869253, 332672, 599900, -995489, -752167, -66130, -370644, 473954, -402142, 418057, 934864, -590925, 306870, -574124, -143567, 846343, -400476, 173381, 257674, 400528, -592616, 140905, -234185, 516103, 190963, 850800, 116494, -684566, 389049, -943311, 257404, -968128, 50228, 383616, 916276, 960924, -73039, 143494, 497828, 877535, 162656, -441677, 513123, 629639, -455284, -914129, 388430, 782113, -667724, -303993, 232979, -775144, 727178, -912016, 800831, 474197, -218480, 968618, -705246, -95529, 435726, 692522, -10992, -926839, -370414, 378488, -84171, -745897, 353986, -21433, 260198, -52918, -508980, 926672, 436300, -326659, 23160, -234937, -453665, 428309, 519156, 54260, 826729, 371340, 734325, -732987, -510876, -552486, 818442, -389566, -108021, -947725, -533076, -896982, 267979, -671701, -819521, -147225};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques946(){
        Integer[] array = {94944, -262590, -559150, 736684, 471498, 15101, -848269, -57575, 215544, 381658, 731291, -441124, -601618, 820676, -617299, -733508, 636930, 86453, 859939, 510095, 153846, -330450, -712241, -544852, -521142, -691733, 319588, 699268, -271810, -243838, -623967, 984334, 536901, 757606, -97241, -381348, 332158, 19124, 974101, 787420, -175425, -72886, -696666, -233350, 350493, 930366, 720625, -919063, 254106, 578499, -79538, -819138, 698505, 132269, 19475, -64636, 921676, -516921, -235278, 625124, -999400, 806515, 739244, 878004, 272394, 286214, 977833, -792803, 929489, -46726, -174078, -560981, 852138, -537400, 343464, 853179, -403822, 698216, -71090, 637736, -235792, -864471, -527314, -869224, 809755, 158038, 366894, -998323, 339102, 270913, -760639, 42256, 612080, 788696, 627829, -894038, -433619, -278145, 189669, -87898};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques947(){
        Integer[] array = {-949992, 179334, 237118, 501599, -420243, 937048, -661120, 478506, 328077, -835565, 221448, 531685, -521418, -728517, 989070, -815994, -338416, 366485, -546241, 238855, 854038, 467546, -559650, 170291, 484630, 325306, -267353, 457975, -258788, -782166, 477491, -667707, 502159, -207039, 455856, -652198, 360013, -970616, -169504, 137442, 578333, 548063, -221426, 795955, 627981, -967876, -320657, -371085, -508532, -830567, -458620, 293907, -258867, 546442, 316797, -185250, 43303, -817994, -305851, 832104, -734799, -306314, 123563, 150988, 979856, 214614, 833171, -537557, 523287, 842287, 146965, 474647, -648619, -964815, -854196, -76547, -369040, -703929, 9663, -153134, 203694, 771466, -132827, 318819, 274830, 250098, 66493, -80177, -610927, 601012, 436123, 174360, -348838, 568545, -952009, 930238, 624204, 543691, -842440, 352803};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques948(){
        Integer[] array = {-324090, -651127, 259858, -79009, 804007, -109876, -536433, 637989, -174494, -370435, 42815, -652927, 410045, -575823, -241836, -914781, -649373, 804011, 889953, -188237, 214161, 936628, -526428, -424366, 198512, 247232, 487468, 25602, 226888, 720401, 184384, -98869, -286032, -421524, 462607, 722538, 669589, -305070, -231664, 276588, 969659, -702181, -319017, -793584, -175788, 32038, 179251, -949827, 261850, -951217, 301482, 550476, 512146, 288670, 679577, -260397, 509159, -802601, -716656, -803631, 329589, 75866, -24977, -998197, 42894, -115580, -250871, 333843, 641283, -293256, 942038, 124894, 264848, -215859, -150181, -552002, 363103, -144033, -712500, -807994, -276975, -718075, -394619, -218799, -76164, -64157, 791137, -89001, -631503, -235844, -313992, 350043, -160932, 290045, -772890, -852577, 935846, 116663, 547162, 761719};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques949(){
        Integer[] array = {483159, -543362, -732013, -530738, -354567, -852556, 501088, -644723, -135652, 718697, -476987, 892608, -677287, -960320, -58134, 715839, 453543, -958710, 635591, -700067, -293854, -601376, -995307, 380528, -445833, 233727, -712968, 187723, 217405, -248282, -542881, -549085, -396850, -955478, 919357, -980347, -488143, -61468, -588426, 546942, -241311, 515262, -976366, 381811, 32946, 397331, -689312, -227116, -590512, 289620, -850041, -154437, 669034, -942918, 172536, 294768, 914746, -199994, 945422, -701348, 557977, -926305, 484190, -749218, -532591, -43234, -144530, -418574, -233017, -693365, -567981, -480310, 304647, -595364, 100081, -942636, 405402, -990627, -414912, -516234, -272684, -638897, -24769, -374111, 757737, 315473, 439799, 296327, 659046, 696216, -306078, -212651, 580367, 919467, 568448, -966335, 8414, 559482, 223719, 163799};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques950(){
        Integer[] array = {537145, 97588, 379330, 542441, 311103, 987321, -230709, 278422, -580604, 613377, -413041, 471021, -262261, 247829, 155229, -989969, -15349, 429308, 212419, 31868, -249520, 357999, 664922, 235148, -382960, -585941, 55620, 961263, -274824, -510181, 833181, 515028, 409318, 358833, 886164, -593305, -824764, 418300, 899672, -595035, -507262, -913137, -683591, 434365, -677155, -287549, 342200, 624152, -867811, 803046, -850602, 729300, -75422, 537686, 190631, 777801, -80192, -290551, -92113, -275325, 78000, -755240, 793964, -394730, -258764, -212163, -359680, 903827, 879320, 850376, -729867, 612294, 754258, -528435, 380756, -841870, -541687, 32435, 128069, -235348, -6073, -422128, 378881, 181626, 998308, -961456, 909949, -86491, -138931, 119475, -13417, -554099, 96655, 761887, 353749, -677414, -466262, 572409, 466023, 23933};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques951(){
        Integer[] array = {192074, -727633, -670757, -164463, 806527, 245732, -313448, 785338, -755406, -165889, 302055, -387090, 252098, 210711, -164701, -462363, 93298, -601419, -368198, -40890, -708207, -311447, 791776, -326230, -112503, 170514, 384250, -311429, 761154, 228160, 191995, -815793, -254, 582747, -225289, 76928, -74854, -345628, -388290, 624332, 411074, -673223, 292818, 192816, -196508, -142911, 686407, 202224, -697982, -887719, 917214, 323051, -961123, -186334, 598834, -781132, -873377, 24227, 835277, 685857, 13207, 754118, -826532, -818217, 681650, 538787, -741551, -938199, -863822, 272710, -433131, 396670, -200154, -666659, 752888, -449891, -7900, -852324, -452457, -932926, 588638, -782694, -489725, -387655, 657205, 389107, -503290, -938838, 843062, 860801, -125145, 766253, 638450, 678227, 16745, 358379, 684133, -833766, 781833, -910112};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques952(){
        Integer[] array = {246944, 415180, 561893, 817998, -755340, -292540, 893835, -173455, 245062, 901733, -221008, 401046, -593520, -38540, 816577, 740524, 161782, -137311, 743740, -58980, -787448, 345315, 938698, 662822, 690799, -874843, -398962, -898982, 946432, -667981, 240235, -817969, -939420, -938070, 55610, 102248, 559124, 300774, -448746, -200616, 111604, 299322, 281325, -101981, -839558, 308953, -578964, -106436, -275572, 647471, -735704, -74069, -629336, -684126, -62909, -741527, 888577, -141608, 309436, -313501, 189220, -975961, -377912, 545722, -258890, 308529, -217755, 154625, 393496, -873790, -530235, 516548, -801438, 692660, 609963, 848693, -665440, 684169, 326432, 694429, 405696, -799470, -561407, 448381, -529260, -814229, 601085, -799324, 889321, 452523, 959264, 143924, 920028, 265317, -472953, -387717, 202918, -395957, 549957, 995259};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques953(){
        Integer[] array = {-563949, -310066, -161929, 943304, 377453, -209499, -869144, 183005, -617391, -322303, 54175, -258862, -323609, 271819, -106864, 176862, -859459, 104390, -105230, -775086, -293029, -572821, 442860, 89222, -380149, -583497, 749489, -105807, 672223, -622100, 594897, 164415, -152222, 351720, 863131, 498161, -766337, 704449, -483698, 826188, -447703, -846821, 41086, -621458, 69081, 686718, -858469, -596895, 87460, -32926, -233025, -490467, -900401, -727117, 226596, 663654, -645279, 581933, -279064, 330512, 745643, -277614, -545906, 205493, -870334, 95724, -42406, -93588, 252397, -771733, -213691, 16014, 963116, -788816, 846657, 507668, 134033, 15636, 748246, -595067, 250775, -287996, -180207, -167805, -831623, 5472, 658745, 705765, -55492, -791058, 657030, -707688, 92500, 415091, -514939, -935161, 248894, -522339, 410337, 402633};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques954(){
        Integer[] array = {-538065, 6072, -168552, -844780, -471993, 76254, 814173, 198499, 612600, 149462, 113208, -843835, -752400, 507463, 293272, -943208, -124445, 945016, -292234, -896348, 884340, 748243, 775223, 674725, -804962, -626573, 405284, 715963, -843850, 837445, -388330, -171205, -289292, -213098, -351800, 91474, -334705, 951693, -202785, -175626, 766199, -983828, -467376, -480957, -146147, -44568, -620894, 704470, -182204, -906724, 320345, -327707, 891316, -835220, -164774, -880644, -444273, 43960, -936413, -850507, -369683, -416629, -857850, -366133, -760820, -923478, -88124, 570342, -482583, -396593, -944165, 865148, 582457, -186629, 334429, 108746, 850113, 120718, 173650, 523326, -449577, 708678, 886517, -73593, -611780, -266708, 109749, 351526, 527071, -98664, 693832, 698952, -140342, -561932, -406669, -518443, 985243, -23561, -766137, -770724};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques955(){
        Integer[] array = {988032, -355891, -928684, 35520, 602784, -715120, -314478, -219667, 458251, -508571, -691475, 967474, 370591, -159219, 64689, -607261, 131601, 214693, -395178, 159475, 894237, 925854, -416776, -636136, 597004, -345353, 713988, -188293, 331289, -694556, -942465, -145687, -896982, 264927, 656870, -926617, -616623, -763087, -256600, -832417, 119759, 749173, 41384, -546099, -110526, -242751, -125440, -255233, 64062, 373829, -976072, -902033, -904425, 579361, 386872, 138396, 849375, 286528, -21303, -789061, 445488, 86311, 230756, 650069, -32304, -649834, 287090, 891529, -91562, 94988, 915975, -251016, -675469, -833350, 963311, -478084, -602692, -648453, -673125, 734438, -266218, -565074, -600291, 825662, 915084, -984039, -582198, 587412, 154154, -25023, 991467, 965356, 597464, 215495, -747537, 270357, -449571, 32967, 609709, 965617};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques956(){
        Integer[] array = {124746, 353322, -442593, 63983, -246059, 338706, -847165, 322067, 524331, 395269, 907240, -268352, -360517, -791220, 726150, -21599, 21205, 526315, 182644, -601487, -952315, 737482, 823908, -855187, -190274, -919002, 47577, 756623, -52142, -314363, 423963, 773820, 746233, -214217, 811236, -359451, 538560, -72175, 883255, 529307, -537610, -33424, 468107, -906947, -790995, 38441, -497697, 750917, 163175, -9961, 462324, -94644, -888154, -728250, 794348, 833139, 994187, -215459, 127399, -570537, 987892, -646522, 952427, 506273, 912643, -226055, -648965, 462583, 894779, 782988, -453970, 139595, -271347, -141807, -838887, -48929, -694055, 263620, -30002, 159829, 687163, -812554, -912585, 577621, -426384, 730929, -747113, 422020, 543492, 109507, 500212, 386808, -799972, -805322, 251852, -525428, 752110, -286933, -278648, -268840};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques957(){
        Integer[] array = {-111319, 485739, -479545, 967496, -667462, -727953, 618663, 670429, -371044, 341070, -248154, -359829, 506898, -689912, -668124, 775540, -446793, -829613, 308779, -280505, -118723, -5725, -974203, -115450, 214576, -173153, 572025, 121764, 149349, 179026, 142087, -808636, -606142, 135717, 200144, 245113, 896370, -999778, -826655, 332514, -935538, -366168, -114138, -917935, 287464, -22837, -501847, 185262, -929850, 942124, -356252, -692085, 617673, 583753, -188113, -14421, -180123, 327909, -541263, 297506, -668152, -665157, -618067, 452606, -976847, 255581, -990315, -722868, 768929, -190009, -920864, -327919, 297142, -733790, -353844, 923878, -259776, -868212, 978324, -784250, -158548, 954113, -982498, -527578, -778032, -789125, -230177, 310078, 522055, 282045, -476626, 449460, -557353, 439644, 878661, 770806, 23349, -531357, 960524, -795659};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques958(){
        Integer[] array = {-156451, 729633, 459473, 64606, 431352, 285522, -129673, 257340, -377163, -874154, -862091, -980141, 849723, 393186, 50677, -749640, 989282, 238349, -400584, 740354, 252189, 887695, -894472, -106981, 461691, 186895, 977327, 502597, 713120, 824738, -147958, -130125, -549326, 550294, 220175, -402973, 948106, 734887, -506029, -657981, -460176, -862441, 878191, -326968, -494411, -189800, 666460, 371519, -247841, -724036, 189463, 334999, -48199, 405507, -419077, 63479, -276423, -136362, -717027, 810919, -957325, 617023, 439945, -250084, 560178, -977167, -635887, -459070, 971985, 769985, 480737, -90602, -703510, 762323, 688902, -379422, -537415, 543439, 587635, 19245, -397937, -678602, 117233, 983243, 888108, -808476, -121126, -916267, 237881, -502933, -495743, 235284, 463079, 14425, -699351, -96480, 391842, -172970, -427498, 171187};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques959(){
        Integer[] array = {629866, -695784, 785260, -448138, 776507, -298785, -399097, -934658, -837279, 212946, 665835, -963288, 258402, -809492, 728240, -136627, -62613, -102115, -88815, 207733, -364313, -989987, 971002, -510717, 315897, -294419, -274240, -377856, -377073, -597257, 841920, 993431, 737744, 528345, -719097, -553967, 340609, -753228, -104312, -479009, 113225, 265873, -497196, -124866, -578704, 738883, -757593, 855729, 18522, 95260, 843944, -355344, -492251, 596903, 873407, 511872, 983911, -519586, -261075, 736747, 776138, 873721, 737200, 400585, -933142, -448422, 181730, 818668, 501801, 868015, 498077, -186307, 829002, 580938, -432209, -224594, -410116, 129893, -649495, 221392, -11197, -828417, -568582, -629333, -270050, 646788, 596915, 179466, 94105, 331358, -463007, -227955, -984545, -474154, 137500, 817805, 177015, -168190, 709474, -692027};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques960(){
        Integer[] array = {-850992, -39059, -277917, 798989, 214685, 199112, 280213, -128777, 58778, -952866, 874815, 106663, 38025, -625234, 363221, -872941, -834759, -396603, -973928, -80177, -393546, 202945, 331979, -813002, -767244, -191739, -518415, 701394, -715605, -524569, 799185, 578316, -704451, -385029, -447736, -136149, -997907, -442741, -733117, -298849, -840740, -777392, -88030, -874684, -614615, -201354, -541768, 375556, -803050, -428076, 925089, 540112, -548175, -469998, 479758, 500386, -335570, -463033, 950306, 177950, 222494, -648784, -306559, -562381, -46965, 457282, -509778, 785605, 334954, 828995, -651928, 249857, 427550, 862623, 783035, -822392, 291804, -77062, -67148, 777590, -835615, 501355, 266275, -527299, -525750, -777997, -758570, -612021, -377780, 69718, -25480, 24398, 799791, 177701, -750756, -772615, 560854, 20722, -751305, -700963};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques961(){
        Integer[] array = {-894593, 14701, -604310, -37278, -175424, -21433, -244929, -488962, -553897, 369066, -441797, 777848, -106841, 100994, -942422, 167755, -347778, 974871, 388730, 593826, 682656, 151777, 259881, 842362, -243581, 342386, -345823, -341652, -485940, 291710, -886067, -57242, 796223, -411881, -944186, -358259, 675204, -521866, -270879, -394652, 112448, 986240, -732520, 441440, 286610, -567120, 97888, -354059, 635452, 509940, -106912, 588608, -36816, 346317, 221062, 457652, 511182, -563748, 301884, 18827, -364064, -718670, 347108, -682365, 306253, 136690, -21018, 820420, 692524, 96388, -565023, 4376, -127070, 180033, 360874, 896271, -577889, -406158, 765758, -457986, -406049, 569307, 260804, -132583, 709257, -367526, 346730, -780610, 461942, 148958, -491690, -31805, -97121, 242543, 989245, -411936, 210616, 257815, -282267, 98607};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques962(){
        Integer[] array = {-42717, -342819, -983115, -881457, 693944, -310302, 666970, 771311, 632385, 757572, 385937, -907870, -641121, 748978, -250557, -909843, -684218, 443471, 235720, 883810, 411922, 695655, 931151, -59989, 828186, -343799, 593019, -43967, 24568, 79978, -852603, 766880, -358145, 602368, 728208, 680604, 149286, 610788, -739282, -739109, 981959, -640457, 116217, 323932, -129365, 382629, -995599, 862814, -852471, 841871, 826586, 224409, -885126, 953869, -821158, 494139, -881245, 445203, 126635, -521702, -17703, 804992, 949195, -947471, 214854, -163536, 936302, -32028, -446848, 511171, 220711, -78945, 529926, -562830, -173337, 443623, -223214, 29365, 855650, -562101, -888830, -774541, -856051, -617745, 736432, -917577, 879635, -604322, 859228, -549337, -524955, -254665, -418475, 438731, -134406, 290975, -968899, 306588, -359076, -618151};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques963(){
        Integer[] array = {-633999, 183779, 519325, -741003, 227227, -385791, 406780, 84766, 308997, 922770, -712565, -189057, 237586, -495207, 866961, 791013, 49271, 274030, 302280, 693476, 658279, -347777, 511424, 896998, 354104, 441161, -110518, -634237, 360339, -381494, 393188, 183566, 3665, -153447, 798234, 696368, 973127, -771865, -222629, 156391, -486180, -475557, 869506, 719423, -316887, -826472, 880662, -828617, -931045, -3317, -790429, -682459, -704763, 881928, -412945, -346283, -130202, -557775, -42066, 508952, -663106, 416668, 808601, -620719, 639814, 483878, -519923, 487878, 374483, -790748, -816728, -372740, -458293, 378499, 523934, 695692, -660340, -9986, -893775, 703553, -572512, -526229, 98250, 392573, 366731, 903786, 666306, 238630, 680342, -163099, -845906, -740530, -238588, -358095, -713705, -403228, 138274, 753286, -579872, 1095};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques964(){
        Integer[] array = {564818, 148961, 972996, 976521, -256290, -887532, 736463, -391600, 835312, -552376, 428057, 245127, -959465, 228032, -95129, -1036, 779025, 998212, 766008, -438631, 489129, 810400, -8468, 94932, -531214, 401203, -335065, 647873, 963190, -334659, 72757, -634188, 787816, 354129, -390045, 965398, 541837, 969283, -351946, 815320, 147582, 371261, -652453, -687099, 486866, -775350, -21885, -689228, 541235, -295503, 847319, 214358, 224126, -304820, -388831, -823270, 923105, -313113, -575195, 689497, -774835, -220816, -865187, 413216, 951130, 180386, 745624, -847797, -398544, -827557, -625456, -880525, -385816, 67364, 822545, -957231, -173301, -294321, 994416, 366162, 401213, 427100, 170277, 38980, -383335, 578406, -76312, -780844, -364952, 620676, 35682, 218259, 962556, -392991, 40579, 742057, -75653, 564820, 87510, 123916};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques965(){
        Integer[] array = {800136, 573533, 770904, 121692, -859926, 927888, 737410, -525985, -135932, 703661, -880961, 195641, 551387, -173429, -167100, 834316, -844475, 699787, -11644, 689893, 144427, 721980, -104483, -100637, -407636, 177618, -703610, 672578, 248090, 267640, -740499, 171609, -813006, 722925, -704665, -225271, 141836, -611426, -810635, -17080, -753671, 411787, -487347, -311080, -934351, 657954, -301224, 666680, -852843, -40318, 848667, -560180, 258509, 383561, 923955, -211313, 51057, 792621, 96060, -818151, -238418, -996299, -935298, 679521, -641534, 551591, 79416, 730746, 949404, -551205, -96402, -878454, -105672, 653153, 478814, -284787, -757190, 682413, 424981, -600498, 706944, -441207, -280563, -907756, 979256, -749477, 728470, -418261, 828304, 449146, -807926, -555757, -553193, 88712, 230710, -927924, -950006, -227036, -360751, -881733};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques966(){
        Integer[] array = {-756572, -531355, 247881, -723671, 910327, -87319, 939615, 550735, -409156, -447995, 995172, 872466, -422341, -41527, 629817, -339128, 738404, -520438, -410088, -731989, -562572, 140014, 809728, 697161, 241003, 110063, -662324, -504686, 896941, -887926, 842259, -358914, 903109, 703584, 396731, 882163, 581328, -496641, -710216, -941123, -946314, -86707, -44316, 76154, -639639, -445827, -948176, 393143, 355527, -975712, 993375, -998949, -458372, -871758, 119883, 905404, 413784, 786058, 813674, 391073, -461589, 419506, -506052, -454050, 917240, 24989, 361216, -685986, 335813, 795000, 443523, 910256, 301528, 249693, -163503, -779718, 774206, 459042, -473774, 181800, -840397, 126449, 667942, 805635, -269563, -552439, -86691, 38539, 188463, 908066, 129324, 146850, 77985, 435346, 204533, 700078, -605983, -88583, -276538, 116208};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques967(){
        Integer[] array = {602710, -573381, 523593, -445830, -318943, -304770, -624331, 347513, -530004, 400759, -297264, -843865, -745005, 735359, 417341, -258048, 31080, 189735, 651094, 868422, 511214, 124938, 651198, -330080, 265163, 495360, 702560, 900394, 700647, 479030, -227184, 44712, -909821, 758530, -251899, -920494, 288916, -105380, 376188, 867252, -512153, 592348, 229475, -81067, 449171, -408533, 92097, 371116, -425486, -538581, -356298, -97328, -650202, -796867, 942199, 335655, -412830, -504630, 932638, -351975, -759762, 505066, 801416, -781231, 265709, -807544, 631600, -163983, -107194, 191957, -317613, 792755, -853956, -483640, 762128, -468835, 194091, 534372, -787860, 930601, 267809, -299067, -439453, 32143, 590280, -131515, -680226, 128872, -688731, -536926, 36168, 179573, -982972, 33259, -953735, 600188, 864991, -106169, -262049, -616695};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques968(){
        Integer[] array = {125776, 274378, 389912, -53246, 267392, -258672, 645568, -364103, -14052, -369060, -120161, 117338, -832764, -5522, 751818, 651444, -911841, 538057, -248448, -848783, 340099, -913815, 358692, -193714, -238383, 412820, -959555, 47284, -909804, -516016, -312727, 490335, -625035, 13656, 600673, -973790, 382166, -378091, 231857, -649518, -93379, 999720, -961049, 531349, -350863, -714792, -443772, 1180, 832630, 761092, 781966, -343597, -26707, -635367, -216805, 160308, 759892, -884355, 541234, 447908, 706168, 754444, 609010, 725258, 607161, -947267, 975770, 747493, -862942, -350742, -319724, 47172, 541409, -841551, 94386, 54842, -238166, 275966, 386005, -720871, -370197, -715640, -106681, -772342, 650234, 58428, 325496, -216466, 870475, 806599, -804083, -832709, 549225, -155849, -224917, 187871, 60543, -562354, 862090, -221647};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques969(){
        Integer[] array = {-533255, 925964, 627046, -676342, -367328, -294329, 837373, -277901, 590371, -438081, 547788, 564832, 455922, 499016, -395437, -277914, 216401, -19063, 723416, 819501, -214202, 804194, -986497, -63812, 690156, -519416, 174220, -582085, -911024, 158296, -853674, -671019, -664480, 659438, -852994, 462880, 821201, 119685, -404730, -91667, 529560, -977806, 410386, 97924, 71244, -549017, 673866, -569882, -18316, 770313, 864173, -713345, -964624, 205736, 57137, 89961, -247833, -365416, 153516, 241312, 404070, -390047, -132778, -929557, 625219, 868307, 124058, 718564, 421081, 960251, 570685, 897081, 978542, 352532, -637788, -528641, -903511, 385973, -239622, 764635, 939121, -583005, 15273, 317795, 177062, 988632, -975780, 872630, 887871, -120679, 444006, -309703, 798185, 12237, 279503, 961892, 774107, 249931, 20520, 606785};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques970(){
        Integer[] array = {-646017, -56497, -169468, 38112, 836142, 691495, -779957, 695627, -138073, 817926, -377623, -229246, 173069, -602463, 903309, 20160, -841499, -90897, -824669, 274510, 519178, 360679, -637618, -287495, 286778, 826898, 262259, 893944, -156501, -601914, 232168, 829341, 895242, -781764, -739619, -152778, -678669, 769359, -287477, -473110, -396092, -958740, 434445, -886914, 965137, -777674, -206349, 616341, 962891, -530776, 271559, -78375, -460093, -723666, 367848, -858709, -476268, 857971, 919058, -269642, -855748, -404093, -83145, -519270, -584708, 230539, -679732, -240300, 408111, 789374, 357881, 841866, 969359, -598723, 278828, 565315, -281671, -210734, -23738, -324686, 69315, 36894, -6149, 211313, -326720, -761306, -426291, -496828, -210533, 329344, -52157, -681179, 558291, 878971, -384527, -680469, 345786, -646994, 350740, 277047};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques971(){
        Integer[] array = {-256402, -276829, -445170, 182713, -797523, 999064, 648505, -920814, 286185, 73661, 275581, -898900, 643545, 683340, 656594, 843462, -653088, 225784, -996538, 426806, 606654, -179161, -191989, -811050, 386281, 189912, -605540, 948521, 433503, 606970, -201686, 654399, 488421, -344907, 411584, -567714, -551199, 753040, 850023, 717938, -594220, 479439, -820125, -421283, 608907, 113685, 371127, 235665, -220400, 846620, 412129, -300448, -200602, 633124, 73451, 722546, -357740, 803788, 735081, 968326, 912765, 686880, 27213, 885486, -924025, -796158, 521675, 291496, 978655, -392342, -758797, 739324, 361708, -116452, 813207, 615018, -349559, 97274, -101374, 33696, -575733, 343107, 659288, -62350, 663698, 761102, -200983, -259543, 93987, -455842, 462911, 9435, -878492, 375968, -72059, 874289, 853055, 317872, 297583, -685828};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques972(){
        Integer[] array = {712276, 235471, -703174, -691984, 467771, 820372, 317830, 932168, 430807, -38973, -213659, 245248, -914037, -68305, -162194, -233373, -384123, -886489, -548775, -161413, -654645, -208357, -839514, 425078, 999192, 878601, -514345, 197669, -949683, -281119, 12729, -701360, 629704, 161741, 346708, 435779, 564541, 156723, -409554, -27275, 524241, -420009, 13938, 212561, -617183, 869481, 230386, -404465, 213548, 62469, -126513, 119140, -523461, -394146, 681567, 819273, 639425, -225980, -870343, -493973, -120267, -175155, -591109, 703214, 129823, 50168, 368124, -530133, -359808, -253471, -73403, 142247, -255585, 615177, -799546, -577979, 827416, 366200, -408859, 92001, 962240, 99167, -67129, -149938, -812319, -496472, 425440, 89816, 364478, 580077, -179195, -633966, -768745, 74383, 865127, -442643, 942219, -464688, 489896, 438579};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques973(){
        Integer[] array = {449660, -7113, 95824, 738655, -108358, 506729, -100601, 672812, -904798, -77739, 982062, -761689, -299586, -303501, -83478, -127764, 275019, -235501, 598159, -213535, 340094, 441907, 845895, 86150, 208937, -757417, -840372, -413423, -569773, 242488, 566734, 265645, -894841, 364893, -442733, 645629, -370055, -824547, -417264, -238394, 455975, 366878, -672758, -988399, 136211, -19626, 453832, -908884, -718426, -746576, 181793, 6737, -414184, 119538, -211322, -462554, 869647, -834772, 715211, -55524, -979853, 429462, -403868, -711346, -314590, -375608, -71083, 597229, -516429, -605057, -665503, 88649, -437897, -719217, 148266, 529105, 609783, 536668, 93854, 654361, -801002, -647675, -104002, 959276, 888512, 925920, -613005, 877104, -140056, -390101, -306104, 179635, -336313, -988695, 511680, -477403, 666031, -247356, -770245, -775683};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques974(){
        Integer[] array = {581769, -396760, -213079, 482504, -499150, 19328, 981954, 225134, -741940, -94828, -976257, 135399, 60824, 374425, -184247, -449046, -667207, 334929, -660686, -606703, 393961, -144184, 664412, -81930, -204692, -505907, 993463, 781217, -597968, 230479, -632850, 936880, -460322, 608034, 673295, 111421, 34625, -944919, 178977, -652667, 199083, -677206, -951329, -550492, 466356, -159485, 511639, 290064, 729893, -277123, -548307, 732131, 726959, -499163, 651545, 807496, 151599, 79260, 831349, -149185, -698145, 813481, 659087, -693743, 69390, 51955, 138225, 306455, -384879, 434167, 301502, 221556, 483116, 692874, -127535, -756095, -69980, -258250, 506087, 848956, -912547, -833, 926835, 351926, 791973, 700982, -58296, 941037, -345154, 1299, 937460, -321846, -249332, 587953, -993821, 665509, 265937, 211931, -381474, -128053};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques975(){
        Integer[] array = {-884322, -164013, 272203, -159944, -310256, -123200, 316724, 13592, -925494, -20978, -69215, -290652, 947718, 608724, -246730, 239147, 423604, 597365, -865428, -376506, 779588, 320172, -322029, 755601, 279381, -689226, 705432, -449008, 911978, 502453, 150951, 90952, 877151, 39439, -46055, 770939, -723917, 82363, -833650, 151829, 201090, -847121, -697957, 480491, 538309, 590266, -77551, -972833, -711860, -23777, 149369, -293526, -252924, -249933, 139493, -23075, 632032, 730556, -376869, 313009, -214120, 246530, 426591, 899354, -570933, -390521, 772075, 520296, 439553, 944085, -35007, 473403, 242561, 121564, -86298, 574751, -505523, -361632, -906510, 877325, 248371, -148059, 366884, 425163, 73011, -863808, 358155, 673375, -52899, 4821, 651088, -868861, -799031, 1734, -521670, 331293, -829203, 818552, -294727, 431362};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques976(){
        Integer[] array = {-333898, -18118, -358781, 92037, 847758, -603740, 732164, -241190, -631908, 980267, 578778, 258079, 922328, -291942, -922056, -180149, 556022, -314091, -523048, -508847, -835838, 436969, 880720, 454775, -603354, 878972, 225825, 334302, -426395, -368912, 29414, -46969, -987484, -404914, 726586, -124575, -139460, 349560, -27622, -98326, 24673, -603922, 624473, 268924, -367850, -513100, -34666, 404606, -524438, -608489, 823089, 89075, 100597, -855478, 429104, 988589, -437966, 511516, -750608, 5261, -515202, 328825, -509942, 934341, -587327, -952758, 541118, -102979, -887201, -148462, -528799, -81000, 313009, 235468, -391758, 852628, 669160, -174971, 639083, 188879, 779727, -897434, -677907, 634843, -560399, 801371, -699233, -839825, -879602, 263978, 761663, 291682, 203830, -227977, 722443, -149909, -809361, 577446, 975630, 947076};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques977(){
        Integer[] array = {-557126, 829907, 660301, 438583, -571263, -565906, 500440, 128132, -486939, 442521, -50413, -750928, -511016, 227054, 421135, -509776, -334767, -489730, 972227, 444401, 852649, 808131, -238081, 45958, -220351, -79202, -977940, 211442, 450036, 832321, 820693, -483633, -165018, 973857, 450121, 159771, 934637, -614329, -88051, 846625, 952080, -344452, 669847, -407853, -120113, 620178, 688370, -174736, 530968, -253648, 284432, 41267, -552368, -56772, -994666, -814300, -233933, -232582, -466538, -24562, -440593, 12904, -879432, -741145, 495863, -450788, -219494, 25295, 597787, 960991, -105972, 180557, 70109, -321257, -549393, -328922, -518239, 105113, -966052, 88418, 852930, -362994, -787646, -169816, -317458, 780569, 55990, -433303, 352795, 972069, -346793, -302402, 136938, -369357, -119418, 424411, -658201, 955809, 115912, 212069};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques978(){
        Integer[] array = {-588952, -988253, 148306, -666828, 498548, 75366, 714405, 867946, 114616, 360686, -666099, -329389, 943795, -658614, -596323, 436548, 940700, -849492, -155270, 500070, -635455, -822571, 461228, 521857, 200362, 168409, -434097, -295907, 465816, -909987, -647702, -545963, -373948, -192296, -834893, -543398, 367675, 827824, -686295, -441276, 460342, -122952, -190053, -217114, -98120, -555332, -21343, 97800, -921294, 484551, 806999, -770529, 881742, 541845, 170738, -820872, 395780, 949890, -927533, -554797, 484063, 506437, -939637, -395712, 544120, 145299, -222905, -207873, -178483, -440041, -510072, -376701, 821479, -488264, -566752, -170043, -871170, -888321, 214274, -452300, -797834, 225600, -732386, -484589, -572060, -573926, 174571, 367595, 842067, -405925, -925613, 914101, 437854, 369295, 511869, 350736, 693030, -818903, -319285, -286638};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques979(){
        Integer[] array = {311614, 300669, 622598, 735806, 788741, 892008, -645645, 936262, 502595, -364278, -695310, 945, -430131, -826591, -108014, -248248, 431925, 181569, 608000, -725384, 155840, -889043, -343441, -810548, 528101, -196382, -252887, 2303, 461138, 758564, -56479, 503052, 981512, 688735, -952066, 1612, 159253, 132879, -970786, -852217, -219444, -936301, -792880, 975545, -646467, 187440, -46678, 118048, -271448, 207209, 604377, -209603, 817319, 449306, 336283, -642658, -213929, -810222, -18026, -98846, -615667, 667898, -117367, 919088, -614511, -239263, -817194, 614665, -227764, 833485, 396697, -806406, 571505, -73887, 462742, -401019, -530094, -292498, 196134, 581406, 777863, -556445, 353003, 62367, -184692, 11202, 144525, 834617, 982192, -707061, -399397, -580989, 913961, -6705, -20568, -29520, 530603, -986847, 184684, 365368};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques980(){
        Integer[] array = {120921, -395113, 960949, -835467, -740285, -247304, -990601, -975231, -95259, -648592, 11246, -662350, -876297, 917212, 347151, 24421, 364102, -296512, -552409, 396277, -311635, 231172, -369434, 258422, 351888, -236842, -435161, 569002, -619312, -25019, -13080, 92710, -656221, -533718, 633625, 859797, 651710, 206290, 29676, 14277, 554645, 804657, -351020, -491097, -305191, -456747, -469367, -154792, -982736, 10239, -8039, 818285, 682697, -397659, -370656, 742204, -116450, -73860, 60178, -979085, 118149, -95087, -6750, 599793, 390364, -93024, 851635, -685254, 690920, -977587, 226152, -224050, 509082, 797175, -270677, -107791, -388241, 666809, 563403, 757950, 925487, -244410, -285104, -262999, 53672, 699188, 899763, 575018, 837929, 125555, 664370, -727461, 839941, -236583, -645446, 387942, 768395, 528395, 459444, 78157};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques981(){
        Integer[] array = {663047, -960533, 994503, -627761, -578877, 798202, -775134, 978967, -118179, -620659, 610829, -821767, 245353, 380695, 534350, 997252, 295255, 670384, 476749, -263599, -772065, -80936, -771609, 335779, -990011, -272381, -622233, -824706, 175778, 482621, -300729, 440836, -857460, -810616, 121148, 724878, 863044, -314555, 591449, -191854, -508831, -318894, -170110, 705469, 410278, -577412, -507478, -479372, 605910, -3925, -450200, -432215, 287810, 766248, 648280, 139694, -954784, -559673, -650223, 649423, 575354, 671598, -347012, -811888, 73054, 675053, 337501, 440859, 559615, 390886, 472639, -187071, 669139, -430520, 691731, -716931, -328376, -40573, -579488, 419345, 983497, 590481, 749348, 589688, 321013, 49434, -767463, 716386, -541202, -380168, 214909, -509359, -941708, -358684, 935949, -794319, 882915, -641571, 3351, 783629};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques982(){
        Integer[] array = {553006, 658763, 842532, -821697, 423477, -815395, -621962, 955413, -29555, -634744, -246757, 916185, 741474, -328676, -216014, -243718, -228069, 382671, 55494, -315575, 921567, 585189, 605085, 611009, 250785, 141906, 252680, -735693, 49382, 198516, 554769, 298218, 47583, 263427, -539205, -32188, -324211, -508847, 435117, 501720, 267402, 201685, 775960, -540754, 696355, 409082, -344852, -991805, 441979, -576112, 420790, -648411, -628635, 163379, 643105, -894017, 441712, -705654, 61250, -516851, 684941, -631819, -351941, 183740, -231334, 202842, -658802, -336474, -176360, -837009, 787648, 616181, 299555, -38347, 712841, -574314, 748201, 55521, -149818, -235410, -210103, 577338, -843730, 611701, 722732, -870787, 830710, -738658, 686125, -163891, 697328, 42230, 386707, -961086, -651391, 926737, -708134, -555258, -28553, -238319};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques983(){
        Integer[] array = {427867, 221478, -597129, 49463, 441277, -512916, -320389, 981956, 334753, 258963, -315415, 608566, 841513, 571601, 421716, 656402, 809459, 344742, 294275, -668316, -331588, 255542, 357249, -684055, -133925, 692314, -971127, 190137, 842116, -462635, 690691, -183156, 587707, -276327, -607453, -906666, 277246, 213200, 361547, 780643, -446381, 877249, 149150, 87619, 185484, -917688, -262677, 993452, -663172, 481373, 391909, 810231, -631017, 150342, 48454, -153322, -172134, -998498, -948346, 359226, 709997, 672644, 585834, -987322, 657313, 551245, -621862, 91700, -580725, 241138, 860966, -277620, -527981, 977681, 552909, -896831, -748619, 733520, 265804, -731444, -806089, -322355, -52473, 250259, -618896, 282507, -95835, -863704, 892728, 692172, -634260, 953654, -487275, -260100, 999156, 23160, -150094, 310698, 944505, 785782};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques984(){
        Integer[] array = {-510880, -622116, 298180, 532401, -218592, -137727, -245155, -945834, 975700, -818173, 56544, -516354, 217480, 308639, 672470, -967603, -779186, -347582, -163739, 938684, 551174, 825561, 580568, 85956, -934939, -401344, -481113, -170751, 176843, 182447, -445332, 244000, -265026, 885364, -868628, 481339, 599416, -379340, 66439, -160472, 803480, -311374, 82997, 218273, -395063, 545289, 313014, 119927, -762643, -135317, 398819, -311540, 252833, 231461, 374595, 143753, 789529, -861566, -81708, 145960, -236543, 582297, 839568, 982347, -457248, -406332, 677468, 166832, -186071, 597720, -692396, -86404, 826915, 5213, -532232, 183896, -571710, 712919, 259701, 791986, -58041, -917194, -769581, -478690, -300640, 187967, -46409, -171895, -255240, 662155, -243087, -747904, 8554, 107698, -555506, -335908, 80178, 182649, 536142, -244163};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques985(){
        Integer[] array = {-764593, 211399, 944463, -132825, 981665, -343342, -132813, 475646, 614468, 2754, 291281, -241059, -506385, -404950, 429120, -334070, -337145, 904581, -454922, 343017, -2619, 533026, -678520, 617756, -327745, -202732, -741468, 633257, 610754, 488387, 412442, -136154, -712462, -881362, -515133, 248432, -393349, -865304, -492395, 805102, 556405, -743949, -520620, -772329, 134322, -385559, -340335, 530342, 215342, 213901, 298014, 54815, -344523, 721439, -482076, -905657, 566016, 501312, 993482, -204596, -810051, -2341, -427240, 166893, 224457, -641324, 253776, -839367, -450524, 664568, 72737, -204228, -18976, -885326, -972662, 34452, 719159, -256333, 782924, -367299, 832902, 67591, -338769, 721471, -88012, 723365, 989860, -283459, -234259, 245800, 234021, 347303, 759534, -404275, 516310, -595138, 397421, 559586, 821616, -807240};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques986(){
        Integer[] array = {-622843, 981111, 996073, 44787, 266055, -236929, -1596, -898388, -66948, 394351, 110896, 237910, 599906, 358081, -143094, 920413, -456449, 575806, 912444, -423716, -960860, -359086, -91544, 194579, -274300, -733013, -123540, -991624, 247245, 933930, -846676, 541576, -745063, 482308, 194471, 734824, 183354, 116224, 567933, -909497, 905194, -948540, 172257, 807866, -324351, -485981, -108766, 657137, -519261, 249116, 723284, 675863, -349819, -384000, -56528, 237219, 168797, -237591, -991359, 181547, -248799, -700708, -753590, 46763, 492478, -779445, 321207, -381503, 495342, 415914, 706802, -227489, 790384, 586141, -980092, 100806, -746197, 18385, 513639, -129936, -321544, -782998, -985437, 691476, 179941, -300910, -703406, -151859, 411282, 192564, -845023, -293708, -479163, -449946, 348677, -792488, -546039, -108296, -739872, -813801};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques987(){
        Integer[] array = {-611862, -62935, -887435, -963307, -270567, 599818, -960189, 308227, -566753, 247469, 215829, -964451, 57389, 408816, -265099, -390262, 398593, 327635, -832022, 264170, 101559, 547089, -848112, 847451, -88599, 784211, 676445, -621666, 113939, -674633, 560268, 942879, -359196, 983197, -691855, -884655, 998494, -489398, -752712, 884756, -612062, 78349, -198782, -352859, -85553, -853043, -872455, -596666, 428860, 31060, -598182, 827957, 458726, 530306, -233232, 711725, 878669, -695888, 391629, -289470, 570594, 201382, -612874, -551199, 650614, -340075, -936398, 731931, -554232, -200320, -752535, -473052, 866527, 387832, 911406, -33176, -378655, -399383, -849969, -468671, -671621, 672999, 768650, 230194, -411003, 607291, -940944, 935648, 738125, 872731, 240169, 569356, 342807, 587644, -907338, -308334, 358249, -756898, -12830, -278509};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques988(){
        Integer[] array = {850430, 234425, 536038, 41635, 362580, 907276, -990218, -45369, 36338, -596090, 938145, 789558, 863174, 648172, 614011, -386243, -305227, 185918, -902233, 805522, -966717, -733110, 539347, 446601, -627289, 562729, 131857, -933694, -378158, 823123, 215128, 544677, -45811, -598914, -408636, 178711, -320972, 583962, 667186, 539871, -962088, 78557, 177736, 854831, 145493, 521119, -520736, -248500, 481631, -24717, -237707, -225444, 435228, 198642, 968900, 693031, -980367, 970270, 622717, 744168, 690697, 387141, 412442, -511861, 423356, -287030, 663676, 515831, 405724, 432205, 531178, 278827, 633750, 160316, 109936, -301223, 27784, -143520, 851355, 43895, 760368, -874657, 138630, -609369, -811766, -559721, 358053, 528970, -916001, -84944, -824404, -173953, -312415, -400515, -988444, -269429, -50216, -58735, -311227, -2050};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques989(){
        Integer[] array = {964540, 773018, 118938, 446096, -739089, -342265, 313518, -163761, 378357, -20250, 891776, -529790, -767580, -531544, -969440, 17666, -528962, 510685, -449132, 234444, -980381, 174982, 620091, -326453, -705590, 540544, 272651, 272500, 547020, 92572, 892710, 615036, -391906, -273172, -537649, -13960, -479952, -679464, 501521, -957970, -727937, 635671, -960698, -154353, -135419, -1682, 423426, 704559, -368374, -703912, 69098, 648228, 506389, 938164, 824450, 146767, -994780, -538932, 880506, -278892, -150486, -505149, 627023, -803193, -716244, 527165, -466678, 747354, 29237, -975365, 702525, -778916, -349303, -158671, -432790, 683765, 619022, -281826, -734456, 290284, -254525, -866101, 256781, -496321, -221883, 738279, 638514, -961426, -747558, -88787, -196405, 624894, 638804, -559153, 905114, -389371, -629908, -979818, 70990, -6520};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques990(){
        Integer[] array = {-740034, 7440, -615152, 368450, 498670, 773265, -456008, -498712, -547984, 949865, -633076, 759893, -980522, -113001, 147818, -5727, -996632, 137255, 526917, 903157, 774627, -341337, 674153, -843524, -636024, 792147, -871669, 29343, 321495, -670068, -5840, 753704, -36615, 597592, 16783, -701739, 576859, 230967, 714433, -160228, 235201, 441521, -500657, 729480, 660783, 423620, 305804, -587330, 731561, -841418, 920203, 577866, 977039, -555078, -699079, -919808, -375184, 284200, -907056, 974256, -368499, -441945, -983106, 904898, -563776, 186286, 713736, 493004, -614001, 558964, -756036, -344048, -890062, -346614, 1315, 155945, 824856, -946687, -911395, 988286, 626571, -978994, -384212, -243402, 703475, 965282, -254321, 897076, 367738, -520480, -879704, 294244, 88599, -216708, 626159, -632740, -800364, -930690, 485574, -762817};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques991(){
        Integer[] array = {325788, 255015, 605774, 879590, 257133, 531098, 682786, 721425, -314635, 161687, 294451, 59488, 142087, 525078, -743691, -934877, -304208, -441494, 674381, -482238, -976853, -476357, -713884, 692375, 340808, 573450, 930632, -531878, -248561, 484945, -586566, -61534, -116329, 800612, -549670, 605832, 98825, -896436, -85218, -493127, 86504, 538142, -657445, -703497, 924445, -249846, -507035, 493600, 376527, 751090, -940313, 670487, 508982, 815441, -335015, 242408, -500142, 148623, 386300, -499597, -530452, -492620, -443166, 492729, -334072, 507660, 183524, -961507, -164201, 102797, -405323, -171493, 856907, 941535, -449711, 147561, 298302, 827218, 367177, -181183, 63812, 528419, -385262, 320438, -400546, 967263, -647850, 175835, 57125, 552369, -39127, 339941, 171009, 965008, 162158, -88937, 142767, 658778, 693543, -831693};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques992(){
        Integer[] array = {676256, -302202, 824793, -463516, 536783, -206561, -453171, -740156, -91344, -443151, -278566, 691181, -869606, -706958, -432271, -796374, -168671, 689333, 828874, 28835, -218896, -941053, -849185, 935976, -815871, -386464, 462370, 421301, -711954, -556494, 7271, -969982, -418796, 319344, -950552, 281607, 590041, 608538, -163441, -91220, -637287, 95540, 563418, -587186, 332688, 358991, -790624, 371235, -611679, -703677, -270309, 268491, -400564, -266143, 472628, -59308, 820445, 470704, 87124, 150615, -668889, -557597, -223518, -311098, -903759, -645627, 251443, 479549, 259892, -986368, -10455, -264343, -226286, -110444, 592304, -910918, 872049, -944435, -989048, -246036, 710992, -481198, -556343, 342069, -627093, 341723, 439526, 642191, -322334, 146143, 848230, -947434, 400018, 110799, -839891, 938540, 328168, -998486, -315242, -290300};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques993(){
        Integer[] array = {-955750, -667402, -499114, -164734, -988959, 594844, -381214, 468488, -492672, 294552, -406, -789342, -447788, 539010, 539102, -277826, -331735, -650233, -277339, 606395, 296903, -243749, -573065, -828145, 596837, 952252, -236963, 762004, -17941, 171996, -34597, -867999, 138215, 591839, -887986, 991142, 606289, -37597, 336493, -265904, -164460, -338284, -480082, -224590, 894720, -164493, 718936, 426989, 466977, -857409, 627785, -28436, 830429, 946736, 131342, 484553, 585837, 328516, 663223, -463908, -806686, -306668, 685516, 564625, -199156, -110607, -336605, -395270, 997431, -834135, 497918, -362633, -365887, 262573, -604248, -410910, 188788, 125713, 110510, 586249, -378505, -451343, 329441, -206487, 634750, -569013, 911870, -730687, -72068, -907091, 495748, 960193, 13491, 243453, -397932, -187459, 456680, 965816, 126756, 547601};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques994(){
        Integer[] array = {-503736, 611222, 833234, -610563, -486947, -4837, -720023, -298122, 448834, -443429, -202698, 615423, -374841, 485091, -231024, -425568, 821236, 777818, 929730, 895165, 845053, 653737, -274886, 625516, -702532, 741109, -239627, -318402, 31136, -259199, -51632, -841809, 90951, 715653, 689410, -775537, 363422, -22138, -255943, -391768, -183916, -303216, 657853, -405591, -920583, 280963, 790656, -127454, 438144, 136513, 828437, -649445, -710611, 30612, 246898, -478590, -335367, 956606, 280065, 335105, -199884, -517455, 720474, -675951, -512977, 550506, 820803, 194194, 166672, 945810, 779331, -752886, 525235, 852244, 705510, -382194, 882248, -699408, 168376, -237036, 442011, 659015, 414997, -527037, -524131, 715910, -407334, 75709, -762259, -177996, -563802, 971339, -729909, -437673, -800348, 906453, -491813, 620780, 99450, 479687};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques995(){
        Integer[] array = {989042, -97362, 160620, 545366, 204659, -429469, -8175, 813264, 804298, -615574, -570223, -899395, -976484, 446262, -337920, 935575, -791381, 310625, -989642, 566010, -313801, -535581, -479189, -908755, -319416, 830322, -778681, -139490, 179, 724687, -572128, -878653, 464370, 434484, 731126, -909611, -988001, -486310, -415674, -519229, 149714, 242580, 51313, 470524, -274682, 808909, -118317, 419198, -703111, -473694, -315451, -506326, -727507, -54940, -736197, 654672, -804920, 790446, 602844, 38930, 502341, -385385, -744520, 739768, 792622, 252810, -953538, 458450, 35312, -250021, 502052, 428795, -377412, -219482, 306875, 145555, 984768, -349439, 645428, -752435, -200380, 365733, 618349, -983918, -14511, 439700, 215306, 748044, 157409, 518409, 396232, 759903, 975753, 911745, -325399, 54410, 286156, 578543, -265280, 205403};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques996(){
        Integer[] array = {-530170, 206086, 477021, -14491, 596939, -542122, -701709, -609651, 386548, 571504, -62024, -644575, 329610, 696013, 214610, 473691, -19068, -972461, -65829, -572847, -287371, -728808, 261799, -234207, -402356, 140400, 844790, 885237, -744411, 116729, -551234, 142651, -964779, -824641, -693010, 157628, -420877, -603044, -336644, 330902, -913477, -625239, 121597, -298813, 395434, -30383, 561682, 256413, -533221, -212955, -669835, 792899, 476567, 183108, -433959, -370597, -655662, -299706, -594304, 166624, 54532, -200532, -953618, 390041, 313055, -606982, 576452, 280545, -569047, 43840, -251770, -878142, -238716, -673219, -763793, 237158, -731933, 574548, -753050, 562401, 408091, -831477, 5211, -213587, -236604, 752201, 206270, 363822, 115893, 965141, 340583, -563682, -402494, 352590, -782183, -919610, -542987, -654545, 699281, 858524};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques997(){
        Integer[] array = {-998473, 514382, 816039, 961974, -456361, 492869, -3183, -980652, -577856, 875806, 600198, -799286, 74764, 754253, 609318, -383541, 40494, 636048, 494714, -741350, -693714, 662149, 109922, -818797, 516113, -920192, -811062, 769604, -572638, 799781, -916128, -58923, -205299, -475248, 902723, 224618, -952717, 73445, 543743, -542721, -307782, 758347, 758866, -585093, 865811, -973088, -653117, 930525, 106558, 920709, -186710, 830653, -534750, 950296, 486526, 769042, -357487, -874602, -900190, -653387, 543203, 831151, -537398, -929080, -68536, 335615, 608958, 872782, 355493, -361242, 47168, 785629, 497951, -774441, -104049, 491487, -941050, 163248, 218677, 438238, 90399, -539322, 113339, 647903, -244423, 961987, -59646, -245277, 739885, -398973, 763520, 790039, 443486, 88129, -715851, 381485, 879140, 812222, -432320, 173632};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques998(){
        Integer[] array = {718962, 730608, 578620, -749156, 545752, 222955, 956392, -360729, 950655, -189201, -29242, 799198, 722293, -656958, 159087, -91732, 538234, -557532, 100461, 564552, 122579, 218410, -473311, -425187, -522609, -827669, 548700, -648945, -526879, -941506, -821609, -598507, 487928, 494106, -774124, 551834, 650609, 167594, 715155, 305688, -576961, -444518, 332797, 764519, 888581, 925075, -230014, 459331, -332275, 650418, -683684, -410384, -537662, -893029, -332894, 605785, 172701, 187870, -978218, -570403, 685663, -677899, 13651, -188744, 948335, 546410, -325827, -739015, 246112, 728868, 200799, 685779, 667185, 597838, -589093, -251290, -521655, 586329, -869943, -732121, -390225, -360148, -678500, -978585, 600800, 624603, -18354, 676969, 72401, 644752, 369960, -458353, -86342, -103534, -685126, -667356, 398413, -840299, -308480, 428343};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques999(){
        Integer[] array = {-1155, -40685, 974670, 630683, -610493, -997868, -28984, -596899, -312067, -146214, -918504, -709086, 991145, -263637, 52594, -381418, -380319, -860372, -578537, 938403, 308822, -428480, -637146, -505999, 148130, 236403, -518153, -978263, 310131, 895678, -360732, 610284, -437861, 141207, 337463, -137990, 525486, -253663, 161421, -118451, -101458, -805109, 956029, 830613, 98855, 212182, -836497, -805508, 808225, -788757, 354855, -945177, 93895, -694439, 265493, 410992, 837328, 356122, 631122, -441464, 151199, -394047, 752653, 953285, 175647, 858063, 884106, 603696, -651464, -278654, 283883, -951356, 489611, 950924, 363159, 102811, 588385, 491292, 666058, -393995, -544657, -842672, 989223, -606663, -27690, -794337, 261199, 106022, -968122, 18217, 247240, 132043, 915647, -562856, -758165, -302739, 747100, -557309, -400707, -125297};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

}