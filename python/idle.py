import tkinter as tk
from tkinter import ttk

win = tk.Tk()
win.title('python GUI')
win.resizable(0,0)

a_label = ttk.Label(win, text='Enter your name:')
a_label.grid(column=0, row=0)
# Set the textbox
name = tk.Entry()
name.grid(column=0, row=1)

#Set the drobdown menu
ttk.Label(win, text="Choose a number: ").grid(column=1, row=0)
number = tk.StringVar()
number_chosen = ttk.Combobox(win, width=10, textvariable=number)
number_chosen['values'] = (1,2,3,4,42,100)
number_chosen.grid(column=1, row=1)
number_chosen.current(0)

def click_me():
    if len(name.get()) < 1:
        a_label.configure(foreground="red")
    else:
        action.configure(text="hello " + name.get())
        a_label.configure(foreground="green")
    

action = ttk.Button(win, text="Click me", command=click_me)
action.grid(column=2, row=1)
win.mainloop()
