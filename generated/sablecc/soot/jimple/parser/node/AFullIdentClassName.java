/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AFullIdentClassName extends PClassName
{
    private TFullIdentifier _fullIdentifier_;

    public AFullIdentClassName()
    {
        // Constructor
    }

    public AFullIdentClassName(
        @SuppressWarnings("hiding") TFullIdentifier _fullIdentifier_)
    {
        // Constructor
        setFullIdentifier(_fullIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new AFullIdentClassName(
            cloneNode(this._fullIdentifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFullIdentClassName(this);
    }

    public TFullIdentifier getFullIdentifier()
    {
        return this._fullIdentifier_;
    }

    public void setFullIdentifier(TFullIdentifier node)
    {
        if(this._fullIdentifier_ != null)
        {
            this._fullIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fullIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fullIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fullIdentifier_ == child)
        {
            this._fullIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fullIdentifier_ == oldChild)
        {
            setFullIdentifier((TFullIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
