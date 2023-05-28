import random

def export_random_integers_to_file(x, filename):
    random_integers = []
    for _ in range(x):
        random_integers.append(str(random.randint(-1000000, 1000000)))  # Generate a random integer and convert it to a string

    # Join the random integers with ", " separator
    random_integers_str = ", ".join(random_integers)

    # Write the random integers to the file
    with open(filename, 'w') as file:
        file.write(random_integers_str)

# Get input from the user
x = int(input("Enter the number of random integers to generate: "))
filename = input("Enter the filename to export the random integers: ")

# Call the function to export random integers to the file
export_random_integers_to_file(x, filename)
print(f"Random integers exported to {filename} successfully.")

