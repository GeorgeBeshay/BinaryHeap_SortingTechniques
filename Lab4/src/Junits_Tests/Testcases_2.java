package Junits_Tests;

import Sorting_Algorithms.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Testcases_2 {

    private SortFactory<Integer> simpleSF = new SimpleSort_Factory<>();
    private SortFactory<Integer> efficientSF = new EfficientSort_Factory<>();
    private SortFactory<Integer> nonComparisonSF = new NonComparisonSort_Factory<>();
    private SortFactory<Integer> heapSF = new HeapSort_Factory<>();

    public static ArrayList<Integer> getLastList(ArrayList<ArrayList<Integer>> steps){
        return steps.get(steps.size() - 1);
    }

    @Test
    public void testSortingTechniques200(){
        Integer[] array = {-504586, -199016, -330569, -430029, -495117, 508379, 460042, -331788, 311733, 646157, 226712, -377540, 740321, -946966, 569550, -688582, -354783, 855031, 24062, 116130, 733071, -692463, 925555, -859759, -540675, 512685, 781885, -895695, -440298, -616432, 725751, -19629, -366537, -57297, -758635, -724115, 44975, 219001, -19403, -413901, 76364, 870008, -536432, -794340, -153071, 345069, 197717, -63089, 863210, 30063, 642001, 486210, -384014, 799713, -604993, -875921, -687157, 292943, -687444, -936524, -644745, 460969, 549626, 443025, -134049, 622408, 770748, 732339, 646933, -711871, 43152, 239832, -251647, 939351, 42705, 523386, 606490, -445872, -34188, 597737, -447672, -479713, 333862, 129278, -253397, -487432, 990492, -910196, 627953, 584132, -654282, -765133, 617605, -567790, 701390, 686524, 374559, -421808, 371559, 335281};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques201(){
        Integer[] array = {841650, -379085, -358946, -674913, -757355, -496259, 127918, -18161, -502528, -902416, -957452, -313515, -598966, -707234, -403479, 524843, -374355, 113372, -451572, 304416, -310391, -575448, 817162, 378912, 63812, -970772, -3807, 543898, -606099, 514001, -302652, 816146, -402467, -774080, 292072, 310639, 244672, -894029, 693529, 567582, 372694, 378287, -898669, 123158, 115811, 571676, 209094, -480367, 438281, -236013, 420372, 572277, 809307, 447312, 287899, -327134, -412036, 456617, -383147, -834975, -740623, -390444, -944803, 408441, 751620, 922918, 428401, 457899, 882885, -990590, -825158, -758265, 182904, -811792, -834870, 279405, -437792, 70057, -936512, -573898, -176583, 605558, 131187, -501509, 407324, 528061, -615351, 729155, 254776, 500809, 141796, 931056, -392981, 319149, -556046, 627915, -592767, -532845, -731512, -926415};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques202(){
        Integer[] array = {-68854, -359438, -251345, 602948, -604555, 107091, -848809, 914090, 477966, -794549, -480690, -120054, 939138, -662386, 961039, 464621, -661383, -192778, -806057, 277848, 913287, 300694, 330246, 103393, -584542, 51744, 678132, 956802, 631185, 34367, -643075, 290612, 932509, -240529, -408974, 278113, 229131, 284194, 260341, -793207, -252890, 762377, 941376, 338195, 378731, 550318, -23273, 926236, -178176, 782299, 114372, 228296, -586542, -228260, 595051, -274399, 719603, 450773, 843298, 260365, -839062, 522437, -159097, 731284, -515861, -575998, 658017, -71766, 21580, -573130, -188737, -299480, 840532, -682714, 676408, 96643, -595227, -116019, -760682, -349662, 287228, -205562, -818880, -163494, -748290, 805181, 747569, -570035, 243700, 626427, -428752, 426424, -868950, -865538, -200650, 263918, 522225, 162829, -716171, -512220};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques203(){
        Integer[] array = {-535569, 358767, 917013, -967123, 47688, -952228, -53388, -422542, -261671, -329216, 37596, 618580, 104727, -730245, -303701, 583135, -98662, 791259, 562329, -629516, -877067, -350308, -727796, -997212, -173543, -622451, -421138, 928090, 173641, 662000, -517595, -580958, -542554, 57790, 166276, -132821, -467205, -572230, -327010, -321022, -625791, -421901, -63481, -760364, -858361, -96689, -79716, 624741, 823255, 60023, 62146, 754646, 816823, 9447, 113574, -269260, 704736, 991764, 339985, 797119, 917693, 369452, 954502, -117073, 429644, -700682, -520286, 456443, 568575, 592369, -523360, 727759, -478514, 553206, 115353, 425014, 940162, 501952, 439361, 712626, -231347, -610983, 519162, 244134, -322307, 424834, 860711, -588037, 409407, 204791, -62699, 179392, -416973, 993192, -897522, -839895, -635653, 529753, 126066, 847871};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques204(){
        Integer[] array = {487026, -515567, -708019, -525054, 333510, 805333, -608473, -97527, 537940, -475776, 447330, 597699, -395784, 466441, 792564, 599127, -670513, 591690, -79539, 406067, -786456, -519271, -160380, 595224, -252115, -712538, -456782, -838471, 303598, 700662, 453671, -646415, -785089, 488373, 455190, 803369, -486467, 162914, 570464, -682267, 340572, 962932, 851964, -685062, -600624, -964431, 57422, -696263, 763511, -446914, -634283, 163244, 771048, 800380, 103232, -956157, 9488, -434477, 359348, 108353, 342895, -657828, 542378, -928346, -537349, -230671, -457860, -560094, -264786, 281446, 707735, -689550, -291957, 166883, 167373, -270666, 15888, 523188, -436684, -740259, 120695, 907080, 949325, -869327, 974867, -375498, -984923, -941895, -581687, 416753, -63265, 622930, 253988, -641795, 57597, 95472, 37359, -14291, 442657, -482614};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques205(){
        Integer[] array = {-822635, 180284, -988639, 386365, -132604, 45046, -328068, -580427, 225359, -460867, -683457, 283856, -952759, -124361, 829081, 740803, -135733, -662814, -429631, -866019, -780729, 879942, 484480, -171592, 293626, 915851, 873780, -830276, -825141, 952673, 188969, 750163, 253618, 587301, 519217, -783696, -648917, -561743, -993256, 884917, 262250, 608581, 72312, 452756, 278286, -941708, -458228, -159968, -642131, 569204, 871117, 566608, -21002, 658181, -46812, 922110, 330702, 625583, -719983, -111806, 549932, -950830, 295511, 771057, -846234, -861730, 523185, 113648, 993127, -827241, -943074, 707701, -3744, -231563, -124703, 548847, 143045, 90635, -639734, -742891, -177459, 320909, -973213, 20566, 213438, -795584, -99248, 997525, 401832, -77954, -976278, -622540, 574227, -509614, -811542, 856007, 676370, 727916, -781594, 718475};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques206(){
        Integer[] array = {-479358, 438117, -364068, 997702, -924688, 908687, 904106, -220537, -163049, -516581, -425434, -838877, 216827, 598630, 536009, 845106, 51727, 840521, 652467, -200585, 785954, -799144, -834666, 532983, -120931, 103080, 246976, -888073, 835054, 764606, -286155, -778361, 178598, -454673, -339888, -162087, 288283, 846326, -700002, -666604, -644045, -753742, 230141, 154794, 687807, -557043, -490596, 741685, 16651, -580297, 324108, 826323, 536383, -968143, -403104, 701220, 982684, 708882, -989887, -638148, 867025, -543495, -984765, 526923, -538972, 428783, -815151, -55646, -492089, 174639, -434833, -424271, 788600, -420859, 199701, 570597, -739463, 562332, 435609, 11338, 186637, 767551, 327718, 697214, 30670, -29814, -608699, 484623, -247601, -616797, 307407, -818633, -230712, -558099, -553332, 974388, -962546, -450641, 262743, 20457};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques207(){
        Integer[] array = {-430995, 541355, 258495, 269413, 130414, 247625, 488838, 267533, -545809, -881336, -785556, 45299, -511879, 902243, -386259, -801556, 573711, 122190, 333757, -668615, 973463, 497016, 244491, 636542, -708062, -7333, -643506, 994363, -538746, -690914, 910309, -366041, 895834, -734717, 9964, -154918, -601095, 138752, 567226, -49972, 523898, 434133, 763132, 308820, 1291, 991693, 523303, 292751, -967016, -456100, 134660, -374839, -25667, 828619, -436052, -488126, -455173, -166033, -797742, -634235, -114444, -626903, -459688, 309518, 918839, -388501, -404729, 187984, -441541, -520850, 326754, 71793, -809074, 76630, -223955, -710503, -879358, -9229, -468537, -760571, 180910, 557478, -918629, 665969, -730691, -213975, 918445, -964635, -164932, -693568, -688710, -577046, -940547, 298289, -916593, -806787, -638192, -939836, 114221, 503435};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques208(){
        Integer[] array = {-876268, 810761, -205881, -583183, -182889, 448190, 922905, -257305, 495293, -214303, -76114, -334032, 123146, 94934, 972763, -247859, -564069, 47, -239296, -791739, -981582, 677809, -791401, -608579, 586061, 101857, -690852, -905217, 663240, -802657, 251350, 628563, 314634, 276567, -763806, -795382, 377855, -4268, -383500, 233846, 559182, -4480, 561652, 534718, -276955, -201252, 870766, 91502, -646756, -111370, 963812, -152676, 88847, -382286, 260312, 316060, 488708, -762551, -738173, -535302, 879731, -156020, 28823, -524670, 53534, 856139, -807034, 834752, 238289, 363516, -568849, 147621, -721283, 487027, -781859, 862926, 34609, -761482, 420586, 481736, 20543, -338560, 206799, 570332, 572066, -157866, 376354, -761398, 597475, 652541, -978767, 963546, 942946, -441706, 749593, -715084, 261261, 697082, 477252, 539463};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques209(){
        Integer[] array = {393174, -888799, -132571, -1489, -662699, -551201, 323032, 908176, -899175, 820367, 238933, -401543, 895005, 571764, 403784, -504698, -605051, -339455, 29505, -232425, 319698, 341051, -995878, -80996, -343153, 69832, -606051, -908367, 458161, 484698, -146043, 456586, 599632, -28233, 426018, -230481, -506287, -968716, 211870, 197555, -54134, 659767, 309471, 27618, -183728, -637002, -183004, 381391, 320951, -199007, 638930, 852473, -314423, 425455, 404114, 460681, 502136, -714153, 411149, 924166, 202860, 629644, -512331, 778761, -436795, 526626, -123181, -825902, 456752, -376836, 522958, 221630, 757952, 356629, 578062, -829654, 71739, -525497, -181713, 334578, 437258, 522997, -748750, 843919, -840330, -577372, -437717, -62836, -46653, -929721, -970287, -84180, 267823, -531289, 384879, -230261, -382595, 760381, 590845, 692700};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques210(){
        Integer[] array = {37734, -756068, 774876, -282048, -461949, 92161, 318211, -565521, 445713, 394484, 289674, 267922, -247692, 91944, 740789, 389823, -20451, 166612, 300770, 538708, -8805, -614996, 728843, -198702, 11951, 329384, 748963, -716040, -2859, 368823, -742104, -610653, 615439, 478603, 434953, 680038, -565627, -813510, -388932, 945204, 416159, -611567, 468980, 77532, -294010, -931460, -9212, 381151, -991511, 48732, 307841, -687693, 205792, -397643, 140359, -637377, -421254, -901077, -258527, -735672, -229954, -546440, 626286, -414159, 787245, -548367, -638619, 725761, 998542, -967446, 758121, -171376, 34911, 784508, -771207, 369953, 522564, -236180, -932816, -612158, -821355, -800156, -118406, -166330, 861721, -752560, 252201, -825133, -181044, -866414, -222089, 422631, 960849, -784259, -216759, -146798, 36496, -599967, 938550, 798883};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques211(){
        Integer[] array = {-842236, -782834, -517881, -86116, 548398, 387903, 444509, 928195, 496613, 495214, -722693, -7023, -568871, -739619, 275032, 363254, -690669, 892674, 704247, 872369, -286976, 907904, 89385, 837725, 478364, 19679, 507485, -203542, 79059, 559230, -329051, 122308, -216896, -186256, 769560, -791602, -227245, 194493, -238244, -566649, 412369, -94995, 762062, -612697, -812741, 144933, -837398, -371617, 332095, 982558, -1870, -672532, 368504, 587051, 65401, -846238, -961718, 839310, -743513, 377991, -864474, 919586, -324145, -369484, 486055, 176107, -713320, 756166, -548695, -24597, 628283, -628779, -860067, -22882, -985928, 969249, 469036, -618969, -799795, 711214, -106777, 387656, 205949, 15934, 202312, 341991, -332440, 40715, 957767, -645760, -386002, 108764, 858233, 661638, 756902, -105037, -809319, -457467, -810299, 6499};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques212(){
        Integer[] array = {530190, -549964, 862974, 358640, -367811, 993425, 741797, 717818, 745743, 719958, 954783, 80527, -958083, 686175, -51697, 60726, 461029, -272705, -275019, 98278, -22258, 801780, -625869, 825798, -376618, -277873, -487923, 209359, -99405, -231207, -371745, -825964, 331937, -25967, 886077, -62303, 999017, 328787, -451939, -445861, -234079, -241208, -665047, -258403, 933714, 916821, -90098, -384737, -682220, -344486, -794857, -837264, 359451, 391841, 904594, -705451, 672350, -775366, -284636, -136767, 813775, 143296, 856611, 341278, 657468, -943298, 158165, 361206, -386478, -22259, 965880, -809453, -199641, -18444, -429027, 285585, 514129, -414962, 820405, -886892, -562877, 483434, -811224, -35523, -525365, -613143, -711557, -862384, -798899, -659629, -279510, -302511, 655436, 49150, 843590, -393572, 763149, 254176, 823566, -226386};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques213(){
        Integer[] array = {620626, -637545, -333560, 715924, -858627, -814688, -79345, 362712, -546102, -971958, -462740, -367788, -652593, -438683, -627067, 987482, 303400, -442967, 423986, 904722, -170947, 825643, 489406, -537142, -487302, -555307, 730479, -220795, -515846, 174678, -489502, 907528, 869596, -288036, -663019, -121810, -19045, -707928, 167761, -126566, 951406, 874899, 18501, -102424, -743094, -201627, -932902, -181907, -956664, -815248, -481073, -825588, -462233, -711436, -998344, -588905, -313060, 481870, -746027, -374660, -73442, 817589, 924031, -242129, 636880, -266754, 37443, -434202, -147076, 918010, 597312, -156391, 245887, 184145, 539040, 665289, 506825, 42356, -649160, -767634, -395870, -656324, 753880, -718738, -439903, -395272, 449500, 214720, 77189, -12932, -750575, 498002, 340129, -109241, 605134, -350081, 939807, -347898, 960534, -172510};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques214(){
        Integer[] array = {711730, -558918, 842183, 74237, -300832, 975559, -574385, 250823, -456936, -443708, -598769, 150574, 573100, 581394, 568541, -264732, -4426, 904268, 17227, 325167, -716785, -905959, 582085, 139077, 124277, 684824, -742695, 63644, 746148, -997251, -40816, -393889, -316926, 843789, -956544, -232741, 742991, -520170, 760585, -555677, -388639, -92626, 276555, -799539, 318524, 798151, 55045, -459389, -427034, -663622, -214425, -170865, 235728, -923175, 508285, 58646, -195544, 744420, -330336, -19823, -612810, 159750, 648678, -53260, -209423, 100828, 624296, -278915, 354162, 130372, 648622, -285746, 103225, 978063, 885647, 437386, -914057, -704059, 609375, 538369, -276409, -905983, 134944, -964912, -34936, -460656, -266198, 380164, -521890, 347213, -268188, -846783, -868058, 164868, 728033, -241409, -685302, 979605, 595929, 170445};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques215(){
        Integer[] array = {524107, -934009, -72149, -967597, 497944, -360759, 469965, 32122, 415605, 827170, -216340, 489592, 446696, -131829, -694714, -465985, -144993, -505364, 188747, 355516, -17527, 110203, 194528, -958932, -432163, 969674, -965400, 688397, -981342, 533567, 261062, 124856, 714697, 448032, -397768, -634534, -544267, 166248, -264769, -384855, 240144, 311458, 351270, 563253, 730836, 495377, 342599, -338057, 22617, -434949, -44024, -168744, 116837, 669046, 95488, 425008, 467099, -682445, 54660, -698498, -483317, -806891, 358316, -125600, 364476, 475333, 475470, 610879, 187570, -123184, -64543, 827395, 363393, 246322, -890305, -219650, 525706, 386396, 523063, 791493, -99042, -483631, -261426, -794122, 589356, -878129, -382499, 170860, -261441, -764725, 671955, -275323, -163768, 376894, 583650, -147734, 388646, 108653, -445958, 185509};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques216(){
        Integer[] array = {-91314, -284296, -391816, 665006, 695019, 269210, -592611, -903981, -916909, 364841, -690056, -695696, -935182, -512509, -848126, -796061, -30355, -400082, -179316, -830145, -823894, -181415, 26460, -122111, 984151, 170994, -402288, 50294, -776726, -655493, 280795, 762731, 267154, -972064, 700531, 282149, -429167, 985557, -34482, -177825, 603440, -885564, -347749, 718774, 237297, -772509, -968632, 838282, -169203, 226805, 497335, 343722, -678102, -387416, 327430, -344717, 710546, 534265, -262382, -846018, -937150, 279930, 123023, 565007, 632633, -11006, -294080, -112233, -28304, 826350, 543943, 474190, 845935, 257046, 431430, 842756, 635417, 486818, -385814, 707202, 175868, -384115, -652653, -902668, -243306, -122551, 926501, -638888, 211457, -907720, -26387, -760350, -739789, 850088, 430077, -184619, -783818, 480940, -485588, -487023};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques217(){
        Integer[] array = {-703811, 249471, 362758, 946175, 342561, 252125, -792242, -919069, -185157, 175321, -115788, -840232, 233636, 619746, -194579, 96408, 510279, 200743, 372014, -402145, -707511, -131128, 277287, 147409, -489722, 1313, -768406, -876585, -558386, 965167, 236601, -276989, 96716, -890990, 792770, -954860, 855907, 505956, 492569, 901032, -716979, 529977, 299146, 73153, 911004, 247290, 503664, -264951, -441509, 455416, 756187, 879729, 928294, -851566, -135164, -31850, -196103, 695634, -843756, 561204, -175238, 969155, 375326, -376336, -29475, 870976, -42158, -67728, -385832, 942512, 301150, -752509, 145074, -916824, 383049, 305258, -571292, -94791, 881633, -45807, -831662, 990726, 771528, 878829, -969606, 493393, -502151, -865190, 215640, 560442, 345011, -708175, -433198, -398019, -342673, -68064, -13853, 577186, -115383, 46968};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques218(){
        Integer[] array = {-460254, -641320, -975556, -133050, 322681, 628270, -892972, -895566, 485944, 678294, 345168, -753737, 294014, -701730, 627079, -777799, -932044, 36220, -439319, -397726, -902148, 923498, -124088, -813252, -430392, 447022, -175719, -206629, 905839, -517145, 718239, -51449, 402122, -913886, -786449, 167587, 643263, 695498, -530603, 535730, -272754, 406551, 474487, 938493, -294922, 232050, -656657, -570423, 510980, -340692, -203455, -340387, 204582, -38599, -630167, 4520, 199114, -85472, -212838, 491547, -813398, 997082, -964615, 265862, 48412, 558436, -545615, -578886, 361039, -915926, 818219, -313791, -913084, 779556, 207149, 61868, 712900, -61558, -506214, 472771, 580245, -416373, 133198, 262451, -654380, 641059, -251055, -808981, 370695, 809738, 740676, 66133, -540087, -351854, -943334, -403663, -184974, -715613, 959885, 755866};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques219(){
        Integer[] array = {-544551, 744314, -908973, 187091, 558125, -245803, 385408, 800134, 289159, -924585, -435013, -273869, -690726, -605762, -677027, 364431, -935897, 979154, 535946, 672444, -741674, -167450, 46823, -857675, -674113, 14502, -245826, -754394, 657012, -533856, 529322, 707010, -176449, 93921, 333769, 998088, -221497, 695440, 630623, 829299, -479164, 467205, -78518, 74656, 779553, -963595, 790041, -1571, -612127, 610841, 407151, 618251, -9488, -610371, 943423, -102049, -522905, 539661, -161219, 935629, 192316, 824792, 626772, -345681, 238485, 991126, 297514, 730793, 976483, -649866, -372118, -780665, -218216, 616972, 876041, -624236, -468121, 67246, 192663, -521315, -31117, 20919, 139348, -308673, 295188, -837899, 105695, -434304, 117645, 32128, 269083, -264855, 451655, 355690, 529598, 153694, 831421, -321265, 473821, -319704};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques220(){
        Integer[] array = {-739214, -169811, 447941, 711531, -601657, -544241, -810621, -28881, 570700, 494689, -309332, -167255, -763987, 417500, -180434, -613653, 118582, 313060, -320709, 621733, 621555, -73323, 327747, -625206, 762666, 679645, -871195, 733156, -19188, 624063, 635955, 922499, 97104, -714160, -469023, 14659, 724619, -744841, -543136, -212008, -954325, 398324, -790421, -762481, -405472, -912491, -210512, 580750, -688696, 396981, 902040, -603663, 807414, 35892, 101398, -57788, 28037, -119600, 694392, 85739, -210165, -343952, 60754, 471180, -878063, 957496, 376373, -365513, 619561, -152705, -388289, -627759, -679918, 745072, 952983, 61693, 788979, -491365, -385313, 536301, 745058, -589359, -995347, -629947, -572762, -633838, 420943, -529253, -950845, -371015, -107291, -875642, 772480, -852342, -72339, 349220, 944460, -493119, 70055, 829063};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques221(){
        Integer[] array = {613455, -661616, 117255, -901713, 143649, 484411, -557796, -536754, -900860, -580687, 418493, 526825, -55319, 675119, -573986, -507806, -723561, 533994, 120129, -393012, -280553, 257333, 89842, -765591, 605397, -156726, 432518, 9994, 627470, 668100, -69772, -858524, 737407, -488899, -924030, -548953, -263923, -534303, -603690, 864587, -941051, -925012, 986153, -152856, 527026, -336101, -352305, -561624, 55200, -251628, -314810, -736157, 113784, 184825, 474165, -450615, -964836, -377017, -796946, 387303, -858650, 772082, 388419, -204160, 352887, 447784, 325666, -609355, 959248, 783741, -380870, -175045, 697246, -216193, 402086, -131193, -436769, 537485, -847875, -955883, -685744, 949873, -162890, -296952, 301145, 826139, 312438, -546777, 259523, -717062, 904163, 594113, 88372, -444207, 74576, -693540, -780902, -688901, 56419, -205776};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques222(){
        Integer[] array = {-39337, -421182, 943276, -195160, 134057, 9443, 666160, -851039, 226724, -543340, 544842, -684150, 686247, -643154, -830767, -18347, -791334, 282435, 856846, -886558, 756060, 824919, 90950, -155792, -227124, -452261, 131710, -445964, 838974, 426553, -934545, -719495, -32885, -844058, 865636, 801624, -401059, 811138, -622421, -375095, 456220, -689394, 63977, 386360, -819777, -932163, 124692, 612831, 955244, 658988, -180313, -605035, -938782, -262235, 230516, 853505, 610152, -279170, 245084, -433239, -42201, -876808, 281600, -833870, -257759, 825514, 707002, -521852, 512791, 279143, 373449, -695988, -243386, -307348, -137304, 456974, 232576, -895470, -694408, -593971, 118529, -253646, -640332, 202655, -970711, 923005, 298334, 113392, -189686, 399578, 539922, -775948, -368370, 792960, -250571, -329777, -204461, 706591, -661682, -85121};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques223(){
        Integer[] array = {-208645, 189929, -97569, 263669, 420036, -604036, -268720, -695582, -728467, 97489, 555386, -571964, 394733, 64472, 327710, -240583, -491429, 87814, 25041, 704598, -520631, -121601, -412191, -228457, 820613, 701311, -685862, -342773, 250974, 804739, -201779, -565086, 674537, -216970, 317764, -884590, -804615, -214582, 388305, 935845, -617232, -305418, -265037, 864097, 859078, 575961, -440684, -684887, -632462, -969906, -263194, -405922, 486577, -254962, -63784, 137800, 747802, 107920, -811743, 20727, -605622, 344891, 411630, 226667, 672909, -486998, -678547, 262052, 827102, 188112, 153339, 46033, -956435, -754003, 820551, -20409, 928326, 261456, -871169, 884819, 514299, -689697, 110692, -3849, 118211, -679768, 815718, 946936, 444698, -983536, -718233, -941903, 316299, 745111, -231951, -104382, 197199, 262031, 306962, 421835};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques224(){
        Integer[] array = {352877, 194435, 152981, -833610, 958971, 890609, 636791, -15852, 613339, 735681, -756502, 341988, 978840, 382283, -414584, 987684, 924330, -593140, -293127, 150015, -526501, 424165, 661659, 242488, 547564, 623344, -200007, -715048, 963275, -148518, 401470, 492396, -298124, 174093, 907922, 955973, -522885, -408909, 828244, 541063, 497739, 985799, 767113, 849263, -469080, 962930, -479981, 935871, -688529, 507145, -12170, -745182, -364537, -175580, -529820, -720514, 957815, -649775, 481672, 63653, 660952, 453006, 179752, 80384, -284127, 363263, 603535, -325443, 223010, 896340, 433738, 510969, -900236, 518486, 653308, 254069, -587570, 866499, 551462, 945524, -43406, -86461, -832002, -15941, -767475, 148122, 47326, -534279, -997, 127863, 374507, 861839, 364144, 328554, 910822, 23932, 52890, -659757, -752840, 92708};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques225(){
        Integer[] array = {827927, 188966, -562395, -337641, 656718, -202011, 647108, 732958, -141832, 323599, -941725, 57934, 231482, 55093, -935976, 85974, -859222, -411257, -554283, 110739, 164098, -576527, 472206, -39444, 282717, 913588, -820170, -732171, 521330, -934027, 760850, -465280, 730041, 220966, -430622, -474022, -641000, -153790, 288457, 632176, -984687, -475427, 575946, 928190, -625379, -169879, -654027, 984529, 367857, 470872, 561829, -809285, 787205, 825057, -445835, 662615, 867325, -676678, -789233, 987402, 144885, 173952, -70555, 448292, -758947, -386405, -328203, -179472, 494606, -597584, 764860, -452964, -771680, -993063, 475859, 789425, -236482, 959639, -823688, 927080, -51780, -789253, 550397, 194945, 156932, 504770, -659264, 287946, -218461, -84422, 130050, -261629, -118680, 3904, -195031, 306339, 34703, -117024, -586262, 219228};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques226(){
        Integer[] array = {491578, -726194, 622555, 261509, 957625, -843201, -669160, -170152, 243358, -31945, 402027, -926736, -70059, 817605, 854956, 128577, 55079, 948848, -788843, -786061, 63647, -627477, -339690, -305884, -209673, 386208, 402731, 476824, 525915, -655006, 836127, -886953, -891205, 929230, 933943, 354846, 652933, -436075, 336929, -533787, -480559, 565152, -378272, -259391, -917331, -936656, 229657, -379936, 760399, 80928, 641577, -808013, 361674, 500611, -147627, -894926, 785545, -940989, -574360, 307450, -399188, 530983, -364733, 433090, 136157, -676630, 176108, 201509, -913703, -420849, -163052, 316165, 816014, -351491, -642997, 437355, 715697, 326143, -444929, 693005, 87975, -696904, -491029, -594282, -97695, -820454, -819749, -23571, 149440, 622851, -489786, -904942, 505077, 433701, -302666, -85243, -375262, 48672, 698542, -638284};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques227(){
        Integer[] array = {996125, 966334, -989454, 919981, -946958, 1973, 909941, 123911, -684494, 474796, -109744, -970711, 791321, 663661, 94165, -966400, 697180, 519252, -578013, 550462, 680381, 268670, -619116, 55400, 594556, 14024, 92381, -832032, 674404, -752038, 587987, -397862, -457280, 251861, -574225, -868300, -296354, 501760, 955195, -676058, -18302, 83529, 551659, -621764, -28922, 734633, -911539, -45213, -419211, 334470, 874690, 986545, 900495, 934053, -323461, -548152, -817163, 799234, 202897, -425033, -462747, -953618, -780916, -106095, 155419, 757650, -179408, 489090, -380166, -572291, 668565, 185023, 215070, 421875, 8473, 45640, 808280, 887323, -775184, -968673, -674252, 175844, -959970, -320447, -413124, -272610, 300509, 874797, 917443, -649880, -256026, 454025, 617276, -554080, -952975, -130604, -40059, -590415, -508573, -138291};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques228(){
        Integer[] array = {1385, 763503, 250818, -796232, 738936, -382912, -187673, 543400, -362058, -732167, 369556, -448540, 929670, 123443, -474566, -501976, -266695, 850467, 485798, 533419, -737513, 626344, -108050, 744033, 770179, 980824, 316598, 377584, -674482, -893853, -234290, 382215, -980078, -191913, -616123, 69790, 988892, 886317, -778418, 378265, 74337, 153108, 683020, 395268, 505452, -736502, 154649, -240499, -557927, 392267, -39154, -687838, -330904, 897777, -704426, -116628, 918697, -280334, 731964, 563740, -131931, 877076, 572625, 94516, 416658, 635629, 727297, 44071, -95480, -593184, 92289, 699997, -345601, 411229, -539475, 72513, -320895, 262666, 970297, 613121, -989190, -335248, -276162, 356637, -931242, -241680, -474100, 35053, -7831, 927172, -473340, -345663, -584213, 295348, 142508, 803368, -109524, -889737, 23591, -716910};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques229(){
        Integer[] array = {905987, -468212, -697775, 636948, 523859, -363700, -697166, -173355, 886218, 945314, -916765, 803510, 48608, 423900, 780136, 367332, -306782, 280889, 679450, 821657, -810429, -52997, 970189, -832973, 465534, -384116, 295142, -42595, -869919, 589947, -432341, 739202, -682096, 412231, 682680, -201862, 296270, -723374, 208589, -106946, -564564, 159681, -666321, -66752, 843288, 167304, 141153, 551905, -838356, 275282, 691664, -270297, 77070, -503910, -392583, -345816, -304636, 996573, 430048, 404034, -718229, 708919, -591346, 61653, -30740, 107759, -513486, 467226, -112632, 528082, -241338, -576899, -615842, -763495, -378885, -681799, 824995, 603812, -518411, 179079, 521927, 833655, -569536, 417504, 521276, -476447, -228965, -436859, -402835, -252321, -262248, -117684, -171363, -160389, -460695, -815853, -846436, 459134, -70031, -874361};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques230(){
        Integer[] array = {-834770, 886211, 786423, 198632, -21160, -4178, 468326, -854265, -698531, 867146, -213714, 708932, -840584, 479293, 31359, 695038, 151356, -738321, 338898, -266848, 635746, 291762, -13116, 485159, 88688, -890282, -562938, 723558, -705806, 84434, -802142, -268627, 208450, 131517, -64746, 820444, -997982, 830803, 36752, 541236, -646297, 878065, 519315, -475350, 162070, -965913, 468105, -965143, 88495, -715909, 838059, -256902, 14381, 815921, 526482, -451993, -428171, -65072, 174183, -600543, -401651, -702280, 893572, 878579, -303997, -623995, 79025, 273994, 426822, -826921, -240844, -912673, -136750, 295488, 626079, 719947, 409842, 994261, 563966, -368176, 298049, -167269, 302931, -37017, -873442, 800503, 379627, -382273, 760325, -772227, -219290, -951805, -736580, -468350, -201369, -966971, -133746, -235252, 57133, -267389};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques231(){
        Integer[] array = {-523663, 763590, 312916, 876311, 287119, -156655, -705313, 203035, 675370, 550262, -414450, -691708, -596569, -199385, -878425, 65283, 68342, 938907, -169718, -32369, -190232, -432843, -848504, 659308, 576340, 274989, -223404, -178464, -116883, 588924, -429401, 163448, -561559, -805854, 912677, -185807, 450802, -314281, 979658, 912563, -835100, 777933, -935113, 468511, 1879, -169305, 50268, 310849, -249377, -943292, 374859, 173884, 809265, 731454, 817414, -800154, 120629, 210856, 502463, 78092, -527968, 134028, -901193, -102229, -80319, -163030, 406873, -525551, 23136, 578827, -153792, 358897, -478947, 796585, -529043, 827766, 52371, -177699, -79598, -95035, 582676, 858176, -309818, 981607, 256587, 835901, -157732, 534969, 168554, -265588, -532623, 173587, 184399, -164996, -391098, -12502, 631345, 484984, -683103, 556073};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques232(){
        Integer[] array = {-792665, 456693, 992000, -861773, 956575, -58362, 975469, 573779, -45435, -762642, 303857, -317571, -51655, -302629, -687261, -589165, 152979, -241748, 487888, 627829, 87702, -323452, 17606, -576213, -449739, -694587, 464321, -471378, -927446, 779592, -92015, 714441, 78012, -279490, -353601, -318476, -285563, 828215, 643423, -321934, -541899, 755441, -764867, -8213, 598546, -540947, 517952, -106979, -192204, -764253, -317759, 161966, -744813, 674086, 630289, 441794, 811767, 927100, -452840, 64281, -125577, 260144, 807749, 294047, 489013, -774967, -663026, -346682, -414570, -668042, 567461, 843953, -53904, -977660, -259061, 981581, 603226, 802605, -340418, -245675, -106477, 593863, 839345, 961939, 277965, 7652, -672120, -363285, -852597, -867787, 508152, -467302, 560253, 377292, -556120, -437109, 796411, -616474, 363355, -485364};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques233(){
        Integer[] array = {413192, 429025, -280023, -126038, -507485, -730405, -676606, 337136, -83517, 296841, -735788, 115903, -159715, -481415, 96940, -534804, 489566, 162431, -383527, -202935, -712335, 744658, -636746, -785131, -386577, -246113, 442432, -174658, -77831, 614307, 388727, 332846, -968624, -529498, 896836, 864726, -664852, -995982, -908881, 190882, -910783, -759935, -399326, 52025, -447163, 968643, 17122, -962237, -81302, 109673, 921785, -89616, -675628, 537502, -534892, 227826, -555039, 707494, -496862, 566728, -741535, -913691, 173889, -562913, 735135, 424487, -553272, 475134, -625852, -435478, -924031, -965500, -150586, 24801, 427014, 980415, 515703, 963750, 289148, 551185, 789092, -16041, 220298, -664593, 881237, 882968, 994738, 545397, -152396, -88955, -781526, -929758, -788287, -663915, -854838, 718425, 736753, -854190, 77728, 942259};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques234(){
        Integer[] array = {764478, 705417, 64667, -625018, 733320, 421715, 380403, -73434, 500345, -853010, -163103, 524225, -165639, 912889, 983907, 685543, -388569, 609761, 929710, 237187, -943166, 30769, -202704, -285954, -813926, 503872, -105981, 309689, 336511, -248914, -480461, -500202, 920137, 730485, -326735, -674992, 304675, 530328, -905990, -931474, 28110, -823320, -820731, 849374, 677172, -311974, 4642, 755701, 63175, -357028, 863824, 941695, 815065, 403193, -12748, -310064, 513466, -865646, 30611, -681526, 209607, -576970, -195584, -200100, -468649, -737720, -786332, -642800, 370716, 80729, -463523, 84152, 492272, 49044, 193197, -376032, 619564, -944744, 788980, 613848, -293561, -56226, -523345, -533216, 35885, -632989, -802223, -490438, 420775, 44715, -353889, -615109, 555126, 376748, -60141, -439436, -573416, 748436, 706977, -454737};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques235(){
        Integer[] array = {-237461, -652090, -820311, 470422, -638037, 118556, 713687, -208576, -122118, 586137, -939008, -708611, 597085, -642164, -865727, 216145, -277051, -331501, -596898, 68858, -479011, -362216, 927736, 188006, 688894, 780600, -472453, 884189, 373810, 934433, 304908, -653576, 588609, 370830, 934622, 27323, -214211, 108447, -789802, -208496, -498123, 546119, 7142, 1640, 354769, 557430, -581025, -34809, 295844, 294387, 368674, -168154, -980715, 186557, 474875, -954150, 626319, 175886, -272306, -363720, -665720, -171619, -941877, 922446, -806272, -978125, 793001, -338894, -407092, 443935, 31587, -330247, -49042, 750915, -517474, -122602, -743814, -768457, 257203, -295598, -231398, -573635, 175658, -273956, -581339, 291086, -834100, -127268, 860712, 950265, -636632, -804755, -192523, 9546, -393400, -13018, 590923, -186973, -945279, 325723};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques236(){
        Integer[] array = {302263, -515789, 224631, -169491, 622908, -874636, 120566, -330254, -836301, 707700, -500927, 505576, -233349, 676518, -29066, -125770, -983304, 548298, -282499, -287242, 475427, 745205, 426108, 541204, 114946, -519846, 851755, -218614, -882258, 810178, 25425, 604443, -369833, 330971, 175384, 182937, 379256, 67831, -795109, -226961, 529120, 44176, 890022, -576524, 942882, 921917, -233998, 292974, -108652, -805160, 460523, 109293, -971092, -57848, -105185, -207697, -541895, -170649, -844210, -677999, -136421, 87687, 256391, -414784, -126500, -861782, -8637, 937370, -294076, 372780, -237373, -597842, -573217, 653136, -152483, -301951, -275222, 617904, -803271, 280508, 906467, -594283, 411945, -483671, -274048, 637618, 83213, -866623, -628346, -945109, -708582, -821759, -501633, 676252, -636836, -818101, 693494, -671315, 115057, -232841};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques237(){
        Integer[] array = {235297, 931460, -627522, 551559, -483999, -262345, 485730, 224272, 667366, 936399, 934879, 88479, 64510, -232703, 300098, -678373, 909964, -466865, 666088, -880752, 374345, 668660, -358258, -632224, 445847, -502467, 124554, -358165, -56090, 515334, 531701, 354117, -517396, 166043, -596974, -264915, -729573, 125805, -130503, -769419, 646456, 446334, -916470, -638463, -273411, -879433, 190386, -503390, -593613, -808425, -587690, -182574, -815563, -125600, -645026, -765431, -643426, -739259, 283885, 495003, 691723, -306175, -550372, 302293, 40816, 148053, 947736, 14071, 810177, -946771, -503660, -527786, -568573, -121247, 239336, -899358, 962913, -554375, 103692, 609301, 843853, -794785, 95380, 275929, 243432, -451610, -831032, -416753, 620673, 652699, 46680, -43537, 590585, 92391, 685499, 249879, 40962, 610793, -201631, -136273};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques238(){
        Integer[] array = {601869, -140010, -217855, 962136, 977580, -360535, 225555, -785338, 677733, 555922, 830385, 730524, -498583, 920888, -174938, 771605, -531640, 708026, 33794, -383698, 717812, 617745, -524618, 203150, -439582, 500274, -494072, -450965, 534860, 666023, 590824, 638307, -602405, -261732, 622431, -250862, -260940, -840078, 436015, -821011, -55591, -44973, 324746, -987009, -963446, -234356, -128978, -223239, 117550, -658247, -932919, 800451, -978164, -932323, 947050, -174087, 601767, -660057, 813135, 483082, 647287, 204963, 579907, -797439, -163763, 179904, 710494, -884589, 655764, -718159, 70695, 601131, 823999, -986623, 71955, -760657, 650394, 128705, 412949, 919783, 833590, 520044, -917479, -54782, -763158, -229837, -999377, 669215, 707719, -403192, 100223, -571877, -450054, -333272, 295671, 265375, 348466, 592935, -728387, 216807};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques239(){
        Integer[] array = {640101, 782958, 375452, -50664, 683476, 644847, 116841, -120997, 956123, -716583, -3385, -545209, 403462, -133589, -640514, -16144, -633370, -223047, -299042, 82076, -115085, 63897, -951659, -969584, 747025, 484085, 544456, 657021, -714008, 952742, -800201, -85247, -193607, -556604, 46152, -267816, -859074, -942996, 896548, -192773, 560955, -187622, 678786, 61484, -765216, 853305, 297728, 998543, 472000, 597185, 336261, -95276, -922475, 814909, 663099, -503938, 843604, -237997, 183536, 238508, -846898, 788153, 71176, -672245, 704360, 413537, 939029, 466368, 799375, 884986, 627800, -616178, 588757, 173994, -755441, 806445, -353028, -241716, 457470, 574103, 235812, 370012, 110702, 977498, -212460, -984635, 539970, -45796, 251737, -147712, -839006, -347772, 881528, -501167, 630367, 664403, 14696, 726921, 852357, 447304};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques240(){
        Integer[] array = {-92943, 292302, 475386, 707226, 883124, -979168, -401532, -613890, -212265, 217304, 983760, 855761, 154766, 257696, 808114, -142687, -723131, 645041, -603217, 97230, -813114, -717419, -775629, -272830, 927555, 510373, 460524, -897507, -217723, 458901, -271601, -70066, -718373, 881147, 626018, 97289, -942518, 705505, -267389, -994456, -364553, 741469, 114837, 205018, 888883, 625623, -293640, 134585, -975725, -577615, 186761, 66944, -28249, -996092, -516771, -477528, 496276, -179779, 605031, 753993, -61460, -190070, -169569, 226850, 636895, 255663, -885533, 839684, -563704, -625104, -337304, -151289, 148046, -791652, -686162, 941591, -548542, 95201, 456633, 248342, 173664, -469924, -230741, -86376, -62916, 700896, -411307, 145057, 336275, -969396, 456948, 869575, -588960, -975417, -177106, 609546, 429319, 732808, 225444, 447888};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques241(){
        Integer[] array = {-951809, 366806, 243943, -945177, -645382, -731902, 828983, -348280, -313164, 892666, 564809, -823442, -945484, -405186, -340656, -464790, -290001, 567403, -99432, 617440, 406361, 159192, -782978, -835016, -937565, 481799, 683961, -107675, 864413, 407086, -576497, 607431, 408177, 50027, 238053, -757887, 613510, -283899, 731423, -678946, -504371, 420176, -430914, -522206, -348454, -600364, -770944, -984857, 37672, -516371, -277952, 542070, -896763, 35653, 940540, 987873, 256244, -834188, -833244, -709127, 293129, -982242, -406754, -270595, -445570, 374603, 740931, -986056, 12092, 101038, -262202, 700870, -239217, -798088, -851500, 812141, -371693, -393301, 323464, -36490, -830838, 663660, 985751, -769649, 366925, 258201, -717015, 113464, -507957, -411985, 702769, 795507, -654242, 529195, 322885, -438803, 832687, 875796, 24214, -572805};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques242(){
        Integer[] array = {-38497, -259785, 101545, -779603, 104125, -97675, 783263, -907050, 571724, -924371, -581199, -74225, -823023, 701233, 228515, 75672, -974644, -944871, -315521, -652228, 923281, -451318, -817035, 48609, 136209, 770596, 592636, 859280, -942484, 658426, 751601, 970670, -263427, -228866, 656128, 574165, -89865, 473992, -362007, 285065, 189458, 21425, 89510, -622686, 576651, -710756, -272672, 795954, 421015, -885672, 106207, -535031, 974470, 640731, 524891, -946873, 663810, 827074, -342444, 681626, 671871, 926402, -450281, 667664, -773137, 531169, -896429, -388096, 877677, 528146, 137059, 676871, -732733, 403673, 902005, -630936, 115592, 792334, -369537, -805199, 589901, -497302, -269210, 824734, 235224, 737846, 916246, -430945, 814987, 44652, 98474, -353632, -969409, -769651, -995962, -454288, -447221, 277572, 584002, -820606};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques243(){
        Integer[] array = {320028, 59181, -205087, -244262, 939358, -631595, -112006, 825735, -266309, -570168, 233873, -200124, -908854, -110483, 938981, 341222, -885345, 478037, 675424, 551261, 680299, 277177, 224540, -473148, -361451, 337199, 212879, -235973, 489187, 288187, 24638, -282921, -124809, 364116, -837865, -942779, -111000, 62267, 354424, 138757, -526750, 625395, -922859, 799357, -25934, 748367, -382037, 955918, -598102, -570864, 920639, -623338, 949553, 134148, 700908, -96283, 134735, -607153, 75075, 631739, -159603, 417012, -234723, 23107, -304738, -718537, -773232, -233931, 292108, -530975, -726417, 928094, -308824, 789065, 967952, -628586, 636529, -577692, -62273, 259795, -378905, 846060, 573552, -641969, -134285, 420728, 602916, 277930, -34084, -185843, 938104, 693648, -321070, 977721, 834352, -270458, -822653, -714907, 169791, 646418};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques244(){
        Integer[] array = {-235021, -365761, 454843, 906030, 731322, 217623, 265676, 569319, -17126, -908048, 752811, 435613, 281464, -386988, 252995, 328329, 286988, 274915, 575514, 814184, 156941, -857501, -780831, -321440, -382779, 832311, 548474, 845500, -204553, 470966, 470567, -716503, 664813, 5228, 845981, 916648, 844423, 294267, 983203, -180571, -900590, 992144, -919222, 433023, -702408, 322623, -876874, 886181, -490764, 383808, -769149, 468713, 719895, 560491, -911367, 597488, -773989, -410507, -377787, -809319, -207067, -425207, -448403, -112717, -749761, 427611, -196788, 240118, 775678, -209527, 277278, -322081, -4521, 602745, 926869, -780168, 37180, 944934, 532656, 177575, 390677, -238494, -914266, 112633, 977988, -36282, 663587, -208852, 935002, -536371, 652327, 480563, -198379, 157839, 632698, 488884, 564225, -492232, -322841, -346409};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques245(){
        Integer[] array = {-368643, -656079, -278370, 537941, -842273, 711092, 174093, 648115, -372627, -867592, -409002, -207464, 393596, -733395, -624358, -733255, -773529, -818494, -835046, -696188, -173888, -949836, 428014, -582083, 645387, 602035, 571844, 811586, 784688, 520020, -127321, 524590, 175883, -649215, -161154, 328349, 385636, -584011, 202753, -196443, 945702, 223647, -318392, 854819, -244699, -997871, -195249, -990069, 806209, 152651, 333874, -199145, 839423, 245720, 888314, 925899, -904027, -991460, 531814, -159801, 638255, 946954, -267651, 909103, 586511, -370451, 598140, 383318, 487381, 631525, 198162, -96056, -69893, -831934, 394053, 769866, -4885, -471603, 149453, -743506, -248302, 202454, -914409, 886566, -254053, -952464, -308827, 277897, -447323, 648673, -742270, -863388, -842341, 98209, -570786, 362820, -257407, -82662, -500693, 883613};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques246(){
        Integer[] array = {-714330, 955566, 77606, -125288, 761473, 14181, 48136, -996331, 400136, 553149, -245494, 866683, 617328, -743078, 173087, -568099, -357266, 268134, -27727, -822207, 983122, 200381, 759984, 997524, 516849, -799485, -361492, -630046, 440374, 436347, -381339, -936109, 587681, -866965, -505614, 77692, -748182, 407121, -815073, 95389, 100115, -736397, 901998, 268773, -765553, 951177, -585176, -189829, 401460, 851091, 674477, -110059, 992178, 555970, 639025, 664189, 463740, 276496, 494661, 303694, 55021, 965842, -36193, 978577, -520544, -933782, -900573, 533009, -580366, -120810, -999921, -501939, -200324, -926620, 501113, 528980, -474439, -742108, 108078, -168008, 377939, -144648, -810782, 159445, 947719, -542143, 839016, -446291, 126850, -820617, 540837, 434504, -22547, 974289, 841164, 923036, -902422, -818342, 670499, -525229};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques247(){
        Integer[] array = {974423, -824902, -360565, 559901, -661062, 82202, -371827, 581706, 441365, 872730, 614211, 477849, -53006, 411989, 476751, -812346, 212230, 179997, 241258, -492217, -92002, 762736, 328187, -176894, 583062, 227664, -510403, -847893, 951623, -901405, 524335, 761265, 892142, 201611, 783829, -102685, 153073, -318849, 783155, 569072, 720397, 955315, 681611, -585802, 775437, -217250, 72417, -299049, 991852, 617494, 988995, -735323, 969963, -53486, 871270, -159009, 255588, 89529, -338407, -619860, -635591, 242749, -214453, -297982, 261865, -561237, 485590, -224783, -590324, -388279, 322495, 83897, -645296, 717437, 850096, -375431, -136993, 632213, -926701, 887051, 604594, 538674, 807112, -167205, -354118, 898985, 345666, -949798, -96840, 411547, -429318, -306926, -847186, -299894, 51169, -158488, 174467, 971414, -341928, -252726};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques248(){
        Integer[] array = {836177, -935950, -935396, 6130, 782917, 424535, 775841, 122078, 579599, 621438, 863464, -766142, 708285, -240025, -828392, 968839, 915347, 398809, 540077, -85751, 786213, -464267, -106152, -818845, -881613, -571745, -617153, 648231, 733825, 520486, 287449, -26393, 895566, -803774, 353333, 620834, 581120, -279321, 633942, 32886, 333888, -660390, -901338, -405318, 81725, -179766, -307100, 669507, 158003, 315000, 421733, 45002, -607980, -714973, 373315, -434104, 456446, -855582, 832477, 266672, 290705, -783008, -200106, -427370, 636471, -241874, 837761, 41051, 464344, -634636, 646081, 818826, 897097, -333541, -827519, 661656, 678262, 622010, 866766, -302223, 633744, -972070, 776671, 185557, -529896, 346129, -320747, -436945, 750645, 702615, 452596, -541646, 400747, 831103, 243838, -955498, 747572, -405728, -491937, -483151};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques249(){
        Integer[] array = {-995330, -113358, 563981, -534310, -100037, -865961, -557514, 385653, -988140, -791256, 684073, 777348, -157467, 32556, -23934, 686716, 417022, -725229, 330863, -440342, 144458, 652438, 477655, 878140, 793059, -79004, 645257, -84639, 762875, 102739, -140620, 36276, -734790, -84697, 472904, -271989, -498966, -674472, 475607, -888173, 608238, 457236, 720383, 822545, 413230, 205162, -472063, 645164, 232459, -689560, -458319, -74427, -962727, -107319, -132005, -621360, -829617, -859219, -143680, 138416, -932, -683739, -703644, -532555, -378917, -529461, -312968, -195770, -580181, -302573, -435599, -316312, -588322, 445797, 656396, 467614, 356641, -463768, -542190, -152959, 121709, 950816, -700544, 878754, -71955, -452141, -263227, 399961, -843474, 957960, -214642, 581302, -839599, -118063, -179212, -583202, 701131, -771902, 406008, 256178};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques250(){
        Integer[] array = {-262218, 74289, -217597, 977114, -820863, -21725, 511719, 971655, 770218, -913905, 22923, -827872, -91771, 899170, 490170, 709862, -818992, -762859, -546286, 514774, 272011, 361173, 286943, -759944, -955208, -214208, -823610, 552033, 340021, 785083, 732297, 181802, -35216, 594774, -324639, -403663, 358262, -127529, -432943, -827755, -586457, -150906, -482448, -911937, 715808, 282938, -683343, 238679, 16518, -596079, 714364, -921531, -814434, 66680, -746227, -544354, 724799, 131800, -392426, -373863, 982399, -92739, 297983, 680868, -747010, -465880, 869366, -215711, -885621, -644944, 817450, -12871, 543535, 575721, -900488, 811069, 335715, -56426, 237926, 54450, 587141, 527029, 474048, -176472, -778739, 294738, 930693, 648640, 562927, -361277, 343617, -140637, -32608, 686345, -366467, 451991, 818930, -389665, 113944, 136547};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques251(){
        Integer[] array = {433937, 797716, 426487, -490756, -852716, -830008, -759718, -630128, -95232, 69662, -649667, -57035, 588834, -751275, 571125, 655463, 453018, -351229, 337713, 249551, 247366, -153174, -234164, 932374, 479199, -664288, 105701, 68046, -417998, 508831, -137627, -505947, -661773, -443976, 120646, 487247, 522278, 170816, -613741, -141837, -634968, 601192, -549254, -35997, -260016, -427637, 78403, -538648, 661331, 383486, 256885, 330719, 198953, 314122, 629982, -800599, 297303, -329401, -348515, -702468, -454639, -521226, 357773, 33500, -903922, 519946, -372595, -752401, 457602, -304353, 973128, 493650, 768780, -825958, 390806, 666137, 599251, -246854, -998378, -990340, -738344, 885895, 577702, 364887, -121346, 214046, 828584, -610444, -572688, 709787, -758575, 984568, -228802, 994181, -598237, -291739, -393586, 256250, 651299, 524937};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques252(){
        Integer[] array = {-102391, -132330, -394174, 224570, -693833, 60510, -315690, 544206, -194546, -524647, -69143, 797192, -8214, 933358, -681640, -586641, -159067, 638087, -414476, 525844, -517908, 142508, -826991, 918915, 126546, -812304, 14960, -712775, 493768, 548724, 805666, -818901, 241178, 7780, -258635, 608181, -878170, -960996, -660527, 794791, 117414, 669751, 30393, 410968, 670490, -936721, 779094, 901958, -840857, 946345, 996607, 556668, 195785, 650543, 19359, 384245, -870537, -270401, 419398, 832109, -936121, 129372, 165417, -498123, 302977, -216997, 689206, -330074, 529577, 661263, -570985, -30314, 580948, 238109, 809476, 204701, 194864, -400754, 870459, 744707, 591167, -223415, -817122, 430306, 249122, -281394, 185524, -377479, -59454, -958732, 595214, -268219, 863924, -94832, -41879, 6961, -793592, -168507, -508889, -811755};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques253(){
        Integer[] array = {-804939, 532810, 339076, 501183, -99247, -625442, -163753, 279487, -815841, 185118, -77396, 240776, 689112, -65844, -851558, -450215, -453269, 160283, 610682, 451575, 640581, -347187, 719871, 466888, 559160, -665992, -633515, -764793, 944710, -882769, -142984, -899999, -343163, -439357, -380137, -616551, 982698, 873499, 116239, -22007, -515822, -51935, 296365, 295833, 40694, 28086, -818283, 758371, 218464, 352284, -231425, -951073, -925676, -643375, 968037, 746545, 659342, 93854, 222711, -193569, -431113, 7717, 195252, 73220, -245685, 89151, 949033, 571696, -597837, 543252, -697162, 228105, -695108, 353518, 186956, -863322, 303375, -792812, -158510, -339406, -457968, -930036, 168037, -523918, -470054, 674416, -928381, 909464, 683431, -150354, 784234, 458546, -882637, -694372, 209406, -181347, -568528, -856262, 8510, -850028};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques254(){
        Integer[] array = {-159992, 585926, 181923, 842144, 42118, -712641, 49980, 723604, -737475, -87770, -778669, -22271, -792521, -599407, 239684, -299982, -359217, 623848, -469845, 647764, 316192, -130039, 393170, -714137, -961295, -391167, 834882, 215513, 75582, 268801, 950656, 219129, -530850, -18289, 112042, -740625, 520501, 889700, -950709, -656740, 830674, 854508, 167249, -313732, -912150, 369482, -657756, -553435, 59217, 895911, -927433, 850879, 663274, -768183, 57562, -717731, 409136, 729458, -333512, -923427, 30088, 693116, -50423, 464816, -749086, 373707, -900296, 817024, -696253, 8272, 151135, -84431, 988339, 842203, 576831, -379515, -458869, 271027, 87226, 362805, -333178, 796276, -404289, 508284, -11515, -368824, 676016, -10182, 999249, 524934, 765336, 225251, -186761, -528202, 767841, 202342, 256170, 130155, -168717, 192367};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques255(){
        Integer[] array = {761233, 461996, -44736, -231621, 172385, 978829, 384398, -237561, 278160, 871422, 980493, -901356, 206118, 427812, -56946, 420824, -799932, -905402, 209924, -479562, -613994, 814859, -879440, 861613, -165351, -927691, 642980, 620275, -761190, -98263, -41223, 330575, -407057, -490215, 124841, 527, -158284, -637666, -718788, -966130, -626629, 413719, -885900, -686559, 687037, 394668, -161037, 989718, -254235, 568483, 241503, 606702, -3797, 714636, -371593, -952570, 175459, -794103, -491343, -338839, -305645, -213019, 187321, -498152, -78013, 132193, 86322, -333243, 182207, -715944, 953173, -15888, -277070, -97388, 38419, -803689, -990920, -949951, 74400, 378266, 685544, 90112, -738727, -708590, -125057, 176735, 850473, 115975, 568103, -692685, 483866, -405859, 797593, 125618, -628370, -51490, 319638, -25750, -843257, 563843};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques256(){
        Integer[] array = {-425143, 605436, -437476, 61847, 787215, -723116, -820848, -552071, -289957, 20309, 594730, -704584, -186029, 281441, -69618, -751745, -854998, 970795, -726220, 306478, -850875, -215819, 754409, -211160, -972060, 392856, 779314, 841500, 164227, 348299, 265816, -280714, -584009, 576492, -92930, -583648, 524111, -105217, -106487, -293746, -756799, -532483, 25874, -58700, -730654, -510119, -24086, -200714, 869997, 264361, 568459, -118378, -332667, 726455, 796349, 842653, 685127, -772393, -644486, 767448, -593234, 419371, -263568, 299251, 284701, 91793, -182294, 204587, -582077, -214106, 53652, -611848, -63117, -672253, -714598, 674185, 456104, 327303, 165494, -4787, -57454, -724635, 502048, -163018, 521458, -481895, -307657, -197206, -65836, -412607, -962359, 79113, 795834, -223403, -615263, 944939, -905554, 439732, 335694, 749913};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques257(){
        Integer[] array = {-898216, -804071, 797252, -884796, 550269, -75037, -297177, -55776, -414589, 2985, 70144, 124530, -654111, -797043, -807899, -593618, -584312, 269638, -384112, -496131, -655919, -16739, -787006, 345222, -160104, -296122, 585898, -163687, -711077, -129885, -723442, 632217, 763640, 200725, 241257, -993516, -709195, 375358, -111725, 958676, 927005, 782526, -516996, -879143, -929281, 847766, 436636, -395030, 736614, -651942, -899961, 106215, -142848, 26927, -788366, 574429, -881770, -261417, -38001, 530529, -865972, 753881, -718416, 586948, -634567, 457026, 208409, -770171, 828501, 330833, 67950, 256098, -411662, 914801, -315122, -559913, -421164, 902147, 813326, 60104, -171853, 556476, 141360, 697387, -979387, -473939, 134673, -553447, -709563, 431996, 572788, 676733, -15390, -855592, 746890, 589964, 881368, -402516, 484166, 355172};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques258(){
        Integer[] array = {557701, -363779, 127293, -391880, -876174, -786195, 452699, -5661, -26199, 183593, -150820, 759012, -554094, -48106, 272881, -825974, -764889, -224769, 548042, -258755, 970604, 526603, -66581, -234279, -597454, 575852, 777380, 941382, -489519, -91826, 51035, -505540, -776421, 552250, -417473, 529639, -913975, -32923, 322175, 78438, 609592, 635616, 630060, -902758, -15019, 186233, 51189, 414955, 841947, -325259, -292504, 307391, -542750, 962747, 910275, -653571, 758124, -944819, 146740, 765145, 95190, -973999, 145524, 661026, 59961, 464676, -812812, 691447, -882018, -618528, -946646, 229296, -419486, -466956, -919028, 849807, -48761, 776811, 470550, -510210, 656027, 691385, 67496, -833844, -651005, 735727, 744861, -266206, 967882, -459942, 991485, -218841, -37496, -450472, 28641, 942043, 816242, 28673, -591640, 815041};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques259(){
        Integer[] array = {-870054, -98065, -645731, -346584, -131316, 924652, 509106, 676733, 101235, -831234, 479597, 490428, 470096, 904521, 173233, 325447, 155952, 653241, -158163, -302267, -950263, 266969, -279652, -993314, -270082, 414560, 368669, -441333, -94546, 23356, 815203, 654336, 78219, 350302, -251275, 43980, 607397, 783731, -217939, -575267, 623414, -780595, -37994, -649318, -760552, 831899, 860529, 236934, -54019, -910521, 297836, 806076, -521734, -56414, -888884, -312848, -91853, -873335, 643946, -932468, -723159, 380234, 539580, -421334, -338304, 844759, -658530, 221785, 669128, -795124, -104796, -526857, 601188, -175856, -828563, 216695, 393675, -260891, 223818, 689165, 485288, -494356, 670362, -97375, -169030, -272340, -184056, 231681, -163439, 264311, 800178, -961846, 901022, 298872, -182672, -901894, -87652, -927574, 25353, 230899};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques260(){
        Integer[] array = {-468953, -850753, 283880, 285616, -687338, 553071, -817826, -938052, -458725, -185893, -469036, -15379, 534722, -721912, -357192, -907440, -914717, 96901, 164058, 352865, -772474, -810904, -682409, 281173, -547133, -883447, -477022, -538765, 142411, 322104, 45804, -665026, -294581, 767886, 508952, -393175, -28339, 698287, -855249, 132416, -668627, 535249, -862233, 329730, -294034, 529005, 206671, -668433, 538182, -77733, 989332, -176384, -855591, -115026, -574640, -532056, 79109, 428466, -117110, -608530, -879498, -460787, -786379, 160033, 888908, -815618, -745740, -728508, -13925, 508203, 384712, -459299, -401157, 139955, -111366, 794721, -580087, -962165, 572548, 863739, 225949, 726689, 627481, 233533, 156344, -780542, 237815, -647669, 976231, -505729, -995370, 541250, -972383, 472626, 174503, 122649, -58814, -436962, 701014, -768366};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques261(){
        Integer[] array = {260637, 584479, 870418, -480010, 36213, -672842, 540103, 967836, 611770, 265866, 492047, 35666, -658530, -786412, -973160, 484417, -758182, -785432, 330038, -555183, -54432, -654857, -953845, 665577, 649134, -15144, 15542, -227217, -884954, -388555, 582347, -430826, -713994, -865469, 89454, 239884, 118453, 118992, -958020, 708814, -848959, -61405, 108580, -55412, 81546, -861929, -18759, 236853, -596353, -273690, -387095, 956787, -945304, -829545, 264570, -52841, -788933, 129045, 595303, -439713, 70036, -987102, 918754, -215844, -746812, -178282, -243430, 380535, 119311, 583875, 873591, -764097, 20816, 554652, 807217, 42979, 952722, -197752, -806537, -371765, -528836, -300833, -341941, -502324, -600282, -388660, 976093, -874126, 299509, 150095, -656960, -781066, 578036, 673818, 836026, 381891, 603974, -715657, -635888, -87836};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques262(){
        Integer[] array = {-359093, -613658, 53643, -499696, 879093, 287552, -728984, -495696, 536217, -140610, -347855, 470628, 601423, -566049, 783903, -48037, 339679, 640372, -443088, -644555, -62922, 560874, -705146, 456726, -923343, -935348, 496208, 978382, 849425, 783937, -731627, -671575, 875088, 793044, -898044, -868131, 417743, 326132, 88815, 88318, -382763, 407939, 398155, -336885, 802362, -527270, -828877, 493031, 785324, -480436, -788620, 192000, -762563, -235261, 788104, 510095, -346641, 466677, 706027, 937109, -773139, -504023, -205895, -614451, -494039, 781329, -413326, -811425, 208328, -789259, 106375, 958822, 764842, 789257, -195705, -353737, 950956, 152634, 265736, -173456, -829947, 110256, 772137, -107415, -998285, -241061, 785711, 632639, -847599, -229779, -233988, 664289, -178191, 747161, -712507, -480875, -633947, 725540, -142451, -926429};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques263(){
        Integer[] array = {212245, -447520, 708939, -866953, -770886, 724468, -587220, -805197, -350398, 474981, -864367, -848020, -122742, -23836, 661400, 993533, -868358, -320553, -955534, 793925, -632026, 508658, -634940, 362588, 501666, 451174, -26421, 356060, -237645, -486348, -273616, 301586, -34055, -159137, 84177, 122569, -837021, 61253, -667713, 861822, -660604, -784658, 923236, -299958, 956348, -806896, 378614, 263085, -985462, 420978, -822796, -934744, 497725, 992276, 382609, 392240, -316076, 161505, -39899, -384788, -686369, 836898, -79224, 386285, 643739, -244440, -204488, -398495, 553307, 842771, 163380, 663782, -751913, 609298, 312553, 432980, -563708, 254073, 653893, -431874, -337646, -880096, -598086, -832900, -479770, -131478, -689721, -915766, -997262, -492516, -941927, -578712, 254296, 800651, -79493, 379311, 2593, 506154, -151276, 923007};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques264(){
        Integer[] array = {434287, 105765, -152671, 358325, 417409, -73083, -120300, -800911, -823787, 915524, -373681, 138632, 502196, 259254, 587718, 373944, 443753, 786132, 420344, 953061, -367273, 238952, 116488, 771861, -261358, 29013, -520535, -814296, 860349, -297828, -335374, -538431, 958385, -520492, -875659, -236193, -721582, -792416, 800779, -802640, -439768, -253102, 287272, 190024, 329171, -990541, -332679, -220249, 763110, -427995, 274723, -294043, 272161, -138572, 444179, -811606, -701402, -713083, 385036, 3126, -181044, 13526, 788215, -680762, -99558, 309913, 546576, -998421, -27923, -545957, 438782, -63076, 314699, 462516, -887380, -371930, 677557, 822711, 606075, 110774, -673437, 315757, 339360, 214852, 276362, 624835, -551968, -792000, -535421, 100673, -233857, -676201, 34792, -133426, -552656, -261619, -958027, -770037, 844801, -410140};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques265(){
        Integer[] array = {-66672, -814681, 406620, -518115, 197054, -260201, -918163, -170234, -613380, -25457, 951171, 865863, -287527, -471202, 696191, -69216, -393298, -914544, 63449, -109273, 242430, 430540, 78835, -968036, -323132, -148395, 55167, 994342, 422793, 787646, -298002, 192463, -779397, 294774, 521156, -141918, 9536, 266685, 532856, -708071, 995661, 265938, -198178, 42661, 5432, 649399, -285662, 929286, -684734, 31048, 68803, -569123, -320862, -894043, 667533, 13041, -177978, -635307, 235179, 321664, -878552, 130085, -851069, -31242, -235814, 858247, -428409, -40472, -221477, -422813, 936320, 576543, -236599, -674988, 387861, 95183, 794064, -816916, 303599, -313784, 362072, 981429, -495490, 680736, 796786, 541409, 867261, 389949, 721706, -327912, 817947, 514491, -910836, -465005, -247641, -698091, -606063, 246690, -7330, 901805};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques266(){
        Integer[] array = {-503925, -182933, 61495, 60903, -29416, -19302, 134247, -732271, 615826, -55409, 106677, -450072, 305805, 389823, 495467, 847826, -982015, 869675, 314102, 986164, -818386, -508974, 646933, 175015, 467544, 614612, 441576, -585645, 617389, -426566, -228853, 191432, -867067, -662141, -280764, 301872, -912944, -960510, -637302, -670331, 205607, 336596, 905972, 197351, -615401, -531969, 1753, -144004, 196288, 773182, -6037, -568493, -444660, -691657, -267322, 282922, 171048, 585526, 706268, -63913, 862112, -709160, -387481, 349400, -948916, 570185, -488345, -613580, -492748, 91736, 349847, -774747, -211770, 738861, 791500, 405900, 138354, -642194, 730084, 861258, 437867, 774163, -802250, 35562, 615896, 913407, 46323, 109635, 601260, -503752, 142296, 395251, -286054, -80936, 313021, -811037, 346776, -487779, 596246, -336243};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques267(){
        Integer[] array = {-169286, -771575, -428358, -534614, -604661, -160900, 62585, 953302, -17698, 583516, 609120, -19992, 516138, -541509, -833366, 139843, 533374, -737651, -196872, 428181, 546762, 441768, 895494, 596094, -299983, 608230, -312190, -288815, -196090, -217689, -550971, -134195, -266289, -84000, -257331, -912238, -636622, 825341, 114773, 535489, 391972, -203312, -369373, -445601, 332800, 705984, 902235, 590743, 353016, -937609, 891924, -567959, 780312, -979759, 356073, 802225, 806697, -21473, 147095, 943001, -391611, -65663, 314356, -504994, -373265, 190648, -779230, 855586, -495513, -178145, 873228, 466515, 541835, 893202, -75660, 456825, -275086, -991195, 764973, 571097, -617568, 607055, 484710, -981806, -821382, 709879, -832608, 967198, 234852, 931438, 158256, -954848, -366174, -366915, -602759, -60565, -996648, -185362, 694888, 376609};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques268(){
        Integer[] array = {646132, 767623, 563434, 711935, 496991, -357981, 807355, 989496, -325258, 551825, -974005, 42288, 613523, -107161, 942324, 415817, 80157, 25396, 297702, 154686, -226443, 550908, 797763, -715006, 441223, -32212, 973724, -5524, 459117, 219824, 674301, 629794, -94753, -557829, -619036, 232310, -693929, 343304, 711659, -228412, -219371, 713052, -379561, -79736, -281971, 197693, -928445, -848384, -244333, 886715, -968079, 705879, -988686, 789773, -790436, -376270, 640843, -143183, 615159, 573839, -454235, 979658, -141214, -713020, -676934, -324754, -504225, -138129, 107843, -150661, -34999, 597001, -226882, -580487, 205229, 662418, 123500, -530580, 800498, -764852, 560427, -17734, 72891, -812264, 340957, -559396, 685299, 231081, -776048, 195170, 75132, 977619, -844598, -405308, 463126, 377387, 653528, 83371, 549002, 62850};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques269(){
        Integer[] array = {41188, 814984, -848995, -70274, -577586, 602756, 811755, -876635, -171726, 739190, -977768, 678206, 366442, -506580, -630913, -538592, 653918, -41797, 326347, -587448, -516156, 292884, 579545, 818495, -264958, -244955, -478837, -512711, 999381, 688050, -832572, -359944, 928079, 848557, -468763, 535787, 776850, 829127, -166960, 126260, 948620, 441551, 849863, 531024, -721286, 906856, -779192, -514506, 807612, 122165, 288772, -365097, 338025, 608781, 146792, -845040, -787356, -114017, -788686, 149012, -608481, 794127, -184922, -980901, -233835, -282525, 837537, -598502, 96589, -95098, -207596, -971465, 613038, -581774, -407559, -753526, 705363, 563863, -487135, 914230, 507058, 267362, 342501, 397682, 298803, -825015, -501163, -944687, -32732, -432824, 958565, 226372, 731407, -922253, -477597, -920924, -590286, 137938, -536213, -313891};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques270(){
        Integer[] array = {152124, 970772, -951301, -454796, -914045, -338205, -581307, 971711, 193418, -137832, -502669, 382229, -60729, 697908, 70966, 72017, -576562, -862946, 788692, -567655, 666313, 339466, 588286, -946232, 432402, 363814, 142246, 36952, 92434, -931954, 831101, -998162, 490748, -647835, -138022, -837479, -836444, 628899, -470115, -540770, -571006, -468281, 291347, -805050, -148381, -661431, -247248, -34977, -135740, -752011, 638783, 186693, 488977, 723252, 33042, -480115, -184853, -146557, -955547, -93581, -166004, 953364, -703780, 180977, -116263, 286570, -759258, 110385, -711236, -946997, -285471, 94868, -825731, -36316, -31141, -676538, -570990, 614305, -957497, -805640, 438539, 657171, -531643, -160684, -647027, 176518, -437679, -421706, 482544, -738960, -889526, 426884, -406169, 616542, -958049, -924182, 333055, 314481, -353192, 794603};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques271(){
        Integer[] array = {-113208, 230881, -163017, -838274, 655406, -495126, -71747, -822518, -386740, 242943, 462260, 693987, 191226, 279697, -51184, -935322, 70491, -23616, 816692, 41775, 469745, -152355, 995940, -618049, -614946, -538094, 955470, 832890, -190638, 520805, -939394, 112655, -821355, -780477, -153939, -964955, -614966, -780150, -649154, 242701, 347789, 307424, 889381, -886192, 589407, -584231, 779191, 566733, 559512, -670790, 170567, -862525, -405553, -448077, -161688, -73177, 345068, 689982, 92104, 129471, -89324, 49838, 30243, -78017, 736495, 735612, -401517, -657478, -29816, -700261, 805765, 252340, -454994, -879698, 682166, -682223, -566274, -942290, 358169, -495503, -664517, 392336, -956126, -215171, 510770, -387861, -6097, -428025, 292519, 659844, 786138, -86399, 578605, -755011, -774564, 729309, 939993, 406689, 881522, -984037};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques272(){
        Integer[] array = {189042, -176084, 497479, -580128, -428971, -307353, 535325, 467046, 486083, -193294, 772776, 697743, 781434, 327096, 450215, 560767, -110321, 419440, 744687, 634660, 150400, -650798, 757805, -234043, -700738, 176181, 346954, -412641, -772714, 362239, 866573, -459427, -7754, -268025, 283247, 875051, 347060, 642490, -350578, -76748, 244861, 581417, -668835, 291261, 501638, 65937, -683036, -127511, -754558, -965396, 41426, -674897, -937171, 857870, 906027, 540247, 305993, 741141, 280792, 271323, 568605, -518486, -681823, 799557, 893242, -359883, -940169, -38274, 364410, -733605, 120948, -357051, 123580, 617782, 340772, 22651, -453938, 699827, 530387, -377699, 502351, -420487, 209272, -745339, -47213, -879143, -142603, 729621, 784927, 94872, -647625, 937432, -769489, -67533, 114091, -124521, 617248, -209740, -944880, -815169};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques273(){
        Integer[] array = {-563255, 593323, -838872, -245805, -574805, -754952, -347700, -41943, -215164, 450624, -681713, 501564, -64316, -380817, -45468, 702690, -444104, 567512, -848901, -404074, -96787, 826602, 850269, 498457, 998387, -66582, 955147, 564021, -711390, -719628, 639469, 140960, -483111, -670872, 603405, 454756, -282088, -28315, 421407, -568242, -59948, -818988, 569516, 185936, 802883, 704147, 921387, -617801, 501531, -135651, -789935, 455478, 389046, 73240, 181083, 832211, 292614, -730822, 927108, -181194, -987988, -392723, -911980, 731981, -609835, -306670, 537964, 412006, -495088, 177062, 818287, -143323, -827464, -350868, 261001, 806127, 793160, 168584, -679242, -136995, 216935, -591225, -479991, 2798, 163831, 367842, 519862, -131175, 114488, 554559, 848167, -691312, 208532, -872627, 282815, -828777, 500235, -705861, 507826, 911584};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques274(){
        Integer[] array = {-997170, -143369, -387068, 972230, 994435, 465933, 94564, 213047, -246913, -622237, -550661, -280373, 272753, -348030, -553741, 934719, -851332, -81306, -832990, -315869, -556269, 425577, 685427, 548017, 839372, -190458, -845791, 29243, 268406, -198102, 883924, -594632, 800029, 134475, 230696, -247847, 780711, -766760, 602370, 218309, 819047, -150735, 780072, -776458, 435843, 82247, 475272, 832972, 134398, 619897, 141938, 457569, 769991, 694678, 282752, -987544, 515869, -450514, -317789, 533164, 369993, 679113, -377334, -946964, -285496, 729194, 732030, -425012, -150601, -969088, 5229, 508053, -502922, 993711, 181485, -978751, 195485, 173707, -368153, -922826, -243082, -469118, 230905, 221685, 573858, -854950, 551761, -115246, 963063, 700293, -217302, -829550, 881736, 881570, -875568, 960519, -362847, -294075, -721105, -723346};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques275(){
        Integer[] array = {-968423, 669097, -685159, -836957, -651248, 735590, -555249, 869430, 867248, -933363, -280005, 52657, -350287, -689571, 464709, 499430, -384890, 302025, -901302, 482221, 592781, 96718, 675986, 296810, 968767, 13430, -225962, -863831, -812976, -706857, 522452, -232595, 509652, -506235, -602650, -291475, -910219, -2752, 728366, -434616, 879840, -422137, -927723, -60814, -633294, 876355, 580077, 325166, 236360, 329073, 965877, 713943, -197987, -393492, -392089, -183691, -132006, 135840, -703979, -813092, -181006, 349599, -468705, -597397, -979919, 437556, 972753, -684838, -132704, 858672, -460943, -242195, 903802, 661926, 440070, -153008, -964215, 962025, -581425, 375241, -364048, 90727, 416020, -949724, 711042, -177304, -668343, 438923, -414269, -968465, -716991, -953211, -281199, 112927, 270319, 835448, -900412, 158360, 513744, -917004};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques276(){
        Integer[] array = {891988, 451196, -986074, 974119, 61885, -960073, -881556, 512346, 100830, -574194, 767923, -202303, -560511, 434096, 110889, 474106, -669293, 480392, 205262, -203692, -325813, 241453, 495472, 721132, -458814, 946407, -503399, -808217, -475181, 337149, -725056, -919553, 892712, -169068, -706455, 329201, 46258, -369052, -414144, 242354, 14594, -356404, -964657, 291716, 773606, 349613, -456683, 399260, 122635, -464982, 993171, -728025, 452339, 206731, 228693, 241794, -556399, 776346, 186781, 116473, -803392, 288727, -649436, -123619, -949481, -554343, 868814, 800347, -467496, -560437, 952597, 766254, -727577, 632458, -815348, 209477, -934944, 918217, -691295, 279404, -815043, -487376, 777874, -490376, 211723, 965184, 337120, -923258, -136038, 620223, -867044, -966252, -34006, 301968, 981146, 117554, 265462, -249395, 371708, -942834};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques277(){
        Integer[] array = {990765, 320559, 909643, 55077, -708439, -526945, 142123, -868079, -634173, 789876, 87561, 496419, -252655, 316907, 810996, -602268, 833160, 617931, -757404, -97231, 278093, -647730, 791223, 117936, 465502, -651712, -289519, 569392, 559688, -327500, -190565, -669915, 894711, 201993, 811574, 388073, -515188, 945102, -968141, -867161, -291873, -69773, 894494, -156806, -798018, 510025, 738223, 801847, -461470, -550890, 729484, -783371, -733443, 625983, -518635, 852067, 696965, -511400, -292152, 570546, 420908, -937352, 342104, 75687, 589312, 965121, -485860, 849891, 749421, -339038, -822553, 583348, -393371, -396560, 767521, -35115, 521270, 348945, 70000, -294306, -507600, 926947, -903679, -327294, -671110, 193707, 676024, 624736, -512078, -46814, -653206, 862601, -341281, 337762, 684665, 311951, -423518, 410963, -585931, 542140};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques278(){
        Integer[] array = {-135622, 735801, -805689, -886090, 98295, -162654, -139113, -543089, -563588, -599118, 937927, 213528, 163087, 884425, -400842, -281167, 661375, -792448, 180380, -408718, 343258, -214750, 74245, 111935, -620078, -288925, -137401, -225863, -696603, -577280, 329391, -608550, -278303, -803420, 737220, 826819, -584498, -843901, -88440, -400188, -15254, -643050, 402069, 13450, -117798, -107519, 765637, 596302, -856030, -33257, -291585, -616487, -701804, 364224, 173491, 20025, 545420, 360054, 889804, -222766, -113965, 203115, 191905, 701317, -749336, 820671, 416368, -338261, -900725, -720181, 473326, 436544, 907993, -893185, -632790, 60385, -73144, 35103, -467501, -856445, -60813, -479668, 204479, 593174, -528815, -265059, 546180, 170722, 117787, 727207, 589277, 614955, -338726, -747924, -444585, 92874, 566963, 46057, -29421, 250408};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques279(){
        Integer[] array = {401491, 936493, 288420, -870774, 74877, 208058, -608258, 652568, 184563, -305870, 320239, -390088, 917590, 60712, -251136, 134574, 878519, -221907, -496377, -806451, -527259, -786689, -740068, 558512, 353895, 837813, -790836, -791100, -15224, -89107, -352593, 452888, 10838, -62176, -510486, -625988, -106056, 544611, 258808, 914749, 129213, 838165, -441095, -947802, -238720, 468516, 242739, 800334, -839601, 885942, 275, 577353, -709739, -318724, 807333, 709328, -284632, 333198, 591080, -819021, -595555, -774601, -804461, -414262, -126960, -275492, 711769, -213305, -892504, -511225, -517015, -70766, -781717, 106809, -208233, -599484, -905784, -775465, 135267, -796668, -867893, -651742, -350423, 7105, -441267, -194860, -588125, -424962, -550806, 800392, 667206, 130311, 399811, 798466, 744185, -818254, -148235, 171297, -865444, -266097};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques280(){
        Integer[] array = {-391962, -677150, 844129, -650339, 511301, -123079, 564792, 721528, -832010, 54563, 959936, 744668, 5635, -571937, -995880, 693559, -586859, -868032, 978239, 394847, 982563, 955124, -587218, -407721, 705598, -911106, 352893, 590303, -176191, -690875, -549254, 605157, 28122, -319619, 713456, -685771, -815287, -642158, 148693, -790786, 668575, 631045, -839457, 182872, -477771, 720502, -673013, 622969, 729212, -748474, -292707, -443841, 370402, 321082, -544294, 70546, 812294, 336773, 920750, -620538, -597072, 599086, -661990, 503077, -977305, -123283, -294559, -140748, 452256, -123009, 466989, 430309, 852415, 196063, -96450, -998091, 395241, 855950, 568145, -53612, 148325, -793958, -883088, -834258, 536148, -216936, -87862, -962535, 619847, 508311, -101871, 571370, -832193, -592992, 49240, 260062, -747745, 697625, 412495, -95763};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques281(){
        Integer[] array = {552439, 832621, 587434, 348386, 71545, 84323, -145148, -706265, 648888, -225202, 949431, -277253, -926016, 202106, -10929, -997492, -203140, -168740, -836069, -346133, -598672, 12764, -561875, 283313, 937404, -78231, -472793, -228444, 633091, 880613, -611899, 534478, 740701, 473654, -976386, 804774, 718724, -113213, 913486, 107000, 414247, -691299, -783468, -848432, 721697, 375861, -399420, 284046, 252786, 365526, -750557, 241892, -473556, 495147, -378701, 125095, -888785, 978545, -609901, 771530, 7668, 177576, 761579, -790320, -612920, -984511, -351802, -202856, -615800, -247461, 40990, 721941, -250912, 208509, 722378, -756126, 885742, -833548, -923735, 834631, 305056, -338172, 410410, -850625, 637399, 470084, -773949, 252589, -111, -900842, -828499, 580241, 135644, -209845, -481422, -312384, 607374, 260747, 810652, 802575};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques282(){
        Integer[] array = {826328, -209227, 316233, 230042, -127591, 19413, -763045, 574224, 679697, 513712, -981522, 788151, -684262, 197491, -712785, 318307, 799500, -465786, 605390, -24580, 181978, -295969, 659440, -820584, -656485, 202663, -464048, -977913, 31033, 448472, -484330, 710981, -561900, -284604, 234481, -737024, -948262, 251332, 552508, -366409, 833301, 789184, -630054, 751835, -993375, -804301, 324624, -538145, -541550, -610206, 381915, -673404, 714742, -933079, 43074, 701097, 286484, 835990, -603336, -548109, -860370, 922996, 313747, 350828, 269176, 698868, -987814, -449055, 223938, -465106, 642887, 175216, -21256, -266733, 557245, 928563, -445938, 170335, 254699, -38189, 144367, 127073, -480695, -607386, 782666, -228891, -275787, -301471, 964087, 576321, 168432, -782024, 868770, -377084, 851846, 668485, 237991, 481974, -575410, -486698};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques283(){
        Integer[] array = {431986, -745278, 194857, 465295, 847295, -643395, 719558, -171737, -535203, 959522, -776739, 408358, -325247, -533551, 55253, 637087, -482780, -434018, -695375, -883181, -828133, 383175, -342471, -133213, 370007, -73637, -653685, 962365, -964800, -133027, 823961, -38126, -321482, 922491, 108584, 306268, -764533, -530605, 686029, -456629, 895649, 105291, 892895, 252004, -320447, -232444, -665383, -487651, 955465, 550981, 916193, 425194, 675641, 736822, 971091, -216652, 359644, 917088, 618885, -55767, 336887, 568716, -29015, 198985, 346178, 247864, -216328, -9279, 457739, 141240, -416652, 527760, 394411, -236024, -64380, -282552, 729320, 817371, 675338, -700427, -464160, 78673, 237720, -237927, 374807, -473448, -901402, 45648, 684967, 651130, 489026, -33015, -631533, -975293, -91133, 905274, 823875, 111501, 146838, 479632};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques284(){
        Integer[] array = {-266024, 609600, -99494, -534104, 890610, 862700, 515745, 910252, -739267, 534450, -25024, -565906, -974122, 361137, 594792, 482556, -501203, -513328, -852652, -223042, -814981, 321579, 464895, 429494, -757748, -588233, -302993, -773192, 114447, -496863, 437244, 637127, -658571, 536801, -432074, -119234, -329524, 471328, -304920, 770897, 119553, 212726, -234957, 206913, -279850, -677005, -861526, -237878, -726668, 59482, -805824, 472683, 4715, -247107, 350364, 51826, -767242, 505021, 597870, 473014, -467728, 945547, -744334, -877135, 426845, -376360, -438103, 499437, -191613, 558326, 530885, 557197, -329306, 97531, -414610, -791870, 386032, -779428, 375619, 10784, 382571, -655858, -786669, -531375, 579777, 817448, 61876, -942972, 640406, 840329, -28057, -47373, 957240, -899132, 515058, -150166, -790250, 411759, 545298, 450125};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques285(){
        Integer[] array = {-902505, -519861, -59722, 678950, -459095, 636721, -895901, 740976, 532786, 972094, 693414, -302268, 417799, 920556, 6981, 522141, -349203, -862270, 603846, 563176, 398726, 821653, -23445, 814039, 45730, -289037, -528248, -714767, -55686, -125953, -905416, -288250, -465206, 805829, -401356, -155012, -774678, -418030, -197127, -604525, -423041, -298436, -862602, 591169, 166988, -972004, 519683, 72321, 384711, -491968, 627086, -647993, -703925, -514747, -932224, 695202, 880173, -285730, -225712, -223540, -619312, 31259, 538545, 999582, 903673, 685661, 894882, 873999, 625169, 286442, -674557, -284227, 611524, 20885, 351293, 414002, 596048, 862451, 519821, -251824, -497889, -190960, 643786, -786262, 190389, -262039, 491014, 674908, -693391, -764601, 505860, 232461, -229890, -346549, 407993, -277564, 272635, 35475, 565105, 962071};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques286(){
        Integer[] array = {239809, 518733, -480546, 26367, -354021, 525932, -154474, -968402, -122226, -97317, 100849, 695703, -934561, 54836, -765844, -542420, 219952, -528786, 727090, 932760, -687478, 554679, 275058, -795574, 408919, 492796, -480250, -349027, 134112, 700088, -227579, -811550, 930080, 379724, -428337, -172891, 616709, -584794, 58146, -220570, -208822, 11760, 915935, -645610, 450893, -187321, 367568, 933704, -57476, 91558, 836476, 906955, -534728, 979425, -955930, -713554, -171255, -773582, -17484, 839936, 294513, -89358, -611189, -772813, 169697, 757589, 60936, -172821, 569752, -811182, -870717, -872231, 145265, 159094, -723441, 775215, -175784, 39515, -759984, -378823, -888270, 311602, -361910, 419177, -597488, -435960, 895668, -351042, 738927, -698914, -860616, 916211, 526360, -783832, -62817, -299642, -829920, 19575, -24359, 647107};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques287(){
        Integer[] array = {-50855, -132500, -240476, -617617, 466990, -557372, 105170, 5138, -863866, -53134, -979735, -882871, 824764, 623305, -941440, -979239, -567571, -593157, 163688, 292479, 114741, -236184, -612912, -419129, -487826, 89289, -616128, -545621, -973884, -383878, 916074, -636861, 455102, 995537, -877286, 100773, -41764, 700812, -421445, 637140, 279704, -345016, -259129, -142303, 138648, -231631, -453340, 262075, 458375, -210045, -789510, -795502, -221830, -467735, -325566, 54271, -821795, 648981, 433450, -197633, -483990, -218314, -754548, 268913, 467170, -603820, -925418, -184875, 269201, 469962, 134931, 75827, -901082, -188997, -90941, 992796, -634309, -309062, -76436, 56931, 275114, -99898, 343149, -813465, -688324, -236717, -241851, 887940, -480181, 150074, -930768, -856787, 664667, -364888, 29656, 844044, -842988, -821585, 916263, -385444};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques288(){
        Integer[] array = {498062, -733712, 155012, -889636, 385321, -824073, 15597, -876049, -501371, 243794, -43469, 104622, -996108, -507264, -113397, 579775, -77323, -976328, 370828, -457270, 240698, -474929, -630373, -141137, 440526, -624733, -539818, 537017, 459323, 354500, 315855, -69207, -44918, 645060, 859329, -265697, -741315, 599269, -726296, 949805, 952787, -882806, -580186, -237771, -472812, -966762, -944617, -614048, 304114, 490517, 624637, 29169, -624033, 205645, 311319, -401465, -454973, -699018, 560026, 234674, 297612, 825171, -688302, -140432, -581546, 176327, -587972, 858181, -358234, -344217, -357503, 991383, 742249, -198670, 963532, 649266, 559197, -515406, -106842, -348837, 633692, -229375, -74574, -437758, 790637, 673859, -821836, -977457, 693334, -575240, 73113, -912768, 606460, 116818, -662295, 738650, -835291, -907339, -102725, -489349};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques289(){
        Integer[] array = {910814, 52031, -505972, -495990, 965028, -164564, 907635, 565223, -476463, -892157, -746368, 847352, 652995, -268704, -754524, -337435, 654724, 891167, 29722, -596151, 383189, 821075, 139540, 259875, 57217, 526008, -58609, -645780, -258076, -231490, 572586, 261545, -277222, -100112, -426751, -997249, -826606, -52785, -695779, -4873, 795001, -872313, 912720, 637844, 668878, -478804, 174637, -256315, 555152, -508383, -642309, 406823, 425081, 385003, -268015, 952114, 227831, 346514, -694671, 336901, 111034, -933011, 994343, -336944, -265156, -68289, -632891, -564553, 270010, 477371, 223346, 466241, 740882, 963411, 160718, -65511, -783994, 299926, -111250, 763269, -197767, -686780, 984277, 301801, 997656, -774176, 865219, -509094, 486311, -152456, 192569, -756415, 661892, -286752, 498813, 841587, -84241, 761952, -134025, -376885};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques290(){
        Integer[] array = {-96800, 768056, 518130, -801676, -452170, 137932, 964617, 629737, 814954, -142027, -35494, -12430, -851382, 918121, 121186, -494833, -814957, 116798, -137975, -577201, -543460, 954304, -385199, 660533, 50268, -196348, 420901, 242828, -453394, -129086, 464739, -900396, -491911, 902049, 560053, -322496, -164127, 754157, 225358, 406482, -249537, -582906, -696299, 354060, -653798, -808996, -430712, 460775, -188447, 554472, -523828, 495526, -842155, -684329, -843666, -904165, 734657, 257503, -702134, -223102, 842320, -959000, 73280, -371188, -664064, -84552, 290724, -410712, 175995, 250224, -224673, -768318, -195951, -965389, 8454, 841167, 159184, -343927, 465736, 794500, 272143, 26210, -52921, 647234, -946149, 925110, -335958, 970877, 961900, -437630, 411423, -724608, -336217, -284167, 949415, 509798, 362526, -957674, -472877, 289023};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques291(){
        Integer[] array = {912894, 731973, 264935, -272616, 114723, -995214, 923041, 372011, 573978, -145029, -773767, 903680, 951505, 669923, -669312, 417112, -337333, 331945, -958130, 450220, -446865, -457415, -12085, -228376, -507164, 59765, 689297, -325401, 823008, -524085, 176577, 92369, -862691, -746398, 103824, -914447, -597456, -931218, 586652, -644154, 536128, -331259, 428916, 114629, 512639, -205077, -915957, 251078, -311441, 235509, 464290, -965628, -257048, -720008, 90494, -179911, -229302, 536531, 194204, -344503, -7676, -229761, -779084, 713313, 640237, -732980, -305397, -308991, -828825, 581142, 397008, 512858, -147976, -504589, 272402, 350101, 159546, 189265, -624307, -510423, 906873, -631443, 78569, -931972, -642854, 761543, -505535, -207513, -740571, -78948, -851303, 589045, 219387, 666048, -316045, 85860, 118768, 721351, -926242, -551024};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques292(){
        Integer[] array = {-247221, -79879, -173600, -436022, 67833, 701838, -69516, 870031, 578323, 101842, 196653, -374685, -400022, 671634, 726464, 497549, 972318, 348371, 697558, -774671, -39266, -557768, 257753, -170571, 583034, 697699, -107247, 961200, 867196, -264713, 179875, 190213, 230650, 144700, 294717, 32508, -207867, -585809, 439935, -558748, 961234, 917518, -138719, 144972, 659538, 824071, -507267, -103037, -16941, -686751, -593406, 439283, -552494, -268565, 122489, 444667, 268617, -832547, 66236, 246846, 242122, 890936, 56687, -523300, -236378, -61756, -493799, -197489, 309126, 662936, -658969, -665612, 829728, -73661, -934167, 131981, -683526, 924512, 493509, 694926, 603689, 739741, -991135, 342577, -53690, 72125, -795392, -557476, -318669, 953333, 532660, -957328, -607379, -786555, -869168, 901650, 163225, -761949, -620184, 727046};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques293(){
        Integer[] array = {464450, -181938, 740004, 690315, -268175, -861753, 692837, 989972, -275608, -912190, 241612, 774953, -127946, -614416, -59237, -965297, 295510, -881914, -499203, -402905, -279505, 741437, -384808, 328804, -356084, -387932, -388147, -236587, 634549, -310940, 52169, -950326, 26406, -924304, 269936, -514994, 1628, -792802, -911510, -884615, 569173, -962093, -182700, 235770, -126252, 257909, 277095, -798196, -724507, -460001, -714876, -513177, -46735, 981590, 374089, 54577, -410143, -573785, 587322, 730843, -574227, 608417, 48553, -994649, 704743, 369522, -677472, -686478, -662894, 383271, 215596, -826709, -727850, -810031, 426176, -277730, -596134, -389840, -29598, -398699, 551199, -271297, 64020, -5812, 867756, -167992, 986303, -721353, -810415, 918073, 941155, 812205, -847498, 597264, -186971, -433314, -236388, 260126, -878904, -834557};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques294(){
        Integer[] array = {-74320, -223887, 704263, -979013, 711818, 19944, 913214, -135107, 295845, -758293, 217704, 68492, 491932, 598502, 859477, -96594, 284226, -7701, 581809, 568261, 688266, 56591, -257301, -772775, -605139, 645440, 819085, 456213, 717289, 691876, 850262, -957137, 199010, 799328, -363465, 405231, -475211, -351591, -415108, -643219, -390040, 903093, -882439, 473187, -934656, 885967, 96781, -290866, -263294, 818311, 617294, -807904, 291087, -881519, -659099, 970982, -470184, 437687, 72981, 967581, -792578, 750569, 335630, 845003, 351929, 415591, -621786, -185305, -353739, -997856, -256203, -205376, 858545, 595866, 414809, -938358, -331375, 147678, 823623, 369568, 87603, -673658, -809876, 101644, 66533, -134271, -124474, 185733, 108620, -501349, 834783, -132716, -495924, -381998, 509772, 664284, 26238, -578271, -889573, 359244};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques295(){
        Integer[] array = {-501325, 270381, -21209, -359, 310000, 601082, 453803, 81375, -18502, 245165, -640165, 384392, -188458, 546087, -756645, -797289, 785548, -962019, 823780, -682572, 849450, -468510, -33150, 940734, -342182, -59868, -286952, -359407, 121217, 816193, 29566, 402798, -913767, -83000, -82313, 384744, -429188, -900879, -530388, -340802, 51378, -453603, 369041, -810829, 815371, 984400, -114507, 316847, 854756, -570876, -396932, 753104, -838443, 276604, -604127, 886947, 321295, 689241, -710767, 659265, 307548, 899594, 969721, -308469, 803003, -40010, 144285, 410738, -911746, 45250, 990666, -986307, 253973, 354243, 314510, -800344, 900576, 626957, 693398, 167475, -712517, -183056, 80377, -426037, 678641, 446355, 916285, -431260, 353373, 850118, 231781, -878611, -269638, -78750, -53083, -666907, -127883, -209425, -986434, 238409};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques296(){
        Integer[] array = {197626, 381008, -716991, 784930, 853864, 304174, -660785, 386562, 297063, -823907, -488584, 813163, 909257, -8583, -686260, -726632, 983491, -906935, 929638, -515004, -481699, 505961, -211380, 594464, 154595, 857269, -615999, 849140, 320315, -449584, 362301, 20406, -952185, -416491, 806405, -150279, 745965, 2779, 806659, -93812, -606401, 960804, 91111, -610599, -635092, -770916, 367467, 153056, -540292, 868938, 296119, -216787, -828064, 809865, -378783, -107510, 743038, 79314, -47780, -605744, 705389, 913243, 355578, -863237, -870764, -334759, 631562, 518661, -904753, -844352, 169134, -788396, -954016, 565471, -237829, -316733, 460810, -889894, -114010, 606143, 989086, 847194, -166926, 774202, 592374, 812808, 924710, -125185, 344753, 608862, -420092, 851355, 924058, 37256, 719477, 868203, -813522, -266185, 471386, 591462};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques297(){
        Integer[] array = {-168249, 947304, -311378, -748670, 145179, 790457, -435778, -429939, 665568, 209517, -475764, 482998, 21200, -335948, -147378, -982173, 644208, -833190, -84566, 491398, 602411, 68318, -906219, -46643, -502528, -16093, -882630, -599593, -307807, 230280, 91245, -754781, 131592, 2863, -724111, -882932, 883110, 283595, 656740, 999380, 366232, 683941, 771438, -889421, -2151, 72268, 843478, -352154, -953696, 563432, -335974, -189921, 170379, 984007, -791123, -9887, 135411, -354799, 317867, 845422, 383386, 806495, 363610, -657159, 210295, 668936, 976359, 522140, -911657, 357919, 415009, -87523, 318511, -659768, 785174, -818262, -78274, 400165, -186017, 960546, -215455, 565803, 10354, -482884, 977061, 79371, 959085, -74562, 552120, 865329, -739812, 17718, 933187, -281453, 302183, 318553, 816803, -892183, -19112, -166086};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques298(){
        Integer[] array = {58041, -531855, -102608, 727826, -317078, 680870, -610090, 18150, 914773, 144378, -884669, 91691, 830868, 235306, 630377, -688522, -48252, 335910, 580103, -617860, -943069, 95672, -819741, 594077, -962474, 14462, -877927, -203331, -789541, 927050, 49560, 35459, 267021, 637809, -527608, 841273, -587816, -346248, -851588, 256102, -853142, 512802, 137979, -893683, -605899, -705033, -994229, 994594, -970490, -865207, -883871, 79689, 913881, -162981, -899167, -913484, 112105, 589903, -929266, -668887, -153218, -36744, -293714, 899290, 311268, -167112, -624267, 356944, 239205, -239110, -198422, -28422, 940381, -756370, -93153, -8125, 466425, -980693, 374865, 805763, 295434, 971812, -551379, -200967, 958026, 622545, 647718, 649845, 632108, 480151, 293960, 769424, 325438, 842582, -569906, -585702, 50487, 303923, 986293, -586472};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques299(){
        Integer[] array = {895094, 302062, 543108, 720046, -176326, -61900, 62866, -898591, -315237, -288158, 107913, 471280, 245513, -125374, -437527, 74181, 629450, 515062, -54066, -825184, -421716, 226974, -145712, 24958, -736247, -842864, -430667, 755621, 717202, -447902, -542028, -906125, -248420, -567366, -646874, 796260, -185128, 551939, -547920, -81582, 425427, -461000, -723957, -520335, 453803, 474234, -117340, -701665, -302810, -528338, -620798, -532281, -10538, -104786, -513903, 583442, -69781, -768169, -468110, -504961, 557832, 462271, 987611, 521946, -132218, 915909, -699895, 357509, 298440, 27756, -657278, -66079, 67527, 709489, 289450, 840036, -422548, -130429, 209599, 893874, -64111, -186686, -454854, 716319, 498229, 116573, -685039, 118461, 47311, -663410, -728164, -570828, 86992, -378043, 343835, 402672, 221598, 389149, 299788, -875638};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques300(){
        Integer[] array = {-959540, 196840, -472365, 912454, 79676, -291845, 440640, 650665, -655034, 695330, -245833, 559389, 836131, 620499, 216214, -764427, -33010, -778402, -400473, -284446, 79952, 783661, -822683, -583260, 182203, 898677, 30067, 253127, -641631, -517004, -842102, 93352, -171000, -671839, 267832, -95378, -235197, 84067, 187005, -874877, -69867, 150157, 277737, 939132, -523574, 102879, -158593, 229858, -237941, -388982, -954058, 254612, -675714, -914145, 624702, -950045, -120411, -623101, -706245, -785208, 671115, 499468, 804124, 459417, 3887, -849572, -992677, 663640, -311260, -227364, -791505, -965034, -668214, 602522, 721757, 802215, 28797, -144820, 387069, -867076, -934836, 930417, -975369, -119977, 29422, 78117, -70238, -983022, -419581, -151690, 301416, -645003, 29733, 779571, -512833, -632983, 437318, 104156, -564304, 528490};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques301(){
        Integer[] array = {944637, -974998, 54050, -436841, -734747, -601748, -963391, -862595, -186083, -793492, -865041, 418037, -693823, 28200, -101371, -609312, 922406, 579838, 341159, 436617, 444719, -195419, -897987, -647567, 592152, 287286, 138590, 444281, -489485, -87777, 470008, -691443, -242894, -941, 524680, 433284, -734778, 521021, 359862, -968157, -169944, 917159, 617170, -137337, -652181, -937595, 642994, 368051, -868458, -382291, 845390, 217287, 714456, 333847, 17789, 812535, 97246, -51253, -243272, 304604, -756896, 771176, -285097, -174114, 487254, 715703, 831078, -104134, 624281, 311114, -58934, -172612, 607574, -595180, -515745, 895812, 245937, 126269, -629870, -455299, -523828, 461730, 81515, 578417, 547773, 633703, -825644, -687072, -621571, 265241, -616278, 348779, -584982, -865925, -963167, -348409, -194890, -67644, 678669, 37204};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques302(){
        Integer[] array = {486219, -378105, -39764, 251974, 738687, -519325, 174277, 778045, -520277, 491857, 167606, 541229, -79828, 766158, -492251, -944678, 375272, -865822, 591452, -722060, -322605, 987714, 595695, -826488, 264010, -835396, -121336, 523542, -567777, 752163, 191753, -42864, 927051, -507720, -983633, -294237, -355933, 219684, -165974, 485078, -359165, -644413, 982874, 492527, -636633, 655400, -304220, -876534, -33732, 38468, -283368, 510572, 829464, 557952, -659634, 780805, 928523, -552797, -81161, 653386, 327571, 355177, -583256, 112598, -314193, 53971, -543753, -290271, 125558, -756422, -333542, -792925, -205796, -420118, 132722, -2884, 215539, -40421, 449389, 44156, 175405, -885090, -188204, 303364, -397944, -49487, 925309, 770580, 949274, -65220, -892508, 656782, 169886, 150626, -472879, -832609, -222225, -44510, -673684, -701336};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques303(){
        Integer[] array = {-490438, -952863, 700228, 610100, -512567, 155890, 241026, 996218, 768092, -174256, 742625, 173992, 394729, 194238, -312810, -944719, -785104, -910252, 909843, -903696, 425843, 346882, 825902, -23714, -247162, 757291, -66998, 301946, 633669, 986517, 118116, -991189, -666638, -664767, -625735, 376812, -879452, 962079, 317757, 870252, 400068, -958190, -217122, 732528, -753157, 888203, 578432, 977025, -717259, -695424, -719028, 555852, -901659, 277036, -545451, -148708, -257281, -360187, -768423, 613306, -438873, -193189, -744609, -361281, 96723, -937104, 503869, -907546, -270714, -450194, 952795, -532686, -649529, 747486, -439446, 688301, -478862, 849681, -300738, -317224, 513694, 435497, -501735, -891180, -253799, -408696, 3210, 145836, 492673, -964987, -169623, -372298, -605356, -233647, -792296, -141551, -936783, -516375, -302742, -301516};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques304(){
        Integer[] array = {959115, 80047, -632918, -19164, -773188, 801811, 506221, 67255, 450530, -852881, -302738, -483773, 575055, -239338, 800438, -691355, -503383, -76257, 975458, 201176, -940831, 139683, -855329, -755490, -281161, 193078, 781252, 457507, 953947, 724036, 45797, -710930, 501091, -961269, -436058, 118752, 471453, 851543, -213505, 931948, -854398, 45688, -724333, 304202, 975721, 580338, 679887, 635684, 437263, 616411, 282960, 400654, 647862, 564520, 671189, -175603, 812594, 309952, -869273, 744886, -28719, 135936, 233904, -862504, 646715, 12888, 536026, -87718, -847530, 306921, 208111, 472580, 180050, -138970, -18090, -734217, -708187, 479476, -832778, 685324, 765997, -891334, -3508, -109118, -117279, -581619, 948292, -285121, 814004, 664424, 196943, -6710, -511997, -486582, 777775, 465210, 526819, 61060, -666280, 916826};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques305(){
        Integer[] array = {138114, -434278, 788344, 41794, -787825, 761630, 370435, 213428, 882450, 53617, 102914, -69885, 749471, -461229, -392724, -566136, 213214, 913043, 122019, -241017, 972734, 644445, -965370, 356578, -616261, -890966, -953504, 940442, 904444, -253336, -274311, 21446, 939155, -857099, -651841, -663498, -343750, 275292, -856167, -288004, 158499, -628692, -977203, -771277, 491461, 117684, -27921, 257289, -392140, 169274, -308557, 691505, -972536, 699133, 154642, -466963, -957930, 521631, -246108, -258608, -611771, 616267, -257019, 846962, 607147, -461431, -884693, 508928, 725596, 988876, -114059, -709181, 956690, -541588, 241549, -836061, -824122, -847123, 447251, 190956, -209278, 938694, 913693, 595156, 82571, -786263, -381676, -202831, -812179, 952157, 995081, -455899, -967757, 261975, 858089, -337694, 962028, -213731, 418906, -921228};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques306(){
        Integer[] array = {-95106, 541440, 434534, 646875, -551654, -453364, 946952, 115832, -650344, -626966, -501351, 811328, 127059, 25817, 753119, -696134, 157358, -196201, -105141, -539372, 93970, 240788, -685783, 44026, -508633, 821834, 157338, 314999, -887602, 287829, 196869, -691893, 939176, 311679, 7974, 560810, -26967, -248540, 6214, -519563, -443300, -505702, -659526, 819061, -246452, -349238, -649015, -81760, -890865, 199675, 712279, -270556, -387770, -718623, 631121, -274588, -689832, -101507, 4337, -508198, -569739, -35085, 449766, 467536, -142922, 908248, 795102, 446313, 460959, -852643, 378235, -820441, 212659, -96261, -393112, 21609, 541311, -823224, -375799, 558367, 499681, 403290, -57213, -444806, -985222, -839586, -347135, -921666, 566385, 669303, 109231, 711389, 481286, 379419, 165209, -564467, 339237, -99835, -802083, -399421};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques307(){
        Integer[] array = {605342, 3029, -746394, 35954, 93756, 892991, -85677, 94253, -649904, 671499, 470548, -756449, 210533, 610242, -348655, 484967, -672025, 706043, -644836, -422012, 886335, 990116, 556170, 744208, -266591, -352564, -649338, 607892, 442003, -938464, -550386, 295536, 950116, 831386, 713393, 778942, 128467, 588361, -689400, -85921, -205594, 742794, -22592, 867155, -78707, 284951, 669462, 226692, -396077, 977162, -981897, 860675, 98774, -262166, 723526, 162442, -302488, -223070, 469590, -574468, 13883, 298341, 760036, -210225, 112036, -371200, 831351, 728212, -916538, 671201, 571635, 947920, -87503, 807760, 824820, 802953, -201114, 270536, -697435, 752560, -567388, 576405, 962242, 630330, 347111, -112753, 507724, -735907, -81348, 70544, 566186, 568785, 261559, 554996, -40938, -16630, -654857, 681817, -698839, 216577};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques308(){
        Integer[] array = {-124665, -637917, -268756, 963044, 694680, 991030, -702897, -812293, 489324, -67483, 754365, 563109, 124643, 52201, 869637, 287875, -31721, -468414, -507532, 991258, 140744, -801773, 626515, 182192, 776809, 130038, 271831, 673849, 493081, -813492, -675822, 493964, 575669, 120010, -759616, 921454, 134145, 250672, -830430, -449015, 636975, -381935, 484096, -740119, 182606, 386054, 288490, -225825, -127929, 536074, -929521, 146263, -353003, -232145, -142835, -516590, -686374, -689704, 238753, 315944, 596177, 3109, -668195, -185902, 337760, -62538, 304873, 309090, 893300, -532167, -780344, -648751, -790163, 949678, -953087, 692690, 709735, 68125, -502897, -898976, -767919, 429680, 15248, -374465, -387252, -954081, 873120, -418568, -368171, 810303, 157585, -111815, -702326, 627715, -222884, 656897, 953553, -156628, 74699, -446032};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques309(){
        Integer[] array = {861210, -126624, -767743, -978177, -528997, -705305, 690454, 567022, 424087, 721695, -369654, -712126, -539516, -562532, -206804, 147960, 97095, 143967, -831735, -509732, -422950, 25430, -947335, 168128, -340734, -95652, -646851, -942156, 72084, -656917, 429782, -959781, 706198, -591152, 574229, -796671, 334756, 689478, 740118, -245045, 993289, -54264, -772800, -870411, -662140, -231082, 133277, -874723, -936313, 123115, -541979, 183271, 642093, 408129, -286980, 416988, 526334, 689033, 45536, 387810, -114799, 588263, 660333, -586137, 663372, 498081, -851148, -437221, 688000, 641964, -396067, -942460, 930667, 222088, -471806, 578209, -731766, -14978, -863972, -365156, -472747, -471526, 222808, -28728, -87429, -151985, -66470, 706475, -331295, 704853, 710109, -584031, 533259, -854408, 217378, -956075, 732083, 373855, -623580, 247621};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques310(){
        Integer[] array = {338968, 269751, 485864, -118843, -255647, 284529, 346242, 144111, -707915, 536326, 343750, 677846, 934258, 762669, -293315, -595242, -763475, 574107, -141970, -193720, 586892, -393865, 649785, -683292, -268079, 929377, -730856, 101443, 576299, 673557, -359915, 554591, -280857, -818955, 8403, 766635, -494536, 897161, -16167, 725061, -330099, -846467, 593371, 216325, -405606, -242236, -484629, -364537, -895579, 933054, 987518, -453424, 576571, 455031, 729971, 892545, -271383, 400913, 71639, 218039, -398740, -745060, 451851, 592961, 546831, -795652, 549234, 194338, -961873, 584383, 902356, -30631, 327264, 392233, 441257, 513607, -577912, 474810, -236796, -245545, 889309, 867715, -711052, 572725, -194973, 542199, -473006, -112522, 653734, 137291, 535993, 355638, -689418, 470577, 898110, 274968, -166886, 43462, 435233, 596270};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques311(){
        Integer[] array = {-221972, 591727, 47872, 132623, 808960, 491853, -617560, -768754, 330828, 717303, -530296, -124421, 745929, -923279, -823884, -235846, -502365, -612756, 415403, -185730, -724532, 572085, 192226, -931345, 896019, -507003, 72303, 441471, 130383, -831457, -95984, 976271, 838482, 980325, 295397, 654296, 531908, 917922, 234749, 575217, -252070, 716324, 833615, 19273, -157857, 179929, 845157, 837925, -302285, -346805, -888251, 113663, -419066, -420963, 169900, 172642, -523249, 919998, 1894, 47300, -129598, 281064, 540317, 422753, -143556, 44067, 953595, -520724, 79884, -787751, -153961, 500137, -978009, -793860, 491611, -326372, 244919, -534387, -453485, -449707, -540729, 801448, -131908, 121817, 614062, -384688, -722073, 491538, -191165, 88400, -87517, -291335, -782660, 852057, 468983, -11993, 105998, 851263, 168955, 865694};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques312(){
        Integer[] array = {991491, 312901, -796802, -835701, -624217, 808105, 513323, -368749, 626974, -460985, -826235, -691445, 613021, 461065, -319869, 670063, -176066, -991638, -956453, -459401, -307440, -731918, 512517, -917816, -48163, 223721, 408265, -659407, 888961, -54688, 60914, -937600, 935797, -184433, 899739, 345786, 965553, 257104, -564691, -381893, -552966, -825844, 276518, 740973, 749615, -33723, 939853, -497987, 748543, -475005, -785322, -600170, 443904, -362226, -779619, 541699, -134924, -181652, 607042, 356216, 268219, 850743, -654216, -813876, -124174, 933699, -490491, -196945, -953920, 495414, 457935, -408845, 586000, 692513, 733620, -179944, -507828, -686511, -44511, -45486, -917909, -163816, 763675, -525228, 869927, 233077, -149703, 127726, 810890, -649509, -276773, -131517, 567625, -87466, -959070, 700216, -819114, 386605, 410639, -679491};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques313(){
        Integer[] array = {-345552, 699756, 65791, 755615, -599632, -99508, 906981, 986321, -258786, 511525, -737053, 110756, 691353, 915281, 688598, -938554, -627659, -615579, -81975, -51185, -868262, -612961, 29806, -883469, 105318, -383367, -403089, -120576, -95176, -777177, -401111, 463514, -730780, -353995, -713775, 344286, -974251, 199305, -943320, -268766, -579574, -383861, 814072, 573587, -950200, -870960, -835242, -923086, -668798, -519779, 176336, 674055, -306889, -422394, 380040, -68806, 337125, -339681, -545301, 746589, 383298, -946025, 145341, -168396, -989481, 370007, 320934, 508424, -153018, -973849, 805392, 842060, 977048, 768086, 55032, -621114, -313084, 179593, -164084, 725844, -962890, -771056, -651729, 271625, 74346, 72225, -473723, -475095, 401466, -519489, -601549, -622167, 320108, 222136, -962233, -191319, -17490, -491170, -614794, 332433};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques314(){
        Integer[] array = {767402, 819120, -345237, -425593, -366978, -990989, 400962, -319742, 954702, -57758, 131127, 671766, 719507, 356191, -817289, 568047, -136178, 108983, 266252, -756151, 286450, 590982, -500486, 696146, -261537, -920035, -807961, 295509, -967011, 667642, 689433, 900906, 328617, 872625, 807752, -976292, 5479, 782047, -737746, 26395, 625687, -302632, -235589, 302055, -11500, -802220, -610100, 299610, -323221, 308570, -79323, -748650, -791648, 627461, -416353, 487909, 927241, 349007, -52668, 969905, -459670, -723764, -685414, -358429, -440614, -371796, -472832, -29307, 432572, -288472, 212152, 447324, 700522, -744891, -752643, 87246, -863501, 912176, -633868, -496072, -823617, 328749, -18158, -482103, -119790, -939182, 372561, 4066, -938358, 505618, -618884, -480566, 138703, -656085, -959793, -325335, -644096, -673778, 355981, -491902};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques315(){
        Integer[] array = {156226, 602653, 128496, 779537, -607854, -673047, -564550, -924116, -498354, -363154, 470378, 444340, 284253, 402758, -634798, -435310, -643325, 321419, -725614, -39765, 92195, 704097, 96755, -770501, -412781, -249254, -654128, -996147, 413835, 604346, 415077, 596510, -190233, -932799, 339800, 370212, -282356, -137519, 940358, 70970, 912238, 561142, 426039, 530523, 418010, -56260, -214167, -509960, 221810, -959563, -137944, -295534, -208081, -359526, -835800, -440784, 728743, -115865, 338518, -67238, 947760, 162072, -699318, -438389, -946853, -894594, -805101, 544265, 992357, 335734, 6766, 1278, 312567, -907541, -604971, 887562, 407701, 971924, -686719, 593759, 881968, 617254, -558774, 333768, 12645, -378729, -346035, -528060, -24097, 196486, -231411, -659532, -581567, -823756, 137448, -232641, 704787, 288668, -780158, -579753};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques316(){
        Integer[] array = {-84207, 493148, -382907, -102394, 703460, -827776, 252204, -429048, -56723, 939556, 663868, -630349, 200141, 101599, 897461, 736368, 807185, -970042, -677964, -352981, -688046, -904689, 962377, 355748, 34498, 76178, -775995, 126427, 967956, -262038, -542324, 84298, -947782, -791616, -660244, -596308, -591086, -145636, -954190, 929301, 751638, -289995, 267038, -547613, 563959, -157907, -919739, -291850, 68221, -455046, -28675, 413320, -112244, 907020, -777333, -224933, -96660, 507276, 359927, -360243, 643087, -551940, -227572, -395552, -83494, 677993, -615918, 495126, 594782, 92548, -978753, 99648, -638216, 852223, 616182, -437812, 220570, -198534, -949798, -591631, -308626, -7353, -814820, -790676, -971691, 425548, 398984, -353067, -520583, 908749, -977252, 113104, 182851, 80252, -666736, -95507, -480949, -544603, 162858, -61764};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques317(){
        Integer[] array = {-137408, -423259, 184876, -833028, -866212, 501427, 703270, -366516, -983861, -798151, -136758, -543285, -65095, -659664, 311869, 899156, 725687, 94769, -960143, 580705, -777411, -716031, 778803, -393125, -560624, -986161, -73266, 755836, 58839, 842598, -24126, 526263, -932496, 553772, -882576, 107954, -714853, 78588, -783763, 679604, -944885, 409063, -776370, 394840, -862630, -563136, -802314, -585401, -956546, 380716, -847905, 138336, 419900, -732381, 332580, -799485, -538927, 931304, -335473, 202067, 409034, 129488, 372091, -448939, 98796, -701101, -217834, 451212, -412945, -547026, 393699, 956034, 835073, 460630, 407013, 961546, -757899, -473661, -348068, -683553, -748587, 842082, 508939, -221058, 975884, 911011, 335479, 692019, -530798, -295076, 538305, -382361, -167300, -117804, -768327, 673369, 462236, -916297, -965687, 532642};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques318(){
        Integer[] array = {-925588, -347296, -915394, 579444, 370165, 306261, -405639, 422509, 220471, 706843, -302285, -93343, -147105, -64383, -624757, 395970, 56059, 689458, 103844, 971823, 433980, -982369, 527617, 578281, 110263, 580733, 293022, 125316, 54384, 330080, -825707, -251941, 794476, 406141, 241606, -168661, 382881, -72477, 235442, 290663, -856108, -686137, -656755, -134607, -215489, 355636, -157192, -140278, -982231, 974973, -948068, -360759, -498577, -428711, -803346, -834249, 987196, -844951, 257547, -694405, 884916, -648251, 37021, -464039, -419530, 324373, -359436, 675909, -555544, 583785, 752258, -423762, 492391, 53585, -778998, -333795, 781982, 70356, 221559, -533019, -114426, 778525, -157776, -82844, -762723, -930855, 448460, -692040, 837747, -56759, -417894, -901231, -277995, -759849, 68820, -332257, -471448, 73208, -47163, -198771};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques319(){
        Integer[] array = {-30968, 60788, 753808, -455486, 771390, -231832, -113131, 702066, -586931, 518309, 242013, -373206, -657591, -232885, -498922, -316315, -783165, -55522, -121644, -306402, -861318, 721428, 881245, 451908, -925079, 346594, -630633, -394342, -595767, 58414, 380917, -199017, 103869, 810359, -646658, -425484, 504254, -144609, 636505, 840148, -99925, 894799, 343956, 573504, 773329, 380373, 841239, 577768, 94381, -231151, -337726, -207398, -307264, 176461, -916785, -555695, -142417, -854919, -546461, -881316, 645345, -489636, -602591, -718132, -215642, -976291, 872090, 669343, -688965, -347805, -541742, -792290, 469469, -433139, 34098, 595072, 210141, 517001, -560575, -656687, -885383, 96781, -904483, -744087, 14118, -866478, -932535, -204657, -384112, -820967, -180442, 713762, 384157, -522485, 568959, 181917, 722926, -134634, 633220, -954832};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques320(){
        Integer[] array = {-63990, 949419, -460417, 899178, -792283, 556987, -782884, 707165, -192218, 474403, 416248, 385046, -822625, -684708, 71259, 449123, -124281, -486377, -961978, 39377, -26475, 590843, -449875, 182950, 129088, -380697, 81503, -359368, 468843, 560015, 354874, -855786, -729682, 98397, -256590, -455454, -654300, 2655, -915012, 616674, 129585, -146674, 266963, 334893, 220267, -285834, 724750, 985403, -677458, 998831, 48827, -801352, -924018, 593416, 637309, -347558, -407437, -826523, 988589, 331979, 859171, 290917, 611104, -353520, -754363, -868967, -96079, -754684, 881283, -545176, -261994, 378747, 608537, -485523, -290895, 398656, -992621, -521528, 99094, 749707, 628890, 226768, 228967, -758433, 150677, -261034, -848251, 144985, 818566, -747596, -640026, 859297, -314989, -903680, 845296, -814849, 520346, -963712, 20615, 665066};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques321(){
        Integer[] array = {360827, -738096, 524497, -662328, 787259, 577405, -144202, -842507, 615174, 164561, -806551, 911209, -552444, -349215, 623215, 167565, -884522, 303255, 905050, 498660, 398886, -321330, 332957, 556243, 185857, 582271, -520228, 231286, 405838, 147064, 358120, -582745, 895717, -683245, -698385, -980458, 402407, -96812, -545347, 175376, 713156, -24845, 189119, -469556, 286247, -387024, 27419, 324859, 24208, 851222, -602085, -925958, -902407, 577045, 880913, -220812, -307987, -368309, 499669, -815573, 457862, -953164, 638560, -586526, 838050, -653490, -550558, -273984, -161986, -385778, -235673, 786873, 38731, -719972, -999820, -253163, -962732, 358080, 553623, -722653, -768151, 228446, -745054, 742446, 691928, -351047, -211785, -436893, 349802, 580394, 661187, 176472, 263661, -156608, -875030, 910797, -276281, 853307, 400381, -664620};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques322(){
        Integer[] array = {-44417, -982528, -201492, 483343, 814952, 683717, -688965, 142600, -366970, -682948, 138347, 506117, -314382, 672585, -680195, 766409, 261980, -899811, 874006, -349172, 844701, 181172, -332893, 378946, -382983, 212664, 410057, 867376, 745987, 114946, 818184, -473500, 629748, 287660, 287146, -638693, 658301, 374419, 921172, -850323, 254072, -396384, -877517, -658400, -532699, -357177, 149078, -512574, -100193, 796241, -41863, -334078, -482604, -256458, 982103, 795759, 587047, 859260, 683049, 154157, 362833, 490963, -927894, -698410, -568139, -211765, 637405, -211000, 677345, -389337, 113726, -673954, 488341, -176443, -495861, -237137, 886690, -763429, 468655, -462269, 431221, 614114, -418240, -126018, -216507, 944877, 502853, 921276, 270827, 763247, 357698, 153055, 575393, 322088, 598803, 410500, 813989, 274157, 890245, -763539};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques323(){
        Integer[] array = {228258, 919270, -914274, -464669, -683012, -488630, 357628, -272198, -552588, 308637, -570768, -880823, -433495, 822348, -608029, 610891, 453102, -6884, 613072, -991963, 500082, -730927, 765356, -850895, -805576, -475374, -487114, -101020, -499940, 591003, -608299, -451010, 727138, -356554, 962999, 398339, -628802, 426338, 846790, 96248, -690897, -307597, 907970, -660988, -517402, -937148, 321589, 918102, 442103, -728424, -143678, -256922, 974712, 364271, 560645, 484734, 410258, -760801, 68456, -928274, 813798, -330559, 556539, 845950, 290823, 100427, 994757, -621028, -867739, -425994, 959196, 726370, 295772, -2955, -412315, 685072, 303039, -932079, -626837, -294035, -748070, -351397, 987856, -676722, 199234, -336703, 178626, 186699, 479464, -82965, 659055, 623028, -787451, 843054, 2465, -134093, -689454, 723273, -83927, 507313};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques324(){
        Integer[] array = {227180, 51227, -608793, 911004, -717840, 795875, 565694, -309297, 510100, -813377, -310605, -292743, -922988, 494130, 940808, 673692, -371682, -299837, -221278, 989020, -998542, 913973, 776939, 310574, -613036, -900641, -602844, 470990, -768414, 934296, 661300, 886591, 208109, -761962, -97862, 386613, 379451, -513608, -605226, 159324, 647555, 580683, -627284, -592089, -138886, -940292, -517806, -897144, 25386, -605152, 705846, 974243, -96653, 854160, 953759, 37254, -55042, -612871, 82934, 923063, -907055, 792894, -264041, 589892, -281797, -120278, -652170, 757348, -208557, -837636, -583338, -587542, -399033, 595413, -135337, 893524, -732188, 684746, -816905, 921096, -968713, 962226, 292348, 433073, 647994, 463173, 48242, -8790, -981606, -85180, 253307, 975213, -321904, 586050, 755462, -422344, 184334, 889126, 268786, -854439};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques325(){
        Integer[] array = {-189931, -841908, 229806, 872241, -866275, -207988, 955107, 803146, -808975, -310824, -938915, 566, -260993, 27096, -320825, -910577, 420283, 420724, 536724, -937393, -378995, 890091, -653640, 281446, 564881, 657637, -700974, -663003, -740485, -119206, 903720, -854181, 257171, -356345, -446088, 725412, -157986, -584473, -71458, -897771, -591340, -245372, -327695, -323402, 690764, 779636, 497374, -36448, -500081, -770929, 67775, -778475, -460199, 569032, -60548, 231246, -298058, -655360, -643115, -340469, 647919, -414623, 746171, -806888, 973828, 725361, 489050, 284383, 570150, 402790, -268010, 380938, -34466, -717186, -265253, 466583, -601853, -324026, 410307, -551313, 297234, 937309, 331034, 214445, -321086, -240566, 429539, 149702, -265408, 262338, 975300, 892344, 556934, -128295, 580945, 913004, 628147, -198746, 72731, -75888};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques326(){
        Integer[] array = {97936, -130155, -615487, 725326, 370612, -372747, -940573, -121386, 725479, 600184, 670633, 862545, -959101, 320604, 426913, 231798, -886227, -999092, 380668, 243178, 618706, -871546, -757320, 525695, -966421, -505338, -550069, 634345, 181406, 901778, -329746, 790461, 679868, 540455, -767044, -45393, 606316, 444755, 624713, -320652, 311667, -975809, -660781, 477482, 533701, 451118, -616475, -606255, 624072, 766722, 432971, -299689, -727926, -892152, -628252, -705467, -524958, 329100, 721069, 449282, -117930, -825468, -746700, -687864, -252578, 281346, -698468, 278513, -429779, 538422, -372590, 663078, 423533, -201988, -136538, 170460, -773101, 975225, 241128, -953970, -521358, -420234, 256210, -470104, 49877, -478821, 862822, 83815, -550285, 202716, 150648, -354199, 367544, -555019, 45466, -943962, -110879, -331991, -174258, -783833};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques327(){
        Integer[] array = {127244, 512195, 787848, 941798, 836487, -618290, 504040, 73825, -214063, 631501, -606165, 4465, -779872, -440055, 198001, -861990, 854786, 583180, -518383, 568822, 523738, -51153, 870226, -510169, -588016, 63637, -407398, 989943, -297556, -262049, -475276, -433247, -876829, 577179, 443536, 400527, -915166, -692918, -646066, -264470, -197087, 93675, 448719, 50394, 641511, 231267, -949111, 449812, -570706, -821767, -647148, 804240, 213360, -426586, 336006, 724653, 905445, -783499, -961893, -14407, -96513, 929074, -967760, -756179, -772596, -264237, 970457, -90269, -34880, 217505, -88765, 48009, -445950, 125744, 938105, -166902, 314164, -699552, -475747, 676217, -799717, 678573, -40367, -989154, 177380, 657054, -510278, 51425, -285795, 135660, -184929, 709646, 617070, -971233, 988909, -510803, -650890, -177074, 596535, 45033};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques328(){
        Integer[] array = {-670796, -418198, 27463, 144859, 557302, -685381, 775645, -982425, 777634, -520654, -997213, 772856, -73492, -583408, -777454, 688037, 315024, 635631, -662753, 311601, -87492, 581919, 962870, -979261, -322526, -190410, 940306, 357847, -88410, 107584, 845036, 523897, 104893, -472252, 228367, 820658, 122113, -812559, -138252, -277864, -528971, 78630, 802633, 862950, 432491, -421515, 730120, 142937, 721509, 862699, 504782, 416037, -355625, -630238, 591112, 456954, 33886, -891895, 681343, 92395, -678837, 860031, 595071, -231809, -896001, -309944, -187919, -691908, 462366, 894864, -607239, -124743, 431175, 146033, -933487, -16786, 533143, -896944, -681850, 584501, 334446, 821025, -222299, 507419, -531529, -606334, -693900, -592114, -356782, 821649, 898421, 306356, -475695, -375776, -533857, 654786, -92248, -269297, -874577, -383400};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques329(){
        Integer[] array = {-305781, -254538, 5386, 227736, -857803, 877341, -425636, 448221, 199054, -844227, 153372, -656081, -839542, -184572, -560951, 869473, -582150, 399161, 392572, 583122, 820952, 916609, 892273, -890772, -106217, -18907, -148633, 842483, 3302, 908541, 130940, 288023, 556260, 471865, -198721, -448059, -618165, 826344, 116972, -313562, -167464, -441718, -284478, 519980, -320435, 50525, 883580, 467056, 636089, -630863, 289151, 330533, 472813, -177276, 550607, -470569, 528883, -254401, 442760, -983754, 874669, 69508, 656366, -119874, -773810, -615525, 843136, 160672, 951572, 315218, 780736, -642689, 636965, -317194, -209435, 132228, -627553, 541453, -577629, -126144, 764650, 354814, 286698, -731760, -646474, 828502, -182515, -419203, -528055, 230203, -476300, 654004, 36237, 691511, 712104, 385865, -574094, 685553, -861975, -173695};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques330(){
        Integer[] array = {-774512, 669676, -395563, -987009, -830098, -33366, 373381, -720246, 476572, 575809, 695171, 920110, 632868, 317903, 346631, 28483, 849513, 756800, -680539, -743757, 257436, 667819, 581645, 881291, -476422, -818247, -228893, 157215, 582722, 447486, -462078, -699200, -507762, 102611, 759384, 328306, 527619, -352368, -498925, 652669, -892419, 295052, 408480, -624352, -652430, 415435, 331605, 63678, 273878, -177606, -205495, -278557, 696851, -724583, -888731, -850001, -638500, -416870, 578888, -745960, 974432, 391735, -823809, -470621, -118962, -946012, -884401, 111733, 848295, -677709, 855769, -578984, -861901, 49327, -744968, -347965, -689143, 389171, 803182, -952206, 903650, 885903, -620351, 392682, 85227, -808724, 2299, -825598, 58458, -289765, -156429, 7111, -145858, -377212, -267665, 830479, 834557, -268899, -174099, 743429};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques331(){
        Integer[] array = {-475002, -726355, 503788, 889403, -807573, 801049, -988027, -864112, -718007, 924802, 928518, -88435, -654803, 857319, 908757, 469614, 641404, 64508, -334613, 447481, -80215, -672070, 730391, 126221, -63485, 467202, 983818, -667142, -839672, 592044, -326676, 679974, 716820, -807836, 156526, -155148, -251179, -431661, -148957, -168886, 353394, 825020, -111934, 30934, 552646, 633623, 146986, 328365, -414250, -323381, -792899, 166439, -579459, -80281, 751560, -418034, -761421, 446443, -17266, -310343, -74507, 328600, 77431, -150468, 111865, -400073, 472974, 316661, 267443, -379259, 899174, -136476, 942755, -571870, 424426, -945842, -504654, -111018, 588452, 463079, 506927, 643656, -245194, -659725, -229130, -392331, 469842, 399542, 259016, -566676, 754307, 58230, 883372, -848128, -783756, 21919, 362624, -552345, 185048, 938616};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques332(){
        Integer[] array = {88200, -569430, 422361, -377856, -394212, 107506, 353899, 246259, 990441, 428556, -567098, -784077, -780370, 506319, -788877, -377326, 886596, -162190, 986229, -127710, 616449, -330827, -874883, -275237, 731050, -797018, -470162, 848187, -615081, 109457, -76631, -689095, -814100, -464893, -359229, -251908, 882480, -532316, 317073, -157491, 653321, -204974, 319184, 184563, -977563, -888091, 520752, 498027, -619889, 984282, 482368, -667938, 844988, -694172, 741369, 22687, -634459, -466644, 843052, 494466, 356148, -769357, -820833, -465207, 734736, 588198, 616087, 455461, -754103, 120177, -469381, 124902, 35227, -920639, -916745, -271163, 672880, 374880, 204969, 405747, -910362, -531702, -913249, 675848, -441182, -525547, -541126, 833915, 571910, -418088, 143853, -89281, 435901, -444833, -22275, 103192, 382088, -728747, 700594, 234999};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques333(){
        Integer[] array = {-708974, 609121, -187425, 87604, -539148, -582418, 893780, 307010, 516822, 792213, 923871, 290980, -206774, 516264, -294365, 901270, 921428, 40710, -13465, -285556, 439227, -403927, 832678, -418726, 634102, 148305, -505841, 693721, -296285, -914504, -436629, -439538, 288319, 26213, -603855, -487638, 545431, -347256, 613734, -998264, 572510, -181688, 387454, 650898, -941375, 124075, -773378, -310647, -45300, -78952, 253701, -102004, 861072, 156387, 687615, -131541, -851477, 11943, -935122, -461257, 967624, -367729, 31435, 682402, 571627, -580055, 137841, 334180, 840192, -422875, 842441, 951101, 536510, 552609, 178734, -328051, 759475, 558336, 736068, -769669, -117316, 160595, 922278, 895431, 492793, 887047, 979835, -514508, -959604, -181199, -491781, -82847, 720257, -196568, 844275, -178111, 16103, 86890, -473185, 6925};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques334(){
        Integer[] array = {351430, 263888, -142103, 838728, 379764, -573414, 243643, -315247, 461596, -528726, -450411, 751534, -887010, -659424, 226638, 9129, 973979, -342375, 617950, 908492, 888569, 28447, -559417, 264986, -439791, -779298, 579458, -628596, -887507, -734851, 831480, 407575, -569017, -505615, -732922, -368857, -768323, 689753, -688586, 102060, -401982, -8347, -316438, -201044, 272416, 69163, 499997, -676000, -139629, -631564, 685871, 389245, 567138, -642261, -673165, -636815, -89192, 776905, 948866, -714652, 684786, -73302, -390989, 137224, -82341, 61580, 429675, -895562, -768227, -779324, 470872, 164442, -377709, -546286, 376652, -123002, -482753, 915454, 188157, 798926, 175164, -554241, 981281, -43744, -576133, -57029, -115924, -746102, 749458, -236889, -991961, -369515, 857131, 105918, -404668, -894333, 31182, 482552, 841346, -350869};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques335(){
        Integer[] array = {243596, 166123, 915334, -493033, -669531, -459593, -782639, 531204, 705533, 168783, 416606, 944735, -169824, 989570, -16484, -265499, -353435, -348930, 388666, -668076, -568384, 506989, -557580, -875010, -128319, -305251, -450083, 662208, -167496, -242120, 897128, -740741, -785530, 507381, 47923, -737611, 144484, -366832, 133688, -403738, -318426, 537021, 443371, -780571, -596116, -384145, -503935, 317219, 495362, 579649, -571692, 965662, 623887, -144835, 781698, 472481, 677602, 665012, -786904, -686855, -405946, -538660, 273875, -584874, -667390, -56835, -537085, -285413, -338739, 848973, -837541, 309681, -994586, -535902, 886507, -922385, 459694, 73137, 793347, -955154, -295835, 80323, -446270, 668371, 945364, -244593, 425853, -274741, 150157, -622984, -700305, 69873, -850881, -851798, -954758, -14133, 672911, 814186, -330647, 798076};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques336(){
        Integer[] array = {-33405, -726210, 108604, 396091, 818036, 92516, -294841, -27128, -486945, -827336, 639902, -645884, -225311, 614280, 661755, -686871, 575213, 457543, -921102, -837052, -214166, 384324, 414519, 5634, -730699, -318656, -249554, 813955, -501614, -568318, 362023, -907933, -885564, -742407, -880869, 801949, 199078, 524169, 128524, -571012, 280590, -945853, 768092, -326656, 67932, 78009, 960831, 56541, -339808, -273096, -749915, -292986, 784719, -576201, -62507, 354483, 93171, -498158, 998100, 966637, 65286, 742301, -799446, 804150, 907312, 644036, 613231, 401148, -119589, -71671, 943886, 731057, -887924, -222548, -365002, 821684, -304649, -203730, 593506, -137495, -932968, -674952, 909315, 758596, -304268, -633358, 557496, 442356, -377732, -471643, -768499, 77049, 481065, 609194, 942752, 646246, -994997, -581170, -124961, -204096};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques337(){
        Integer[] array = {760579, -788499, 278087, -79941, -32028, -900578, -252644, -58, -975889, 907513, 722382, -913076, -845050, -994608, 561413, 29267, 360299, 208916, 631821, 646815, -6085, -778518, 947719, 933249, -269194, -676258, -77981, -832783, 493605, 249995, 86469, 967049, 603254, -686102, 160619, -824510, 988679, -504991, 473142, -376407, 605273, -253217, 59233, 774108, 852188, -970180, 908400, 306905, -710612, -252367, -984763, 920101, -426800, -536181, 105539, 80734, 897432, -156361, 604616, -636557, 681319, -366703, -839714, -254427, -758450, -599716, -747474, -490668, -881619, 692349, -49949, -296941, 4174, -605490, 137064, -109559, 336668, 213771, -983971, 452910, -733555, -642863, -245151, -232514, 691919, -725444, 606105, -824906, -640302, -429813, -589490, -621365, 280732, 609301, -532122, -574284, -699914, 114514, 627789, 236598};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques338(){
        Integer[] array = {-626935, 862435, -185679, 472438, -903745, 545403, 272706, 149338, 298119, 694298, -899758, 82888, 374297, -388416, -362583, -683313, -326101, 107687, 639913, 885536, -935090, 908907, 588361, -514990, -730758, 505977, -363764, 556915, 761296, -569836, 645767, 164296, 177883, 389135, -172324, 216821, 410909, -415008, -943859, 828508, 224474, -12536, 119259, 309031, 99388, -410654, -898182, 783860, 594575, 551273, -763133, -573887, 74869, 419643, -407153, -136503, -739836, -517993, -614788, 227825, 162365, 996471, -41234, -299924, 400429, -427427, 373618, -4927, -792307, -586461, -502516, 713689, 46202, -770414, 883417, -959256, 886238, -99568, -370491, 589402, -957443, -366784, 577586, -26312, 573433, 56904, 133050, 351594, -367242, -495994, -691315, -104667, 101856, 416698, -332374, 165756, -122505, 842117, 893782, -406821};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques339(){
        Integer[] array = {-197714, 733953, -736304, 425162, 778801, -127998, -644880, 599717, 872410, -922136, -268228, -713805, -315212, 518754, -5316, -775396, 39994, -25910, 539744, 736259, 822879, 408043, 826554, -662784, -352607, -418257, -807979, 509513, 913621, -615471, 103784, -900794, -356683, 999028, 521127, -283863, 879975, -884580, 165409, 134885, -894994, -748495, 901182, 942554, 296072, -475116, -163455, -815098, 788906, -459818, 466074, 173550, -162527, 447408, -949722, 844789, -25279, 909166, -66819, -621398, 525623, -384054, -803548, 429334, -575889, -463958, -286534, 254199, 430537, -364160, 787845, -123640, -245239, -911933, 584831, 341505, -958653, -569140, -878644, -184496, -827530, 512298, 977343, 393207, -169196, -148210, 414246, 351975, -330186, -504660, 518431, -430283, 83005, 549876, 301865, -882002, 185843, 230068, -63081, -986693};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques340(){
        Integer[] array = {409045, -246184, -349893, -650395, -242762, 386796, -539884, -745239, -444178, 148080, -951779, -696853, -312073, -615773, -184953, 968104, 727570, -794799, -198238, -820703, -83773, -183808, 805012, 870381, 346821, 268876, 400197, 176009, -331141, 152180, -872429, 187372, 464260, 609001, 271873, -176461, 24220, -708636, 414532, 710198, -414313, 334657, 829411, 746239, 564191, -524886, 332325, 394922, 281409, 340140, 28168, -69146, 940372, -93775, -499914, -826269, 154697, 190699, -880665, -526083, 351725, 239696, -785987, -877907, -394900, 747038, 47252, 185034, -546115, 198310, -575741, 569609, -327580, -631469, -819223, -321299, -930702, 718196, 990657, 824201, -585233, 541550, 801433, 632371, 691773, 903895, -629784, -742691, -172131, 27258, 292697, 348069, 222533, -396055, 951419, -110651, -655214, 676355, -230615, -543348};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques341(){
        Integer[] array = {-360530, -123271, -528813, 38192, -979484, 30331, -218129, 917131, -88529, 148224, 140335, -248624, 102432, 934010, -554735, 867203, 137173, -206264, -219427, -231340, 451169, 258126, -980443, 355354, 485440, -99894, -102568, -913059, -295104, -465973, -509987, 538672, 856055, 937102, 317621, -415617, 510067, 488466, -806586, -37254, -153579, -669816, -301549, 276280, -366346, -971038, -430753, 403492, -761444, -831073, 241171, 835497, 350812, -503978, 112631, -232178, 176355, -385456, -84767, 855352, -25709, 21484, 513560, -754245, 622878, -659172, -185212, 237411, -544502, -611223, -172287, 555461, -50579, -480321, -140741, -189752, -208332, 328118, 421062, 93947, 604207, -567495, -231669, 282595, 41557, 367571, -164356, -264530, -222926, -435228, 184678, -488530, 135976, 205689, -408423, 484770, 640598, 603550, 140537, 320035};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques342(){
        Integer[] array = {53656, 310903, -178428, 516415, -318883, -935703, 685028, 347685, -648401, 592528, 358051, 42398, 201411, 839761, -725753, -628983, 826816, -398473, 488544, -547900, -328948, -389613, -38738, 347885, -869376, 72047, 141266, 71819, 338670, 578124, 59022, -20936, 902831, -879871, 128351, -632470, -306246, -561080, -179387, -896886, -149230, -15454, 25973, -118696, -491094, 372026, 544635, 331489, 323304, -833514, 381282, -286021, 377068, 768813, 317112, 444081, 372189, -960482, 511266, -256933, -80237, 780967, -472294, 494886, 769980, 968042, 479503, -728893, -461054, 293001, -832256, -293977, 963158, 361032, 818829, 379659, 12698, -371538, 160253, 962290, -479515, -857706, 564081, 586339, -85630, -134271, 972867, 866789, 668402, 668035, 881322, 205193, 198869, -25716, 247286, 656621, 901618, 157547, 936724, 920003};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques343(){
        Integer[] array = {750761, 114591, -252599, 458935, 165723, 392624, -851180, -151224, -952868, -223355, 947297, 563995, -743364, -315734, -466270, -478526, 995281, -493675, -689760, -989524, 800416, 681831, -329653, 981846, -543988, 995790, -777881, 84846, -236542, 56577, -978407, 51733, -372475, -245670, 420951, 850008, 449008, -573277, -961016, 879399, 827381, 152587, -156855, 399092, -213811, 628449, 802581, 229465, 428739, -457037, 11563, -677467, -529493, -919721, 258288, 201698, 27074, -447177, -347891, -699981, -829271, 471937, -779642, -327292, -726611, 410768, -757747, 532998, -960591, -521563, -832169, -473087, -607450, -718770, 742550, 363373, 670860, 551906, -759169, 736329, -600660, -842341, 952695, 352533, -179775, -865013, 235111, -854438, 930648, -976654, 792871, 202892, 538544, -293376, 115605, 170064, -987985, -834028, 56852, -789821};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques344(){
        Integer[] array = {-61961, -192932, -65902, 289593, 429219, 88290, 361302, 178272, -922021, -735014, -173634, -370743, 469768, 500202, -969900, -587521, -606190, 894798, 287493, -863487, 654889, -136210, 652466, 12603, -100144, -561426, -815774, 589749, 871305, 975611, 363642, -581380, -335161, 449614, 426409, -618022, 234361, -950609, 155627, 246090, -275564, -336320, -230394, -181454, 439162, -415883, -759919, -793411, 8407, -56357, -483812, -165465, -961973, -159003, -193639, 710568, 383966, -391633, -164929, 714103, 301100, 200619, 528421, -247129, 270983, -182352, 499443, -149032, -935485, -188316, 847718, -318916, -555052, -458033, -395814, -318572, 809900, 192848, -679103, -440423, 612839, -942971, 210851, 711199, -646341, 293218, -124271, 437467, 220728, -363944, 744398, 628933, 968081, 814819, -571667, -250205, 208002, -696102, 345800, 315776};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques345(){
        Integer[] array = {-20223, 354237, -415367, -980221, 271852, 522237, 582665, 413322, -911672, -344179, 366797, 487063, -194442, -658153, -747448, 597238, -263322, -569718, 752682, 591670, 380972, -693344, -36491, -773853, 309715, -909940, -422108, -607847, 214476, -835066, 323104, 905484, 770825, 887215, 143463, 790543, 767421, 552738, 749246, -492001, 561384, -221348, 474758, 555763, 256775, -644627, -692631, 358011, -170377, 950066, 842476, -846674, 699283, -33597, 831504, -269399, 409377, 92216, -71807, -135815, 519858, -330956, 465181, -543698, -915885, -17962, -473870, 291760, -642692, -696757, -886061, 827839, -128681, 301391, 6553, 593311, -405783, -440956, -535031, 617820, -966195, -897507, 180938, 283913, 76611, -878582, -898941, -415649, -754326, 645051, 296020, -391227, -325079, -175221, 572071, 672416, -75212, 92252, 563938, 43480};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques346(){
        Integer[] array = {-561788, 20135, 593264, -375060, -584134, -821339, 379122, -349273, -47930, 675761, -413937, 678854, -598885, 575822, 935765, 994356, -514256, -462358, 607195, -923317, 216246, -291522, 170681, -594615, -858304, 170048, 181059, 934511, 107431, -841897, 434609, -531192, 104435, -537138, 137073, 946646, 933248, -609906, 900175, 679590, 997175, 230421, -728837, 943732, 109193, -835083, -732348, 708285, 827279, 363306, 598197, 169603, -738992, -270372, -729527, 363296, 476923, 973600, 410157, 610445, 800671, 324347, -748921, 633038, -536125, -445650, 477659, 49737, 178375, -980500, -629425, -358578, -28510, 395571, -953810, -272563, -228109, 641234, 729129, -398465, -563842, -128365, -887715, -171370, 204076, -493971, 742638, -582985, 605127, -961982, -883236, 806193, -914217, -711000, 843384, -662637, -72914, 309668, 83452, 528782};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques347(){
        Integer[] array = {-511274, -534164, -89838, 924904, -912646, 826631, 177187, 368626, 773431, -348768, 872492, 492765, 278750, 507924, 544616, -329578, -207627, -459077, 600214, 272667, -683606, -838628, 882730, 912666, -596115, 912839, 344160, 34926, -405816, -587073, -404316, 429469, 647793, -544753, 210776, -174323, 80029, -60010, 109899, -538481, 538378, -958828, -838024, -148777, -766909, -319831, -841354, 721119, 209651, 455384, -654166, -225818, -516847, -65727, -43063, -320296, -788261, -426757, 194483, -54317, -269109, 738020, -488375, -681698, -956886, 88671, 411702, 887914, 903134, -886848, -112705, 397870, -313853, 31359, 110629, -426141, 364426, -175837, -45384, -391484, -802031, -998081, -125203, -678043, -416365, -332984, -460697, -233096, 842381, -474141, -900099, 261589, -931186, -281449, -395691, 399811, 912036, 278603, 654679, -600586};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques348(){
        Integer[] array = {803770, 395993, -338178, 766577, -879251, -519038, -650736, 147413, -538191, -690798, -499428, 66203, 63079, 730086, -21662, -146130, 696512, 725371, 270697, 193119, 287931, 807478, -662761, -854968, -696611, 674916, -132179, 527499, 264869, -774125, 635212, 23533, -318807, -337107, -341292, 528033, -145355, -693283, -960363, -198582, 692256, -139796, 836199, 218059, -716369, 921896, -996877, -248099, 163458, 775707, -350455, -925589, 897540, -821124, -935281, -510403, 470742, 422029, 28002, 45518, -512361, 135128, 974711, 743723, 83003, 553670, 41545, 274309, 967580, -770260, -14726, -344950, 541254, -958336, 194823, -216343, -747205, 383099, -71795, 407797, 613323, -381230, -743689, 125370, 713692, -611105, -131893, 257652, -186476, -714936, 769862, 865950, -115066, 671113, 193462, 998688, -378144, -592002, 291642, 660185};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques349(){
        Integer[] array = {-919070, -46280, -743725, 627960, -306412, 639209, -470915, -737391, 128282, 147170, 954163, 242300, 748992, -566563, -850709, 612661, -246948, 738220, 406079, 367120, 514157, -333190, 714248, -644028, 614048, 107998, 838212, 898805, 270234, -594125, 671379, 918400, 553427, 558702, 577610, 46778, 709646, -164061, -671705, -147599, -17382, 450785, -948975, 201235, -40681, -555566, 845656, -363673, -998065, 551492, -107582, -903562, 137240, -14709, 394094, -984182, 79327, 406096, 108536, -562126, 985999, -939412, 742044, -667983, 533666, -795810, 993323, 100215, 729881, -347004, -298285, 434218, 865732, 45278, 957129, -78514, -355070, 793531, -705260, -586774, 938034, -812892, -160773, 903864, 420180, 333565, 268312, -432026, 889110, 648604, 391789, -323080, 328292, -999999, -670364, 149952, -38499, -66591, -306093, 914073};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques350(){
        Integer[] array = {-461977, -779679, -215255, 551490, 480578, 214935, -99398, 228967, 138170, -140086, -994319, -198536, -992441, -282910, 661586, 237910, 87477, -746719, 880711, 203610, 765699, -721034, -587702, -455088, 640315, 466655, -278251, -764602, 941255, -323288, -443603, 726096, -749100, -737262, 989451, 593779, -106940, 215470, -971911, 840909, -53915, 426009, -772523, -175983, -565289, 312137, 951851, 24365, 354217, -481269, 74559, -250637, 650908, 745520, -880271, -306239, 505990, 928195, 694619, -337717, -976844, 352235, 121906, 613406, 309135, 616165, -636415, -637243, 913632, -263912, -765259, 838581, -437828, 48065, -304145, 431024, 345032, -563140, 776527, -574547, 693370, -177882, 470471, 216412, 497998, 296953, -921892, -384924, 502062, 117004, 982993, 853494, -595685, -267812, -896503, -141255, -89581, 221637, -864911, -121407};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }
}