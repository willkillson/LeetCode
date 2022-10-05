

from turtle import clear


def move (y, x):
    print("\033[%d;%dH" % (y, x))

def clear_screen():
    move(0,0)
    display_size = (80,40)
    blank = ''
    for i in range(display_size[1]):
        blank += ' '

    for i in range(display_size[0]):
        print(blank)

clear_screen()

move(0,0)
print("Hey1")

move(10,5)
print("Hey2")