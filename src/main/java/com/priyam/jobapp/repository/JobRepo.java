package com.priyam.jobapp.repository;

import com.priyam.jobapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobOpening = new ArrayList<>();

    public List<JobPost> getAllJobPosts() {
        return jobOpening;
    }

    public void addJobPost(JobPost jobPost) {
        jobOpening.add(jobPost);
        System.out.println(jobOpening);
    }
}
