package HelloWorld;
sub new
{
    my $class = shift;
    my $self = { };
    bless $self, $class;
    return $self;
}
sub print
{
    print "Hello World!\n";
}
1;