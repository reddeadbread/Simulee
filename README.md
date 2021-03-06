# **Runtime using Jython and multithreading on Intel core i7 4790k**:

| test method       | Simulee/ms | Simulee_Jython/ms                                      |
| ------------- | --------------------------- | ----------------------------------------------- |
| test_gunrock_join2 | 1728                           |2957.8        |
| test_gunrock_join      | 7029.6                           |13396|
| test_sum_reduced       | 918                           |2648.8    |
| test_sync_cudpp_sparseMatrixVectorSetFlags         | 892                           |1577.6   |
| test_sync_FindMaxCorr         | 24647.4                           |11029   |
| test_sync_cuda_cnn_g_getCost_3         | 18081.6                           |16135.2 |
| test_splice         | 7073.8                           |4773.2 |




# **Total Detected Real Bug with Positive Feedback**:
```
cudpp: 3 Bugs
CudaSift: 4 Bugs
gunrock: 2 Bugs
kaldi: 1 Bugs
Total： 10 Bugs
```

| Project       | Bugs with Positive Feedback | reference                                       |
| ------------- | --------------------------- | ----------------------------------------------- |
| cudpp         | 3                           |https://github.com/cudpp/cudpp/issues/180        |
| CudaSift      | 4                           |https://github.com/Celebrandil/CudaSift/issues/38|
| gunrock       | 2                           |https://github.com/gunrock/gunrock/issues/452    |
| kaldi         | 1                           |https://github.com/kaldi-asr/kaldi/issues/3036   |

# Introduction
In EvolutionaryDetect.py, all functions start with "test_" are detecting synchronization bugs.

# Performance in different setting
Please see "performance.log" file.

kaldi:
```
test_sum_reduced()
test_copy_low_upp()
test_copy_upp_low()
test_add_diag_vec_mat()
test_copy_from_tp()
test_copy_from_mat()
test_slice()
```

thundersvm:
```
test_thundersvm_c_smo_solve_kernel()
```

gunrock:
```
test_gunrock_join()
```

CUDA-CNN
```
test_sync_cuda_cnn_g_getCost_3()
```

CudaSift:
```
test_sync_FindMaxCorr()
# same situation for FindMaxCorr1, FindMaxCorr2, FindMaxCorr3
```

cudpp
```
test_sync_cudpp_sparseMatrixVectorSetFlags()
# same situation for yGather, sparseMatrixVectorFetchAndMultiply.
```


Positive feedback from authors:
```
https://github.com/cudpp/cudpp/issues/180
https://github.com/Celebrandil/CudaSift/issues/38
https://github.com/gunrock/gunrock/issues/452
https://github.com/gunrock/gunrock/issues/452
```

Raw bug log located in
```
./raw_data_report_script
```


