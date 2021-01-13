package iteratorVisitor;

import iteratorVisitor.visitor.Visitor;

public interface Transport {
    String accept(Visitor visitor);
}
