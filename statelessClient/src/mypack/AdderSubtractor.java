package mypack;

import javax.ejb.Remote;

@Remote
public interface AdderSubtractor {
public int add(int x,int y);
public int subtract(int x,int y);
}
