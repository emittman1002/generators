README for generators project
-----------------------------

These are batch and interactive applications for generating test data.  The
problem domain is as follows:
	There are one or more members
	Each member can have zero or more accounts
	Each account can have zero or more deposits
	Each account can have zero or more claims
	The balance of an acccount is the sum of the deposits less the sum of the claims

The following generators will be available:
member generator
  Generates a specified number of members from a specified dataset

account generator
  Generates accounts for members in a specified dataset.
