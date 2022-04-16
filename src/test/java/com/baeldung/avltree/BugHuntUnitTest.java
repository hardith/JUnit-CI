package com.baeldung.avltree;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.fail;

public class BugHuntUnitTest {

    @Test
    public void rightNodeNullCheck() {
        AVLTree tree = new AVLTree();
        tree.insert(100);
        tree.insert(0);
        tree.delete( 100);
        Assert.assertEquals(0, tree.height());
    }
}
