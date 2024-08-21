public class a3_doubly_linked_list_class {
    class Node {
        int data;
        Node next;
        Node prev; // New pointer to the previous node
    }

    private Node head;
    private Node tail;
    private int size;

    // O(1)
    public void AddFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head.prev = nn; // Update the previous pointer of the old head
            head = nn;
        }
        size++;
    }

    // O(1)
    public void AddLast(int item) {
        if (size == 0) {
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            nn.prev = tail; // Update the previous pointer of the new node
            tail = nn;
            size++;
        }
    }

    // O(N)
    public void AddatIndex(int item, int k) throws Exception {
        if (k < 0 || k > size) {
            throw new Exception("Invalid index");
        }

        if (k == 0) {
            AddFirst(item);
        } else if (k == size) {
            AddLast(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            Node k_1th = GetNode(k - 1);
            nn.next = k_1th.next;
            nn.prev = k_1th;
            k_1th.next.prev = nn; // Update the previous pointer of the next node
            k_1th.next = nn;
            size++;
        }
    }

    // O(1)
    public int getfirst() {
        return head.data;
    }

    // O(1)
    public int getlast() {
        return tail.data;
    }

    // O(n)
    public int getindex(int k) throws Exception {
        return GetNode(k).data;
    }

    // O(1)
    public int removefirst() {
        int rv = head.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null; // Update the previous pointer of the new head
        }
        size--;
        return rv;
    }

    // O(N)
    public int removelast() throws Exception {
        if (size == 1) {
            return removefirst();
        } else {
            int rv = tail.data;
            tail = tail.prev;
            tail.next = null; // Update the next pointer of the new tail
            size--;
            return rv;
        }
    }

    // O(N)
    public int removeatindex(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Invalid index");
        }

        if (k == 0) {
            return removefirst();
        } else if (k == size - 1) {
            return removelast();
        } else {
            Node k_1th = GetNode(k - 1);
            Node kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next.prev = k_1th; // Update the previous pointer of the next node
            kth.next = null;
            kth.prev = null;
            size--;
            return kth.data;
        }
    }

    // O(N)
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Invalid index");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int size() {
        return size;
    }
}
