# Inline Replication (IR)

The core concept behind Inlilne Replication (IR) is that a single aggregate measure (e.g., the average of a set of objects, p-value for a set of observations, or the best fit slope for a linear regression line to a set of data points) can be enriched by computing values of the measure across multiple folds of the underlying data.

For example, suppose you had a visualization showing the average age for a set of people.  The traditional approach would be to take all ages, compute the overall average, and plot that average in the visualization.

The IR approach is a bit different.  Instead, we first follow a 3 step process: partition, measure, aggregate.

First, we **partition** the data into a set of _k_ folds, where _k>=1_.  The partitioning process can be performed in various ways, including with replacement or without, randomized or by some specific property.  Regardless, the result of the partitioning step is a _k_  subsets.

Second, we **compute the measure** (e.g., average, p-value, regression) independently on each fold.  This gives us _k_ values for the measure of interest.

Third, we **aggregate the measures** to obtain an overall measure for the entire set of data.  For average, this could be an average of averages.  For p-values, it could be a "majority vote" for significance.  For linear regression, it could be a mean regression lone.  

Visualizations design with wortk with IR will typically display the aggregate value as the default when representing data.  In this way, it works like a normal visualiation design.  However, the individual fold values supply empirical values capturing the variance for the aggregate value across the folds.  IR Visualization should allow an aggregate result to be _unfolded_ to let users of the visualization see the underlying variance directly within the visualization.

## Data abstraction

This repository provides a simple abstraction over a single data point to support IR.  The code is provided as a Java class, but can be easily ported to other languages.
