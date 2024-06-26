import pickle

# Example class to serialize and deserialize
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"Person(name={self.name}, age={self.age})"

# Serialization function
def serialize(obj, filename):
    with open(filename, 'wb') as f:
        pickle.dump(obj, f)

# Deserialization function
def deserialize(filename):
    with open(filename, 'rb') as f:
        obj = pickle.load(f)
    return obj

# Example usage
if __name__ == "__main__":
    # Create an instance of the Person class
    person = Person("John", 30)

    # Serialize the instance
    serialize(person, "person_data.pkl")

    # Deserialize the data
    deserialized_person = deserialize("person_data.pkl")

    # Print the deserialized object
    print("Deserialized Person:", deserialized_person)
