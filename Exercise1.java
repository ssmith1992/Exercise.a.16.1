package Chapter16.exercise1;
/*
Write a method called set that accepts an index and a value and sets the list’s element at that index to have the given
value. You may assume that the index is between 0 (inclusive) and the size of the list (exclusive).
 */
public class Exercise1 {
    private ListNode front;

    public void set(int index, int value)
    {
        if (index == 0)
            this.front.setData(value);
        else
        {
            ListNode current = this.front;

            for (int i = 0; i <index ; i++)
            {
                current = current.next;
            }
            current.setData(value);
        }
    }

    public Exercise1()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
