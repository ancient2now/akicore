package com.akikun.akicore.elif;

public class Ant
{
    private boolean onIf;

    /**
     * 指向Ant节点的最后一个节点
     */
    private Node p;

    private Node node;

    public Ant()
    {

    }

    public Ant(boolean onIf)
    {
        this.onIf = onIf;
    }

    public Ant(boolean ifState, Runnable r)
    {
        this.node = new Node(ifState, r);
        this.p = this.node;
    }

    public Ant IF(boolean onIf)
    {
        this.onIf = onIf;
        return this;
    }

    public Ant THEN(Runnable r)
    {
        if (onIf)
        {
            r.run();
        }
        return this;
    }

    public Ant ELSE(Runnable r)
    {
        if (!onIf)
        {
            r.run();
        }
        return this;
    }

    public Ant ifThen(boolean ifState, Runnable r)
    {
        p.next = new Node(ifState, r);
        p = p.next;
        return this;
    }

    public Ant elseThen(Runnable r)
    {
        p.next = new Node(!p.ifState, r);
        p = p.next;
        return this;
    }


    public void DO()
    {
        Node q = node;
        while (q != null)
        {
            if (q.ifState)
            {
                q.r.run();
            }
            q = q.next;
        }
    }

    private class Node
    {
        boolean ifState;

        Runnable r;

        Node next = null;

        public Node(boolean ifState, Runnable r)
        {
            this.ifState = ifState;
            this.r = r;
        }
    }
}

