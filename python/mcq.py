#!/usr/bin/env python3
"""Module creates a GUI for multiple choice question type of test"""

import tkinter as tk

# create the main window
root = tk.Tk()
root.title("Quiz App")

# create a list of questions with their answer choices and correct answers
questions = [
    {
        "question": "What is the capital of France?",
        "choices": ["London", "Paris", "Berlin", "Rome"],
        "answer": "Paris",
        "mark": 1,
    },
    {
        "question": "What is the highest mountain in the world?",
        "choices": ["Everest", "K2", "Kilimanjaro", "Denali"],
        "answer": "Everest",
        "mark": 1,
    },
    {
        "question": "What is the largest country in the world?",
        "choices": ["Russia", "Canada", "China", "USA"],
        "answer": "Russia",
        "mark": 1,
    },
    {
        "question": "What is the smallest continent in the world?",
        "choices": ["Africa", "Australia", "South America", "Europe"],
        "answer": "Australia",
        "mark": 1,
    },
    {
        "question": "What is the currency of Japan?",
        "choices": ["Yen", "Dollar", "Euro", "Pound"],
        "answer": "Yen",
        "mark": 1,
    },
    {
        "question": "What is the largest ocean in the world?",
        "choices": ["Atlantic", "Indian", "Arctic", "Pacific"],
        "answer": "Pacific",
        "mark": 1,
    },
    {
        "question": "What is the national language of Brazil?",
        "choices": ["Spanish", "Portuguese", "Italian", "French"],
        "answer": "Portuguese",
        "mark": 1,
    },
    {
        "question": "What is the highest waterfall in the world?",
        "choices": ["Victoria Falls", "Niagara Falls", "Angel Falls"],
        "answer": "Angel Falls",
        "mark": 1,
    },
    {
        "question": "What is the capital of South Africa?",
        "choices": ["Johannesburg", "Cape Town", "Pretoria", "Durban"],
        "answer": "Pretoria",
        "mark": 1,
    },
    {
        "question": "What is the largest desert in the world?",
        "choices": ["Gobi", "Sahara", "Kalahari", "Mojave"],
        "answer": "Sahara",
        "mark": 1,
    },
]
# create variables to keep track of the user's answers and score
current_question = 0
answers = []
score = 0
quiz_frame = tk.Frame(root)
quiz_frame.pack()


# create a function to check the user's answers
def check_answers():
    global score
    # iterate over each question
    for i, q in enumerate(questions):
        # get the user's answer
        user_answer = answers[i].get()
        # check if the user's answer is correct
        if user_answer == q["answer"]:
            # if it is, add the mark to the score
            score += q["mark"]
    # clear the quiz frame
    for widget in quiz_frame.winfo_children():
        widget.destroy()
    # display the final score
    score_label = tk.Label(quiz_frame, text=f"Final Score: {score}/{len(questions)}")
    score_label.pack(pady=10, padx=6)


# create a function to display the quiz questions
def display_question():
    global current_question
    # clear the quiz frame
    for widget in quiz_frame.winfo_children():
        widget.destroy()

    # get the current question
    q = questions[current_question]

    # create a label for the question
    question_label = tk.Label(
        quiz_frame, text=f"{current_question + 1} {q['question']}"
    )
    question_label.pack(pady=10)

    # create a group of radio buttons for the answer choices
    answer_group = tk.StringVar()
    for j, choice in enumerate(q["choices"]):
        choice_radio = tk.Radiobutton(
            quiz_frame, text=choice, variable=answer_group, value=choice
        )
        choice_radio.pack()
    # add the answer group to the answers list
    answers.append(answer_group)

    # create a button to go to the next question or check the user's answers
    if current_question == len(questions) - 1:
        next_button = tk.Button(quiz_frame, text="Check Answers", command=check_answers)
    else:
        next_button = tk.Button(quiz_frame, text="Next Question", command=next_question)
    next_button.pack(pady=10)


# create a function to go to the next question
def next_question():
    global current_question
    current_question += 1
    display_question()


# display the first question
display_question()
root.mainloop()
