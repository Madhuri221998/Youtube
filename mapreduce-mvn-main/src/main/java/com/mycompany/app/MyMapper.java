package com.mycompany.app;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 *
 * @author Sreyas Reddy Mallypally
 * s546761
 * 
 */

public class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
    
    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException{
        String[] row = value.toString().split("\t");

         
        //1. Number of videos in each channel. Displaying channels and its videos count.
        context.write(new Text(row[3]), new IntWritable(1));

        //2. Showing videos along with comments disabled status. Comments disabled- TRUE OR FALSE
        //context.write(new Text(row[2]+" "+row[12]), new IntWritable(1));


       
        //3. Count of different catagories.
        //context.write(new Text(row[4]), new IntWritable(1));

        //4. Number of videos with respect to trending dates.Number of videos published on eacg trending date.
        //context.write(new Text(row[1]), new IntWritable(1));

        //5. likes and dislikes for a video(title).
        //context.write(new Text(row[2]+" "+row[8]+" "+row[9]), new IntWritable(1));

        //6. Videos with its thumbnails
        //context.write(new Text(row[2]+" "+row[11]), new IntWritable(1));

        //7. video titles and their respective channels with videos removed or not
        //context.write(new Text(row[2]+" "+row[3]+" "+row[14]), new IntWritable());
        
        //8. video catagories along with their comment count
        //context.write(new Text(row[4]+" "+row[10]), new IntWritable());
        


     }    
 }






        