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
        self.head = None
        self.tail = None
        self.length = 0
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
            self.head = None
            self.tail = None
            return None
        elif self.length == 1:
            self.length -= 1
            node = self.head
            self.head = None
            self.tail = None
            return node
        elif self.length > 1:
            node = self.head
            self.head = self.head.next
            self.length -= 1
            return node



# custom Underflow exception
class Underflow(Exception):
    pass  # make it fancier if you want :)


# TODO: implement the stack
class Queue:

    # class constructor
    def __init__(self):
        self.ll = LinkedList()

    # enqueue method
    def enqueue(self, x):
        self.ll.addNode(Node(x))

    # dequeue method
    def dequeue(self):
        if self.ll.length != 0:
            a = self.ll.deleteNode()
            #print(a)
            return a
        else:
            print("QueueError")

    # is_empty method
    def is_empty(self):
        return self.ll.length == 0


# TODO: implement the print function
# args: q, Queue
def print_queue(q):
    if q.is_empty():
        print("Empty")
    else:
        save = []
        a = q.ll.head
        save.append(a.value)
        while (a.next != None):
            #print(a.next.value, end = " ")
            save.append(a.next.value)
            a = a.next
        for i in range(len(save)-1):
            print(save[i], end = " ")

        print(save[-1])



# this function runs the program according to the problem specification
def driver():
    q = Queue()
    with open(sys.argv[1]) as f:
        n = int(f.readline().strip())
        for _ in range(n):
            in_data = f.readline().strip().split()
            action, value_option = in_data[0], in_data[1:]
            if action == "enqueue":
                value = int(value_option[0])
                # TODO: implement enqueue action
                q.enqueue(value)  # change this!
            elif action == "dequeue":
                # TODO: implement dequeue action
                a = q.dequeue()
                if a!= None:
                    print(a.value)  # change this!
            elif action == "print":
                # TODO: implement print action
                print_queue(q)  # change this!


# this starter code should work with either python or python3
if __name__ == "__main__":
    driver()
