package com.algorithms;

public class LRUCache3Elements {
	
	public static void main(String args[]) {
		
		int cache[] = {0,0,0};
		
		int lru =0, mru = 0, mid = 0;
		
		
		for(int n=1;n<10;n++) {
		
		System.out.println("Please enter Value:"+n);
			
		if(mru==0) {
			mru = n;
		}
		else if(lru==0 && mru>0) {
			if(mid==0 && lru ==0) {
				mid = mru;
				mru = n;
			}else {
				lru = mid;
				mid = mru;
				mru = n;
			}
		}else {
			lru = mid;
			mid = mru;
			mru = n;
		}
		
		cache[0] = mru;
		cache[1] = mid;
		cache[2] = lru;
		
		for(int i=0;i<cache.length;i++) {
			System.out.println(cache[i]);
		}
		
		}
		
	}

}
