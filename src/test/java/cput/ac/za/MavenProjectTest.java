package cput.ac.za;

import org.junit.Assert;
import org.junit.Test;


public class MavenProjectTest
{
    @Test

    public void Shop()
    {
        MavenProject mav = new MavenProject();


        Assert.assertEquals(mav.shopName("Salisbury"),mav.shopOwnerName("Salisbury"));
    }
}
