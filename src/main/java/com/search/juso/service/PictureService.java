package com.search.juso.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.search.juso.model.entity.Picture;

/**
 * 图片服务
 *
 * @author W.G.
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
