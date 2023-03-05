import tkinter as tk
from tkinter import ttk
from tkinter import scrolledtext

win = tk.Tk()
win.title("python GUI")
win.resizable(5, 5)

a_label = ttk.Label(win, text="Enter your name:")
a_label.grid(column=0, row=0)

# Set the textbox
name = tk.Entry()
name.grid(column=0, row=1)
name.focus()

# Set the drobdown menu
ttk.Label(win, text="Choose a number: ").grid(column=1, row=0)
number = tk.StringVar()
number_chosen = ttk.Combobox(win, width=10, textvariable=number)
number_chosen["values"] = (1, 2, 3, 4, 42, 100)
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
check_1 = tk.Checkbutton(win, text="Disabled", variable=ch_var_dis, state="disabled")
check_1.select()
check_1.grid(column=0, row=4, sticky=tk.W)

# Unchecked check button
ch_var_un = tk.IntVar()
check_2 = tk.Checkbutton(win, text="unChecked", variable=ch_var_un)
check_2.deselect()
check_2.grid(column=1, row=4, sticky=tk.W)

ch_var_en = tk.IntVar()
check_3 = tk.Checkbutton(win, text="Enabled", variable=ch_var_en)
check_3.select()
check_3.grid(column=2, row=4, sticky=tk.W)

# radio buttons
COLOR_1 = "Blue"
COLOR_2 = "Gold"
COLOR_3 = "Red"


def radio_btn_call():
    radio_selected = rad_var.get()
    if radio_selected == 1:
        win.configure(background=COLOR_1)
    elif radio_selected == 2:
        win.configure(background=COLOR_2)
    elif radio_selected == 3:
        win.configure(background=COLOR_3)


rad_var = tk.IntVar()
radio_1 = tk.Radiobutton(
    win, text=COLOR_1, variable=rad_var, value=1, command=radio_btn_call
)
radio_1.grid(column=0, row=5, sticky=tk.W)

radio_2 = tk.Radiobutton(
    win, text=COLOR_2, variable=rad_var, value=2, command=radio_btn_call
)
radio_2.grid(column=1, row=5, sticky=tk.W)
radio_3 = tk.Radiobutton(
    win, text=COLOR_3, variable=rad_var, value=3, command=radio_btn_call
)
radio_3.grid(column=2, row=5, sticky=tk.W)

# Using scrolled text
scrollW = 30
scrollH = 3
scr = scrolledtext.ScrolledText(win, width=scrollW, height=scrollH, wrap=tk.WORD)
scr.grid(column=0, columnspan=3)

# labels in a frame
labels_frame = ttk.LabelFrame(win, text="Labels in a frame")
labels_frame.grid(column=0, row=7, padx=20, pady=40)

ttk.Label(labels_frame, text="label one").grid(column=0, row=0)
ttk.Label(labels_frame, text="label 2").grid(column=0, row=1)
ttk.Label(labels_frame, text="label 3").grid(column=0, row=2)

win.mainloop()
