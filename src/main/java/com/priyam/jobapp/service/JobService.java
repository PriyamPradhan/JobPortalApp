package com.priyam.jobapp.service;

import com.priyam.jobapp.model.JobPost;
import com.priyam.jobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.addJobPost(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobPosts();
    }
}
