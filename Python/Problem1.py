# this is just a rough outline for completing problem 1 from programming assignment 1
# you don't have to use this code if you don't want to, but at least read and understand it

#     here are suggested interfaces for the Stack and Queue classes
#
#     interface stack {
#         Boolean is_empty();           // returns True if empty, False if not
#         void push(Type X);            // pushes X onto the stack
#         Type pop() raises Underflow;  // pops top element of the stack,
#                                          raises Underflow if stack is empty
#     }
#
#     interface queue {
#         Boolean is_empty();               // returns True if empty, False if not
#         void enqueue(Type X);             // appends X to the queue
#         Type dequeue() raises Underflow;  // removes front element of the
#                                              queue, raises Underflow if queue is empty
#     };

import sys
# TODO: any other imports you might need (e.g., your linked list class)

class Node:
    def __init__(self, value):
        self.value = value  #int
        self.next = None   #Node

class LinkedList:
    def __init__(self):
        self.head = None  #Node
        self.tail = None  #Node
        self.length = 0   #int

    def addNode(self, node):
        if self.head == None:
            self.head = node
            self.length += 1

        elif self.tail == None:
            self.tail = node
            self.head.next = self.tail
            self.length += 1

        else:
            self.tail.next = node
            self.tail = self.tail.next
            self.length += 1

    def deleteNode(self):
        if self.length == 0:
            return None
        elif self.length == 1:
            self.length -= 1
            node = self.head
            self.head = None
            self.tail = None
            return node
        elif self.length > 1:
            self.tail = self.head
            for i in range(self.length-1-1):
                self.tail = self.tail.next
            self.length -= 1
            node = self.tail.next
            self.tail.next = None
            return node



# custom Underflow exception
class Underflow(Exception):
    pass  # make it fancier if you want :)


# TODO: implement the stack
class Stack:

    # class constructor
    def __init__(self):
        self.ll = LinkedList()


    # push method
    def push(self, x):
        self.ll.addNode(Node(x))


    # pop method
    def pop(self):
        if self.ll.length != 0:
            a = self.ll.deleteNode()
            #print(a)
            return a
        else:
            print("StackError")

    # is_empty methods
    def is_empty(self):
        return self.ll.length == 0

# TODO: impleme nt the print function
# args: s, Stack
def print_stack(s):
    if s.is_empty():
        print("Empty")
    else:
        save = []
        a = s.ll.head
        save.append(a.value)
        while (a.next != None):
            #print(a.next.value, end = " ")
            save.append(a.next.value)
            a = a.next
        for i in range(len(save[::-1])-1):
            print(save[::-1][i], end = " ")

        print(save[0])

    # only use s.push, s.pop, and s.is_empty

# this function runs the program according to the problem specification
def driver():
    s = Stack()
    with open(sys.argv[1]) as f:
        n = int(f.readline().strip())
        for _ in range(n):
            in_data = f.readline().strip().split()
            action, value_option = in_data[0], in_data[1:]
            if action == "push":
                value = int(value_option[0])
                # TODO: implement push action
                s.push(value) # change this!
            elif action == "pop":
                # TODO: implement pop action
                a = s.pop()
                if a != None:
                    print(a.value)  # change this!
            elif action == "print":
                # TODO: implement print action
                print_stack(s)  # change this!


# this starter code should work with either python or python3
if __name__ == "__main__":
    # ll = LinkedList()
    # ll.addNode(Node(1))
    # ll.addNode(Node(2))
    # ll.addNode(Node(3))
    # ll.addNode(Node(4))
    # ll.addNode(Node(5))
    #
    # print(ll.head.value)
    # print(ll.tail.value)
    # ll.deleteNode()
    # ll.deleteNode()
    # ll.deleteNode()
    # ll.deleteNode()
    # print(ll.tail.next)
    #print(ll.tail.value)

    driver()
    # s = Stack()
    # s.push(1)
    # s.push(2)
    # print_stack(s)
