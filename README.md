# 📝 Quiz Application

A simple **Java console-based Quiz Application** that presents multiple-choice questions to the user, checks their answers, keeps track of the score, and displays the final result.

## ✨ Features

* 📚 Multiple-choice quiz questions
* 🔢 Four options for each question
* ✅ Automatic answer checking
* 📊 Score tracking
* 🏆 Final score displayed at the end
* 🖥️ Simple command-line interface

## 🛠️ Technologies Used

* **Java**
* **Arrays**
* **Classes and Objects**
* **Loops**
* **Scanner**
* **Object-Oriented Programming (OOP)**

## 📁 Project Structure

```text
Quiz-Application/
│
├── Main.java
├── Question.java
├── README.md
└── .gitignore
```

### `Question.java`

Contains the `Question` class, which represents a quiz question and stores:

* Question text
* Available options
* Index of the correct answer

### `Main.java`

Contains the main quiz logic, including:

* Creating the questions
* Storing questions in an array
* Displaying questions and options
* Reading the user's answers
* Checking answers
* Calculating the score
* Displaying the final result

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Open the project

Open the project folder in your preferred Java IDE, such as:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### 3. Compile the program

Open a terminal inside the project folder and run:

```bash
javac Main.java Question.java
```

### 4. Run the program

```bash
java Main
```

## 🎮 How to Use

When the program starts, a question with multiple options will be displayed.

Example:

```text
Question 1:
What is the capital of India?

1. Mumbai
2. New Delhi
3. Kolkata
4. Chennai

Enter your answer:
```

Enter the number corresponding to your chosen option.

The program will indicate whether the answer is correct and then move to the next question.

After all questions have been answered, the final score will be displayed.

Example:

```text
Quiz Completed!

Your final score is: 4/5
```

## 🧠 How It Works

Each question contains:

```text
Question
Options
Correct Answer Index
```

All questions are stored in an array. The program loops through the array, displays each question and its options, accepts the user's choice, and compares it with the correct answer index.

The score is increased whenever the user selects the correct answer.

## 📌 Future Improvements

Some features that could be added in the future:

* Add more questions
* Randomize the order of questions
* Randomize answer options
* Add difficulty levels
* Add a timer
* Validate invalid user input
* Display the correct answer when the user gets a question wrong
* Store quiz results

## 👨‍💻 Author

**Shagun Vashishtha**

This project was created as a Java practice project to learn **classes, objects, arrays, loops, user input, and basic OOP concepts**.
