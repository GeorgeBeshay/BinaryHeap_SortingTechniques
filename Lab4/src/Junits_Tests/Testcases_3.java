package Junits_Tests;

import Sorting_Algorithms.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Testcases_3 {

    private SortFactory<Integer> simpleSF = new SimpleSort_Factory<>();
    private SortFactory<Integer> efficientSF = new EfficientSort_Factory<>();
    private SortFactory<Integer> nonComparisonSF = new NonComparisonSort_Factory<>();
    private SortFactory<Integer> heapSF = new HeapSort_Factory<>();

    public static ArrayList<Integer> getLastList(ArrayList<ArrayList<Integer>> steps) {
        return steps.get(steps.size() - 1);
    }

    @Test
    public void testSortingTechniques351(){
        Integer[] array = {670087, -54838, -735669, -608539, 730260, -232669, -693414, 180051, -103649, -204984, 644750, -133037, -407696, 914894, -982975, 452768, -841419, -899376, -699041, 436990, -816950, 221334, -488268, -832028, -893605, -543152, -333915, 343340, -320606, -349825, 316677, -316387, 856672, -900185, 611288, -213082, -790574, 705507, -881475, -539551, 7978, -50878, 171978, -222141, -827695, 736941, 183236, 369902, -684103, 347922, -549937, 930833, 554779, 405968, 942565, -630140, -268943, 96691, 119904, 535165, 309127, -168946, 424580, -700180, 676867, 760002, -433547, -407024, -726004, -709295, 863714, -423335, 658688, 534312, -26072, -313169, 255240, -107634, 711800, 786715, 663252, 445098, -601546, -33953, -387081, 47672, -318474, 6198, -730394, 938104, 336203, 139977, -364988, -229711, -281426, 58071, -303011, 365241, 793779, -200367};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques352(){
        Integer[] array = {884726, -158622, 134854, -901932, 969827, 815104, 734953, 322749, 402959, -53841, -122187, 169582, 959826, -448019, 615848, 170197, -224371, -617090, -980017, 67757, -31269, -611522, -78235, -643320, -724118, -139321, -117989, -36832, 759426, -916817, -180884, 83551, 360649, -699241, -709652, -243428, 238642, 100387, 645587, -601700, -148600, 286361, -693866, -191477, -964859, 363878, 192405, -955096, -325569, 158368, -335334, 539626, -936151, -498336, 810003, -485771, -771939, 968387, 896132, 929744, 320962, -117322, 949389, 571981, 891415, 806090, -258403, 884513, 501361, 805559, -680754, 789381, -829851, 83834, -191575, -114544, 871932, -827072, 50427, -288127, -995744, -417761, 648399, 435816, -801252, 16012, 976298, -892283, 490891, 438122, -736446, -354347, -929974, 960626, -451630, 847035, -583253, -969371, 40968, 309342};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques353(){
        Integer[] array = {-679370, 452180, -144930, -159433, -879654, -378488, 374312, -286368, 51560, -570521, 707095, -215014, 165895, 489639, -324211, 791524, -953581, 272300, -930905, -974396, 1743, -746515, 389878, 831883, -372343, 268553, -632459, 886669, 805084, 795797, -179449, 923619, 866537, 713082, 271397, -947915, -728125, -203582, 875002, -494793, -226008, 208612, 235426, -122449, -623668, 754661, 790590, 754441, 859308, -597324, 788901, -564563, -566291, -114058, -689721, 533105, 834349, -782843, -655720, -798490, 896079, 945159, -223135, 949635, -900921, 637749, 77406, 314561, -17896, -396415, -249247, 422716, -599342, -484388, 470246, -385426, 9602, -122917, 496521, 463555, -748988, 282433, 490979, -701938, 574093, -208713, 907794, 176030, 124232, -299478, -486097, -429356, 322255, -770725, 875644, -206578, -539626, -603791, -477589, 269871};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques354(){
        Integer[] array = {-763962, -411482, -269572, 294463, 601907, 530124, -247486, -3073, -847915, -978774, 947396, 755075, -84068, -857703, -336664, -980231, 253775, 373288, -553594, 887778, 163116, -185523, 562214, 467570, 108861, -640192, 17423, 855788, 840817, -96218, 338783, -769928, -726871, -94192, 519276, -786734, -631444, 357484, 156592, 87423, 712835, -311335, -278188, 455115, -615702, 194352, -606187, 697082, -481035, 402270, -895146, 669186, 775589, -948099, 892676, -216495, 359059, 778206, -723375, 656801, -783920, 243875, -49405, 158805, 41705, 233706, 134709, 721661, 527412, -648325, 506233, 343943, 258613, -387862, 768816, 118005, 578600, -407117, -881995, 771295, -160867, -346691, -905029, -161572, 319100, -748362, -100043, 572782, -442918, 100026, 862430, -60959, -948859, -366150, -524621, 31880, -466134, -970950, 206176, -861328};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques355(){
        Integer[] array = {-221868, 567529, 965134, -34907, -845957, 331779, -920486, -17229, -374813, -519663, -923979, 688659, -846538, 837937, -425611, -894491, -311074, -391484, -127664, 731479, -453407, 919732, 501908, -904924, -924065, 231457, 122109, 810832, 761767, -190170, -741731, -410667, 22809, 555125, -208841, -170631, 703150, 372329, -963674, 319727, 423383, -535787, -34245, -71823, -469507, 852636, -889004, 553860, -425628, 977839, -645335, 349512, 422402, 311847, -312552, 222335, 236125, -578998, -626095, -596286, -602184, 508661, 578851, 362802, -637415, -356266, -297176, 287252, 232185, -195732, 245214, 704871, 173304, 925778, -906175, 267808, -670393, -131088, 120199, -190621, -640153, 134790, 8893, -27979, -156777, 649716, -334110, -429914, -852397, 612088, -244384, -70906, -981116, 518274, 156945, 165566, -333813, 568386, 6457, 340528};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques356(){
        Integer[] array = {-337265, -234562, 802522, -872047, -469546, 735297, 514374, 636547, -351635, -532608, 320208, 894186, 42505, -386920, -782463, 490318, 916689, 669919, -724947, 694948, 166177, 728969, -587558, 993131, 900729, -118995, -990776, 472068, 279426, 954151, 688810, -606969, -737170, -724106, -971391, 181707, 537058, 997752, 353386, -885904, 477638, -374926, 710736, -791751, 675972, 428463, 984025, 717255, -120920, 670460, 772943, 114407, 978493, 723993, -74659, 358424, 829069, 819762, -734382, 490534, 382869, 472084, -496891, 154273, 362003, 2415, 265143, 445077, -522019, -342017, -702269, -936290, -603686, -931978, -417404, 272082, -369735, 663694, 702964, 89043, 339886, 967433, -90973, -996807, 719124, 344466, -928224, 790461, 993856, 282229, -48133, -882045, 809024, 700120, -554754, -375370, -562349, 269298, 251472, 258796};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques357(){
        Integer[] array = {-571142, -652762, 688664, -719846, -616223, 121027, -218310, -605871, -652439, -865332, -652892, 724867, -14550, -574240, -882459, 946955, -423711, -540509, -380782, 918916, 136630, -778561, 884659, 713041, -256602, -811049, 451610, 370280, -63396, -732994, 234740, 37854, -211780, 729776, -41153, -424424, 440668, -553583, 131906, 709008, -102245, 363310, -605186, 931303, -371404, -94546, -791514, 598871, 474154, 313132, -634053, 355337, 274435, -889923, 153224, 555529, -437655, 569064, 762276, -881942, 372209, 525429, 94123, 444576, -463940, 779570, -612913, -883465, 222479, -58991, 744762, -183714, 211200, -35710, 765703, 98696, -968799, 754172, 226777, -734745, 676925, -998272, 521522, 30761, -256047, 234878, -820060, -271591, 657747, -254695, -862167, -685658, 11560, 908606, -898665, 568864, -845314, -670394, 370445, -264491};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques358(){
        Integer[] array = {-807187, 294570, -460996, 968303, -583233, 843122, 26440, -861729, 277617, 38663, 413643, -934180, 789160, -255867, -15113, -885328, 784225, -805636, 173858, 29462, -426490, 553758, 827195, -385149, 633466, 180658, -954825, 725273, 157070, 365243, 99573, -357567, -735291, -489557, -904441, -463131, -887460, -307609, -401622, -528043, -751706, 694411, -724543, 364344, -545463, 790583, 957205, 31706, 534437, 753423, -107217, 283702, -549726, 48190, -642905, -899740, -498777, -37226, -348197, 5159, -30259, 815335, 782755, -686261, 953072, -242026, -316977, 213123, 596807, 911754, 689261, -861810, -480682, 490890, 96161, 998244, 146553, -999025, -442757, -368108, 493012, 348533, 143932, 55543, 690216, 182397, -677760, -205317, 595613, -931437, -251984, -708513, -325097, 396423, 620700, -710373, -190215, 481631, -693624, 228558};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques359(){
        Integer[] array = {85860, -994445, 536640, 920118, 625756, -769519, -520257, 600576, 332970, -795639, -612645, -894928, -794307, 366764, 299249, 77821, 921603, 485914, 84587, -367124, 701126, 10008, -119046, -28876, 994580, 36253, -165710, 133166, -497905, -291064, -887783, -780, -628346, 552081, 908712, 356284, -118151, 857268, -738518, -357282, 87213, 721529, -422703, 123221, 412944, 418724, 457147, -968928, 684168, -647948, 198718, 749886, 198596, -853648, 84517, 28566, 878342, 702518, 138317, -597796, 471366, 294025, -576647, 801917, -888640, 258823, 105913, 925103, -654868, -578751, -814950, -599308, 264306, -232319, 833767, 55020, -455824, -226470, -884440, -417990, 653708, 247359, 652620, -168760, 198806, 277635, 341441, 431297, -804348, 573612, 97195, 103574, 693748, 849244, 865871, 321250, 436362, -996465, -432322, 925126};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques360(){
        Integer[] array = {466545, 166317, 604168, 470547, 566668, 828593, -145621, -324054, -120802, -118362, -549398, 49087, 991182, 874413, 700363, -672756, 433549, -530230, 489829, -976988, 73817, -402379, -724705, 31936, 642138, -106384, -13961, 494594, 2569, 137919, -940544, -107445, -449373, -567018, -921768, -809217, -12876, -182311, 895537, 351661, -62534, -620491, 564915, 28749, 9603, -699843, -522614, 153951, 777919, -946213, 237378, 353774, -223470, 198364, -710604, 403485, 52835, 363007, -602729, -117914, -666024, 78305, 182439, -970322, 714234, 939678, -766128, -372455, 464276, 225608, 829236, 816014, 568056, 548201, -705793, -445812, 773985, 502747, 815771, 144297, 656813, -440983, 735177, -178632, 33826, 716588, -111752, -384285, 181327, -36944, -601849, 447864, -621091, -85548, -309274, 748077, -439533, 854351, -852962, -86039};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques361(){
        Integer[] array = {-659832, -623806, 654214, 586932, 169627, -929270, 439798, 846902, -484514, 634529, 848361, -570498, 697602, -349645, 712882, -413145, -264173, 279032, -63525, 864761, -846484, -495905, 911618, 829772, 629916, -457783, -573123, 104368, 214001, -275546, -304919, -13505, 995660, 615627, 361403, -947983, 179212, 832868, -489854, 734052, 677576, -35038, 528867, 923168, 958522, 667555, -189908, 705833, 30807, -394832, 868814, -678109, -395253, -672916, 473099, 638780, 92164, -654524, -743029, 285623, -953428, -727000, 596523, 730400, 566550, -494513, 461340, 128352, -483758, 770734, -589513, -969679, -346571, -537112, 311982, 998278, 573, 693179, -23423, 197756, 466165, 942222, -742751, 623337, 378088, 196226, -792159, -807626, -988889, -818972, -181439, -651399, 240283, 293381, 893802, -139886, -297747, -184646, 114071, -235984};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques362(){
        Integer[] array = {-185442, -99807, 722331, -941084, -297467, -715522, 431436, 49765, -4672, 661083, -293399, 858842, -792289, -256638, -888024, -998259, -620332, -74799, -839644, -368610, -727881, 873156, 155875, -19813, 280909, 49534, -356186, 289632, 684635, -155229, 460763, 89592, 660739, -737475, -137332, -224928, 248885, -511498, -58887, -800450, 680228, 859136, 729464, -296082, 84711, -881975, 685950, 511159, 438636, 761207, 259601, -335963, -649857, -573424, -428129, -803252, 884656, 873913, 608191, 266723, -394851, 652309, 222556, 41486, -629488, -139692, 348349, -219576, -885452, -314960, -327708, 656665, 394501, -409064, 379515, -985897, 102937, 37638, -229399, -461371, -539254, -865354, 538496, -702701, 668395, -146032, -9019, -29615, 297886, -594421, 43976, -225035, 316555, 459812, -212297, 994858, -701066, -926525, 566475, -742051};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques363(){
        Integer[] array = {-191097, -494680, 209535, 256596, 200521, -315709, 562299, 489529, 233439, -881226, -651377, 827042, -495784, 414591, -13931, 311072, -297465, 512354, -202164, 68874, -623585, 460341, -638852, -312018, -697696, -242270, 322993, -620512, 988207, -723642, 517183, -603859, -639078, -107026, 85788, -68844, 19087, -465174, -183477, 383513, -90015, -396738, 528351, -15024, -592665, -46776, -90136, -552639, -277369, -409992, 3575, -672673, 128925, -824146, 882956, 639361, 49056, 446237, -843700, 345765, -79975, -646667, 832729, 704290, 789410, -214534, 158410, 984887, 354222, 680199, -747095, 714520, -151070, 795660, 374121, -446705, 662114, 86560, 57905, 770947, -485182, -981894, -701209, 599617, 826608, -857256, -262247, -585247, 82308, -716957, 583600, -962902, 227419, 989397, -549177, 600364, -180847, 175149, -208386, 867868};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques364(){
        Integer[] array = {926232, -530365, 818150, -899462, 393590, 821837, -449604, 219067, 603105, 813197, 852847, -228308, -783831, 269526, 587260, -839177, 890945, -277509, 998333, 333064, 514626, 336966, -184955, 577478, -396921, -827959, 782896, 297348, 209125, -716584, -401094, 993340, -262910, 798000, 692752, 631919, -283502, 804727, -587186, -371514, -143250, 198828, 184214, -617781, -265171, -973907, 791997, -555006, -983920, 554548, 895119, 244604, 353838, 722053, -102999, -534750, -535588, -812968, -723330, -817823, 368004, -804390, -149903, -3419, 395543, 570492, -655585, 406228, 977085, 53357, -632993, 884075, -252041, -826592, 688926, -607375, 598596, 246229, -530974, -94039, -913206, 385178, -765714, -114381, -453584, 402058, 860567, -69663, -822646, -33280, -295280, 176185, 645697, 177079, -706284, -623161, 661500, -525338, 816639, 724864};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques365(){
        Integer[] array = {584725, 301416, 207781, -145127, 463820, -148734, -785173, -633925, 78954, 572346, -628058, 477608, 987931, -317924, 201001, -793023, 806923, -22672, 683280, 55657, 713444, 208781, 949946, -449671, -528553, -608681, -315166, 879376, -473235, 299853, -917593, -313205, -159552, 630839, -942596, 521231, 759325, -531693, 54357, 945231, -637351, 790119, -929983, -582885, -682511, 151943, -603217, -642546, 912034, 86245, -760606, -189606, -801572, -620166, 725823, -145661, -430042, -704052, 881721, -913826, -654086, -210508, 446762, -442771, -647525, 755112, -367716, -877483, 407599, -761858, 228016, -230444, -937947, 989629, 554974, 861014, 299923, 344501, -596242, 749922, -354992, 826414, -988852, -336324, -686046, 297233, -912748, 448789, -229014, -362358, 521454, 789809, -516734, 122693, -718003, 395061, -487111, -58166, 117835, -289458};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques366(){
        Integer[] array = {186044, -895371, -712250, 822000, 999416, -77157, -992298, -682548, -167220, -126903, -211927, 169761, -631503, -41391, -155757, 257028, 272789, -904673, -16539, -482639, 820322, 241384, -354212, -81033, -945207, -418912, -69897, 230189, 519116, -355517, 986293, -721973, -54142, 577311, 936849, -581733, -623840, 905783, 180200, 361937, -840236, -519603, -469588, -967095, 884691, -595138, 543023, -63052, -354186, 394478, 704028, -150203, 198191, -187804, -602661, 399857, -196423, -673069, 347156, -523277, -650348, -162158, 408983, 332524, -193873, -271264, 698067, -15079, 462761, 372885, 440272, 14290, -9422, -126563, -475805, 295608, 656982, -2863, 933191, -57025, -157825, 255898, 895290, 940637, 654985, 738351, -926165, 693827, -606104, -468319, -931710, -916827, 276129, -267187, -226410, -573879, 526458, 192079, -428122, 583869};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques367(){
        Integer[] array = {-612423, -219853, -858763, -141390, 624751, -414087, 103031, 759057, -106131, -128636, -746885, 183251, -133863, -661674, -166731, -40231, -736360, -730768, 173087, 977775, -149448, 242238, -728834, 205045, 610946, -611390, -556293, -488444, -680893, -302982, 617906, -919021, 221006, 398112, -357798, -633589, 407992, -934219, 529040, -373133, -383740, -884012, 253031, 190521, 430315, -916129, 385381, 282654, -754882, -434607, -784013, 464518, 792420, 906258, -503198, -638200, 815965, 817367, -407874, 702556, -495903, -421863, 381144, -389973, 644949, 762973, -621258, 720595, 884086, 911928, -132037, -505022, -810444, -290869, 468635, 811388, -515450, -41088, 174232, 590752, -199614, 986840, 890280, -838349, 553905, -868776, -88459, -163213, 921607, -437422, 976583, -498394, -949297, -592523, -859154, 372607, -900679, -709359, 792056, -641578};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques368(){
        Integer[] array = {260998, 893660, 447182, 475994, -367922, -777310, 431530, -124410, -231657, 973612, -650134, 749450, -197441, -692587, 469930, 987214, -393746, 677183, 107414, 486012, -740104, -225433, 990397, -247655, 870790, -231346, 292100, 948202, -855743, -882694, -389688, 18155, -529164, 68337, -723549, 209237, -713897, 569384, -507418, -144663, 761300, 90759, -216167, 791041, -176509, 510475, 493374, 396391, -466727, -855674, -567805, 958561, -385255, -573856, -988488, -63599, 858115, -379582, 907328, 446380, -739554, -125321, 72739, 669652, 602724, 958118, -33519, 315538, -467676, -237962, 104650, -640530, 645272, 95971, -235025, 622933, 272110, -530102, 965144, -987215, 145913, -594, -751382, -689685, 590316, -575769, 693227, 417954, -219829, -105453, 898910, -723163, 217103, 767415, -144608, 760800, 445438, -423635, 802434, -507491};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques369(){
        Integer[] array = {538029, 547529, -952691, 990515, -297551, -628527, 264030, 669231, -755744, -436355, 781126, -855117, -356144, 955978, 310315, 182414, 974193, 112659, -892207, 135633, 479600, 45384, 559548, -437387, -32453, 95745, 542652, -302314, -801364, -549604, -458717, -669776, 142793, 499150, 471641, 656092, 990381, 437438, -15018, -4884, 997265, 959431, -499965, -647754, -980967, 917787, -755756, 388319, -892357, 939005, -753560, -670917, 316305, -353853, -671596, -217553, -710164, -274741, 108292, 475548, -908304, -467212, -415048, 920903, -401547, 7895, -210750, -385715, 855156, 441832, -528239, 744946, -675978, -504551, -877597, -126231, -769296, 32352, 346372, -933382, -913994, 177902, 622696, 621104, 451002, 835702, -648548, 575406, 919477, -107114, 300511, -857524, 149475, -420663, 48416, 199094, 749907, -696872, 176513, -413870};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques370(){
        Integer[] array = {-657173, 132769, 288044, -403497, -738187, -190596, -475765, 564018, -807432, -626444, 794492, -857192, 45830, 545984, -29973, -556691, -109536, 355758, -957288, -704281, 826693, -933381, -167716, 48293, -715703, 969128, 719174, 214507, 535969, -456561, 97081, -358319, 211559, -245621, 386727, -502250, -401755, 279852, -864286, 301459, -303209, -965726, 12864, -996017, -29057, -776648, -763650, -958059, -820024, 881939, -96520, 880783, -811566, -50231, -902838, -559706, 317996, -587093, -64954, -583151, 177045, -66805, -462932, -57995, -929619, 499002, 269265, 851504, 967759, 14273, 578016, -926823, -789372, 562087, 790948, 326096, 611862, 101041, -267294, 775884, -924363, -988605, -300724, -527648, -594510, -353803, -748615, -649905, -703879, 785091, 797503, 185090, -393675, -133030, -287692, -810463, -136088, -835734, -330893, -843861};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques371(){
        Integer[] array = {-327956, -482253, 615454, 833775, 586762, 414165, -483610, 356355, 621469, 448622, -296016, 846446, -240143, -510676, 917278, 566018, -97976, -738991, -638420, -738640, 116989, -216773, 486780, -796147, 552017, -159938, -967965, -192186, 279635, 552524, 733095, 647271, 962213, 604452, -379895, 848719, -692296, 61925, 975980, -277848, 80828, 685286, -308684, -976177, -897179, 940831, 179082, -220414, -424615, 24805, -183202, -850925, 216083, 371818, -511, 548533, 43033, -773068, 767369, 22943, 744773, -752440, 347528, 770771, 116081, 834642, 204069, -446490, 510899, -8938, 254185, -159501, 104335, -6884, -216315, 146394, -442663, -584254, -356765, -951522, -637145, 428561, -369432, -652729, -931808, -459656, 44766, -106671, -512180, 172167, -375312, -434490, 411026, 502144, -459002, 610198, 433972, 200127, 151002, -525086};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques372(){
        Integer[] array = {-793942, 75093, -929711, 720481, 295928, 21522, -656804, -920968, -872987, 588240, -314496, 56262, -722461, -508830, -979052, -431389, 670447, 390433, 881465, 485023, -625045, 400349, -864896, 275084, -507390, -586037, 470217, 65539, 13441, 397334, 426258, 532608, 99314, 52288, -205171, 101353, 2389, 956506, -66275, 576951, 598261, 197402, -148567, -980088, 333630, 509748, 146961, 142836, 849627, -387739, -6847, 839078, -69516, 745014, -24710, 839399, -907702, -864593, -25755, 967728, 680836, -24869, -796344, -819854, -87372, 202621, -22907, -942172, -529995, 430159, 335790, -471140, -388235, 877542, -2646, 264744, 783556, 8950, 192915, -621033, -962022, 16238, -600118, 486883, -15085, 587907, 946304, 913876, -586994, -122198, -458938, 431464, -255470, 925608, -149124, 137776, 566191, 197677, -773039, 340329};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques373(){
        Integer[] array = {-440436, -586857, 780187, -929498, 45065, 312595, 931493, 651631, -272329, -446214, 169849, -93010, -679692, 496792, 110697, -977076, 746250, 236442, -398949, 870649, 524446, 741062, -656986, 151695, -607515, 598988, -349423, 851303, 926432, 828990, -608448, 314835, 94431, -347441, -780986, 834059, -308840, 801799, -567633, 448032, 838717, -309012, -464899, 874063, -865557, 148653, 729443, -795638, -268258, 195030, -360177, 315289, -828236, 888245, 566394, 129546, 969709, 588557, 604673, 298754, 366373, -720606, 117390, -708665, 570692, -175730, 444402, 941930, 651563, 482529, -514770, -71786, 479614, -210423, -181941, -965703, -333524, -351835, -25111, 409693, 575113, -641958, 194377, 310059, -552265, 377306, 182799, 629188, 60124, 597361, -546344, 694627, 380295, -17735, 161203, -928092, 889948, 975299, 184639, -607216};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques374(){
        Integer[] array = {-804855, 576074, 26856, -587172, -505626, 948489, -854636, -178930, 860573, -349269, 526419, -479488, -831885, 575166, 274336, -963401, -267344, 345260, 771112, 155127, 636250, 172676, -90925, -68951, 288733, -22957, 822009, 969449, -945598, -21355, 902837, 949664, 902371, -361261, 118819, 959390, -383338, -109328, 132544, 706870, 5875, 932834, 755184, 114950, -563925, 862796, 559198, 268694, 912291, 247751, -721919, -545308, -618896, -575830, 741389, -426414, -832556, -793401, 599119, -641125, -187779, 719165, 345462, -62050, -62487, -431268, 985903, 153571, -262180, -664366, -180085, 903224, -460960, -9965, 141995, 574817, 459423, -710232, 878109, 724935, 142501, -135239, -734995, 689340, -678792, 789889, 974688, 597051, 754310, 63972, 745978, -91183, 926682, 957424, 194774, -757485, 495596, 600504, 610329, -178514};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques375(){
        Integer[] array = {185584, 86067, 754774, -403053, 282102, -684985, 319679, 33712, -389202, 869788, -162719, 766592, 363928, 205521, -215549, -808546, 857126, 925980, -372844, -300841, -250555, -468383, -153098, -82249, -491682, -776765, -852614, -771514, -996486, 998475, 416014, -975653, -530552, 670201, 894344, -179846, 197662, 303797, -643979, -543897, -488468, -591692, 324869, -878733, 210193, -751424, -894939, -98030, 447540, 432130, 597140, 266794, 829339, 437509, -601474, -713393, 119519, 961981, 608286, 930093, 499588, -565948, -701849, -15677, -426476, 189868, -461727, 589635, 122380, 403591, 629578, 737597, 522453, 437667, -972521, 710624, -528933, 650671, -280251, 74, -278034, -569861, -656174, -574270, -759413, 822523, -971142, -956876, 823485, -863435, 566172, -641300, -370994, -499329, 162269, 771182, -478032, 323385, 682731, -977017};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques376(){
        Integer[] array = {-378310, 472347, 766260, -94591, 394930, -657158, -571962, -696015, -630267, -58, 917289, 16521, 287164, 595973, 636357, 897058, -384491, -332605, -626923, 397222, -822926, -367116, -549656, -627306, -248390, 221057, -359729, 27204, -275040, -620096, -233734, -135647, 653229, -320535, 199881, 319976, 79956, 530564, 888994, 784108, 108753, -226975, -390875, -480375, -202113, 531522, -422120, -752143, 704314, -397800, -333749, 904176, 732222, 18296, -280345, -484010, 269511, 853539, 259071, 963153, -747447, -567973, -622197, 634327, -149003, 786040, 559961, 609491, 260540, 148737, 773174, -588934, -568137, -699511, -738110, -230322, 270755, -263623, -916452, 453392, 285381, 532079, -198915, -445460, -818719, 516669, -189385, 91481, -845185, -588240, 34590, -93651, -979185, 206258, -53365, -573650, -7810, 156140, 927756, -154673};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques377(){
        Integer[] array = {509931, 655789, 92435, 68056, 925732, 564123, 962982, -65564, -8112, 588388, -204662, 418806, 474138, -241746, 581123, -496361, -559407, 190481, -554297, 834829, 567687, -975506, -530859, -951582, -286108, 694796, 266513, -877283, -491500, -594544, -342496, 725703, 499877, -323793, 420219, 906867, 154191, -317145, 732119, -384201, -329869, 717385, -279246, -812817, 913219, 328408, -849448, -298086, 62893, -569214, 943028, -167986, -475193, 892519, 941445, -9987, 229225, -464675, -145793, 168560, 809021, 970717, 155768, -998208, -571883, 311693, -417583, 77601, 675343, 553812, 592605, 520346, -542560, 524022, 335457, 122241, 232097, 115579, -592492, 436175, 614640, -422996, -686681, 299968, 395568, -974207, -213800, 950506, 635045, -261106, 673006, -563793, -908965, -321354, 560965, -317849, -952467, 350387, -411395, 146273};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques378(){
        Integer[] array = {196644, -545614, -258809, 332542, 877594, -217796, -624396, -394686, -179719, 955677, -293104, -386201, -466204, 625515, -38444, 348972, 454268, 4011, -888815, 257239, -176757, -776468, -388017, -77407, -67059, -226025, 678695, 442511, 789993, 213338, -102554, 861772, -879252, 651821, 828850, -910948, 375646, 289369, -277536, -171110, 395572, -36102, -589558, -423213, 574037, -225146, -851252, -679936, 592539, -82287, 81344, -913284, -865109, 949911, -826602, -425048, 796282, 200974, 702209, -327016, -491321, 250743, 120500, -770054, -507715, 388726, 130223, -656254, -463785, 224850, -756768, -416948, -840406, -600506, 672849, 4104, -456783, -497429, -725078, 700663, 646761, -778777, -415121, 138613, -356766, -231372, 835012, -71808, -539882, -380778, 844435, -414339, -64442, 109702, -781872, 813460, -724136, -743378, 936555, -846871};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques379(){
        Integer[] array = {965126, -37787, -294242, -979005, -807664, 846333, 247702, 269739, -96051, 215959, -461005, 328405, 275631, 675399, 752460, 174183, -397335, -504229, -793309, 859109, 481942, -435189, 664428, -663480, 102307, 847680, 228956, -154307, -938554, -178065, 227244, 415002, -732966, -902949, 557171, 293355, -227816, -780620, -183373, 779737, -308369, -459143, 57408, 837703, -59980, 12845, 214973, 591006, 603050, -914622, 547284, 988751, 285784, -84748, 699732, -464736, 132685, 91739, 105970, -794511, -973470, 138110, 212310, -767239, 622289, -375903, 118832, -360363, 843089, 378583, -619479, -87240, 300555, -220751, -707887, 23293, -143995, 683636, 271762, 815491, -785633, 900183, 59807, 713804, 302823, -231432, 689942, 630152, -41494, 705061, -719009, 822433, 547439, 810045, -21283, 153013, -198324, 769816, -36104, -631878};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques380(){
        Integer[] array = {-96601, -425511, -393026, 772089, 797794, -33811, -196222, 152679, -105965, -609882, -504239, 751679, -551412, 506921, -795869, -657318, 490053, -413597, -253168, -276095, 602373, -750814, 360289, 560361, 824355, 818028, 795447, -394444, -225122, -88616, 614709, 540860, 313486, -380965, 464467, 415018, -26312, -162976, -701713, -266207, -599164, 834578, 697464, 721763, -452008, 690129, 371167, -58914, -661458, -387556, 473597, -71895, -532418, -449971, -488992, 90569, -289380, 970762, 10699, 119776, 805839, -584196, 260451, 397458, 11574, -312459, -764029, 916476, -103495, -286402, -997198, 924015, -267234, -707221, -302558, -580806, -674198, -86836, 61599, -322979, 101220, -216241, 780197, -718733, -306054, 468085, 746159, 867779, 574745, -220168, -725443, -779868, -372968, -704067, 380735, 116207, 788420, -245542, -894955, 349968};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques381(){
        Integer[] array = {263186, -478458, -354852, 90525, 155176, -997617, -357406, -508013, 434478, 301824, 155169, 193912, -404070, 686437, 51520, -417855, -381241, -530163, -41979, 4680, -892960, 944278, -431242, -937785, -61446, -969856, 901666, 130480, -604521, 269413, -464933, -657580, -783336, -761225, 924282, -472991, 613912, -913457, 857292, 819331, -541576, -273204, 152655, 108293, -378097, 145982, -94673, -755953, -761972, -346468, -373420, -2871, 394607, 888136, 414587, 198584, 826976, -890962, -512238, -341721, -792601, -962374, 551431, 728117, 528783, 382314, 58778, 47486, 187405, 833741, 843464, -420830, -461033, 258192, -385098, -158220, -659520, 69317, -433429, 754670, -703304, 565022, 739546, -388491, -677600, -292227, 308288, -326622, -584562, 492303, 616255, -75347, -671453, -793008, 257093, -992953, -763921, -790581, -670451, 446836};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques382(){
        Integer[] array = {419244, -116491, -572034, 137822, -673064, -158065, -224873, 854095, 442433, -184939, 526001, -953921, -410586, -271201, 862043, 438964, 527062, -959412, -90427, 817599, -795998, -396789, 549837, -832239, -996581, 252332, -625972, -307983, -193064, 615298, 302603, 918686, -249411, 792587, 30188, -45917, 340270, 699886, 192319, -464801, -420599, 570628, 29034, -563094, 691658, -484780, 515582, 134597, 703017, 820731, 955616, 700086, 762223, -71232, 190604, -447316, -895219, 682217, 469704, 11450, 185509, -44864, 562286, 270338, 519396, 90977, 691811, -93720, -439582, -874867, -545592, -382373, 339884, 332446, 629190, -786072, 710226, -465999, 389334, -334892, 466392, 68047, -300857, 164075, 905563, 195433, -82972, 861995, -484714, -25893, 423545, 425488, -397707, -384249, 820964, 526872, 621735, 248812, 686612, 488061};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques383(){
        Integer[] array = {-928160, 371497, -652075, -42319, 876829, -723045, -181742, 279015, 59784, -569358, -995547, -84142, -701842, -303636, -253294, -429715, -131249, 85807, -714750, 607378, -342784, -324555, 360145, -24254, 288568, 588480, -647602, -875043, -585354, -86600, 844595, -898007, -364709, -807195, -417606, 930677, 11868, -40779, -439473, -870204, 677875, -444547, -619201, -670374, -892437, -237224, -220113, -120095, -831205, 969952, -24051, -92938, 5369, -800076, 735623, -335165, 855908, -135921, -159475, 738283, 426375, 291994, 856165, 444721, 86072, 242111, 444808, -828233, 577074, -681596, 78171, -271041, 78795, 427842, 405009, 729590, -529735, -117777, 543734, -210395, -56141, 412132, -183623, 168812, 994834, -103662, 565329, -180758, 803667, -111979, 927195, 776906, 23668, -471498, -728075, 798469, 541145, 483147, 742637, 145314};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques384(){
        Integer[] array = {943379, 976527, 204968, -178240, 4683, -564416, 605042, -149042, -926487, 85338, 92825, 108919, 279050, -817311, -878742, 38505, -382800, -386704, -182143, -102750, 72345, -352522, -121052, 316348, -748973, 440937, -273931, 253028, 524420, 911442, -143443, 487535, -766472, 647137, -246045, 612462, 455952, -598866, -184184, 529986, 624549, -641610, 641382, 426311, 757588, 181180, 989823, -549401, 241420, -39268, -784565, 936335, 367597, 826653, 28960, -725600, -439703, -460429, -792445, 682396, 726769, 604171, -171007, -848729, 161106, 601342, 138456, 82318, -981564, -552876, 724289, -957067, -935919, -647061, -875626, 488720, 380434, -14844, -148396, -928870, 944475, -724801, 991333, 965433, -211777, 269172, 976660, 286888, -411652, 447100, 32839, -545641, -526511, 106882, -283487, -489371, 754009, 399036, 881389, -79715};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques385(){
        Integer[] array = {-791022, -751056, 683382, -25704, 357875, 903372, -157041, 580598, -223295, 753138, -19200, 76502, 214012, -16596, 681494, 127467, -997144, -165719, 215742, -120198, 91322, -679669, 402267, -854772, 446862, -917600, 592949, 575401, 301444, 210617, -740017, 253865, -578053, 549299, 54518, -527689, 5752, -992504, 986838, -11182, 134717, 968825, -297566, -857897, -954220, 648161, -235888, -342646, -586631, 623650, 983657, -700835, -558427, -329872, -354274, 45549, 355654, 10781, -316925, 159154, -77324, -889938, -225770, -49663, -481544, -43322, 497515, 686522, 283573, -104720, -773268, -435557, -916898, 512552, -195533, 201492, 607395, 886545, 329395, 107165, -392094, 375520, 934278, 809054, -387234, -342901, -263106, -449408, -449952, -230453, -85968, -165145, 883905, -834862, -576892, 438403, -987725, 595318, 359154, 875570};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques386(){
        Integer[] array = {654334, -71489, 984120, 675861, 429344, 58708, 421945, 375138, 789772, -910456, -676394, -296851, 756483, 401729, -685077, -459837, -551565, 249084, 675855, 727030, 831913, -573059, -932131, 264009, -296899, -529343, 825544, 241280, -299478, -784114, -363202, 729696, 385036, 573528, 239460, -467842, -354750, -130668, -544202, -529254, -846332, 994552, 868262, 715356, 139756, -531981, -308503, -678069, -478122, -770650, -966828, -83504, 445295, -609020, -490854, -698627, 402078, 836289, 768842, -496770, -571682, -824175, 11532, -550044, -781336, 284903, -483177, 678782, 582246, 271271, 914616, -773307, -842810, -995584, 85453, 155180, -918964, -327629, 721328, 434485, -281024, 407039, -798041, 631647, 750146, -36064, 584055, 208078, -90330, 395476, 169274, 252648, 442410, -940474, -985028, 169523, -310246, -648475, 749475, 966758};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques387(){
        Integer[] array = {-436252, -534457, -177762, 524891, -710484, 875280, 187407, 510521, -162279, 91011, 932204, 480973, -22975, 580948, 716881, -346628, 202559, -442698, -107253, -333795, 699324, -136031, 506393, -906891, 360154, -726089, -459240, 845087, -845736, -748435, -320651, -870760, 909968, -862867, -44681, 899755, 576233, -692177, 936120, -145808, -393833, -88168, 892972, -128726, -140814, -903912, 677713, -381863, 587242, 907183, 762424, 633076, 530397, 979802, 179743, -588099, -497422, -408087, -809793, -343395, -278892, -64746, -271940, 557620, 746662, 346531, 724915, -241396, 400846, -632897, -483377, 691336, -893500, -240735, 460427, 536096, 548243, -804235, 907145, 556025, 561382, -839497, -776170, -689660, -761595, -478392, 478074, -870745, 441707, 513923, -718907, -159228, 917248, 243004, 520915, 906492, 80751, 406700, 947278, 352814};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques388(){
        Integer[] array = {-359477, -795684, 785035, 814187, 507420, -728643, 850915, -970781, -868482, -930142, -368883, -147603, 759550, 344573, -123955, -977569, 727774, 772537, -388115, -429975, 358083, 915638, 623226, 588166, 566942, 579194, -330572, 47749, 644400, -100641, 430990, -64048, -313852, 182746, 932585, -666803, -418946, -832440, 302439, -35006, 296924, 903607, -841197, -208445, -541621, 739407, 790222, -962688, -463031, 80644, -797171, 977888, 829877, -83915, 614021, -717157, 389374, 89295, 127135, 292226, -326705, 932599, 833125, 777359, 268170, -6623, -798754, 406409, -263423, 199033, -802688, 399408, 440966, 653727, 330746, -379430, -73183, -245988, 591439, -772762, -789918, 811801, -778792, 699985, 541550, -641207, 378047, -240670, 518414, -131166, 510979, 273075, 190940, 349846, -953999, 542743, 110031, -649019, -57624, -461987};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques389(){
        Integer[] array = {718697, -589298, 106736, 875242, 747479, -111147, -913465, 792164, 314627, 894241, 939140, -475889, 526251, -598163, -826227, -928391, -60208, 584392, 366658, 782227, 997365, -684560, 534654, -171047, -966080, 437977, 970744, -376281, -958111, -973546, -429879, 434701, 51569, -677134, 407353, -46738, 302453, -29033, 561154, 926537, 833721, 240375, 739394, 870474, -12625, 95455, -719786, 662554, 553174, -889218, -58693, 411401, -927022, -697763, -844580, -845855, -736018, -646229, -630013, 228360, 820413, 15116, 918840, -758653, 458135, 753354, 586233, -929333, 686208, 732640, 710514, 490315, -103078, 511833, -700547, -388303, 165329, 962879, -515865, -550800, -911254, -210826, 552890, -397116, -721360, 442739, -84340, -687428, -940209, -988609, 526892, 179562, 531506, 302707, 635657, 227626, 501769, 174981, 301317, -727083};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques390(){
        Integer[] array = {393112, 935129, 87654, -449812, -170226, 508535, -516083, -385900, -218441, 221659, -295672, -282583, 752953, -733474, -285411, 732308, 945507, -342097, -165687, -373400, 806509, 830534, -87372, 83908, 354949, 673186, 177803, 127295, -510992, -897716, -34233, 368376, -660371, -445024, -798293, 664470, -623309, -242203, -356324, 804809, -792944, 51206, 605981, 628793, -337497, -443836, 701708, -703140, 421079, -971860, -939870, -657851, 465358, 715299, -44161, -392372, -934158, -662096, -452161, -128042, -706200, 881546, 468600, 651208, -153573, 742372, 144695, 976209, -170549, -889139, -108420, 139201, 902625, 138658, -713123, -640624, -941544, 959418, 478937, -531800, 749316, 801129, -617259, 144000, -696830, -971458, 862043, -737018, -507700, 333021, -452335, 510691, -143694, -174993, -358069, 351975, 404994, -893474, 154456, -401711};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques391(){
        Integer[] array = {-924952, 456601, 857758, -928881, -746963, 738074, 44015, -221386, -985245, 437652, -376810, 479458, 863844, 544831, -448800, 681100, -299977, -537037, 709255, -667953, -707221, 74471, 481523, -102569, -117943, -882880, 781311, 378867, 724284, -372117, 164889, -886125, 412763, -688033, 964504, -457769, 484215, -795235, -541558, 299021, -385101, -984947, -712651, -750772, 670465, -398075, 230493, 39653, -618629, 417825, 696503, -176422, -216600, -51892, -896922, -47648, -4155, 641181, 447578, -895698, -187518, 481932, -127831, -82686, 794109, 877344, -58532, 391645, 379615, 524491, 976701, -991485, -848047, -672062, 309514, -274834, -921881, -652174, -725231, 613111, -298431, -216053, 395811, 207856, 865652, -881202, -436279, 992181, -178963, 871605, 417525, 454867, -619671, 457166, 543313, -504937, 530520, 858859, 880386, 389119};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques392(){
        Integer[] array = {779206, -639808, 934754, 176518, 466000, 205015, -610812, 460145, 803368, -313433, 353555, -660274, -817969, 731026, 773147, -470565, -952069, 655556, 41384, 463030, -312898, 76967, 937978, 695678, 523470, -132842, 38408, 935181, 704999, -997458, -218005, -676194, 788666, -962839, -452043, 736804, -887637, -430869, 517064, 221547, -620342, -97060, -949513, 719675, -603327, -423685, -831104, -22382, 94849, 195760, 837673, -503716, 401191, 26957, 787487, 691039, -414892, 599200, 424967, -77193, 955149, -940954, -165217, -469695, -59733, 269885, 126400, -429410, 846158, -216540, -412746, 395606, 657601, 639901, 117705, 681514, -248119, -885228, 48712, -244178, -366391, -807647, 662137, -454710, 587297, -78622, -247411, 338924, 58361, -806724, -445809, 19892, -275923, 624046, -794564, -953141, -814107, -267832, 964669, -993869};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques393(){
        Integer[] array = {-844726, 371840, -669296, 392481, 510060, 380823, -714695, -417419, -454179, -200132, -380709, -873150, -494814, -65525, -901137, -175256, 993605, -625033, 699969, 895784, 988768, 830728, -345463, 231181, -601767, 303662, 478579, 177356, 265258, 723750, 207672, 725452, -883778, 551770, -737547, 992218, -453533, 189675, 867201, -296080, 714674, -568498, 418104, 747766, -555772, -401185, -853951, 443550, -443364, 64552, 329442, -234615, -926313, -282933, 910316, 427202, 787324, 822362, -595905, -969375, 431667, -588389, 598521, 397718, 804400, -433804, 946763, -441404, -885011, 687662, -466680, -913453, -338990, 121476, -925241, 933425, 585252, 1345, -573382, -145825, -949151, 934022, 709730, -573429, -36042, 722682, -201978, 770168, -684803, -577835, -518218, 383132, 836974, 313840, 666592, 109334, -830884, -737042, -37582, 771940};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques394(){
        Integer[] array = {-618911, -506747, -618983, 933733, -897995, -185120, 140568, 133370, 135212, 403957, -4607, 983046, 791781, -644964, 492030, 401615, 259191, 876244, 131227, 607512, -531325, -993267, 144096, 258786, 973364, -296236, -636070, -110029, -681581, 423655, -876515, 578704, 997528, 875097, 357041, 9774, -134401, -831599, 988577, 992442, -369816, 290680, 27376, -831457, -633970, -509324, 752866, 172412, -2844, -513718, 856798, 422494, -866175, -921894, -91990, 830509, -845752, 819770, 846632, -571665, 600139, -252410, 208470, 872136, 695528, 280905, 947239, 241625, -142073, -496726, 928214, 148684, -953990, 130266, -190965, -143447, -604905, 250989, -877468, -173811, 666212, 518525, -828821, -501934, -503433, 301680, 743554, 327696, -459497, 441160, -114451, -802312, -368751, 609771, -727071, 340764, 933006, 938389, -368694, -505359};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques395(){
        Integer[] array = {-425335, 953794, 85194, -535163, -222518, 812208, -168731, -709781, -538347, 14058, 134157, -814387, -824820, 821450, 195388, 960366, -220919, -926308, 329889, 660252, 327910, -211452, 98943, -904363, 401654, 587953, -383173, -515888, 468611, -756854, -273166, -66527, 474099, 425577, 929887, 461082, -435417, -11904, 810683, -886697, -412914, 760984, -725720, -843543, -181303, -190669, -387150, -48637, -638337, -748863, -387236, -467758, -620427, 151432, 120379, -78293, -301618, 562761, 775595, 847679, 29185, -950103, -111351, -906250, 192689, 649969, 345593, -414711, -451947, 207147, -649256, -257061, 11721, -182427, -290061, -438762, 295295, -896399, 949014, -907289, 105883, 798943, -738540, -869279, -219098, -677922, -488583, -910828, -547417, 611302, 741316, 932955, -548448, 457725, -335021, -497763, 602432, -934770, 701618, -871312};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques396(){
        Integer[] array = {-964733, 487766, -88362, 320429, 618019, -684418, 239315, -916403, -68161, -106840, -115147, -228855, -162119, 342703, 138094, 938620, 714669, 219631, -439615, -902528, -432814, 477084, 898058, -856273, -982014, -140825, 940593, 312612, -343574, 980089, -899640, 291928, 726138, 692718, 146482, -4975, 345786, -609012, 312360, 774190, -414326, -248398, -530109, 786859, 649740, -26623, -877314, 989373, 403588, 309501, -50468, 247858, -128625, -65700, 907574, -891596, -300345, -347062, 617961, 799291, 792898, 741450, -50393, -515546, 886662, -468281, 275143, -962453, -654753, -629833, -859232, 707163, 767241, -875075, 219682, 824973, 79637, -143657, -941530, -338983, 241534, 558381, -977424, -895799, 383166, -423904, 548396, 558897, 713710, 127852, 982270, -332260, 167323, 896207, 490440, -980946, 524230, 505460, 769901, -308349};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques397(){
        Integer[] array = {277125, 620149, 176647, 510360, -26489, -711932, -972602, 559270, 735757, -856521, 163531, 523039, 804819, -660999, -372437, 880038, 673851, 792056, 704768, -689451, 44606, -58781, 75266, -85037, 113130, 761460, 13817, 684594, 72186, -435954, 438428, -113224, 760442, -40000, -318297, 152433, 882014, -991516, 348294, 317585, -75895, 904706, -635622, -103355, 151341, -475612, -952147, 653822, 693804, 959456, -659432, -812946, 110035, 959228, -782207, 329867, -214192, 478401, -286978, -206049, 353981, -766423, 738959, -586528, 881421, -503785, 639020, -572875, 828659, 678693, -264363, 934030, -963848, -624191, 701052, -127842, 308932, 112583, 468588, -657417, 633066, 54267, 701025, 775703, -856498, -669414, -397031, -135733, 205391, -784828, 557285, 150921, 983575, -508118, 288340, -739125, 405488, 425776, -682788, 280760};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques398(){
        Integer[] array = {-747695, 663383, -348544, 475981, 751031, -498536, 491879, -617512, 165928, 29344, 298231, 250474, 970798, -603475, -449551, 734131, 769000, 992008, 471069, -283169, 107986, 409468, -675570, 883931, 848810, -399575, 477223, 505750, 711044, 288944, 407355, 960351, 770257, 669825, 542949, 343513, -205185, -595747, -741831, -447074, -359600, 571369, -185809, -251905, -24447, -377107, 437693, 836569, -786579, -281810, 456744, 127251, -564374, -484610, -169064, 5659, 895798, -249732, -264155, -578509, -139432, 285614, -340401, -955226, 515918, 910247, -633640, -242238, -990209, -194630, 719124, -978513, 202575, 858239, 739293, 612937, -148926, 301974, -688099, 124364, 641818, -165319, -893530, -378721, 723716, -98671, -773155, -514527, -589910, -592705, -249020, 72165, -188654, -556393, -632111, -998679, -468571, -361885, -109034, -130362};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques399(){
        Integer[] array = {-912103, -234608, -632496, 857192, 501205, 749056, -692924, 266147, 500745, 565923, 640023, 998682, 290093, 435115, -961519, -934806, -412304, -174648, 936453, 874252, 627937, 646188, -175460, -297228, 686398, 940043, 744896, 154663, -75985, 764260, -155277, -759012, -507657, -370134, -701864, -860348, -923847, 226086, -497314, 755685, 235766, -130122, -103581, -272631, -606842, 733071, -913071, -18334, -845734, -914810, 365683, 883634, -863498, -555882, -190248, 901968, -425980, -370258, -791566, -202668, 909222, -778406, 485042, -326287, 610489, 958327, 590361, -465330, -974840, 305497, -69105, 863138, 787348, -145302, 955633, 328689, 500635, -885639, -43191, 983597, 297264, -253858, -422009, -217934, -168217, -155973, 708451, -774248, -670285, -730361, 890114, -632684, 486136, -896122, -15788, -652689, 952676, -479207, -438111, -80422};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques400(){
        Integer[] array = {414556, -409412, 248269, 475791, 781984, 172451, 543283, 984319, -763313, 50929, -846691, 313798, 425144, -635957, 367619, 79885, -864411, 233387, 402766, -576247, 134612, 663429, 263948, 169720, -512668, -691738, -648239, -454752, -664154, -261236, -750040, -554164, 962001, -678969, 972242, -693367, 799708, -508344, 310545, 437203, 493748, 490208, -750759, 213102, -142585, -454515, -107721, 969884, 53233, 372565, -31725, 33232, 619119, 157736, -964215, -861374, 290555, 629012, 98706, -60692, -220165, 422887, 533366, -816205, 863752, -622108, -279113, -999302, 889767, 302847, 933809, -224565, -59146, -864200, -770653, -908465, -738034, -655041, -792764, -365737, -986569, 732159, -942118, 411676, -941465, -558534, -762432, 391669, 781545, 145200, 779270, 603565, 362176, 659623, 810666, -856731, -179087, 479570, 511161, 197846};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques401(){
        Integer[] array = {412904, -261402, -495970, 137507, 116215, -132526, 123127, -710272, -775855, -321532, 96199, 206519, 960649, -681701, -77956, 627644, -47811, -213232, 600220, -78472, -519019, 963248, -147953, 879757, 607626, 810137, 985721, -634936, -287340, 50458, -87676, 194939, -549341, 140828, -611276, -920034, 740066, -900841, -844898, -867547, -702392, -80788, -824326, -183967, -657220, 984627, -141650, 444724, 348528, -245098, 472187, -162602, 955546, 846477, 117064, -734179, -583598, -71217, -120132, -60827, -426124, 40613, -371186, -585782, 935448, 377544, -602799, 446663, -364252, -91354, 674167, -652564, 978308, 181341, -854333, -876173, -334198, 357349, -583237, 549662, 361462, 175616, -833442, -435797, -991441, 116707, -683942, 323950, -729939, 281386, -621470, -886959, -977808, -50518, -326940, -119545, -309378, -883407, -649176, 667939};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques402(){
        Integer[] array = {-384102, -823894, 330151, -770610, 859415, 219992, -284174, -782737, -257772, 955478, 944359, 433039, -479833, -636641, 344916, 704454, 329285, -943534, -42494, 965146, -315937, -522950, 335846, -392541, -868623, 788005, -389020, -998759, 181725, 318351, 720437, -455462, -350953, 531645, 549809, -130524, 840370, -629460, 493328, -960109, -933686, 552164, 468047, 224477, 565971, 713586, 150273, -344017, -688157, 958489, 257835, -644369, 250225, 410578, 517485, 351760, -849465, -485627, -338380, -327677, 882415, -599979, -563283, -268011, 428011, -169322, -638651, 618426, 300749, 531571, -903453, 797664, 957349, 676830, 893170, -645094, -503430, 446101, -951538, -425108, 459207, -934019, -416783, -687239, 232395, 374102, 71416, -925007, -165168, 876604, 475642, -367842, -266966, -79167, -20270, -617393, 859164, 238009, 863100, -378020};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques403(){
        Integer[] array = {-639247, -131797, -868164, 541449, -134750, 45175, -735323, -16939, 897093, 913854, -28694, -203800, -426562, -64919, -503179, -980700, 810364, 166072, -33121, -213677, 288137, -791561, -971653, -857324, -400977, -527285, 17899, -657839, 201279, 992876, 972821, 65560, 789768, -915545, 331178, -818426, -726874, 260330, -74432, 454852, 385594, 564394, 721640, -860857, -4698, 88922, 480177, 146708, 923483, -423311, 796660, 717365, 705401, -199864, 871368, -25861, -926067, 707777, -830288, 793879, -636534, -629011, -362543, -469345, -219445, 505450, -744382, -757639, -318309, -552780, 361574, -133885, 371528, -438382, -836713, -479055, 147861, 654603, 304106, 419488, 373942, 772745, -722074, -19627, 129218, -929093, -651211, -60840, -245234, -468527, -43222, -46798, 853725, -564046, -415630, 507565, -882876, 979288, 814388, -282934};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques404(){
        Integer[] array = {971737, -88851, 60809, -409960, 131544, 97798, -8736, -232631, 496002, -557746, -991135, -872885, -533265, 765458, 493449, -442041, 941687, 92081, 970443, 552778, 282910, -88899, -514537, 163275, 660496, -522012, 311774, -558000, 846274, 955007, 581447, 777568, 47404, -134081, -997769, 735641, -352501, 376345, 430306, -667187, -213127, -663670, -502831, -758988, 771933, -847470, -481558, -854145, -176909, 10747, 460352, -414349, -896997, -925978, -290460, 183281, -7306, -544118, 770981, -554376, 445017, -320940, -783043, -861024, -381948, -326269, 536192, -636755, 664894, 160013, 235601, -163235, 820538, 26642, -784017, 514342, -967259, 528094, 896331, 8208, 96453, 827865, 310483, -902328, -497392, 330702, -917795, 707263, -949458, 652505, -15979, 9758, -191267, -481580, 341450, 821866, -982881, -532190, -677457, 13644};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques405(){
        Integer[] array = {690253, 899679, 56931, 124211, -441797, -311430, 435700, -819253, -411988, -896825, 546226, -591178, -332785, 641132, -558451, -697858, -111142, -801751, -461273, 347985, 851230, -581562, -304000, -685221, 243752, -424210, -546408, 447376, -318511, 329731, -96011, -431094, -934801, -782444, 458111, 961264, 359468, 120761, -832453, -741813, 957293, -248035, 952335, 131622, -154750, 731512, 907878, 456532, -149912, 649690, 154288, -821769, -873488, -392203, 723150, 767994, -846018, -134232, 416991, 747501, 659199, -6924, 759816, -553809, 311684, -199652, -156221, -363741, -83961, -603065, -553690, 241068, -294417, -458937, 991650, 656171, -75862, -549008, -971163, 534502, -1695, 124243, -361175, -784913, -822901, 584103, 345528, -292925, -649419, 561689, -263199, 923656, -23449, -425083, 717350, -662526, 691989, -86778, 226392, -483819};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques406(){
        Integer[] array = {-550321, 554964, 132838, -219994, -538815, -545875, 942770, 503124, -281780, -815883, 96441, 430061, -391284, 630961, 809223, 374226, 890388, 755759, -578764, -45131, -85785, 166692, 16517, -956875, 637440, -981018, 556509, -38956, 343173, -488340, -487701, -216566, 667235, -827770, -955857, 872312, -723289, -384585, -32203, 101995, -317846, 151218, -924754, -977722, -269389, -96826, 191326, -783128, -30886, -695575, 117008, -499514, 581921, -790496, 573527, 418538, 83221, 531110, 242473, 849254, -821700, -324616, -938032, 294263, -137405, -35056, -160892, 743264, 503289, 186486, 579089, 987619, -383710, 982686, 130586, 151030, -495243, -587102, 352942, 579931, -896332, 339993, -788492, 420195, -147454, 118837, -297094, -363658, 214427, 309786, 934021, 325281, 282145, 956034, -592340, 412240, -755515, 680116, 951177, -61557};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques407(){
        Integer[] array = {194790, 313823, 516203, 124575, 352998, 644850, 966472, -337662, -263973, -445417, 255208, -438395, -177709, -731523, -803512, 501490, -980136, 194945, -138369, -118552, 6614, -461994, -925104, 594419, -755810, 40133, -74182, -301247, -361530, -477265, 494531, -638198, -624292, -761293, -315972, 253570, -949639, 141066, -460055, -663690, 462364, -796911, 737729, 706643, -645962, -468371, -624592, 586181, 216212, 256058, 282836, -182022, -266428, 603445, 163288, -509957, 19453, -744955, -624674, 52125, -146036, -983781, 867908, 612469, 584890, -340194, -859094, -25149, 700262, -537199, -719210, -584504, -848760, -671957, 818143, 249663, -887571, 474962, 874926, 74939, 14099, 567385, 578375, 328834, 899103, -239871, -634915, -390918, 578359, -989884, 402014, -535463, 841762, -307375, 5939, -144188, -33227, -796696, -577661, 615546};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques408(){
        Integer[] array = {-485336, -532454, -237912, -196620, -513250, -751510, 236941, 95286, -752319, 737040, -813612, 730624, -127977, 316066, -122010, -804853, 815303, -656075, 722092, -88589, -685036, 956393, 174571, 132611, 394616, -580721, 665233, 471658, 48777, 263357, -958047, -903716, 477580, -81033, 721137, 460123, -384724, -430481, -305521, -521481, 723354, 788229, 842014, -960216, 483660, 408603, 261160, -694024, 369124, -307716, -936316, 959488, -470619, -128817, -406136, -101543, 11762, 161874, 763774, 603958, 576273, 713382, -392131, -598860, -405723, -264724, 257473, -282094, 567158, -32438, 942755, 518284, 302159, -939848, -535519, 730905, -392876, -363806, 529633, 150543, 758051, -633182, -517012, -525484, 223737, -75698, 911153, 115702, -111854, 717441, -956587, -201373, -361834, -298362, 166624, 365430, -559294, 91178, -230671, 135290};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques409(){
        Integer[] array = {-921757, 41360, -346170, 585978, 239097, -976, -761402, -474576, 245082, 693741, -160621, 284345, -155524, 948986, -318224, -82863, 865238, -633224, 55268, -35536, -810209, 761176, -302288, -493360, 144098, 745724, 679077, 193979, -89568, -893289, -542730, 395711, -636701, -283649, -239144, -84364, -777461, -591113, 804868, -239192, -77063, 8820, -247383, -347878, 834674, -184096, -159568, 874541, -42780, -904935, -382311, 318377, 805171, 304506, 451227, -424280, -787709, 962101, -568297, 413560, -463250, -172782, 517544, -223436, -780551, 86939, 189114, -349549, 327914, -515986, -876903, 516084, -886739, -34146, 457473, 477622, -56608, 884991, -858153, 836391, -239162, 919770, -390480, 410550, 771088, 807014, 304166, 401058, 848736, -493696, 109228, -260894, -25957, -942428, 188035, -959321, -58374, 612720, -879514, 281849};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques410(){
        Integer[] array = {-184797, 451204, -184632, -567848, 402186, 515075, -992143, 484418, 214446, -50668, -267147, -719464, 609487, -657446, 806317, -278056, 382090, -784386, -868308, -159710, -794059, -892062, 601364, -944690, 554685, -303938, -49378, 371853, -319325, -831325, 609295, -506607, 917879, -301504, 825659, 329644, -285114, -160060, -521841, 447979, 184284, 944852, -636600, 177414, -459596, 156206, 486267, -132566, 172871, 176996, 515224, -378358, -460265, -824130, 977049, -122600, -819928, -60080, 491288, -13814, -292643, -130223, 894542, -101230, 949184, -591650, 436492, -658893, -778150, -634978, 92264, -406965, -818234, 79617, -224541, -299854, 124958, 841904, 87532, 733791, -782814, -521782, 313252, 382340, 696889, 615339, 693413, 663942, -910005, -399240, 397448, -703030, -619713, -762423, 349318, -346147, -689970, 666313, 705955, -940877};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques411(){
        Integer[] array = {-893306, 132935, 881821, 579884, -944464, 664215, -12390, -551185, -661128, 110560, 894756, 963692, 404908, -934557, -379653, 971463, 555298, -710242, 941125, 368339, 83230, 783412, 366453, -170096, -724940, -210199, -255434, -422942, -296431, -761247, -360682, 381333, 174132, -119971, -156389, -270322, 209560, 642309, 778917, 425506, 225632, -411519, -132317, 25267, -593923, 481025, -674759, 297255, 349624, 459491, -514576, 570856, -183007, 805439, -605008, -81836, -993785, -972785, 657500, -448535, -582399, 812324, -346882, 852916, -559482, 121550, -256115, -853274, 334728, 93994, -462381, -70285, 528141, 109497, 671744, -803255, -181853, -139682, 175783, 483114, 512818, -212869, -730165, -33930, -835240, 776528, 120384, 428331, -697429, 795219, -969864, -625058, 769442, 761534, -696457, -121755, -911594, -692112, -945673, -635576};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques412(){
        Integer[] array = {-171812, -789798, 665673, 895044, -554963, -622805, 844036, -930078, -481768, -863789, 99054, -174084, -106960, -510403, 800280, 724532, 443489, -169770, -843761, 664309, -158795, -387527, -739387, 332243, 457539, 57929, -774769, -121737, 454146, -87256, 304003, -991313, 965741, -638675, -183541, 625923, 844274, -858854, 815460, -968708, -545274, -251136, -639645, 896861, 62913, 956670, -103691, -15973, 644771, -645301, 715514, -698763, -314499, -304730, 785000, -994944, -357732, 445021, -813564, -866010, 748303, -604638, -467899, 471319, -78114, 473440, 447095, -283410, -334733, -99898, 234788, -7660, 876414, 452072, -830368, -834150, -599253, -753027, -130140, 145389, -886094, -561064, -608727, 892135, 682462, 714579, 888120, -964795, -108000, -79843, 845671, -188410, 650787, -563272, -203198, -668645, -977447, 40937, 303853, -344112};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques413(){
        Integer[] array = {744383, 884150, -562479, 350007, 625578, 779299, -707661, 859430, 713868, -771487, -328899, 855004, 429521, -395739, 945236, -267720, 225718, -460135, 884342, 220727, 912820, -702418, -214429, -999499, 991229, 357522, 977027, 388761, 889491, -752881, 49542, 768333, -692550, 923259, -933820, 42353, -800483, 627216, 992552, 628815, -393337, -346665, 650615, -517497, 623994, -99017, -96914, -980227, -547382, -664318, -366522, -766944, 888396, -735304, -839799, 384707, -367488, 689413, 61046, 974851, -588027, -1629, 338649, 794874, -710412, 999949, -171822, -326343, 719347, -632786, 160748, 994797, -280864, -127773, 385450, 20259, 59377, -904922, -133972, 756140, 155523, 220423, -442737, 894679, -757520, -985736, -217171, 41888, -344195, -365164, 987566, 953422, -570512, -608927, 460666, -23556, 334645, 401817, -482801, -245639};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques414(){
        Integer[] array = {-491023, -660479, 288542, -146756, -416991, -211413, -480909, 813119, -662396, -37845, 617994, -489170, 603093, -213188, 663323, -370660, 584369, -368335, 819191, 54530, -438380, 372711, -285522, -833963, 3579, -866900, 816518, 769189, -183157, -664285, -494710, 229428, -381221, -630154, 94210, 36707, 37898, -933085, -278410, -879810, 816637, 163483, 278557, -430630, -12331, -657432, 952619, 183777, -874189, 197868, -729060, -434031, 908804, -532046, 84988, -308037, 332098, -943129, -748302, 408739, -737707, 222303, -569645, -832990, 904146, 232034, 291699, 449392, -890986, -805173, -517037, -546445, -707510, 339560, -258498, 827551, -252357, 998182, -233469, 362485, 221179, 21711, 94576, -385288, -996704, -373231, -859595, 159867, 351929, 991003, -841934, 253656, 917905, -50403, -470091, 90846, 605561, -256393, -335736, -503133};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques415(){
        Integer[] array = {904305, -407283, -719379, 831180, 406476, -846625, -476372, 405677, 799232, -477539, 44243, -294354, 361884, 490803, 621731, -695438, -793748, 237789, 495555, -307100, 27013, 286911, -498773, -83888, 545611, -742477, -333368, 384156, 586926, 541923, -301569, 660381, 879380, 130499, -964085, 956738, -867464, 907834, -752214, -707875, -103713, -159086, 116201, -455540, 204090, 557446, -446825, 381058, 390573, 909902, -523252, 663620, -155429, 183115, 541258, 813096, -437873, 908854, 577320, -75470, 14995, -673164, 201448, 695377, 388967, -128950, 431478, -102148, 939123, 535954, 226708, 697182, 374546, -72348, 591244, 662499, 794903, 651696, 741795, -475776, 475289, -871294, 893228, -371876, 409914, 832488, -708671, 794595, -721807, 314192, -608981, 763135, 412606, -318331, 190336, -444787, 557652, -628379, 582156, -850075};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques416(){
        Integer[] array = {-863556, 311105, 251641, -709202, 821886, 438023, 220627, -341328, 542224, 479853, 35598, 890471, 144387, -85948, -199342, -495336, -814171, 438015, -453799, -904757, 262962, -673243, 63606, 539828, -700762, 517663, 285489, 688751, 894134, 907778, -647043, -482905, -333537, 702969, 970871, 294651, 914876, -269376, -582383, -668225, 96860, 965080, -469532, 878252, -462851, -54131, -201041, 695511, 457092, 930440, 676101, -821558, 154689, 338977, -657393, 440004, -448177, 968064, -177825, 28907, -222113, 894903, 777047, -667415, -196921, -392658, 12093, 882132, 6033, -315325, 292151, -442731, -435035, -834985, -472756, 967038, 567667, -865141, -908959, -303431, -52893, 27301, -336046, 657402, 626632, 592304, 467458, -37157, -205017, 253542, -495612, -540853, 915893, 423100, 263558, -694958, -364458, 908041, -691299, 978360};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques417(){
        Integer[] array = {287365, 234510, 416812, -3056, -26322, 503549, -838809, -315663, -636310, 826113, 673353, 972837, -49312, -760325, -45876, -289346, -56797, 201430, 74299, -31115, 368043, 441621, -576675, 909569, -658490, -984111, -150133, -357225, -130884, 285527, 379504, -746864, 343009, 600515, -626117, -528288, -885456, -132308, -95791, 418835, 843829, 800736, -59469, 869212, 944254, 845887, 518808, -977528, 315520, 811117, -446935, 768775, -301307, 829720, 786036, 62622, -49039, 64545, 541214, 439017, 229220, 392857, 636828, -858129, -540834, 217081, -691164, -155682, -529455, -252730, -826527, 355160, -553612, -219730, -913019, -519091, 383435, 951220, -390134, -738745, 313603, 767806, -812804, -604850, -834561, 83649, 687708, 48027, -876548, 733178, 602657, -975817, -373837, 262737, 93539, 503407, 541293, -427848, -770975, -714744};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques418(){
        Integer[] array = {82958, -291010, 813479, 352511, -117303, 948023, -640154, 971521, -321119, -853764, 467487, 822825, 679618, -867242, -459832, 514105, -358990, -548242, 208941, 605949, -208972, 733304, -230653, 946951, 367772, -448966, -371034, 956325, -509913, 583959, -984294, 863811, 16908, 650287, -744194, 725422, 348637, -753361, -555839, -504319, -640201, -858039, 96741, -204829, 299200, -104814, -170351, -102274, 960035, -759075, -658347, -703083, 780847, -920675, -756000, 788830, 67207, 842259, 255830, -155136, 279320, -912479, -71041, -907383, -107109, 683326, 414578, -36577, 102362, -2284, -742263, 181047, 309787, 8433, -116587, -953594, 974936, -522653, -437704, 445554, 84527, 405279, 410231, -970381, 553483, -829009, -73059, 161031, -385171, 590258, 156495, -226847, 607964, -635760, -940109, -434324, 280582, -617591, -626729, 750074};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques419(){
        Integer[] array = {531687, -237409, -281831, 270567, 656417, -64776, -714265, 950141, 192415, -260907, -516813, 421178, 382045, 153833, 534572, 453636, -373629, 994040, 217138, 79595, -639764, -763808, 343948, 622304, 35268, -936117, 603583, -5928, -377301, 644191, 963780, -929394, -331969, 17014, -19327, -939880, -197993, 230560, 802863, -874997, -306668, 504225, 914368, 351141, -817866, 868622, 82982, -923542, -251206, 194748, 637056, -774543, 619039, -258269, 61460, 668148, -792173, -173094, -864189, 278813, 638028, -984072, 292316, -500820, -295016, -118565, 483780, -83053, -731004, -346975, 351891, -498458, -126422, 806813, 843044, 748666, 536186, 319494, -525520, 766017, 841091, -30567, 842847, -318364, 759042, 488470, -422661, 28334, 696, -605765, 379053, -87487, 8094, -314151, 863665, -145077, 995623, 354308, -46508, 403260};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques420(){
        Integer[] array = {23583, -369247, -798602, -72914, 588536, 60144, -896343, 2801, -140350, -271208, -647346, 394792, -656487, -541326, 33994, 947100, -854102, 96494, 408364, 952567, 271916, 577076, 432907, 893550, 133516, -631418, -467820, -236629, 144612, -318785, -859123, 385416, -3502, -402296, -962699, 157651, 684916, -447724, -13525, -343911, 109561, 621043, -598886, 48061, -408116, -721820, -754785, -642705, 751480, -375515, 512457, -75366, 815676, 252993, -504707, -503026, 126499, -179142, -578767, 529235, -60966, 634684, 407985, -937852, -231936, -980023, -608606, 800428, 963321, 508963, 615953, -62021, 292693, -186287, 919891, -519676, -524225, -799915, -255575, 247738, 280019, -544664, -929744, 211230, -940793, -330402, -157612, -95990, -192056, 131250, -779778, 129725, -454597, 816871, -783167, 497811, -438287, 216730, -743644, 645818};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques421(){
        Integer[] array = {-984388, -260009, 931191, 321955, 44396, -726850, -731395, 524556, -338463, -864006, -331290, -295205, -538954, 93262, -495660, 515181, 769347, 813080, 643585, -698977, 277772, 112588, -312125, 919271, 49052, 286759, -447447, 462423, 851542, 293937, 319443, 161512, -340489, -429995, 124836, -738039, -368510, -830230, -833026, -845901, -437576, -421967, -110139, -511905, -932740, -134578, 236162, 338726, -762694, -601742, 755953, -408030, -160988, -957868, -604378, 30633, -931666, -337828, -231635, 741591, 441143, 166162, -125669, 456470, -558397, 862823, 132633, -934461, -880487, 84513, 782342, 141536, -781237, -80545, 343872, -300001, 573128, -462198, 185662, -414160, -947220, 70912, 786692, 697059, 145891, -23807, -722680, -682814, 62106, -49587, 109434, 428266, -939670, -537671, -694116, 370179, 424599, 649574, -864183, -145584};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques422(){
        Integer[] array = {-884675, 558361, 21904, -765721, 741859, -280066, -879108, -685222, 722060, -556999, -297877, -982242, 569207, 416649, -599033, -123245, -689936, 187571, 269038, 214142, 261009, 648900, -440724, 506312, -983689, -543694, 781595, 756475, -694178, -728434, 579850, 550134, -856945, 677733, 261050, 967021, 44875, 627191, -539772, 492378, -553287, 227466, 469837, 356644, -21047, 86028, -896289, 106451, 219686, 307692, -705831, -858337, -114224, 191321, -559671, -36598, -508832, -898450, 896664, -367119, -929523, -876825, 18812, 732151, 384005, -455622, 168589, 495508, -556259, -958080, 612428, -355657, -631547, 772422, 449579, 831928, -820382, -95416, 494617, 419144, 776117, -597395, -422529, 682943, -197460, 983483, 639924, 313676, 560981, 153524, 995382, 685340, -290923, 164358, -813404, 75462, 152929, -81729, 414005, 333848};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques423(){
        Integer[] array = {988059, -41953, 797969, 497625, -158776, -60387, -898556, -695263, -3215, 99864, -320458, -240470, 116891, 584779, -343816, -519829, 490879, 730451, 708441, -3407, -249086, 52297, -760888, -305993, 79735, 323570, -57700, -393889, -431407, -914454, 922124, -432696, -14265, -371838, -353726, -256610, 746623, 197940, 6265, -118205, 754958, -682000, 896988, -881678, -481171, -292501, -213366, 509346, -359091, -493456, -148313, 8071, -555107, -117667, 589766, 45952, -57838, -980055, -800035, -516826, -143063, -475509, -995531, 211847, 572468, -741881, 188449, 76014, 332531, -731675, -943348, 764060, 376554, -11041, -892833, -78650, -651922, 854791, 287965, 43435, -520456, 784763, -327063, -889298, 310568, 128, -468082, -2025, -885188, -579565, 740056, -739847, 703771, -898326, -901479, -829104, -815078, -858454, 430090, -38993};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques424(){
        Integer[] array = {-767158, -207346, 261482, -903465, -737177, -534235, 517540, 845061, -240411, 357781, 819517, 926353, -46250, 25197, -622269, 230916, -188021, 188551, 28728, -14141, 482868, 41097, 321805, -159825, 66236, 211616, 791771, 20413, 211866, -679858, -413370, 965855, -165835, 864404, 840225, -228840, -914583, 678476, -267419, 128822, -144423, 101401, 614700, 209872, -384190, 85764, -458729, -874393, -706742, 191815, 37635, 168998, 995862, -871971, 374775, -899955, -289107, -723511, -661997, -520592, 169475, 800367, -717474, -712488, 155251, 626207, -53164, 595305, -93313, -376726, -201997, 27956, -41161, -828649, 384540, 469429, -36577, 767399, 891776, -10267, 271593, -11747, 919562, 511332, -471426, 36878, -130650, -254978, 469932, -149700, 200614, -437486, -73882, 557464, 462021, -845413, 382338, 844029, -526556, 149133};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques425(){
        Integer[] array = {635135, 356610, -201702, 496503, 595555, 707015, 592329, 453853, 7883, 870251, -271979, 951674, -848418, 373930, -554760, -509428, -34618, 790256, 644319, 989993, -748765, 71630, 702415, -946661, -359707, -645262, 940702, -891430, 313535, 601003, -386798, 593997, -394240, 304098, -940464, 619744, -510120, -941873, -479721, 863508, -525003, -589576, -873089, -614943, -529037, 456889, 410123, 920018, 595770, 338533, 114701, 988668, -735954, 423977, 328378, -61424, -443187, 491903, -245618, 405937, -985096, -425000, 401228, -979102, -223037, 868293, 554164, -125433, 581083, -25707, 927956, -101285, 645104, -896704, 112330, -162218, 784906, 821524, -246171, 534234, 567314, -978916, -870293, 52925, 627426, 784497, 7724, 706311, 521082, 933687, -994723, -617844, -886025, 850493, 248552, 738181, -709327, 557938, -655046, 892355};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques426(){
        Integer[] array = {-440097, -103216, 311855, -792237, 865802, 355282, 97761, -218390, 984112, 830635, 32958, -366581, 887153, -31977, 374376, -612042, -182465, 816723, 45209, -521216, 563202, -541872, 844287, 562558, 79795, 257279, 855611, -371246, -838404, -238766, -15177, -798866, 970315, 717590, 90155, -925325, -742884, 401270, -671045, -58618, 179108, 943077, 181945, -83237, 400169, 465563, -391573, 186236, 575689, -943056, -382197, 860317, 694096, -874921, 473074, -185002, -296777, -708328, -740739, 973567, -851200, -488226, 13569, -692715, -690232, 68959, 544220, 672328, 850105, 557483, -215478, 359978, 287422, -491236, 24881, 562792, -265576, -981043, -20804, 12085, -415102, 894638, -933187, 442957, 604188, -254055, -408507, 351948, -37325, 734456, 687949, 862828, -261970, 216080, 840693, 281827, 7513, 167322, 915216, 850470};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques427(){
        Integer[] array = {348203, -775553, -985957, 226610, -852393, -610420, -987372, 454140, -552197, -239820, -408695, -683556, 875927, 468806, 779203, -259055, -870195, -769771, 352807, 258816, 919255, -35898, -921763, -329883, 566007, 691276, -653073, -865924, -32746, 555385, 187941, -901169, -752476, 510023, 147650, -291049, 121424, -931436, 359218, -712710, 469901, -230442, -480505, 631133, 899834, -765521, -218379, 933994, -460634, -809090, 633265, 734855, -312320, 52239, -157820, -662099, -807680, 339405, 27981, -637266, -419401, -344140, -721249, 619252, -10603, -289647, 364006, 816787, -949481, -521213, -937674, 440158, 915928, -108974, 157152, 658717, 893323, 169408, 370731, 451051, -802214, -157054, 168597, 287781, -491169, 336635, -745110, -26622, -417978, -15745, 432240, 117928, 165148, 288067, -396141, 136058, -169195, 700960, 32900, 817379};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques428(){
        Integer[] array = {776846, -63174, 440330, -674346, 426556, 351049, 443240, -281287, 303926, 866572, -934902, 947906, 9730, 617736, -747886, 690837, 767722, -16084, -47529, 838570, 498501, -43850, 159387, 816281, 635929, 827880, 979923, -583354, 342110, 707257, -457370, -586055, -862104, -680354, 578293, -190192, 24973, 13534, 554955, 10799, 305877, 756026, 59930, 866292, -302703, 410732, -368385, 694094, 988161, -783186, -633579, 442287, 805395, -362557, -145924, -165351, -132385, -601092, 660564, 682393, 664363, 365755, -64591, 484306, -859051, -479363, -615618, 365799, -662197, -115124, -540575, 455670, 506647, -46045, 581156, 998658, -567993, 756199, -780402, 347259, -92412, 42729, -34409, -207911, -618798, 224731, 517743, -106894, -860392, -835195, -591901, 96721, -195463, -149216, -858561, 104694, -655800, -672248, 524395, -343069};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques429(){
        Integer[] array = {190905, -34776, 449336, -506775, -364116, 914194, -706856, 488681, 797513, 970175, 95607, 294299, 359315, 258527, 635954, -307563, -595986, 749824, 775632, -882014, -316803, -191004, 716690, -691109, 309272, -716120, 605358, -573990, 678536, -696111, -992349, 353229, -993829, -352878, 442584, -637201, -982693, -711908, -822992, 954936, 551555, 751131, 754022, 866481, -82031, -660394, 108905, -29866, -495594, -250735, -419367, 745068, 97947, 497758, 473484, 257269, 299425, 177844, -139992, 196548, -12671, 651692, -701835, 201570, -380107, -685897, 414229, -834043, -770790, -981041, -473162, 511819, -752403, 430671, 824874, -886402, -794547, 473685, 426373, -636344, -986271, 315749, 765488, 491637, -908904, -374799, -709583, -992623, -654314, 664861, -672613, -565232, 109581, -748019, 936260, -620723, -467290, -587247, -340718, 179156};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques430(){
        Integer[] array = {-426205, 374150, -585882, 732643, -445387, 625282, -426458, -644358, -726307, -456473, 509505, 636754, -960149, 766651, -490797, 65454, -59054, -389551, -341731, -404244, -375383, -501429, 357585, 673976, -888858, -222164, -43776, -833046, -700926, -28835, 282597, 237172, -935667, 792341, 733307, -869353, -894888, -783145, -817846, -19896, 914549, 523181, -714375, -618717, -793773, 578849, 265620, -271570, 618019, 645927, -930952, 965315, 717557, 870846, -248059, -797825, -265593, -973649, 528856, 6189, 734526, -976567, 296619, 403877, -32118, -252648, -973595, 922504, 307719, -745049, 955121, 869610, 684476, 848046, 884952, -391010, 560662, 787243, 650173, -517528, -268643, 532996, 127853, -578047, -195731, 372285, -833519, -849393, 506574, -461203, -783192, -707196, 26728, 558626, -43015, 64221, 667473, -711905, -708699, -735584};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques431(){
        Integer[] array = {912400, 450904, -978384, 508804, 587671, -762207, 494558, 244534, -915967, -789236, 896501, -502100, 581022, 630680, -872003, -336921, -989846, -621313, 863395, 958980, -656106, -298307, -38157, -435220, 997309, -94198, -97594, -120181, 882195, 539953, -759909, -318443, 441193, -324039, 383519, 292492, -293107, 463823, -825821, 762972, 610205, -988437, -297600, 60887, -172430, 278140, -765056, -176044, -889646, -762221, -771747, -42748, 561268, -158026, 427709, -70501, 97284, -807815, -26895, 345409, 634507, 762651, 446693, 279703, 466984, 112968, 65956, -360547, 290233, 174636, 630676, 588248, -258152, -849785, 705184, -947182, -215133, -952931, 744909, -658230, -766328, 46281, -67753, 861728, 56370, 894663, -528191, 773965, 732201, 690935, -308764, -92766, -117443, -420188, -754109, 968396, -389755, 299076, -83192, -158642};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques432(){
        Integer[] array = {-220694, -12379, 790607, -56190, -419703, -186986, 253201, -603859, 761790, -751419, -983772, 774576, -246709, 758648, 318279, 110786, -93859, -354418, 547806, -925408, -579238, -515659, 473390, -527253, -173991, 991525, -493218, -523875, -449326, -63849, 147603, 816305, -203182, 555451, 135095, -170100, 284519, 217502, -76997, -801705, -104491, 264762, 830271, 472559, -628998, -618200, 374445, 960366, -90803, -411652, 793414, -410313, -395349, -747244, 860585, 208132, -355280, 375266, -420861, -453208, 132584, 493915, 970935, 747362, 658119, -550467, 242253, 297305, 719195, 397656, 97171, 823957, -795623, -10722, -355068, 808094, 990155, 536258, -935972, 916074, -127789, -11887, 140094, 737272, 531877, 486415, -542072, -405685, 646835, -238914, 833551, -297885, 670920, -490382, -116815, -28895, 493165, -850506, -860186, 184376};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques433(){
        Integer[] array = {372381, -528186, -48373, -836467, -194691, -60484, 549874, 569428, -982821, -590693, -921238, 147386, 207000, -854954, 80066, 24139, -16548, -831322, 249416, -933779, -218283, 657109, 860121, -855126, -415933, 223905, -924027, 557482, 864871, 672427, 671973, -938667, -615510, -26567, -995182, -547077, 736362, -744207, -526169, 993158, 976256, -621625, -584131, -385434, 263791, 163125, -628273, 576427, 950996, 190643, -511438, -393916, 537624, 331148, 590844, -875491, -327863, -71664, -735337, -39136, -110751, -617504, 787409, 77390, -893303, 773906, 734588, 531521, -610130, -34802, -533308, -115861, -424151, -57614, 291330, 919539, -29098, 608518, -369908, 567820, -476306, 155961, -620408, -806490, -538453, 127446, -102887, -447153, -507227, -244881, -29072, 344280, 573946, -231732, 923924, -69005, -788445, -480505, -358697, 359318};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques434(){
        Integer[] array = {335566, 633145, -608807, -275462, -180629, 99577, 223478, -475664, 435219, 916843, 470496, -593992, 845466, 339556, 173512, 12, -302097, 61441, 784998, 632895, -853988, 90172, -942847, -398722, 622683, 828896, 257319, -938487, -172141, 168505, 816363, 816372, -894973, 550623, 880871, 1857, -577035, -42560, 180920, -105198, 621304, 341390, -324146, 743348, 662592, 655339, -574935, -575782, -691690, 411261, 286894, -994592, 474272, -189878, 500787, 229698, 561099, -987550, 625227, 395740, -725681, 867260, -15080, -680297, -894825, 232419, 42526, -157003, 645170, 3240, 490092, 880295, -550523, -109464, 783056, -813399, 169061, -601663, 792054, 145481, -600219, -814145, -828689, -60372, 257156, -344805, 372580, -551320, -100981, 731037, 562369, -595110, -932415, -369071, 81570, -549651, 514772, 225686, 999468, 289251};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques435(){
        Integer[] array = {370347, -417621, -3845, -627143, 290107, -290386, 810402, -155044, 907841, -785285, 501182, 422736, -932981, 508548, -644924, -605731, -806605, 440652, -782222, -354363, -572913, 627826, 762412, -503937, -329237, -22284, 818545, 412229, -868053, 667048, -412128, 620926, -289667, 36644, 985087, 61412, 947237, -823200, 732583, -425531, 109070, 69871, -96278, -514752, -616198, 70032, 17567, -493651, 556609, -103589, 608477, -740653, 676715, -479739, -943921, 327745, -28197, -398636, 394835, 495936, 755919, 5795, -358932, 955608, -595580, 642459, 58944, 255791, -890499, -696217, -684833, 243889, 669690, 364086, 301465, -627834, 711331, -102388, 437441, 638138, 658502, 410556, 377101, -928848, 966235, -634307, 989545, -710786, -278062, -74587, 524804, 410019, 690746, 37125, 187425, -677202, -817026, 101977, 483205, 287838};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques436(){
        Integer[] array = {16578, -644890, 591498, -886417, -725700, -906133, 545946, -996799, 317631, 585525, 15696, -288480, -260088, -554804, -265593, 876544, 411987, -980997, 261292, -610867, -390071, 5532, 475040, 818053, -550893, 288710, 510351, -815498, 502231, -937646, -439089, 674722, 949199, 42049, -252260, 183818, -148029, -963187, -619760, -589115, 707645, -267885, 133091, 548028, -384286, 416038, 929839, 513355, 628868, -654120, -207271, 919555, -629764, 484729, -631017, 498219, -496687, -102450, -662971, 45205, 569262, 488739, 933760, -451406, 801259, 674260, 840891, 353484, 429061, -480394, 254904, 625156, -649308, -776106, -87928, -394025, -486036, 910958, 821720, -737072, 639744, -843943, 636504, 20091, 654494, -192780, 692652, -748919, 536320, -514034, 398175, 608368, 502970, -58474, 12787, 143624, 811401, -62017, 732700, 792269};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques437(){
        Integer[] array = {165192, -178756, -831145, 589730, -186075, 463501, -42376, 545768, 469820, -383228, 34883, 486611, 428630, -874649, -319847, 808229, 466195, 347427, -15706, 231710, -871619, -940123, 981727, -651157, 602920, 121948, 529132, 232833, -408312, 80289, 458829, -652736, 435433, 563665, -520609, -591697, 428951, -386109, -281726, -939204, -778569, -908614, -561885, 923404, 752379, 929655, -935465, 398218, 983498, 595252, 778652, -204140, -236528, 518085, -516690, -636576, 125072, 329388, -608090, -8829, -781371, 14687, -873996, -345394, 55229, -911843, -755822, -333715, -491198, 479285, 515692, -682210, 404354, 586420, 108053, 196850, 890999, -667627, -755416, 196010, -362006, -399001, 875222, 567423, 779661, -953936, 647564, 921417, 213008, 794146, 948669, 123620, -548478, 596173, 46928, 314401, 139298, 308121, 341888, -15228};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques438(){
        Integer[] array = {-726332, -148014, -51661, 111254, -410100, -806299, 62797, -108847, 191181, 51388, -103535, -61348, -946062, -35300, -464887, -472882, 444088, 267620, -227334, -470175, 889388, 245609, -23364, -202461, 364732, 47942, 510068, 437961, 293579, 709836, -249617, 880856, -749436, 846371, 328691, -528189, -484808, -556016, -903769, 290823, -485373, 844849, 472188, -875022, -61087, -927138, 145211, -174312, -980964, 325776, 521703, 701674, -935015, 186052, 553697, 285036, 341430, 781712, 498251, 459035, -860249, 691224, -663674, 643480, 816068, -819630, 406110, 121930, -38412, 879759, -775618, -580811, -717475, -200874, -428200, -211853, -642377, 92394, -247981, 14384, -195736, 712117, 687178, 716129, 110536, 953210, -259735, -813280, 553097, -722375, 466875, 451822, 561767, 93483, -232209, 854141, -188665, -671522, -899798, -541331};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques439(){
        Integer[] array = {-777623, -199807, -359766, 872951, 490127, 276091, -233900, -974969, -544182, -407832, 942039, -942548, -223461, -253367, 693814, 719233, -807047, -799778, 740205, -500358, -728783, -585055, -365762, 898330, -563081, 328199, -331949, -516713, 355270, 688970, 793021, 667540, -792305, 685203, -558645, -342936, -756889, 146033, 875707, -687864, -665519, 549211, 237154, 142612, 710703, 969166, 171669, -674762, -315558, 804095, 290505, 903197, -100445, 283261, 977422, -477928, -112487, -361387, -345800, -886309, 149198, 122357, -127744, -261973, -643588, 928818, 701246, -138474, -544592, 886045, -268088, 638827, -289952, -573806, -516779, -691510, -774428, 320160, -553852, -221195, -29837, 603879, -645941, -968368, 218331, -543421, -493077, -416433, 363635, 320085, 768370, -371539, -720107, -807262, -569001, -59798, 443962, 779411, -177489, 897521};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques440(){
        Integer[] array = {-40659, -26509, -250130, 876634, 128489, 204449, -348058, -403354, 746394, -564407, 430328, -611340, -956128, -591522, 382771, 13555, 642330, -789755, -189713, 757118, -388295, 816349, -601694, 610947, 517459, -984107, -236314, 94766, 594399, 878547, 16322, 983331, 608963, 325471, -973249, 213366, -456931, -428991, -759717, -333617, -710318, 540927, -873996, 159955, 501787, -442775, 71626, -999576, 383473, 980458, -202795, -262973, 94285, 376469, -559426, -916170, 731547, -800926, 838630, 120443, 114078, 457761, -671352, -182650, -357496, -286550, 392023, 485746, -258639, 108683, -594338, 59679, 4522, -105722, 128751, -998824, 163938, -862547, -497190, -258201, 13963, -377110, 25823, 852991, -684902, -274234, -420478, 263295, -148899, -562738, 789369, -522354, 870307, -471746, 728725, -105813, 855247, -539370, 365058, 984874};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques441(){
        Integer[] array = {-706822, -401127, 47951, -172170, -403992, -511386, -355556, -939010, 932663, 292708, 352963, -612321, 51977, 116091, -263078, 926701, 443503, -880308, 401902, -655686, -624243, 573947, 473590, -459343, -171077, 159828, 40746, 632887, -604573, 90334, 405918, -808456, -809442, 620907, -891536, -172836, 176849, 768738, -460697, 190214, 117630, 303199, -862847, -367286, -870322, 662109, 541526, 714918, -11317, 674398, 765767, -753907, 2681, 577111, 298135, 289387, 952100, -823697, -52757, 727530, 262083, 770308, -326094, -422631, 88044, -955764, 251596, 859594, 703386, 397522, -603995, -34156, 929368, 137680, 483817, -605424, -506871, 188384, 237154, 504203, -751823, 83372, -106615, -376667, 440466, 528890, 480404, -798262, -527657, -347910, 759200, 48872, -125577, -578288, 838656, -622758, -822465, -562394, 183082, 702832};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques442(){
        Integer[] array = {176068, -428408, -851384, 953345, -615529, 165153, 484236, -157444, -703094, 786136, -981634, -558572, -663717, 888648, -569317, 633309, 436720, -894633, -806160, 773863, -66767, 48210, -971761, 571187, 689732, -757156, -28059, 479520, -808883, 636888, -210497, 250594, 954533, -184918, 913088, 208140, -21655, 105018, -943366, -986967, 847401, 882039, -997301, 317139, 983509, 875850, -892487, 524764, 767766, -518405, 312435, 895037, -54925, -711010, 755319, 812198, -749305, 475842, -182164, 23224, -716050, -60783, 292408, -875246, 506420, -194784, 165282, -372031, -888816, -283791, -672872, -238738, 2041, -845326, 883094, -844919, 905442, 394121, -34171, 541504, -207493, 756336, 445712, -635536, 322323, 103317, -26920, -982699, -129579, -754126, 912324, -208114, 502945, 788094, 532752, -281310, 787997, -892845, -585456, 301642};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques443(){
        Integer[] array = {273459, -616791, 250575, 828350, 261415, 979941, -524545, -613823, -753451, -357805, -552339, 616442, 919413, -781505, -199493, 90298, -906637, -880848, 992509, 986903, 100384, -468679, -728907, -867389, -451503, 434250, -304786, 107494, -180081, -462692, 651820, -407314, 562325, -47322, 593103, 586251, -207002, 168118, -191282, -37871, 552879, -893570, -195174, 569083, -849929, 934562, 325463, 121839, -828195, -618591, 468955, -587895, 209185, 949002, -229105, 25428, 230375, -513598, 178448, -970809, -549887, -463917, 238837, 399338, -767205, 197213, -397904, -508851, 935501, 388024, 121039, 526014, 593998, 601618, -323113, -319293, 554526, 81287, 419581, -367364, -760876, -179722, 142212, -936825, -359962, 914476, -674699, -99608, -447439, 81880, 693247, -504692, -792815, -499117, -915024, 978620, 128091, 399, -698479, -307788};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques444(){
        Integer[] array = {-565659, 301635, 657223, -471185, -527257, 82462, 290769, 683283, 1766, -786448, -295172, 332730, -1403, -711288, 984307, 578158, -891618, -589006, -976231, -654224, 892606, 969226, 145194, 213534, -193061, -424813, -636921, -976834, 536356, -861288, 474315, 616899, 268574, 886382, -911811, -723142, 456078, 334974, -822412, 844270, 280033, 913003, -561195, -30755, -478251, -436269, 383248, -760148, -19299, -169933, 637028, -190652, 354527, -898297, 752669, -999296, -185926, -59449, -419106, 456481, -820612, -565646, 934233, -715187, 738155, -571534, -532258, -28430, -641728, -254268, -359942, 411526, -996701, -96888, -234662, -75445, -696687, 465977, -264031, 347231, 864222, 620306, -115119, 206865, 867260, -816014, -681341, -598959, -947230, -958488, -435117, -502698, 144718, 551803, 867369, 788194, -377559, 589871, 263787, -696586};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques445(){
        Integer[] array = {282495, -306481, -109400, 957226, 773543, 869036, 704098, 980638, 949124, -863178, 987017, 556256, -657818, -734887, 776846, 35631, -852838, -196386, -475807, -696691, 367567, -376810, 495767, -289967, 852234, -173700, 590840, -690873, 96800, 142920, -113835, 385457, -608188, -929365, 846995, 580905, -488871, -764471, 530605, -878508, -269664, 667541, -928763, 664299, 119848, 34654, -769592, -295089, 445854, -439108, 429327, -729475, 524558, 641218, -813655, -392820, 688077, -140419, 453864, -43289, 695158, -21743, 560427, -279913, -969920, 641741, -52735, 18297, 158164, -163825, -214943, -152516, -202292, -596399, -915075, -482114, -408190, -730094, -161816, 12952, -726477, 360042, -370173, -394063, 464733, 746410, -214171, -723727, 191470, 609512, -930163, 699891, -128061, -451984, -383155, -400490, -193895, 854243, -730431, -525833};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques446(){
        Integer[] array = {951695, -86859, -25817, -308640, -989947, -242487, 69765, 23699, -597794, 667259, 364290, 2232, -288126, -169936, 575399, -236623, 126854, -813833, 921418, -223185, 178208, 437984, -258938, -254428, -450346, 429465, -933004, 243918, 41877, -590055, -768855, -27877, 234381, 373119, 121182, 970091, 117830, -244521, 138357, -390129, 613963, 887919, -119091, 384531, 395583, -16655, 648010, 365240, 723336, -487155, 759093, 397986, -268461, -928678, 538007, 104672, 949794, 184011, -429762, -940169, -118289, 199583, -824555, -360919, 865608, -895684, -210009, -536331, -504182, 203017, 226951, 608117, -268472, -713639, -458670, 613877, 696359, -631447, 946891, 446413, 60173, 150759, -276759, -965049, -821197, -144922, -905969, 126880, 611291, 722055, 835944, 941578, -449019, -497001, -258641, 417056, 220572, -930164, 204053, 922919};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques447(){
        Integer[] array = {-850548, 384522, -543618, -165652, -454450, -186902, -581099, -672766, 479609, -29658, 867639, -282062, 663179, 335058, -117072, -80670, -215193, 95132, 650189, -786600, 676243, -660718, -775307, -558460, 306765, 101981, -429213, 223503, 291168, -917260, 330103, 496751, 550276, -384854, -412358, -603140, -372498, 50526, -473165, 470510, -361940, -441132, 772510, -276246, -204780, 298041, -239525, -135735, -844728, -718227, -206734, -40411, 70249, -424314, -197906, -424048, -620358, -244407, -756787, 500142, -256904, -330340, -967065, -287780, -258593, -246716, -852519, -842692, 171110, -630041, -383291, -14857, -18041, 684084, -1378, 449671, 434917, 156358, -466273, -93634, -254098, -961984, 275150, 568495, 179827, 34135, -172194, 466647, -27835, -856618, 322715, -320572, 559821, 731290, 185068, 59009, -378736, -788679, 701919, 509502};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques448(){
        Integer[] array = {-936760, 769720, 385571, -397241, 602897, 999184, 505571, -130092, 937511, -67073, 835633, 380541, -510921, 188664, -488436, 821008, 623808, -903542, -922231, 401696, -814221, 58047, 678517, 695359, 816612, -873866, 986918, 198797, 842822, -476181, -937965, -816073, 743150, -559020, 157776, -890962, 545188, -797131, -997054, -833401, 482042, 713862, 57212, -906729, 267017, 671746, -348157, 867532, -341966, -270051, -816659, 350973, -979977, 601287, 943978, -909524, 735971, 471166, -810202, 804636, -489080, -830538, -88723, 437197, -430759, -55414, 888590, 125199, 228591, -202535, 494013, 384723, 145684, 981283, -428306, 374252, -406706, -508088, -637056, 583745, 816005, -276628, 168802, -519793, -528023, 970769, -229298, 290508, 657561, 783976, -317914, -291511, -936485, -793368, 856928, -241767, -667429, -840528, 549267, -536183};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques449(){
        Integer[] array = {-350542, -124485, -159944, 849530, -15336, -539064, 128032, -527124, 902519, -99621, -154837, 789280, 744164, 277461, 772109, 653865, -811017, 24818, 653349, -396436, -676024, 268853, -121934, 541542, 548138, 591483, 115734, -964476, 583175, 852654, 71313, -405983, -870349, -896828, -820048, -452200, -298663, 507221, 287698, -549986, 285500, 842041, 177912, -979549, 257043, -297884, -361343, 483760, 724456, 65980, -22130, -550539, -752381, 218149, -253370, -916150, 399140, -326633, -148684, 151654, 579949, -961476, 111778, -279534, 150036, 956709, 420065, -603916, -899851, 269813, 977659, 18091, -610113, -472978, 371609, 199478, 813259, -729209, 776792, -681732, 410143, 572615, 922564, -710687, 742524, 628825, -289935, -686304, 481176, 948250, -312300, 430677, 85306, 321624, 863234, -776387, 975880, 29833, 707845, 834583};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques450(){
        Integer[] array = {-781916, -623907, -448159, -680953, 452309, -755590, -898137, -266866, 528648, -836563, -557742, 923297, 4633, -318860, 976771, -295813, -358650, -529770, -870000, -746951, -959458, -950161, -702661, -233438, 44408, -656259, -169700, 99173, 704264, -226360, -171538, -248011, -670962, 961199, -547364, -249881, -50556, -471825, -543306, -640438, 582342, -814706, -215794, 242161, 480919, -608064, 368204, 755226, -434970, 473825, 574156, 221926, 708034, -434033, -144957, 469393, 744359, -752446, -575392, 379879, 417647, 963001, -469963, -790898, -61649, 412618, -999542, 445696, 355202, 775512, -712448, 679777, -746787, 526016, 922347, -871317, -395210, 775768, -782914, 863461, -679098, 447000, 320965, 340583, -879318, 642052, 913063, 149057, 248675, -749105, -155405, 801082, 280746, 800048, -974165, 743342, 955355, -818851, -307799, -63558};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques451(){
        Integer[] array = {-990781, -601635, 736598, 956969, 897076, -14243, 149664, 163916, -335325, 764649, 893127, -611979, 649320, 844927, 275805, -832454, -896963, -49927, -264825, -68596, 873753, 842846, 602113, -195047, 259512, -392177, 840249, -595420, -480009, 349113, 451747, 834884, -371240, -353836, 908435, 1648, -967175, 36943, -849311, 467901, -484451, 659869, -148774, 155730, -225882, -848983, 533480, -41913, 696109, -407547, 279083, 973130, -178974, 982759, 831327, -667970, -287513, 692691, -159210, -683099, -967851, 105501, 367539, 530016, 630740, -108654, -896681, 663184, -987779, -624798, 135867, 782666, -453827, -159940, -669297, -317452, -722311, 114930, -670692, -58685, -462558, -40241, 573756, -16780, -96458, 392537, -473943, -66613, -243562, 162318, -447459, -402843, 944757, 835545, 875136, -100350, -105604, 787574, -667853, -518908};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques452(){
        Integer[] array = {656436, -222821, -795680, -972118, 701522, -11995, 112611, -320747, -788513, 62789, -553894, 412473, -983156, 382491, 381433, -936951, -636957, -297440, -308611, 355247, -668208, -40475, 253912, 822124, 779557, -73819, 728737, 312220, 338622, 834032, 123798, -514914, 658864, 690014, -680520, 412190, -146457, -985642, 382211, -566869, -231286, -324405, 73123, 844124, -58980, -37813, 694141, -399620, 666601, 512856, 135139, 379489, -303029, 199701, -530358, 189235, 325381, 857874, -834463, -362084, -606941, -375652, -947471, 296581, 799624, -108028, 156877, 617143, 852412, 595643, 192379, 166602, -138846, -180833, 959819, -427161, -79379, -404111, 944190, 898403, 821038, -336597, -630968, 814400, -557464, 956858, -288901, 948611, -546804, -357153, -139919, 969311, 587875, 224874, 857066, -592114, 30366, 733585, -12991, 765125};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques453(){
        Integer[] array = {-405237, -682530, -765447, -953166, 550210, -850193, -728795, -588288, 435592, -253915, -243359, 55305, -968, -334673, -829665, 214966, -565375, 785206, -628255, 160410, -402538, -787712, -904159, 468517, -67537, 826557, -375555, -559481, 120805, -754796, -202581, -110263, -806660, 974636, -188704, -694119, -793398, -598081, 861254, -548182, -824437, -113416, -329140, 907520, -382859, -568087, -141272, -603016, 503487, -712778, 761193, 440937, 278654, -866513, 808431, 55767, -334495, -165204, 866850, -16370, -877843, 833459, -472394, 160419, 952155, -719984, 402572, 843898, -666054, 540519, 277535, -696147, 176467, -330700, 851935, 645126, -940342, 301329, 646377, 890735, -948348, 145099, 358121, -453857, -548327, -384714, 118893, -360386, -584957, -426644, 658570, -151614, 15933, 188248, -386432, -65699, -220410, -166253, 983624, -975886};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques454(){
        Integer[] array = {-476767, 10041, 165982, 858300, 749092, -548905, 50088, -403101, -101424, -234174, 137634, -505539, 954279, 406893, -864075, -908049, 204647, -983475, 106165, 780348, -864592, 612118, -263817, -354768, -22721, -193866, -341541, -6050, 901025, 889006, -499032, 562142, -804191, 498810, 980729, 913798, -538468, 648624, 78371, -418699, 70838, 208046, -966717, 486133, 42167, 667063, -951106, -984725, -29844, -930210, -418933, -240197, -199116, -122153, -423297, -932105, -210015, 194185, 39946, -27965, -714754, -735404, -468728, 379563, 420736, -516038, -790747, 268386, 805930, 105995, -974206, -71529, -15448, -890448, -833894, -205367, -968235, -709905, -105038, -57709, 618902, 474578, -458552, -75840, 758946, 166477, 999680, -355473, 312242, -32217, -681317, 540829, -918062, -830423, 708586, 182878, -516981, 666485, -120545, 605519};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques455(){
        Integer[] array = {-219029, 512689, 166210, -200021, 144692, -128485, -715387, -683974, -319518, -283727, 498066, 378978, 530410, 627244, 974815, 698270, -521120, 328849, -53613, -253974, -798902, 340672, 699585, -909734, 134292, -842212, -238828, -145726, -209806, 152475, 527759, 996638, 458155, -268833, -10344, 472939, 864227, 794517, -643112, -324015, -999877, 523836, 139621, 641531, -144532, -246302, 115810, 580045, -229139, 58734, 466998, 511610, -906281, -353919, 916916, 523103, -455090, -388442, -566166, 268618, 457906, -418737, -678648, 411187, 512687, -873299, -174447, -786759, 833861, 452304, 515731, -231855, -918028, 421113, -766149, -23821, 584468, -705306, -377382, 530328, -847737, 711389, -794506, -429232, 522377, 345986, -616359, 679723, -657710, -164407, -43298, 235405, 335716, -257464, -815505, -1052, -668674, 735827, 399333, 650316};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques456(){
        Integer[] array = {-498205, -255075, 257389, 595508, -66517, 750222, 823545, 664812, 411695, 767585, -692424, 63806, 156980, 174640, 715912, 525603, -285204, -871338, -244244, -354386, 928707, -930262, 652563, 740975, -543255, 523997, 812268, -627575, 276133, -695456, 72460, 942406, 969537, -450727, 837065, 635930, -593331, 121725, -771777, -413714, 143364, -40922, 939543, 657675, -814371, 406998, 171250, -921114, 239845, 379094, 867395, 122309, -734633, -577417, -803155, 143043, 257547, -66871, 632754, 364910, -796111, 463655, 672070, -362389, 8061, 416172, -639151, -351, 253333, 47891, -711407, -681094, 906876, 443313, 296678, -915278, -205856, 808555, -959235, -682642, -40154, -1348, 758951, -860801, 488841, -641196, 337863, 123856, 232107, 610371, -656863, 661268, 392283, 584218, 416170, -703048, 561938, 989252, 151104, 548992};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques457(){
        Integer[] array = {320528, 612393, 178370, -489528, -801403, 921216, 425188, -530366, 502324, -995943, -799001, 625878, 159391, -665799, -356415, -207737, -711522, -347156, 319099, -795412, 398004, -358776, -236896, -288530, -587354, 155678, -17102, 34612, 862597, 475703, 7824, 242982, 553162, 788350, 382267, -380068, -864314, -125042, 588844, 414831, 835885, 566883, -496102, -669196, 939295, 968203, 408539, -89380, -90162, 24266, -525822, 648710, -921687, -964123, 457901, 785563, 592528, -145129, 314595, 937987, 50674, -402813, -982506, -807887, 609588, 977604, 769818, 760177, 452723, 853059, 659102, -551284, 473393, 229631, -726777, 233205, 248770, 376489, 777289, -565522, 889839, -584860, -959030, 526472, -935251, -710230, 275453, -336653, -137702, 847413, -795025, -756342, -60240, 301579, 374346, 232610, 617350, -609763, -805838, 568301};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques458(){
        Integer[] array = {164774, -123376, -531844, -793320, 120337, 239331, 283461, 523329, 1924, -471280, -667634, -966518, 692661, -545472, 433178, -70060, -39427, 956199, -989799, -23891, 109613, 568096, -258777, 445562, -757404, 900915, 479510, 416258, 507252, 2770, -598351, -354493, -537403, 298179, 944891, -222388, 325837, -743028, -671646, 713233, -772997, -237576, -705604, -378924, 595589, -455756, 89040, -413221, -251180, 441922, -934116, 865729, 406475, 764575, 739793, 155056, -366128, -587931, 586719, 602514, 356405, -198989, 292168, -437426, 401754, 697458, -591101, -682336, -88475, 819117, 307061, 105839, -769850, -380732, -884589, 650336, 385017, 185180, 996864, -276356, -884887, 276933, 364394, 504547, -962167, 312226, 655126, 736294, 847105, -348294, -238433, 637361, -904306, 595398, -692306, -765745, 146899, -38297, 572752, -53679};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques459(){
        Integer[] array = {311110, -87010, -742754, 153634, 391422, -256756, -445193, -958871, 793909, -462039, -195795, 631527, 784662, -496520, -538994, 513219, -749157, -518060, 620744, 585998, 220418, -997215, -381350, 284989, -474970, 889936, 279918, 57083, -543076, 202982, -692268, 785361, -122748, -248773, -959612, 352338, 833979, -141324, -230378, 621743, 777866, -480933, 521724, 654513, 779681, -184925, -676010, -161016, 452520, -606920, -438372, -406353, 341255, 992049, -321412, -728380, 349410, 770449, 569427, -762120, 343551, -479829, -447160, -65280, 344659, 403453, 970302, -41722, -395264, 354351, -736632, -455593, -671141, 110144, 564458, 18213, 18929, -125413, 901347, -829377, -789370, -858713, -986246, -778268, -651047, 930061, 533129, 730690, -586254, -968506, 731961, -525123, -136859, -452089, 605441, 305863, -719890, 143131, 835872, 345043};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques460(){
        Integer[] array = {730341, -304700, 875040, -314444, 308952, 570841, 444138, 825010, 836946, 438484, 584763, -20566, 200733, -483143, -930880, 456481, 195976, 941742, -858909, -28004, -20859, 546955, 951074, -487401, 640693, -577753, -667121, 54913, -312586, 406958, -903862, -46414, -816337, -43388, 626732, -191726, 146697, 846890, -132460, -867725, 492436, 519181, -957835, 221878, 286847, -832148, 669327, 45308, 634686, 557803, 523439, 846432, 431571, 117042, 90503, 84489, -715631, -970854, 244348, 657155, 894859, 33505, -232151, -277422, 555341, 564256, -839409, 595281, -116356, 545316, -746452, 36522, 565624, 826458, -465666, -392824, -872409, -102860, 808229, -449235, 233181, -481538, -314045, -945845, -829780, -415911, 557161, 140530, -871882, 608494, -732449, 921127, -916763, -486425, 164325, 977259, 952510, 806977, 48879, 519424};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques461(){
        Integer[] array = {-135241, -652165, -231674, -932792, 430869, 806844, 242219, -888467, -33512, 679805, -292940, 327851, -943624, -241861, -962100, 941278, 477856, 316257, -872380, 798201, -50557, 783755, 143379, 790879, 732751, -662165, 638201, -777287, 309503, 646590, 45447, -633559, 923229, 697988, 862520, -638495, 353478, 186679, -807479, 675173, -513314, 267358, -861323, -754824, 382317, -806522, -682670, 571895, 229704, 169072, 134279, 772950, 774565, 888825, 571169, 736069, -388486, -8304, 194627, 453648, -52046, -213169, 445293, 111193, -448972, 70725, -151338, 287250, 746550, -495253, 25281, -281627, -635605, -559895, -700207, -81580, -656376, -266738, -197102, 797032, -438618, 632640, 194134, 931957, -351843, 180191, -448834, -754769, 381928, 90323, -276638, -213576, 898893, 845563, 292370, -270281, -486695, 608309, 398975, -212865};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques462(){
        Integer[] array = {-220745, -594610, 160044, -224748, 531514, -352777, 986917, -371752, -701028, -40350, -873655, 599508, 649215, -67363, -355524, 464073, -797048, 573358, -150776, 804670, -874658, -659877, -53460, -554771, 250382, 532254, -338494, -577820, -241596, 109118, 879417, 202972, -353698, 580884, -782810, 240226, 306684, 841756, -318133, 460866, 659834, 123086, 530066, -51406, -937439, -432185, 85335, -13059, -31958, 415844, -790687, -773882, 790362, 942950, -821070, -174135, 85378, 502564, 343809, -170824, -121390, -453178, 991681, -641824, 454960, -64023, 641055, 275489, 267668, 343577, -71925, 369440, 907362, -159071, -271964, -666066, 649235, 747653, 674739, -426040, 837046, -973540, -271150, -148979, -883841, -538730, 101234, 95890, 771875, -820669, -342530, -608745, -809059, -612648, 301100, -957074, 945287, 688925, -474338, 536245};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques463(){
        Integer[] array = {-528191, 558599, 770888, -446597, -699079, 768237, 732158, -341116, 96353, 259872, 731713, 204093, 781531, 326148, -772064, -319740, 775695, -862953, 803655, -946737, -406282, -130627, -900235, 540179, 229267, 34461, 893425, -261030, 97499, -502001, -22798, -116073, 792606, -302440, 900839, 518590, 418695, -32232, -590357, 695440, 353019, -765859, -615795, 648815, 355583, 459551, -843185, -691817, 494486, 894061, -846129, 538529, 768745, 800325, -640187, 485610, -148966, -978167, 527003, -979161, -979176, 366514, 614025, -930302, -68718, -322684, 34552, 393405, 579754, -939332, -195754, 114519, 105653, 782089, -451677, -646852, -181149, 294634, 828478, -253331, 490387, -200935, 503373, -354699, 154134, -124410, 87761, -497105, -1562, 389057, -763999, -610322, -635528, -608534, 502754, -97180, -763279, 931712, 256467, 668720};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques464(){
        Integer[] array = {-339779, 284018, -738785, -857357, 477305, 173913, 614418, -631365, -679020, -916453, -935338, -823023, 893231, 499277, 617272, 685348, 938389, 383782, -184137, -516756, 224765, 276796, -826017, -265691, 250440, -397597, -906494, 300405, 199053, -149033, -291472, 53589, -242678, 355980, -510645, -288117, 515995, 216491, 493696, 603098, 772250, 737823, -401374, 500884, -773589, 146126, 816240, 902887, 156592, -137014, 101482, 156794, 292446, -121940, 265866, -691605, 577803, -284047, 21589, 737361, 913159, -361425, -814639, 207540, -212645, 694451, -954302, 348708, 845409, 37544, -295424, 840872, 407181, -500756, -643867, 727565, -868248, -320063, 678446, 304164, 109769, 255655, -721931, 852165, -544779, -192823, 903305, -448515, -699717, 363338, -363835, 784057, -86453, 983642, -732595, 726196, 317058, 180364, -469826, 72077};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques465(){
        Integer[] array = {-945304, -232136, 539180, -656584, -31782, 879707, -108870, -506020, -560518, 356473, -612380, 927673, -434333, -196303, 790121, -868692, -928838, -992224, 680758, 458477, -574017, 818461, -419141, 904561, -293500, 547891, 359779, 159869, -179680, -120938, 947612, -894936, 87594, -690513, 630921, -16999, -420855, -428738, -889680, 661173, -966778, 986007, 252024, 203916, 884867, -625194, 152122, -239662, -836425, -2941, -701346, 692272, 364562, -202921, -24892, 94683, -304536, -381129, -10422, -295794, -588842, -940109, 74735, -845980, -604878, 692951, 861146, -53978, 884024, -338900, 786795, -976234, -309419, -491803, -42222, -72715, -720988, 356330, -770338, 168228, 914735, -478565, -495846, -722448, -157476, -769798, 421617, 36193, -888872, 844620, -587481, -459567, -47987, -418769, -582748, -577460, -854762, -536680, -901033, 78275};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques466(){
        Integer[] array = {-71956, 909928, 810043, -603794, -886232, -774708, -877446, -173827, -470538, 657830, 626749, -783261, -794615, 359604, -369377, -87709, 324259, 960744, 693904, 987917, -440683, -262112, 22890, 370459, 186087, 371050, -122408, -412070, -769693, -339159, 782969, -907503, 153296, 44330, 444051, 206964, -873038, 121059, 81196, -742028, 451557, 387072, 600224, -22866, -951477, -959299, 268520, 555485, 190006, -232246, 146440, -429463, -644573, -721174, 935005, 706690, 939064, 976901, 902639, -865661, -846656, -502616, 159696, -715227, 744233, 311143, -774163, -384957, -852273, -6146, -128919, -936228, 654691, -20708, -319547, 278334, 98475, -801137, 801015, 955642, 970229, -607345, 813915, 682932, 774182, 965451, -571927, 130019, 212978, -256104, 108042, -173087, 353198, 5757, 763965, -829819, 266874, -226995, -925043, -889162};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques467(){
        Integer[] array = {536848, -692564, 211840, 246371, 322625, 852164, 720417, 785117, -385374, 541582, 161574, 422960, 671046, 950496, 313607, -180194, -26212, -528928, -89658, 314848, 431539, -463412, 487675, 344432, -71263, -918395, -302680, 930622, 578341, 653516, 850544, -271457, -543870, -845100, -728110, -369664, 146442, 471228, 455492, 882189, 987681, -383657, 135888, -550982, 584366, 885040, -798536, 988310, 107426, 507514, -405642, 165761, 446550, -920861, 133602, -21610, -977122, 491378, -994632, 944797, -671441, 633016, 8437, -585014, 62539, 869322, 781342, 929442, 864908, -262150, 290740, -774468, 766321, -46398, 800723, -931994, 188618, -115116, -874724, -930007, 670923, -338709, 578344, -697758, 449646, -995938, -26064, -787718, -417472, 504808, 339251, -698584, 372958, -92021, -746427, -561680, -519730, -606242, 224342, -12804};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques468(){
        Integer[] array = {567857, 453325, 245459, 718596, -544859, 777977, 387798, -960867, -270417, 997778, -666532, -371226, -832288, -911548, 907583, 714149, -876537, -992671, -745742, 959841, 600740, 539306, -144508, 971722, -810277, 375912, 704923, 753708, 802432, 897973, -607105, 618681, -949906, -118692, 809431, 823936, 52781, 357987, -682955, -879134, -554310, 82948, -802352, -278381, -362082, -183363, -286717, 39248, 887837, -53898, -803584, -555458, -89008, -18511, 644388, 356670, -740531, 547532, 121283, -832062, -242534, -230388, 32512, -664059, -569231, 14332, 397739, -126027, -710388, 957540, 422089, 49955, -970596, -725717, 25820, 104748, 390813, -842380, 789054, 441453, 104724, -265165, -362597, -215990, 24183, -136636, -432365, -128478, -934271, 683047, 925491, -572339, -507227, 240508, -149477, -995846, 895429, -13303, -352843, -732590};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques469(){
        Integer[] array = {-838656, 107931, -402125, 78265, 628727, -215502, -941930, -78277, -77307, -206012, 586495, -635470, 964530, -642417, -174412, -344537, 326944, 97999, -681273, 947232, 28523, 671797, 152978, 86021, 959824, 485822, 65538, -890133, 350392, 674266, 377823, -377871, 688999, 878276, -320790, 543980, 142309, 95005, 565613, 418523, 434504, 532646, -351511, -730631, -769793, -65868, 248461, 324631, -31927, 338410, 519415, 592017, -183033, 906353, 996285, 490874, -909210, -189684, 818774, -321173, -878553, -29224, -218439, -613098, 913856, -123589, -218829, -610823, -602924, -960472, -459808, -991413, 769573, -688644, 96603, -24780, -726847, 617313, 159141, 433536, 112082, -950511, 473375, -369277, -931167, 862181, 204613, 895995, 415074, -749676, -44322, 309575, 64693, -60335, -688724, 749239, 905969, -980381, -338245, 98254};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques470(){
        Integer[] array = {857838, -620250, -655347, 618281, -543518, -971472, 642809, -369843, 530325, 582837, -9147, -485369, -385440, -737029, 441029, -523580, -98566, 739172, -29284, -356827, -745043, 182191, 543786, -749733, 721717, -54456, -417645, -130169, 784171, -403007, 588688, 524472, 533442, 408600, 286625, 381862, -793339, -895654, 886508, 815471, -350769, -939393, 421881, -962554, 545538, 808090, -10425, -733873, -953110, -652267, 811111, -378922, 664260, 145423, 754572, -412699, -30832, 209164, 219885, -602939, -156028, 282228, -899657, -261888, 681729, -318882, 913498, 594410, -11733, 158728, 483875, 304456, -213093, -614230, 373326, -833276, -544931, -64502, -423300, 562409, -223038, 427403, 346655, 540579, -379652, 60528, -469465, -554341, 262050, -920985, -596502, -790984, -384348, 495609, 309917, -132550, 781812, -28348, 558286, -258663};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques471(){
        Integer[] array = {-487942, -422952, 60975, -751624, -779162, 438686, 139186, -576362, 613429, -481650, 271040, -265358, 203624, 192421, -968467, -588743, -503367, 971739, 318082, 762605, -982956, 822467, 265507, 68904, -228793, -883916, -411146, 347878, -429156, -463118, -353649, 121253, -953424, 432716, 363319, 499090, -419097, 479220, 130536, 490781, 872229, -825673, -514148, 18210, -857096, 663041, -736362, -918257, -268581, 235538, 519761, 990974, 548150, -38486, 342403, 677783, 428053, -205418, -648721, 925183, 120249, -241656, 793170, -461080, 377931, -370071, 355157, -190117, -310875, -567935, -360547, -447408, 949532, 702972, 621276, 496377, 738251, -467268, -421579, 213900, 615773, -34524, -692779, -105685, 624841, -982539, 591447, -517208, -574113, -522447, -611809, -83124, -563209, 305601, -404920, 119469, -128674, 801696, -989533, 165524};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques472(){
        Integer[] array = {-261887, -663100, 666838, 41016, -364323, 361684, 949565, -10643, 931056, 980606, -922564, -846578, 250989, -639995, -850981, 613017, 401297, -337444, -895018, 981986, -275791, -960288, 625558, -535010, -118551, 648852, -561292, -546414, -311632, -118663, 340809, 258705, 638641, -425558, -822842, 713112, 583567, -122071, -39731, 875106, 919159, 337086, -448822, 546233, 265775, 588649, -473335, 312029, 623967, 412348, 164581, -420819, 573654, -432035, -76898, 408842, -791264, -469950, 190139, -547087, 422689, 809281, 336887, 323818, -268826, 897777, 350244, 638624, -861134, -259949, 58622, 374914, -62325, -18722, -124269, -392007, -314441, -367173, 711925, -883033, 82714, -770616, 379053, -190726, 418792, -429046, -112559, -701007, 360034, 172968, -889579, -404183, -666480, -128584, -84411, -133128, -260729, 627483, -161742, -790936};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques473(){
        Integer[] array = {947625, -899552, -289485, 121405, 154479, 129470, -543761, -7470, 759173, -505304, -682325, 912414, 185688, -579137, -567763, 373541, -925084, -89683, -902542, -296967, -840589, 880951, -236928, -336027, -304629, -755661, -940929, 791606, 68088, -393725, 811778, 402463, 629548, -834281, -713216, 963912, -855168, -624750, -548513, 747387, 755579, 518856, 722770, 407658, -718014, 731030, -324389, 789678, -534491, -565706, -423592, -449166, -914407, 358191, 798399, 346166, -770257, -516862, -782339, 383045, -660458, 300240, -48019, -898698, -109550, 756105, 759266, 184574, 487755, -662545, -695283, 655983, 729639, 829227, -325847, -347093, -30330, 292231, -573683, 954552, 90113, 93811, -286106, 701297, 813856, -810918, 591497, 904040, -586306, -675110, -834528, -237437, -306129, 562433, 41289, 505206, 534740, -731599, 849086, 556367};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques474(){
        Integer[] array = {692946, -462825, -834518, -335666, 845159, 692886, 451007, -284443, -734323, -388859, 248966, 954345, -75595, 530203, 24076, -197314, 58376, 665581, -904599, 751100, 45400, -552314, -522366, 552754, -434696, -668376, 217901, 317961, -915746, -633926, -366123, -480011, 500342, -657416, -702301, 602918, -480743, -597045, -891945, -83176, -192234, -495375, 305328, -4071, 971797, 345264, 772541, 740595, 453963, -773800, 693949, -24107, 359989, 973954, 781389, 27175, -867387, -698158, -73637, 854790, -322625, 264350, 860497, 672927, -367218, -659509, 668560, -596758, -123969, -72931, 858938, -615786, 862858, 683976, -289158, -913499, 8169, 45473, -351869, 785327, -317141, -53301, -478637, -384351, -336057, -793178, -632216, -519404, 767001, -145489, 850005, 132027, 790946, -792382, 327826, -312695, -108298, -793563, 151908, -16058};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques475(){
        Integer[] array = {-901095, 484217, -112808, -227308, 588265, 634549, -237210, -48127, 368342, 90473, 250233, 991226, -897859, -426355, 458235, -221688, 640152, 31753, 430038, 786605, 405279, 814341, -920822, 461806, -802489, 116900, 246564, -403253, 547529, -526086, -177639, 748106, -747594, -164733, 105506, -380556, -194739, -800909, 32797, -908809, -949680, 279533, 876102, 737761, -981113, -758906, -936454, 571761, 599663, -648209, 890478, 490480, 409075, 664509, 228966, 803494, 415452, 949386, -253340, -37024, 980099, -785581, 586784, -557612, 982610, -390975, -335283, 438354, -208599, 362012, 176326, 307457, -822570, -465562, -822089, 279506, 782970, 916098, 130805, -914514, 77446, 63727, -597162, -635060, -104893, 179466, -971128, 511757, 740694, -532335, -139231, 630801, -9068, -964373, 557749, 712291, -108440, -429452, 320013, -576222};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques476(){
        Integer[] array = {723815, -446297, 420691, -698108, -501171, -348735, -17436, 379955, -102167, 492008, -561858, -237943, -342961, -526515, 796686, 982095, 85530, 521771, -929121, 472545, 278990, 853985, 404428, -35301, 291226, -115222, -692155, 655242, -804963, 306418, 199968, 446250, 138958, 781042, -820071, 387073, -639170, -801727, 100197, 70252, -331864, 202251, 372368, -848072, 562246, -313658, -770426, -325459, 629079, -306699, -867906, 839782, -719862, 27199, 832802, -405968, 893930, 243465, -677321, -565240, -640849, 203919, 129413, -500668, 779397, 462078, -265599, -268715, 462256, 584794, -225638, 565474, 251609, 738005, 712887, 316268, 971715, 483027, -23662, -279230, -795671, 943411, 325962, 533932, -412035, -428111, 537849, -916414, 942212, -593820, -645795, -328964, 250303, 632396, 756142, 86814, 546500, -889613, 506180, -759587};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques477(){
        Integer[] array = {798044, -402085, -260518, -572875, 467627, -672237, -546714, 153407, -10570, 735186, 878066, -507519, -154023, -19115, -683447, 588714, -726153, -372004, -445400, -946607, 862398, -496096, 234120, -318288, 457979, 313666, -383486, 303502, -847354, 277667, 857260, -945264, 837639, 150615, 934383, -196918, 265940, -491052, -916548, -978586, -229463, -471169, -11002, -317628, 833149, 676248, 856160, 167494, -860745, 701839, -378669, -339231, 88228, -582558, -933753, 566922, 32925, 755003, 129635, -750084, -783904, -339218, -834227, 700739, 895622, -875912, 330798, -339541, 454421, -374915, 454396, 363851, 678946, -240456, -886696, 870500, -336977, 461647, -778363, 694998, -78369, -790390, -383581, -153345, 868569, -763356, 506450, 96105, -450520, -323478, 597647, -723041, 475723, -948193, -263166, 617984, -723302, -276730, 856094, 10471};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques478(){
        Integer[] array = {626193, -117308, 937056, 449385, 635061, -148396, -981380, -637534, -276171, -940273, 956610, -336006, -287203, -717818, -569191, 64410, -525091, -663719, -107117, -373993, 176155, -546719, 702892, -968485, 271220, -645517, 360274, 8679, 459804, -532445, -238328, -921782, 579512, -415359, 843628, 310239, 649073, 255716, -548647, -38128, -871923, 508598, 189638, -759065, 220161, 765104, -103956, -294153, 949525, -997850, -5044, 918107, 264891, -902233, -249599, 779436, 732165, -608122, 38443, -102197, -124399, 404745, -475686, 511566, -739586, 312265, 754025, -472458, -409353, 354576, 90041, -250715, -652645, -226732, 560731, -464307, 54146, 282950, -139942, 454152, -199455, 860666, -749056, 329332, 338973, -386752, -749890, -593466, 326493, -443023, 921331, 768515, 501120, 658364, 236924, -91028, -204105, -74307, -253230, 949241};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques479(){
        Integer[] array = {-363658, 646018, -383750, -393866, -471623, 312687, -801833, -259185, 620794, 958089, -36692, -372900, 339075, -520566, -730307, -828286, 480002, -760087, 949403, -389085, 306075, -798060, 764421, 580888, 22769, 456513, 297027, 872282, -908579, -641128, -536751, -521834, 592036, 813186, 114203, -838951, 863657, 71427, -142027, 319078, -883522, -749019, 55794, 812844, 281315, 266868, -597575, 939894, 892140, -837452, -635845, -238188, 37549, -822376, -891261, 479882, 350973, -542329, -581138, 389858, -180923, -692470, 249332, -358666, -648023, 961403, 531979, 368907, 304548, -864113, 538052, 774937, 97147, 139794, -19838, 755453, 388412, -82107, 324237, -579645, -456384, -965396, 482772, 732501, -321825, -289625, -931003, -700268, -664086, 699535, -509524, -298627, -598216, 6836, -760411, 139415, 117381, 371013, 813297, -577542};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques480(){
        Integer[] array = {275504, 366543, 51226, 172542, 765450, -228797, -361095, -367068, -614362, 628416, -564826, 194885, 504248, 562915, 304467, 647303, -737410, 627005, 200229, 312204, -345091, 429775, 24163, 159104, 952811, 95688, -24991, -179370, 60895, -932125, 529884, 999160, -746086, -910558, 730179, 508386, -893668, -648306, -324408, -687251, -256208, 863231, -519854, 607819, -588440, -894886, -599005, -675883, -328187, 214903, 456194, -440888, -53036, -489601, 620380, -667988, -447451, -706922, -325754, -943923, 629132, 236589, 110336, -686548, 394197, 868410, 723219, -954850, 561497, 880953, 52083, -3011, -432650, -407159, 133376, -209225, -376376, -23159, -714977, 25889, -795707, -480809, -162484, 869501, -947274, -726029, -424468, -577943, -333901, -127416, -552831, -533979, 913707, -679618, -122616, -315659, 922907, -37668, -775972, -565673};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques481(){
        Integer[] array = {-862041, 318546, 295327, 202192, -587954, -556852, 864583, -498616, 377759, 877176, 576611, -776377, -52284, -859262, 115975, -805917, -81001, 968195, 812585, 677064, 436592, 346104, -768353, -215530, -279995, -57399, 996208, -572409, -267737, 407788, 110068, -195693, -293118, -477907, 760641, 245244, 645225, -290756, 309069, 745801, 844821, 497540, 459187, 122988, 812784, 863559, -33360, 928758, -40534, -872110, 530281, -248416, 413800, 718867, 564560, 514438, 511865, 397562, -766575, -904804, -936936, 5235, 208604, 746222, -158696, -475220, 810308, -257246, -166431, 103852, 823075, 758744, 994046, -778459, -931616, -675323, -739859, -584207, 740375, 83539, 259772, 344026, -323306, -588323, -794298, 807233, -406778, 148732, 739400, 29119, -829315, 580903, 866729, -807600, -642799, 295058, 104070, -998300, 226330, -750913};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques482(){
        Integer[] array = {742080, 732376, 309909, -50570, -968169, -196822, -576120, 858560, -536516, -181905, 500118, 395311, 21418, 718558, 571342, 74577, 674877, -156230, 672332, 164295, 359067, -453973, -713755, -463736, -508374, 805883, 460942, 934803, 757238, 795748, -774642, 969413, 516727, -174631, 398275, -282985, 205900, -924165, -971267, -759383, 94390, 453659, -145663, 283720, 509758, -400323, 395586, -174244, -916915, 320764, 747256, -546741, -488581, 179845, 554291, 264721, -323353, 240523, 503069, 61614, 753784, 124557, 14836, -953608, -283134, -658622, -613790, -527679, -790128, -57997, 432326, 133370, -989900, -188616, -746239, -109284, 552043, 641199, -809023, -27477, 339597, -137172, -466013, 808498, -732622, 880026, -922533, -17299, 416156, -117562, 161429, 319036, -683876, 444387, 162153, -558354, 392063, -332934, 775540, 483155};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques483(){
        Integer[] array = {-493982, 344781, 160885, 622222, -989067, 303301, 881482, 75982, -793139, -593991, -578438, -509178, 667099, -213730, -594034, 875839, 249913, 120438, 179178, -833325, -987992, -771694, -325742, 250486, 455071, 879819, -56542, 912629, 299825, -857717, 626639, -221090, 70516, -445647, 753348, -576039, -174539, -901075, 981344, -141488, -519977, 919469, -972614, -422992, -443599, -31149, 535683, -298117, 432648, 765063, -631692, 890597, -407975, 153707, 702971, -382168, 393420, -486230, -28631, -598709, 797285, 622784, -504752, 975041, 655618, -940837, 777846, 651480, 123279, -3012, -734669, -640748, 446120, -921925, -584555, -183850, 783514, -157382, 19109, 561689, 618399, 892741, -81508, 765316, -58916, 954114, -809790, 886553, -821408, 344837, -757731, -971691, 623974, -948486, 201143, 660387, 120509, -332912, -671797, -98080};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques484(){
        Integer[] array = {107363, -273400, -974966, -986914, 360998, -837534, -360339, 992711, -109756, 407275, -638457, 857898, -554741, 963782, 183835, 612117, 645433, -173058, 969793, 995604, 247660, -389540, 327313, 109220, -653291, -704384, 821791, 185190, -195575, 414208, -690242, -300508, -431733, 147373, -439114, -50172, 763433, 795609, 764846, -590476, 137205, -456611, -433443, -792185, -728133, 297099, -194494, -14143, 961642, 898257, 793912, 142825, -139558, 489839, -967146, -456306, -111215, -528607, 474081, 918907, -137473, 108830, 676201, 435048, 188029, 249034, 129940, -909788, -893236, -819354, 772286, 191575, -648187, 596334, 628991, 239582, 478049, 756146, -486278, -275179, 876794, -993820, 793224, -220047, -50836, -919199, 383851, 121705, -379635, -909575, 395849, 366298, -294702, 197017, 985550, 831283, -438823, 793905, 111000, -674722};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques485(){
        Integer[] array = {-592374, -624989, -928478, 679125, 260459, -500100, -992812, -945693, 447903, -954509, -78700, 79813, -319923, -479514, 133060, 290490, -724418, -419930, -923984, -209951, 401405, 308379, -204526, 963199, -705314, 284379, 624624, -43981, 155418, -535264, -735127, 735018, 763584, -69458, 348454, -566113, 179629, 239517, 203812, -248191, -10757, 339092, 157872, -2868, -228572, -690067, 114652, 651570, -436934, -255750, 649510, -982548, 532044, -446126, -865729, 712039, -404042, 107534, 313686, -82383, 673868, -820497, -716972, -722728, 635163, 959113, 820471, -305511, -703117, -473556, -972740, -172476, -217515, -930041, 418468, 873149, 962299, -780259, 696358, 307043, 423239, 391634, 884577, -977557, 155371, 433460, -262438, 424845, -734517, -625748, 654200, -609079, -163418, 475407, 524131, -370056, 784647, 884332, -602638, 200644};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques486(){
        Integer[] array = {-318673, -751270, -970636, 35302, 142580, 807297, -325183, -659053, -740819, -228766, 94861, -558602, 807162, -67638, 233198, -448562, 306952, -733231, -66277, -693935, 605382, -800780, -121666, -862646, 162071, -99524, 641314, 571112, 21455, 167861, -848976, -279535, -878302, -731044, -471887, 550522, -231932, 459206, 828976, 649102, 587936, -939345, 501239, 84904, -865146, 863882, -54464, 535097, -3125, -184283, -445192, -124152, 596446, 834638, -827478, -734312, 841009, -259396, -545160, 274975, -785741, -935475, -740939, 485387, 424316, -255181, 133658, -898070, -926814, -204314, -721012, -955938, 521451, -29676, 39570, 525974, -152848, 657104, -17521, -18268, 710262, -396049, -725302, -522331, -754118, 705701, 49261, 536985, 864514, 936254, 870547, 773057, -570430, -755971, 909086, 578500, -965747, -763816, -959427, -54152};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques487(){
        Integer[] array = {-243030, 3016, 284280, -511577, -130112, 131838, -912066, -806719, 593669, -656560, 939368, 489940, 10646, -885470, -507156, 976582, 46671, 714854, -21109, 305313, 585639, 453861, -581884, -14939, 113511, -607134, -552187, 495810, 855591, 40526, -287054, -824167, 955725, -103954, -977481, -232505, 739686, -40711, -437353, 670365, 662642, 723901, 216020, 306549, 680130, -428679, -918432, 834681, -806037, -486945, 607647, -378264, 168907, 804744, 188957, -507381, -936282, 601651, 581627, -727360, -386379, 661281, 97383, 368150, 332411, 676162, 446589, -57538, -68057, 885536, 408283, 686339, 364588, 830129, -396885, 268837, -932511, -292918, 263226, 438799, -645303, 701828, 910972, -393122, -290355, 513580, 324851, 643716, -629768, 173975, 371617, 669006, 845728, 892692, 41225, 874730, -564096, -290053, -762167, 410259};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques488(){
        Integer[] array = {-23755, 361580, -945387, -46663, 687251, -558121, 895258, -710135, 417887, -272476, -406218, -131696, 255080, 608942, -761658, 139197, 76274, 375230, 303580, -915927, -147652, 63372, -413060, 241156, 813403, -891825, -125807, 671710, -838479, 365110, 752884, -939517, -996634, 490955, -993930, -785079, 841620, -904450, -753386, -266745, 881132, -53991, 433112, 314927, 123387, -406336, 832377, -587696, -39995, -804683, -788728, -343562, 508699, -324972, 90358, 727883, -927082, -985551, 800698, -146317, -197402, -210478, -469435, 974027, -631199, 464972, 320474, 853054, -136362, 685213, -957148, -941786, -214851, -398525, 280496, 210339, -173636, -754961, 40820, -884544, 326832, -205045, 127000, -180992, -157564, -547848, -875553, -329316, 243881, -799672, -192088, 119347, 311872, -127588, 504079, 945371, -659963, 700135, 447678, -685692};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques489(){
        Integer[] array = {-202587, -750284, 628502, 107224, -775090, -624081, -158796, 972954, -502973, 929073, 458477, -437802, -600168, -22200, 979586, -540236, 788337, -971278, -651439, 230896, 413947, 365048, -230485, 365529, 306284, -924877, -503006, 259747, 312157, -866552, 364936, 647281, -771435, -495008, 762142, 49284, 432812, 931959, -794915, -450043, -372286, -548888, -476455, 32721, -806649, -553491, -833919, 690288, -802329, 328200, 318241, -491767, 80492, -545003, 870633, -181085, 390579, 331988, 857652, 908569, -119133, -716597, -553209, 759685, 758586, -293667, 114466, 694007, 616346, -663979, 257063, -207132, -28285, -467081, 267845, 906823, 168322, -920331, 669988, -229401, 625153, -248780, 828182, -200532, 781437, 921748, -78892, -771776, -425923, 924892, 112156, 383361, -151562, -103894, -614108, -88675, -349274, 13158, -279152, 755528};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques490(){
        Integer[] array = {22188, 372512, 958779, 578999, -454848, 788093, 462426, 227279, 256002, 123535, -752890, -85753, -498073, 852650, -579979, -17128, -89326, 808310, 374922, 69753, -363922, 419933, -87350, 752287, 63668, -784301, 385031, -43089, -570559, -880317, 277281, 225632, 12149, -552332, -763302, 916509, 722661, -76723, -251216, 237581, 768117, -966292, -288192, -617570, 463298, 233678, -491536, 565714, 205893, 881381, -330756, -590353, 554435, -429047, 105725, -105551, -930933, 992563, 872764, 960685, -683304, -714863, 229884, 881116, 508361, 928443, -476104, -325549, -239079, 117179, 718270, 871554, -691922, 610198, -762020, 313503, 907854, 413872, -412754, 383656, 503637, 569234, -497305, 30134, 766891, 106273, -22136, -654188, 265384, -877831, -145604, -179987, -655595, 682558, 33683, -300111, -480872, 13754, 408919, 87041};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques491(){
        Integer[] array = {854961, -584630, -612622, 821615, -640246, 294389, -432762, -570137, -30108, -471130, -350958, 977745, -27632, -590620, 430926, 97646, 755800, -855597, -486194, -378805, -825839, 904675, -957409, -511067, -48097, 499701, 709075, 759442, -367576, -822773, 152929, -287151, 136878, 436698, 805979, 553246, 102785, 600934, -370075, -97645, -646713, -979743, 250396, -499545, -543913, -286152, -44627, 809063, -427824, -342001, 732772, 976650, 815179, 793367, -825036, -88916, 853069, 262142, -5071, 289531, 275599, 812430, 318410, 507527, -600172, 581536, 426601, -156911, -748532, -86272, 723744, 718708, 749324, 173277, 2023, -261185, 166274, 513389, 643400, 704137, 284186, 47062, -443618, -904742, 602605, 862081, 505240, -629543, 491092, -541257, 748539, -15533, -737760, 692931, 491808, 813850, 337545, -635319, 286390, -226669};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques492(){
        Integer[] array = {374190, -98715, -119556, 216352, -649863, -424268, 849221, -865821, -377972, 463110, 185026, 389707, -868285, -127280, 417259, -682396, 625943, 30549, 496164, -40466, -840667, 391788, 4508, 128867, 526572, -54456, 941074, 359708, -964558, -542472, -188728, -985282, 868496, 496321, -18395, 496580, 276741, -479979, 763086, 366608, -804324, 506256, 268920, -326233, -393240, 255786, 120957, 437097, 159924, -521083, -843949, -885201, -671847, 404046, -543108, -819535, -312975, -105669, 791963, 384905, 292448, 286606, -527448, 588211, 542415, -178555, 919662, 724085, 404714, -654767, -751465, -213098, -29931, -871941, -929476, 45544, 581924, -841420, 305521, -773109, -310618, 427508, -266759, 73489, -930917, 745824, -275238, -858329, -455437, -204425, -173421, 790761, 159591, 246216, -765037, -621231, 81393, 746161, 979198, -371533};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques493(){
        Integer[] array = {-165032, 602085, -897381, -61202, 263863, 285772, 290303, 748298, 10960, 388474, -844228, -846089, 908177, -678257, -939816, 215166, 371370, 514402, 150200, -233383, -599845, 648017, -640911, -552436, 932566, -716522, 81865, -789128, -453012, -983946, 222150, -771994, 470000, -711585, -231743, -559593, 800039, -768394, -336880, 297037, -593329, 896807, 700361, -815185, -407385, 920635, -267173, -191289, 10416, 77811, 520151, 318071, -520724, 794166, 766914, 485509, 541380, 783951, -134322, -81985, 958370, -789361, -365443, -276094, -409575, 79150, -891673, 756568, 578880, 478229, -220234, -288865, 426746, 770228, -781474, 639969, 437533, 171761, 5370, 932845, 117639, 829488, 831927, 159093, 150254, 845155, -292035, 92069, -675422, -572279, 414576, -467991, 986034, 143391, -213319, 6803, -315073, 351344, -44507, -46196};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques494(){
        Integer[] array = {867261, -117855, 688016, 707108, -127294, 864437, 530488, -614797, 250920, -180147, -175417, -78576, -891975, -419127, -537712, -994427, -856253, -991655, 59990, -201213, 990986, -254493, 317871, -48458, 255024, -690289, -376655, 506660, -764331, -519938, -721343, -842753, 185546, -620419, 808886, 702230, -635447, 25188, 70946, -371064, -815079, 464675, -584753, 284847, -813600, 372594, -648531, -925650, -344932, 9703, 525207, -519173, 324354, 114261, -522559, 739790, -900518, -481677, 46755, 465198, -228593, -861909, -443973, -533133, 662645, -872175, 780850, 766988, -442334, -626652, -963651, 260477, -440274, -181062, 933039, 131158, -70388, -917748, -941546, -409127, 760995, 750438, 513819, 474366, -859476, -925275, -800101, -629829, 312009, 98913, -355235, 29630, 301832, -948651, 41464, -630916, -346905, -398496, 33620, 595244};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques495(){
        Integer[] array = {740411, 61863, 475062, -696914, -994176, 957390, -241125, -154171, -936012, -562756, 388360, 611051, 868550, 479040, 661405, 581328, 701268, 660800, -763004, 468827, -742556, 674334, 893533, -922949, -916805, 964532, -86959, 81658, 38494, -739400, 27593, 109477, 902667, 104584, -988063, 343971, -224775, -192659, 123410, 919281, 170118, 445224, 399625, 532312, -281440, 769488, 430605, -387121, 65073, 465139, 79096, 372526, -633866, -586726, 218612, -792412, 800806, -835615, -125317, 460109, 884587, 41551, -946795, -584885, -507514, 913513, -57419, 416425, 226659, -55125, 424406, 555472, -550482, 663755, -460692, -623454, -124547, 622262, -929753, 509379, 843309, 994538, 346631, -796297, 999980, 400802, 635021, -875810, 841977, 305293, -186421, 82933, 788555, 86237, 650709, 74233, -229707, -556134, -376576, 197270};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques496(){
        Integer[] array = {286391, -682618, -650955, -479521, 848206, 768693, -830353, 474430, 541047, -929300, 950057, -661919, 511457, -979879, -466826, -141108, 45343, 748929, -527629, 609089, -481672, -169127, -456444, 633962, -848920, -626192, 34796, 442987, -25061, 877385, -551265, -892681, -250087, 678413, 21849, 227081, 41997, 56132, 217482, 245131, -258163, -356039, -898324, -444726, -587754, -516723, -905155, -715731, -219287, 938476, 605993, 720845, -299500, -995765, -219938, -706391, 757098, -827192, 169017, 615469, 530710, -808961, -924924, 989624, -609701, 781140, 774216, 407201, -84001, -484026, -965019, -154312, -822565, -735613, 847404, 929806, 226571, 698189, -679824, -802634, -181419, -566, -393260, 351790, 13287, -77752, -351517, -381860, -890168, 884049, 598939, 906970, -762028, 303305, -380876, 792572, -107674, -856046, 48232, 78875};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques497(){
        Integer[] array = {-207529, 984127, -516791, -25483, -454321, -691746, 487055, -843550, -549581, 121264, -364149, -670020, -552888, -750051, -512268, -323022, 469530, 225950, 551339, -882825, -637889, -385593, 512976, -651010, -57997, -438654, 263872, 885734, -139339, -749178, 408420, 948703, 48474, -469413, -346331, 361128, -232110, -44071, 752110, -69834, 845923, -619364, 555892, 563357, -6069, 896882, -829168, 371584, -92964, 988181, 636131, 227095, -327942, -164280, -955245, 59384, 785824, 410046, -106637, 215613, -297708, -460884, -481152, 234932, -814191, -638547, -596305, 8371, 131414, -498627, 926216, -601623, -829124, -914996, 944654, 619393, 44982, 98604, -840417, -884845, 775952, -700864, -782148, -264403, 453936, -973483, 77189, 707243, -563944, 44134, -81632, 330034, -283793, -768101, 210893, 903656, -752184, -716864, 397243, 467737};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques498(){
        Integer[] array = {197159, 923615, 622289, 900908, 219470, 546417, 411160, -387014, -987531, -115642, 111158, 219716, -849361, 321841, -240315, -420584, 499482, 684109, -738523, -163124, -987841, -257463, 735752, 215813, 555276, 577926, -911673, -633906, 903956, -140369, -276533, 33619, -700778, 942202, -474718, -855684, -499843, -815602, 518230, 524022, -673152, 621556, -549411, 134075, 52061, 956859, 48844, 799492, -225204, -34674, -782206, -90331, -316012, -568398, -189632, 547101, -660822, -905734, -692510, -406181, 189070, 998535, -487566, -462742, -248929, 763760, 211859, -644746, 135715, -165276, 697138, -71708, -189047, -357776, -756581, 719521, -239578, -145396, -807140, -684354, -103122, 391899, -47612, 950992, -715101, 622493, 722830, -521608, 464869, -980236, -18025, -666192, 556706, -563675, 382821, -869935, 753240, 179244, -116599, 988800};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques499(){
        Integer[] array = {757068, 314661, -523406, 604422, -672880, -526552, -717211, 32565, 266790, 148890, -487981, -683006, 450732, -109273, -390794, 665130, 190672, 791103, -519623, -745507, -306100, 557385, -953737, 573065, -736194, -238438, 544172, 299062, 313622, 139783, -79083, -38602, -654819, 800148, 130581, 240510, 840803, 258882, -661807, 448383, 863758, 647607, 67001, -522015, 544323, 983180, 924771, -753642, -274249, 243783, -784806, 585084, 763768, 271632, 435769, 189277, 56081, -829554, -804666, -850160, -224447, 198071, -356591, 927758, -433871, 96385, 28100, 540026, 862035, -708901, 151865, 43036, -518059, 50696, -148715, -798420, 333799, -671545, -116690, -374351, -742637, -712673, 681594, 221911, 882056, 456594, 250052, 628197, 936958, -339727, 445468, 64118, -848811, 440777, 174306, 561584, 401634, -578143, -532751, -10865};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques500(){
        Integer[] array = {845118, 493861, -884026, -595640, -461949, 729707, -410742, -216434, -497049, -571062, -449558, 397865, 79925, -550797, -956635, -505214, -427037, 571702, -609044, -364739, -791911, -831493, -192062, -587773, -789523, 763375, 577791, -497244, 920940, 307898, 95804, 917314, -998833, 652770, 958619, -65347, 203748, -548079, 275051, 465114, -294752, 850649, 593311, 911114, -367594, 329452, 742991, 844186, 769920, -535289, -933478, 967291, -177298, -378624, -556998, 380759, -700942, 740570, -564578, 657239, -407513, 491602, -147567, 750756, -356100, 607105, -669864, 645204, -115254, 99507, -771126, -860512, -163346, -466434, 219986, -196095, -587210, 335429, -208963, 628925, 489226, -944737, -159251, 455643, 775475, -952684, 795524, 165104, 871069, -698020, -724439, -507356, -325452, -96556, -925790, 18928, -17867, 862993, 300040, 188713};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques501(){
        Integer[] array = {-401553, -485158, -898889, 444976, 611608, 88870, -617376, -392949, 263911, 597997, -969384, -630454, -272417, 968033, -689617, 239695, 93801, -580044, 522803, -318122, -280580, -237427, -557108, 4917, 312332, -925980, -821629, -45230, 202009, -242918, -538020, 601586, 904936, 624000, 95507, 742584, -540581, -921238, -127087, -834484, 490143, -894184, -496323, -693065, 192741, 319798, -213454, 309448, -529973, -755883, -846949, -361852, 775534, -830674, -222449, 613208, -249680, 592557, 977886, 587007, -945962, -962545, 628324, 192978, -795140, 20513, 688611, 468422, -166501, 849158, 3120, 860682, 142125, -76714, -372529, 99832, 147056, 534189, -632290, -39014, -742074, -783034, -627237, 274045, -234278, 670521, 371126, 945247, -662199, 346319, 955413, 50447, -185539, 474462, 952125, 538847, -478660, 359851, 186168, -344447};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques502(){
        Integer[] array = {779241, 971703, -879892, 889120, 842038, 598409, -230591, -955773, -519673, -992165, -73940, -390484, 461846, -803828, 517222, -707911, -20094, -36057, 472966, 752114, 534657, 237169, 438262, -940095, -745140, -173268, -418843, -287390, -399922, 442214, 802187, -732581, -653587, 810938, 606506, 475271, 556507, 545309, -18589, -798615, -986099, 285955, -55909, 732964, 143998, -765837, 323431, -662410, 80425, -172855, -219207, -708360, 984646, -573839, 877278, -795304, 941805, 815849, -694603, -487106, -580233, -983815, 788403, -437824, 310046, -823852, -496404, -709652, 378477, -578373, -261858, -249776, 292396, 723382, 343666, -225597, -502072, -130994, -508611, 122656, -58827, 227129, -735177, 57101, 156787, -575735, -803799, -704401, 928665, 825048, -467257, -820088, 457906, -891933, -458118, 301881, -357469, 847320, 349499, 7293};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques503(){
        Integer[] array = {-476445, -260717, -789729, 703661, 911448, 647821, -199474, 770377, 515986, 166115, 627412, 727130, -183654, 605593, 695703, 602126, 947084, -420059, -154094, -844750, -845656, -242135, 56253, -345852, 339902, 253316, 611101, -823602, 35337, 190155, -431677, -290546, 196955, 665440, 353110, -726299, 742211, 867777, 500340, -560204, -684015, -14790, -354066, -94102, 33459, 14619, 276476, 173359, 188121, 910905, -313738, -909008, 431856, 110362, -973508, -926146, 21905, -146415, -410304, 465337, 515098, 125467, -346388, 715943, 419004, -669241, -379343, 407326, -892188, 254190, -689381, 536342, 691305, 807498, 771597, 662754, -44841, -277375, -231982, 547428, -206582, -205925, 803986, 702371, -425968, -149094, -298252, 906222, 908986, 531799, -9140, -353463, -782747, 407163, 326580, -113149, 101033, -297972, -780965, -394910};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques504(){
        Integer[] array = {326601, 979431, -435667, 202105, -174196, -278793, -925267, -79798, 183190, 965057, 727614, -129595, -761830, 756403, -333378, -650528, -624262, -841242, 935677, -495719, 661096, 614169, 666977, -112916, 857396, 915614, 613451, -668772, -493975, -669185, 167779, -155734, -286605, 253185, -155654, -254754, -196954, 668656, 585574, -28351, -375664, 88122, 946616, 557755, 82317, -714149, -215650, 415003, 949381, -998472, -821442, -292873, 966933, -24454, -535545, -836670, -634169, 343212, -764731, 427177, -807306, -301736, -764215, 812565, -499389, -313234, -376444, -58962, 86451, 894284, 11314, 326382, -75599, 810865, 17097, 851730, 514074, -466613, -719426, 482798, 990717, 760269, 952924, 244009, -172710, 582781, 333477, 871812, -922706, 172350, -927791, -350754, 687337, -854403, -443728, 318053, -491444, 418469, 282341, 155020};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques505(){
        Integer[] array = {-31569, -802895, 663359, 800174, -344164, -137711, 174668, 958500, 416595, 749985, -560698, 876785, 133766, -289301, 290463, 378634, -79646, -788943, 256055, 164482, 511729, -23272, -724812, -861672, 195635, -644075, -703668, 669526, -101053, -227449, 137295, -593152, 309236, 490042, -583194, -295589, 886533, -319640, 563908, -585234, 346529, -853427, -472389, -429869, 892614, -326583, -56, -650402, 198378, -864378, 144378, -899947, -201280, -338349, 203033, -532050, 343700, 532381, -375903, -22410, 961671, -368706, -138102, 800671, -808525, -700304, 3821, 463035, -11526, 705421, 418840, -649080, 851822, 859079, 672009, -418358, 588216, -225658, 644916, -504045, 219815, -828452, 705986, 62750, 417854, 319498, 918627, -119515, 524632, -643182, -26829, -721169, -152317, 266763, -424095, -53255, -945127, 412759, 789550, 204666};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques506(){
        Integer[] array = {21985, -80613, 579344, 151193, -465963, 517601, 714324, 720147, 635929, 999568, 85674, -896961, -920692, -635043, 714886, 923064, -379376, 930510, 205203, 22135, -545389, 944611, 196109, 563532, 870242, 286900, -348027, -699020, 561205, 242782, 947526, -926808, -672764, -302231, -61317, -453184, -483201, 626893, -474446, -127677, -378726, -239219, 946711, 792926, 499564, 788204, -828088, 998595, -877012, -594422, 632575, -818991, -980569, -163832, -978720, 437601, -667439, -263149, -885057, -126222, 515282, 707418, -864373, -707073, -445176, 327718, -803590, -808287, -798783, 919282, 683653, 803710, -75031, -32209, 112635, -563427, 732776, -927889, -657914, -217622, 950426, 515928, -15614, -446747, 862693, 776201, -560983, -871596, -963244, -810649, -925749, -198854, 662770, -63107, -372741, 611234, 347782, -171827, -488920, -901436};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques507(){
        Integer[] array = {-872844, 815364, 292207, 36641, 137690, -968704, -256124, 715066, -965142, 38206, -766253, -775003, 316391, -919849, -962846, -805776, -926534, -988030, 342211, 311467, 863291, -827388, 97933, 17176, -727180, 396092, 1565, -381423, -437977, -994271, 310771, 477721, -676089, -579503, -932112, 508564, -832717, 576766, 126968, 986218, 459282, -127378, -335073, -246489, -358758, -110663, -742393, 526312, -442292, 487884, -955476, 54628, 867389, -821817, -375202, 316006, 15595, -784445, -511738, 851225, 423742, 961166, -366724, -105836, -368766, 72689, -816834, -10822, -725227, 277412, 293753, 73694, 498647, 958516, 791367, 136316, -613546, -952445, -749550, -613922, 532682, -69152, 407412, -406493, -230162, -537702, 203592, 818288, 958901, -171319, 170630, 718527, -523359, 509569, -420175, -85154, -17359, 451922, 790699, -859295};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques508(){
        Integer[] array = {371144, 980978, 712622, 35227, 703634, 319718, -732553, -800173, 771712, 996212, -560275, -362083, -837913, -180751, 110513, 756256, 916956, -278547, 506573, -184478, -373310, -104599, -857503, -178539, -237327, -832739, 269937, 53149, -51688, 370220, -483993, -240898, 399724, -98181, -911661, 489135, 912689, 548006, -434992, 704537, -193160, 740335, -341674, -278336, 783595, 606721, -200234, -226733, 770262, -442605, 510194, 789354, -707165, -549421, 499534, -425155, 732854, 246849, 773402, 51522, -335097, 93115, 456626, 600475, -96522, 947002, -632445, -40085, 161432, 434781, -675098, 6064, -66056, -195636, 223792, 339290, -823157, 452065, 125392, 714803, -652395, -500160, -632669, 21949, 544846, -416917, 939317, -74809, -221864, -152102, 799918, -258197, -519127, -342482, 793408, 496661, 274755, -25025, -965032, 182653};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques509(){
        Integer[] array = {-369162, 960037, -344482, 947494, 220653, -798770, 216256, -453354, 472719, 498643, -588500, -120614, 437441, 70043, 521784, -236627, 32685, -509230, -317121, 330684, -679348, 444182, -680216, -579125, 774408, 899716, -671628, 514006, 428950, -925302, 516576, -557076, -755660, 514289, 613507, -666266, -394051, -875854, 640780, 518388, -446009, -310664, 710887, -34671, -227570, -509168, 445723, 477807, -652171, 626182, 386753, 443403, 145526, 483873, 191638, 875665, 500649, -873966, -343214, -740120, -956287, 823692, -826975, -544790, -155127, 616535, 397621, 647992, -167081, 219775, 921193, -923513, -187103, 579857, -896812, -416109, 569773, -518076, 550086, 248109, -697881, 583667, 327607, -128471, 961596, -285884, 203412, -909354, 471387, -943494, -540751, 324047, 628727, 201319, 143641, 747512, -849459, -145438, 10185, 858449};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques510(){
        Integer[] array = {675568, 850067, -487152, -78405, -482500, -906533, -907762, -626443, -524020, 245081, -489502, 882126, -734754, 782967, -863288, 856112, 342358, 775660, 51565, 903241, -41371, -414495, 572340, -550438, -520329, 725498, -435221, -143161, 667385, 719736, -898249, 770069, -756639, 720579, -898650, -212814, -969074, 590151, 672554, -911500, -703072, 30343, 809472, -896100, -277814, -343964, 532826, -900461, -364960, 151384, 887463, -667555, -388596, 597266, -807884, -819245, -55666, 425100, -750070, 668849, 156057, 331941, 899104, -419131, -387721, -891858, -868472, 285382, 761066, 920375, 913685, 534432, 358167, -204073, 339637, 368930, 87242, -665075, -803404, -265838, 389674, 356279, 47799, -428275, -403245, 190169, 259525, 717796, 851193, 186454, 390878, 875260, 737225, 913415, -693974, -88830, 824094, 638069, -392477, 722956};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques511(){
        Integer[] array = {670641, 50963, 856438, -366939, 121377, 679861, -245379, -858319, -565252, -606406, -446911, 313751, 642910, -449013, 133664, 782417, -464875, -370498, 503319, 615402, -181827, -299037, 100743, 613142, 925822, 254031, 191992, 580266, -372502, -649172, 39312, 413156, 340936, -165017, 167490, -329469, 935074, -321224, 413620, -701032, 928315, -482462, -644469, -625830, -817838, 594450, 23945, -644834, 347612, 678746, -187371, -413871, -563148, 861813, 720090, 164716, 695259, -900333, -936643, 919029, 76266, -434879, 298051, 713717, -970169, -475989, -457711, -79909, -465122, -68626, 553191, 810450, -209770, -511490, -763688, 734913, 168870, 902659, -239516, -736920, 174689, -595073, -201007, -901096, 881536, -269167, -355646, 580435, -571477, -698145, -779996, 127458, -290607, -351371, 212202, -314971, -185663, 79014, -275705, 930680};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques512(){
        Integer[] array = {457724, -219737, 949267, -970104, -867068, -108245, -633144, -291999, 905252, -354097, 304924, -848927, -393970, -852219, -707098, 612634, 489998, -99790, -701996, 928451, -899806, 552310, -567702, 531060, 764549, 451629, -859754, 646425, -930765, -295993, 238867, -795202, 67595, -223384, -36227, -850505, 623751, -769438, 65286, 60583, -716568, 328715, -231521, -721210, -930811, -493855, -8359, -342877, 572808, 287249, 116781, 537786, -800602, 177977, 755201, -980923, 435605, -92812, 475697, 378245, 465185, -998096, -272338, 312547, 364843, -796285, 639282, -902408, -731803, -469669, -700287, 246769, -331613, -695127, 274311, -789249, 658592, 578171, 125741, 269623, 21695, -303449, -220554, -368722, -201244, 487522, 157390, -199532, 887341, 662270, 657964, -875512, -583234, 329962, -712843, -171362, -346316, -198461, -111520, 769159};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques513(){
        Integer[] array = {520297, 215560, -218095, -356938, 863244, 498960, 227885, -183663, 489414, 239934, 988315, 313894, -852217, -257234, -176950, -378765, -662267, 930345, -282573, -204202, 212132, -436560, -237039, -518043, -529636, 3242, 545835, -55646, -828999, -58796, -434157, -501314, 674552, -992514, -813826, -370598, -106349, 157984, 605743, -402084, -50972, -481854, 975408, 547488, -765511, 873619, 704423, -92557, 328540, 636978, -536674, 189864, -594528, -377167, 784698, 538559, -137460, 833105, 367843, -454706, 911542, 419708, -198797, 395122, 265203, 696314, -786288, 375926, -786044, -146881, -319280, 466748, -307007, -72338, -427122, -545772, 350448, 177676, 376819, 697643, 439050, -888412, 503317, -158537, 433695, 414417, -799592, -720324, -328052, 854890, 671231, 635638, 501379, -958784, 577664, -769749, 212765, -949153, 183423, -917686};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques514(){
        Integer[] array = {-717676, -155379, -867176, 346061, -268336, 386351, -72241, 765846, -781384, 627411, 69702, -24720, 3727, 944609, -432608, 28297, 62685, 63123, -979788, 812508, -962718, -231245, -685740, -426089, 752766, 266817, -254981, -266551, -992565, -51389, 310203, -908277, 636192, 728078, 667216, -785479, 709134, -471061, -816698, -500651, 536954, -10674, 347193, 587659, 639184, 897437, 3067, -988184, 163793, -443982, -441209, 162576, -80023, -394415, 240342, 521287, 445424, 191338, 862607, -523493, 553122, -691677, -309278, 600292, -824792, 351893, 233576, -639566, 999373, -6029, 669141, 639613, 952861, 182060, 43315, -530234, -395701, -765082, 712043, -223207, 324948, 280917, -671379, -559896, 563265, -175824, 190734, 489218, 202178, 494285, 661829, -484353, -655612, 39512, 944371, -359894, 308699, 978226, 42388, 703469};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques515(){
        Integer[] array = {-4139, 184899, 840702, -280344, 750475, 241011, -209182, 476880, -565026, 496879, -613154, 394771, 776475, 845208, 58398, -195860, -116944, -184693, 776647, -566034, -532879, 637035, -389965, -729879, 429366, 393256, 914732, -292687, -820540, 750842, 392258, 224770, 341173, -599571, -85354, -818339, -531870, -390482, 523521, -742093, -305615, -571277, -891967, 266170, -903783, 624925, 793865, -897643, 352840, 207311, -247767, -622695, -7420, -292019, 392988, -201135, 182407, 922661, 831813, -709371, 483276, -396883, -256020, -851712, 118243, -300098, -322767, 597809, -148100, 734300, 930021, 450843, 21475, 527191, 691302, 546869, -728917, 169723, 367279, 927780, 48610, -191524, -608808, 970065, -200323, 606745, -143079, -186020, 601372, 824636, 141773, 839825, 405039, -717665, -851600, -868889, 819464, 692798, 119567, -560895};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques516(){
        Integer[] array = {-404029, 905887, 11040, 666692, 202847, 608237, -27222, -91843, -117270, -353370, -820622, -219033, -550675, 845035, 585915, -39681, -359757, 852771, -906124, 639779, 555994, 317967, 508710, -597889, -211279, 768322, -424512, 159688, 23722, -940197, -152766, -359346, -906459, -295092, -441367, -56389, 673560, 469612, -809270, -708445, 836236, -808848, 616885, 826825, 496546, -281414, -376760, -931061, -220386, -335065, 577533, -580448, 823843, 24241, 646519, -380676, 719271, 250634, 651703, -210335, 677462, 252637, 881483, 366675, -155222, -253770, -155977, -471119, 644210, 63637, 426276, 275697, -592452, 287021, 710077, 956777, -173400, 840532, -73135, 512919, 847769, -455918, 622282, -98985, -267970, 962398, 656547, 733993, -464565, 792375, 322729, -190737, -368833, 229885, -236950, -320288, 478159, -980108, -831970, -932063};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques517(){
        Integer[] array = {64392, -582362, 463333, -15421, 471558, 99869, -959875, 690273, 248577, 173314, -704936, 922615, -58575, 870256, 609956, -29106, 385967, 136955, 451177, 288599, 859147, 751789, 31265, -679266, -489164, -414769, -30123, 915412, -393988, 104231, 293429, -360148, -438193, 325708, 12484, 673530, -196007, -546478, 777145, -727839, -364703, -419015, -595750, -766702, -429955, 502084, -688396, -166747, 385565, -773555, -369702, 461524, 151292, -218540, 926558, 580082, 172591, 405583, 894131, -975947, 239211, -209490, 368337, -584781, -654287, -596079, 701772, 118315, -604129, -117021, 316241, 903815, 623322, 79843, -338226, -269458, 835473, 711051, 394368, 881343, 148528, -574379, -512231, -530161, -113238, 913739, -314996, -994865, 189361, -643831, -992718, -527251, 608739, 28208, 18937, 445443, 547767, 824566, 826483, 522076};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques518(){
        Integer[] array = {-328924, -846783, -712409, 281507, 767249, -356520, 296700, 283093, -821672, -202313, 25952, -189010, -182467, 370293, -627774, -686064, -847634, -423794, -158370, 89084, -845210, -932031, -70584, -529862, -972969, -516406, 204528, -791949, -76864, -777323, -870281, -329935, 610307, -569835, 531323, 373475, -921469, 293255, -45029, -574887, 755917, -28867, 328360, 615193, -61775, 763137, 739036, 96405, 879756, -16211, -155331, -138076, 816241, 545985, 693662, -393344, -437435, 369365, -53765, 964523, -666397, -422644, 775393, 559010, -669164, -860760, -473858, -313748, -596948, 832326, -907439, -374396, 239466, 457642, -296356, -848984, -33533, -866502, -307526, 127937, -280575, -835405, 140425, 938556, 778043, -692602, -213389, -889386, -180378, 794640, -134446, -70852, -547590, 472941, 983007, 654304, 8325, 766928, -837920, -456046};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques519(){
        Integer[] array = {916605, 574980, -877838, -583183, 720059, 34304, 498306, 434404, 67797, 506477, -917991, 299890, 166502, -196119, 292323, 74571, -687694, 828759, 654696, -597260, -799282, 178487, -570471, -62831, -914975, -36854, 397549, 75546, 328531, -593921, -345654, 413215, -486791, -368523, -290571, 562202, -528976, 161854, -389192, -224181, 718112, 68671, -566676, -215700, -923882, 745635, -394491, -276226, -379202, 914009, -685664, 853208, 390434, -439590, 386108, 765024, 837758, -471183, 568669, -954956, 251618, 368315, 103106, -94550, -555470, 85461, -438009, -476928, 695417, 790727, -11803, -982362, -418209, 874052, 768659, -595917, 596809, 917515, -122304, -243785, 756796, -969933, 987621, -73942, 205129, 716112, -994907, 436230, 902676, 797881, 638001, 610936, -584581, -411149, -550695, -174466, -292651, 250305, 60833, 724461};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques520(){
        Integer[] array = {-589597, -344276, 440668, -938424, 299547, 524865, -855919, 762736, -607333, -241707, 753454, 288332, 791552, -904669, 418153, 649657, -809524, -4312, 469786, 191615, 485627, 141285, -491638, -65165, -439690, -639804, -296751, -382946, -581691, 352312, 116163, 432227, 888612, -422072, -966844, 371181, 301365, 644769, 709609, 418355, -199982, 115986, -373125, 309652, -779502, 655668, 153786, 273307, 272833, -449445, -740636, -982876, 640665, 499451, -328081, -148894, 303198, 615483, 13548, 565218, 201058, -986945, 589644, -611460, 645395, 816106, -63661, 746825, 266358, -210474, -158202, 156606, -979668, -732834, 243684, 331237, 919968, -944762, -973685, 69048, -595587, 800695, 936199, 692562, 892889, -556494, 16151, 308463, -348497, -315509, 116520, 130859, 717319, 692662, 358949, -227573, -245672, -836508, 199146, -804260};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques521(){
        Integer[] array = {69783, -773033, 397366, 699247, 382871, 724492, -398472, -958529, 359719, 320682, -66050, 806697, -110827, 939466, -22093, 65168, 986790, -860426, 995253, 39798, 210035, 290346, 613639, -480844, -561627, -594902, 691560, 400970, -286870, 848876, -727646, 218024, -797209, 334511, -105055, -341923, 167144, -472461, -839073, 234110, 353844, 719761, 413772, -160106, 593199, 586767, 442712, -767917, -761833, 64937, 846895, 812191, -886705, 380695, 990218, 924311, 918269, -418595, 524758, 94938, -454339, -75159, -149196, -774261, 110171, 523730, 955225, -777984, 92803, -510441, 388794, 419549, 503256, 701713, -876476, 644194, -357561, 977283, 142504, -754322, -163839, -126184, -272597, -200174, -35290, 159809, 903794, -888927, 666356, 596914, 159600, 816889, 631091, 550102, 373927, -383634, -637155, 342046, 389474, -751648};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques522(){
        Integer[] array = {-954219, -896162, 349191, -774912, -649959, 847861, -740613, -766899, 353207, -630872, -641202, -797960, -221153, -305273, -17060, 552010, -636570, 415855, -458079, -617909, 623303, -509363, 269575, 969573, 523078, -274348, 48340, -715855, -116624, -903387, -91414, -189538, -102678, 236567, 309399, 227982, -581600, 751280, 974155, 400430, 674315, 310816, -54011, -253289, 72157, 967308, 690271, 49070, 821459, -733994, 119023, -465664, 446231, 765614, -229643, 65626, -778035, 10605, -467763, 606068, 871008, 579826, 48092, -416039, -488150, 373107, 697089, -472944, -667837, 159030, 335280, -872327, -345967, 914685, 128794, -15804, -761563, 834570, -117971, 188133, 867996, 241972, -702445, -678825, -650405, -293695, 291162, 327247, 692674, 806026, 791127, 684357, -597477, 874619, -792370, 402399, -28844, 324850, 41455, 895745};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques523(){
        Integer[] array = {-15048, 270371, 314243, -577315, -680102, 108556, 296415, -444108, -140727, 132567, 757145, 510713, 54815, 386862, -161505, -466347, 865555, 710755, -260649, 326896, -834321, -542561, -561545, -679246, 866518, 690175, 677097, 81666, -469546, -921994, 721147, -681955, 222551, -672860, 221009, 900654, -689169, -493598, 691968, 424620, -576669, -267556, 471967, 717818, -164701, -664630, -207713, 568716, 656071, 327342, 392133, -151493, -235977, 793380, -401850, -305924, 309932, 534239, -463442, -268039, 45475, 556192, 332018, 924053, -845009, 68077, -868120, 158235, -503253, -567038, 84268, 180400, -251853, 264995, -123400, -272516, 341907, 489325, 274267, -67244, 641245, 239184, 876602, 384564, 616012, -310974, -88525, 890633, 662253, -672527, 851785, 546477, -994401, 730223, -916642, 351592, 296621, 84581, -631578, 605716};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques524(){
        Integer[] array = {-250661, 835168, -250753, -508741, -348664, -139075, 440782, 388027, 825008, 724110, -886375, 185277, -331693, -903092, 419074, 186975, 582113, 350217, 545172, -261868, 732868, -76276, 275046, 350471, -988761, 270133, 669837, -988416, -738360, 498617, 566830, -226772, 374843, 918518, -863659, -674079, -568816, -310618, -917468, -42729, -277623, -204848, 84774, 743371, -633170, 524463, 837920, -326282, 602859, -623239, -535963, -763540, -367975, 149298, 25548, 285911, 553249, 849926, 356458, -999054, -548826, -929059, 334269, 414998, 899302, -757210, -456334, -426000, 773585, -646444, 386713, 237850, 336723, 161305, -703074, 512836, -264713, -533683, -729163, -703286, -613678, -827344, 257115, -438872, -507745, -832197, 453631, 659664, -272111, 299840, -319644, -746993, -497347, -97091, 28742, 607554, 922302, -511327, 258359, 963229};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques525(){
        Integer[] array = {259201, 946976, 101021, -799490, 142099, -355409, 126823, -732356, -688998, -137730, 372234, -99863, 934489, -499326, 314089, -713171, -41902, 563386, 135867, -331431, 693025, 194166, 641616, -799754, -229082, 589575, 560322, 174833, 742738, 195278, -632781, 601191, -729074, -378630, -351910, 337466, -248168, -622474, -520936, -556366, 293388, 825117, 21491, -639310, -108757, -687323, -885790, -234475, 796358, 181657, -307662, 291798, -79874, 84576, 596480, 218401, 879645, -248518, 433907, -126060, -819875, -108452, -343538, 389202, 287163, -330956, 632346, -153755, 760817, -890894, -327029, -278563, -775822, -187485, 655943, -330181, -559004, -772676, 132426, -746514, 621270, 141669, -327633, 114297, -163304, -451124, 413961, -893711, -987507, 902114, -485017, 125171, 444795, 430045, -616690, -764152, 870706, -466448, 67797, -137612};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques526(){
        Integer[] array = {-253154, 967104, 119840, -682635, -522895, 265935, 693704, 128595, 522588, 597630, -574022, -596496, -929214, 342644, -4648, -596781, 332224, 697603, -978991, -622205, -689695, 780412, -792713, -202355, -54008, -212580, -51390, -267254, 445151, -794594, -608834, 971238, -716439, -311232, -304020, -489461, -378638, 199638, -90126, 661031, -356067, 388972, 279356, 479882, 670730, -56966, -184099, 399003, 964721, 568575, 305058, -600340, 570350, -163831, -517743, 11897, -846067, -448645, -357940, 778328, -848354, 711816, 386489, 153349, -534031, -94960, -369633, -631447, -98549, -241464, 650086, 634891, -561968, -850931, 523753, -659157, -718657, -971884, -125815, 676813, -869901, -831810, -436901, 476629, 970374, 365728, 282107, 692503, -91484, -630702, -70326, -478700, 890499, -354073, -988896, -956917, 332024, -548826, -896953, -844405};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques527(){
        Integer[] array = {-551955, 863083, -245923, 699918, -479873, 938319, -909913, 984192, 173012, 319075, 287204, 181166, 623336, -303450, 901766, 934822, 942460, 738894, 842680, 267020, -238794, -635643, -578606, -925722, -697659, 169064, 290568, -718754, -231220, -916504, -888815, 463399, 73340, 228510, -735498, -262869, -432533, 674576, 124755, -356191, -221360, -794015, -893664, 90228, 943295, 21686, 172466, 719421, 675608, -844117, 433043, 910918, -920790, 39500, 7656, 534227, -420317, -452613, -243142, -913061, -845077, 360590, -582915, -832463, -298277, -959233, 90463, -953782, 787175, 59070, 876774, 710929, -772678, 732509, -604043, 76444, 474628, 76678, -790934, -934080, 237334, 690621, 722694, -204917, 507128, -976241, -417690, 593317, 925091, 29513, 263710, -687159, 990926, -333247, 178199, 179824, 738120, -228381, -445914, 135394};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques528(){
        Integer[] array = {734219, 204302, 67768, -406087, 47826, 100609, 790895, -698337, 32565, -101416, -245878, -183270, -141325, 288044, 898855, -560637, 966851, -735102, -504161, -536010, 459265, 673309, 302580, -139348, -70396, 459087, -390841, 959273, -255817, -760677, -747297, -87669, -696083, -157380, 166746, 70052, 815158, 497558, -388278, -905323, 31496, 91520, 223093, -352010, 138049, 878966, 981064, 216530, 215728, 469048, 705988, -500601, -432679, 794753, -463868, -552313, -435528, 431948, -466753, -874239, -346667, 524719, -961962, -522156, -414768, -462739, -767861, -873821, -399174, -872631, 148487, -751641, 510863, -762940, 447656, -920082, 269089, -770133, -419161, 197842, 745488, 470245, 682424, 512181, -931802, 943544, 207661, -521251, -642933, -920707, -629317, -297678, 551363, 750488, -672684, 921572, 693530, -963361, 843594, 894782};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques529(){
        Integer[] array = {-887047, 135057, -278128, -839193, 578143, 461860, -546884, -17073, 232615, 376615, 999335, 885469, -159841, -768628, -278477, -445358, -536107, -197021, 112231, 705198, -59354, -789197, 428034, -224190, 250572, -322849, 504379, -826503, 839140, -608302, -903568, -559958, -879503, -407040, -84230, -769988, 617429, -368489, 959532, -245175, 382581, -174249, -716704, -19206, 786808, 257766, 82437, -319326, -854471, 385547, -940595, 492697, -956251, -678305, -137208, 519240, -28546, 276585, -354105, -518821, -731021, -569966, -112747, 708636, -736633, 881121, -731782, -905331, -847941, 116369, -735984, -883732, -813048, 636213, -40518, -539009, 327194, 876402, 991203, 163682, -966842, 355409, 218546, 451968, -614564, 772131, -628864, 394716, -189725, 445858, 622953, 89076, -259221, 243848, 729111, -95201, -66633, -636704, -393318, 521285};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques530(){
        Integer[] array = {-361224, -385585, -831364, 699796, -521804, -662895, -864977, 80669, 444554, 275525, -29087, -294949, -766059, 286722, -670220, -576927, 113069, -41782, -149904, -328589, -264641, -157816, -648344, -928377, 885950, 89634, 623244, 64063, 964174, 669217, 501399, -178665, -569749, -663276, 508609, 51458, 440680, 43116, 522586, -229301, 756231, 260438, -317554, 440780, -922200, -873345, -499461, 407470, 88572, -134247, 615774, 469592, -9113, 186675, 877942, -859558, 710127, 618105, -480282, -901447, -236562, -878295, -909257, 59717, -99663, -652545, 676363, 875833, 768595, 680748, -75165, -935259, 624678, 723504, -228182, -621109, -507131, 961950, -252008, 962822, -359671, -481543, -80441, 163796, 151095, -442791, 531421, -956103, 338911, 147661, 236315, -426888, 603113, 934856, -795322, 475824, 880192, 67247, 312349, 757693};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques531(){
        Integer[] array = {633026, -274899, 229225, -790010, -75110, 812219, 950943, -773384, -359135, -328478, -886616, -677700, -675011, 748988, -111097, 311762, -817737, 909452, -102943, 735624, -844223, 163242, 109940, 996796, 880055, 77400, 744217, 879712, -847313, 645396, -846363, -643383, 778269, 599175, 638686, 238537, -607931, 188223, 671547, 107255, -660486, 410959, 924934, 537324, 887454, -458417, -989080, 411805, 40608, -890782, 89939, 566402, -357629, 347683, 323875, 491152, -862375, -24455, -900531, 712784, 282670, 296388, 347339, -746975, 52136, 372494, -451031, 34387, 620379, 229923, 21194, 191991, 164056, 545753, -783316, 831859, 523133, 711182, -586921, 815667, -298134, 178401, -664842, 845026, 766072, 205316, 353646, 424317, 77887, 489906, -624057, -421895, 128038, -726278, 507478, 761162, -639647, 869291, 26934, 999929};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques532(){
        Integer[] array = {785415, 154571, -941531, 598037, 731350, -508390, -209814, -769500, 331468, -232414, 713417, -84904, 652853, -668452, 131013, 684619, 849037, 190174, -142905, 371485, -985898, 518271, -323633, 52552, 525155, -693439, -296242, -158029, -292185, -565542, -842696, -620556, 933281, -40058, 773629, 370598, -141780, 826490, -185370, 401758, 778200, 389427, 235678, -34636, 262463, 680331, 101715, 669383, 872455, -921846, -247672, 529153, -735884, -109182, -520639, 851320, -687014, 747115, 661901, 629366, 461817, -572368, 95546, -34619, 722558, -559092, 366988, 322324, -138837, -787843, -739962, -672832, -27429, 978381, -813393, -959424, 509761, -131504, 293579, -505287, -407794, -9508, 655624, -797361, 51669, 956401, -81474, -582619, 753734, -653767, 705214, -578890, 784875, 552456, -63092, 940007, -953092, 672144, -439523, 867676};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques533(){
        Integer[] array = {-243677, -618976, -505894, -317100, 553835, -401290, 679074, -176982, -449707, 691850, -645550, 480266, 544197, 545933, -211603, -867704, 621351, -289177, -522733, 365798, -822524, 357613, 907776, 974614, -700960, 922739, 688326, 200564, 270480, 463039, -791425, 19420, 919883, 333760, -997471, -804480, 652660, 321833, 825488, -501215, -125625, -685995, -118082, 229405, -331149, 522723, -928448, -477564, -847229, -972872, -876705, -24680, -266765, 972304, 973362, -230722, 282398, -70282, 741700, 919495, -835598, 775704, -874781, 701571, -742925, 711926, -685542, 498678, -426166, 388907, -707966, 510154, 583898, -565323, 308808, -328455, 813128, 269984, -788298, 238661, -905304, 703380, 567897, -876049, -868717, 286366, -855180, -887747, 31752, -939059, 964384, -660114, 419648, 738575, 139709, -615103, 299834, 941815, -830, 537184};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques534(){
        Integer[] array = {-944716, -433671, -85491, -548879, -453192, -466791, -488655, -994582, 717209, -335844, -143101, -50665, -330703, 339252, -903946, -607184, 138739, 787873, 247376, -415127, -401463, -405848, 35276, -260265, 528477, 421134, -104737, 87032, -260522, -303399, -344553, 825515, -168191, -853965, -682100, 564646, -369854, 277012, 54963, 519369, -455328, 281104, -96149, -737220, 967495, -825891, 47444, 660172, 140352, 443155, -890895, -440863, -71316, -109444, 510398, -922823, 260012, -98030, 650344, -722845, -587379, 319884, 110763, 92222, 873570, 123226, -354193, 341578, 907372, -830380, -753358, 661101, 352254, -434292, -284521, -822025, -136261, 349014, 655986, 41485, 458319, -244002, 774799, -70532, -521426, 254138, 101476, -694440, 529764, -231338, 657414, 686877, 75869, -996065, -146267, -700339, 676886, -196669, -499119, 873989};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques535(){
        Integer[] array = {-93232, -249231, 793915, -630071, -164924, -451346, 962073, 548511, 699505, 736218, -707300, 708559, 191323, 748095, -162097, 638062, -251936, -604733, -242593, 862852, 418880, 633742, 217228, -918883, 343599, 580029, -998670, 887930, 768912, -766027, 233888, -652171, 484288, 129070, 517925, -297600, 765840, -9629, 662104, -229690, -183542, 538653, 418235, 883063, 695558, -769085, -408039, -235083, 933894, 309392, -318434, 646876, 156312, 939286, 79641, 354021, -763688, -378028, 943913, -639523, -985793, -143586, -2114, -208239, -629886, 81541, -495763, -607644, -193407, -941440, 834025, -858229, 931597, 11098, -717672, 779411, 906628, 844486, 557443, 238994, -231447, 624136, 812213, -405666, -69272, -140170, 178400, 413654, -791410, -315141, 221524, -549851, -523248, -421550, 943772, -773106, -656871, 645578, 470982, 398267};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques536(){
        Integer[] array = {876140, -872556, 326216, -564866, 270482, 107739, 729814, 226928, -989972, -13612, -347204, -544435, -937030, -224837, -662571, -742246, -845435, 385517, -15451, 232100, -254398, -408659, 93903, -512366, 797811, 640441, 566965, -689406, 599699, -311279, -596668, 62070, 764732, 938316, 693262, 326731, 565306, -255790, -824413, 813959, 599151, 509043, -259172, 844908, -188358, 686973, 570412, -808345, -2582, -173538, 64795, -306200, 61864, 223375, -94522, 196472, 846820, 446059, -654787, -103721, 802650, 116725, 345753, 77087, 653627, 164190, 184548, 698735, -925900, -852973, 296174, -711458, -376960, 469543, 808685, 262136, -864063, -952830, 908991, -579227, 632723, -979188, -849028, 192490, 849882, -891970, -480390, 834083, 488077, 39330, -596239, 626563, -870509, 66833, 576625, 607644, 412062, 247990, -442529, -137907};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques537(){
        Integer[] array = {433851, -702848, 722313, 152038, 705321, 923187, -374120, -960581, -79562, 924261, 554255, 842992, -70556, 480270, -414448, -856424, -504285, 12840, -377623, 846828, -973108, -228511, 150692, -571853, -873709, -822370, 555008, -87196, 721145, 302, 40428, 483326, 783764, -26517, -43479, -945623, 309546, 109470, 999870, 477806, 225148, -117314, 703461, 965526, -811013, 507310, -637460, -752675, 631215, 823818, -502466, 337840, 650100, 205005, -289160, -719841, -312229, 341935, -300986, 98233, 679005, -549201, -120060, 448120, -946512, -418728, 662348, 83439, -301897, -879668, -791954, -468138, 191939, -288318, 189107, -810295, 89396, -767281, 511166, -498548, -149156, -204372, -913999, -713702, -872883, 552611, -589322, -16944, 367977, 927543, -617269, -453866, 799762, 682780, -928908, 405308, -539861, 975571, -118428, 587631};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques538(){
        Integer[] array = {649037, 913124, -341489, -272265, 43674, 126628, 339763, -393295, -296229, 682845, 331088, -215884, 547061, -263303, -97124, 510026, -418162, 839650, 421727, 969415, 727714, 950738, 289205, 591604, 694476, 289079, 670152, -724617, 271209, 795101, -647142, -171176, 946786, -435568, 107131, -119954, 763402, -712900, -39674, -964811, -946325, 661377, 643558, -440985, -152639, 137363, -674461, -457962, 944078, -206479, -461629, -326170, 17235, -874722, -896542, 335430, 812699, -190420, 198412, -660098, 163329, -434708, 398815, -69446, 479987, 449268, -548600, 511961, -713950, -850791, 698150, -80029, 69551, 201278, 635730, -49785, 382457, -843079, 469511, -673589, -572838, 133625, 784719, 56743, -934828, 240948, 120793, -206572, -616686, 602969, 773817, -295631, -653751, -995032, -446956, -898528, -405272, 747197, -954324, -457680};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques539(){
        Integer[] array = {511443, -37752, -159898, -110940, -121069, -208572, -351008, 997238, -959450, 908494, 889919, 545852, 504058, 974694, -543205, 41654, 887279, 901511, 303049, -464854, -382647, 233423, -835639, 277173, 597300, -52311, 99162, 396271, 386471, 721337, 82262, 791288, -351845, -199070, 818657, -409970, 988251, 666656, 250239, -978073, -393595, 649686, 496369, -429204, 613053, 845827, 52186, 837430, 746454, -208819, -807197, 901740, -76252, 611853, -452449, 365075, 653653, -93670, -725230, 498935, -536122, -760586, 76915, 17873, 659361, 51266, 763312, 82512, 642761, -7777, -887574, -504310, 550959, 646399, 612250, 165265, -24631, -711594, 514345, -984861, 136887, 140508, -696413, 464958, -831119, 797471, 83815, -567714, -716179, -511307, -324094, -360861, -596641, 924837, 179885, -159332, 294458, 73665, 959700, -172320};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques540(){
        Integer[] array = {801007, 770800, 832065, -396306, -100381, -469555, -225056, 84623, -207447, 372579, -466905, 350050, 618964, 769027, -404399, -265344, 220181, 489529, 808555, -82323, -604316, 713180, -182763, 962843, -744168, 777878, 511053, -962871, -914421, -759809, -193761, 835652, -484856, -412495, 111585, -724317, 999575, -657208, 206646, -451222, -211307, -448792, -135835, -148676, 910718, -256489, -21688, 928519, -702547, 29290, 236931, 930809, -270773, -184437, -193292, -738837, -217572, -847851, 108682, 957678, -720773, -427715, -926714, 536924, -956503, -312788, 654871, 277987, -484218, -762553, 392797, -271108, -602309, -247673, -59121, 394557, -664185, -654222, -356093, 469485, 317851, 938055, -712721, -211713, 174568, -421333, -411172, -968139, -143928, -338547, -470031, 273529, -677442, -748690, 882350, -802875, 352352, -792672, 149006, 419876};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques541(){
        Integer[] array = {-351557, 459984, 185348, -484305, 825053, -722482, -772583, 129665, 195604, 313729, -727143, 827790, 276677, 67132, 563983, -968768, 880844, 784098, -909514, -980266, 735575, -98963, -861475, 223190, -270807, 817490, -950368, 358676, -149996, 985485, -695029, -120187, -149253, 87621, -116087, -395686, -401193, -921034, 480430, -323713, 724115, -771370, -650574, 832074, 123089, 602965, -254733, 94953, -862690, 799031, 192620, 434988, -366155, 408120, -4116, 838086, -148558, 281150, 919224, -646560, 662644, -639000, -116889, 227259, -100544, 473688, 544618, 670754, -888913, 592060, -22818, -691309, -672834, -654372, -632095, -358807, -896640, -581847, -702389, -526029, 123157, -157275, -892519, 569919, -526579, 894612, 623759, -849066, -729479, -482916, -647124, 500849, -331232, 212356, 471168, 376881, 677671, 387134, 674025, -829913};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques542(){
        Integer[] array = {-622158, -942918, 499812, -244237, -431568, -514608, -39684, -120821, 457009, -720833, 809612, 646604, 221242, -217329, -284901, 659043, -641341, 966897, -737166, -780444, -954128, -41255, 369571, 122397, -714704, 570057, -995279, -325913, -578637, 830897, 531833, 62200, -533096, 212029, -260935, -600718, -277988, -895972, -552812, 302387, -522588, 746310, -133799, -882164, -383252, -874262, 385952, -393978, -993355, 919998, -566841, 650460, -590388, 212104, 578086, 841651, -838549, 469607, -901419, 555872, -66048, 712252, 856341, 391796, -760428, 677518, 231101, 157674, 822027, -226663, 523692, 764366, 203033, -994122, 773473, -605146, -518122, 692068, 308959, -635588, -513399, 374344, -592018, 830099, -935424, 468764, 36192, -279038, 736580, -983589, -600745, -352907, 75642, -787691, 990490, 984933, 327518, 223357, -412232, -66238};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques543(){
        Integer[] array = {712849, 438202, 660007, -966609, -687297, 907500, -616846, 608955, 299872, -514399, -885046, -373357, 658770, 823778, -859191, 33310, -395553, 301650, -147337, 653452, -88170, -264627, -56504, 755415, 883833, -2595, -903907, 391544, 264888, -607337, 860482, 954031, 920796, -164615, -649472, -561400, -407677, 67672, -573892, -670921, -17194, 109961, 884232, 47433, 365581, -870927, 232182, -748530, -49402, -927933, -32626, -422411, -199847, 633328, 938236, 789269, 809290, -992679, 876396, 84044, 127265, 819091, -435744, 337123, -992729, -161276, 134319, -280166, -341984, -582800, 859534, 103721, -842961, -147793, -567225, 505916, 377469, 143931, -466951, 614153, 859718, -735300, -762483, -319277, 924797, 575825, -954023, 604551, 770450, 245692, 329881, 302274, -381365, -305889, -316872, 282295, 376967, 376807, 126106, -903325};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques544(){
        Integer[] array = {-460004, -806632, -641513, -441498, 178002, -276961, -816317, 616115, -511521, 648923, 242339, 862628, 552818, -256617, -685232, 266414, 145575, -673023, 295645, 249371, -371356, -799232, -757545, 238016, 68091, -359073, 598349, -82274, -926118, 613024, -717074, -376942, 376260, -918875, 949536, -223101, -279005, -964648, 942361, 150576, 940397, -58562, -590643, 350426, -918890, -780339, -593973, 353193, -767930, -219393, 627688, -319775, -164524, -836381, 490270, 196948, 640712, 5595, 734189, -970353, 213009, 368132, 79443, 382662, -770744, 826793, -338480, 411199, -979709, -432169, -713469, 148126, 721701, -719848, -310337, 156093, -803727, 219419, 21496, -402296, -744329, 217793, -501333, -120661, 179609, 294127, -883443, -817359, 154838, 831262, -492521, -496086, -875342, 877359, 424140, 931980, -54605, 673564, 832952, -91772};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques545(){
        Integer[] array = {637887, -882387, 497148, -792523, 279787, -995052, -385517, 685683, -196155, 382051, -523176, -583643, 268758, -601002, 964366, -336307, 278788, 507843, -689399, 183775, -190830, 320207, 319986, 493751, -872242, -220625, -648187, -419529, -895918, 514322, 602177, -61511, -687893, 574137, -751253, 739553, 884166, -742149, 733867, 32714, 894083, 662418, -77607, -280546, 878762, 212682, -857777, -318692, 462082, 82956, 578181, 208664, 935124, 854797, -901863, -770368, 878789, 753339, -394986, -719816, 307382, -30218, -327071, 735760, -42386, 809492, 157046, 148386, -797895, 683536, -169346, -884090, 165066, 739353, -953573, -817436, 951393, -417045, 676201, -214345, 775591, 938284, 869884, 564920, 494563, -120584, 696013, 414787, 771050, 101259, -884415, 166527, 710144, -480082, -526971, 914966, -224057, 782952, 26432, -656205};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques546(){
        Integer[] array = {-781173, -244944, -119592, 595480, 932467, 425582, -271473, -536507, -629409, -483459, 931320, 709897, -951549, -160655, 916887, -441037, -203836, 886861, -756132, -541318, -915901, 677375, 782479, -13282, -525081, -780739, 250686, 977480, -375413, -83932, 240849, 95384, -996541, 688041, -471825, -330304, -989344, -733159, -357998, -388126, -270530, 622515, -415536, 539668, -299944, 80254, 975420, 430007, -361334, 555232, -45169, 707245, 176802, -940940, 349114, 793989, -181836, 689375, -955712, -513388, 418448, 786976, -26778, -641618, -653722, 433082, -922235, -124203, -900711, 278963, -845884, -577824, 876876, 577748, 51711, -953668, 839044, 80362, -906891, -697529, 95441, -561136, 748482, -911002, -412900, -422564, 458057, 362708, -676328, -15008, 399122, 808184, -767577, 771169, -806364, -423608, -775220, -134103, -7469, 94650};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques547(){
        Integer[] array = {185051, -239033, 945403, 720278, -470470, -785976, 586816, 417654, 958951, -796113, -493349, -838697, 238148, 182841, -871797, -415377, 639536, -648656, 290486, -279455, 398540, 841743, -850761, 197782, -75686, 664965, -625165, -246957, 25259, -80085, -845587, -450919, 356404, -762941, 168768, 336972, -793430, -94920, 13030, 551840, 507368, -955914, 584797, -622043, -488766, 302778, 369060, -993327, -823453, -573127, 718727, 739294, 359734, 336324, 974628, 999712, 183203, -779407, 596826, -77226, -671494, -296494, -942679, -59355, 448843, 535833, -993401, 250028, 917591, -715536, 914206, 192741, 508080, 839558, -283117, -194756, -321745, -159876, -228619, -350849, 474092, -733982, 298409, 591758, 370633, 179539, 428962, -310936, -832614, 855758, 132569, -676809, 126810, 506015, 864706, 513746, -393424, 35659, 137019, -339591};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques548(){
        Integer[] array = {647404, -735597, -69422, -550316, -591851, -462323, 300411, -502312, -989325, -216701, -338153, -234767, 303843, 723874, -167749, -29303, -727010, 570268, 259402, 508017, -79679, 646484, -993884, -381386, 61065, -747066, -767274, 886141, -305194, 523401, 339074, 989906, 14779, -648806, 941050, 574099, -84254, -687532, -932039, -84466, 767583, -95677, -740035, 779534, 803694, 440681, 363460, 430560, 423746, 609978, -149157, -362021, -648321, 408875, -824230, -982285, -227129, 319990, -648054, 859686, 317280, 593196, 917708, -316289, -767897, 385749, 384815, -590039, -964355, -774734, 318943, -850709, 767432, 256841, -987412, -749209, -894806, -28733, 116230, -616024, -754787, 260833, -57776, 80030, 140076, -332742, 435028, -73211, 862240, -82611, 889415, -828896, 785740, 317846, 21327, -600057, -150506, -125840, 379619, -250202};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques549(){
        Integer[] array = {878640, 47934, 302984, 395374, -371749, -673472, -997043, -995605, -269582, -904911, -962929, 706695, 78805, 961432, -784991, -517547, -245399, 486020, 241750, 232396, -805432, 58322, 502107, -581874, 794789, -644313, 987452, -528390, -706091, -252994, 599223, 623067, 202512, 407795, 803461, -294864, -612125, -981975, -724930, 698668, -834145, -902965, -775392, 486259, -736828, -315523, 684381, -440122, -811870, 518419, -139810, -364902, -838458, 288803, 150465, -132969, 998839, 132134, 892082, -237626, 850310, 675983, -928327, -41159, 229682, 656713, -602928, -241965, -734232, 647132, 914989, -809388, -118159, -259783, -408324, -468158, -520073, -468138, 610101, -640500, -32472, 864806, 908412, 436094, -825569, -589653, -738548, -987938, 958311, -294509, -774071, -95293, 406750, 672646, -284599, -747170, 571184, 742911, -621217, 76406};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques550(){
        Integer[] array = {-63197, 477418, -939780, 743388, 987784, 49906, -56412, -808838, 316137, 118118, 569207, -539661, -341367, 116148, 594050, 190778, 332208, 700669, -706424, 47195, 417313, -636533, -129712, -293413, -399691, 477885, -960043, -788891, 692126, 453268, 640662, -365610, -691662, -997295, -734975, -784810, -762152, -495560, 145354, 27671, 247488, 350968, -825221, 856117, 924137, -956857, -600252, -49374, -306794, -334566, -264606, 537416, 867211, 136273, 64314, 268802, 145292, 474225, 926662, 528806, -561535, 549037, 715195, -751753, 533618, -510898, 28291, 987587, -287732, -335036, -247584, 96654, 450841, 823966, -945808, 160147, 843816, -970610, 75033, -435723, -737950, -758703, 456005, -734883, 343228, 365233, 381005, 872484, 298383, 486192, 534916, 964656, 108115, -811650, -533631, -85681, 284886, 290098, 84500, 857772};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques551(){
        Integer[] array = {820953, -552222, 983336, -87865, -692477, -230801, 981380, -948741, 465867, 358106, 879074, -676732, -63520, -245075, -861486, -453135, -95033, 148972, 925020, 560031, 763474, 196028, 657644, -22909, -689978, -633817, 486447, 7690, -848975, -577235, -489793, 211617, -101928, -508408, -633246, 423983, 524900, 586371, -203522, 126108, 909067, -576126, -407275, -112213, -402326, -851250, -425621, 656758, -448985, 354169, -967784, -903225, -912794, 632572, -418605, -405896, -372121, 643872, -188084, 633174, 792122, 645828, -502367, -681419, -398720, -231924, -677814, -587563, -911051, 422449, 903052, 488245, -988696, -438389, -645601, -127407, -465678, -56577, 184423, 555401, 116398, -918570, 29488, 425247, -743100, -855638, -682795, 416139, -996536, -162852, 135388, 461491, 957197, 763072, 88666, 884353, 880302, 75967, -493589, 826229};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques552(){
        Integer[] array = {-200224, 794678, 231204, 649657, -708049, -208998, 682773, 300498, 691963, -661157, -900635, -711486, -977852, 33450, 869020, 805018, 688599, -863448, 927937, -484976, -488218, -639610, -962104, -27861, -709404, 649606, -407122, -237139, -826068, 169287, -969086, 761516, -451056, -119903, -725165, -886906, -610715, -6244, 348718, -566983, 906703, 247122, 644090, -665785, 504832, 624256, 207245, -50565, -158665, 481511, 222783, -735847, -592745, 632062, -963489, -511320, -280363, 281513, -639267, 552499, -265682, -808726, -702299, 884913, 636888, -937783, -916421, -818117, -173132, 159932, -782109, 473399, 987861, -916789, 264343, -350125, 211695, -959188, -402071, 200261, 729298, -658973, -270238, 925697, 925285, -956706, -914073, -386015, -364119, 348017, 77069, -528153, -630227, 371267, 58063, -959690, -496490, -216696, 657108, -981698};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques553(){
        Integer[] array = {-582302, -965861, -988303, 382252, -28571, -512468, 308818, 318732, 325105, 12296, 870880, 827968, 987991, -434330, 866501, 616424, 773354, 719076, 997889, 922829, 943172, 839970, -970764, 227417, -102969, 334458, 28997, -971001, -750380, 326338, -953991, -825152, -229058, -700887, 697163, -674718, -715565, 310196, 47411, 978970, -677460, -408949, -794272, -743118, -393937, -482831, -988622, -642640, 754173, -757756, 568644, -591816, 881522, 181790, -894547, 340318, -369922, 668651, -896704, 52055, -660873, -718883, 598232, 683823, -494157, 357850, 126585, -524996, -269323, -233069, 543758, -144785, -300899, 568690, -424077, 367124, 96482, -887942, 546910, -938047, -711262, 604100, 433151, 887475, 493901, 704526, -846415, -454689, 221706, 971056, -655410, -662672, 153927, -743431, 379163, 427724, -555657, 88520, -510289, -817934};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques554(){
        Integer[] array = {-435260, -320839, 641668, -275989, -22149, -524288, 605224, 124986, 731886, -225514, 86340, -567526, 652396, -49957, -224710, 304589, 485543, -251851, 304790, 886728, -132006, -388438, 300417, -119633, -479459, -199674, -841003, -8147, 320314, 634048, -301883, -237010, -75708, 711168, 558478, -645349, 723632, -629194, 687803, 752677, 380569, -164102, 933664, 734469, 390177, 139018, 340317, 960546, -841701, 890838, -633974, 898622, -46382, 578201, 748750, -274851, 374439, -532164, 70632, -890522, -58701, 178326, -797950, 695807, 541631, 371265, 590658, 407736, 738216, -229878, 187039, -246609, -742786, 820349, -492055, -935516, 15334, 669250, -60986, 433910, 61935, -929487, -248108, -478836, 530458, 990985, -706305, 401442, 624429, -589670, -411849, 694346, -74709, 676887, 8867, -829353, -742162, -309663, 446282, -577163};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques555(){
        Integer[] array = {-770399, -933894, 339041, -573945, 799347, 556935, -356259, -5634, 142647, -789430, -587060, 620115, -20593, -494145, -318176, -438648, 19963, 242541, -870731, -430267, -683116, -880647, 703396, 155432, -870277, 153356, -124771, 41095, 233423, 449382, -30637, 248361, -90398, 537513, -227314, 822561, 647739, 286335, 212971, -705193, 788584, -681472, -628132, 250398, 618758, -370588, -794751, -108408, -395730, 124932, -701516, 607960, 477894, 582166, 738956, 879147, -330323, 492078, 242895, 233133, -743985, -321950, 460054, 587606, -103116, -129010, 944791, -767009, -967450, -161611, 708235, -430928, -989593, -258027, -586757, 95329, -643608, -926843, -684799, 262092, 245937, -579669, -487074, 779533, 256920, 544930, -954588, -841134, 379807, 967964, 212671, -249067, 111706, -345358, -941080, 679051, 897299, 463973, 832048, -913897};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques556(){
        Integer[] array = {546067, -768356, -577949, -247996, -321524, -585650, 576134, -441988, -453689, -67830, -288263, -913066, 336299, 462018, -670072, 926996, -607992, -672068, -833703, -136586, -502517, -713789, -928691, -551128, -397696, -540924, 731476, -447716, 843181, 489781, 493685, 891677, -846683, 657060, 469449, -267825, -316837, 532202, 431290, -554071, 285264, 684617, -923456, -796244, -568240, -138626, 839285, -980064, 196677, 714582, -284506, 187325, 502199, 842103, -244568, -438766, -509437, -207253, 314562, 126374, -611815, -339539, -288201, 450669, 623201, 939959, -682701, 728579, -25958, -250393, -463427, 756643, -468703, -745734, 578372, 970181, 52513, 250741, -369786, 127650, -630200, 616731, 11598, 759032, -627853, -831964, -807607, -349561, 670806, 85800, -665366, 657372, -383220, -839600, 294251, -752751, 571187, -969887, 20305, 786453};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques557(){
        Integer[] array = {-291718, -973937, 874993, -979903, 230857, -156330, 61953, 209272, 946452, 779039, -831365, -107007, -433626, -873487, 77124, -256474, -979102, -774720, 780468, -248234, 707826, 344141, -822814, 372064, -425288, 36704, 855685, -347586, 405448, -459342, 536876, -525363, -772389, 980716, 813742, 576072, 21469, 237950, -263760, 217209, -570808, 418445, 708359, -807379, -139151, 497575, 571676, -474806, -238461, -69486, 934259, 537077, 751585, -659803, 614590, 476287, -203249, 333735, -491658, -856949, 375304, -778030, 110380, 874106, -633600, 748006, 361684, -230345, -684538, 195670, -652879, -371869, 483861, -455992, 872602, 444693, 867695, -430037, 21110, -613789, 202684, -956052, -656014, 709122, 256308, 966758, 847396, 748659, -349928, 460690, -570605, -678010, 29527, 775866, 670717, 549547, -757123, -198676, 415537, -814882};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques558(){
        Integer[] array = {-434886, 117667, 635233, -340964, -804714, -143750, 277351, 146536, 993800, 271017, -850594, -997159, 37631, -316998, 451898, 370912, -63083, 9757, 534687, 229449, 994269, 159148, -221598, 844421, 55221, 195113, -582509, 121804, 471623, 794360, 858504, 363548, 960497, -426403, -246185, -244801, 385284, 150361, -230713, -720700, -301813, -374155, -949894, 579346, 670434, 861519, 53833, -484635, 760723, 487088, -688896, -417448, -447631, -909996, -279558, 742090, 625441, 759798, -47045, -525870, 486922, -879732, 263986, -142671, -166911, 148935, 684352, -809396, -339515, 73647, -441728, -610657, -733136, 785077, 50858, -680363, -996425, 47736, 86968, -694546, 359579, 472833, 594343, -190496, 487390, -935159, 181527, -748856, 965211, 726748, -406075, 696907, 560215, -151455, -521139, -518774, 954252, -989513, -343421, 900262};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques559(){
        Integer[] array = {-516480, 665886, 918673, -616087, -212806, 269612, 852750, -229198, -678321, -164757, 963603, 459657, -921256, -640168, -815830, -707358, -440233, 512018, 524424, -275865, -157115, -590023, 645444, 59082, 726942, -992559, 211464, -765440, -300952, 130103, 301788, -522197, -712493, 957072, -72437, 420189, 950682, -648490, 104887, -831108, -298906, -583256, 636626, -835646, -859815, 594618, -306254, -30800, 180626, -931602, 319809, -225345, 164157, 267409, 587795, 107717, -998931, 297255, -853188, 216454, -909853, -356762, 474177, -885443, 75349, -751364, 251349, -159498, 112440, -710340, -370436, 379361, -617687, -241626, -946450, 483144, 208505, 875966, 324344, -693868, 344087, 979939, -715623, 754911, -265070, -259758, 95078, -727750, -514499, -649606, -565397, 24253, -875220, 304182, 954268, 426913, -965419, 928990, 835078, -341320};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques560(){
        Integer[] array = {810629, -307289, 992741, -929593, -980734, 146731, -585220, 834407, -140015, 847766, 472256, -351659, 332826, -878424, 888496, 514948, -428179, -233130, 369715, 71852, 788, -771067, 767630, 711914, 636063, -775810, 896610, -985615, -480849, 788267, -681354, -465864, -674766, -769654, 77364, -177017, 512026, 696635, -422656, -936297, 562804, 639664, -348218, -664765, -777835, 602205, 493255, -56127, -193484, -709786, -872719, 274769, -598579, -149184, 487686, 805653, 869007, -478336, -233691, -556071, -491942, 632828, 521862, -259278, 841787, -647663, 361339, -158067, -434485, -627378, -580776, 182109, -356381, 479558, 972048, 88648, 80088, 165981, -815863, -616887, 136357, -480421, -711131, 480828, -978896, 328385, -489776, 767135, -907026, -755193, 477978, 235167, 128026, 889788, -860267, 738188, 959750, -407301, 205895, -64988};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques561(){
        Integer[] array = {-137922, -170877, -212820, 861680, 530993, -573692, 489148, -749940, 239738, -211046, -130513, -146952, 862909, -568028, 728182, 399112, 257216, -865495, 772954, -903757, 684059, 840496, 224501, 954409, 625537, -228563, -334939, -576645, 980651, 448652, -304538, -822062, -750218, -1533, 606823, -494246, 482452, 307211, 763665, 241276, 759126, -923354, 759937, 856762, 450605, 999223, 447792, 972901, -142410, -770513, 264488, -244272, -498491, 486191, -986369, 402997, -550060, 275715, 895919, -17878, -791595, -746853, -585777, -474211, 457894, 672469, 624348, 725107, -391480, -341161, 786333, -57633, -185140, 649205, -113950, 519415, 228098, -316534, 389947, -310970, -371729, 192974, -559365, 579584, 738454, -374225, -692231, -302548, 139252, -467522, 338266, 451900, -544057, -19744, 112464, -960564, -743367, 913701, -717694, -219460};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques562(){
        Integer[] array = {-854347, 166108, -673602, 62646, -448493, -334522, -83689, -896349, 328324, -427914, 83875, 825158, -287860, 315207, 431451, 127136, 449018, -990461, 265143, -766289, -769653, -927035, 386070, 514305, 812120, -932969, -627761, 352149, -813929, -103398, -171881, -140880, -118978, 111228, -583865, -441250, -773937, 532454, -603932, 372285, 109003, -245786, -64956, -717017, -600698, -360703, -289607, -700139, -875278, 395275, -486393, -357784, -871002, -921870, -337770, 825186, 408558, -396790, 492543, -513681, -885902, -26118, -785232, 577951, -484135, -35246, 386262, 167226, 730824, 877349, -150486, -386129, 250426, 64058, 405538, 145893, -520829, 130055, -739467, 4573, 588988, -745868, -313716, -377097, 297121, 908019, -126917, 422925, -355320, 899387, -901111, -927859, 533107, 496080, -590977, -443487, 203718, 301311, -194646, -13721};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques563(){
        Integer[] array = {34522, 742637, 169821, 504239, 660233, -458483, -28483, -121724, 929596, 243372, -465078, -333482, -461412, 207605, -446917, 775254, -49045, 953210, -317616, -556168, 733757, -236278, -445548, -986783, -244451, 78890, -704447, 889054, -262566, 889737, -46375, 92909, -12004, -907793, 537887, -722709, 906518, 703928, -74944, 292303, 859555, 800731, -450987, -526025, 509552, 337160, 111028, 153385, -851697, 26568, -340176, 532719, -971757, -789733, -923520, -299190, 189514, 557120, 179643, 347992, 199637, -255987, -203102, -9607, 491087, -703585, 59034, 365583, -885932, 199212, -925445, 346410, 918408, -239894, 672026, 637228, 75307, -856641, 336070, -981787, 478653, -386559, -312471, -68173, 207370, -638197, 516111, -309123, -906767, -247421, -91383, -581480, 217550, -28484, -108979, 242700, 458977, -300921, -714256, -800946};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques564(){
        Integer[] array = {581847, 545229, 533147, 910872, 547410, -817173, 534931, -241719, 742903, 267698, -428652, -224875, 776810, -550444, -623096, 222198, -401203, 751788, 870644, 197502, 75542, 953636, -561206, -547652, 632058, -654405, 739924, 848626, 195548, 709058, -289225, -338320, 467100, -799425, 38919, -142128, 155338, -788463, 916912, -222219, 454876, 698073, -961131, 29174, 271295, -760919, 871716, -912813, -24413, 374495, 578829, 903766, -432159, 868705, 314807, -318625, -739403, -577146, -546575, -927920, 25832, 555165, 466302, 87939, -965908, 793829, -644294, -575103, 130675, 746427, 609918, -894147, -342161, -775986, 626715, 487770, -786759, 966968, -491906, 886435, -626813, -301501, -189921, 80984, 655695, -503347, 72191, -651446, -22933, 35739, 172517, -76362, 6751, 553820, 922408, 272022, -826784, -784365, 688429, 937496};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques565(){
        Integer[] array = {467678, -593096, -71037, -839617, -570507, -257098, 470482, 75951, 825636, -673869, 806996, 664226, -599945, -815314, -852557, -722046, -297745, -853522, 579502, 790020, 123359, 679998, 192205, 638219, -248483, 823207, 649811, 707406, 90523, 851339, 776963, -4451, -798869, -247191, 22770, -275614, -297421, -309325, -176502, 340724, 352861, 800185, -612521, 885034, 454608, 658584, -227355, 293932, -735693, -149731, -320267, -674893, 950007, 268409, -91578, 197920, 423732, 395422, 107400, 843630, 152822, 514282, -751969, -440801, 649794, -429522, 31752, -242866, 705663, -314781, -791123, 378, 718820, 343332, -3216, 800383, 528110, -979917, 547267, 778934, -898407, 541024, 820388, 336279, 500481, 515064, 457485, -398348, -176413, -425247, 296308, 173351, 164693, -817873, 6810, 709979, 819893, -695768, -209167, 14121};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques566(){
        Integer[] array = {-952080, 448147, 108467, -703384, -479601, -716496, 537081, -564510, -194854, 875434, -282026, 185924, -421873, 154009, 506636, -754698, -954934, -947025, 809930, 578687, -377503, 680822, 270976, -221438, -846524, -394214, -303621, 443386, -362403, -537926, -476910, 81133, -100101, 669955, 646885, 12267, 749607, -955181, -752104, -225028, -476824, 571766, 112892, 437056, -348000, -790241, -350855, 204399, 6834, -4101, -280003, -318248, 954406, -265157, 377584, -759512, 818642, -215951, -343541, 723452, 785657, 721540, 313466, -565743, 502234, 830928, 999387, -107678, -486729, -415349, 112972, 635429, 702650, -547122, 864507, 12036, 226728, 866171, 233189, -364626, 276012, -443833, -122538, 247441, 518590, 780101, 989938, -189896, 376537, 392478, -279927, 118959, 660836, 746282, 771680, -756331, -932005, 324564, 909360, 530};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques567(){
        Integer[] array = {-65254, -523642, -821538, -231732, -842509, -701063, 965603, -731410, -610488, 391931, -523951, 51814, -602696, -617977, -183625, 21783, 392457, -785112, -941066, 94837, -374678, -905453, -936821, 582003, 423342, -574224, -406727, 768754, -410527, 339838, 770086, 320530, -382026, 124732, 839941, -271677, 504549, -635050, 244707, -630392, -123263, -938697, 463970, 265514, -505973, -153712, -962898, -143779, -729264, -646173, -365268, -206480, -596817, 439884, 793152, -527155, 130352, 272344, 467715, -752917, -231517, -855730, 332610, -244491, -553726, -872165, -790993, -952490, 430953, -756723, -209035, 532645, -460562, -899080, 465053, -241893, 305070, -327421, -249033, 773654, 940873, -832758, -560994, 28587, 444994, 658050, 645131, -424026, 923294, 128761, -521050, -672764, -148609, 519939, 675179, -681632, 342371, -755739, 874731, 121385};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques568(){
        Integer[] array = {454546, -66618, -783840, -226142, -229632, 894873, 551374, 280542, 717114, -136332, 220756, 678432, -54630, -633323, 73640, 141294, -574358, 963689, 954257, 813876, -15461, -558088, -85180, 688767, -327822, 692424, 462082, -629074, -585739, -225928, 428996, 805257, -81020, -676913, -942097, -272798, -621774, -641695, -689193, -704139, 809232, 942909, -289609, -270523, 89116, -41442, 500161, 218555, 344781, -757399, 182706, 54685, 234988, -806828, 767322, -621584, 996057, 138089, 320914, -744093, -431868, -589116, -625625, -596742, 417581, -960542, 676948, -859961, -72876, 111906, 221330, 113688, -521666, 939127, 387037, 56361, 551389, 389786, 879551, -13677, 844447, -532205, -802549, -722894, -373768, -27397, 832793, -990695, 866949, 428258, 881386, -322039, 444767, 784368, 841001, -699365, 530072, 109327, -644583, -21707};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques569(){
        Integer[] array = {729635, 903739, -600089, -646385, 923941, -266366, -304532, 242179, 561470, -391985, 79978, 527353, -417432, -84373, 410394, 279159, 267711, -473922, 633387, -819866, 108692, -305621, 695035, -760425, 602995, 980247, 407736, 651599, 898791, -397683, 480099, 666109, 948673, 118009, -235466, -537148, 626697, 146871, -587107, -413478, -86575, 356086, -174016, 61277, -568772, 559951, 679667, -452438, -630827, 355718, -878309, 426671, -231596, -953812, -150969, 90900, 165603, 140122, -171745, -455829, -17612, -284991, 16366, -8739, -827919, -580708, -503447, 541424, 339218, 760573, 142212, -487351, 577314, 887996, -162008, 708983, 285258, 776859, 694818, -165182, 628370, -558213, -518918, -585995, 717909, 611206, -167955, 732895, -239668, 904478, -280748, -576133, 128045, 896757, -382610, 299221, -93167, -270957, -109543, -637918};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques570(){
        Integer[] array = {-328185, 536987, -153651, -804004, 135213, -367604, -859489, 129808, -466617, -616796, 759675, -422861, 216896, 277093, -736243, -460196, -252389, -683455, -778321, 553027, 466084, -906491, -413673, 647663, -166899, -943257, -478393, -670453, 650143, 854190, -591515, -467152, -972039, 325687, 135489, 331135, 972423, 863533, -729033, 368677, -571957, -969229, -120303, 760590, 674853, 689066, 641237, -650764, -159302, 881233, -414154, 763611, 963038, 88123, 430148, 894473, -634782, -369533, -258296, -822270, 929896, 330953, 814351, -165275, 33751, 118636, -986844, 578695, 262521, -610295, -181302, 104496, 846072, 195199, 98362, 390729, 284202, 388172, -752317, -268279, -125786, 869334, -251679, -881942, -853124, 538194, -73774, 671977, 799947, -588588, 893220, -886838, 384216, 707210, 108771, -967329, 421263, -531371, 362603, -473487};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques571(){
        Integer[] array = {542574, -574965, 807644, -921068, -932186, -472252, 41046, 502623, -452607, 7750, -613176, -301211, -826185, -557854, -755097, 667992, -970741, 232903, -461413, -56065, -257200, -769055, -839398, 114235, 129251, -44578, 919606, 208281, -862808, -41796, 693292, -698466, 980371, -469833, 246273, 230685, 220440, 37631, 399694, 880241, 177973, 367777, -499625, 164314, -175287, 184746, 896634, -787308, 254779, -24993, 792375, -279658, 285746, -837729, 237784, -557152, -762828, 266293, -751201, 616563, -253157, -327055, -963157, -938030, -666560, 755483, -500441, 71441, -604370, 869469, 734036, -65536, -158177, 460043, -937793, -723128, 388844, 582638, -997410, 973522, 989136, 35433, 689566, 687400, 920768, -487746, -237972, 440585, -679761, 244378, 989696, 238012, 142491, 69881, -600880, -434990, 775524, -993794, 314877, 36412};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques572(){
        Integer[] array = {-408767, 387902, -869275, 675115, -378880, -867234, 53288, -282364, 973852, -608373, -413367, 520665, 630564, -874835, -218932, -213459, 490065, -797831, -320111, 407142, -730166, -180476, 764224, 92969, 605207, -996417, 949709, 772765, 234506, 710043, -616761, 301575, 742367, 591064, 20414, -345855, -814212, 132822, 556482, 787105, -357459, -740637, 274819, -447923, -100978, 570440, -802319, 573506, -357503, -10329, 101416, 402306, 786117, 857764, 223896, 618097, 698502, 59792, -75197, 325602, -487359, -648347, -344698, -443814, 239390, 132464, 594821, 516250, 556130, -954379, 831715, -811391, 461872, -63215, 831521, -496918, -286394, -429994, -196852, -657263, -91609, 259494, -856728, 653340, -782805, 966924, 318539, 428151, 79232, -733595, -937596, -203749, -668620, -122168, -654435, -624243, 13666, 103801, 486826, -385819};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques573(){
        Integer[] array = {794309, 298234, -132111, -960011, -297690, 586746, -212789, 800080, -309778, 100392, -384892, 897596, 982067, 270625, 366066, 485630, -465533, -510567, -755595, 602000, -480820, 842832, 254229, 507699, 896181, 241259, -795380, -713412, -811564, -568054, 909832, -274548, -488109, 647930, 906700, -916159, 37918, 643493, -527984, 578798, -804959, 611466, 290495, -727439, 627350, 588105, 377883, 70830, 174485, 978538, 73936, -643915, -278140, -860693, -863164, -117811, -142720, 269314, 257430, -464555, 963414, -42672, 96897, -82338, 248326, -99568, -901596, -7645, 63144, 237531, -406915, -283252, -928539, 886810, -958319, -670882, 657319, -954907, 274782, -75946, -512031, -37729, 863859, -355172, -484065, 802002, 768219, 289627, -127841, -392597, 640567, -995878, 851864, -182479, -395048, -98743, 4022, -811008, -995893, 393173};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques574(){
        Integer[] array = {-468963, -309180, 995724, 596986, -157422, 99659, -426513, 340987, 586270, -138288, -713321, 369033, 378303, -458336, 192237, -957930, -515391, -507981, 612594, -954315, -816349, 667539, 422201, 422363, 519080, -83981, -429646, -728737, 411272, 45465, 216455, -352815, 655955, -447818, -275543, 72836, -8084, 386611, 78976, -517612, -871579, 492765, 317981, 538244, -263292, 180423, 774421, -112914, -993082, -944968, 373191, 424028, -893025, -120806, -57910, 890813, -206722, 983516, -462953, -886505, 176948, -222765, 339914, -214109, -261261, 266676, 134274, 937523, -676858, 168498, 812711, -739701, 982579, -395879, -837688, 52953, 399187, 554221, 688904, 48499, 252212, -225290, 18130, -471265, 413040, 408074, 727490, -349696, 442518, 828583, 822281, -643725, -977655, 144377, 540765, -955198, 501051, 124701, 610824, 779854};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques575(){
        Integer[] array = {-112688, 347642, 371003, 421613, 417422, 711686, -562685, -953704, -565427, 317366, -885514, 485675, 613569, 354373, 441969, -135869, 179419, 389241, 647638, -636129, 393363, 361284, 819649, -319089, -702508, -322099, 229979, 110151, -372066, 227790, -211267, -844510, -28268, -580121, 485754, -331030, -541566, 531008, -369854, -511912, -938188, 423464, 559093, -993917, 880716, 286571, -156082, -672630, -598452, 563584, -457020, 282938, -198045, 894221, -589274, 329223, 233911, -921339, 484382, 391454, -473881, 163779, 295667, 178625, -145030, 355529, -856862, 383624, -734101, 288531, -490042, -139640, 216841, -278539, 630930, 790003, 575727, 610619, 832171, -760146, 402964, -195360, -105092, 433527, 946482, 319923, 542196, 40653, -657028, -310671, 158262, -701665, -201491, 187827, 521186, -344763, 432895, -947221, -108229, 453170};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques576(){
        Integer[] array = {3313, 356749, 804295, -495675, -220208, 944419, 59547, 102918, -903845, 747896, 369202, 701974, -381846, -213396, 234991, -785218, 574669, 579671, -180309, -726188, 647381, 176933, -199810, 259899, -799026, -147059, 161629, -671247, -177647, -786417, 866001, 940767, -65829, -661313, -856422, -226808, -278842, -235182, 816241, -238013, 177892, 92614, 933628, 634584, 804849, -108894, 695377, 145446, -106745, -568774, 785909, 59092, -741517, -234982, 48886, 667617, -924052, 614286, -483373, 345932, 93711, 483030, -490681, 242180, 632296, -853284, -3927, -901485, 63025, -318612, -59676, 361128, 579820, -221720, -853821, 767695, 273295, -818976, 755732, -869746, 540901, 125072, -716724, -793673, -953542, 186643, -893285, 52401, 811641, -631832, 362965, 266612, 3512, 601384, -403332, -941202, -362890, 474811, -189212, 741907};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques577(){
        Integer[] array = {-135248, 472242, -342986, 906284, 323940, 308857, -625823, 179688, -839395, -41329, 883565, 97160, 943381, 983841, -541256, -609448, 504749, -807225, -553357, 78087, 334709, -86136, 355002, 539094, -601110, 781874, 623489, 809061, -323077, -947274, 497331, 443971, -413573, -511579, -885309, 316180, 263998, 25848, 783546, -767102, 374833, 245233, -383410, -23657, -36153, 985732, 691645, 838943, 856103, 955045, 188280, 854590, 309721, -16452, 913875, -48972, 498206, 540317, 987630, -580026, 638556, 300256, 577010, -338783, 367336, -383835, -108800, 964339, -765387, 545665, -256512, -12491, 273909, 71065, -956284, -955864, 661747, -399620, -207542, 220154, 75627, 173810, 908350, 259946, -843942, -360803, -737824, 235098, -201690, 840395, -192312, 432963, -97043, 938122, 958645, -968822, -701788, -809023, 714993, -836969};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques578(){
        Integer[] array = {200715, -215883, 93283, -442258, 988269, -752537, 542572, 443740, -55305, -432711, -426488, -460421, 615190, -193363, 866567, -670078, -846613, -109078, -220557, 831322, 865621, -967481, 82243, -344561, -556486, -969428, -775619, 695555, -764167, 89840, 139912, 376806, 930969, -871760, -507106, 975762, -890535, 740206, 901549, -953841, -56039, 269986, 682114, -777642, 448311, 532505, 552280, 543693, 923351, 542442, -308441, 957825, -781171, 906342, 927751, 890225, -499569, 722031, -964265, 217301, -70771, -468874, -929548, -850870, -761192, -358694, -446390, -720976, -423563, -617502, 620410, -303898, 988691, 717412, -446770, -274072, -414660, 530129, 832302, -968930, -591623, -903521, -789026, 644592, -78214, 360878, 66103, 944121, 913891, 67274, 680962, 139573, 933900, 119576, 194994, -387873, 191007, -187732, 577148, 124963};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques579(){
        Integer[] array = {441437, 105249, 729923, -477547, -681028, 688933, -951464, -323606, 687536, -988089, 313250, 89652, 880844, 301990, 221866, 181789, -133167, 693043, -390916, -198247, 876027, 198925, 648353, -837083, 766325, -575816, -307975, 856583, 869249, 534761, 364051, 436199, 28105, 242589, 464625, -364334, -882079, 715730, 357876, -754976, 312969, 732511, 208750, 617340, 929778, -651820, 853975, -765954, 259781, -216032, 326000, -952709, -545872, -479337, -8350, -861449, 533781, 153669, 604025, 811042, -416309, -784841, -481146, -756084, -906198, 31121, -150353, 169066, -678162, -910269, 991294, 684109, 250451, 414988, -12710, 873596, -264103, 481930, -194962, 709177, 101269, 362441, 52106, 983360, -63963, 735411, 361361, 473266, -154976, 636149, -26826, -795652, 317493, 256765, -861782, -103735, -130578, -738378, 491167, 386743};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques580(){
        Integer[] array = {198269, -428572, -82334, 213788, 124825, 651125, -88769, -318488, 186369, 163552, -167124, -678156, -153107, 888770, 228352, -168461, 969928, 862034, -964557, 916987, -915943, 790300, -920499, 590254, -363887, 135358, 390166, 420424, -931328, -998451, -177728, -756362, 535137, 671916, 980275, 713019, -923946, -254683, -931564, 543020, 373492, -948026, -97085, -193064, 883498, -204751, -541023, 517611, 377632, 844835, 856484, -990002, -122918, 841708, 30920, -545612, 613062, 8267, -484246, -712693, 882735, 588482, -836379, -783647, -227751, 458656, -189290, 985109, -701380, 564294, 241456, -438854, 491466, 473427, 655061, -892751, -855809, 580056, -994418, 816333, -807984, 722708, 967777, 811957, -571266, -523988, -152466, 372785, -404233, -237783, 564510, 258133, 872497, 515793, 72606, 686781, -885348, -887310, 809931, -790629};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques581(){
        Integer[] array = {-412902, 783501, 58117, 389991, -727038, 811952, 440421, -986881, -493866, -626809, 596549, 541273, 466826, -862345, 258834, 484478, 96220, -21870, -727933, 90085, 224510, 163798, -474177, -869476, 327101, 724951, -444245, -298486, -298552, 77224, 733128, -673731, 579767, 309985, -928580, -269223, -661294, -212164, -894579, 229829, -403336, 884516, 736496, 492417, -985418, -972476, 978796, -947043, -783040, -241130, 1153, 277195, 192154, 380848, -550628, 612596, 251129, 172105, 805498, -436712, -378611, 799159, -544445, 883857, -908795, 568064, 378032, -421787, -125984, -282231, -389857, -912934, -739537, 841876, 54853, 858411, -523941, -734248, 329883, -351605, -183794, 363261, 554354, 164459, -65030, -43600, -663027, -557310, 788891, -851128, -860891, -485978, 912059, -422102, 778577, 826110, -303418, -309061, -726031, 736015};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques582(){
        Integer[] array = {-336954, 325319, -915500, -832624, -804326, -395102, -250179, 161156, 709834, 537298, -429284, -638588, 987035, -988869, 145434, 47899, -65530, 578965, 95853, 264193, -952256, -449249, 665848, -371243, 43119, 13609, -210161, -812036, 728512, 615517, 32067, 147875, -722822, 661027, 410248, -449122, 846951, 6552, 236725, -746866, 212404, 99532, 662533, -469543, 250485, -232259, 400482, -819001, -718811, -909401, -77539, -501361, -994331, 761354, 208433, 980980, 189710, -8307, -94487, 328786, 742266, 113601, 510559, 183557, -600630, -87218, 798873, -704004, 985050, -152306, -456892, 266926, -558630, -13690, -6084, 529383, 921617, -867794, -484250, -399185, 538596, -734384, 100321, 403439, 739313, -224073, 33092, -715843, -381364, 600683, -11346, -53604, 958347, -774045, 208073, -579234, -428374, -990662, 974188, 407458};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques583(){
        Integer[] array = {831110, -435861, 169627, 215818, -512294, 9664, 747979, 721713, -82253, 535519, -81422, -883930, 281900, 900925, -344650, 97001, -513521, -902040, 566769, -737236, -303592, 815391, -594933, 511747, 763081, 333730, -792385, -863525, 992791, 837038, 50640, 399881, 359095, -297051, 905980, -728512, 643790, 619383, 356456, 921648, -551462, 756431, -255493, -872150, 545810, 987281, -727193, -912298, -498064, -821069, 851273, 647777, -629115, 86811, -874657, -513755, -142591, -830107, 442598, -314274, 986260, 685257, 729508, 222264, 790006, 51447, -251044, -572470, 7308, -321962, -709101, 459142, -371556, 836554, 258767, 184522, -88678, -464355, 580944, 751409, -774716, 387052, 386029, -646186, 986560, 273839, 89742, -515848, -740081, 999980, 367213, -401524, 987434, 615392, -426494, -542628, 178113, 883098, -395739, -70489};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques584(){
        Integer[] array = {-533329, -26820, 377125, 250668, 62820, -365133, -305380, -393053, 946035, -821573, 405525, 481637, 358424, -40820, 733988, -438864, -575240, 423483, -702106, 68865, 382913, 931412, 769702, -682847, -547591, 530862, -893569, -590104, 422710, 273294, 200593, 769325, -948597, 977197, -477678, -248025, 524828, -869013, 765868, -753529, -329273, -534747, -563660, -839029, 654132, 95254, -859597, -569687, 785209, 189752, 264933, 365067, -365694, -268751, 266542, 357222, 440432, 283962, -940563, -92998, -480707, -918581, -849603, -727695, 752268, -403106, 454242, 855668, -67714, 841817, 385905, -477829, -521208, -535788, 582943, -602019, -941764, -521847, -8419, 511954, 316298, 540708, 894022, 215000, -173353, 39141, -325859, 936938, -269888, -988276, -524861, 786589, -640019, 394770, -743177, -567508, -26161, 913557, 854514, -126443};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques585(){
        Integer[] array = {-925388, -165049, 72437, -605656, 845662, 8665, 625554, 58680, 548330, -120732, 847900, 822732, -691962, 929373, -22706, -75398, 93711, 536589, -581135, -575452, 913837, -692617, -298467, 445270, -723525, -819471, -683321, -645559, -814054, -390566, 336413, 921749, 912721, -397868, 828735, 41642, 216663, 267123, 807839, 327129, -249951, -14019, 188150, 917214, -630636, -505693, -197606, 759713, 397631, -295216, -410511, 30167, 154593, 932946, -292460, -917492, 703481, -427490, -540528, -356276, 851901, 134409, -620157, -500754, 765196, -74432, 869398, -623292, 641124, -818519, -812939, -489286, 846288, 676727, -620934, -463704, -493727, -822925, -36349, -435375, -735908, 96484, 424115, 354787, -369805, -388121, 217859, 246032, 85806, 610738, 401162, -7310, -423934, -143179, 457801, -948113, 524878, -233866, 161156, -646650};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques586(){
        Integer[] array = {790888, 506283, -760484, 494520, 739433, -976154, 956049, -272277, 538824, 232328, 623154, -630880, 500415, -870029, 535546, 975172, 336074, -502288, 381300, -451119, 407769, 716542, -957911, -601830, -546956, -577517, -811079, -426229, 842187, -891889, 592995, 173262, -669236, -67174, -825018, 87660, -541009, -703181, 724055, -560207, -956992, 457873, -649430, 367944, -560178, -150524, 358571, -789305, -74774, 958565, 130540, 23319, -339219, 941013, -119298, 158677, -184955, -596665, 338779, 188224, 871891, 989912, -735238, -563759, 944624, 599429, 167378, -742943, 165602, -987347, 510876, 219786, -903633, -776430, -65560, -592452, -569513, 842922, -993495, -257567, 958454, 106691, 660208, 541207, -346910, -746380, 774656, 674923, -205848, -944045, 425284, -255688, -476888, -402401, -916641, -494375, -249973, -12426, 759898, -432575};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques587(){
        Integer[] array = {-496995, -128950, -525656, 691403, 495686, -54337, 292227, -550493, 748738, 823273, 630098, 167709, -261761, 442804, 153593, -3582, -291897, -171539, 996870, -734421, -835549, 634173, 865448, -210727, 604714, 124839, 261469, -534545, -871809, -562343, 847820, -486174, -858730, -404982, -660567, 469386, 354441, -672980, 833858, -328708, -61913, -646611, -444541, 543430, -898005, -822777, -131803, 655206, -741468, -386620, -559574, 765768, 470114, -922432, -699137, 404475, -391246, -639347, 644311, 10063, -954583, 110533, 227626, 719168, 527733, 930745, 943100, 453884, -859224, -836331, -739046, 825468, 762214, 861772, -405096, 764479, 277769, 539537, 496287, 362573, -964782, -298411, -261631, -916506, -364980, -588819, 678720, -350761, -990992, 335536, 150233, 415685, -200487, 140047, 298515, -965828, 139697, -685014, 841183, -657443};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques588(){
        Integer[] array = {-464092, 905973, 794717, -120942, -235463, 998530, 213365, -682977, -571395, -363353, 461242, -867348, 258928, 949495, -7016, 923839, 901630, 118573, -536827, 738854, -853740, 755079, -487511, -601136, 820466, -302279, -342273, -24270, 855504, 186704, -649676, -161338, -47430, -7756, -868146, 757589, -538430, 486065, 985761, 822009, 129875, 137628, 214319, 184466, 325215, 7335, 664597, -586335, -656368, -181421, -797247, -289214, 588304, 535231, 436508, -50813, -873988, 800777, 437190, -590361, -796019, -657696, 439891, -249603, -77329, 446973, 824235, -486272, 540964, -884986, -40533, -36555, -685528, -806115, -980501, 475025, -926119, 244419, 359654, -279449, 769823, -175610, -931355, -700673, -776653, 687416, 21097, -426691, 794875, -277871, 884829, -46031, -658612, -523633, 595139, 137622, 28962, -932268, 771027, 71200};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques589(){
        Integer[] array = {-682095, -330140, -686267, 579913, -953697, 146503, 627611, -317674, 77403, -267878, 366906, -346828, -338184, -613340, -767560, -11830, 390864, 921996, 682570, -609637, -440354, -956002, 40189, -144464, 107083, -791666, -274363, -553828, -866788, -526789, -265893, -860397, 782025, -161995, -923567, 390893, -618959, -986526, -335782, -767301, -689615, -904471, 570716, 387499, -118121, -730377, 960296, -878491, 635330, 320959, 406789, 831630, -73396, -261917, -576460, -673135, -77905, -305790, -899513, -233132, -392418, 595111, -781509, 963812, 534146, 984856, 600517, 252786, 712764, 642186, -666331, 398999, 994541, -981316, -659397, 555602, 107570, 833728, -575161, -499908, 483267, -178646, -348287, -189942, -917206, 63239, -70804, -153501, 127089, 747410, -688544, -941939, 590244, -589206, 789339, -674906, 868699, 813257, 498710, 964698};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques590(){
        Integer[] array = {439711, -324423, -351794, 110423, -852211, -534091, 9139, -807725, -236889, -567272, 911963, 407182, -954718, 689268, -708730, -185116, -836745, 415295, -591083, 818671, 945342, -100137, 899974, -48961, -219380, 816334, -231844, -120921, -492761, -844019, 921820, 698187, -448625, -178090, -999396, -114082, -907172, 135936, 885384, 199012, 190753, 797948, 785005, 89093, 119442, -799869, 706984, 247025, 913113, 608177, 445167, -398132, 293883, 765996, -750404, 619185, 202864, -170661, 690751, -400858, -841441, 193337, -469740, -552725, -586957, 121289, -39523, 77491, -36590, -339528, 102628, -882285, -251614, 850594, -121151, 128286, -627681, -979222, 417149, 761218, -606057, 42610, -789497, -663534, 14766, -552827, 696394, 874465, -102894, 851685, -786804, 508342, -963619, -163567, -528994, -492222, -227114, -29358, -96210, -304174};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques591(){
        Integer[] array = {475619, 597417, 223261, -420012, -786529, -696647, -946840, -264776, -275313, 651677, 297629, 539140, -208963, 744799, -560051, 170547, -628051, 432007, -218929, -680731, -393713, -803406, -749699, -832260, -394430, 992554, 411376, 790614, -473245, 893120, 204307, 819249, -284051, -214801, -971641, -336411, -577851, 61057, -261012, -416801, 514090, 667090, -627245, -127437, 527327, -23473, 266316, -68516, 957054, 505616, 887670, -274200, 246232, -577218, 618358, 248793, 995980, 671985, -326864, -94823, 187655, 966653, 376872, -846932, -889576, -308464, 577061, 497652, -371981, 428849, -993059, -965379, -655738, 638946, -831665, -823627, 128617, 390255, -986662, 387659, 249307, 696581, -731765, -732801, -919478, 628541, -60670, 3540, 485009, -838340, -317916, -392017, 184646, -937865, 923384, -184453, 776405, 158431, 319433, 870351};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques592(){
        Integer[] array = {479388, 315933, 127518, 671792, 838899, -619533, -241478, -428765, 66076, -975707, -376255, 355774, 246247, -111843, 668974, 475099, 267520, -41701, -300338, 476663, -472075, -73892, 776889, 96188, -302966, 521305, 800084, 719578, -570275, -808530, -342213, -531973, -786596, 616318, -874644, -763421, -15758, -965739, -373346, -951862, 125609, -147609, -17930, -708281, -217964, -988349, 383380, 712003, -73475, 133759, 933760, 506130, -894579, 192603, -635045, -330514, -855977, -457362, -907249, -542174, 377862, -564851, 686571, 473422, 870229, 782889, 515924, 111656, 780540, 778626, 511214, 883870, 912838, -480005, -289531, 17910, -250167, 890424, -871246, 155453, 760610, -736994, -748470, -927502, -698647, -74504, -212414, 533692, 931864, -837012, 262336, -594396, -40580, -30522, -854083, -847488, 624217, -46933, -218574, 108520};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques593(){
        Integer[] array = {787493, -237742, 655680, -969900, 194661, 770177, -679013, 414281, -617077, -319778, -70389, 351946, 646275, 105321, 77545, 65476, 457596, -69624, 672612, 298384, -898723, -851108, 401976, 836232, 324198, 991684, -460404, -818768, -882691, 408453, -916755, 558131, -765207, 412568, -267085, -399477, -310875, 868935, 179821, -48820, -378021, 116134, 354896, -221247, 775999, -893695, -437467, 516830, 587049, -330242, 292372, 181670, -819684, -524531, -147074, 434899, 621441, -758910, -684543, -172655, -47648, 760463, 708523, -288414, -34246, 402473, 311938, 206257, -728104, 640405, 927941, 713965, 361268, 240937, -169036, 873445, 252265, -840538, -955863, -317790, 766876, -691177, -931377, -362462, -726777, 506467, 633358, 815278, -895387, -466761, 272406, 677911, 862869, 233324, 871901, -410075, 315264, 267191, 621741, 155976};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques594(){
        Integer[] array = {323493, -758849, 729059, 775717, 28327, -880511, -829141, -35882, -368402, 961432, -328751, 448809, -120837, 580832, -795160, 132380, 992516, -676770, 38883, 963386, -108969, 485168, -60802, 668073, 589783, 538029, 858959, -906011, -958986, -882429, 469232, 726134, 60904, -206962, 2005, 742459, -481856, 293392, -58983, -212794, -424958, 465845, -147824, 935994, -22966, 351387, -816836, -197425, -948939, -395020, -494954, -491372, -970696, 289437, 825415, -725452, 272145, 113877, 106111, -533937, -904174, 752250, -946401, 659196, 922105, -309843, -832721, 723617, 173733, 935191, 329541, -279194, 898575, -916092, 465973, 699857, -513981, 556714, 743646, 603276, -621442, -846992, 214840, 421323, 653821, 578894, -731498, -175105, -737882, 808436, -796045, 700530, 319702, 736756, 652097, -881190, -909341, 632404, 219166, 272360};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques595(){
        Integer[] array = {-330635, 890954, 295536, 801235, 910313, -850920, -957977, 378673, 341531, -353016, 596957, -81653, -275455, 658366, -990761, 542699, -639381, -278381, 343574, -732115, 851271, 403457, -689313, -548590, -756112, 290174, 806169, 41545, -113486, 660756, -436365, -132759, 422426, -557841, 134142, 505622, 814126, 791735, 915220, 820555, 609317, 872937, 772024, -915342, -589376, -178465, -581437, 147524, -879328, 415901, -988564, -138633, -729152, -933775, 753743, -590959, 784181, 971828, 358263, 686653, -876394, -580469, 439755, 982850, -291123, -688637, -306531, 357754, -797652, 836705, -833516, -293313, 441519, 479629, -372359, 55509, -803566, 345704, 496128, -676664, -83157, 849830, -488426, -819883, -711388, -630638, -433012, -486851, -149524, -688797, -68384, -597856, -754845, -105978, 746911, 298390, -891943, 202265, 374072, 834776};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques596(){
        Integer[] array = {500621, 338872, 670028, 909766, 714826, 773158, -258935, 2334, -354563, 97697, -19093, -578028, -819252, 919136, -958998, -656514, 965656, 323451, -544542, 902401, 510714, -668127, 669453, 437039, 660986, -214586, 408493, 907830, 269810, 831404, 150914, 410070, 521683, 293229, -608033, 933294, 140401, 583081, 997656, 527753, -882024, 683660, -616864, -308696, 395045, -532460, -780782, 814674, -911089, -249320, -507031, -115082, 741320, -530716, 328762, 843190, 578338, 303057, 925228, -653908, -617468, -63706, 347914, -972894, 286775, 12745, 601810, 933753, 282857, -766877, -793471, 441937, -765289, -793684, -264482, 35851, 996766, -2648, -276710, -926353, 8122, -947503, 177682, -837400, -922290, -335027, -20336, -149992, -133477, 696535, 493353, -964763, -45352, -722041, 239336, -724033, -644464, 313511, 933153, 473759};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques597(){
        Integer[] array = {-826212, 147382, -847178, 58229, -554070, 461595, 606729, -96381, -381982, -82858, -165401, 462852, -270835, -520834, 887290, 894996, -246166, 583209, 803524, 245005, -318717, -169597, -525981, 158510, 569261, 740233, 900998, -250793, 52096, -500468, -677741, -996011, -543028, -29040, -660218, -331439, -49899, -223875, -658049, -98210, 604441, 277056, 481354, 511447, 841892, -784105, -263094, 741843, -502395, -766999, 495294, -493276, 434738, 798369, 329284, 590637, 911084, 719047, 39030, 261634, 149663, 10171, 607892, -885576, -577095, -131110, 229402, -808599, -193151, -935031, 206626, -818167, 771067, 663927, -909574, 625587, -664250, -273117, -554710, 10893, -280382, -954126, 479672, -804361, -475636, 236318, -623224, -976047, 57985, -464930, -152875, 153737, 488551, 566087, -302292, 736063, 602414, -452222, -1540, 336872};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques598(){
        Integer[] array = {221528, -190253, 37228, 936034, 158204, -976213, 205721, -317845, -502985, 254672, 181472, -974088, 118792, -442038, 996943, 827863, 162693, 497447, -171072, -329848, -569195, 234615, -749894, -489466, -181940, 227606, 347233, 234925, -492954, 322421, -541357, 839011, 497517, 10382, -493399, -379181, -609303, 117317, -738189, -852118, -689913, 580127, -271026, -650789, -336520, -14680, -410016, -139005, -664762, -388308, -548447, 844459, -314524, 943609, 82460, 351326, 602387, 804564, -643244, -873684, 37103, 112161, -77279, 19161, -709394, -605884, -828337, 667777, 29327, -956463, -495842, -493218, 323061, -750102, -574782, -532064, 407083, 850094, 432269, 781050, -681918, -809246, -585798, -102072, -309003, 266421, 414476, -643192, 262880, -122562, 379882, -730654, 817151, -859562, -593791, 897784, 354702, 977253, 626651, 546635};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques599(){
        Integer[] array = {-974213, 535781, 57794, 763563, -916225, -140637, 486822, 414190, 56676, 910354, 745181, -856123, -135091, 6430, 247996, 852797, -582076, 347091, -511922, 14837, 116150, -606061, 679349, -135958, 311389, -51202, -272149, -789381, -801366, -60553, 183531, -509466, -832385, -786812, -646827, 215969, -814317, -963673, -932687, 111998, 347392, -342018, -179663, -50603, -494510, 388155, 936291, -459630, -71839, 508826, 378060, 970274, -469941, 788760, -451546, -295649, 817926, 427918, 492623, 152838, -746969, -134079, -459746, -182034, 803655, -919765, 8729, 361958, -69765, -695725, -296888, -679992, -786422, -546626, 236693, 326766, -254429, 594336, -521135, 1025, -326268, 264635, -432168, -697252, -610597, 781899, -673881, 843705, 63978, -451046, -366259, -86001, 541204, 324015, -893702, 171764, -244570, 402728, 685982, 818612};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques600(){
        Integer[] array = {626919, -97695, -308273, 536808, 208457, 134081, 610423, -862152, -250476, 85186, -254813, 201903, 599342, -349050, -242841, 38756, -215436, 632601, -784007, 662153, 880528, 181938, -24735, 93667, 873696, -551948, 63486, -414446, 423577, -715117, -952918, 793897, 985504, 766479, 634844, -817302, 508210, -352275, -556195, -498493, -868175, 245795, -201172, 858851, -528362, 373583, 498457, -326092, -955918, -33908, 751956, -620158, 12598, -409676, 828842, 93664, 238298, 959986, 934680, 268717, -676475, 773878, -807116, -652741, -297917, 296681, 750305, -46470, 560711, -686522, 466171, 349342, -556202, 192852, -385799, 366000, 274819, -896003, -323192, 411069, -38250, 825043, 600899, 516255, 160553, -802046, 762661, 282171, -167137, 488529, -317474, -484321, -570439, 800419, 485846, -76894, 545500, -801183, 449372, -928536};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques601(){
        Integer[] array = {-361473, 145309, -238819, 918416, -86976, -572325, 445990, -101287, -565320, -488122, -922176, 693958, 19533, 303232, -940258, -987696, 970992, 894572, 302083, 704194, 630258, -288960, -689916, 636538, 727869, -776155, -986999, 577280, 528988, -301262, 760537, -687014, -569121, -376546, 363260, 903381, 575947, -215397, -727557, 876948, 214423, 43435, 449005, -13260, -473160, -788994, 22341, 258246, -40977, 973581, -381780, -696787, -390410, 946696, -813606, 584263, 470219, -833919, -98225, 263114, -968654, -357317, -365354, -296479, 881476, 103449, -688711, -330105, 106092, 312408, 668738, 541387, -16889, 491368, 647861, -105006, 793917, -933780, -231154, 619076, -679732, 38963, 281239, -512252, -676790, -240015, 220629, 193004, -598402, 873140, 939426, 310037, -523257, -806549, 541383, 531064, 147960, 309554, -448222, 70935};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques602(){
        Integer[] array = {-153421, -968978, 372617, -694478, -338529, 867737, -293463, -6629, -114200, 904978, -799416, 225637, 320027, 400575, -884203, -991473, -952879, 66967, -915047, -876249, -614537, -526371, -643427, -961054, -12452, 873560, 593432, 859532, 480195, -434649, -441624, 245131, 402932, -140403, -54893, -522030, 952249, -940850, 64683, -559839, -805362, -583110, 801317, -287759, -491176, 817976, -275422, 933319, -350633, 102648, 488616, -561354, -244442, -342139, 208016, 728418, 381954, -81611, -832208, -279439, -240461, -681874, 266033, -82712, 146771, 505305, 405531, -189441, 850968, 274402, 585949, 794197, 749760, 646292, 265780, -555165, -424283, 794131, 249587, -785693, -122532, 483395, 995817, -542729, 891657, 492525, 857889, -909827, -376896, 810194, -681564, -85288, -772578, -83792, 610966, 405103, 454264, -475568, 353955, 418885};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques603(){
        Integer[] array = {772444, -138735, -783268, 893233, -164561, -987555, -479454, 931595, -852357, 854499, -278897, -674208, 721919, -74872, -706507, 140671, -708969, 31631, 980690, 668814, 921798, 373040, -345711, 841188, -129942, -128411, 186136, 44336, -362742, 147554, 725028, -586134, 205093, 304171, -837159, -52268, -91046, -812745, -312044, 814607, -994546, 734228, 761156, 259547, 45805, -622303, 436914, 788861, -116161, 278096, -364648, -279180, -853293, -960058, 779613, -40979, 545285, -494125, 961032, 167569, 946201, -922863, -200398, 815794, 760616, -802863, 90463, 120191, 415163, 99301, -665787, -647043, -322368, -143388, -796388, -705252, -325650, 390360, -126033, -665353, 198289, -373030, -948120, -772499, 628658, 250290, 17968, 196384, 44904, -440240, 687924, -176692, -663513, -549474, 424245, -670879, -852544, 851017, 906407, -992893};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques604(){
        Integer[] array = {689241, 567989, 283037, 468242, 493550, -623634, 926065, -333772, 45596, 969460, -665220, 827416, 787709, -789284, -619514, -303887, -335322, 90111, -730544, -175506, -282057, 266870, 57027, 388105, -743153, -475748, -781352, -855966, 490689, -22026, -282688, -582437, -379260, 75502, 402821, 190211, -578822, 857350, 783229, 390058, -324467, -858733, 30041, 84615, -525994, -450811, 40195, -606220, -817791, -842216, -98654, 211872, -624899, -96576, 284223, 36076, 987980, 91422, 894507, 105730, -472979, -349180, -299057, 571776, -143301, -516718, 718994, -289510, 577710, 210056, -345261, -88288, 293106, -432175, -629250, -952809, 314106, 400820, 667181, -783543, 341550, -104007, -289657, 773242, 631715, -599233, -644372, -42746, 28798, 135489, -623372, 573094, -219881, -228477, -925070, 920275, -437829, -827446, -473984, -943198};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques605(){
        Integer[] array = {123732, 514697, -526670, 253135, 7707, 570784, -172193, 792743, -2361, 149222, -385804, -688630, -401091, -469779, 325740, -587447, -832774, 23940, -799514, 116857, -735805, 809197, 753503, -651295, 180700, 161737, -569157, -964896, 541787, -729194, 69120, 922393, 245159, -900216, -24207, -324990, -401492, -997096, -206614, -319265, -195201, -885224, 965327, 42261, 403367, 990337, 643604, -681584, 766074, 548541, 308342, -419843, 546086, 493430, 869272, -206721, 34743, -372981, -724153, -941944, 917485, 535524, 443871, 678855, -897021, 563036, 73078, -256940, 871183, -811190, 488805, -639275, -617401, -223461, 526636, -100112, -619898, -111888, 809828, 355932, -105065, 516890, -911591, 302770, 303191, -615605, -590340, -410284, -84931, -401409, 352347, 330890, 901777, 810546, 933644, -106472, 243506, 646805, -201930, 146468};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques606(){
        Integer[] array = {536180, -781897, -331121, 20617, -778261, -338734, 257759, 806147, 617173, -803371, 516666, 817208, -951962, -644790, 318838, 897135, 904633, 528112, -783682, -902686, 305452, -665142, 477765, 875414, -678877, 459276, -388779, 154811, 639223, 251331, 794667, -410007, 580366, 48535, 753137, 912928, -222566, -345772, 147550, -930151, -774641, -276783, -544379, -89674, -997589, -557487, 807167, -100018, -496613, -25530, 395024, 258617, -324914, 262131, -580115, -409169, -797213, -813794, 745344, 20121, 984719, 448854, 285268, -236962, 820125, -681992, 422987, -125647, -143159, 161067, 7205, -414230, -511136, 342666, -720690, -624629, 311375, -772188, -143029, 317002, -431535, 601029, 449600, -315565, -632643, -372962, 388723, 628150, 910070, -934411, 656978, 830150, 707273, -381776, 225898, 612601, 381221, 796374, 965910, -445751};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques607(){
        Integer[] array = {756966, 127585, 503340, -958398, 81073, 264253, -904160, 246737, 126765, -200501, 107391, 680510, 948059, -142122, -272174, 675461, 17960, 510684, 926653, 932559, 696353, -556619, -381699, 260650, 993718, -254780, -74590, -272398, -273115, -396568, 537634, -387151, -291082, 212178, -686370, -814323, 51690, -786480, 87399, 25697, 897096, -505106, 238544, -619158, 9439, 722685, -574825, 715025, -997120, 651286, 953705, 590625, -820251, -592924, -999260, 424673, -227163, 913936, -429675, -856248, 876051, 331897, 464575, 525164, 280853, -572237, -46451, 4333, 787501, -540126, 334761, -839714, 19644, 290863, -129655, 564263, 593279, -118770, -600564, 725602, 38856, -843452, -243379, 116470, 85314, 462938, -148694, 66565, 331928, -680211, 100613, -741172, 920939, 361029, 529166, 978176, -747486, 617453, 147771, 578846};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques608(){
        Integer[] array = {-831446, -656820, 439746, -916102, -731765, -257865, -409442, 100765, -757168, 91330, 18987, -644735, 139748, -641915, -466537, 793923, -562850, -263225, 426855, -277186, -165036, 579008, 245047, -818731, -804324, 405333, -168636, 86776, 87207, -639314, 883353, -554165, 175880, 616470, 257132, 334623, 34102, 146539, -22820, -166078, 94510, 705550, -991141, -685926, 462620, -954870, -21180, 390093, -585314, 733829, 842046, -537340, -951861, -36096, 832525, 533246, 625941, 724574, -304194, -540627, 789420, -9178, -482450, -418295, 386158, -412851, 501435, -204206, 64783, 344571, 295489, 810682, 351011, 301261, 690570, -119249, -315788, 791155, -59915, 933696, 99842, -540894, -238953, 415152, 430920, 788913, -551464, -63908, -283519, 665936, 953249, 457493, 770075, -594511, 589905, 15426, 331144, -671617, -835909, 296687};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques609(){
        Integer[] array = {144812, 622023, -932974, -577971, 871611, 37710, -997219, -641089, -176400, -103414, -149965, -21744, 417161, -160071, -713209, -327502, -609261, -592460, 451278, 898657, 696532, 306884, 215628, 185373, -938683, -294183, -343783, 184204, -688552, -712229, -486665, 230509, -236177, 17310, 46420, -989183, 489933, -296671, -166329, -89230, 465663, -690231, -692335, 151157, -9061, 356300, -988132, -310873, -818742, 812294, 705708, -574084, 597562, -489120, -289049, 978005, -448929, -433560, -457944, 478717, 732555, -173470, 493133, 200892, -278515, -331174, -833210, -572504, -771427, 204355, -980920, -844487, -533803, -619727, 209046, -199178, 407516, -582261, -39592, 161636, 795726, 462668, 314580, 495275, -659768, 61896, -797729, 522843, 548089, -67307, 4464, 403120, 385992, -421841, 419006, -36263, 541429, -603846, -65113, 751139};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques610(){
        Integer[] array = {650444, -66856, 228162, 304793, 878106, 54840, -55721, -97195, -575766, 686163, -722099, 639785, -218516, 615358, -751398, -752738, -764488, -326403, -315278, 26188, -802717, -301424, -670906, 593528, -534632, 405296, 760306, -948144, 97244, 648945, -346317, -944843, -613447, 734274, 254622, -148328, -813075, 733546, -980046, 897290, -966339, 718673, 351019, 988884, -734557, 139496, -170421, 65117, 106203, -178972, 159241, -193059, -903894, 892487, -726356, 661252, -303468, 491867, 477476, -691682, -902645, 484002, -235889, 630711, 688046, 537612, -54114, 682665, -434595, -172846, 382965, -824466, 512904, -31021, -585603, 657811, 502682, -611836, 333666, 447313, 641710, -187981, 99287, -118345, 906813, -175609, 590503, -764315, -867562, -189503, 21207, -250512, -946896, 534045, -562548, -133615, -469294, 395877, 167210, -884812};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques611(){
        Integer[] array = {10769, -644425, 492714, -383361, 862165, -536781, 452766, -870049, -590192, 74452, 941469, -49567, -489532, 317489, -31622, 2195, -316249, 401364, -336910, 33519, -551929, 658197, -463457, 80194, -468452, -409088, -36239, -520732, 150738, 388663, 700587, -239384, -119534, -975725, 739957, 317754, 724512, 728894, 894038, 348989, -807949, -313133, 5005, -364697, -294210, -929463, 109548, 435749, 499600, -160101, 855046, 442844, 765537, -754587, -971611, -253168, -350011, -933991, -405645, 704188, -88700, 734439, -439488, -506061, 524813, 360980, 592824, -473054, 777652, -612889, 25139, -484407, -114438, -231932, 313554, -285756, 244903, 341250, 224886, 765307, -539373, -877834, -93116, 676555, -197491, 104490, -730100, 367250, 639373, 960981, 693244, 510316, -933094, -621353, 725811, -985094, -177164, 540639, 417671, 532745};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques612(){
        Integer[] array = {172008, 516950, 92125, -611705, -435816, 719532, -597127, 172690, -375464, 101744, 707924, 861979, 400373, 743809, -815145, -949879, 869791, 163495, 316496, -456956, 867709, 615337, 782991, 485851, -175099, 940392, 352418, 794295, -539225, 436748, -982823, 810121, -181671, -710229, 433759, -996359, 328742, -416242, -509082, -633434, -861649, -309372, 590574, -814008, -113854, -207726, -791435, -54817, 987470, -906175, 611456, 863630, 781419, 260293, 890391, 142091, -124679, 135329, 72266, -715818, -591273, -728860, 345093, -561304, 21370, -565522, -955681, -204183, -696331, 304266, -880635, -945843, -995097, -492931, 130995, -681796, 147881, -520451, -131806, -24682, 462242, 590065, 576366, -428609, 903849, 796646, -544601, 28304, 190723, 625563, 129921, -594262, -977922, 269975, -992753, 880161, 121677, -810408, -636207, -323716};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques613(){
        Integer[] array = {855667, -631770, 572677, -99005, 932603, -169793, 263966, -6950, -610779, 306708, -127792, 295319, -490848, -912653, 605322, 244974, 257770, -387462, -477872, 243558, -603194, 174606, -267201, 691887, 529555, 306967, 13395, -267327, 524513, 69423, 992719, 484664, 343294, 336853, 676747, 619837, -83573, -972528, 869402, 627201, 370718, -815693, -64605, -482046, 604778, -360239, 70597, -169773, 805562, -29864, 335667, -189917, 567460, -275322, 381836, -159324, 132811, 635385, 237174, -62307, 88247, -955012, 603113, 794490, -63621, -618210, 612369, -664169, 496448, 129835, -719375, 917415, 577791, -440285, -87240, -304595, -515583, -22438, 842510, -40227, -754532, 587017, 857347, 357361, -527436, -401882, -472428, -553745, 383723, -773920, -779272, -521256, -260086, -842, 433566, 944737, -177430, 936921, -446848, 667791};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques614(){
        Integer[] array = {-405789, 767720, 382510, 674148, 357130, -415804, 115194, 529999, -796959, -698264, 643671, -407922, 791157, -369482, -535822, -973259, -620845, -16601, 722236, 714234, 525734, 336357, 401555, -435205, -802283, -533306, 439964, 774239, 945030, 96799, -343855, -134410, 255419, -14843, -281799, 364200, -474763, -237047, 86518, 407619, -566637, 14948, 404287, 188218, -805265, 961449, 312806, -194513, -726126, -86262, 773420, 82496, -471218, 19220, -150007, -803116, 297402, 248641, -878986, -183028, -52459, -708905, -90173, 426086, -136934, -261003, -12744, 210653, 266956, -338493, -984721, -767162, -77093, 491545, 134227, -802897, 345516, 67193, -571096, -782516, 526854, 155222, 829093, 326974, -520535, -672978, -595347, -604939, -934784, 499276, 133416, -843197, 555333, -955828, 866274, -381196, -360835, -369596, -767982, -756442};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques615(){
        Integer[] array = {-919463, -796679, -181780, 63436, -322779, 868063, 679559, 540289, -245779, 421928, 453447, -887936, -867942, -133960, 565201, -676798, 541025, 702365, -644068, -323923, 484131, -56032, 3552, 777684, 353924, 625330, -521805, 599616, -250331, 257051, -307598, 680520, -902736, -395297, -572559, -554315, 795315, 149778, -737177, -77776, 640417, 509220, 185258, 756202, -290959, -782127, 79116, 906398, -764855, 258909, 556175, 789877, 817609, -315552, -590746, 97422, 579428, 9739, -57876, 424034, -433353, -935281, 275048, 7804, -525562, -296475, -420122, 527407, -490671, -32163, -435490, -640667, -745545, 235938, -689936, 671349, -160761, 875838, 855256, -483747, -813905, 812888, 269875, -99908, -20811, 575670, 231043, -161372, -845153, -889595, -51481, 164037, 881824, -55015, -555761, 148175, 992937, 648941, -744342, -43220};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques616(){
        Integer[] array = {836990, 85406, 780780, -854511, 563174, -321470, -121520, -97807, -121628, -97770, 187818, 90402, -670280, -476289, -507514, 217682, 660336, 962735, 679257, 301463, 901774, 917730, -983264, -404691, 49173, -55333, 655489, 626142, 124940, 994094, -504291, -535866, 196633, 137118, -137198, 404089, -970051, 324141, 418075, 477469, 683546, -796624, 254720, 901671, 51131, 919262, 337002, -171048, -838485, 90343, 302671, 481505, -795547, 674459, 317424, 638473, -859833, -851974, 154468, 149412, 602044, 228756, 627972, -537815, 977118, -541781, -3348, -107702, 427250, -724454, -335425, 931133, 742718, -36267, 117367, -379550, -416332, 566124, 405347, -557920, -429216, 722279, -408200, -554002, -915540, -221737, -514380, -886549, 690277, 729141, -220624, 45053, -618346, -483033, 548301, 23546, -188948, 325910, -176049, -936795};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques617(){
        Integer[] array = {-762657, 129034, 283641, -179725, -918321, -689409, -92613, 921640, -331301, 275492, 665508, 448206, -886220, -7697, 63188, 501976, -960022, 910358, -500103, 198704, 461639, 361971, -352408, -392422, 713234, -296326, -892371, 670120, -3965, 613671, -355674, -603744, 149788, 245078, 572825, -492321, 465689, -403278, -484361, 288443, -914114, -357221, -557311, 589948, 427060, -866473, 149337, -897924, 565618, -942236, -654947, 608771, 477316, 85136, 269546, -65585, 517421, -983441, 712927, -901311, -465685, -711705, 746498, 754203, -293237, 74770, 498121, -784796, 443208, -943973, 768099, 517488, -650363, -590668, 732946, 519873, -488480, -146425, 715098, 983946, -731046, -508435, 334717, 82632, -190089, -94802, -116699, -324624, 665041, -679070, 492566, 447690, 555504, 555804, 125547, 808302, -467348, -569745, -496572, 217047};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques618(){
        Integer[] array = {-882115, 327332, -513243, 483553, 41705, 936852, 221774, -708665, -593456, -713773, -121814, 195479, 561983, 992208, 118434, -962547, 22994, -970830, 525275, -825007, 18050, -583825, 512875, -347934, -491488, 101646, 955079, -173936, -304682, -916153, 748231, 63909, 443966, 374785, -978128, 373019, 498492, -451207, 313654, 403211, -222771, -444970, -969292, 190226, 780311, 578446, -291793, 957525, 844244, -519579, -501204, -951296, 105361, 423309, 759947, 760882, 455142, -391389, -425520, -624918, -650456, 930826, -911523, 948789, -914430, -83411, -962269, -609185, 997034, 470151, 727507, 742877, -170812, 566717, -755692, 541569, 811169, 748803, -12890, 271526, -119842, -229757, 611032, -756091, 629508, -933754, -132963, -856589, 665492, -236035, 425807, -924476, -283292, -950466, -792506, 365611, -692275, -217134, -614694, 15202};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques619(){
        Integer[] array = {-719219, -761034, 188280, -242194, -149362, 421815, -190794, -690701, -748615, -659892, 765306, -286393, 776060, 622103, 589824, -979868, -529556, 940861, -856721, 223011, 404308, 968740, 956037, 106521, -32526, -183122, -996437, 815488, -282744, 195999, -982798, 729914, 824322, -210465, -797653, -902012, -371406, -667580, 375031, 178061, -486373, -793304, -661402, -308003, -514835, -277475, 680421, 552124, -309651, -638395, 86518, 558560, -878969, -333626, 804413, 631756, -823505, -712497, 303400, -73019, 989858, 930663, 382617, -35794, 230161, 667626, 703265, -937770, -358602, 117228, 377171, -809776, -514929, 663221, -580330, 543275, 739319, -765845, -422767, -85452, 178121, 33662, 537991, -483423, 323528, -106998, -228217, 11098, 26684, -399901, -791983, 565581, 888745, 750560, 938333, -733402, -910991, -447137, -411770, -613440};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques620(){
        Integer[] array = {243109, 634526, -300843, 985671, -737446, 515781, -269340, 222159, -333822, -400021, -811485, -528350, -387364, -523813, 668379, -860725, 673303, -406547, -289129, -12738, -307001, -62676, 194349, 390044, 363674, -513442, 842361, 392587, -860268, -563491, -47158, -511843, -137911, -688734, 881297, 620225, 110723, 947995, 538634, -907974, -185745, 989841, -206836, 787196, 785113, -49935, 284565, -120090, 698962, 664372, 100578, -728905, -879351, 37476, -954930, 125528, 520904, -363062, 581820, 127381, 939813, -112005, 238399, 40023, -507172, -975834, -552031, 950459, -672843, 588080, -952476, 73547, -253572, -970928, -795172, 192672, -939551, -315465, -709892, 988522, -891093, 54695, -64610, 434314, 770998, 157890, -485031, -555187, 470502, -322315, -321762, 773633, 391468, 355938, -410868, -182056, 351620, 105719, -129009, 267007};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques621(){
        Integer[] array = {19836, -428784, -11017, -417457, -192960, 26170, 467096, -544570, -607017, 887218, 865017, -136111, 52522, 768538, -298253, 234980, 252165, 861613, -665743, -162936, -373901, -799189, -833308, 898545, -746793, -280957, -655267, 347874, 330781, 320433, -311403, -637876, 678134, 661109, 418391, 345756, 501094, -17620, -358052, -143561, 529754, -902541, 32161, 314952, -582054, 635363, -623157, 363074, -958509, 833380, 971484, 664418, 853003, -934413, -611244, 664685, 471301, 384091, 444146, 687422, -421287, -951300, 474493, -585060, 344073, -984901, -707149, 171873, -49097, -147419, -40679, -231827, -541164, 754139, -380996, 590080, -896803, -670949, 515582, 174788, 312539, 973648, -349757, 654732, 140328, 458988, 350506, 308228, -475729, -371696, 17572, -124529, 906734, 5982, 794961, -593240, -4463, 611830, -270542, -547981};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques622(){
        Integer[] array = {45661, -15870, 207282, -342793, 972126, 280169, 917549, -347684, 901550, 801598, -359296, 272258, 757490, 5993, -924082, 852822, 985391, -60178, -690934, -585401, 646964, 690274, -771837, -282808, 367940, 347432, 47252, -131530, 159409, 661060, 479598, 582272, -591681, -669563, 567158, -701493, 118987, 14478, 624259, -261899, 415356, -827372, 919118, 583106, -357875, -590848, -806134, -304804, -9034, 623937, -260932, 840676, -963818, -616076, -384275, -940617, 705635, 247897, -35109, -459721, 653676, -593393, -515577, -991820, 910202, -224951, 136933, -92507, -417416, 621560, 862233, 341561, 871142, -247862, -348672, 252821, 483295, -650531, -280821, 565355, 19225, -46034, 620535, 429492, -847648, 557875, 453259, -278991, -903609, -314682, -429658, -724794, -99188, -970959, -188920, 710172, 861918, 759127, -178564, -28763};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques623(){
        Integer[] array = {411052, -792831, 671128, 4045, -390806, 638402, 85647, 335144, -511438, -32583, 615879, -810097, -276265, 444394, -864289, 314973, 279853, -965203, -929327, 164295, -700763, 948886, 667998, 189941, -61527, 743344, 448730, 246113, -745710, 273253, -75625, -576712, -202326, -194084, -198151, 305710, 426961, -905744, 322096, 766386, -274959, -948276, 21302, -464049, 968870, -112505, 882883, -865935, 800838, 914283, -408227, 76089, -83245, -981639, 371399, -629413, -670896, -846471, -591230, -228153, 591252, -796420, 264025, -317815, 303100, -741826, -793068, -569851, 825952, -4470, 784508, 784487, -800126, -485702, 383664, 713468, -79184, 522781, -707128, 649655, 344921, 294924, -345733, 775429, -242268, -143201, -973710, -312784, 29771, -798340, -915403, 880597, 39735, -99718, -486807, -79198, 35627, 966198, -822429, -950217};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques624(){
        Integer[] array = {748722, -481306, 898896, -843012, -624444, 747633, 461502, 987148, -212344, -139971, -799346, -758260, -137542, -646703, -406848, -151741, 405133, -224590, 775012, 615942, -894245, -404753, 508005, -96333, 5712, -776545, 270072, 714381, 693329, -241566, -237300, 599489, 722795, 200028, 880731, -664576, -640424, -343919, -703844, 577409, -412375, -735018, -302631, -740358, 334351, 48279, -208412, 971877, 788053, 486080, -278971, 35785, -8865, 820221, -410731, 588398, -614512, 865491, 707153, -509229, -616291, -929142, -543409, -233394, 898344, -8987, -990926, -394303, -782785, -918787, 980699, -287349, 195508, 956775, 567337, 550704, 617564, 155393, -279313, 657549, -539976, -242266, 167414, -207830, 400259, 856873, -660583, -962995, -968286, -366288, -906733, -734372, -587047, -239819, 573562, -583932, -97260, 54688, 839783, -876073};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques625(){
        Integer[] array = {-331109, -992353, 547124, 442175, 167105, -767114, -900, -950580, -611601, 903454, -155148, -29543, -301291, 549232, 695781, 139684, 525238, -141662, -303585, 313242, -173586, 795080, 237225, -105352, 926122, -496582, 88297, -641663, 648946, -817496, 363227, -581395, -645908, 850856, -483145, -998212, -906814, -568912, 942019, 874827, 359313, 578229, 418943, 106218, -459490, 65149, 945084, -985054, -999652, -880151, -575155, 699787, 472331, -766940, -558003, 967928, -949359, 985252, 46823, -241813, 356860, 491806, 577346, -431254, 907111, -978812, 512500, -263803, -190247, 532925, -527836, -555147, 122297, -589417, 499037, -167628, 714333, 687260, -598483, -161686, -405558, -503192, 743043, 472017, 921927, -567387, 166770, -63260, -727699, -763406, -198777, 601059, 400574, 968157, -165130, -394301, 687759, -827568, -642769, -72561};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques626(){
        Integer[] array = {-445843, -78679, -600249, -104518, 436275, 47986, -709127, -70469, 356719, -587348, 988625, 303159, -725967, -280023, -433287, -954700, -529082, -849005, 54417, 253593, -231144, -723872, 595966, 352726, -893718, -978151, 784073, 674024, 169423, 522208, 423668, 480551, -46517, -938789, 190319, 370381, -821043, 691939, -281630, 701833, -209401, 327390, -353979, -781384, -574740, -845340, -961929, 305589, -419893, -464057, -899436, -933856, -315259, 888146, -56279, 105984, -166713, 323688, 344000, -313337, -796131, -697769, 876926, 867862, -885744, 191608, -383240, 639407, -355918, 625837, 391785, -893040, -465354, 87879, -66556, 584933, 997377, -518371, -8199, 462109, 104171, 58304, -16182, 760992, 274444, 789732, -419069, -463530, 894307, 159488, -788464, 385417, 531007, -519267, 990404, -696924, 7855, -421696, -671582, -857900};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques627(){
        Integer[] array = {244164, -962803, -314121, 589254, 842952, 605475, -626082, 885822, 792579, -564374, -394466, 846273, -541412, -951464, -729399, -773741, 911942, 258190, 366070, -339921, -25422, -432837, 75248, -85823, 767507, 515364, -201811, 176725, 851820, -655214, 972826, 851529, 68122, 975318, -154570, -337877, 93111, -81701, 603402, 442389, 815949, 857764, 878528, -6902, -69525, -197149, 352307, -794174, -886533, 645150, -383798, 583934, -620563, 988646, 735379, 663218, -929665, 99593, -895240, -251523, 103944, -603740, 402283, 987026, 290615, 244373, -708047, -110146, -533006, -217664, -135662, 217817, 666165, 517538, 265478, -846338, -771115, 960899, 789079, 286323, 788035, -643473, 830308, 881516, -272531, 739056, -795046, 415298, 9841, -170467, -71836, 628958, 712331, 99339, -918360, -362309, -175039, -958714, 860186, 72376};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques628(){
        Integer[] array = {345286, -763986, 273619, -49647, -910149, -482636, -519510, -357218, -689993, -340331, 292853, -770438, -762336, -451658, 620063, -808770, -911802, -842441, 423901, -825333, -126255, 720498, 956213, 384532, -428727, 202067, 342986, 483500, 912413, -462746, -700932, -210643, 567672, -738797, -145571, -719917, -959885, 949254, -557321, 698969, -757036, -417793, 512710, 475567, -682354, 789865, -353936, -878885, -809414, -79024, -765314, -113796, -459049, 533277, -471119, -654114, 233163, 726944, -136331, -21575, -842467, -900961, 806541, 566806, -875911, 766174, 140068, 542375, 553516, -707762, -355889, 366754, 115144, -295683, -299186, 455271, 967924, 884331, -400087, -403342, 166132, 101927, 196738, -976870, 756573, -928075, -202805, -985281, 60641, -178985, 720976, -491531, -850187, -547247, -209189, -703643, 418053, 98258, -726307, -397218};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques629(){
        Integer[] array = {962359, 30387, 263779, -733972, -735974, 509735, 715381, 381700, 886900, -348027, 675249, -136185, 631917, -187628, 639026, -890472, -92599, -32774, 483484, -115720, -933941, -844377, 300734, 45530, 359037, -893185, -28207, -992200, 708713, 171659, -485375, -375931, 862646, 754787, 471108, 593628, -379753, 422847, 312732, 891908, 280137, -747594, 86934, 809281, 343657, -372847, 403532, -412064, 917534, -410302, 321277, -309362, -44868, 199219, 843835, -26249, 415935, 209570, 879432, 461455, -302845, -451233, -659950, -314117, 697429, 269949, 379380, -593999, -581092, -23300, -576689, 175726, 628936, -813305, 564008, -715801, 974369, -886158, 209768, -376704, -146768, 627249, 943277, 337995, 836028, 844992, 663468, -154890, 529407, 435540, 84668, -938059, -257323, -715002, -39467, -372706, 505241, -893944, 174091, 611286};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques630(){
        Integer[] array = {-485948, -463228, 794445, 74927, -611842, 916394, -747680, -601072, -450539, -942829, -340521, 145700, -135334, 3111, 211269, -56108, -692353, -239202, -921854, 979457, 739922, -364050, -790654, -85671, -173019, 424035, -371088, -774273, -435667, 747204, 145843, 287729, 41054, 208423, -400134, 753179, -831548, 133595, -153094, 253749, 592810, -334305, 845387, -45963, -939613, 405895, -891543, -229931, 539452, -44130, 850877, -980671, 813961, 600653, 475252, 138079, -868463, -372541, -809969, -517919, -298252, 297227, -20284, 633502, -375202, -23693, 824954, -800482, 948940, 176169, -408547, 197196, -600651, 232437, 434040, -866809, 106261, 842028, 427712, -962068, -920539, 206318, -442591, -152718, -347294, -649990, 426364, 110895, 993961, 640649, -893472, -671895, 788946, -778446, -939860, -642866, -822850, 551855, -486058, -654059};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques631(){
        Integer[] array = {434976, -259837, 390901, -816565, -701464, 737011, 935160, 214919, -669058, 661477, 328833, -321263, -251731, 89137, -143356, -124908, 20316, 74406, -541752, 209250, -226303, 278678, -797622, -485642, -533775, 706676, 371368, 971856, 270057, 720716, 926670, 776246, -791521, -930826, -768059, 317094, -932222, 511726, 369092, -796116, -815038, 782181, -36902, -199878, -479347, 244988, -741299, 500922, 16902, -662857, 515997, -405830, -440717, -976769, 40685, -497346, 784032, 291105, -319796, 913628, -421574, -886883, -955848, -673550, -306104, -169241, -745290, 429081, 488912, -766724, 120669, 69361, -180306, -68757, 608997, 750241, 63337, -985109, -497604, -959199, 577264, -203559, 447419, 920994, -50939, -463323, -632706, -874544, 793561, 140668, -36133, -659199, 373924, 266984, -992321, -968092, -299109, -670692, -10753, 937734};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques632(){
        Integer[] array = {589100, -589517, 890706, -714204, -212678, -879311, 564671, -191187, 573984, 941864, -928625, 634866, 543309, -817839, 560912, -689930, -977494, -629556, -56188, -389698, 711171, 646977, -187407, 463910, -318131, 939635, 935896, -378554, 661082, 721611, 135028, -752214, 659603, 186817, 416878, 987998, 814145, 543126, 890882, 758334, 312466, -676267, 81162, 94539, 365035, 646766, 35480, -483691, -504377, 125722, 788402, 641729, 710635, -57433, 69402, -478980, 588260, 567752, -575321, 700008, -539894, 552655, -86598, 51374, -408698, 986920, 339725, -772533, -446518, 85990, -174969, 386757, 13837, -276968, -299375, 165753, 207170, -218538, 112032, 580637, 632327, -193294, 645188, -624038, -558483, -475345, 108791, -369812, -35832, -525528, -343500, 110471, -439443, -829457, 210140, -439001, 331816, -487038, -773878, 57149};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques633(){
        Integer[] array = {-728451, -56251, -397442, 567857, 857562, -433965, 576846, 191441, -854820, 852765, 83494, 715850, 398222, -609293, -734734, -193790, -37604, 74073, -607592, 647004, -490495, -868679, -259671, -65812, 708710, -140124, -4565, -124554, -800556, -234485, 509262, -667454, 530736, -73777, 140422, -617191, -517259, -408470, 159159, 838684, -482169, -246114, -356143, -611345, 332132, -437423, 972386, -890538, -815015, 548354, -969691, -483389, -614438, 768806, 135073, 182020, -672609, -169160, -726561, 301798, -985840, -158263, 779670, 716471, -29872, 46098, 267727, -948226, 624659, -482951, 642226, -246193, -36783, 498208, 504034, 575657, -706970, -473259, 556739, 733350, -43548, 311904, 981731, -65228, 309889, -688524, -362712, 657552, 299262, 936814, 362301, 351103, 818044, 641545, -530822, -483035, 291546, 523851, 945569, -322990};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques634(){
        Integer[] array = {-363749, 923299, -983466, 922087, -840509, 585989, 479470, -692797, 217612, -685012, -881663, -575570, 441698, -952905, -467354, -992313, 167689, -14033, 286571, 396945, 687294, 816878, 455632, -73995, 524008, -119521, -619549, -951665, -24598, 657046, -904524, -694899, 653474, 823018, 315923, 227050, 794693, -237621, -538858, -383149, -198201, -842838, -739488, 8915, -874540, 858483, -594955, 903658, 646669, -775753, 562405, -254021, 509573, 922976, -615768, 569879, 267405, 95542, 479960, -23233, -658974, -345063, -578481, 50152, -884734, -131862, 424712, -740868, -1445, -227361, 725273, -805450, -147597, 226987, -421809, -227846, -254853, 311195, -811398, -122993, -287111, 969620, -514765, 656424, 475264, -327998, 454835, 841111, 542709, -171989, 510785, 411678, -266477, -990405, 362352, 656911, -533020, -757629, 415267, 250264};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques635(){
        Integer[] array = {244228, -523422, 984212, 233344, -688084, -96251, 923310, 79789, -296716, -584978, 74361, -221915, -457251, -854656, -648655, -267922, 137515, -414159, -416973, -435015, -986204, -780069, 905783, -529195, -739801, -819930, 461293, -278219, -99232, -457205, -570178, 132527, -63992, 519055, 534763, 42576, 355110, 218698, 868930, -252799, 175264, -219387, 80034, -30851, 42490, 489783, 459154, -130364, -374047, -812347, 936607, -930743, 554786, 676347, -380327, -638777, -242390, -931321, 912677, -435943, 596152, -83379, 803221, 546806, -133149, -552467, -474296, -181117, 430520, -435590, 259837, -442213, 350081, -775565, -242649, 802151, -943746, -524610, -486899, -640171, 918013, 168930, -9364, 347059, 272118, 852264, -882338, -599023, -676175, -367856, 146389, -409590, 630506, 788040, 518522, 616227, -508091, -405120, 415833, -264072};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques636(){
        Integer[] array = {-771809, -989714, 227903, -489194, 864098, -212316, 794959, -713958, 104220, 143877, 568774, -622769, -635406, 298995, -230613, 212133, 157043, -430615, -641796, 743898, 496541, -433588, -647920, -593521, 531326, 178725, -207646, -974760, 427444, 313785, -779266, -934189, -562780, 245200, -912639, 722844, 614776, 46088, -837837, 486088, -78506, -602928, -617346, -635298, 991524, 865345, -768284, -552082, 550761, -971162, 702188, -733307, -186053, -918650, 940317, -999907, -466724, 951939, -873635, 851204, -838486, -104032, -647432, -265653, -964935, -515890, 95667, 622353, 640955, 687353, 637831, -497350, -344502, 81093, -485824, -345843, -105516, 703176, -654266, -837126, -47699, -45895, -702080, -140642, -387975, 667654, 876323, 817751, 73008, -276935, -666, -477056, 575329, -369678, -146063, 865410, 894815, 71308, -99154, 587410};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques637(){
        Integer[] array = {-50821, -385214, 190281, -42549, -181228, 544001, -799492, -60500, 765597, -616566, 531510, -730597, -828060, -436542, 432817, -216679, -601684, 711153, -618555, 58518, -911038, -357937, 378486, -383170, -768195, -92803, 682106, 538563, 470157, -735517, -994687, 607526, -803076, 698967, -393961, 471139, -993153, 866864, 281189, -915107, -484949, -900528, -616599, 586587, -45690, -476670, -513185, 454173, 221783, 508728, -383523, 726986, 565392, -776451, 883953, 384784, 429419, -801052, 52739, 52229, 915587, 719165, -585621, 360535, -940504, -505334, -577289, -513254, 320314, -945879, -912747, -990040, -147094, 696313, -919834, 64501, 673915, -960207, -555881, -438844, -568278, -89017, 912246, -454462, 776753, 627787, 26836, -699896, 450357, -655031, -80654, 656302, 663898, 579399, 754998, 880740, -545256, -377059, -707101, -915481};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques638(){
        Integer[] array = {-820099, -633305, 265076, -793161, -461212, 187235, -559228, -43391, -322561, 977505, 154527, 739938, 169198, 367303, 29095, 414836, 293830, 368502, -242287, 464455, 384317, -78161, -502487, -996700, -865356, 872081, -513897, -932867, -858376, 73061, 894216, 477331, -803571, 269381, -545060, 185392, 478263, 505676, 87911, -80937, -802353, -506033, 455218, 902749, 286718, 970237, -27975, 843988, 18436, -899986, 332794, -412003, 789476, 20856, 280548, 597053, 133169, -479344, 175373, -883971, 557842, 370847, 254015, -945419, -552532, -164259, -466087, 983192, 523525, 53012, -244641, 340519, 522310, -297762, 341878, 589292, 136408, 701330, 555890, 354345, -75302, 998188, -103099, 388369, -880534, 613785, 817273, 964550, -653028, -372380, 379695, 163186, 735064, 212832, -356228, 145871, -128977, -515533, 365491, 332079};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques639(){
        Integer[] array = {-274834, -963467, -571171, 514868, -692768, 730887, -523215, 789100, 435844, -880844, 188, 479452, 420228, -816327, -221763, 540176, -33759, -924779, 784062, -31115, -148355, 636519, 263756, 487049, 755669, 574048, 498586, -343921, -577254, 568914, 559244, -178804, 708679, 10919, 15847, -259078, 971198, 850357, 540778, -725855, -179833, 411209, -810881, -488346, -199146, 539985, 848446, -687970, -357437, -462037, -440640, -117452, 799904, 746498, -784897, 413672, -891268, -560964, -934313, -87812, -167258, -318974, 415061, 284508, -853056, 684897, 776756, 595843, 546358, 92802, 329088, 453673, 244292, -433237, 671929, -117243, -148864, -271081, -752067, 961899, -326528, 271816, 99064, 378430, 997425, -167796, 725302, -728382, 524543, -340862, 496984, -8640, -808213, -902814, -614142, 550684, 538473, -264990, 831643, -84163};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques640(){
        Integer[] array = {487471, 621321, 156779, -222300, -71050, 834788, 136942, 957081, 371916, -252162, -716381, -583819, -568391, 718134, -124402, 695314, -785732, -588295, 987842, -813212, -358796, 378623, 112076, -114393, 341715, 393568, 147923, 218483, -600515, -61496, -727108, -853526, -772962, 987990, -545110, 891926, -845557, -340368, -27257, -301530, 818769, 932667, -346224, 787357, 356109, 648517, 802286, -562118, -157732, 551033, 796999, 842482, -834356, 701715, 339696, -538578, 664969, 217743, 653393, -70075, 113998, -422291, 74947, -410330, -427422, 68341, 103186, -407641, -160886, 752951, -39785, 345814, 189640, -872633, -928589, 976797, 154143, -692877, 90768, 637361, 31495, 83598, 368339, -267048, 917476, -583406, -820083, -682419, -695754, 408612, 606207, -184426, 887873, -260802, 65932, 250163, -80184, 284226, -672544, 35662};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques641(){
        Integer[] array = {-211716, 687211, -880075, -903508, -452823, -683778, 25647, -439524, 244530, 592194, 335692, -458511, -199643, 53370, 292414, 153140, 99978, 105417, 823860, 970006, 172862, 465557, -441222, -275013, 316492, 862373, 758463, -101528, -10568, -105362, -190376, -498915, 483345, 158522, 68687, -290469, -915501, 807029, 542689, 694333, -702699, -781552, 27467, -523750, -884226, 582196, 784487, 33802, 156143, 981626, 288276, -52291, -937026, -713347, -682364, 145230, 239831, 221889, -984316, 646371, -813868, -535813, 412116, -541645, 602512, 226083, 284865, 940181, -34343, -994948, 603417, -18576, 233851, -207179, 310081, -161458, -605581, -396526, 395814, -648421, 93683, -767906, -224578, 518035, 852133, 323988, 466967, -789725, 969315, 96911, -238570, -580500, -104909, -377191, 514771, -101619, -768247, -95573, -613852, 894477};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques642(){
        Integer[] array = {-676461, -448327, 134785, -481913, 995774, 558749, -987891, -553570, -864354, -43736, 864507, 103051, -538930, 28858, -347848, -477397, -855, 952256, -713786, 130136, 912577, 76728, 394710, -531907, -903725, 191988, -281676, 625528, 939975, 658548, -979600, -502012, 508582, -990585, -753321, 377013, -799932, 135279, 148910, 845322, -974643, -409174, -595070, 604679, -577313, 315641, -432230, -296009, 31395, -286388, -849470, -524025, 541590, -307086, -869331, 185805, -640850, -43396, 106460, -80179, 494900, 905122, 859118, 851217, -280027, -470594, 704491, 378437, 177573, 281325, -13520, -493822, -56857, -606334, 2094, 802878, 765054, 189325, -751496, -959385, 325084, 492351, -534200, -237944, -450210, -121374, -79048, 429876, 565489, -184168, 12759, -224723, 849489, -912529, -40580, 895424, -595425, -228129, 490765, 500401};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques643(){
        Integer[] array = {539560, -670630, 320320, -93255, 669158, -949813, -697789, -339257, -519948, 978201, -489532, 185161, -590979, -266416, 405744, -253794, 958398, -883687, -707382, 619463, -896288, 305511, 216214, 673717, 566720, -37936, 371884, -313938, 519087, 363875, 654671, -348807, 837223, -322307, 848026, -821418, -867407, -280419, 498361, 130675, 445699, 165901, -870212, -911158, 752506, -177012, 989261, 807875, -277952, 355521, -591324, -286174, -937114, 820058, -424229, 467325, -109896, 983486, 746157, -122200, 326423, 445077, 923680, 513303, 172310, -221563, -968770, 282308, -350606, 493992, 131231, -63243, 78123, -13743, -320670, 153167, -542404, -461180, 691736, -999701, 916029, 26542, -314907, 937828, -390291, 492945, -595186, -438676, 402682, -609582, -130248, 818934, 910533, -353824, -958776, -794945, -899530, 516620, -357758, 110127};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques644(){
        Integer[] array = {177482, -748519, -9885, -505089, 377269, -122701, -682126, -427504, -105224, 935849, 892509, 172580, 130096, 180560, -10187, 713800, 859966, 920788, -705906, -169812, 807968, 739675, -708728, -908294, 583677, -377519, 93849, -881469, -242942, -577895, -65191, 494774, 102267, 640931, -994168, 541495, -472502, -271365, 742033, -97520, 643468, 434492, 557577, 596993, -87575, 217403, 267995, 76369, 256834, 996065, 702529, -734980, -698520, 409189, -346266, 776349, -363383, -182136, 736432, 143798, -601334, 177761, 709428, -248287, -15801, 153656, 40629, -324510, 597052, -541500, -154822, -928586, -46833, 959390, -556034, -460534, 678350, 210402, -9149, -573776, 434318, -1366, 558543, -447464, 740758, 302470, 455309, -529863, 322495, 111282, 990036, -40411, 763294, 347843, -951105, -582136, 151174, 959716, 756354, 520912};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques645(){
        Integer[] array = {983808, -732831, 790246, 174949, -574641, -22373, 361278, 669640, 569302, -893432, 884477, 875059, -945373, -499226, -283130, -237893, 460741, -139776, 66292, 234401, -465101, 272305, -942449, 934288, 363329, -489666, -665717, 371209, -936190, -948711, 57749, 288660, -235099, -455632, -813514, 609096, 667592, 773326, -131322, -813681, 722433, 554924, 527476, 405432, 511798, -584453, 103890, -406740, -294897, -939685, 388670, 146322, 218457, -931130, 817504, -147868, 357371, -263592, 284211, 254255, -691390, 430118, -778272, -184201, -723908, -929072, 651283, 950603, 636531, 722772, -48257, -186858, 623787, 287132, 806124, -355961, 114139, -403186, 10318, 822195, 361636, -392840, 695956, -978582, 34772, 488279, -259137, -164673, 831644, -355548, 932349, 245210, 695054, 443632, -432589, -565980, -427787, 282498, 456412, 240381};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques646(){
        Integer[] array = {-983026, 151026, 109297, 952111, -842886, 330308, 419277, -561552, -236376, -277926, -229211, -463023, 157325, -353592, -471224, 882842, 625111, -9708, 162315, -192251, -376649, -884944, -725030, -24405, 192932, -65852, 247585, 451808, -827415, -843657, -628804, -364525, -792398, 118199, 115533, -363741, 377446, -298026, -961944, -103283, -231850, 22485, 171621, -385710, 44195, 916207, -511153, 166531, -507024, -843976, -418828, -257788, -980952, -796847, -26856, 220702, 681566, 16897, -813900, -541338, 278777, 560724, 875222, -22216, 389152, 667058, 980598, 272078, -116035, -784961, 394712, 449323, -739507, 507819, -319538, -241267, 599121, 525494, -718522, -650617, -208016, 869400, 660765, 594914, 876389, -134007, -197160, 539497, 34992, 162379, -746931, 274505, 375268, -43343, -286990, 468389, -493704, 442340, 131013, -646747};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques647(){
        Integer[] array = {946936, -90525, -702378, 894665, -932844, 973165, -729841, -704470, 864680, 799064, -806079, -592308, 570196, 824291, -327788, -845119, 132792, 608069, 756359, -118705, 332596, 327085, -95897, -492764, 699205, -97804, 734992, -318387, 301594, -623015, 697997, 202704, 897093, -879450, 148718, 614039, -737032, -489975, -753552, 87640, -931514, -945042, -213850, 12167, 395920, 604982, 99709, -919011, 495183, 611881, -373194, 867599, 55116, 348166, 827140, -258088, 481809, 867177, 697081, -235987, 291842, 947993, 997351, -143866, 797347, 924028, 293492, -805817, -816187, 358334, 873915, 948896, -205485, -233167, 69509, -357961, -66455, 72880, 818103, 54460, -620415, 615758, -155205, 240219, -749663, 751477, -626683, 420375, -252828, 95046, 830626, -609779, -643875, 514958, 161897, 550002, 886878, -124000, 184923, -228692};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques648(){
        Integer[] array = {-226067, -483833, -80939, -907989, -183691, -724669, 525565, -564735, -142038, -552809, -794530, 572650, -3754, -720905, -532549, -966066, 67865, 939892, -192715, 486215, -606483, -417034, -994600, -192096, -712847, 723185, 971018, 851541, -402550, -190747, 821738, 816940, 423509, -331201, -754259, -716153, 393001, -356646, 799510, -905311, -406490, 802060, -530853, -725983, 843324, -462030, -785338, 759882, 735737, -235466, -971160, 995927, 917398, -847487, 923113, 817824, 108236, -540430, -172571, 444014, -275025, -123631, -534162, 935795, 957628, -170395, 137789, -49521, 399336, -233838, 944472, 302367, 730495, 980007, -803490, 975124, 380401, -31027, -831728, 111995, -13836, -592106, -86893, -912552, 436335, 780202, 534930, 248199, -988036, -321437, -17196, 424478, -285857, 512336, -264426, 35524, 247045, 496572, 253172, -597937};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques649(){
        Integer[] array = {79005, -563504, -421923, -395163, 27316, -994896, 680910, 665279, 545536, -223284, -117964, -323355, 635690, 14138, 506328, -163765, 329813, 336722, 834122, -207258, 487682, -41881, -642397, 465963, -712279, -685587, 200806, -404263, -876680, -978284, -678303, 213611, 46642, 966635, -708023, 923004, -250020, -101157, -792622, 857309, -274645, -691428, 759514, 993835, -967972, -969771, 985516, -899551, 153641, -851429, -769384, 830724, -865483, 542413, -426590, 478619, 486548, -157803, 844298, 539812, -151177, 528958, -467667, -371679, 952811, 251412, 677640, -838435, 193211, 301214, -882566, 757393, -297030, 69961, -351617, 21108, 147856, 530853, 997718, 268175, 891547, 737368, -924492, 693559, -555245, 356803, 13085, 522132, 418448, 115948, 793609, 47265, 974992, 742986, -285078, -867866, 849910, -937379, 244725, -973835};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
        }
    }

    @Test
    public void testSortingTechniques650(){
        Integer[] array = {723325, -681980, 255529, 699525, -590448, 109230, -124585, -789642, -810655, 575637, -463831, -650180, -546961, -310286, 626508, -682602, -566447, 683343, -551468, -862300, 936014, -991527, 659832, 377420, 684495, 596821, 965582, 700764, -754137, 795198, 251564, -106309, 221463, 706470, 789636, -387, -921939, 666141, 449059, 386291, 246282, -836002, -920940, -854688, 240765, 638978, 39635, -739257, 897564, 475327, 862439, 643983, 958668, -782881, 565372, -396065, 950162, -814796, 751633, -598349, -669023, 225203, 493266, 249541, -974789, 825901, 593870, -457115, 659393, 263029, 515392, -11533, 957610, -947816, 368378, -869527, -138070, 420855, 947080, -112055, 91819, 59739, -256681, -688367, 744237, 783303, -489316, 711669, -713995, -520482, -35830, -447278, -315188, -216643, -14294, 760019, 778772, -405751, 999066, -194277};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
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