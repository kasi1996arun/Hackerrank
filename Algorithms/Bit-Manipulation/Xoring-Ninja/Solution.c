//https://www.hackerrank.com/challenges/xoring-ninja

#include<stdio.h>
#define LL long long int
#define MOD 1000000007

LL power(LL a, LL b)
{
	if (b == 0)
		return 1;
	else
	{
		LL temp=(power(a,b/2))%MOD;
		if(b%2==0)   
			return (temp*temp)%MOD;
		else
			return (((temp*a)%MOD)*temp)%MOD;
	}
}

int main(){
	int t;
	scanf("%d",&t);
	while(t--){
		int n;
		scanf("%d",&n);
		int x=0;
		int i,a;
		for(i=0;i<n;i++)
		{
			scanf("%d",&a);
			x|=a;
		}
		LL ans=power(2,n-1);
		ans=(ans*x)%MOD;
		printf("%lld\n",ans);
	}
	return 0;
}
