package Junits_Tests;

import Sorting_Algorithms.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Testcases_1 {

    private SortFactory<Integer> simpleSF = new SimpleSort_Factory<>();
    private SortFactory<Integer> efficientSF = new EfficientSort_Factory<>();
    private SortFactory<Integer> nonComparisonSF = new NonComparisonSort_Factory<>();
    private SortFactory<Integer> heapSF = new HeapSort_Factory<>();

    public static ArrayList<Integer> getLastList(ArrayList<ArrayList<Integer>> steps){
        return steps.get(steps.size() - 1);
    }

    @Test
    public void testSortingTechniques0(){
        Integer[] array = {74844, -607017, 15566, 646943, -774747, 199239, 185097, -775722, -618566, 801232, 803991, -86300, -682950, -105366, -624287, 19946, -249481, -375166, -122258, 3525, -350275, 637329, 638936, -689659, -846256, -499703, -214441, -413007, 720390, 982176, 883285, -724133, -148643, 486511, 339911, -466273, -13611, 501454, -263951, -318023, -252477, 638733, -226384, -560433, -59735, -254333, 51778, -589731, 199254, -387817, 446966, -20471, -225216, 461558, -127982, 370964, -843522, -562628, 671017, 857439, 293222, -187573, 270700, 866741, 654892, 719832, 444236, 842433, -24338, -468752, 60552, -52516, 710223, 209498, 952497, -514717, -347966, -567089, -157969, 32487, -874530, -496973, -799289, -186784, 63213, -143442, -908462, -136261, 932226, 304158, 83787, -923737, -171014, 765269, 976825, 491062, 765501, 484049, 163991, 204468};
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
    public void testSortingTechniques1(){
        Integer[] array = {851152, -772579, -227620, 730160, 103673, -356007, -580606, 705816, -807940, 178367, 923980, 772231, -415813, 622633, 353036, 618649, 888262, -439243, 952483, 565936, 549120, -396633, 938752, -908246, -852834, -338136, 489008, 807789, 940700, 326474, 456766, 832067, -342149, -956463, -915934, -317387, -588324, 139255, -42302, 437148, 363086, 264002, -633109, 406945, 967210, -715570, 435522, 811778, 984615, 17479, -269472, -267984, 20682, 249218, -552817, -941243, 340104, 967771, -441108, 557421, -818828, 8474, 663398, -807987, -774004, 171306, -78762, -4323, 53805, 317351, 23423, -207377, 485283, 42048, 943818, -520234, -742466, -256396, 540408, 278603, 888326, -946787, 738065, 386056, 964050, -470860, 113271, -231887, -501206, -457016, 990911, 689531, -761327, -58229, -767434, 836077, 217330, -39712, 459698, -440961};
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
    public void testSortingTechniques2(){
        Integer[] array = {-338097, -776662, 956194, -780750, -545368, 260224, 118148, 677727, 651960, -610716, -951086, 569166, 26716, -642800, -853830, 620571, 717502, -896403, -622604, -652218, -929490, 213029, 162796, -862040, 326473, -59364, 695950, 732142, -177969, -893958, 357943, 261970, 192301, 378307, 278720, 911290, -289936, -474852, -692366, -761896, 750470, 415181, 902622, 444996, 910880, 699378, 395050, -585412, 556790, -838525, 222756, -226006, 541357, 598611, -676515, 395984, 697031, -250643, -439158, -284828, -35133, -842035, 867177, -685540, -771701, 253075, 846586, 474864, -251736, 630897, 432474, 730918, 714937, 536193, 459645, -122566, -948747, -182187, 696776, 40499, 734265, -636935, 476826, 866453, -23592, -198117, 912313, 92981, -639541, 48861, -639982, -396315, 974966, 39356, -75639, 398891, 513288, -333974, 69339, 144262};
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
    public void testSortingTechniques3(){
        Integer[] array = {130408, 210301, -453818, 210650, -765102, 395825, 611733, -747830, -887577, 103434, -598063, 438513, 702887, -191874, 616659, 338015, 463406, 325491, 186734, -69652, 463190, -41510, -885261, -437882, -864958, -69882, 548657, -945634, 391592, 197968, -700335, -548356, -969339, 899437, 695610, -143603, -320619, 391983, -785927, 553052, -926196, 599669, 279661, 126367, -438720, 999458, 80186, 416293, 969966, 685741, 56513, 954994, 717754, 264702, -84610, 252907, 415744, -98892, -147668, 545192, 72768, -94816, -847693, 336830, -962672, -996659, -553690, -970829, -869261, -213085, 888132, -992737, -534897, 657414, 763446, 358529, -677725, 536056, -498193, -522822, 225137, 20220, 561687, 276586, -980062, -651830, -112840, -88754, -414308, 137659, 142008, -905957, 706536, 435104, -743843, -735963, 620872, 565104, -934896, -78442};
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
    public void testSortingTechniques4(){
        Integer[] array = {985441, 871396, 930055, 922012, 610006, 554201, 495117, 368118, 373972, -939960, 714452, 878583, -546395, 630163, 710598, 295956, -799658, -224591, 48936, -620718, -582002, 638431, -543500, -158575, 109674, -564666, -474636, -934386, -473036, -329641, 909515, -574032, 550258, -356947, 652153, 592995, 834415, 780066, 404971, 743531, -465936, 258957, 982674, -914211, 203338, -129348, 350466, 130279, 251955, -685481, 840210, -494827, -914350, 747916, -390811, 527471, -60567, -849687, 510769, 76191, 647210, 313357, 938009, 735978, 658659, -739926, -972748, 295860, 228186, 763276, 527514, -243808, -887913, -771539, 813412, -254310, -308461, 307473, 416287, 892543, -633237, -163883, 375110, -727706, -283958, -858172, 136704, -465091, -631138, -468050, 752889, -931147, -505187, -472777, 520019, -606682, 631775, -503207, -911587, -726371};
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
    public void testSortingTechniques5(){
        Integer[] array = {-255262, 422571, 575205, 524848, 493644, -736538, 48987, -646520, 303309, 994823, -780050, 708391, 962999, 770201, -785070, 320515, 656131, 470626, -786564, 344524, -224932, 415329, 594881, -189326, -277714, 394695, 701693, 849253, 931966, -807805, 102305, 955464, -46813, -900305, 411616, 179992, 760460, -422231, 426540, 676678, -277428, -83740, -674222, -591577, 834626, 835036, -274790, 985573, -872893, -899734, 367303, -748196, -717077, 246412, 593452, 346260, 485987, -499414, -29480, 75627, 700423, -434203, 239532, -412162, 602255, -522400, -419541, 463492, -787171, 537540, 229489, -528188, 430247, -211773, -803979, -462072, -744282, -655358, 111717, 99707, 57584, 346927, 875396, 77416, 148359, 704525, 993665, 168320, 187626, 596754, 330326, -578471, -615542, 523778, 521118, -534454, 807787, -970040, 380037, -98584};
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
    public void testSortingTechniques6(){
        Integer[] array = {73027, 786634, 111071, -748658, -778534, -329931, 648625, 447343, 995902, -566897, 692293, 355520, 44367, -194838, -654950, 551012, -51910, -937235, -120510, 386699, 906955, -88424, -682752, 424341, -130621, 59825, -292225, -2446, 263840, 737919, -775917, -867650, 270393, -180744, -195167, -679673, -174936, 249413, 812935, 944090, -312427, 296129, -117373, 331720, 147027, 282454, -698256, 769354, 900389, -977345, -181570, 20846, -346155, 390547, -803586, 65913, -636982, 55413, -135015, 756183, 170711, -706427, 997226, -163494, 511989, 374956, 212552, 219595, 440877, -929101, -30621, 288746, -644986, -618538, 390151, -736014, 899760, 912698, -915334, 298192, 543994, -129496, 463060, 728054, 676582, 561327, 738749, -642871, -751426, -503740, 805396, 720261, 184931, 685216, 356458, -646834, 611515, 173119, 582614, 337343};
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
    public void testSortingTechniques7(){
        Integer[] array = {-229285, 833837, -186746, 959259, 254069, -27824, -658360, -639645, -544770, -229465, 450099, -784743, -36696, 903352, -91785, -638470, -501273, 713995, -229592, -227825, 564715, -572255, -183538, -240434, -3799, -891220, -218414, 438766, 277364, -480636, 173807, -757319, -240821, 228215, -323429, -757056, -713823, 690881, 281193, 882512, 736017, -883936, -104346, -421042, 856829, 762322, 28433, 788137, -812750, 966019, 978913, -987918, 965585, -913573, 656428, 922361, -900085, 259542, 486125, 642666, 639067, 216878, 109519, 580362, 739890, 381439, 884733, -626622, -941791, 338848, -896238, -572870, -616409, 387295, 131118, 161968, 942529, -703727, -927747, 707195, 164752, 80163, -65330, 968064, 648940, 209028, -266273, 971392, 67669, 866960, -895833, 653713, 498090, 501415, 631474, 401211, -108678, -761724, 567645, -894135};
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
    public void testSortingTechniques8(){
        Integer[] array = {-290237, 960661, 114575, 270296, 799518, -613087, -112412, 809154, 474446, -663136, -537190, 412149, 944376, 303951, 663871, -369655, -688255, -161489, 566682, 99838, -148118, 480238, -220437, 592682, 491687, -401650, 648229, -553023, 5098, 367264, -263099, -295461, -697908, -733454, -832840, 244351, 8590, 445197, 993311, -428764, -657937, -260628, 790226, 248981, -1584, -171267, 90176, 377718, 269952, -397899, 147688, 657285, 262643, -721992, -449096, 174620, 639828, -659101, -317162, 749259, 640161, 656213, 640221, 518068, 44242, -730884, -989253, 446913, -381066, 15780, 671710, -94300, -836591, 367074, 6684, -787676, 211969, -916521, -231564, -613372, 893128, -216600, 703956, 470763, -930505, 420136, -898828, -34730, -982798, 353843, -106245, -524990, -200067, 57938, -140511, 706367, -280757, -193804, 989725, -832563};
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
    public void testSortingTechniques9(){
        Integer[] array = {-818458, 193958, 23750, -476007, -87862, 640370, 591535, 994024, -965444, -459341, -305799, 750849, 146604, 732842, -558916, -664149, -465456, 143405, -374272, 300796, -719334, 569515, 11563, 243342, -800599, -5160, 1430, -630992, 838607, -591878, -188257, 797796, -967078, 596170, -256896, -278629, 174987, -841163, 183180, -443218, -497076, 520227, 691974, -770500, 705385, -609560, -733894, 909218, 521073, 860638, 997036, 386044, -571774, -952444, -669611, 591488, -815408, 16207, -77955, 655446, 245266, -169018, -513573, 530066, -655926, 623456, -859306, -603818, -621685, 312985, 273464, -345971, 335507, -684728, 389455, 32444, 601279, -801486, -573559, -716970, -494411, 392877, -215802, 176526, 121714, -353019, -156544, 623627, 461799, 178374, 96314, 394387, -499181, 998354, 296706, -909885, -311853, -44898, 692828, 367629};
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
    public void testSortingTechniques10(){
        Integer[] array = {385378, -555693, 109004, 906785, -316432, -60138, -206079, 675374, 714421, 49718, 899395, 14367, -786696, -422928, -853124, -539130, 880522, -853214, -910545, 189092, 145652, -786243, -625951, -802070, -154125, -973756, 904118, 740914, -811666, -758783, 800065, -162133, 498799, 811620, 777828, 105180, -369980, -10370, -964139, -879656, -18553, -578838, -233578, -256343, 188377, 237374, -914049, 122350, 519316, -642243, -327824, 522988, -182741, -73227, 558506, 425345, -718985, -219764, -345267, 105507, 828024, 449804, -986508, 532086, -860766, -677456, 378997, 238736, -168927, -457893, 737205, 86465, -589867, 40218, -275726, -265539, 647325, 83024, 374697, 314496, 733609, 781665, 395178, 281428, 405649, 338880, -350678, 307847, 369621, 918680, 745084, -48460, -749783, 737238, -907802, -95981, -862868, -203188, -300312, 771383};
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
    public void testSortingTechniques11(){
        Integer[] array = {-87571, -575867, 580967, -845516, -308052, 999897, 341094, -218791, -362887, -185274, -127191, 141626, -256856, -114936, 849156, 223619, 398193, 770102, 583100, 252536, 846978, 957355, -729767, 406621, 37346, -235868, 861096, 413683, -442553, -84127, -959096, 540545, -366643, -775759, -275036, -966458, -171529, 123258, 972800, -23471, -154350, -523782, 12310, 187879, -362124, 366739, 441422, -724993, 160809, -37206, 552466, 37421, -355235, -49485, 753528, 691063, -358200, 256531, -518992, -616364, -577810, -307359, -322934, -915428, -419530, 907833, -436402, 89119, 313544, -998186, -480119, 31842, -872283, -363583, -969870, 460215, 200122, -504838, 766562, 768419, -858312, -529548, 59692, -949694, 135870, -201074, -23497, -546039, 165935, 103067, -517268, 359798, -343958, 336013, -238337, 362312, 88142, 102449, -482804, -492883};
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
    public void testSortingTechniques12(){
        Integer[] array = {-224112, 64473, 359922, 61581, 582641, -232941, 496369, 543016, -464394, -262664, -323888, -882688, -885838, 613154, 595303, -614123, 707957, 352576, 603373, -947148, 385877, -485362, 568166, -266675, -975516, -286462, 481674, 866450, -786942, 613328, 218973, -687692, 229621, -539944, 224437, -299438, -973495, 783827, -932620, 533383, 887770, 219230, -610595, 616665, -147410, 600717, -260731, 154216, 953774, 326896, -942065, -129251, 217349, -472552, 801121, 60399, 664034, 391057, -251470, -337228, 64265, -997176, -883130, -895891, -787107, 834756, -46947, -332545, 625380, -819894, 103751, 658904, -498331, -449165, 100519, -232282, 325864, 451121, 766648, -474674, -698242, 456903, 276309, 702534, 623355, -697030, -822598, 358835, 133619, 798712, 399833, -101130, 38080, 331965, -240509, 740393, -12884, 315814, 779018, -131189};
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
    public void testSortingTechniques13(){
        Integer[] array = {-157447, 424112, 813255, -749410, 387472, 140873, -677303, 750235, -1576, 819257, -192429, -839930, 787464, 385375, 825984, -287723, 11417, -168527, -194827, 872709, 393003, 322327, 853213, 931158, -370516, -118477, 455479, -773280, -771612, -903648, 777081, 76805, -116941, -89452, 756704, 985686, -170043, -152214, -261590, -701842, -482856, -171889, -957099, 631753, -556318, -719634, -285778, 637855, -572291, 796668, 884245, 248671, -828484, -676161, 272157, -709088, 92059, 154809, 505727, -17147, 77500, -610783, 981961, -146979, -940293, -498264, 593676, 98033, -956363, -940139, -946896, -374060, 71860, 693490, 962551, 952307, 938961, -661333, 160554, -510414, -651409, -892683, 262812, 435902, -739655, 489614, -414025, 127930, -169278, 755622, -802329, 591874, -132793, -663180, -286345, -469934, -621903, -209873, -472691, -506791};
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
    public void testSortingTechniques14(){
        Integer[] array = {491448, -5801, -35536, -787102, -884783, -556094, -344090, -614444, 68853, -495638, 718567, 840314, 163706, 798048, -142251, 439343, -751266, 330532, 42151, 977244, 739719, -424545, -584527, 796313, 976165, -203888, -774347, -813173, 38039, 711401, 957383, 700216, -60473, 80318, 780930, -496821, -945786, 169317, 826335, 37036, -310218, 947606, 834907, -423630, -214429, 293034, -287836, 956504, -992911, -275365, 371549, 487033, -116046, -529865, 733165, -128484, -934362, 283339, -903234, 190302, -187363, -182823, 557617, -505165, 370432, 427624, 442610, -69030, 338692, 89462, -219608, 221743, 21557, 67955, -574383, -616902, -266249, -659784, 683913, 404137, -103735, -556542, 197038, -297171, -349437, 137989, -735881, -536304, 66153, -645032, -149641, 261703, -178080, -280709, 871408, 717314, -224480, -468966, 215722, 183689};
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
    public void testSortingTechniques15(){
        Integer[] array = {-360914, 54010, 568892, 580137, 350623, 18391, 701084, -444660, 975597, -164367, 70403, 430980, 48297, 22619, 505293, 980961, -892430, -206481, 490048, 105219, 985299, -39414, 495397, -878107, -96598, 853230, 277885, -785830, -697222, -732221, 444553, -817297, -277978, 76131, 354759, 398839, -27399, 860163, -6594, 58819, 503488, 987631, 583547, -841530, -155271, 885014, 673186, -419425, 664704, 669734, -508843, -932909, -789975, 582388, 684529, -545858, 834459, 320053, -299348, -169568, -499548, -655079, 885367, 789410, -861303, 73145, -873663, 452794, 729911, -888901, -862073, 989862, -405988, -342830, -875909, -928419, 979546, 343189, -243339, -512376, -932054, -251577, 575225, 491758, 206662, 590531, 43556, 205481, 151724, -253197, 498601, 99866, 727626, 941479, 101470, 280274, -331697, 876969, 380267, 227646};
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
    public void testSortingTechniques16(){
        Integer[] array = {-729546, 199516, -221662, 643654, -204314, -970320, -565115, 995499, -373131, 262513, -966764, 945350, 87267, -292591, 282938, -348843, -315519, -735910, 590029, -119755, 565913, 11019, 673562, -600314, 80545, 177094, 605743, -892900, 684035, 61266, 404149, -365638, 571730, -189554, -8582, -544099, -514419, 517836, -709032, -827584, -758542, 232807, 726765, 712516, -225146, -627447, -961342, -124761, -688875, -960842, -712271, -76090, -477191, 232714, -788728, 9475, -329332, -71371, -341478, -496120, 874862, 884915, 908752, -237953, -436069, -300655, -747974, 423207, 158819, -737916, -763243, 237637, 581027, 514872, -47427, -628522, -807479, 420697, -177289, -527073, -987702, 73048, 762802, 13315, -922319, 447231, -724126, -154246, 486559, -602496, 392905, -906708, -990172, 989586, -916136, 580812, 802571, 717585, 18127, -214245};
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
    public void testSortingTechniques17(){
        Integer[] array = {911500, -175970, 722891, 567392, -947412, -311908, 60428, -956094, -217495, -964061, -684581, 420602, 255334, -105370, 378603, 761004, -593612, 6441, 472384, 18316, 770442, 251414, 540182, -439517, 261141, 632597, 468916, 75809, -546986, -32436, 115014, 485343, -517720, 13585, -808220, 716000, 411712, 793596, 43836, 252685, -130864, 212063, -601741, 319419, -669811, 505151, 767244, -941901, -129869, 266466, -952781, -742997, 652525, -470106, -242577, -606138, -312842, -845522, -266512, 886370, -413519, -351298, 203536, 97239, 431605, -192641, 962143, -989642, -645798, 875717, 244573, -991476, -174486, -906778, -435, -128460, 543301, 478369, 587755, 106720, 819682, -588344, -666946, -797162, 706724, 102729, -555097, 101200, -578733, -312041, -263614, 721668, 205973, 240960, -594792, 695366, 33725, -688721, -757493, -343674};
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
    public void testSortingTechniques18(){
        Integer[] array = {-753650, 539431, -577175, 977908, -168433, 962238, 556593, -772172, -566727, 871952, 916590, 853587, 975772, -820077, -271512, -547615, 954715, 590005, -111808, -44437, -993600, -153751, -477527, 801940, -420794, -20210, 672406, 93492, -108166, 658182, -872969, -1923, 913256, -68082, -843076, -928884, -941258, 138808, 328776, 742776, -951941, 866331, 704221, 552651, 373744, -422286, -353477, 959368, 826548, 12030, 668314, -415435, 186251, -101120, -118593, -536232, 144125, -202100, 823550, 91500, 230547, 284928, -759803, 841316, 985257, 1771, 314721, -198350, 94651, -224725, -788648, -234595, -887948, 223917, 767725, 729289, 66660, 262175, 536726, -650979, 117814, -68289, 457685, 721300, -327128, -796341, 451800, 14654, 148874, 303257, 878231, 796342, 252088, -813597, -42003, 433102, -523353, 284888, -878295, -73357};
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
    public void testSortingTechniques19(){
        Integer[] array = {-41157, 431615, -654132, 722346, 544710, 546668, -678710, 805702, -102380, -372260, -604028, 118032, -930868, -203344, -638794, 420699, 599292, 318341, 104841, 984780, 894394, 725771, -152391, 655336, 413981, -625677, 772534, 828340, -431567, -276419, 161152, 772230, -855153, -862553, -67103, 257551, -752429, 283989, -110502, 801414, -182829, 620160, 620230, 936532, 843044, -668949, -810440, -712928, 688787, -65228, 482735, 826361, -236533, -753774, 230476, 601906, 638708, -218149, -299896, -886013, 445770, -633889, -464326, -267301, 852216, 122758, -430956, -424303, -421163, -121577, 597618, -927726, 316929, -735057, 131405, -230435, 526510, 34999, -945051, -688188, -907809, 330210, -669985, -188298, 811231, 208410, -987173, -75182, -767250, 533390, 288353, -907000, 468396, -273844, -493196, 135378, -435817, -410227, -621077, 566003};
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
    public void testSortingTechniques20(){
        Integer[] array = {783486, 755845, 923896, -319714, 432374, -995442, 318767, 55216, 400412, -680028, -791360, 688254, 278258, 674802, -334499, 203256, 785867, 76310, 915492, -362568, 887254, 520156, 485777, 690180, 200116, 173170, 573883, 972183, -709056, 178632, 641082, 799209, 100478, 485540, 902095, -953065, -767335, -40130, 320480, 312808, -62674, -636908, 39728, -402696, -777433, -46600, 877578, 868715, 826276, 11479, 167698, 987773, -927068, 892527, 306521, -212056, 382573, -268322, -59536, -991431, 890538, 110494, 73771, 518426, -838411, -808962, -644639, -119971, 410052, -262276, -57606, 464472, -454298, -132719, 514618, -835593, 382133, -824541, 509499, -695442, -550258, 41876, 796248, -343411, -714382, -63133, 973652, -475966, -628332, -249922, 349008, 756630, 539940, -204061, -758493, -758812, 483365, 845909, 796727, -827378};
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
    public void testSortingTechniques21(){
        Integer[] array = {918229, -776294, -842555, -491883, 262226, -907358, -141508, 783259, 867129, 558312, -115472, 852192, -823608, -169612, 949551, 480206, 427915, 523470, -728793, 592824, -98908, 583971, 584635, 244182, -148594, -140352, 520276, 910327, 629146, 507078, -777480, 658092, 928028, -118960, -341210, -616601, -922397, -703876, 807341, 912429, -928783, -252260, -896108, 91624, -424944, -730144, 217698, -405763, 803531, -340020, -748723, -804569, 378640, -167950, 534750, -412233, -354744, -841918, -670171, -602122, -13293, 680966, -113809, -987715, 909049, 40682, 526073, 80611, -644513, 404514, 856188, 277203, -266451, -129754, 12461, -730982, 319640, -870029, -959468, 736857, -496252, 7362, 169739, -230829, -332318, -633308, -97313, 92943, -575788, 63679, -130658, 596246, 132644, 974249, -66669, 460026, 905269, 709813, -638968, -1336};
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
    public void testSortingTechniques22(){
        Integer[] array = {867781, 590989, 748449, 351419, 161545, -77542, -545763, 441786, -240162, -419242, -762200, 902909, -74119, -118726, 679635, -481950, -422248, -924592, 414136, -499603, -812342, 905958, 632058, -231630, 892859, -173291, 165347, 634405, 296489, -329662, 987583, -547097, 415811, 546193, 491966, -21743, -570629, 542496, -879504, -311303, 383625, -370255, -933007, 658122, 394147, 342506, -615809, 581831, -943097, -249417, -955485, 175119, -121597, -261849, 604125, 283671, 358776, -432603, 335607, 727643, -514336, 919619, -879515, -35054, 439293, 99887, -705362, -305846, 457023, 428649, 470046, 938365, -573457, 35568, 182900, -407089, -761052, -591606, 846591, 293597, 785214, 590048, 968159, -770269, 772312, 424367, -629949, -748572, -473983, -138444, -632492, 36409, 312585, -895378, 457677, 70995, 797071, -113088, -550641, 120307};
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
    public void testSortingTechniques23(){
        Integer[] array = {-809070, -797837, -641874, -319213, -90741, -200515, 727832, 572106, -714502, 667617, 812459, 85461, -808581, -730417, 292684, -740176, -490787, -438420, 127065, 396890, -646276, -261817, -423044, 792302, -745436, -991265, 968158, -352043, -48741, 198447, -11374, -298428, -448333, -682971, 629487, 410553, 123365, 170372, 769389, 327616, 297313, 540277, 272697, 769733, -84153, 551561, -833057, 122603, -939311, -715950, 485493, 464273, 305066, 853994, 106405, -974732, 961800, 324458, 395940, 154998, -315886, -303515, -805648, -857545, -578654, 311325, -998916, 88507, 228768, -742687, 869243, -368177, -66904, -930119, 862502, 42123, 646785, -697811, -726616, 132121, 331483, 497065, 366439, -364694, 749269, -850062, -206801, 856831, -270860, 211274, -810063, 296464, 532302, -76781, 82339, 958968, 712573, 370891, 660166, -244792};
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
    public void testSortingTechniques24(){
        Integer[] array = {501750, -959544, -706455, -338378, -943613, -561559, -1434, 6731, -665206, -905171, 237135, 878559, 113556, -605061, -507894, 622451, -837, 311566, 62025, -718258, -173405, -812966, 50989, 951680, -49646, 461104, 261927, 254675, -845251, -121439, 447607, -596107, 570235, -445193, -114250, -766944, -41724, -476751, -217566, 44470, -175927, 856803, 746551, -239620, 686747, -442791, 827481, -110442, -905246, -799511, 879510, 406187, -314947, -673779, 378182, -748788, 467795, -908284, -329180, -526833, 143633, 474939, 908851, -894551, 109050, 938253, 801947, 534385, 693407, -730904, -211837, 190581, 689745, 832828, 862195, -744403, -612458, 599027, 433062, 921155, -577110, 178639, -576850, -437002, 425341, -300985, 341583, 191484, -240317, -47017, -56176, 443845, 721959, -759269, -328066, 817296, -484892, -223139, -711688, 659009};
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
    public void testSortingTechniques25(){
        Integer[] array = {175763, 810798, -420114, 326523, 784260, -371089, -411810, -279504, -844562, -921938, 448023, 868874, 806510, -289068, -945810, 286445, 686739, 66224, 570733, -517768, -833686, -134455, 139430, 839061, 876613, 766582, -84144, 518081, -566711, -50732, 70957, 962518, -105904, 449662, 235607, -886908, -605243, -287581, 938860, 558113, 576954, -400954, 732277, 75031, -803794, 908773, 306106, -237552, 311322, 477121, 248189, 916546, 125808, 333674, -81193, 190589, -268914, 973973, 426466, -99142, 31633, -576208, 122566, 995921, 835023, -908611, 677275, 559788, -814056, 448795, -163034, 732727, 1310, -817342, -621622, 113472, -558376, -297531, 45071, -751133, 295391, 698351, -451531, 112593, 580868, -311560, -537447, -758507, 552080, -19458, -710069, -992525, -856917, 684498, -874706, -556920, -260713, 814830, -276308, -933046};
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
    public void testSortingTechniques26(){
        Integer[] array = {738107, 520227, 549758, 441297, -753540, -250176, -267585, 805789, 870030, 788137, -8778, 463738, 44995, 979211, 219070, -481052, -720183, -754899, -209380, -725909, 488568, 433063, -290545, 942127, 672574, -272796, 96810, 843283, 494036, -756183, -216552, 276561, -900202, -816056, -439119, 99954, 38927, 917882, -695406, -432990, -910557, 360651, -239226, 568186, -727884, 199687, 13247, 136026, 864311, 517593, -830205, -131361, -992598, 47116, -566079, -849141, 885862, -498403, -551988, 758968, -116839, -299187, 236830, 308193, 186253, 644265, -870323, -26231, -412915, 68641, -403515, 595503, -155614, -345900, -130258, 609050, 807985, -705746, -338853, -351078, -602637, 519670, 22932, 436237, 261713, -9195, -548446, -677274, 470578, -633836, -471813, -537883, -390808, -862354, 165993, -570567, 961694, 548376, -177765, 462336};
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
    public void testSortingTechniques27(){
        Integer[] array = {-533342, -512700, -740270, -200100, -529826, -67225, -575449, 354368, 643522, 662767, 699908, 509740, 822916, -320209, -40637, 662237, 962025, -357563, -164927, -156562, 27063, 886176, -387337, 345935, 31121, -873498, 946335, -191279, -861047, -998775, -200378, -834957, -527864, -857440, 523451, -161862, 418487, -954112, -197127, -448902, 986998, -330810, -642827, -400160, 108767, 919331, 642395, 208963, -183721, 667220, -281865, 562571, -556451, -125966, 125138, -691191, 609571, 992162, -798281, 294389, -874698, -917281, 59451, 971990, -877922, -616775, 225818, 146357, 498901, 51714, 864395, 986667, 809542, -851388, -728701, -913566, 590953, -965310, -824352, 130083, 308598, -772399, 51309, 856061, 889673, -653070, 738373, -5734, 960902, -724173, -567638, 117727, -694840, 365448, -662366, 325293, -446796, -336748, 963431, -72144};
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
    public void testSortingTechniques28(){
        Integer[] array = {221663, -569961, 244053, -36125, -708482, -695125, 257620, -981936, 369815, 228638, -86258, -515018, -616259, 82595, -257674, 821604, -188448, 819259, -987055, 506696, 378176, -489772, 649515, 308791, -420844, -432103, 540981, -286291, 260533, -187765, -907107, 5800, 683927, -343040, 355101, 461531, 320873, -616769, 37644, -288944, -986858, 515411, -708302, 862273, 698028, 706349, -728810, 234281, -133132, 553156, -234357, 173372, -963128, -866297, -198554, 614356, 177474, -626877, -895647, 562774, 714292, -973924, 884246, -672120, 619955, 980951, 556245, 766338, -552604, -52527, 570888, 165932, -195725, -836132, 644681, 943328, 921883, 648955, 27205, -257156, -2829, -543278, -9264, -966158, -575887, 201663, 299006, 126593, 788101, 925564, 446070, -89372, -914754, -99424, 424168, 457984, -246242, -599059, 313350, 378702};
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
    public void testSortingTechniques29(){
        Integer[] array = {271030, -588534, -701144, -391386, 282799, -640163, 361324, -237932, 926538, 317599, 395635, 377394, -223981, -221864, 64498, 774837, -129230, 502482, -913696, -812843, 244215, 195415, -243765, 864755, 112414, -664632, 756434, 219235, 5571, 103276, -294792, -764288, -678937, -909816, 329309, -536970, -596491, 866459, 769667, 859269, -892957, -475444, 873379, -787029, -740617, -754709, -198550, 381765, 448714, 685236, -570091, 32315, 803927, -748852, -333654, 388325, 279763, -691888, -534723, -792555, -382339, -516495, -290155, 47184, 828146, 656861, 334150, 822578, -454028, -764407, -276000, -693664, -341461, -246258, 275047, -364241, -61448, -287563, -660294, 213295, -348001, -480395, 607711, -929690, -488624, -212915, 961400, -41283, 124356, -252564, -932473, -305332, -218673, -839406, -205956, 198240, -479340, -268437, -158446, 733899};
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
    public void testSortingTechniques30(){
        Integer[] array = {378969, -546355, -771878, 549281, 580767, -769986, -436211, 11004, -816630, -246188, 563167, -714544, -344857, 204238, -206506, -256021, -14486, 966726, 442781, -246138, -444848, 597115, -759302, -152703, -851024, -789358, -498183, 647673, -758654, 902325, -123052, -55055, 679421, 239287, 686796, -259715, 60286, 131081, 774627, 903711, 397605, 801540, -225139, 270510, 296340, -511252, 605421, 12977, 416477, 284970, -934271, -930931, 435834, -712832, -970369, -359584, 528540, 137381, 977694, 899134, -286208, -899176, 251336, -418845, 733879, -284516, 539540, -572831, 174827, -994186, -819890, -963464, -139322, -861057, -959177, 445070, 980311, -816752, 60748, -37770, 688378, 709396, 93218, -637845, -445691, -893364, -453218, 392738, 145671, 277890, 570058, -923305, 211903, -918170, -378716, -531785, -490318, 886195, -341509, 263598};
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
    public void testSortingTechniques31(){
        Integer[] array = {-767854, 489800, 179595, -262312, 639568, -89975, 298202, 102625, 861745, 967371, 456610, -193464, -583371, -329259, -660835, -11287, 440047, -723649, -886090, -161987, 49159, 407351, 826870, 88591, 478822, -995965, -504294, 636640, 256258, -611670, 481136, -796023, -82404, -615005, -574738, -207909, -791473, 946988, 996518, -139071, -383212, -655037, 630574, -80733, -625723, 385028, 665883, 645568, -431301, 768399, -322775, 888383, -526415, 768497, 349133, -207633, 749185, 365440, 429109, 607133, -577158, 979588, 361625, -145941, 809080, -981259, -4854, -968184, -714113, 96256, 85873, -147266, 328169, -10374, 223042, 831643, 228194, 106981, -48216, 648176, -584114, -83647, 665574, 857252, -243062, -311754, -731928, -645518, 344531, -441858, 380272, 834852, 842041, -978127, -760800, -616805, 899262, 101122, 787874, -231238};
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
    public void testSortingTechniques32(){
        Integer[] array = {-519463, -26025, -50496, 5059, -621197, -139077, -970882, 112452, 11924, -172740, 288499, 722774, 656491, 910376, 111900, -662772, 83567, 585206, 790018, 614200, 624746, -288000, -958708, -542802, -172322, -590827, 787907, -736576, 885441, -851308, 189885, 25755, 991970, -740637, 674201, 37649, 917944, -919398, 190218, 51779, 781937, -38479, -997695, 749994, -88531, 179698, 115452, -240579, -154898, -475362, -12157, -830544, 837779, 230945, -931526, -234516, -506981, -921522, -928929, 916686, -803921, -382665, -728833, -711603, 758671, -743642, 687266, -432914, 362115, -897037, -994806, 385484, 621793, 928473, 671472, 524401, 612603, 763498, -529904, 517941, -435713, 196750, 451610, 322786, -904979, -859921, -793236, -103009, -895954, 21130, -382611, -175145, -371538, 690386, -397479, -98874, -667477, -972919, 963811, 869788};
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
    public void testSortingTechniques33(){
        Integer[] array = {-149117, 553776, 348189, -680013, -639382, 299278, 268119, 186247, 27702, -384081, 884042, 740737, -175546, -581631, -961675, -88964, 52856, -578623, 120453, -952283, -786657, 294186, 868904, 271091, 965212, -572943, -618611, -109804, -88778, 65598, -522351, -189162, -122593, -797835, -558826, 872788, -684892, 645118, -132169, -733420, -164481, -357398, -85290, -600707, 493018, -2271, 412671, -964769, -490373, -389586, 773150, 777522, 213085, 944598, 465705, 428248, -431049, 251622, -901264, 193285, -884826, 222339, 101030, -586579, -476144, -639742, 944255, 304437, -670314, -457178, 833391, -366278, 360056, -254682, -555734, -901948, 836250, 509610, 405064, -166508, 342049, 668266, 322527, 696417, 30141, 886034, 409791, -665828, -538118, 638579, -315807, -404179, 821434, -346681, 770073, 255048, 559554, -66087, 546933, -566922};
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
    public void testSortingTechniques34(){
        Integer[] array = {551738, -112626, -165469, -290124, 1397, 467594, 771543, 13920, 756906, -500096, -33056, 431768, -498864, -393706, -531349, -281958, 669227, -643810, -118385, 841782, 552714, 546783, 903534, -323415, -68264, -657936, -489463, 872124, 517253, 436566, -570676, -562132, -298857, 676840, -32378, -628924, -451506, -720354, -178135, 943239, 583730, 260824, 689024, 702736, -145980, -419414, 584380, 544895, -464203, -386088, 319245, -122264, -342358, 409472, -855691, 869335, -148178, -353384, -378274, 214545, 699625, 229330, 65288, 396747, 251404, 517405, -831473, -164891, 891368, -329762, 473546, 326716, 674148, 470432, -775808, -678057, -472333, -645394, 64421, 228971, -37071, 895132, -650651, 518883, -257124, -682228, 50405, 522767, -562827, 799050, 67709, -128059, -35167, 28438, 216123, -123564, -96229, 455978, 155547, 18463};
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
    public void testSortingTechniques35(){
        Integer[] array = {199331, -170762, 550652, -54828, 551931, -517509, -458007, 72888, -124343, -120340, 513910, -402300, 785350, -614143, -539662, 499199, -904990, -975350, 567280, 790040, 748702, -517636, 725683, -854849, 195880, 912174, 462778, -587500, 146579, 11703, 711670, -672791, 411997, 138242, -982665, 580270, 442684, -577486, -939507, 840204, -124879, -870290, -530018, -312210, 130071, -688656, -231959, 839956, -502605, -183539, 943681, -649748, -465726, 207971, 519264, -74129, 148157, 424205, 807420, -748434, 506429, -706038, 684783, -569732, 4496, -578618, 615736, -302030, -237928, -148508, -899584, 351790, -353564, -750197, 414537, -15653, -53728, 266419, -291500, -679532, -131450, 612209, -623678, -679124, 704196, 48074, 356269, 314200, -741257, 506375, 374206, 205553, 787225, -454391, -504342, -492302, 656423, -537819, -39441, -894558};
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
    public void testSortingTechniques36(){
        Integer[] array = {854157, -614933, -713004, -728253, 709888, 326288, -361876, -347985, 205792, -409607, 604947, -995207, -896412, -12407, 719617, 556217, 179144, -329221, -916360, -460740, -254510, -313250, 749920, -738219, -447850, -994964, 120334, -760854, 840212, 516950, -282255, -163441, 638546, -620598, -706669, 807962, 482986, -141195, -120750, 26297, -633981, 766762, 320547, -167678, -648716, 576263, -651483, -892917, -155481, -66005, 910625, 605639, 167156, 372307, -218881, -269117, -442837, 426137, 583089, -74484, 150735, -738639, -6430, -463556, 435155, 443759, 136000, 712092, -937280, -653548, 872630, 397952, 612554, -750695, 219805, -336515, 995821, 455730, 901394, 43702, -419988, -854762, -999591, -65833, -776064, -323521, -200092, 320601, 697968, 131293, 798805, -912017, 425969, -754310, 460659, -75813, -20891, 521498, -935433, 709151};
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
    public void testSortingTechniques37(){
        Integer[] array = {265331, -415037, 512740, 398449, -67593, 521446, 112443, -220693, 110297, -137306, -350121, 45091, -937081, 927021, 692984, -903241, 229012, 783622, 73674, -866591, 945118, -686785, -349760, 847694, 38546, -163224, 957704, -362323, 363435, 478448, 897493, 791239, -46416, 309634, -407532, -491100, 519428, -665228, -285688, -661891, 654251, 98989, 714403, -230055, -239259, 571359, 437716, -946175, 288337, -347879, 948042, 111089, 248679, -273961, -344764, -183120, -968022, -726642, 799205, -989339, -783325, -504920, 67434, -327690, 769048, 707691, -388829, -245916, 93349, -214708, -694565, 564179, -970190, -287700, -602711, 836717, 356381, -670651, -680714, 391173, -693384, -251884, 352124, -77070, 366000, 692681, 765589, -805469, -727114, 875656, 908852, -970920, 116613, -640446, 748384, 370356, -290996, -989682, -927312, -89210};
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
    public void testSortingTechniques38(){
        Integer[] array = {531092, 461865, -11314, -899350, 849990, 234214, -900307, 899041, 292624, -169609, 108512, -537128, -922787, -741218, -447098, -387341, 891459, 680808, 589745, -744632, -266673, 71473, 948387, -903475, -632409, -328829, -89132, -869804, -87436, 927230, 646911, -874911, -493096, -668188, -846100, 526201, -959145, -629185, 622552, -621746, -931846, -317624, -215739, -274645, -893915, 274910, 566541, 455449, -224325, 615493, 829868, -744422, -669823, -81555, 39963, -556534, 95701, 485041, 492887, 738537, 740986, 984548, -934262, 946110, 603583, 202788, 325615, 893736, 324665, -147819, -876418, 187789, 302086, -31915, 218158, -148463, 500757, 690520, 605162, -965795, -84431, -478139, 634561, 577835, 767654, 864130, 894921, -178498, 968803, -500725, 192271, 567837, 987464, -685136, -966733, 3392, 511344, 544928, -574745, -700269};
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
    public void testSortingTechniques39(){
        Integer[] array = {78719, -799963, -930681, 129988, 27035, -274993, -395707, 341114, 381523, 379666, 72112, 125575, 881659, -607581, 890819, -848803, 714627, 157785, -906339, -460585, 255543, 107421, 650017, 402745, -571725, 209152, 6117, -679274, -272394, -117301, 185752, -7364, -632717, -161111, -256293, -894614, 363784, 115780, 610480, 886775, 229652, -541269, 445054, 363522, -704461, -691429, -630508, 602915, -216571, -792195, -549872, 217187, -925635, -994449, -711868, -540083, -314708, 520603, -500216, 675615, 899706, 371719, -746522, -268765, 991435, 843674, 101207, 252224, 914354, 872755, 546897, 691126, 885926, 962940, 948385, -127873, -836, 467115, 228773, -248237, -692878, 231769, 12396, 689685, 948289, -332498, 192902, 768986, -496688, 305079, -379444, -40476, -374069, 379745, -773995, -478238, -644154, 693218, -465008, -280487};
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
    public void testSortingTechniques40(){
        Integer[] array = {659270, 674834, -35457, -455528, -411770, -277171, -680200, 101898, 794055, -729999, 844948, 223677, 573638, 457401, 588713, -363344, 659257, 547016, 739279, 405380, 807837, 236846, -183453, 851934, -858490, 127710, -691754, 465969, 267011, -568761, 641550, 526317, 338524, 508176, 941789, 641129, 589624, 94595, 567250, 412088, 424968, -794161, 478342, 82788, 886479, -906204, -332222, 950130, -28459, -14059, -539588, -693069, 917521, 497731, 665641, -459725, 795152, 907581, -991825, -271645, -393723, 524261, 696521, -848255, 308981, 180951, 236948, 142239, 222408, 382948, 224244, -510558, 199070, -638694, -268528, 5796, 101317, -55582, -316757, 645563, -108411, -90729, -834503, -363904, 377200, -743693, 398013, -503142, 165077, 83208, -542603, -498187, 681819, -672615, 214502, -935529, 539549, 433941, 410653, 427250};
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
    public void testSortingTechniques41(){
        Integer[] array = {192994, -820165, -854603, 509951, -805001, 680378, -675685, -885688, 467671, -708762, -886499, -475928, 68762, 751186, -181847, -763594, -571813, 665284, 480427, -138216, -969584, -952650, -840235, 750539, 497560, -134139, 612892, 28268, 904281, 533533, -351954, 510130, 778059, 775503, 457868, 904547, 475463, 478188, -88801, -956899, 932069, -435751, 288832, -513205, 884644, 613800, 390191, -146914, 747799, -892216, 496658, -464160, 930172, -85282, 371458, -537155, -86380, -232093, 889785, -835676, -424214, 565050, -446106, 53424, 796321, -592440, -44640, 257005, 391391, 769009, -221806, -251797, 54190, 451064, 113474, -370242, 780056, 843509, -946436, -425977, -264624, -977595, 281932, -623565, -898369, -692057, -272352, 39292, -482903, -122575, -659569, -844004, 839932, 579722, 522612, -843108, 945118, 205541, 63917, -976767};
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
    public void testSortingTechniques42(){
        Integer[] array = {-324743, 728713, -151322, -423792, -812444, 784860, 111145, 690832, 883139, -825827, -582099, -292582, -727908, -278953, 603390, 320179, -636120, 335283, 974659, -767276, -816424, -522173, -321876, -367052, -979638, -502705, 829417, -893339, 966892, 479607, 538468, 205843, 941185, 145450, -766966, 807914, -273194, -693302, -891865, -853031, 831119, 613352, 693789, 788765, 731223, -687392, 848088, 205206, -463292, -49979, -197925, 548051, -704369, -309780, -227057, -399302, 172221, 447998, -807747, -825264, 664230, 222036, -11961, -661823, 735915, -897869, -15603, -491312, 412678, 820353, -571093, -23593, -641246, 675440, 969568, 805125, 280029, 425970, -772678, -92493, 854192, 209340, 917201, -245157, -363761, -647596, -532570, -960296, -630927, -390042, 806415, 489825, -179949, 228532, 644682, 93511, 816409, -105391, 211095, 181618};
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
    public void testSortingTechniques43(){
        Integer[] array = {594052, -635169, -385100, 60359, 253795, -217032, 164407, 651468, 123912, -331870, -619557, -811550, 888967, -149912, 773116, -726421, 798551, -822061, -831472, 603902, -760250, -671046, -835294, 800322, 787538, 171212, -522168, -144635, -996318, -755766, 148706, -300368, 431679, 584658, -289853, -158354, 301795, -917776, -583295, -440626, -252668, 503804, -44612, -687339, -167436, 242778, -376149, -671211, -185367, -354725, -614707, -560223, -820999, 61865, -830217, -201579, -495642, 27807, 752536, 808465, 87507, 534132, -472085, 653863, 581135, 816841, -591156, -845169, -540938, -170638, -893042, -732054, -831732, -479088, 438449, 452707, 782645, 343240, -922246, -705989, 753103, 726800, 498798, 799602, 731315, -889507, 346526, -509739, -151118, 964126, 371507, 651751, 933455, 952522, -151461, 123050, -427798, 704275, -476331, -730742};
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
    public void testSortingTechniques44(){
        Integer[] array = {685082, -617482, -132274, 437981, -409999, 800783, -804631, 616033, -2066, -875180, -495348, -378439, 224552, 967959, -434575, -803429, 203994, 451553, 890471, -417709, 947249, 347577, -783216, 778567, 303891, 501933, -451673, 590801, -287361, 147196, 296735, 982705, -607328, 895490, 548831, -304762, -391202, 74129, -996210, -958185, 952133, -81044, 730886, -539057, -599828, -152611, 909107, -932750, -820812, -997972, 76278, -265682, -897685, -839309, 651618, -36052, -515296, 871968, 490380, -272100, 766928, 59694, -644705, -504011, -518851, 323663, 470463, 634972, 325450, -678308, 964759, -198804, -394623, -760616, 403625, -350991, 222721, 103523, 332442, -497489, -256082, 985985, -438058, -792513, -744228, 46436, 701875, -487025, -671652, -561668, 985129, 444089, 44586, 151571, 859798, 636123, 312908, 353393, 858824, -947569};
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
    public void testSortingTechniques45(){
        Integer[] array = {-339010, 672886, -686771, -866551, 397522, 432970, -101629, -422217, 123359, 621780, 615428, -731207, -996231, -16510, 584651, 777406, 736003, -206487, 692907, 937676, 319717, -464751, 13699, -621192, -925729, -756570, -821164, 767094, 367232, -245420, -517372, 32320, 140492, 870203, 485142, -728677, -391213, 600020, 710392, 50329, 489572, 155151, 311332, 813869, 892880, -489965, -571213, -507016, 304286, 471803, 708794, 568751, -482392, -901812, -72135, 956827, -188999, -484113, -363305, 622526, 758819, 711075, -104522, 139084, 52429, 670339, -677616, 547817, -974579, 13676, -245530, 622436, -58730, -173697, -41790, -420603, 747090, -959518, 412311, 635502, -244736, 748716, -49646, -304932, 770658, -296480, 106479, -686341, 315643, 282957, -442814, 759360, 400361, 157442, 242352, 173348, 558101, -617771, -8082, 959372};
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
    public void testSortingTechniques46(){
        Integer[] array = {455662, -508334, -630914, 743661, -435571, -129186, 69067, -626972, -788482, -264258, 283503, -37581, 209709, -982600, -794543, -210738, -421244, 449093, 538260, 219503, -233806, 900044, 861192, -413454, -701532, 277619, 673297, 847073, -10525, -755581, 134865, -396793, -391607, -901375, -62797, -553564, -792960, -437741, 791107, 729914, 190512, 76651, 570169, 61787, -857848, 576689, -660760, 941459, -691503, -898557, -201053, -498694, 913611, -158128, 682750, 833322, 183382, -635371, -556938, 371904, 340587, 759152, 824385, -548753, 2541, -105873, 456598, -628637, -138662, -533885, 388718, -831154, -287557, -907941, -417874, -912459, -101548, 798389, 389168, -746721, 799790, -976886, -409448, -706461, 495335, 344022, 499674, -781429, 785494, 977884, 852080, -937768, -316319, -107376, -929910, 933906, -774301, 49375, 580383, 882514};
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
    public void testSortingTechniques47(){
        Integer[] array = {353165, 804605, 58760, 178670, 116419, 566796, 806506, -127825, 718717, 70436, 191919, -167650, 421969, 427231, 801785, 435855, -625546, -787129, -810574, 671358, 454120, -22036, -767542, -651680, 739652, -670075, 688930, 91049, 626935, 837559, -602041, 311760, -277560, 162638, 496996, -430456, -554474, -415324, 120588, 119561, 421513, -886608, -782562, -415568, -623601, -955970, 763414, -872089, -136121, -900981, -378991, 422890, 264951, 762901, 404731, 507154, -690676, -545383, 617812, -18216, -732954, -739563, 823131, -173091, 829755, -748418, -258888, 479425, 576650, 135594, -692851, -997760, 209967, -6106, -984178, 127911, -795421, -898334, 202228, 776965, -371467, -222769, -380964, 916676, -311174, 426392, -498915, 97715, 743618, 3063, -523869, 403036, -680126, -981099, 446512, 282807, 345842, 637644, 931735, -678718};
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
    public void testSortingTechniques48(){
        Integer[] array = {-460890, 191679, -738505, 894538, -341005, -64694, -619671, -278315, 503455, 404335, -420244, 174122, -944642, 412997, 114147, 947404, 802158, -612596, 667447, 206776, -710351, 756521, 492905, -630103, -459940, 445299, 761426, 47427, 98828, 557197, -210734, 37376, 246116, -339848, 284363, -16190, -11231, 771102, 259244, -198490, -590605, 717446, -622715, -876209, 914725, 784749, -593740, 164148, -426623, 330685, -276877, 430758, -386616, 352293, 461668, 183415, 363148, -986271, 72149, 354161, 978167, -848537, -893649, -719332, 965372, 73972, -6666, 423175, 717799, -971080, -439434, 432215, 28878, 985101, -938192, -398909, -80552, -278480, -732559, 613991, 658070, -355130, -872852, -257447, -353815, 29799, -513119, -839277, -917140, 674445, 722295, 660261, -754934, -554785, 26722, -451420, -962409, -11188, 167354, 165981};
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
    public void testSortingTechniques49(){
        Integer[] array = {779366, -686305, 65602, 395184, 161980, 11051, 436142, -476997, 676003, 137460, -884260, -616209, -927698, -770983, -16463, 328994, 377590, -774450, 629160, 344192, 193386, -671905, -20567, -978782, -219327, 815651, 174435, 595882, -601180, 670776, -755220, -889089, -23399, -725146, -783937, -199870, -174029, -17607, -743599, 937215, -632384, -227005, 752880, 774157, 820035, 912454, -610834, 703292, 818502, 475604, -276801, 359653, 83929, -318029, -553525, -779806, 705416, 714648, -576771, -61961, -541505, 64700, 295017, -735271, -849397, -496185, -246589, 551718, -173202, -104918, 318009, 400058, 71149, -953793, 134090, -979299, 835290, 589023, 231740, 749663, -641777, -940191, -356458, 468885, 361877, -925046, -252142, 57830, -871268, -855084, 374784, -327600, 665632, -545524, -195891, -298713, -370031, 578335, 656124, -612033};
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
    public void testSortingTechniques50(){
        Integer[] array = {-916307, 739261, -459200, 18787, 735508, 564379, -960821, -767225, -964751, 219365, 285538, -575249, 780222, 175430, 470767, -701997, 559536, 570437, 63970, -260978, -315065, 186373, 411733, -856049, -129131, 107448, 919502, 320412, -160395, 919865, 359274, -209832, -72454, 440207, 614803, -865846, -862549, 166888, -287743, 122685, 929162, -601993, -80843, 786501, -502184, 944528, 890934, 709828, 987572, -98564, 791102, -290283, 811633, 789678, -769170, -139322, 147734, -346860, 796875, -382939, 792927, -612940, -342338, 18988, -808488, -152790, 191064, 859761, 637402, 927616, 427667, -569034, -851076, -603226, -216410, -43579, 713401, -555179, -570482, -105324, 166197, -94755, -470815, -169006, -820476, 283872, -868069, -135734, -231073, 423791, -282783, 732772, -66075, -827982, 156377, 491857, -178473, -701717, 528568, 67954};
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
    public void testSortingTechniques51(){
        Integer[] array = {-709247, -382016, 624287, 915947, -249826, -752039, 98210, -807245, 485256, -834323, -215045, -151909, 820085, -351616, 743513, -262225, -556976, -905989, 562592, 669273, 490838, 957212, -548035, 194548, -726208, 934234, -322795, 238295, -462198, -965514, -811237, -791913, -601709, -322401, -727978, 731988, 961422, 354035, 660843, -570748, -821327, -898074, -154361, -440833, 130344, -130411, 725212, -464680, -789156, 952183, 731304, 960406, -829485, -841570, 302601, -180601, -269843, 648577, 306046, -918582, -292083, -138373, 622912, 965516, -38268, -255315, 919421, 78034, 477473, -554232, 933041, -449298, 647954, -937892, 369033, -972255, 698837, 267733, -406744, -896863, -592059, -221729, -406419, 527013, -833823, -410934, 941175, -354089, -171519, -871922, -837607, 128258, 746466, 464927, -420851, -388506, 455864, -914888, 724598, -749880};
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
    public void testSortingTechniques52(){
        Integer[] array = {-427180, 519570, 617528, -667803, -456290, -535933, -336357, -326972, 166342, 387443, -231674, -59729, -825463, -897935, -204142, -499767, -908850, 32238, 688819, -495061, -5864, -669701, 223087, -309002, 427608, 973471, -261074, 907783, -460589, -531335, 779850, -170441, 196498, 415047, -33956, 97001, 123808, 583639, 16768, -787494, -174799, -336551, 998482, -287730, 360211, 250318, -652863, -549585, 136254, -218678, 148683, 763035, 4012, 304951, 792833, 115094, 664874, 532234, -446635, 134691, -922091, -941157, 754419, -677715, -819523, -567902, -267236, 582834, 502091, 185190, -54608, 495422, 274168, 428170, -89410, -89634, 432459, -99110, -930621, 918106, -16710, 694510, -634930, 78138, 367605, -442105, -812225, 783548, 442863, -823044, -979788, 348642, 177386, 278626, -930222, 129275, -712265, 995512, 261515, -188579};
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
    public void testSortingTechniques53(){
        Integer[] array = {-879718, 960991, -16303, -377244, 916969, 269184, 785512, 797107, -721308, -750923, 473389, 882453, 879192, -472152, -378089, -865212, -613707, 828464, -660320, -101787, -732310, 429183, 20607, -978377, -930769, -882690, 586249, 578885, -927680, 758977, -377903, -616463, 377196, -20940, -478950, 748432, 879080, -29541, -852092, -71641, -608624, 127294, -634068, -960149, 85093, 533291, 285155, -500101, -352905, -798787, -615561, 461946, 965575, 497400, -481831, 500622, -130550, 722460, -557884, 421353, 98633, -47259, -571954, -983578, 64436, 855713, -634371, 13185, -352577, 689686, 627368, -31264, -111294, -968151, 269798, 774838, 666798, -268068, 485909, 692387, 867040, 315221, -924323, -462664, 502333, -350711, -644565, -688996, 630776, 664848, 135129, -166649, 701001, 738618, -754891, 520230, 399399, 776242, -33005, -209163};
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
    public void testSortingTechniques54(){
        Integer[] array = {-240014, 39032, -943519, -367239, -107120, -593003, 887158, 255042, 361457, 750867, 840998, -519075, -515324, -522108, 201374, -243617, -89128, 922268, -707518, -942058, 858666, -886419, 579290, -560944, 663324, -781664, -829793, -189140, -225802, -55351, 953189, 196462, 545519, -529248, 776440, 434386, 799691, 313679, -810618, 518780, -432068, -312374, -610168, 20248, -284055, -167921, 545328, 971742, 908283, 410453, -109879, 948471, -685182, -439686, -724441, 536025, 397897, -204554, 303145, -448668, -543107, 191646, -469894, -185833, -608211, -126962, -713348, -657517, 693021, 899021, 35877, -865692, 949936, -328712, 255094, 546407, -931428, -997037, 953821, -81591, -692127, 395322, 277574, -972034, -609568, -839651, -14783, 924600, -251723, 903956, 583032, -412278, -347563, 417265, 557629, 378018, -526992, 219054, 844731, -669770};
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
    public void testSortingTechniques55(){
        Integer[] array = {871016, 506619, -506669, -334093, 899031, -759891, -628613, -268657, -345093, -727702, -617998, -340933, -445480, -578289, -485283, -980368, 714209, -22386, 120005, 684568, -317311, 549269, -286248, -466511, 415593, 305047, 939583, -801288, -284853, -923567, 321166, 154081, -787035, 603673, -838265, 792510, 99860, 593603, -942308, -420117, -869593, 584050, 356336, -597835, -477690, 484615, -586918, -160209, -623372, -910973, 595828, -386520, -58891, 769916, -955434, -366704, 728103, 923946, -262902, -235160, 297828, 450598, 313077, 3970, 651160, 770680, 998665, 854625, 224474, -524316, 339626, -21785, -746468, -850323, -424271, 960043, -187556, 545265, 414551, -706086, -529902, -79071, -898978, -42122, 506286, -174992, 529696, -739342, 372307, -111748, 876691, 838389, -398279, -997241, 153112, -817154, 31484, -75164, -198662, 251471};
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
    public void testSortingTechniques56(){
        Integer[] array = {-427538, 271234, 211693, 229969, -474372, 835593, -850586, -701744, -839296, -157541, 295304, 794045, -273071, 269241, 668267, -698056, 470276, 865921, 796138, -472920, 120100, -1937, 383284, -321336, 729634, -439266, 889547, 732889, -790739, 477543, 792286, 855759, -394111, 900536, 573817, -757020, -83401, 425288, -206124, -227945, -204834, 186180, -522585, -995368, 710319, 132490, 791603, -429382, 896825, 822700, -256240, -667593, 12263, -258754, -483554, 26812, 366278, 797355, 725452, 750037, -860933, -726933, -775691, 646279, 646065, 321110, -826113, 740706, -295373, 306807, -615392, 335715, 87217, 529802, -194730, -950283, 924543, 788996, 603164, -71614, 33953, -850415, 900859, 592520, -243819, 366098, -423555, -382680, 659809, 800070, 860694, 417387, 921734, -990425, 313401, 366230, 322019, -820718, 459734, -629200};
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
    public void testSortingTechniques57(){
        Integer[] array = {-100805, -453138, 901513, 265569, 504546, 197145, 383674, 289660, 180343, -16299, -515747, -371346, -952398, 260235, -328334, -849605, 412475, -119176, -5158, -281904, -990623, -909263, -652338, -504197, -164091, -344887, -279121, -247116, -952005, 853526, -708911, 818253, 831830, -614476, -356556, 714927, -154763, -460762, -293161, -363564, -248037, -800999, -927567, 70123, 27948, 803044, 708060, 281204, 197122, -143708, -966989, -949831, 791249, 924872, 350859, -620491, -618653, 161889, 439699, -798128, 446217, -729887, -756621, -305343, -376909, -245542, 160509, 7406, -579416, 293565, -254968, 677883, 242751, 985383, -660919, -703758, 7696, 951105, 299021, -483852, 406001, -199556, -806167, 296634, 102955, 695790, -162022, -190831, 406631, 378813, 942843, -895037, 999430, 64604, -234008, -509966, -442102, 269065, 424210, -507883};
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
    public void testSortingTechniques58(){
        Integer[] array = {-953119, -597364, 524529, 77158, 935031, -105190, 812249, 790225, -80493, 240011, -463060, -257137, -292815, 26579, -86532, -645012, -178047, 442877, -51139, -982475, 434160, 878940, -373902, 687386, 84596, 480328, -297510, 810995, -872516, -172907, 52469, -53628, 685269, 380314, 601862, -423408, 621543, -749745, -890667, 458734, 939770, 781340, -898060, -122005, 108704, 562896, 298536, -565210, 256346, -837609, -245073, -621021, 925134, 593069, -110713, -831607, -911563, 537351, -61028, 622521, 631464, 707124, 54923, 921020, 678602, 65134, 271012, -936290, 872149, -532341, -25557, -913575, 779499, -77600, -452681, -677878, -242613, -180159, 692264, -947504, -210654, -520147, -342696, -818515, -828066, 583336, -385689, -921470, 57481, 626151, 617344, 873023, 777478, 82584, 789614, 68076, -272098, -180713, -733114, -170382};
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
    public void testSortingTechniques59(){
        Integer[] array = {688719, 518444, -436763, 416400, 583218, -878683, -522900, 789719, 793831, -244356, -977502, -860939, 75471, -40805, -684828, -9677, -960787, -26686, -423251, 189970, -194606, 251484, 958659, 74315, -240456, -743902, 292259, -373519, 547305, -104284, 211290, -860531, 157161, 398681, -106276, 389977, -667508, 903387, -467629, -304677, 37099, -346648, -876835, 353339, 467306, 172884, 815855, -216242, -348356, -370301, -750997, -352514, -213115, -567953, -249242, 523960, -807718, -789242, 520175, 658357, -782767, -357847, 667998, -832008, 452345, -170315, 514434, 99267, 440999, -580098, -484114, -497679, -142350, 569472, -392923, -3205, -32285, -503464, 572101, 638751, 609321, -722649, -482374, 285486, -637769, 804154, 927613, -630989, 920261, -987244, 432355, -862278, -307628, 654410, -550379, 127037, -482618, 536118, 356110, -598614};
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
    public void testSortingTechniques60(){
        Integer[] array = {353185, -527085, 638336, -744748, -689291, -617526, 674648, -419226, -549698, -366158, 460512, -275751, 715466, -648870, -922679, 821878, 794284, 623673, -916820, 28893, 589534, 262686, -978818, 865459, -366260, -35585, -462504, 515962, -699278, 958352, -74985, -166500, 110204, -66619, 874137, -496378, -699417, -233125, -450623, 364410, 11676, 902995, -147759, 9889, -836103, 729991, 951995, -987030, 4244, 245965, 248664, 77045, 144422, 58820, -19614, 35390, -2336, 626788, 466570, 246799, -196640, -51551, -502848, 450909, -313657, -795474, -937112, 744962, -320247, 483154, 360495, -12253, -498504, -290032, -590584, -113317, 873940, -305618, -26549, 596258, 242552, 176556, 479739, -967034, -954837, 445633, -668619, 551210, 282047, 747193, -513848, -162844, 751780, -159109, -866701, -641495, 923521, -566471, -520867, 278565};
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
    public void testSortingTechniques61(){
        Integer[] array = {214191, 109935, 460099, 920855, 373526, 650585, -52248, 33508, 260715, -652941, -439664, -368828, -812584, 362850, -775659, 228480, -130698, -197815, 937376, -546159, 210783, 927651, 190637, 428436, 74434, -266469, 927550, -611156, 636606, 857594, 620688, 789191, -3300, 262105, -905120, 898571, -233192, 263396, 309275, 146190, 239313, 263075, -335620, 497003, 944272, 371831, -941370, -421507, 419414, -559100, -511860, -304756, -272641, 247872, -283240, 383162, 563862, 383572, -417853, -710555, 854743, 706843, -209891, -230339, -104989, -416600, -69702, 55416, -38955, -856990, -969265, -255733, 415235, 590226, 666682, 300361, 30546, -627235, -336869, -736081, -967192, -535843, 865695, 984073, 467992, 484309, -281911, 880041, 648554, -192221, 233192, -630053, -37761, 967563, -87891, -449715, 873133, -807225, -915569, 91487};
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
    public void testSortingTechniques62(){
        Integer[] array = {-147797, -715678, 648096, 471446, 234947, -583721, 337806, 538072, 20156, 56547, -801669, -99459, 46547, 975063, -456625, -916354, -677615, 316051, 468591, -630882, -382831, -632418, -556272, 330176, -561248, 637745, 348455, -216362, 930225, 803144, 169800, 648803, -48047, -783050, 61073, -845811, -302131, -43990, -494139, 50302, 345680, 952956, -814478, 946012, 170645, 586463, 726608, -103237, 276686, -569964, 55926, -41764, -239384, 603046, -634992, -930191, 343258, -892850, -50665, 824941, -991489, -507001, 244180, -892007, 854216, 469695, 162353, -182714, -801126, 133946, -62756, -175241, -146692, 388688, -718879, 289834, 28315, 792329, 82177, -93692, -611199, 563785, -10045, 467120, 457576, 294248, 180406, -295843, 59291, -708804, -392659, 364218, 558724, 589670, -895043, 882899, 3273, -219889, -701683, 922219};
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
    public void testSortingTechniques63(){
        Integer[] array = {-943347, -514155, -425026, 401223, -265354, -29639, 392760, -943888, 551448, -653042, 631559, -447734, 210062, 205878, 128006, -380979, 264534, 406600, -277304, -223169, 170565, -193884, 695776, 488110, 871509, 900050, 356906, -245932, 572255, 285727, 618134, 94763, 348804, -217421, 521967, -225880, 326670, -511342, -664224, -565209, 712325, 133587, -978626, 885110, -56277, -140403, -939642, 949363, 484390, -2575, 6527, -957765, -329976, 493408, -672320, 66027, -623671, -707210, -494180, 238367, 779909, -977261, 238179, -993435, 237990, -152911, 904208, 689000, -731027, 941494, 937684, -502504, -498136, -967863, 324630, -389091, -721894, 932776, 532083, 182616, 506857, 864269, 760922, 763223, -12719, -767306, 832357, -651962, 297061, -418662, 39373, 683215, -564074, -439654, 224837, 359654, 527263, 179768, -680498, 588204};
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
    public void testSortingTechniques64(){
        Integer[] array = {152854, -37687, 680884, 844604, 639712, 928716, -243327, -13420, -623132, 424646, 64625, 635709, -535143, 438902, -846983, 405732, 680839, -834414, -830972, -608602, 166482, -526750, -507917, -532396, -121789, -872718, 19130, 842273, 938672, 637969, -14884, 245252, 845724, 24962, 45540, -119945, 874751, 548461, -491203, -498956, -430292, 159217, -375857, 400989, -19639, 561270, 824175, -490604, -193494, -209830, 128575, 837476, -392488, -158435, -950780, 880894, 290910, -187889, -663728, 622420, 339247, -508091, 315132, -164737, 956827, -220661, 109497, -570526, 203016, -818838, 580624, 228036, -758679, -363904, 301578, 722500, 192788, -523314, 281277, 945404, -356971, 607574, 537864, -250037, -301138, -861043, -855261, -179956, -227736, 364419, -274026, 809048, -670240, 278053, 913364, 842219, 592132, 800267, -363730, 932711};
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
    public void testSortingTechniques65(){
        Integer[] array = {-826972, 796180, -939236, -667961, -344956, -819419, -877153, 131007, 240718, 739117, 968562, 3133, -750908, 675675, 935944, 859823, 317304, -510550, 378682, 173451, -455247, -689672, 155717, 859445, 866517, 322012, -205002, -632626, -892524, -70462, -261246, 49337, -766206, -191785, -932003, 622930, -264927, -545692, -681998, 759164, 337530, 685161, 747282, 292898, 436005, 428099, 206669, -859441, 585553, -574218, 511897, 653019, 91424, 765177, -359388, -639825, 142240, 784783, 588974, -518689, -254699, 467163, 639911, -273446, 461185, 967557, -723152, -250882, 120671, -388784, -951340, -774057, -677284, 647867, -817698, 730816, -988382, -458189, 893483, 546028, -645528, 550509, -761092, 78573, 989456, -495632, -539592, 509859, -370463, 742130, -667967, 974519, -745791, -711818, -227645, 807035, -785107, 800421, -930229, 458589};
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
    public void testSortingTechniques66(){
        Integer[] array = {921971, -945769, 523818, -245890, 928513, 894461, 965304, 634197, 599356, -807825, -132174, 200814, 280780, 451901, -540690, -933906, 715083, 867232, -304053, -65953, -282405, -947699, -381929, -521700, 554778, -355491, 787139, 28583, -891811, 212628, -16463, -62892, -643509, -575626, 252456, -878764, -500813, -245565, 612048, 974452, 637674, -822355, -818260, -889837, 713568, -437234, -917132, -368519, 945643, -453175, -334333, -218339, -208628, 600637, -312001, -840872, -691103, -847428, 302750, -327326, -352355, -695584, -793744, -431585, 31826, -50342, -805712, 991695, -206655, -401065, -358116, -573545, -380524, 737095, 666593, 632773, -339047, -265683, 916228, 835859, 478038, -539810, 524712, 200955, -861947, 840080, 555899, 906039, 232060, -597865, -89149, 777582, -6714, -455138, 692523, 19075, 463735, 883011, -97730, 576851};
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
    public void testSortingTechniques67(){
        Integer[] array = {-917839, -321579, 823043, -386167, 560684, 342897, 227381, -387103, -806114, -996386, 779175, -928737, 231790, 11891, 430924, -124870, -291659, 693153, -559485, -856007, -829441, 190913, 817538, -591603, -915160, -57966, 517360, -549293, -10778, 593321, -226248, 510801, 491944, -675907, -206753, -510090, -657064, -478527, 548466, -740142, -523305, -279558, 459201, -411919, -675263, -298770, 533431, -761921, 372896, 57609, -685311, -712093, 160526, -391222, -293826, 669283, -196828, 758581, -220432, -553898, 514651, 66609, 828752, 101436, 152266, 534288, -656167, -546313, 571747, -624059, 368033, -306960, 821707, -845078, -921002, 137024, -953413, -868481, 429612, 663374, -384370, -956656, 266461, 315969, 123395, -249194, -388638, 855759, -154863, 541303, 662470, 636800, 73933, -235746, -398204, 265100, 131962, 870981, -812130, 690548};
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
    public void testSortingTechniques68(){
        Integer[] array = {-853798, 539834, 169904, -754356, -562333, 367609, 63391, -613488, 40025, -714631, 717612, 50230, 455869, 37990, -324429, -689887, -393303, -387132, 217533, -680847, -782019, -243035, -92166, -992574, -916079, 386898, 669921, -825193, 63133, 643281, 438533, -93222, -901391, -303091, 887409, 414910, -634035, 634241, 108501, 952841, -443051, -646201, 969402, -194465, 778454, -353798, 420601, -201883, 921977, -54685, -968915, 757615, -370068, 542875, -211183, -686026, 247492, 433761, -330728, -964452, 412952, -922501, 32861, 704967, 174469, 104682, 651683, -837362, 635190, -4359, 365020, 512485, -253076, 950965, -867392, 89840, -471891, 139400, -142155, 235900, 94534, -750877, -438672, -586113, -948719, -404803, -835585, 161770, 667935, -383309, -969028, -237157, -541666, 634892, -11662, -443918, 722418, 764204, -669483, -722032};
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
    public void testSortingTechniques69(){
        Integer[] array = {-608511, 768095, 26707, 253084, -249157, 803433, 76477, -621689, -995097, -467676, -932060, -953665, 899997, 233687, -266070, -109615, 239345, 27527, -408979, 706945, -652424, 30121, 958852, -275703, 782377, -14000, 253256, -551733, -449111, -543401, 871162, -716952, 647666, 676422, -840378, -83557, 6597, -83265, 177309, 266169, -870763, -530071, -68102, 79590, 866613, 14168, -551090, 614138, -476287, 344446, 309328, 900520, 652480, -244468, -889705, 661382, 179484, 837570, -649591, -406842, -601337, 496262, 621947, -666987, 184857, 851778, 786389, -456198, 919714, -746520, -411048, 715653, 83265, -531852, 528880, 429887, -904988, -484510, 878996, -818145, -999970, -863903, -756469, -283402, -223512, 310778, 822164, 112963, -200872, 425586, -519851, 598317, 338727, 445261, -760760, 47480, -669595, 959645, 540065, 880737};
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
    public void testSortingTechniques70(){
        Integer[] array = {139879, -118492, 22625, 761952, -234299, 681838, -810365, 413276, -913656, -778432, -499764, 297763, 864692, 501779, 87698, 482462, -281155, -613683, -115097, 777949, -832175, -624047, -14092, 227072, 161416, 739413, -484727, -218772, -59679, 383625, -183555, 865718, 422440, -644222, 683513, 621907, 929591, 199491, -365216, 308555, -390642, -129930, 896497, 62999, -514172, 326229, -190007, 855448, -214703, -103670, 125976, -951390, -558045, -561688, 793130, -25952, -225846, 282508, 763958, 831474, -29076, -983941, 888342, -585812, -375706, -642552, 234947, -420590, -773394, 833062, 581182, -551433, -818433, -682835, 898318, -56929, -519041, 76576, 414101, 613307, -410879, 407008, 356466, -601530, 623850, -807954, 379919, 450940, 185545, 997181, -141656, 738458, -140896, 26889, 286655, 555969, -893628, -501767, 47046, 107150};
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
    public void testSortingTechniques71(){
        Integer[] array = {357863, -498102, -224578, -135799, -738625, 82432, -204061, -944666, -958072, 594030, 418549, 177935, 490524, 251021, -959134, -115324, -736927, 305087, -764486, -995377, 319529, -18859, 890196, 39139, 119687, 342196, -400312, -258950, 708287, -841320, 675671, -63590, 673527, -598992, 617329, -482853, 838948, -781048, 55028, -382051, -170386, -304007, -605338, 213608, 173944, 34509, -970903, 21414, 393332, 579964, 909386, 950314, 363880, -460291, 915760, 795443, -746698, 543133, -975384, -944255, 967888, -176366, -582963, 675756, -791527, 429282, -226396, 257215, -721450, -263114, 919558, -307428, 837755, -873977, 377459, 6889, -15052, 200009, -17867, 673073, -124677, 559698, -129347, -662697, -210583, -170968, 378100, -301868, -137596, 921207, -580872, -415883, -628036, 354477, 476834, 866427, 467350, 903437, -294883, 356329};
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
    public void testSortingTechniques72(){
        Integer[] array = {854250, -731560, 415913, 316435, -611631, 408367, -414762, 588225, -189353, -801379, 741659, -998085, 801766, -22302, -435892, -417474, 546430, -501122, 762628, 3987, 46786, -881623, -930476, -116, -777518, 863555, -938714, 517950, -910481, 954979, 50975, -64573, -827748, 382216, 27776, -382291, 862500, -779757, 18590, 766599, -55321, -262206, 179708, 468341, -753508, 868379, 501238, -65232, 785566, 79223, 312031, 293437, -571819, -511072, -662860, -652223, 694461, 263977, -129974, -207375, 430245, 905597, -364937, 893015, -507051, -955156, -994023, -527914, 226307, -526155, 182093, 798671, -85050, 194599, -950462, -372451, -960371, -484811, 492073, 19663, -563553, -816868, 572347, 429165, 403301, 825741, -726652, -350606, 163952, -711283, -180944, 217282, -474917, 539988, -946514, 493969, 507748, 988178, 746776, 957345};
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
    public void testSortingTechniques73(){
        Integer[] array = {272918, 94002, 366767, -4916, 140434, 683389, -581258, 302775, 154123, 205062, -257292, 468227, 553340, 643400, -535708, -284042, -74319, 225932, -546983, -465949, 411736, -595571, -342354, 123092, 724656, 751102, -335631, 778353, 439622, -169320, 682246, 440920, 244903, 185414, 132630, -819354, 678244, -693741, 3596, 919382, 676848, 321989, -898146, -76018, 145163, -154872, 326264, -891276, -465010, -338160, 937753, 285444, 406847, -856607, 690873, -219229, -140994, -808810, 413941, -387085, -299910, -870441, -627984, -619900, -14104, 28108, -639374, -261698, -363374, -944160, -18059, 297022, -957836, -982829, 13733, -846755, -444518, 113085, 880872, -834495, -611599, -205854, 420209, -380326, 336273, -727235, -552115, -28131, -26994, 716595, 189693, -995299, 1856, -630084, -983644, 70283, 725829, 727051, 894774, 600908};
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
    public void testSortingTechniques74(){
        Integer[] array = {818838, 910808, 530587, -902707, -839166, -171824, 71966, -129409, 436801, -689081, -385176, -667584, 659481, -264735, 595023, 994498, -201800, 789788, 430673, 119534, 485138, -299525, -866370, -634787, 859932, -592162, 840228, -658072, -973175, -621076, 438701, 762697, -203937, 461923, 967301, 854168, -111554, -818389, 322685, 84384, 66571, -204596, 271937, -159771, 892965, 823303, -45973, 384966, 131423, -161193, 627524, 161696, -248945, 581056, 528035, 981649, -271647, -935920, -621105, 53714, 764054, -992596, 725160, -558330, 622636, -624852, 256130, 916943, -322865, -808769, 202951, 439510, -642657, -399511, 491681, 966784, 917014, 872954, 179804, 150475, -51246, 489412, -32872, -9783, -186692, 89056, 317140, 870512, -651276, -174735, -404556, 111958, -589220, 375460, 482163, -799789, -47212, -129898, -518585, 426045};
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
    public void testSortingTechniques75(){
        Integer[] array = {334601, 8444, 773822, 52967, -426420, 394860, 24184, -730790, 361311, -548376, 781131, -277324, -165347, 283705, -268089, 272759, 745670, -980498, -300292, 389330, -133196, -400241, 304292, 572679, -933552, 305881, 205630, -723902, 897185, -258761, -89643, 669859, -778779, 436641, -360319, -374296, 548035, 25605, -575239, 320899, 707086, -110466, 876726, 966575, -955661, 31616, -48545, 524692, 316353, -659276, -300567, -504992, -975092, -375533, 322339, 84503, 185540, 951145, 608797, 723968, -671200, 451278, 415814, -978884, 816337, -835552, 853375, -479184, -88083, -591091, 982838, -639165, -844426, -566410, -226788, 175233, -863694, 385795, 247882, -705359, -659108, -327768, -498006, -825299, 651458, -25537, 926, 24923, 958368, 885960, -579949, 521536, 294109, 248734, 815398, 567481, -227466, -692224, 995960, -812028};
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
    public void testSortingTechniques76(){
        Integer[] array = {632213, -176011, 573979, 917960, 852694, -464845, 117864, 295929, 54558, -279307, 693166, 25962, -176238, 568976, -549312, 616566, -480778, 757738, -42702, -777595, 851816, -684154, -518390, 834460, 444309, -721328, 857098, 211807, -964856, 206895, 782159, -793658, 768494, 315440, 29754, 403552, 884245, 537337, 908467, -843453, -384534, -960964, 659760, 11745, 892000, 631101, 735105, -578092, -134138, 265254, 19226, 27848, -270872, 173245, -829739, 407806, -442457, -29218, 441014, 127129, 170270, 324038, 524592, -84185, 49261, -377214, -572118, -983466, 716319, 156740, -974739, 295381, 46945, 560129, 25014, 197424, -870569, 113673, -996731, 849329, -525109, 422091, -431106, 381062, -427808, -173718, 409439, 651773, -36732, 784605, -944373, 60443, 196776, -515383, -473708, -650846, -194039, 818692, 340678, 143950};
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
    public void testSortingTechniques77(){
        Integer[] array = {-97756, 84699, 885808, -816902, 804750, -595894, 492240, 559287, 299593, 821971, 211763, 991530, 954417, 75814, 718298, 817522, 577491, -41601, -843464, -628110, 173156, 383018, -863196, 227095, 983641, -798931, -946782, 958829, -271539, 855114, -477246, -301640, 18075, 19053, 100998, 587736, 868835, -169194, 508236, 284659, 770460, 962508, 798715, 923654, 533338, 267917, 374061, -836686, 344170, -834944, -842529, -547333, 102750, 795303, 962607, 172965, 103068, 559231, -301109, -759654, -685175, 829972, 323382, -426796, 781011, 735000, 107218, -592814, 714960, 317409, 465475, -575790, -760458, -996440, 559650, 10781, 463962, -815265, -785905, -263590, 510102, 18953, -476176, 582911, -143707, 254218, -71118, 336865, 412175, 135747, -357892, 836442, 839005, 879171, 489902, -512872, 25586, 697844, 87196, -574900};
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
    public void testSortingTechniques78(){
        Integer[] array = {-103576, -329648, 588836, 484181, 266990, 753072, -983427, 10747, -56442, -717338, -854337, -59602, -300745, 83938, 563543, -525514, 862598, -738006, -958390, -789941, -714611, 313427, -749181, -971806, 455476, 755529, 647135, 691670, -483459, 502532, 822453, 961147, 240578, -489731, 62272, -664239, 852121, 300661, 680881, 48744, 966763, 987065, -704533, -316383, 98349, 234542, 157739, 740588, 542796, 893885, -799687, 236547, -461656, -632828, -14334, 259497, -160725, 171845, -936317, -206928, 798136, 615303, 794157, -104999, -327204, -818865, 278165, 789912, 884209, 118886, 1366, 620323, 424731, 947432, -109272, 832883, -870671, -94203, -901927, 685157, 678938, 368589, -697379, 80713, -690817, 708491, 452059, -710555, 54474, -404266, 265837, -925491, -183393, -583351, -874183, -835985, 298725, -520013, 925714, -29330};
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
    public void testSortingTechniques79(){
        Integer[] array = {900226, 812328, 784013, -684435, -455323, -558568, 986162, 615162, -686331, -46172, 215721, 334754, 535749, -770270, 271269, -255091, -943658, -68006, 106455, -279253, 252607, 669428, -714397, 229887, 90490, 799976, 418107, 514633, 147622, -68934, -948134, 64586, -139415, 547747, -151155, 895819, -199738, -20839, 238211, 434012, 404622, -148717, 272346, -700306, -974541, 170136, -355683, -234895, 195174, 969186, 304867, 489112, 364416, -382816, -112446, -822622, -908303, -336063, -672055, 789565, 131151, 866761, 123280, 106071, -252544, 80848, -396865, 407841, 40781, -134724, 878149, -437113, 252211, 191134, -298610, -312614, -496889, 302015, 876747, 794907, 177205, -354361, 160493, -913916, 140214, -748246, -871718, 938551, 719207, -72167, 278489, 30828, -208089, -791613, -996307, 567376, 2626, -35507, 991521, -780283};
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
    public void testSortingTechniques80(){
        Integer[] array = {-400705, 188355, 998195, -89562, 982098, -824015, 518782, -785534, -604572, -111627, 351867, 581375, -303110, 969579, 636823, -674757, 203768, -527156, 975922, -5461, -750952, 80901, 136865, 245102, 460481, -632577, -614936, 315597, -137672, -158995, -228872, -722838, 835767, -260693, 897710, -227347, 237941, -973063, 122494, 176657, 565190, 907945, -756146, -38711, -553373, -636698, -902011, 578035, 644751, -611927, 93210, -511974, 829632, -381710, 944413, -361024, -144185, 804836, -754509, 538033, 436906, -499187, -973150, -228452, 718390, -551070, 584857, -357811, 284655, 462159, -442780, 405353, 721024, -376680, 186620, -470008, -230760, -616400, 6032, -760380, 284218, -471877, -228936, -964056, 891440, -945880, -382642, -597627, 873923, 171414, 271242, -726185, 541372, -405620, -310511, -251944, 226250, 996320, 42767, -631197};
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
    public void testSortingTechniques81(){
        Integer[] array = {132171, -72402, -208476, 564601, 209521, -423604, 169725, -252461, 223053, -234950, -475471, 512609, 665572, 606990, -671767, -439764, -351679, -123712, -803456, -947101, -247628, -751090, -279568, -284991, 596911, -428384, 958502, 80127, 828535, -277246, 805203, -429728, 286089, 899430, -8823, 300580, 862988, 395370, 761446, 374547, -981230, -35257, -482030, -660116, 209006, -773492, -369145, -18156, 991503, 92132, 550278, 363359, -686062, 616439, 394323, 372228, 973149, 245058, -765508, 21756, -583746, -393392, 609898, -914279, 832349, 584701, -670639, -222307, -404798, 473461, 340225, -476050, -622107, 389810, -90123, -593430, 836414, -729099, 354385, -619798, 550498, -39495, -507123, -584178, -751951, -734981, -697749, 844496, 829331, 705876, -98218, 73141, 447687, -477742, 559630, -493377, -635036, 234227, 657824, -255264};
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
    public void testSortingTechniques82(){
        Integer[] array = {977350, -922820, -703892, -817208, -277465, 803603, 500445, 774751, 865159, 809889, 241785, 260505, 289691, 208480, -260108, 652744, 323846, -976691, 561511, -660768, 229134, 335013, 540947, -833002, 966950, 253139, 938718, 988628, 490636, 524227, -212548, -671588, 694370, 854989, 344223, 23187, 222834, -815952, 117275, -153972, -573022, -705276, 820726, -276893, 633466, 139047, 845039, -821239, 408319, 321950, 328044, 960348, 150200, 964896, 632237, -797372, 162605, -356901, -573479, 225925, -457909, -798133, -190648, -998406, 212315, 353090, -311262, -460176, -514940, -429724, -420749, 958141, -281748, 814071, -497668, 291861, 822249, -218995, 328079, 969799, 676298, -107229, 546981, 716671, -493583, 192565, -109636, -222650, -32301, 608982, -295689, 936817, 515365, 627606, -474232, 190157, -94114, -209620, 931235, -584053};
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
    public void testSortingTechniques83(){
        Integer[] array = {736874, -959026, 738373, -326595, 385766, 961479, -80018, -916360, 336986, 767608, -768506, -84688, -316056, 583416, 648684, -806319, 827929, -895681, 78646, -345476, -14009, 6363, -251300, -682440, 963317, 897694, -325746, 516756, 276075, -294796, 504579, -260114, -508246, -927943, 485483, 264673, -423588, 58562, 610882, 506401, -756506, 684600, -800245, 773151, -609434, -773445, -241607, -527771, 650509, 890397, -878593, 571584, 250781, -924165, -465283, -166188, 210991, 263755, -369381, -115819, -88538, -530066, -798796, -871689, -277388, 107771, -171724, 511508, -465009, -209465, 587400, -920244, 673333, 866943, 337527, -94488, 635357, 284084, 44544, 70767, 418407, -838628, 660318, 723065, -764785, -866153, 561847, 330829, 101123, -242123, -768440, 218957, -267377, -228797, -335849, 83786, -240856, -202760, 510250, 664943};
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
    public void testSortingTechniques84(){
        Integer[] array = {152647, -234272, -412117, -169619, -56473, 50328, 734544, 671417, 840319, 890935, 495188, -69591, 196978, -739290, -735924, -564846, 781926, 37069, -614789, -555711, 891606, -843404, 424909, -79840, 574120, 726681, 959376, -984019, -694408, 111601, -301747, 357076, 11862, -462927, -716318, -475904, 618755, 406914, 140377, -48920, 756628, 455550, 23311, 32397, -28689, -410668, 295951, -919082, -88570, -954598, 603868, -276443, 59832, 765621, 70274, 760680, -758358, 595696, 677438, -560321, 743331, -476390, 101876, 121381, 97901, 733699, 661848, -231131, -840499, -548348, 81411, 329757, -78335, 941775, -251689, 523172, -165882, -160268, -227818, -717772, -705841, -141252, 383825, -154154, -406252, 39455, -975687, 537396, -306111, -588849, 767463, -530193, -365773, 5380, 74561, 476350, 84488, 822041, -630743, 505065};
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
    public void testSortingTechniques85(){
        Integer[] array = {45829, -444902, -775299, -656524, -867581, -184963, 919047, 797458, 2206, -494983, -36691, -34456, 34842, -548161, 414899, -198856, -709977, 431140, -858145, 849372, -695205, -2436, -830130, 203050, 764068, -160806, 822819, -759818, 128309, -713755, -371424, -811379, 495264, -165269, 446936, -750917, -447307, 327130, -213727, 690391, -133361, -78800, 721345, -367625, -908448, -831370, 465330, -109544, 652398, -611326, 328810, 227723, 710072, 986347, 796258, 45951, 425332, -498461, 772534, -546848, -622862, -682532, -9387, 962860, 337176, 447309, -960177, 954581, 859068, 49864, -896193, 93634, -343803, -827800, -953295, -213268, -470844, -713048, -191372, 98484, -127598, -956606, 246058, 313295, -416577, -183685, -717746, -433222, -288807, -908840, 394442, -154634, 572480, 639547, 413499, -612856, -688957, -388191, 830286, 938011};
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
    public void testSortingTechniques86(){
        Integer[] array = {-677706, -650387, -64657, -267575, 906418, 312366, -265040, 630166, 17644, 214274, -100116, -381367, -63915, 601564, -820052, -471171, 232952, 28135, 169720, 818561, 889629, -604814, -613420, -842040, -103664, -116732, 772379, 876036, -365595, -231139, 696550, -332173, -201129, -11454, 910803, 32624, -895745, -392567, 188479, 451722, 139784, -373574, 66040, 229232, 347119, 128672, 928498, 217267, -537987, -566658, -632337, 888827, 456895, 667120, -37474, -250531, 33996, 586009, -500727, -772358, 451809, 994043, -414845, -697748, 989740, 93030, 564672, -212275, -808351, -983088, -773129, -179429, 787670, -182389, 617989, 791222, -937755, 118211, 353677, -587172, -433886, 118156, -67175, 511167, -17785, 20123, 793899, -85331, -653764, -388028, 70478, 370521, 10807, 968446, 54451, -579108, -537066, 143745, -625375, -961033};
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
    public void testSortingTechniques87(){
        Integer[] array = {-246602, -353128, -68216, -651734, 309211, -503672, 526917, 727701, 388190, 997079, -394264, 262649, -453399, -438591, -858384, 8279, 78675, 177006, 509524, 658255, -969351, -326185, -858521, 725481, -699762, 38635, -159456, -962006, -751414, 141458, -468099, -931421, 306428, -609677, -43605, -158598, -94034, 881531, -816654, -777281, 747864, -720031, -951366, 304092, -831572, -51013, 388550, -570743, 264593, -499230, -667636, -798702, 228277, -123207, -154397, -995064, 9469, -476518, 569497, 668912, -614790, 504318, 963266, -662785, -629824, 892834, 791708, -238860, 105244, 783499, -224900, 923309, 685739, 249780, -151945, 370368, 203054, 830293, 171530, 770014, 767748, -830105, -453164, 49506, 685015, -970623, -36918, -189464, 638456, -493003, -847835, -44452, 998750, 18126, -36089, -942860, 258600, 380516, -289480, 541373};
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
    public void testSortingTechniques88(){
        Integer[] array = {-434338, 648119, 370703, 459487, 666538, -665301, -255306, -104667, -867150, -769144, -142257, 140179, -748825, -592325, -111428, 542028, 964854, 426398, -896307, -783037, 967242, -988489, 279702, -370820, 930678, -657541, -931708, 851162, 290880, -379092, 757395, 250964, 387694, 262974, 739549, -106184, 603762, 90189, -48191, -263939, -778466, -948118, 433282, 825023, 520566, 866795, 870095, -360644, -872452, 295237, -19014, 992316, 318007, 551046, 653141, -581128, -442848, -658661, -188591, -726061, 663894, 504746, 348947, 184609, 832930, -259105, -626958, 496171, 432036, 524686, 320748, -556411, 752851, 893831, 224618, 815644, 614907, -154775, -452636, 861172, 590231, -136713, -368806, 79482, 488500, 127603, 609292, 372471, -474425, 285324, -805371, -218416, 656597, 144961, 750721, -830351, -891877, -723910, -117452, 129115};
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
    public void testSortingTechniques89(){
        Integer[] array = {500447, 484437, -438160, 418200, 889100, -623768, -625481, 680325, 648748, -671639, 392076, -478386, 792145, 909258, -437184, -956142, -584795, -312586, 286310, -837734, 260514, 705984, 255962, -940946, 238384, -46809, 695251, -686247, -259236, -585713, -384700, 650081, -184897, 264795, -769606, -742066, -928425, 165128, 464373, 783716, 316026, -967632, 343221, -350561, -823129, 884381, -87811, -799151, -88398, -973141, 15089, -164039, -428189, -714759, -46927, -196283, -923122, 436886, -750080, 265323, -210748, -899697, 641521, 65944, 969836, -167424, 307889, 432662, 413187, 985047, -497916, -113303, -263489, 296582, -550200, -941986, -412386, 269384, 696346, -296180, -769779, -242278, 758601, 811079, 193002, 712475, 135589, 723486, -827168, -24020, -523831, 117567, -232732, -10469, -573582, -243755, -779608, 452139, 405591, 156509};
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
    public void testSortingTechniques90(){
        Integer[] array = {-926450, -592186, 750844, 27955, -312126, 749189, 292662, 888038, 665995, 557617, -761174, -307565, -97584, -783056, -949934, -912917, -959752, 611721, 962468, 58315, 523680, 771218, 629584, -949829, -79501, -309996, -874941, 699741, -707789, 421648, -970609, -90389, -572494, -797426, 773001, -166242, 76142, 177560, 42802, 92228, -928756, -201118, 581712, -562395, 485125, 694443, -339527, -172787, -144964, 503926, -985109, -11739, 330483, -923140, 172392, -185515, -195562, 936796, -754667, -759939, 85801, 50461, 481602, -295717, -166473, 137775, 561332, 250214, -217607, 273274, 743230, 739790, 838676, 953771, 914753, -587948, 403113, 319346, -252063, 748129, -873940, -290271, 688269, -620711, -835314, 344962, 599366, -475511, -47706, 322164, 963770, -553160, 378435, -495216, 528179, 743349, 238468, -161461, 812358, 715344};
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
    public void testSortingTechniques91(){
        Integer[] array = {764029, 191661, -853501, 450063, 418486, 29265, 873109, 161401, 523362, 709175, 18901, 892162, 992146, -545890, 436384, 115249, 227648, -688263, 202566, -102215, 585808, 24099, -48241, 991458, -85736, -300457, 280248, -183092, -783512, 128035, 104151, 137977, 210519, -794529, 788485, -170334, -419794, 614607, -912454, 966556, 710311, 939034, 160996, -448316, -5574, 258204, -337381, 600783, 822538, 379933, -695977, 508717, 568994, 765196, 226167, 986767, 870477, 426202, 479166, -784580, -740367, 383874, -855043, -2965, 622559, -238537, 741428, -591167, 344879, -282046, 811271, -127359, 527107, 424496, 573907, -865747, -47927, -526844, 120260, 401701, 33288, 898914, 580316, -13554, -340302, 358523, 223169, 620087, -444447, 797171, -527691, 146389, 807678, -821979, 522331, 248573, -98350, 684768, 476934, 858842};
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
    public void testSortingTechniques92(){
        Integer[] array = {-740409, -309186, -546431, 857182, 759834, -390942, 481166, -287341, 153800, 304576, 328945, 945852, 399643, -807400, -58448, 10331, 886625, 248447, -985073, 831730, -588372, 795209, 20982, -348718, -81889, 633832, -896228, 2566, -585797, 865236, -35424, 830588, 783778, -12581, -308236, -17983, -757147, -635373, -914691, -128288, 635048, -937500, -49951, 642709, 317233, -516348, 834920, -24623, -286195, -961703, -981108, 432329, 942168, -17362, -927285, 681793, -567428, 434496, 565585, 210176, -798392, 4908, -966404, -932416, -460946, 108764, 161864, -978008, -854984, -784924, -160042, 332522, 766623, 85103, -888635, 569661, 750071, 838370, -5979, 83812, 930817, -870860, 602774, 383900, -575749, -54173, 85245, -867229, -985691, 783068, 864525, 827143, -408252, 433944, -858495, -598064, 476675, -387570, -688074, 658129};
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
    public void testSortingTechniques93(){
        Integer[] array = {916527, -306469, -777118, -657084, -613846, -164835, -844981, -644670, -167682, 712843, 633769, 345393, -209569, -201885, -991010, 594248, 412045, -10328, 771018, -532985, 700952, -398175, -672422, 230583, -456745, 203638, 699362, 789762, -519585, 524144, -484048, -127901, 354761, 498316, -432330, -876811, -949496, -290868, 924672, -556653, 532832, -61419, 121516, 767977, 963819, 626742, -224311, 802588, -795943, 697298, -7912, -39259, -839167, -806262, -678911, -733259, -454090, -403425, -603865, -163861, 645944, 31488, 587067, -270492, 301609, -920590, -745300, 469571, -698638, -511351, -774350, 679746, -422936, 311190, -238337, -102043, 348163, -258178, 410858, 749285, -722155, 669867, 614188, -893760, -750763, 715054, 649161, -36281, 581324, -575737, -365721, 788126, -555241, -296125, -753740, 950435, 567173, -367134, 26275, -976058};
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
    public void testSortingTechniques94(){
        Integer[] array = {-182938, -40530, 480792, 817794, 158641, -270746, -665947, 801172, -115370, -438522, 931551, -894047, 927389, -593702, 420139, 777983, 991565, -596214, 33067, -293218, -919820, 533477, -571186, 288863, -402910, -636852, 920162, -354744, -480879, 765410, -387087, -543800, 529416, 395724, 766751, 154904, 42000, -514690, 605614, -409620, -426084, 434190, -931031, -259934, 490872, 834743, -962074, 948226, -563459, 300470, -662658, 465308, 462692, -558479, 426403, 280595, 380659, -430043, 735315, 353701, -262933, -968054, 847741, 445757, -833907, 460527, -222271, -584163, 926364, -567737, 502629, -739611, 406600, -846872, -507262, -55400, 293212, -873820, 319329, -504484, -395951, -574418, 58785, -318275, -599121, 824413, -40691, 833842, 445469, -581390, 470844, 289074, 184816, -350291, 590401, -455535, 576969, 716658, -567511, 263010};
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
    public void testSortingTechniques95(){
        Integer[] array = {950590, -54656, 29632, -954112, 929977, -978421, 394615, 484793, 94144, 537125, 848743, -285770, -69395, 49154, -601968, 736949, -930329, 511309, 250340, -661205, 509552, 402093, -418344, 994958, -96214, 611948, 638736, -406137, 408325, -162864, -975347, 740136, -269034, -75016, 796850, -957103, -69868, 589816, -57681, -465430, 605196, 381019, -446700, -800762, 578433, -434242, -432030, -730885, -109588, 211156, 314809, 216448, 249376, -677737, -831187, 21540, 84589, 248435, 413021, -258342, -830806, 758876, -873719, -380319, -290589, -899272, -709743, 376091, -279900, -263457, -816509, -145501, 287454, -10918, -622408, 755581, -245408, 517413, -794866, 487138, -148334, 710938, -503070, -696510, -635726, 647606, -317089, 447232, -476093, -715913, 189861, 947164, 948866, -86810, -279150, 480876, 403923, -38418, -950638, 369999};
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
    public void testSortingTechniques96(){
        Integer[] array = {-243676, 995603, -233465, -680710, -994033, -381810, -166958, 666790, -195224, 554118, -580323, 17143, 832050, -114807, 268858, -974617, -880673, 171966, 336520, 159175, 220551, -358401, -676383, 543879, -266067, 688068, -527832, 842725, -836635, -87414, -60422, -486828, 748259, 518641, 303099, -337601, 859056, 515622, -648805, -287668, 699466, 853506, -365804, -958866, 991729, 726308, 436464, -276017, 728491, -111862, 400255, 240728, 84642, 551363, -124582, -544392, 532862, 861443, 163628, -581194, 639554, -19968, -322333, -615486, -94217, 656502, -865220, 556252, 264431, -421066, 253734, 186753, 33565, 618545, -242764, -731850, 198533, -807589, 836450, -79014, 263496, -48393, 674222, -678030, -249095, -940913, -708202, -415833, -607693, -648865, -65686, 423370, -167452, 677555, -388786, -671342, 824065, 37612, -823826, 573614};
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
    public void testSortingTechniques97(){
        Integer[] array = {-787164, -720848, -950423, 689212, 849800, -306941, -585072, -59904, 46848, -23421, 996628, -721037, 171301, 460247, -116571, -483862, 821722, -376715, 855046, 585447, 9367, -658674, 105910, -328871, -682668, 829334, 777631, 670297, -621296, 31640, 472368, 508662, -426975, -865208, -733208, 142686, -489063, -745628, -690015, -750332, 851440, 647826, 253038, -774774, -17312, -635577, 996585, 490429, -666689, 764286, 959361, 776883, -251137, 844526, -747543, -436140, -931924, 379011, 987418, 11637, -430436, 337507, 718365, -777318, 538904, 169025, -6750, -291884, 257618, -850078, -649877, 590302, 824835, -78035, 902099, -95440, -340359, -547701, 55389, -584107, -501901, 646189, 727385, 297232, -556874, 498533, -976508, 631401, -552266, -178230, -704003, 809227, 881740, -637411, -26335, 641000, -209562, -179535, 694710, 417065};
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
    public void testSortingTechniques98(){
        Integer[] array = {-518026, -385734, -153164, 769400, 15627, -539244, 399131, -206237, 870183, -74064, -909600, -859081, -12030, -53275, 104010, -816446, 877516, 277611, -108896, 647920, -955774, 686804, 548299, -179022, -62060, -657097, 978520, 200779, 29953, 144639, -539385, 26224, -286765, -501732, 991508, -561156, -257344, -524002, -196458, 538659, -318153, -549344, -987910, -573615, -462119, -232025, -159497, -821898, -787162, 823856, -475675, 559707, 278519, -623805, 542943, 224318, 497175, 323740, -300050, -116792, -80568, -362566, -286606, 213246, -529327, -372722, -175626, 471414, 721142, 100163, -898690, 101531, 237987, 764625, 335337, -897656, -722359, -724594, 42578, -634230, -655255, -865967, -73812, 21257, 888782, -543692, 205892, -85099, 840876, 99776, -477282, -705977, -545496, -68189, -629422, 969178, 399519, 641734, -624305, 953063};
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
    public void testSortingTechniques99(){
        Integer[] array = {-327185, -660977, 391676, -136679, 5115, 749661, -431503, -455866, -739969, -948414, 488176, 171144, -829706, -118189, -148953, 942797, 458014, 117194, -803019, -376043, 14594, -290735, 229667, 179211, 638244, 8997, 87670, -244014, -576872, -953888, 256779, 483152, 951398, 278449, -285668, 642025, 960883, -279782, 794506, -443042, -635664, -499355, 889386, 254519, -267698, -804439, 6791, 435943, -135287, -978490, 463520, 110503, -539025, -242954, -490201, 809596, 692569, 425586, 143624, 183119, -884328, -811886, -248866, 862288, 318806, -48137, 86217, -773128, -618753, 706224, -396036, 887323, 58411, 694627, -792782, 232801, -281824, 828277, 130084, -350223, 281927, -939291, 910162, -314421, 895907, 374951, -185530, 299743, -403705, 892106, 642184, -507075, -998122, -75171, 796108, 192104, 956858, -565634, 522844, -257229};
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
    public void testSortingTechniques100(){
        Integer[] array = {761277, 419324, -473504, 306532, -474549, -575928, -983153, -255232, 535647, 629281, -911433, 479144, 983399, -189734, -461316, -159613, 180510, 59144, -41123, -378257, 276130, -744506, 497919, -982520, 341134, -909862, -104125, 859580, -13779, -92102, 642591, 26187, -246914, 164733, 176656, 909157, 667770, 890700, 544828, -792431, -776722, 26275, 258884, -953593, 871100, -802409, -781242, 173310, 934072, -85896, 938207, -946489, 899018, -356812, 847162, 968181, -799511, 568144, 794226, 257961, -220097, -871814, -182870, 346594, -956002, 435833, 348838, 611216, -103565, 424027, 245119, -18858, 260772, 467716, -71325, 325406, -481392, -169377, -71654, 367394, -487297, 483049, 811845, -278825, 45806, -776097, -572005, -504043, 766373, -454313, -112322, 899445, -996162, -632810, -889991, -116885, 846698, -603913, -26891, 313580};
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
    public void testSortingTechniques101(){
        Integer[] array = {-548013, -63002, 444726, -695531, 470746, -900553, -601027, -370121, 824024, 466839, -503496, 810405, 353140, -559943, 426004, 760025, 680746, -348117, -433434, 724520, -38623, 870968, -915834, -663691, 424448, 374161, 955540, -820149, -505439, -112435, 690303, 803472, -830599, 788827, -187782, -668732, 738290, -264792, 275628, -501076, -62518, 395765, -889918, -43524, 131971, -218363, -442918, 787915, -252311, 328929, -917071, -146792, 54061, 474303, -718933, 320425, -994889, 568988, 501992, -835216, -915538, 825398, 557589, -189724, 158192, 94826, 239999, 877015, 652442, 432567, 123030, 786270, 379580, 231514, 964183, 485767, -111563, 264414, -895529, 911152, -470194, -684911, 479664, 620022, -837988, -328295, -481695, 190277, 863943, 919806, 811531, 454336, 323891, 342828, 205336, -693110, -539484, -684996, -744969, 396433};
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
    public void testSortingTechniques102(){
        Integer[] array = {29912, 143965, -384663, 370428, 885296, -367241, -939887, -734413, -553109, 937862, -390696, 489522, -725548, 69356, -158419, -214871, 187473, -693817, -717833, -96225, -671667, -429711, 238539, -882776, -477473, -678183, 662195, -390070, 632576, -859678, 286791, 368523, 774334, 37605, -155138, 744534, 917505, -44445, 713369, -672756, 528313, -773362, 119948, 475776, 870057, 310926, -468704, 764623, -911877, -397327, -43493, 714606, -276206, -985385, 723554, -391457, -513687, -698471, -934318, -985022, 663765, 438847, 620080, 419890, -690615, 104615, -422225, 38733, -621490, 715658, 75429, -27289, -26474, -249141, -595385, 684946, -444538, -463821, 584423, -880026, 373524, 825290, 824577, -67156, -779317, 390119, -861082, 747364, 405955, 905240, -924341, -465576, 618975, -817651, 695239, -387315, -631257, 31091, 424798, -405430};
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
    public void testSortingTechniques103(){
        Integer[] array = {-255073, 403463, 85869, 563079, 854984, 462035, 295155, 145655, 458485, -664430, 109624, -185707, 241722, 27404, 12793, -626924, 456038, -80720, -204576, -503275, -547085, 946226, 422692, 850794, -795617, -918744, -488123, 298719, -386103, -455511, 460306, -509606, -487901, 356519, 691775, -523027, -494232, -411363, 190076, 93748, -850405, 433024, 715176, -818604, 828392, 262033, 951493, 711437, -243564, -746776, -774569, 613538, 368718, -628750, 630382, -935727, 289048, -522588, 550891, -177385, 594972, -994191, 167003, -268530, -621974, 904681, 135181, -891968, -11589, 523285, 852266, -372597, -701544, 5640, -381336, -414160, 394788, 90914, -840575, -823073, -940345, 857546, 483789, 736981, -867863, 240276, 981093, 852871, 235114, -136751, 904342, -85402, -674130, -475272, 436842, -84467, -744868, -375199, -608596, 298039};
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
    public void testSortingTechniques104(){
        Integer[] array = {-251663, 509473, -503902, 986234, 364522, -929267, 602100, 630934, -248148, -610132, -820312, 949421, -462636, 991020, -82237, 527657, 706818, 193200, 497222, -74903, 610559, -497946, -236944, 787898, 485788, -85419, 362659, 768445, -63177, -509893, 319963, -179476, 632805, 688719, -128265, -863484, -799326, 136018, 722606, -282939, -954315, -697982, 958698, 995112, -275136, 451633, -229223, -298690, -290530, -889343, 847293, -125096, 317659, 249409, -308475, 851101, 767990, -629725, 640495, 362611, -683511, 344914, 492696, -76994, -119423, 937109, 454205, -666816, 614208, -187268, -606650, 800309, 984119, 352896, -706051, 935613, -148450, -647098, -907089, 433024, 716136, -680621, -848309, -120923, -600812, -522573, 58297, -578018, -492742, 344537, 951362, 700196, 397821, 820977, 525954, 134392, -845161, 849853, 927490, -140782};
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
    public void testSortingTechniques105(){
        Integer[] array = {-660755, 917644, 651668, 131163, 590052, -82961, 575789, 19303, -440453, -906422, 123671, -549340, 194900, 21718, 763779, 15804, -407335, 790753, 210276, -219178, -504155, 332899, -954614, 257977, 526382, 703546, 438730, 957240, -879870, -494228, 812954, -475787, -423183, 950070, 886918, 635180, 404134, 525266, 887062, 73107, -259992, 379621, 574093, 714774, -104636, 325801, 944088, -244115, 835489, 68616, -159116, -860472, -145872, 784627, -240581, -132906, -240670, -544893, -708527, 435333, -971234, 706870, 153550, -185042, 366680, 494289, 215072, -513769, -654638, 79652, -711109, -753654, 856155, -188146, -961651, -563701, 246026, -462729, -964097, 498908, 164934, -855277, -865553, -351358, -928401, 355371, 202605, -461469, -591785, -194361, -635705, -736155, 179096, 196097, -242794, 437504, -911566, -442709, -117803, 426814};
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
    public void testSortingTechniques106(){
        Integer[] array = {-171450, -14012, 86840, 462547, -893673, -153162, -66505, 954983, -556665, -711462, 874463, -599661, -747521, -290669, 736047, -734185, -725901, 728716, -506443, -830809, -746429, -450271, 556652, 261524, 787942, 292161, 2765, 949653, -297463, 308872, -736422, -161917, -17418, 686521, 106847, 978123, 978064, -606104, 142783, 930362, 11799, 449711, -944047, -172476, -23856, -487323, 720689, -813553, -814887, -465181, -539759, -630611, 36892, -152599, 218236, 486426, -135822, -136422, -598100, -181063, 785196, -371117, 313582, 82594, -861127, 303299, 300271, -853449, -612692, 55265, 263491, -252405, -929610, -52529, -582925, 856546, -954040, -770597, -723317, 478241, 713725, -867673, -750375, 567808, -627342, -532166, -759847, -868577, -129236, 114648, -523314, 87190, -826370, 541766, 31128, -26769, -116705, -840576, 943691, -504689};
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
    public void testSortingTechniques107(){
        Integer[] array = {608851, -61629, 763932, 180742, -703049, 342240, -677252, 685388, 444673, 757535, 536113, 723775, 413653, 659422, -772954, -731157, -496939, 42051, -340367, -65178, 64065, -277176, -61100, 913524, -301998, -672797, 337111, 916516, 325262, 838060, -299723, -858739, -806896, -475390, 572240, -851087, 458999, 266227, 546185, 468676, -585918, -59392, -945103, -380966, 771122, 32195, -455020, 137867, -808807, 148821, -717581, 211995, 772006, -511329, -91049, -411489, -786677, -474819, -55739, -646745, -520877, -60473, -561738, 206201, -802582, 502881, 775665, 408283, -109899, -574157, -823133, -106775, -23043, 583079, 906144, 267133, -191454, -709046, 144151, 430988, 981709, 53193, 417671, -590601, -253895, 226155, -671114, 883139, -696167, 743653, -790684, -347951, -697447, -736569, -346640, 243920, -161228, 360974, 411975, -786866};
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
    public void testSortingTechniques108(){
        Integer[] array = {877855, -882667, -121685, -654629, -159536, -197824, 552018, 979503, 730636, -276576, -268867, 367017, 853143, 146397, -103059, -967340, -228912, 332200, 641693, 217372, -430154, 905444, -337795, 284268, 289962, -413569, -593369, 502580, 321667, 833043, 900014, -433454, 651281, 349117, -505563, 387195, 323318, 814262, -236529, -439967, -871086, 818398, 74417, -180822, 626367, -703684, 796251, 526659, -661462, 708400, 85859, 551885, 631198, 104047, -999211, 709180, -95820, -602731, 455085, 293039, 487126, 399116, 662207, -589098, 259186, 196681, 679429, 138477, 51314, -641271, 336608, -317679, -616659, -171198, -486430, 688100, 938357, 765489, 46943, 945030, 969528, -944899, 477269, -649617, -148494, -742284, -804800, -598543, 605691, -118202, 303557, 167866, 893036, -488751, -157341, -679803, -396865, -185807, -91041, -58662};
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
    public void testSortingTechniques109(){
        Integer[] array = {-502188, 84120, 273074, -256303, 167643, 832879, 496632, -361399, -752757, 375932, 853139, 12092, 846356, -83834, 760517, -725389, -532331, -84535, 673462, 651783, 172240, -485483, -528981, 353134, 471659, 826780, 49548, 713468, -576143, 463268, 186320, 649363, 197454, 463546, 990762, -712183, 703292, 449262, 236649, 290817, -945427, -385377, -165388, 386200, -90926, -654118, -608128, -498668, 186572, 709049, -50083, -963035, -962001, 898871, 213363, 108894, 389232, -651587, -325673, -800120, -63743, 952427, 190469, 418869, -494776, -119968, -505301, 27307, -762120, -790371, 40115, -431088, 107878, 437434, -704396, 270275, -58094, -31358, 526193, 846872, 619250, -463405, -256615, 545750, 825069, -442058, 92369, -883636, -729049, -150112, 928503, 612124, 803922, 353028, -355510, 945528, 26075, 46971, 356474, -5771};
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
    public void testSortingTechniques110(){
        Integer[] array = {476996, -583380, -497277, -350008, 190592, -15548, 987312, -624573, 617459, -513163, 623896, -109776, 366887, 886750, 412182, 132259, -297828, 862413, 772897, 20075, 971599, 240791, -868388, -649766, -583432, 41380, 562684, -92940, -27176, -552762, 285365, -149227, 563905, -786002, -919469, -729155, -280224, -773416, -400857, -411638, -594943, 984784, 7908, -26283, -336918, 78199, 484680, -138013, -949872, 896760, -491169, -942478, 822029, -178572, 78926, -352559, 862027, 752698, 124985, -748639, -195871, -332225, -366935, 827839, 575085, 818594, 432982, 677782, 779300, -130859, -372796, -786115, -290050, -848323, -155951, -542515, 63068, -770934, -239687, 907580, 335850, -488511, 975248, 573649, -389383, -322449, 53563, 234965, 890433, 185723, -976775, -459078, 740306, -71809, -453953, 9750, 608837, 595665, -67509, 226731};
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
    public void testSortingTechniques111(){
        Integer[] array = {915438, 468445, -697838, -440549, 716465, -330577, -758483, 119829, 549331, -934421, -294147, -437424, -677619, -535099, 264825, -154393, -655167, -979117, 417544, -846268, -144306, 931790, 613607, -861880, 412977, 705267, -546683, 715737, 912859, 350124, 671257, -902325, -869391, -902243, 647269, 196854, -396144, -327548, 444075, 950438, -122164, -934488, 60087, 442543, 265984, -186321, 215946, 35245, -410298, -157294, -871551, -603721, 877336, -723374, -835112, -697437, 868597, -461207, -666840, 367331, 494988, 695830, 666229, -909360, 401063, 734209, -447885, -101432, 223926, -230323, -475801, -877298, -993395, -179064, 610682, -768538, -25451, 927417, 592201, -472882, 70031, 76282, -568115, 781751, 563542, -746709, 790487, 917028, -758216, -42674, -734332, 725887, -675326, 246812, -62417, 670598, 238924, -381155, 199581, 700145};
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
    public void testSortingTechniques112(){
        Integer[] array = {448028, 52491, 261135, 344147, -853114, -596682, 42209, -255626, -756850, -100396, -435839, 263605, -934604, 239491, -251379, -282071, -631468, 243170, -258969, 582804, 188047, 518843, 993304, 364282, 213713, 445379, 649691, 185835, -783534, -872840, 478075, 754543, 428336, -644197, 9663, 841158, -481908, -488945, 753551, -42212, -65292, 566445, 422134, 893402, 398799, -761768, -170495, -13155, -274139, 795375, 938508, -175696, -634684, 831259, -451946, 870348, -928690, 722185, -719454, -616521, 316026, -135149, -663854, -163000, -490157, -268736, -475519, -658576, -987164, -234349, -679134, 870101, 29615, -960362, 269748, -814252, 613242, 798651, -205161, -771202, 99641, 372035, -426788, -343975, -708375, -640932, 507354, -969112, 753530, -470846, -359773, -382467, -229865, 437081, 210989, 425346, 288598, 762719, 491793, -692365};
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
    public void testSortingTechniques113(){
        Integer[] array = {-561352, 216901, -16281, -546363, 372187, 283178, 93267, -263255, -720955, 220317, -919931, 985591, -417880, -75854, 663084, -466681, -8408, -242625, 764292, 612157, -114457, -453140, 353448, -742194, -761707, 744993, -260207, 852908, -813625, 799748, 996166, -782373, 188618, 822256, -556792, -430268, -361098, -651063, 809973, 866096, -68309, -268393, 485161, 685282, -532806, 35987, -840079, -290652, -398290, -29154, -200721, -299307, 521835, -274720, -203511, 761721, 743626, 355220, 877874, -693573, -694107, -53227, -823033, -704631, -226130, 250537, 482535, -767877, -304516, 936651, -21221, -140372, 14839, 489619, -190505, -743976, 312428, -174586, -357725, 527259, 837306, -973814, -796470, 211263, 929356, 58113, -400, 861590, -866472, -650766, 941064, 975777, -866062, -889912, -37638, 212339, 637857, -957707, 329410, 548700};
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
    public void testSortingTechniques114(){
        Integer[] array = {-389577, -927397, -560129, -3839, 348140, 11536, 147378, -852602, -594677, 821154, -309712, -195149, 171232, 76269, -223191, -161448, -715488, -940114, 983221, 56337, 735126, 142122, 918477, -511174, -389591, 424808, 318818, -791808, -543882, 810228, 762414, 760626, 315986, -702638, -266319, -38083, -885890, -961402, 482550, 709589, -202205, -294616, 833856, -813373, -320435, -957023, 876803, -469539, -453462, -167669, -689532, 826701, -775184, -117405, -966535, -20737, 998941, -951144, 532884, 370677, -907077, 903028, -802809, -685971, 744667, -396946, 623404, 699307, -732611, 6891, 479362, -479901, -746821, -26393, -111914, 496624, -590237, -277382, -326110, 892455, -448539, -644744, -82642, -814311, -912727, -945891, 135410, 4095, 706097, -230904, 933778, 971133, -268752, -275683, 929778, 603785, -34084, -39509, -879641, -118635};
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
    public void testSortingTechniques115(){
        Integer[] array = {-273050, 149119, -120081, -263504, -55039, -286625, 64614, -479663, 294021, -513452, 541464, -460261, 228388, 942870, 504445, -350050, 762199, -262701, -481068, 152757, 494118, -657872, -974700, -179005, -138128, -706608, 913133, 385116, -484045, 860420, 866502, -576001, -399441, 732283, 845681, -957134, -795215, -573594, -492579, -604957, 482763, -709678, 462485, -149357, 303102, -752524, 324120, -540499, -655191, -321439, 471864, -125569, -243439, -180308, 139131, -432160, 466300, 695804, -836422, 612500, 424696, -737876, 619569, -435522, -702349, 408907, 82466, -223869, 975749, 595065, 290831, -864649, -168513, 86715, 192667, -749263, 697663, 527015, 359703, -761616, 425239, -542698, -42640, 571412, 278, -199751, -62476, -809811, 245434, -114388, 449837, -214552, -409142, 987575, 636951, -529293, -314955, -37936, -264144, -426133};
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
    public void testSortingTechniques116(){
        Integer[] array = {-622503, 343005, -484735, -640128, -562792, -937514, 495245, -266579, -133212, 443441, 791488, -684904, -104864, 676830, -951631, -704890, -981812, -300838, -930855, 185459, -186201, 146575, 205687, -470624, -126450, 493426, -763860, -828797, 129142, -336525, -593006, -545095, -282034, 48823, -645110, 513313, 109535, -213178, 415562, -607367, 938279, -979996, -694753, 364784, -803133, 141072, 438031, 427553, 778004, -497346, 948960, -447277, 937423, -288609, 252106, 769777, -900045, -623618, -297147, -813887, 410010, -601047, 138943, 383996, -731523, 367806, -377010, 566916, 279634, -426835, -840005, -451388, -979673, 96313, -611122, 818451, 900139, -934322, -291224, 665784, -120970, 142203, 778764, 579928, -224342, -515057, -88225, -91923, 459166, 229349, 162242, 814072, 928417, -522620, -891086, -64876, -166808, 20484, 23471, 355878};
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
    public void testSortingTechniques117(){
        Integer[] array = {170310, 231122, 719798, 399251, 435733, 687971, 184134, -612101, 570922, 172017, 596171, -607289, -344097, -114156, 157569, -130381, 610359, 44037, -814468, 820885, -340251, -284915, -749194, -32259, -906375, -885058, 405593, 205658, -405618, -937210, 217953, 69844, -656079, 453846, 513122, 964193, 893025, -774954, -354878, -25620, -307173, 159889, 432267, 59875, -988581, -452235, 262523, 80901, -987937, -373735, 805036, 633961, -825087, 433106, -237156, -819258, 95759, -146622, 438197, -521511, -939992, 656233, 17953, -322445, 440701, 905974, 172901, 280504, -193999, 445452, 169622, -570401, 2750, -357454, -939969, -569834, -520187, -116181, 218598, 426091, 236971, 654592, 804022, -401216, -946422, -431850, 654976, 399859, 230804, -539077, -430477, -669439, 538386, -432842, -202119, 154116, 831882, -55326, 798966, 758225};
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
    public void testSortingTechniques118(){
        Integer[] array = {836686, 141583, 592655, -824981, 16897, 388438, -908227, 262790, -508446, -191503, -304320, 465588, -229605, 596651, 496067, 490942, -206483, 820753, -286465, -843119, 688860, 36233, 342317, 719433, -341902, -117761, 929406, 663577, -46221, -430360, 537628, 183491, -424528, 345286, 945781, 745459, -146644, -470337, -664691, 59080, 71178, -944720, -899370, -750519, -592232, -343325, -934688, 411144, -339003, 963451, 509360, 464684, -941710, -130126, -134373, -248286, -23875, 287639, 66509, -713728, -854781, 767499, -744365, -477980, -939996, -211944, 707335, -582058, -139662, -67793, 845327, 966875, -55760, 36693, 799618, 214791, 117632, 192455, -951003, -848295, -291024, -667387, -864046, -84186, -344325, 36424, 328591, -886726, 82209, 14871, -918961, -13654, -803065, 276898, 410711, 557041, -15105, -145370, 623732, 769846};
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
    public void testSortingTechniques119(){
        Integer[] array = {-586428, -7957, -442737, -495958, -862619, 591630, -560330, 770234, 733244, 16571, 39986, -847968, 228699, 647276, -481399, -695689, -776955, -261242, 755801, -744422, -341599, 858517, -381279, 518288, -836670, 823053, -127315, 203591, -144109, 256793, 567939, 843178, 97638, -704556, 197621, -556448, -910673, 295720, -538140, -906777, -642377, 600094, 139193, -131275, -741073, 92392, -481191, -990677, 326375, 307239, -153262, 746783, 240192, 577733, 638860, 868796, 291755, 76513, -623868, 901652, -926504, 512717, 961457, 62936, -811381, 400655, -855728, -758478, -711540, -88862, 714538, 732095, -696211, -947398, 937630, 285528, 146887, 35017, 900175, -436438, -721511, -162856, -104358, 764109, -443876, 368518, -399215, 526094, 123102, 130283, 605277, 293310, -75804, -876371, 568777, -989748, 979822, 245913, -316841, 87194};
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
    public void testSortingTechniques120(){
        Integer[] array = {-910229, -147425, 699415, 995444, -145567, -824660, -934145, 722963, 345301, -140913, -961234, -815687, 7548, -265109, -776645, 955868, -437657, -749869, -244584, 312867, -545286, -961961, -203725, 46548, 423413, 593476, 679380, -456841, -231958, -333948, 294737, 594710, 795083, 725899, 92250, 525465, 651998, -35162, -758009, 201795, -745020, -190313, 226243, 827163, 940043, -935621, -326012, -438085, 971720, -574120, -49895, 319576, 761312, -106611, -783218, 611460, -504894, 781433, -752071, -411251, 538693, -189374, 674714, -519373, -740212, 342592, 515882, -899160, 496900, -453122, -901178, -615573, -958414, 467557, -47690, 731083, -410379, -509203, 783333, -976635, 146394, -16284, 379373, -692951, 208520, -784886, -622931, -393603, 350058, 377943, -606239, -824566, 953633, 929162, -159779, -641586, -653328, 904500, -146319, -293852};
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
    public void testSortingTechniques121(){
        Integer[] array = {45143, 634772, -891655, -164450, 781148, 201121, -569314, 270518, 399138, -490492, 728116, -445684, -268723, -997586, -73841, -740280, 931615, -58265, -554107, 772803, -656376, -571545, -735453, 491405, 834995, -425226, -57520, 773222, -444209, 90055, 751046, -936298, 911047, -992615, 511323, 706723, 103325, 123662, -882204, 62123, -959198, -533080, 689078, 558782, 2757, 886498, -9565, 776081, -635520, 896897, 96570, -497390, 482309, -348280, 634423, 585733, -91243, 150664, 35429, 329686, -132850, -606976, 273012, -461738, 862644, -274627, -868007, 238113, -718512, -601546, -536112, 817563, 691436, 673825, 522477, 262690, -291634, -437524, 410886, -715761, -107401, -948570, -525104, 549993, -549286, 820134, -923607, 554028, -208212, -26946, 158364, 980315, 420345, 547123, -535531, 901032, -663221, -874799, -666237, -439801};
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
    public void testSortingTechniques122(){
        Integer[] array = {755456, -370052, 907392, 952748, 30073, 655862, -757279, -407673, -995732, -3924, -420692, -268736, 483095, -290070, -678193, -43892, -800284, 653229, 603758, -238879, 750865, -356623, 796214, -868564, 922484, -487149, 597424, 396059, 724012, -564274, -268639, -729521, 939357, 645227, -127598, 156677, -872071, -194628, -185949, 160651, 719427, 885287, 484218, -20741, -549925, -721757, 645522, 827007, 140476, -612219, 977491, -17094, 510488, -87093, 62610, -512525, 474182, 581519, 256587, -351988, -842431, -115598, -900571, -899284, 276824, -375828, -542720, 837963, -781549, 167391, 347076, -596240, -895425, -196358, 70744, 253351, -976790, 656800, -891254, -365459, 661018, -797803, -176556, 638135, -841087, -447219, 96405, 902064, -875112, -607774, 3185, 913782, -632179, 126931, -900098, 41377, -812324, -280875, 156355, 782350};
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
    public void testSortingTechniques123(){
        Integer[] array = {711396, 731074, 476477, 79003, 346132, -170551, -726645, -229952, -178292, -435271, 248160, 415396, 598728, -729520, 376896, 182289, 766702, 236375, -320401, -197835, 981557, -391064, -996777, -661698, 377864, -887594, 179896, -256483, -18367, 62543, -111313, 936033, 435116, 305921, 560770, 8075, -444123, 983727, -515165, 515756, 293437, -534847, 147979, -406534, -788543, 106174, 58747, 785133, -828480, -763292, -751232, -912026, -294668, 18081, -384936, 667213, -399954, 582703, 250982, 390817, 781808, 246194, 510461, 812881, 431240, 352445, 559379, -772279, -340736, 990384, 636067, -753542, 518002, 753267, -11414, 18285, 32193, -209785, -811584, 549158, -72850, -239949, -973112, -880241, -737732, 142474, 160429, 581093, -866995, 674400, -475847, 143030, 19173, 922275, -906818, -884366, -622090, -83015, 90112, 902204};
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
    public void testSortingTechniques124(){
        Integer[] array = {771624, -365921, 744664, -129431, 878894, 392842, -7268, 384020, 99264, -407814, 888387, 174235, 74880, -736753, -321240, -752656, 586049, -810515, 777800, 512670, 386825, -279903, 155360, 992411, -441631, -339216, -603541, -165258, 809644, -946350, 207322, -854348, 959284, 2637, 521805, -777002, -44523, 112139, -343967, 574085, -470793, -308410, 960652, 114079, 560711, -945197, 473847, 918178, -637253, 967287, 755793, -228333, -958736, -796607, -978018, 114977, -205153, -757735, 835998, -827026, -583764, -18430, 118297, 597078, 160232, 507112, 868756, -291790, 938622, 202879, -285805, 535589, -394267, 10189, 75628, 762070, 633153, -207666, -506671, -321273, -809292, -140214, 188015, 282264, -130757, -389016, 810462, 600388, -290654, 472772, 910111, -734846, -877796, -43246, -145519, 79986, -207784, -948852, 275771, 923528};
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
    public void testSortingTechniques125(){
        Integer[] array = {779846, -400877, 4233, -452230, -877113, -769754, 540430, 29923, -675320, 788366, -893477, -694684, 627409, 32830, -994718, -288162, -327254, 188675, 207918, -354930, 126262, 305057, -820019, 908031, -523090, -974166, 713907, -819525, 85937, 573753, -854195, -798898, -45718, -183763, -457785, -316280, 42030, -58328, -646873, -59077, 564171, -615527, 350185, 331160, -404934, 138296, 576452, -593672, -768197, -120140, 120299, -431909, 937682, -554519, -460782, -72891, -548575, -972689, 548405, -729719, -245655, 248150, 355827, -118980, 109942, -297239, -219615, 491947, -214686, 535564, 172676, 968362, -225020, -56366, -559215, 669733, 703907, -456441, -183338, 508667, 422688, 898774, 31999, 232846, 315454, -220319, 789241, -886517, -367745, 321204, -318069, 869569, 449709, 770765, 839341, 240522, -942594, -425151, 40030, 753104};
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
    public void testSortingTechniques126(){
        Integer[] array = {832496, 646782, 129012, 6551, 665937, -913291, -348410, 573685, -238450, -231208, -923014, -568369, 252125, -382499, -383212, 476695, 509180, -864028, 295853, 810539, 899209, 183763, 667841, 93632, 531777, 49479, 9147, -3228, -333065, 944741, -532879, 437615, -905553, 75801, -58396, -865640, -372416, -854429, 38931, 807529, 284009, -50930, 398835, -456858, -716363, 802004, 814334, 482668, -354141, 342060, -171811, 333658, 292881, 408829, -861254, -611486, -868013, 512633, 968318, 201229, 908030, 201981, -142341, 224755, 837606, -426458, 156869, -351484, 10380, -426389, -615940, 172391, 315304, -972868, -241037, -964827, 963106, -750885, -895574, 175093, -441659, -643361, 396453, 847206, 519190, 597709, -853462, 339401, -24507, -648861, 773100, -217351, 1678, 762785, -386141, -352029, 767311, 986427, 705614, 324682};
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
    public void testSortingTechniques127(){
        Integer[] array = {-986259, 321376, 854689, -757390, -451625, 452016, -73074, 828789, 874981, 277564, 763249, -599752, 906035, 386422, -128010, -510194, -341478, -986842, -39334, 994415, -412689, 233487, 295723, -607222, -600877, -874263, 152975, -834117, -580919, 76222, -447973, -955473, -833956, 587243, 671477, -601089, -126804, -893059, 104515, -124844, -835860, 935111, -254658, -568660, 405886, -336807, 308813, 995468, 395482, -491181, 409929, 717830, 948213, -536589, -157441, -21330, -803653, 678286, 955521, 506919, 458775, -451264, -903499, -996083, 883199, -128474, 321160, 299870, 738158, 711197, 566992, 218160, -366981, 556611, 762224, 507470, 942019, 583553, -341369, -243821, 226706, 572101, 483704, 859140, 693563, 505981, -390997, -396830, 536549, 103438, -164310, -766623, 816704, -561440, -945020, -738845, -198315, -906453, -140100, 425090};
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
    public void testSortingTechniques128(){
        Integer[] array = {-558492, -875539, 745469, -962045, 506138, 218746, 653494, -308195, -705649, -451643, 389867, 149483, -379616, -525725, -773150, -314174, 74368, 684246, -730389, 21990, 933560, -127435, -240714, 911538, -113992, -735228, 642162, 239942, 947710, 595206, -853837, 907462, 818984, -612324, -646964, -789065, -990320, 297007, -887502, 617607, 660780, 710733, 331098, 978800, 42618, 179189, 398066, 833095, -132329, -475088, 443110, -218440, -92487, 910247, 810614, -391703, -223958, -5945, 75313, 350619, -386343, -855002, 550978, 534293, -519996, 91480, -409859, -841306, 579228, 104021, -286603, 422643, 861493, -64644, -8286, -719536, -719681, 667262, -711613, 781321, 715079, -533861, 974976, -678616, 853340, 68781, 460859, -826504, 777705, 498622, 721291, 75414, 849712, -552897, 53752, 824962, -944264, 972018, -290463, -755485};
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
    public void testSortingTechniques129(){
        Integer[] array = {340993, 326654, 222507, 527395, -367893, -881956, 477138, -56968, 756731, 207218, 887729, 280944, -593701, 917155, 366060, 917675, -144688, 589649, 838534, 635914, 118537, -200493, -193826, 756357, -430465, 894265, 537522, 220012, 442070, -773784, 623384, -682026, 456578, 234050, 987088, -912138, 996336, -649792, 874886, 160840, -91238, 778664, 802040, -41191, 934404, -801421, -69359, -224196, 944847, 361092, -427370, -391389, -856978, -21670, 601145, -380054, -714640, -860321, 745978, 750848, -592516, 559300, 626520, 785119, 509860, 640052, -136256, -535891, 483279, 546285, -942530, -85911, -773982, -691012, -933590, -893490, -371156, 145270, -35417, 891691, -643459, 94357, -278432, 70940, -457855, 453283, -694967, -261196, 283034, -505786, -55875, 253433, 718762, -353002, 447930, -515971, 7929, -535409, 843218, -488424};
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
    public void testSortingTechniques130(){
        Integer[] array = {541398, -963458, 143335, -465444, -893037, -830338, -950935, 870771, 175270, -166395, 958397, -266075, 163520, 205638, -796601, 294354, -164768, -24646, -796568, -446097, -356896, 556532, 563495, -612165, -841908, -960325, -614382, -923198, -962378, -502468, -637207, 417374, -813873, 569380, -978538, -375179, 171083, 769760, 259955, -429692, -680494, -122548, -395060, 423988, 553998, -230237, -599768, 145792, -532827, 104118, 243284, 548946, -310716, -53700, -452512, -40536, 619489, -488864, 22236, 239977, 219911, 865200, 778659, -506657, 243045, -793413, -146810, -799542, -790654, 507513, -316612, 461870, 358143, -379541, -69213, 943487, 15650, -478123, 321549, -843174, -729207, -108557, -488940, 95024, -931392, 414107, -906268, 870099, 445258, 421562, -274482, -66085, 988652, 501426, 74388, -439722, -378321, -605559, -586008, -515878};
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
    public void testSortingTechniques131(){
        Integer[] array = {-43108, -21532, -298921, -869056, 739338, -160217, -773913, -992733, 445058, 926941, -71112, 621881, 307370, 195739, -344837, 681100, 260001, 231347, 773445, 557172, -848087, 689127, 15614, -369905, 34468, 970937, -924567, 253781, -904597, 16981, -295258, 121302, -231404, -129838, 828728, -489314, -594975, -566562, 209340, 743787, -626983, 476080, -632665, -129055, 207950, -28796, 783485, -242214, -67269, 614022, -515487, -395953, 290284, -433575, -906926, -45893, -227350, -694458, -795003, -921467, -539366, -225093, -491696, -122751, 429554, 687064, -25716, -443078, -950851, 414713, 659038, -241689, 695163, 212656, 690962, 889148, -856555, -334117, -21148, 88964, -820660, -256202, -257618, -672178, 245754, 601265, 778009, -258707, 935299, 802378, -489036, -832379, 523807, -500708, -187652, -932005, 346296, 510651, -888316, 751527};
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
    public void testSortingTechniques132(){
        Integer[] array = {94195, 855401, -355313, 871638, -934325, -493038, -127957, 334857, 344840, 200073, 270111, -231574, 920936, -618056, -280088, -65839, -431775, -549151, -123515, 886422, 935976, 201416, -392340, 105840, 819467, 538595, -803037, -40549, 784173, 275156, 59330, -251024, 40304, 138227, -954575, 318049, -363044, 666302, 986536, 881275, -638159, -401848, -123856, -586335, 498391, 286111, 433359, 456268, -930526, -215263, 460111, 680937, 129260, -500193, -693648, 879117, -183977, 105593, -889296, -353125, -487532, 565240, -887898, -293086, -510088, 245091, -512200, -323528, 424775, 46258, 361959, 38711, -263784, -39412, -616556, -678402, -432151, -520641, -141730, 55769, -665907, 943815, -371473, 557465, 837074, -454601, -33522, 255759, 586089, -354313, -402469, -659388, 972484, 974635, 597498, -207326, 182621, -370569, -947476, 129002};
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
    public void testSortingTechniques133(){
        Integer[] array = {579292, -245615, 837851, -932428, 826800, -633392, -286399, -107514, -50776, -893388, -528148, -160705, 569618, -648304, -788830, -547216, -48044, 363277, 360537, 150085, -144127, 190879, 431168, -906596, 288704, 804227, -466476, 776318, 793977, -320726, 437620, -712616, -499827, 28133, -956912, 124227, 100852, 73557, 939288, -67839, 26081, 956278, 877910, 135215, -147730, -5572, 546240, 603436, -103186, 65412, 42026, 427288, 744092, -970336, 97401, -260758, -156474, 288945, 79815, 759051, 656224, 242355, -762567, -998393, -796815, 170650, 425961, -161859, 285609, 916221, -586955, 639725, 815807, -494742, 795621, 628406, -980241, 214269, 244619, 342072, -583158, -710884, -530569, 537087, -983733, 850236, -223553, 153019, 645539, 330377, -858558, 371402, 375441, -14456, -107918, 426082, -833840, -780819, -85214, 825797};
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
    public void testSortingTechniques134(){
        Integer[] array = {563372, -681889, 6383, -388608, 210301, -992003, -72853, 762595, 694196, -375950, -537945, -468118, 159778, -710630, 480954, -250735, -314271, 319934, 911941, 799529, -165685, -155780, 209985, 734138, -230583, 481097, 887996, -788186, -591520, 384626, 608744, -770188, 233605, 70078, 336038, -190432, -757363, 580058, 523882, -669544, -368184, -376731, 230780, 848784, 682913, -487657, 943958, 258472, -23545, -290436, 152583, -434965, 981466, -61324, -16521, -281278, -492994, -232883, -578410, -803539, -732932, -761906, -779560, 10097, -474713, 631916, 155037, 167990, -350306, 457848, -467051, -713260, -552485, -287520, 881664, 868481, 294164, 844567, -479717, -167837, 197162, -653081, -228521, 226209, 771464, -869372, 945419, 691507, -233656, -383019, 676251, -638579, 709287, 193825, -516213, -972263, 352319, 15849, 916701, 918583};
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
    public void testSortingTechniques135(){
        Integer[] array = {86481, -277124, -382016, -305119, 122002, -592429, 31790, 309833, -337224, -597342, 321123, 780826, -972830, 224761, 695788, 817388, 180729, 546259, 862243, -356540, 662195, -656667, 905069, -282682, -833818, 714054, -902417, 113505, -924372, -57061, 514437, -784341, 678499, 732983, 509455, -331503, -206963, -982437, 926010, 262302, -111375, -941854, 977081, 584804, 536449, -291925, 683135, 109485, -533236, -614302, -970228, -395378, -249745, 550405, 391625, 963820, 117844, -801861, 993282, -541097, -616934, -958113, 176103, -856461, -877232, 960986, 96453, -722843, 897816, 733748, -517668, 639577, -746875, 181809, 82577, 905652, -45942, 230040, -877886, -230540, -460438, -336280, -8007, 531043, 738641, 637127, 625032, -352034, 820063, 45058, 906871, 241886, 458214, 216129, -552175, -406388, 757072, 355634, 412216, 575558};
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
    public void testSortingTechniques136(){
        Integer[] array = {-52361, -885665, 293433, -682203, -402882, -120233, -65907, 41696, -616491, 136873, -503892, 767632, -161441, -133005, -615034, 285556, 468494, -635423, 896789, 921659, 28453, -734421, -220135, 65337, -414460, 837660, 709564, 590363, 992951, 475079, 665976, -537824, 685784, 823451, 281576, -898413, 250825, -636251, 60784, -961023, 748348, 631101, -615097, 444197, 648938, 220611, -104289, 957253, 582796, -636572, -342940, 198461, 913985, -769350, 218446, -687272, -124432, 955070, -151208, 419692, 259776, 749556, 89903, -683655, 783929, -56924, -125893, -394388, -629556, -414217, 939689, -461802, 706578, -211504, -367652, -971522, 24200, -475326, -357116, -738814, 766990, 955642, 563697, -188690, 672446, -951567, 2752, -906671, -604375, -132488, -466217, 187512, 152026, 191141, 301510, 351780, 897472, 46221, 472021, 936676};
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
    public void testSortingTechniques137(){
        Integer[] array = {446456, -179574, 843912, 165310, 731090, -970035, 294720, 30018, 872433, 69975, 629991, -641565, -10021, 502030, -623823, -311627, -232649, -355898, -764052, 225306, 204565, -674967, -340332, -159662, 173836, -83467, 432963, 662042, 250356, 696274, 260520, -702504, -762479, -175890, 291853, 241629, -173904, 802291, 726419, 173173, 298786, 367567, -957966, 396937, -930084, 74644, 814256, 895441, -466433, 442411, -63031, -392244, 207641, -79342, -147239, -334297, 206355, 867826, 216092, -153376, 794823, -127634, 326252, -873803, 876057, -958996, -806168, -586468, 54827, 262672, -834054, -302365, -887648, 68025, -85706, -306224, 773668, -532449, -173081, -939114, 301926, -640983, -241709, 862161, 639276, 197449, -69291, -439285, -906306, 178292, 347412, 772440, 39486, 389626, -388654, 662733, 519677, 71756, 794456, -220597};
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
    public void testSortingTechniques138(){
        Integer[] array = {788094, 786935, -526740, 890489, 798289, 203021, -710212, 510683, -596918, -254398, 593435, -208650, -643243, -571235, 593904, 495310, -383184, -350082, -266367, -271071, -963525, -436162, -433990, 772442, -430854, 272415, 856434, 77132, 516484, 498663, -998239, -623355, 304015, -675152, 647687, -56359, 405773, 11803, 179112, 361249, -605974, -59421, -332029, 269312, -972108, 529152, -32322, 381044, -684497, 834966, 371884, 758796, -950318, 271023, 735106, 790446, -854069, 705793, -74434, -687684, -283926, 73670, 453768, 636018, 84937, 159849, -605232, -674290, -244485, -556333, -453343, 644243, -561192, 660926, -933137, -698214, -173440, 830850, -459740, -231671, -617172, -711578, 324511, -197976, 271656, 755355, -262844, -935772, 616717, 538572, -708835, 75876, 723787, -150629, -136106, -143164, 903342, 322549, -200933, 449821};
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
    public void testSortingTechniques139(){
        Integer[] array = {-168090, 681416, 609609, -497260, 570214, -475536, 604094, -495336, -957476, 24554, 600896, 883430, -507122, 713319, -770658, 566390, -380582, 418160, 611005, 83206, -813002, -167604, -644051, 625047, 116688, -834422, -193304, -863304, 717882, -733339, 681832, -359142, 944726, -62096, -815944, 747919, -832605, 593560, -23580, -916789, -996926, 548782, -928537, 585329, -679403, -88117, 735364, 779555, 591468, 988254, 399769, -964690, -704094, 217242, -488647, -982249, -377112, 944230, 116804, -382518, -135433, -416667, 391085, 612175, -326084, 70663, 221598, -350698, -808098, -923406, -810197, 412312, 851672, 98004, 900957, -303942, 455298, 642580, -813652, -91662, -189677, -732669, 291381, -276381, 848213, -476914, 858531, 403776, 634019, -813153, -992552, 982819, 135774, 963057, 261104, -988824, 321246, 209285, -107020, 161950};
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
    public void testSortingTechniques140(){
        Integer[] array = {801419, 683745, 431503, -384314, -805772, 517798, -311002, -90647, -838504, -512988, 817466, -574215, -525015, -76992, -835324, -112337, -314528, 704057, 325337, -791834, -80045, 860013, -459797, 97959, -482663, -428451, 590173, -384230, -194379, 885910, -613973, 743493, -458847, 28506, 177023, -464277, 110427, -616479, -63910, -121874, -28684, 632456, 287380, -384257, 894935, 136581, 299998, 191629, -803486, -80359, 388210, -947788, 628367, 590391, 123557, 254041, 675353, -659647, 661581, 340432, -239127, 663078, 58442, 120394, -751040, -896305, 526815, 339184, -77976, -905365, -140353, -914157, 232194, 70334, 989040, 885497, 2315, 710885, -313983, 742409, -892399, 97036, 379975, 387968, 636597, 550919, 868387, 233139, -966366, -910329, 312149, -166796, -657891, 345106, -43435, -692989, 622950, -5289, -182318, -633952};
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
    public void testSortingTechniques141(){
        Integer[] array = {-525979, 393384, 999294, 448208, 166480, 917059, 295855, 962235, -651589, 768108, 147959, 845707, 756972, 410546, -387472, -373268, -923836, 365730, -332166, -830150, -910451, -369828, 77860, -930564, 175894, 36329, 739331, -591177, -94902, -809475, -579767, 60429, -759145, 588857, -847106, -931630, -114471, 369888, 237525, 412652, 759018, -738443, -521662, -699300, -738399, 275640, 168605, 492634, 762160, -562229, -548416, -494451, -91794, -62142, -859767, 186173, 172071, -886047, -370584, -905644, -498066, 971941, -815374, 794777, 656947, 734883, -427434, -277134, 493190, 159675, 668380, 975427, -901738, -367328, -624178, -538102, -922724, 224968, 599020, -565894, 577588, -758690, -382146, -707550, 898327, 421978, -655271, -722701, -996911, -305334, 863283, 977150, -715361, -888676, 128884, -718288, -34308, 278470, -470368, 330457};
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
    public void testSortingTechniques142(){
        Integer[] array = {104415, -674405, 893122, -808469, -411459, -685514, 23508, -541814, 342383, -974699, -754253, -572971, -413829, -721988, 908300, -369981, -375222, 896418, 509975, -206832, -200082, 638021, -220210, -79488, 543586, 908553, 583943, 851319, 766762, -687507, 946031, -17560, 808772, 17406, -357752, -389678, -769412, -719129, 772357, 427749, 262288, -766463, -60331, 884097, -827884, -725544, -289699, -105383, -762499, -399370, 679321, -698688, 362823, 80797, 280209, -290463, -224766, -150234, -584463, 981477, -264447, 108223, -906709, -320590, -806361, 441303, -279761, -786572, 921217, 44966, -868391, -167751, -70161, -118000, 703303, -305721, 56101, -625273, 791315, 401500, -882403, -870648, -834799, 46384, -136647, 442682, 70050, 435800, -267305, 153607, 749917, 790568, -949398, 649653, -254809, 520571, -776490, 872497, -440642, -441613};
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
    public void testSortingTechniques143(){
        Integer[] array = {683223, -232417, 498094, 802475, -479658, 485813, -151594, -907994, -93857, 566343, -26621, -982483, 237094, -830524, 559091, -879493, -29783, 73172, 555666, -396442, 48111, 323054, 961999, -940851, -69278, 321527, -834413, 153004, -335303, -714207, 681365, 876550, 209241, -59227, 56757, -583911, 93859, 254122, 754356, -599495, 519850, 374518, 723382, -850640, 635827, 454140, 876091, 357797, 116561, -457394, -54007, 276211, -534569, -228253, -207086, 810575, -977692, -842771, -964580, -273421, -262486, -223000, 581078, -186121, 874300, 273811, -100740, -69239, 740948, -561798, 236668, 459600, 593346, -301050, 541889, 500853, 816076, -903865, 352773, -190053, 288906, 915065, -991261, -368651, 255576, 707269, -855166, -814679, 659385, -204014, -626870, 830046, -736514, 108748, 79921, 580993, -542391, 635508, -234061, 357943};
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
    public void testSortingTechniques144(){
        Integer[] array = {-887045, -886615, -482706, -395245, -675944, -82604, 621676, -15869, -224517, 931436, -899146, 682036, -100452, 853885, 249771, 661916, -204585, 859045, -150413, 258215, -94973, -552572, -627268, -721883, -150444, -787386, 729911, 215521, -400139, -411852, 313702, 822294, -461995, -210981, 779126, 384484, -885709, -445268, -627441, 319815, 315506, -769858, 345257, -127118, -344927, -753978, -621245, -483551, -896066, -224815, 799199, -715579, -712773, -548531, 913895, -500295, 576808, -54263, -271115, -912225, -817048, 311617, 436156, 833473, 655965, -50860, 473409, 47649, 270699, 919294, -23966, -897781, 378645, 618554, -494099, -863291, -290584, 771994, 36062, 773926, 407450, -249752, 383849, 228620, 297378, 85775, 532634, -181259, -961077, -625858, 388285, 490968, 798243, 290203, 614843, -281044, 262191, -96079, 969828, 489634};
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
    public void testSortingTechniques145(){
        Integer[] array = {437786, 87279, -473241, 576788, -150107, 745310, 806727, 126887, -140990, -112225, 952609, 782804, -697598, -559740, 156044, 14981, -162893, 442100, -124952, 738686, -368815, -171461, 302560, 600916, -119546, 47328, 697133, -40197, 797053, 98490, 81491, -417774, -872041, 869184, 339629, 631043, 659000, 803531, 136124, -623393, 368595, -520691, 550379, -174934, -242876, 266079, 727319, -611925, 780753, 897220, -259955, -154081, 103567, -51147, 18090, 399728, 783445, -336332, 523258, 375003, -60504, -296312, 216220, 434651, 407580, -955486, 995749, 4442, 42421, 34519, -361143, 574522, -747821, 110644, -538732, 8833, 582288, -978368, -616042, 442186, -485671, -870462, -653027, 895564, -223752, 850012, 826867, -986598, 898830, 950743, -953111, 117799, 267628, -239390, -493005, 592944, -459050, -639743, 708904, -486232};
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
    public void testSortingTechniques146(){
        Integer[] array = {553913, 783555, -543312, -737185, -441157, 500989, 758455, 903847, 766956, 535583, -433346, 355606, 684649, 320180, 99652, -62244, -457211, -291346, 355262, 513893, -221064, -174070, 543039, 120155, -940096, -263146, 594029, 128123, -315186, -150083, 7556, 345339, 618842, 916453, 289781, -539773, -866165, 802183, -268164, -122212, 804762, 911148, 287757, -320429, 874388, -789722, -353867, 486370, -441136, -946151, 453526, 762308, -17548, -905701, -395695, 450140, -191913, -396283, -187452, -835656, -938260, -285826, -566240, -647183, 991444, -808417, -591382, -201183, 166407, 575393, -806005, -782701, 791466, -88056, 589353, 348671, -992611, -623907, -363432, 403540, -549619, -333325, -165812, -377377, -266611, -52022, -412137, 346993, 435271, -755665, -201036, 195334, -885469, -81191, 832844, -215195, 921722, 982066, 973129, -547386};
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
    public void testSortingTechniques147(){
        Integer[] array = {444473, 822734, 427544, 957080, 692465, 682875, 507884, -272340, -232847, -482279, 371105, 140930, 3737, 409743, 653910, 962988, -96115, -576624, 120423, 87463, -847100, 428579, -315554, 632831, 193689, 744160, 919552, -930372, -70752, -956090, -340077, 715996, 54624, 112699, -802711, -456026, -706426, 746372, 120227, -216751, -533278, -285704, -521794, -698234, 958838, 860827, 733521, -26166, -747154, -588197, 340975, -932344, 864808, 907957, 723820, 530785, 975936, -724740, -3473, -412261, 879386, -275405, 615169, 866326, -350393, -359898, 141754, 929503, 930670, -808264, 836325, 955372, 109668, -788386, 488168, -511991, -113538, 890745, 7048, 125082, -719193, -577611, -774238, -597132, 222523, 215636, -54059, 738549, -396085, 635596, 543401, 510535, 120165, -219964, 967125, 740395, 213071, 323850, -862978, 402168};
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
    public void testSortingTechniques148(){
        Integer[] array = {4461, 969577, 594035, -475617, 254298, 825850, 639309, -735601, -60654, 354164, -929267, -733100, -334810, 9613, -862416, -755608, -981637, 843159, -894658, -654137, -207097, 459683, 832821, -226611, 904094, -193382, 877036, -266630, -850425, -399188, 813147, -563, 431263, 981519, 619082, 376364, 659083, -100071, -891888, -94579, 449953, 706695, 324223, -719845, -562081, 773846, -585279, -620401, 604771, 231832, -460652, 305797, -560800, 865615, 197595, -105508, -60460, -879718, 875983, 316962, -823914, 588393, -428429, 59649, 94971, -702462, 199178, -33671, -468663, -75644, 924457, 364303, -474889, 22393, 92623, -45312, -839666, 544420, -323107, 174608, -179469, 956029, 180808, 730473, 887622, -911350, -442839, -691604, 684441, -971691, 603372, -702569, -400091, -411987, 178037, -636722, 16642, -691112, 105906, 749552};
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
    public void testSortingTechniques149(){
        Integer[] array = {472957, 122727, -638901, 986893, -161822, -839466, 388504, -838480, -196124, -960961, 497214, -727685, 149886, 597977, 232058, 148696, -738127, -870232, 183458, 853790, 765780, -927661, 409458, -253499, 194150, -266989, -812509, 740611, 512361, -588688, -502791, -857937, 676782, -936921, 238773, 672790, 343946, 111672, 832698, -885508, -511272, -583806, 191345, -513815, 42549, 19838, 616187, -329292, -531496, 461997, 624846, -730898, 122483, 20467, 478322, 414031, 846875, 534098, 455590, 863240, -335188, 605173, -758388, 282119, 545665, -930958, -33526, -316722, 724740, 421084, 131902, 873015, 640673, -712845, -44771, -192821, 4424, -807728, -758736, 512002, -640248, 243910, 42158, -825565, -721605, 516759, 56102, 547902, -867600, -544224, 641675, 417496, -923149, 961353, -581466, 122765, 502329, 308610, -33936, -469916};
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
    public void testSortingTechniques150(){
        Integer[] array = {922040, 642116, 96330, 953714, -190841, -273825, 759468, -323657, 636062, -734137, 595346, -881920, -108739, -489823, -393238, -702217, -45651, 372143, -324239, -46547, -480331, 245365, -709124, -142155, 536481, 59902, 465740, 792790, 876870, -13894, -937080, 684666, -708137, 730159, 660306, -456794, 562160, -425372, 813800, -40842, -922893, -310160, -207408, 402271, 828529, 115606, -196997, -600148, 593653, 427471, 182047, -321554, 677766, -600732, 163984, 34150, 254070, 254768, -270511, 986499, -399189, -594711, -605774, -170403, -119284, 493859, -25532, 129797, -449077, -880417, 341949, 632126, -627271, 991771, -861521, 782678, 513479, -660365, -500632, 485411, 718758, 193496, -438689, 194155, -504409, 986449, -471106, 645092, -855973, -649517, 106987, -970687, -432557, 544100, 457373, -949332, 59571, 171281, -846013, 521086};
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
    public void testSortingTechniques151(){
        Integer[] array = {175724, -292689, -386953, -35943, -73877, -178787, -953473, -635117, 252927, -515816, -540568, -614811, 83150, -726290, -597547, 901365, -658839, -772282, -860734, -731021, 465099, -774391, 420965, -547777, -144244, -656859, 626471, -554890, -437884, 763124, 58294, -734533, -202131, -935890, -184592, -613550, 824048, 127172, 280054, -541918, 931521, -655099, 950440, -620542, 734018, 744977, -388015, -634580, -401724, -892281, -143056, 611746, -33041, -742054, 833616, -661040, -613349, 140441, 105148, 943127, 665685, 671783, -9509, 531683, -313232, -630902, 292612, 432916, 642159, 739122, 303298, -507700, 978116, 574936, 578799, 41238, 989312, -465105, -159533, -571818, -194910, -910603, -135234, -573779, 669118, -29020, 982576, 142526, 950340, -309214, -36238, -59486, 720976, -152865, 642353, 841774, 897955, -500171, 263855, 858454};
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
    public void testSortingTechniques152(){
        Integer[] array = {-69657, 227615, 579057, -666996, -815519, 557410, -612720, 510856, -181286, -740349, -672798, 226381, 220765, 862912, 465589, -138464, 873268, 567837, -779597, 956986, 256478, -350835, 549310, -142964, 709032, -659546, 26193, 642544, 976827, 126354, 824493, -492224, 461339, -55471, 952068, -182550, -774698, 426242, 910004, 527453, -551318, 868027, 764190, 357633, 487064, -871869, -959271, 887482, 353520, -861470, 186736, 852947, -94177, 150853, 361022, -114268, 628963, -830820, 387543, -667375, -156167, -662055, -167261, 923803, 124824, 896898, 950530, -314812, -662608, 7248, 985245, 124508, -874272, 938599, 918055, 919173, 803668, 577640, 466167, -78611, -312532, -145192, 45045, -32443, -148497, 118970, 452388, -888829, -485383, 809187, -739358, 675131, -239832, -478789, -934273, -43037, 617985, -236343, 266934, 383295};
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
    public void testSortingTechniques153(){
        Integer[] array = {-703378, -806958, -340991, 894930, 148006, -596971, 279539, 806104, -663064, 675293, -757427, 5240, -91438, -779008, -658462, 771235, 139357, 841425, -643499, -886951, -135566, 784829, -835036, 148708, -782302, 838450, 814821, 159619, 337804, 762542, 726913, 674104, -45341, 539885, 375896, 824762, -932964, 12877, 29684, 673771, -338154, 609419, -242392, -236708, 410483, 619319, 263961, -2982, 736195, 258034, -521965, 646871, -509288, -468632, 539008, 417914, -607247, -539184, 592957, 927351, 780634, -196745, 718682, 191853, 446864, 508386, -181115, 258446, -576930, -683659, -770903, 583282, 459397, 946749, 783767, -847277, 834701, -418791, -619748, -35700, 146903, -255956, -214239, 393213, -441748, 385674, -962835, 990007, 182855, 898170, -70571, 847247, -28832, 53604, -27354, -592207, 791651, -605957, 930863, 685193};
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
    public void testSortingTechniques154(){
        Integer[] array = {730065, 773696, 521134, 398642, 202088, -754639, -624560, -158474, -777574, 465558, 246845, 574439, 101021, 514580, 668230, -40705, 841300, 47720, 491653, 821511, 517388, -122717, 984125, -644943, -382124, -26967, -934655, -809155, 319878, -705699, -839607, 590948, -14791, 598339, -321795, -956576, 456262, 421378, -658981, 427389, 8588, -892462, 458285, 231867, -145729, 2718, -114495, -867469, -334165, -526111, -572612, 825499, -884977, 860516, 232252, 517617, 686139, -243506, -188901, 163920, 584087, -983163, 830289, 313996, 128851, 354822, 850122, -311410, -88392, 403228, -681109, 348857, 674028, -831678, -178244, 684010, 881849, -450240, 666503, -494779, -731280, -735624, 923180, -58827, -449744, -888687, 706882, -300408, -951726, 471975, -838105, -322120, -785231, 406518, -229069, -475977, 939057, -453267, 632627, -606597};
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
    public void testSortingTechniques155(){
        Integer[] array = {-250697, -766644, -220091, -261037, 695417, -240934, 513602, 192620, -795376, -977091, -445817, -929968, 205006, -590712, 210178, -778680, 198271, 913348, 971482, 61039, -351833, -441599, -876639, 248933, -107051, -69307, -672434, -673780, -201797, 885389, -88864, 688190, -657757, 298337, 378270, -633305, 189063, -428304, -99111, -715841, -160676, -371736, 728465, -321203, 955623, -566190, 71179, 599918, -104100, 551050, 122428, 847701, -853813, -531868, 35990, -839337, 507441, -745717, -436707, 667967, 449555, -57805, -74278, 296830, -148176, -117563, 939272, -391754, 168825, 679010, 392050, -564278, -53507, -1107, -786365, 480028, -268724, 298602, -736142, -53715, 108830, 159783, -343373, 675948, 226137, -355514, -580447, 114219, -866529, -442629, 651034, 383536, -834048, -875177, 73361, 365809, -374372, 141887, -54036, 213992};
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
    public void testSortingTechniques156(){
        Integer[] array = {-251658, 673155, -389661, -462654, -464086, 402216, -291390, 634248, 220468, -307457, -955422, -868894, 638660, -669267, -806244, -749878, -941744, -455623, -737827, 515354, -983511, -626001, 28935, -145534, -286280, -831896, -702426, -694858, -91913, -302764, -481551, 590528, 483788, 643710, 903765, -78471, 67974, -509368, -42731, -974047, -292840, -713708, -602154, -126617, 369898, -672476, -612190, 483679, -21955, 793391, 742850, 857113, 489487, -970010, 892769, -451947, -234182, -751727, -965334, -896088, -473001, 780134, -923503, -176869, 192519, 992348, -657299, 49802, 163960, 261394, 695900, 667864, 726186, -566070, 315814, -926735, -354361, -479872, -407685, -17953, 72121, -863034, -835861, 561926, -564059, -713657, -704148, -576667, 453486, 752631, 765747, 196638, -206588, 948742, 363404, -982060, -477522, 179529, -67516, -473480};
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
    public void testSortingTechniques157(){
        Integer[] array = {630642, -766053, -978816, 786659, 336374, 888282, -464326, 962820, -34871, -530301, 795798, 451514, -755569, 829887, 770179, 695157, -91498, 54589, -554993, -942093, -608056, -255260, 755431, 834681, 580381, -895356, -560417, 436512, 500330, -451566, 365482, -722226, 395335, 795725, 4195, 409794, -664800, 209439, 600272, 988472, -184445, -922603, 470265, -258504, 810499, 518726, 807398, -295036, -112661, -815456, -859636, -969855, -636768, -898680, 549515, 171920, 676622, -398657, -247391, -31981, 311571, -756993, 235959, -728323, -696673, -84818, 43856, 607511, -750564, 972013, -76249, -688735, 973208, 606767, 877390, 26794, -175508, -945700, 927710, 74408, -648358, -397714, 383571, -115150, -46901, 764119, 591142, 27774, -589700, -284214, 997574, -834660, -584152, 454749, -85831, 733689, -310243, 109823, 954980, 872098};
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
    public void testSortingTechniques158(){
        Integer[] array = {-6796, 929989, 871658, 660871, 91918, 640813, -388790, 965791, -630332, -129666, 155693, -638425, -13045, -943374, -181401, -197750, -563760, 209553, -827853, -361674, -854706, 221067, 404848, -420835, 833358, -146015, -512872, -7125, 992389, 445053, -651065, 891278, 851249, 990711, -625981, 379317, -52771, 246058, -405481, -164533, 152317, -441651, 294701, 979713, -795225, -908019, 221885, -373024, -813451, -844550, 972441, 372626, 415561, 968634, 159745, -78443, 465535, -174372, -775429, 621751, -518284, 330953, 13174, 384325, -49053, -453799, -560115, 294112, -883073, -205986, -180093, 831422, -444594, -470712, 307453, 115260, 646418, 162369, -820067, 824504, 799164, -287607, -731053, 968968, 85140, -578738, 485111, -743581, 994771, -24332, -905162, 865329, 566992, 795090, 569468, 189835, 864393, 302364, 609901, 553343};
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
    public void testSortingTechniques159(){
        Integer[] array = {777802, 983423, -23058, -514504, -854706, -685398, -230415, 917701, -61654, -605799, -27054, 931589, -708785, -905020, 464820, -25599, -365147, -791867, -966237, 905355, -928667, -938463, 619452, 13734, -59139, 844051, 331518, 272560, 184015, 844785, -735563, -699176, -227224, 605031, -839962, 563171, 197832, 692029, -870885, -823749, -627445, 374247, 902219, 549808, -809126, 346159, 364593, 928274, -273266, 693119, 995226, 685564, -646617, 311736, 963048, 671604, 337415, -83095, 749283, -712351, 993326, -531815, 58465, 561696, -611799, 786566, -470803, 451903, 558465, -954194, -842991, -347856, -827800, -535047, -640995, 562419, 529644, -242550, 877050, 441226, 268271, 925999, 249381, -343509, 724826, 76019, 362129, -660579, 72975, 980068, 283625, 480867, -940642, 562967, -830170, -889072, 861211, -310851, -916326, -426228};
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
    public void testSortingTechniques160(){
        Integer[] array = {571729, 790525, 430381, 680484, -436253, 849153, -50834, 960423, -641100, 908062, 589006, 16192, -416159, -650668, 641392, -519773, 420640, -321675, -871601, 742282, -588535, 575476, -689229, -491641, 815386, 896729, 437965, -928482, 458970, 609153, 467826, 18380, -805465, -261391, -839875, 170591, 438310, -598544, -178934, -864552, -952950, 207954, 671426, -792837, 875405, 246182, 923917, -445274, -890665, -728142, -116750, -911845, -78515, 622565, 327448, 468692, -11162, 782323, 697598, -949645, 484677, -341650, -275463, -590054, 463025, 597289, 860625, -213865, -835451, 971382, -638990, 642803, -210939, 798641, -965271, 796396, -257615, -285780, -339484, -241127, 943382, -41081, -561288, -564015, -557384, -950749, 590818, 148374, 636396, -92773, 205449, -780361, -22193, -43175, -817041, -534896, 23800, 732628, -368179, 440263};
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
    public void testSortingTechniques161(){
        Integer[] array = {-389670, -888958, -998093, -760948, -599295, -306651, 624370, 140640, 853178, -850877, 327487, -682574, -204084, 703995, 451431, 243914, -286147, -296126, -169665, 876292, -753647, -541221, 955561, 186016, 376660, 614799, -836988, -178271, 818156, 784238, 682911, 155696, -882097, 247196, -515462, 44640, -461542, 459550, 932006, 629425, -935769, -70408, -155324, 168515, 184590, -242608, -39322, -199710, 618623, -379743, -170355, -123220, 519117, 762135, -661413, 351667, 733771, 1899, -978210, -24285, -860819, 949748, -687641, 5244, 574435, 386263, 152494, -579302, 16044, 861903, -609492, 410627, 154023, -694187, 564537, -567120, -992689, 772967, -592964, 225332, -80604, 843647, -614826, -139070, -988414, -870764, 198273, -935700, -605718, 702144, -463242, -450222, 682702, 275492, -123728, 743506, -417643, 16099, 160623, -394966};
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
    public void testSortingTechniques162(){
        Integer[] array = {-330100, -892665, 600538, 391007, -358153, -714543, 578797, -839935, -786531, 617477, 192221, 196548, -772674, 826034, -646198, 568474, 805088, 186664, 658988, -170772, 38319, 545351, 483117, -552911, -616571, 801138, 206041, 568809, -796402, -64464, 778582, -120367, 942603, 925041, -607450, 487470, -777726, -249264, 984621, -870744, -515908, -84602, -159694, -940316, 626305, 136806, 926625, -251781, -770684, -204474, 504931, -859854, -369167, 157485, -182083, -601352, 7028, -279479, -895328, 296495, 947383, 143864, -930113, -467938, 261460, -52011, -554950, 163734, 331221, -463196, -846088, -592891, 104897, 609881, 622736, 446769, 425542, 73621, -977385, 205675, -125582, 693134, 131298, -322716, 616769, 538828, -241305, 872919, 79619, 692799, -643316, -958256, 353820, 410818, 365135, -144007, 765014, -587246, 467585, -674218};
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
    public void testSortingTechniques163(){
        Integer[] array = {994286, -314483, -95434, 735488, 376684, -665383, -445134, -171395, 810409, 453612, 547533, -539194, 818150, -405372, -410521, -100880, -288830, 902554, -491716, -616891, 15320, 580519, 453330, 909749, -521751, -414285, 913248, -51151, -503047, 157872, -168962, -863015, 782524, -254585, -338559, -768039, 499323, -953072, 849854, -317240, -460616, -470081, 485072, -201691, 590706, 199498, -708651, 737790, 105942, 271560, -804308, -941792, -203731, -738538, 268977, 664626, -41247, -387375, 470002, 761276, -936683, 438880, 160618, 32906, -857328, -537989, 105935, -602410, 416624, 443577, -248734, 349897, -312849, -64330, 794095, -57447, 928473, 129942, 742409, -84162, 13260, 532497, -515400, 957334, 577908, -390775, -428943, -415784, -137841, 425861, 526829, -987578, -723786, 23949, 370943, -858495, 150074, 191773, 294276, -651730};
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
    public void testSortingTechniques164(){
        Integer[] array = {-219787, -619562, 81183, -408095, -983762, 53800, -72872, -757642, 775680, -282653, -617062, 408694, -756641, -437454, -635704, 195002, -490654, 437417, -542356, -763930, -20169, 868878, -981871, -744759, -211341, -363015, 962596, -485894, -108983, -731551, 485818, -323988, -642638, -512347, -356898, 944345, 39419, 733972, -890562, 730980, -934332, 775803, -345834, -848139, -424889, -222080, 918219, -396482, 889958, 462964, -703611, -22161, 251644, -274490, 698849, 750053, -905958, -511754, -759907, -930760, -423416, 995522, -216294, -444129, 516265, 585622, -156090, -807700, -253363, 509815, 469702, 585482, 65167, -531590, 729347, -552434, 289080, 75901, -186925, 944763, 483927, -567156, -754973, -325909, -102829, 769327, -720560, -629373, -817730, 817109, -911176, 734197, 636071, 68060, 723186, -319559, 79696, -35665, -781312, 536142};
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
    public void testSortingTechniques165(){
        Integer[] array = {55157, 57177, -867211, 26328, -619689, 5792, 877164, -846442, -619115, -815564, 774500, -109344, -820523, -536260, 354950, -12678, -857780, -238840, -425673, -977616, 19335, 608161, -819069, -985689, 494920, -589097, -649347, 411838, 155157, 369883, -333859, -6771, -306846, -198067, 843944, 677773, -855776, -813568, 635485, 674360, -15442, -545410, -257604, 46912, 885007, 345970, 401544, 419409, -750471, -725357, 839578, -814624, 82700, -500108, 378341, -177347, 65810, 774463, -948826, -2820, 831416, 20062, 122223, 917348, 272639, -741160, 901893, 818734, -8762, -869212, -188952, 892483, -815557, -669761, -600345, -177165, -53697, -874846, 310410, -403032, -893235, 330711, 670974, -824254, -34043, 748356, 28363, 800322, -422901, -283361, 431003, 807521, -275632, -868473, -186783, -424635, 194333, -863712, 730552, 73966};
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
    public void testSortingTechniques166(){
        Integer[] array = {-995537, 866527, -906483, -232598, -227809, -830429, 158468, 414280, 899250, 569592, 30745, 910566, 752107, 191642, 951761, 144475, -436011, -230355, 272028, -515870, 371666, 408287, 171009, 386260, -772863, 113230, -546745, -593437, -557921, -131406, -282807, 842127, -20308, 126587, 324066, -908203, 366635, -326106, 961529, 116227, -248811, 261927, -894687, -1226, -38355, 573685, 886562, 808772, -24068, 307092, 858880, 955218, 594506, -818287, 874991, 647272, -854532, -316654, -879872, 519610, 424870, -935115, 799369, -238303, -697585, 109594, -768897, -943917, 192441, -153079, -337431, 317186, -614094, 839035, 933005, 35966, 881812, -825904, -797875, -633002, 581211, -631346, 898185, 67366, -345454, -9611, 344258, 319420, 61207, -230925, 574805, -375601, 839605, 930468, 837175, -911735, -870965, 955483, 232943, -199390};
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
    public void testSortingTechniques167(){
        Integer[] array = {-575241, -619885, -80811, -236095, 109554, -120271, -508573, 901645, 101403, -360697, 535883, -54276, -541465, 494546, 452922, 532742, 291335, 909343, -987124, 61411, 834232, 139102, -477403, -631399, 82337, 169053, -531852, -308038, 480454, -535419, -880487, -467403, -481180, 794753, 379166, 867180, -627902, -23710, -142003, -309895, -201429, 359099, 882894, -428606, 724865, 443512, -459423, -499745, 818491, 960762, -147982, -757912, -985111, -542922, 65028, -302874, 148666, -215922, 668679, 828963, -525652, 127118, 384085, 620264, -936042, -922334, -148783, -101684, 389697, -87782, 427467, -17685, 555152, 349335, -755395, 309145, 299268, 241148, 797812, 117219, -788550, 74824, -691570, 816330, -90829, 100653, -880864, -610809, 588795, 85766, 372687, 797685, -354118, 653493, -212602, -625794, -357606, -265755, 482154, -654021};
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
    public void testSortingTechniques168(){
        Integer[] array = {632903, -684552, -537877, -677186, 343042, 683691, 757814, -252579, -813059, -768897, 145669, -303453, -627117, 165920, 910004, 2503, 214551, -347946, -418524, -221347, 681375, -448765, 246581, 793978, -598748, -816144, 762770, 39618, -473826, -762382, -249181, -674980, 932993, 564212, 810883, 49543, -253975, 322295, 240422, 857876, 321176, 531446, -695279, -701421, 928177, -687187, -725869, 97729, -565050, -849555, -338567, 786637, -975219, 902548, -163280, -87513, -97474, 8003, -78100, -528974, 725936, -756506, 60767, 136311, 6043, -864916, -539869, 375662, -227852, 539865, 214093, -528565, 199352, -83560, -246215, -960516, -568350, 326691, -382664, -513540, -832934, -562027, 587055, 554088, -215413, -95495, 163326, 277787, 929689, 723477, 549943, 113164, 780971, 607319, 31068, -671058, -13877, -795228, 266128, 858483};
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
    public void testSortingTechniques169(){
        Integer[] array = {-532947, 312684, -677469, -59599, -712421, -487204, 12463, -93103, -624750, -612663, -894728, 404462, -53054, 943323, -674930, 76275, -146209, 916281, -654602, -982867, 686911, 857764, 510881, 152434, -109613, -999693, -255774, 856883, -872524, -950630, 327778, -925818, 977831, -527605, 903353, 468414, 285346, -318603, 177326, 165580, -987188, 608127, 538837, -741763, -379165, 712412, -568588, -667081, -218929, 477560, -683482, -539812, 787934, 766974, -851464, -641115, 723984, 505223, 911396, -250887, 58649, 127465, 215137, -164562, -899081, 123890, -546221, -592950, 698367, 447958, 553989, -202184, 301275, 183398, 55863, 223405, 953392, 416422, -452114, 644750, -821505, -260653, 634909, 663561, 815543, 500382, -268730, -583887, -983289, -535787, 742629, 24098, 576894, -157689, -580677, 65985, -588639, -759393, 76424, 696325};
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
    public void testSortingTechniques170(){
        Integer[] array = {441178, -240167, 397065, 457595, 706454, -259367, -421637, 63411, 697698, -409679, -418319, 713983, 491954, -914200, 803916, 520530, 812673, -791070, -643996, -40843, 160835, -17519, -676233, 177174, -951512, 26345, 53454, -663261, 268971, 768583, 854651, 347059, 786579, 339990, 518348, -995718, 776798, 697868, -894889, 78924, 379195, 52802, 6498, 249928, -545451, 13557, 202404, -874326, -532472, -442814, -667305, -720573, -568402, 680875, 33727, 179227, -672818, 926328, 789678, 955136, 556172, -668442, -140670, 879298, -777808, 384484, 346257, 536587, -888331, 479462, 507767, 958181, 292180, 448734, 227300, -288602, 481372, 201838, -893420, 804234, -644576, 908044, -678634, -892401, -858303, 191743, 689294, -438253, 241060, -398955, 237136, 563218, 656230, 868349, 547068, -207068, -149934, 487337, 787445, -207340};
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
    public void testSortingTechniques171(){
        Integer[] array = {599257, 620876, -742255, 324109, 38458, -890431, -345354, -299978, 366331, -363988, 460550, 847598, 434559, -33647, -681231, 908330, 739706, 725006, -909238, -288279, -161824, 729683, -446679, -645701, 358946, 163747, -346361, 783341, 195712, -900565, 969216, -197721, -240888, -960703, 127651, -621668, 759465, 647351, 988703, -369962, -870869, -971086, -224989, -972449, 641430, -427473, 859252, 913531, -343659, 761888, 693693, 126042, 96086, 257041, -787804, -461516, 544896, 788131, 623533, 586374, -925100, -79121, 543606, 946361, 358421, 481530, -283238, -439293, -244883, -643576, -285200, 89244, 164992, -897823, 453450, -525217, -187433, -959550, 233789, 160184, -719979, 837483, 525020, 300880, -778549, 497473, -830703, -485834, -186855, -488474, -888021, -975090, 319550, -986196, -700653, -539730, 906885, -790501, 401689, 536579};
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
    public void testSortingTechniques172(){
        Integer[] array = {824722, 364745, 283572, -502070, -692107, 119350, -246011, -364589, 900593, -912359, 810797, 554756, -701213, -52683, -546615, 765856, -43248, 415298, -121260, -7568, -787325, -874587, -899282, -877310, -660628, 745497, -326290, -38681, 604808, 669902, -883517, -719541, -601619, 770738, -602279, -690102, 225713, -82022, -954897, -413871, -43170, -283852, -289179, 230565, -164214, -487591, 629444, 116590, -586359, -82682, -947808, -337332, 405318, -203414, 762515, 112826, 228055, 232262, 874417, -780605, -397664, -484237, -872625, 363770, 657412, 878840, 80052, 728621, 416621, 711307, -185095, 850314, 815630, 793859, 391381, -419642, 528680, -966671, 626637, 256059, 760657, -921864, -905159, -460422, -732908, 363296, -999939, -253151, -60084, 321785, -281207, -149134, -620061, -890023, 470480, 191940, -892722, -172245, -553930, -513429};
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
    public void testSortingTechniques173(){
        Integer[] array = {-377441, -843865, 595724, 610941, 640832, 795255, 144400, 640592, -741035, 837108, -62506, -115261, 925118, 355328, 891877, -292582, -288153, -826454, -36286, 38895, -684588, 843617, 811779, 720956, 26168, -846667, -594565, -750515, -160075, 75558, 216179, -791290, -130443, 425767, -176876, -116767, 399888, -813605, -864546, 644494, 250624, -72191, 459440, 169986, -725725, 656315, 220314, -333162, -953585, -1276, 937393, -773420, -685278, -898291, 77026, 214872, 629722, 274446, -881131, -262123, -931804, -237608, 2625, -819179, 301604, 54215, 700700, -746511, 316820, 73366, -199747, 156953, -465404, 527236, 49924, -258650, 227475, -455029, -130984, -904151, 715261, -528501, 273959, 355146, -263659, -908488, -416366, 117112, -593140, 156875, -792223, -723683, -538915, -539563, -59210, -790797, -989438, 325980, -737324, -66548};
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
    public void testSortingTechniques174(){
        Integer[] array = {462465, -11130, -422820, 574460, -716754, -542555, -969081, 307010, 528573, 592663, 469090, 15794, -808084, -874028, -156959, 200416, -411642, -127469, 570088, -36915, -913399, 374688, 512146, 710851, 396028, 820337, -650922, -314558, 82141, -799126, 86051, 821045, -267933, -428818, 455006, 995892, 211717, 307435, 857137, -101857, 440007, 979141, 609720, 803651, 613693, -527774, -286734, 90700, -281069, -336462, 844660, 145302, 911451, -430535, 439906, 672772, -441711, 293440, -338933, 905900, -606615, -683651, 87069, -444844, 894396, 407794, 358347, -771527, 252139, -365172, -232256, -271905, -674325, -797955, -683258, -520500, -301934, 635255, -481969, 5496, -343830, 180551, -575455, -533570, -149020, 304752, 862021, 727346, 813021, 874504, 78083, 211361, -360178, 220612, -221433, 774856, 109221, -665896, -613575, 632500};
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
    public void testSortingTechniques175(){
        Integer[] array = {-387930, -353348, -388827, 991009, 643316, 147482, 452505, 501584, 354513, 70432, 488961, -682842, 398150, 123667, 926482, -64938, -488750, -288711, -725679, -147817, 185709, -282878, 191558, -106834, 267236, 653728, 26300, 85532, 796857, 970665, -680709, 132326, -638620, 563396, -890339, -778864, -786817, 28119, 27211, 731897, -204020, -801556, 530583, 873759, 798064, 704830, -996165, -252485, 672870, 627042, 875659, 949191, -164357, 356076, 858503, 758, 12573, 405185, -281224, -909419, -82051, -318140, -962544, 186773, 936198, 613028, -730297, 152442, 347613, -140385, -493431, -164815, -539844, 809206, 560986, 447795, 862951, 593021, 969977, 532580, 95341, 246572, 948730, 324476, -723719, 521209, -683143, -572160, 271567, -385358, -682357, -157805, -150952, -817608, -448085, -812999, 425019, -445795, -942898, -103278};
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
    public void testSortingTechniques176(){
        Integer[] array = {506744, 586274, 773954, 400254, -27104, 700843, 490057, -476506, -418867, -375043, 886787, 761500, -1151, 547778, -407795, 991149, -136581, 886111, -666716, 440466, -528277, -629295, 14519, -132883, 598657, -54007, -346291, 568122, 363889, 843379, 558748, 535969, -614795, 849357, -894795, -956509, -514315, -143486, 814326, 647489, 329874, -676518, -434211, -34613, 915048, -965897, 833833, 860761, 211040, -648278, 484638, -931756, 307113, 108703, -615147, 16854, 667060, 535449, -147205, 502376, -992072, 886220, -905356, -25757, 731977, -236283, -382345, -720311, 536976, -502291, -619990, -589344, 207284, -925707, -592193, -467890, -630346, 304301, -728491, 468599, -650706, 413051, -836806, -715857, -466948, -608953, -710050, -994435, -478869, 379834, -894242, 801923, -492272, -603803, -313237, -534513, -744912, -531208, 174043, -675062};
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
    public void testSortingTechniques177(){
        Integer[] array = {-412522, -578462, 613944, 778193, -519135, -728791, 423316, -166797, 700572, -654958, 83656, -279463, -122377, -110752, 571093, 439995, -87872, -299212, 247569, 149646, -576608, 376229, -582211, -495301, -633790, 690448, 812378, 13064, 663641, -20933, 498233, -452936, -210251, 713423, 238721, -650630, -553296, -45514, 992567, -818911, -330515, -803624, 295753, -892318, -912449, -757215, 693885, 748501, 678788, -406149, -923127, 566925, 329002, 292606, -478507, 827711, -196582, 452966, 975528, 676352, -85341, 43878, -732495, 49939, -263664, 693872, -749830, -282083, -329720, -893851, -20361, -501962, 313602, 404668, 731267, -172464, 2747, -91259, -437684, 470945, 970162, -349631, 570467, 734718, 728093, -647430, 948978, 360312, 53543, 515763, -900027, -636375, 338772, 835728, -689022, 439292, -892013, -838874, 84210, 24879};
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
    public void testSortingTechniques178(){
        Integer[] array = {-816076, 939179, -152147, -555779, -768348, 92463, 552596, -668091, -1469, -289428, 945282, 965028, -799295, -498289, -508884, 537716, -151126, 748894, -124624, -8119, 12107, 540543, 827577, 312157, -180180, 580603, -101002, -409744, -325831, -336002, 34347, 348735, 315001, 310543, -831683, 150982, 215249, -7388, -575620, 791604, 961843, -360431, 12976, -763190, -345676, -978159, -733998, -110163, -881906, -134184, 395753, 228367, -923553, 846748, -452327, -54574, -359642, 484161, -552737, 791374, -279354, 939262, -371425, -334234, 611161, -923102, -745228, -556509, -662270, -173929, 958250, -904585, 705017, -415899, 481928, 469506, 948279, 524912, 222663, -811120, 234331, 345168, -188268, -481140, 368095, -602107, -139674, 858769, 790510, 769874, 713700, -943831, -325794, -557425, -739974, 402667, 180021, -206219, 207118, -907282};
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
    public void testSortingTechniques179(){
        Integer[] array = {637705, 748751, -689397, -156906, -99176, 899388, 925801, -802661, 847561, 9236, 985187, -665865, -610208, -343431, -800132, 640124, 798466, -208834, 322348, -480400, -2879, 400875, 303081, 942911, -537561, -528386, -855332, -571693, 508201, -196964, -152736, 812175, 106530, 300667, -657457, 976130, 78215, 475122, 736819, -571077, -719366, -518874, -590149, -763420, -152363, -212219, 278982, -127420, -541561, 969609, 757075, 609103, -261414, 144339, 629390, 9382, -880338, -841782, -604494, 230190, -163459, 58615, 762255, 421067, 147801, 667852, 746569, 426263, 102079, 962527, 370385, -430461, 723781, -737178, 673660, -317026, 717391, 946187, -874023, -778506, -310352, 115435, 403816, 676630, -325403, 478327, 645994, -657854, -596602, 854630, 485985, -97746, 909391, -817290, -674076, -989134, -676095, -212743, 527971, 251210};
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
    public void testSortingTechniques180(){
        Integer[] array = {181712, 748388, 112808, 676699, 316818, 199364, -15398, -355009, 567625, 575410, -841518, 521808, 833896, 386746, -203331, 601849, 744888, 161895, 17328, 778370, 764422, -146554, -193640, -111309, 43068, -497958, -577890, -204949, -185966, -941455, 488400, -912069, 370216, -62843, -595749, -673589, 127318, -30699, 552634, 968893, 292040, 649233, -422496, -52927, -90966, -726393, -956577, 884628, 760653, -574003, 897837, 355612, -582006, 367812, -935952, 999086, 353577, 190924, 770264, 731187, -164653, 137725, 491211, 80074, 355063, 319532, 901980, 674896, 201095, 4217, -11730, 584073, 986715, -757524, -83030, -709731, -580927, -356431, 485794, 806706, -104795, -290987, -351688, -882962, -250670, 892398, 71676, -677259, -550673, -649292, 619433, -432996, 17612, 441111, 467986, -774416, -363339, -172912, 895392, -54618};
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
    public void testSortingTechniques181(){
        Integer[] array = {-472836, -722292, -405649, -385266, 331839, 982892, -538965, -698536, -39138, 201622, 436253, 640725, 146313, -108735, 35594, -6808, 135539, 230930, -428778, -15488, 212228, -519535, -304371, -704907, 854869, 790540, 457517, -518714, -27151, -261013, 334451, -546066, -458349, 377600, -835633, -770242, 697776, -104895, -425173, 536812, 748824, -660782, -476533, 204534, -534773, -575405, 947867, 43625, -643018, -204332, -678170, -796543, -774928, -609375, 305540, 1176, 626741, -436515, 440664, 67928, 614846, -32570, 562302, -201819, 710789, -537035, 342725, -667055, -983209, -90802, -267155, -493281, -732869, -746437, -499583, -971501, 566505, -338629, 946720, 592990, -857106, 590099, -51956, 727703, -668250, 527950, 140657, 442686, 619480, -333446, -260407, -257782, -357133, 59326, -828702, -498933, -242250, -332259, -937713, -391052};
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
    public void testSortingTechniques182(){
        Integer[] array = {592020, -362669, 703119, 111984, 588030, -57139, -708152, -736214, 564332, -992214, 615589, 198437, 782155, 341993, 298628, 291458, 894282, -83248, 986162, 27289, 64082, 591223, 811308, -230937, -947914, -421559, 443339, -348359, -374836, -669657, -577878, -797718, 273640, -20066, 238370, -199480, -606224, -465238, -475314, 401655, 166346, -647756, 62647, -759698, 500456, -309601, -894594, 641984, -247813, 920597, 547615, -944080, -567454, 111988, 405363, 814403, -962093, -384953, 334600, -409087, -666209, 447082, 351074, -395690, 667473, -235071, -398511, -351231, -297148, -379317, -22122, -499108, 70314, 533583, -791419, 241197, 33720, 686188, -645167, -614726, 939047, -604094, -377695, -872863, -832975, -519435, -134644, 228690, 568413, 610637, -205444, 273813, 787937, -27926, -921503, 351188, -713764, -877222, -304539, -885520};
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
    public void testSortingTechniques183(){
        Integer[] array = {74301, -312295, -421342, 650362, 381837, -665622, 620211, -3883, 666466, 777986, 180631, -652498, -295472, 817797, 703986, -263242, 928393, -217234, -977531, -330272, 905430, -741267, 759523, 23530, -314282, 346519, -878759, -181163, 705515, 564415, -255788, -398168, -280304, -858064, 718669, 627903, 88121, 810127, 801924, 607141, -415500, 5089, -188233, 241870, 665941, 721294, -547021, 965875, 307885, 316008, 954110, -636579, -561096, -169824, -808830, 314014, -860996, -930549, -742087, -750878, -559086, -401928, 893281, 789807, -388092, 186180, -726064, -321224, 865662, -81772, 13487, -597345, 940145, -962696, 845616, 409459, -487298, -578173, 378845, 27352, -344177, 325366, -375822, 361639, -778513, -534428, 288997, -661597, 538413, 444879, 915102, 565071, -675927, -660672, 79779, -71168, 483904, -259, -604286, -537045};
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
    public void testSortingTechniques184(){
        Integer[] array = {-12646, -920877, -829108, -867379, -429599, 490287, -901860, 931077, 421386, -802187, 466340, -93297, -205082, 259235, 138606, -673828, -93074, -417559, -373154, 872845, 762992, -328744, 894863, 754693, -712267, 138837, 533496, -91817, -640439, -718878, 80604, 736260, 113962, 688481, -248656, 118634, 234741, -434953, -737970, 442088, -78498, -859708, 190682, 585370, 718601, -714100, -157890, -776724, -304885, -408519, 115965, 452121, -203535, -968784, 482416, 911419, -968768, 476196, 894860, 82369, -384741, 659495, 93580, 624550, -302249, 578452, 718878, 110891, -516875, 829008, 528863, -855920, 905487, 137899, 952605, -558381, -347823, -218042, -898964, 458612, 155107, 913583, 629330, 213670, 236789, 615454, 682239, -537303, -781630, 623441, -536050, 761745, 771210, 514889, -204624, -940492, -16424, 56197, -695926, 847694};
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
    public void testSortingTechniques185(){
        Integer[] array = {289881, 946970, 807647, -261253, 922828, 250707, 363183, 432665, -445994, 15554, -698692, -748438, -930203, 433150, 213980, 136206, 754270, 9168, 610619, 338765, 216968, -305000, -846566, 692027, 214838, 109935, 977718, -765820, 530968, -312036, 937, 412930, 69815, 135176, -12911, 984336, -273249, -714640, -62661, 378632, -310332, -985336, 106396, 838029, 574538, -887035, 633684, 569945, 211284, -431806, 404871, 893197, 548009, -560651, -243575, -780212, 344780, -585089, -17078, 820429, 285626, -771744, 46549, 286288, -932380, -168979, -460679, -95007, -477836, 616058, 931593, -161680, 871758, 151614, -690663, 895038, 105892, 638261, -419991, 723134, 108350, -34545, -985063, 262539, -306145, -941155, 591650, -146055, -610332, -864700, 698583, -594233, -556984, -532310, -304363, -416390, -683959, -875427, 321195, -12797};
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
    public void testSortingTechniques186(){
        Integer[] array = {-890719, 805902, 421974, 843809, 172856, 235525, 738571, -227555, 816056, -669449, -134532, 41575, 395226, -408977, 194602, 376456, -887155, -835725, 502441, 973437, -628983, 85219, 834510, -73892, -180996, -909185, -351161, -76206, -771377, 551139, -354897, 683299, 348510, 54705, 956505, -660280, 429678, -747448, -504024, -336474, -730928, -545337, -637243, -835174, -328450, 153861, 378380, -304332, 338894, 769523, 651948, -354110, -593815, -969168, 110451, -892586, -3828, -263616, 275178, 188725, 972108, -767349, 923747, -129700, 999507, -915419, -995955, -892605, 867115, -932978, 472077, -448534, 576420, 224932, -349424, -356012, -347796, 308738, 671565, 443663, -15273, 201931, 32452, 731243, 930303, -457740, -654226, 720828, 220003, 940297, 631148, 842933, -703254, -520949, -525740, 489541, 649807, 348767, 374458, -24728};
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
    public void testSortingTechniques187(){
        Integer[] array = {-305491, -254541, 252143, 360705, -145199, 229723, 921494, -907475, 122059, 789865, 369632, 672522, -659817, -318274, -462756, -55231, 858839, -845805, -716653, 770536, -201121, -220871, -727959, 384019, 462426, 294176, -241786, -786880, -857611, 916553, -565492, 58395, -645848, -251045, 100933, -433863, 677062, -7114, -781452, 899932, 514882, 110129, -30919, 743208, 278321, 560306, 359903, -474495, 585687, -962871, -578136, -900630, 328371, -472047, 13840, 267558, 72436, 230066, 294261, 702347, -651982, -813210, 695192, -68044, 707303, 209582, -646606, 655277, -531898, 751001, -222914, 653210, -321575, -679556, 32091, 618817, -400897, 409264, 700765, 807237, 513979, -296274, -125763, -255499, -793980, 84596, 897014, -75177, -823987, -314352, -351153, -692358, 283651, 198532, -416140, -714825, 487757, -495512, 785765, 531119};
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
    public void testSortingTechniques188(){
        Integer[] array = {671485, -702847, -811638, 175358, 340672, -90018, -529294, 419296, -800363, -382067, 465531, -588937, -293468, -586988, -612843, 545680, -804279, 294563, 736995, 305440, 333632, 506109, -47093, 862018, 507776, 867792, -429491, 934799, -901026, -255044, 129250, 554201, 231407, -841161, -133713, 632015, 324195, -784426, 506877, -702564, 228406, -599418, 331609, 879032, 113794, -562348, -842066, -787864, -97251, 409710, -698986, -91390, 207188, 619595, 557013, -468751, 766428, -489944, -231213, 749340, -869472, -746333, -366141, -26483, -362496, 622426, -413750, -838633, 171875, 660623, -409531, -258138, 564115, -369649, 277567, -218563, -509271, -735597, 733690, 324271, -884347, -499830, -977390, 722202, -860621, 746529, 476756, 520035, 770938, -848749, -22445, -854976, -860071, -45722, -41093, -230977, 121299, 448418, -528057, 456206};
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
    public void testSortingTechniques189(){
        Integer[] array = {57453, 587055, 479247, -301292, 100741, -569072, -348316, 849971, 646561, -165866, 409035, -131111, -294640, -840963, 985819, 570395, -144545, -21469, -903216, -499049, -465473, -623299, -625851, -563383, -543954, -614955, 796752, 76623, -597187, 654297, -495447, -713137, 552472, 316302, 362661, -15346, 911648, -323348, 643874, -301037, -418963, -93653, 838214, -166893, 765809, -281456, 833008, -73249, -495224, -666330, -853321, -846893, -940094, 658205, -334452, -536030, -372252, -254381, 351225, -136266, 140886, -895683, 660234, 653599, 181089, -464286, -393798, 512165, 439133, 83310, 697881, -97020, 363026, 381287, -205666, 154240, -354177, 67400, 976458, 496169, -745102, -629808, -32880, 903783, 210798, 359553, -609993, 525850, 126574, 192369, -776947, -237289, -534618, -244219, -134255, -167452, 638096, 63731, 950946, -560301};
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
    public void testSortingTechniques190(){
        Integer[] array = {-905228, 17514, 85470, -76483, -890233, 970746, 416887, 157790, -533673, 773742, 128811, 976665, -46221, 878613, -415858, 967424, 211583, -657497, 392167, -365391, 346741, 334678, -810127, -367668, 489689, -493081, -465845, -583446, -555388, -575018, -493777, 579119, -987048, 271748, 22757, 441746, 808587, 470425, -177254, 669466, -567161, 9615, 10674, 208768, -975922, -698071, 454539, -750881, -304392, -154847, -526472, -998894, -483818, -797983, -132248, 387343, 652597, 57073, -250013, -563518, 77294, -84291, -720233, -346394, 422063, -509181, 363559, -844701, -881261, 880321, -693640, 19602, 786271, 484271, -160436, 455459, -360839, 740080, 361336, 756495, 451652, 467416, 791790, -354078, -705062, -587602, 651625, 805575, -996190, 848422, -640993, -232047, 606310, 982816, -91019, -194208, 415234, -625406, 83442, 399649};
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
    public void testSortingTechniques191(){
        Integer[] array = {-366885, 721921, 988460, -366674, -221093, -195454, 233516, -261147, 349138, 400899, 490345, 165861, -461254, 68628, -103562, 543892, -736543, -515689, 8427, 868176, -461895, -44002, 723786, -906074, 290677, -794925, 989920, 242871, -816942, -78484, -348805, 423645, 622867, 174082, 200962, -236956, 587725, -186032, 765439, 530195, 201194, -770694, -294163, 485182, -883434, -101509, 863071, -988882, -32711, 241690, 785721, 457685, -666509, 564369, 816823, 811382, 959436, -524142, 227151, 402614, 674945, -344492, -32302, 381437, 512870, -317539, 744705, -431758, -738427, -248834, -933207, 376638, -311560, 529926, 801969, 443331, 879784, -414811, -691545, -67845, -374634, -563184, 893917, -660285, -790031, 33027, -385709, 480240, -102618, 862053, 557313, -913701, -530655, -286526, -856937, -416140, 985650, 817739, -949440, 740005};
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
    public void testSortingTechniques192(){
        Integer[] array = {221827, 827042, -335394, 953116, 342687, -450696, -456224, 572635, -796622, 775921, 594857, 488729, -313920, 563939, -905112, 390918, 609014, 865702, 547235, 870077, -748409, 739731, -262492, -274782, -24246, 445038, 654112, 132890, -781379, 16765, 473068, -360766, -543046, 108011, -393655, -658349, 370814, 579428, -461346, -611760, -891610, -690934, -209300, 994476, -211036, 195954, -608926, -803381, -271596, 766297, 952285, 529909, -63567, -685444, 307168, 136442, -16782, 13869, 250218, 954112, -166194, -564470, -348654, -628965, -146735, -661035, 627977, 203086, -342528, -39024, 270234, -812921, -392223, -892106, -644812, 74856, -48615, -657405, 154786, -401733, 404664, -799898, -963593, -402572, 541060, 582748, -397257, 221379, -794384, 548652, -544310, 816470, 792852, -58510, -949691, 203653, -644303, -152866, -685480, 912809};
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
    public void testSortingTechniques193(){
        Integer[] array = {-203400, 32661, 536499, -583889, -816983, -440057, -815750, 741436, 779324, 153396, 214107, -717017, 829670, 468340, -347331, -360474, 94005, -83510, -240399, 16295, -560801, 146769, 792859, -478203, 103480, 595184, 76169, -498549, -943887, 242577, 182953, 958134, -997577, 286951, 577816, 544611, 188971, 821608, 479044, 813710, 513296, -107568, -466787, -468031, 968081, -494820, 824663, 927040, -353721, 172958, 748438, -275183, -640644, -197016, -9364, 183780, 948216, 565322, -516973, -752838, -518589, -546464, 708881, -564526, -611818, 446469, 675127, -674808, -234485, -861285, 1859, -121100, -739290, -213088, 197440, -137352, 868804, 16062, 69978, -695900, -63044, 653727, 556079, -286628, -307692, -962042, 22474, -971019, -448726, -589698, 27381, -871618, 625865, -778430, -873916, 681521, 933613, 239761, -190371, 933867};
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
    public void testSortingTechniques194(){
        Integer[] array = {288270, 901960, -978095, 628581, 48418, 888498, 331732, -42373, 351736, -311299, -555342, -734704, 229613, 44089, 108133, 217571, 964021, 773496, -907117, -116230, -664755, 850740, 55754, -156585, -154227, -381431, -183934, -465921, -545879, 297707, -180944, -758125, -403596, -226695, 742308, -875953, 416912, 149833, -111041, -194237, 674919, -574472, 91417, -613880, -275046, 942742, -151109, 240383, 421696, 562243, -464546, 519613, -79127, -436181, 363949, 289939, 468882, -626397, 413869, 211026, 857262, -408897, -295277, -441812, -623833, 363836, 813963, -237878, 11856, -742015, -615734, -579001, 174476, -755711, -740485, 426285, 995930, -543034, 71220, 410972, 225844, 909601, 397176, -112990, 335096, 100769, -323358, -906618, -3567, -803856, 160765, 849726, -679626, -591918, 647064, 320343, -243490, -877789, 166861, 935738};
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
    public void testSortingTechniques195(){
        Integer[] array = {213498, -575693, 521324, -361563, -112036, -856379, 181234, 858057, -740143, 722068, -966387, 778082, 850393, 571359, -899511, 731108, 126925, -357184, 536006, 962335, 917287, -691129, 598569, 330551, 898244, -615307, 40365, -698252, 640053, 468418, 933649, -161405, 933008, 898851, -252995, 801753, -283797, -976103, 118732, 627096, 1867, 125533, -475384, -364651, 655051, -959481, -979930, 979738, -897996, 447405, -341820, 693665, -250843, 464579, 944314, -357442, 71892, 62570, 827044, -575077, 917374, 235480, 629528, 880396, 745709, -418948, -807400, -443742, -348774, -251649, -973119, -452045, -855963, -565799, -628602, -716513, -483883, 567528, -339533, 749885, -33410, -359408, 925003, 204069, 953318, 132877, -335683, -512077, 426868, 581654, 832434, -491015, -546417, 333117, -323746, 626673, 405269, 526204, 692848, -308015};
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
    public void testSortingTechniques196(){
        Integer[] array = {-607941, 838354, 593510, -499694, -146262, -167837, -723951, 34335, 220211, -814200, -233809, 459731, 487342, -869040, 26033, 642537, 116874, -77277, -126598, 296497, -642232, -963022, -411443, 605297, 150703, 502850, 280495, 424138, 365481, -297052, -419575, -220869, 784198, -417260, 939448, 73475, 635986, -862348, -54365, 154777, -426364, 210537, 150333, -774783, 222827, 61544, -114290, -647239, -445315, -433548, -407515, 80809, 656902, -151493, -778366, 316577, -584353, -973768, -91614, -274663, -687648, -664966, 199806, -302838, -28090, 329642, -21537, -168837, -168108, 837791, -43413, -728820, -432374, 392127, -881457, -877146, 724760, 878095, -273192, -608284, -195370, -469582, 856721, 196084, -673577, 131860, 145831, 941066, -531849, 981763, -440904, -3512, 796410, 70792, 515740, 765170, 777158, 321824, 6927, -875308};
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
    public void testSortingTechniques197(){
        Integer[] array = {859143, 478735, -354545, 958473, 460292, 916822, -525943, -505742, -561907, -438854, -808636, -263051, -168617, 128168, -915363, 666245, -292712, 786052, -247634, 249374, -304933, 918328, -352451, 323553, 977277, 328075, -332897, 804806, 142194, -349685, 64336, -17627, 216174, -172775, -245657, 972030, 609810, -912249, -175007, -72907, -542404, 251196, 212567, 802064, 127768, -978554, 71684, -444379, 932402, -879764, 699414, -577182, 187602, -264350, 238341, -581835, -973179, -920661, -287985, 657136, -929201, -427849, -689462, -82135, -999427, -180295, -670202, -731560, -661225, -905009, 143952, 217427, -657768, 908175, -383080, 608254, 655134, -568544, -852800, 651611, 787126, 706185, 875686, 493664, -157623, -557813, -574745, 514529, 510079, 698895, -540365, -960437, -923846, -735286, 97220, -423951, 474493, 171615, -844954, -500681};
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
    public void testSortingTechniques198(){
        Integer[] array = {229265, -501697, 936161, -65455, -563349, 695536, -634920, -881344, -270797, 949323, 140510, 917670, -195341, 763373, 14044, 773895, 94604, 859153, -843102, -128373, 754051, -371573, -477395, -690714, -453309, 881040, 58919, 751277, 322003, 906723, -358832, -335782, -613974, -16706, 896120, -26927, -820724, 628773, 774520, 153915, 242684, 396149, -744092, -252464, -765637, 806829, -109477, -290170, -72192, 5771, 554695, 567129, 815048, 284250, -319611, -685290, -953753, -151075, -637379, 898911, -627761, 68589, -799605, -563996, 853828, -389510, 607993, -347224, 252298, 634995, 557381, 620969, -100815, -330833, 115518, -18446, 742915, 386659, 448940, -846703, 368425, 695272, 171149, -874811, -165223, -857320, 124692, -434803, 441389, 726298, -552325, -961662, -361660, 809169, -537451, -169227, -101225, 217039, 336545, 747701};
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
    public void testSortingTechniques199(){
        Integer[] array = {695495, 877894, -753131, -353232, 57745, 61731, 534608, 992368, -528789, 842611, -748675, -414838, 638077, 101599, -159837, -320582, 362380, 626999, 503936, -612765, 125747, 504149, 953087, -411616, -662285, -849605, -62661, 259271, 546620, -741625, 202975, 515590, -267002, -546055, -134425, 591773, -896334, 707973, -338784, -344854, -138077, -362021, 762455, -469773, -432799, 117700, 554819, -532881, 955520, 495518, -903865, -881815, 614505, 939007, -236393, 971406, -753242, 773363, -472683, -138429, -665491, 790495, 468764, 665113, -179836, -820861, 987270, -225117, 396936, -659284, -126951, 680159, -428093, -83709, -75522, 898069, -994273, -408062, -642670, 137085, 683192, 854944, -528697, 466023, 99978, -66785, 886461, -386856, 172111, 436624, -240548, -600230, -191307, -449768, -902649, 750436, 309783, 197066, -521664, 349479};
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