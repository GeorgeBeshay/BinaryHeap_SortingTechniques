import random
# Online Python - IDE, Editor, Compiler, Interpreter

def generate_array_of_random_integers(size = 100, min_val = -1000000, max_val = 1000000):
    return [random.randint(min_val, max_val) for _ in range(size)]

def generate_testcase(testNumber):
    array = generate_array_of_random_integers();
    return """
    @Test
    public void testSortingTechniques""" + f'{testNumber}' + """(){
        ArrayList<Integer> list = generateRandomList(1000);
        ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
        ArrayList<Integer> output2 = getLastList(simpleSF.getSortingAlgorithm("Bubble Sort").apply(list, false));
        ArrayList<Integer> output3 = getLastList(simpleSF.getSortingAlgorithm("Selection Sort").apply(list, false));
        ArrayList<Integer> output4 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
        ArrayList<Integer> output5 = getLastList(efficientSF.getSortingAlgorithm("Quick Sort").apply(list, false));
        ArrayList<Integer> output6 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
        ArrayList<Integer> output7 = getLastList(nonComparisonSF.getSortingAlgorithm("Radix Sort").apply(list, false));
        ArrayList<Integer> output8 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            assertEquals(list.get(i), output1.get(i));
            assertEquals(list.get(i), output2.get(i));
            assertEquals(list.get(i), output3.get(i));
            assertEquals(list.get(i), output4.get(i));
            assertEquals(list.get(i), output5.get(i));
            assertEquals(list.get(i), output6.get(i));
            assertEquals(list.get(i), output7.get(i));
            assertEquals(list.get(i), output8.get(i));
        }
    }
    """
    # string_literal = "{" + ", ".join(str(num) for num in array) + "}"
    # testcase = f"""
    # @Test
    # public void testSortingTechniques{testNumber}()"""
    # testcase += """{
    #     Integer[] array = """ + f"""{string_literal};""" + """
    #     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
    #     ArrayList<Integer> output1 = getLastList(simpleSF.getSortingAlgorithm("Insertion Sort").apply(list, false));
    #     ArrayList<Integer> output2 = getLastList(efficientSF.getSortingAlgorithm("Merge Sort").apply(list, false));
    #     ArrayList<Integer> output3 = getLastList(nonComparisonSF.getSortingAlgorithm("Counting Sort").apply(list, false));
    #     ArrayList<Integer> output4 = getLastList(heapSF.getSortingAlgorithm("Heap Sort").apply(list, false));
    #     Collections.sort(list);
    #     for(int i = 0 ; i < list.size() ; i++){
    #         assertEquals(list.get(i), output1.get(i));
    #         assertEquals(list.get(i), output2.get(i));
    #         assertEquals(list.get(i), output3.get(i));
    #         assertEquals(list.get(i), output4.get(i));
    #     }
    # }\n"""
    # testcase += f"""ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));"""
    # return testcase

text = ""
for x in range(0, 1000):
	text += generate_testcase(x)

# Write the random integers to the file
with open('testcases_generated', 'w') as file:
	file.write(text)
