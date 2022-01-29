#!usr/bin/perl
sub sum{
	@ls = @_;
	foreach $item(@ls){
		printf $item;
	}
}
sum(1,1)
