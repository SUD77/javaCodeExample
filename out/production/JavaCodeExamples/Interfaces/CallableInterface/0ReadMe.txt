- This is the example to show use of Callable interface. Also, shows the difference between sequential Programming and Callable
interface (or using threads).

-    Problem is like, suppose we have to get data from 3 different sources, which start to generate data after their start time.
So, in case of sequential, we will start reading data from them after their start time but we should have finished getting data
from 1st source first. We have to go into sequence. This takes too much time.

But in Callable example, (or threads example), we assign one thread to data source, once its starts generating data.
So, in overall, this process takes very less time.