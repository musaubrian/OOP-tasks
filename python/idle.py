import tkinter as tk
from tkinter import ttk

win = tk.Tk()
win.title('python GUI')
win.resizable(5,5)

a_label = ttk.Label(win, text='Enter your name:')
a_label.grid(column=0, row=0)

# Set the textbox
name = tk.Entry()
name.grid(column=0, row=1)
name.focus()

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

# 3 buttons
ch_var_dis = tk.IntVar()

# disabled check button
check_1=tk.Checkbutton(win, text="Disabled", variable=ch_var_dis, state="disabled")
check_1.select()
check_1.grid(column=0, row=4, sticky=tk.W)

#Unchecked check button
ch_var_un = tk.IntVar()
check_2 = tk.Checkbutton(win, text="unChecked", variable=ch_var_un)
check_2.deselect()
check_2.grid(column=1, row=4, sticky=tk.W)

ch_var_en = tk.IntVar()
check_3 = tk.Checkbutton(win, text="Enabled", variable=ch_var_en)
check_3.select()
check_3.grid(column=2, row=4, sticky=tk.W)

win.mainloop()
